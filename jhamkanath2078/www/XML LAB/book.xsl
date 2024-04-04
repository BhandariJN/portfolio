<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
<body>
  <h2>Book Collection </h2>
  <table border="1" bgcolor ="#2635d5">
    <tr bgcolor="#9acd32">
      <th style="text-align:left">Bookname</th>
      <th style="text-align:left">Author</th>
      <th style="text-align:left">Price</th>
      <th style="text-align:left">Publication Date</th>
      
    </tr>
    <xsl:for-each select="books/book">
    <tr>
      <td><xsl:value-of select="bookname"/></td>
      <td><xsl:value-of select="author"/></td>
      <td><xsl:value-of select="price"/></td>
      <td><xsl:value-of select="pubdate"/></td>
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
