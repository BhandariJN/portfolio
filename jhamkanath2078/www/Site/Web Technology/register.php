<?php
$full_name=$_POST['name'];
$Password=$_POST['password'];
$Cpassword=$_POST['confirmpassword'];
$Email=$_POST['email'];
$Pnumber=$_POST['mobile'];

if($Password !=$Cpassword){
    echo "Password and conform Password Not Matched";
} else{
    echo $full_name."<br>".$Email."<br>".$Pnumber;
    require('dbconnect.php');
    $sql="INSERT INTO `bca2078`
    (`ID`, `username`, `password`, `mobile`, `email`, `userlevel`)
    VALUES
    ('0', '$full_name', '$Password', '$Pnumber', '$Email', 'Admin')";

    //echo $sql;
    $conn->query($sql);
}
?>