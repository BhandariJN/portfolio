<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
<body>
  <h2>Book Collection </h2>
  <p> The book name is <xls:value-of select ="bookname"/> and author of book is <xls:value-of select ="author"/> which price is <xls:value-of select ="price"/> and published on <xls:value-of select ="pubdate"/>
</p>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
