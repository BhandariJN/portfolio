<?php
$username = $_POST['name'];
$pass = $_POST['password'];
$repass = $_POST['confirmpassword'];
$email = $_POST['email'];
$mobile = $_POST['mobile'];

if ($pass != $repass) {
    echo "Password and confirm password don't match.";
} else {
    // Hash the password for security
    $hashedPass = password_hash($pass, PASSWORD_DEFAULT);

    // Include the database connection
    $servername = "localhost";
    $serverusername = "bca";
    $serverpassword = "Bca@10)#";
    $dbname = "bca";

    // Create a new mysqli connection
    $conn = new mysqli($servername, $serverusername, $serverpassword, $dbname);

    // Check the connection
    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    // Set character set to utf8
    $sql = "set names utf8";
    $conn->query($sql);

    // Use prepared statements to prevent SQL injection
    $stmt = $conn->prepare("INSERT INTO `bca2078` (`ID`, `username`, `password`, `mobile`, `email`, `userlevel`)
                            VALUES (NULL, $username, ?, ?, ?, 'Admin')");

    // Bind parameters and execute the statement
    $stmt->bind_param("ssss", $username, $hashedPass, $mobile, $email);

    if ($stmt->execute()) {
        echo "Data inserted successfully.";
    } else {
        echo "Error inserting data: " . $stmt->error;
    }

    // Close the statement and connection
    $stmt->close();
    $conn->close();
}
?>
