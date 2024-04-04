<?php
$date=$_GET['date'];
$title=$_GET['title'];
$note=$_GET['note'];
$user=$_GET['username'];
(require 'dbconnect.php');
   
    $sql = "
            INSERT INTO note (ID, date, title, notebody, user)
            VALUES ('0', '$date', '$title', '$note', '$user'); 
            ";
            $conn->query($sql);
            echo "Note saved successfully";
?>

