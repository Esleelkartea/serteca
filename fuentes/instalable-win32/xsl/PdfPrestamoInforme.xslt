<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:include href="main.xslt"/>
	<xsl:template match="result">
		<xsl:for-each select="./Prestamo">
			<fo:table table-layout="fixed" border-style="solid" border-width="0.1mm">
				<fo:table-column column-width="16cm"/>			
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="center" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed" background-color="#F0F0F0">
							<fo:block>
								VEHÍCULO DE SUSTITUCIÓN
							</fo:block>
						</fo:table-cell>						
					</fo:table-row>
				</fo:table-body>
			</fo:table>		
			<fo:table table-layout="fixed" border-style="solid" border-width="0.1mm">
				<fo:table-column column-width="8cm"/>
				<fo:table-column column-width="8cm"/>			
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								Matrícula : <xsl:value-of select="VehiculoCortesiaMatriculaPrestamo"/>
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								Orden de Reparación: <xsl:value-of select="ReparacionIdPrestamo"/>
							</fo:block>
						</fo:table-cell>						
					</fo:table-row>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								Modelo : <xsl:value-of select="VehiculoCortesiaModeloPrestamo"/>
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								Cia Seguro: 
							</fo:block>
						</fo:table-cell>						
					</fo:table-row>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								Nº Bastidor : <xsl:value-of select="VehiculoCortesiaChasisPrestamo"/>
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								Nº Póliza: 
							</fo:block>
						</fo:table-cell>						
					</fo:table-row>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								Fecha Salida : <xsl:value-of select="FechaIniPrestamoParsed"/>
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								Fecha Entrada: <xsl:value-of select="FechaFinPrestamoParsed"/>
							</fo:block>
						</fo:table-cell>						
					</fo:table-row>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								Hora : <xsl:value-of select="HoraIniPrestamoParsed"/>
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								Hora: <xsl:value-of select="HoraFinPrestamoParsed"/>
							</fo:block>
						</fo:table-cell>						
					</fo:table-row>																				
				</fo:table-body>
			</fo:table>
			<fo:table table-layout="fixed" border-style="solid" border-width="0.1mm">
				<fo:table-column column-width="16cm"/>			
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								1º El cliente ha confiado previamente, para su reparación, el vehículo de su propiedad matrícula <xsl:value-of select="ReparacionVehiculoMatriculaPrestamo"/> según la orden de reparación nº <xsl:value-of select="ReparacionIdPrestamo"/>.
							</fo:block>								
							<fo:block>								
								2º En relación con lo anterior, el cliente ha solicitado al taller un vehículo de sustitución, en las condiciones de utilización que se exponen a continuación y el taller ha accedido a esa solicitud.
							</fo:block>								
							<fo:block>								
								3º Este documento efectúa, al amparo y de acuerdo con el escrito de contestación a consulta, emitido por la Dirección General del Transporte Terrestre, del Ministerio de Obras Públicas y Transportes de fecha 15-10-1992 por la que se declara no sujeto el mismo, a los requisitos exigidos por la legislación vigente, para las operaciones de alquiler de vehículos sin conductor.
							</fo:block>								
							<fo:block>								
								4º El cliente declara tener todos los requisitos exigidos por la ley para la conducción de un vehículo, debidamente actualizados y en vigencia.
							</fo:block>								
							<fo:block>								
								5º El cliente se hará responsable de los daños ocasionados en el vehículo, así como de las infracciones, gastos, daños y perjuicios que se ocasionen durante el periodo en que utilice el vehículo de sustitución.
							</fo:block>								
							<fo:block>								
								6º El cliente declara haber leído y aceptado las condiciones de utilización del vehículo de sustitución, haciendo especial mención, al tipo de seguro obligatorio y voluntario, así como a la responsabilidad civil que cubre el mismo y en prueba de conformidad, firma este documento con el Visto Bueno del Taller.
							</fo:block>
						</fo:table-cell>						
					</fo:table-row>
				</fo:table-body>
			</fo:table>
			<fo:table table-layout="fixed" border-style="solid" border-width="0.1mm">
				<fo:table-column column-width="4cm"/>
				<fo:table-column column-width="6cm"/>
				<fo:table-column column-width="6cm"/>				
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								Vº Bº TALLER
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								FIRMAS DEL CLIENTE: ENTREGA
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block>
								DEVOLUCIÓN DEL VEHÍCULO
							</fo:block>
						</fo:table-cell>						
					</fo:table-row>
				</fo:table-body>
			</fo:table>																																
		</xsl:for-each>	
	</xsl:template>
	<xsl:include href="elementosCabecera.xslt"/>
</xsl:stylesheet>
