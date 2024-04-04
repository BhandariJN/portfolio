<?php
$servername = "localhost";
$username = "bca";
$password = "Bca@10)#";
$dbname = "bca";

$conn = new mysqli($servername, $username, $password, $dbname);
$sql = "set names utf8";
$conn->query($sql);
?>
