<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:template match="/">
		<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
			<fo:layout-master-set>
				<fo:simple-page-master master-name="simple" page-height="29.7cm" page-width="21cm" margin-top="1cm" margin-bottom="2cm" margin-left="2.5cm" margin-right="2.5cm">
					<fo:region-body margin-top="3cm" column-count="3"/>
					<fo:region-before extent="3cm"/>
					<fo:region-after extent="1.5cm"/>
				</fo:simple-page-master>
			</fo:layout-master-set>
			<fo:page-sequence master-reference="simple">
				<fo:flow flow-name="xsl-region-body">
					<xsl:apply-templates select="result"/>
				</fo:flow>
			</fo:page-sequence>
		</fo:root>
	</xsl:template>
	<xsl:template match="result">
		<xsl:for-each select="./Reparacion">
			<fo:block>
				<xsl:value-of select="VehiculoIdReparacionParsed"/>
			</fo:block>
			<fo:block>
				<xsl:value-of select="FechaEntradaReparacionParsed"/>
			</fo:block>
			<fo:block>
				<xsl:value-of select="FechaSalidaReparacionParsed"/>
			</fo:block>
			<fo:block>
				<xsl:value-of select="EstadoReparacionParsed"/>
			</fo:block>	
			<fo:block>
				<xsl:value-of select="KmReparacionParsed"/>
			</fo:block>
			<fo:block>
				<xsl:value-of select="ImporteReparacionParsed"/>
			</fo:block>
			<fo:block>
				<xsl:value-of select="ObsReparacionParsed"/>
			</fo:block>																							
		</xsl:for-each>	
	</xsl:template>
</xsl:stylesheet>
