<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:include href="main.xslt"/>
	<xsl:template match="result">
		<xsl:for-each select="./Reparacion">
			<fo:table table-layout="fixed"  >
				<fo:table-column column-width="5cm"/>		
				<fo:table-column column-width="11cm"/>				
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"  table-layout="fixed">
							<fo:block>
								Orden de Reparación
							</fo:block>						
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"  table-layout="fixed">
							<fo:block>
								<xsl:value-of select="Id"/>
							</fo:block>						
						</fo:table-cell>						
					</fo:table-row>				
				</fo:table-body>
			</fo:table>		
		
			<fo:table table-layout="fixed"  >
				<fo:table-column column-width="3cm"/>
				<fo:table-column column-width="5cm"/>
				<fo:table-column column-width="3cm"/>
				<fo:table-column column-width="5cm"/>							
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Marca
							</fo:block>						
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="VehiculoMarcaReparacionParsed"/>
							</fo:block>						
						</fo:table-cell>						
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Modelo
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="VehiculoModeloReparacionParsed"/>
							</fo:block>
						</fo:table-cell>						
					</fo:table-row>	
					<fo:table-row>										
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Matrícula
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="VehiculoMatriculaReparacionParsed"/>
							</fo:block>
						</fo:table-cell>						
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Chasis
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="VehiculoChasisIdReparacionParsed"/>
							</fo:block>
						</fo:table-cell>																								
					</fo:table-row>	
					<fo:table-row>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Km
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="KmReparacionParsed"/>
							</fo:block>
						</fo:table-cell>						
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Depósito
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="DepositoReparacionParsed"/>
							</fo:block>
						</fo:table-cell>												
					</fo:table-row>									
				</fo:table-body>
			</fo:table>							
					
			<fo:table table-layout="fixed"  >
				<fo:table-column column-width="4cm"/>
				<fo:table-column column-width="4cm"/>
				<fo:table-column column-width="4cm"/>
				<fo:table-column column-width="4cm"/>			
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Código de cliente
							</fo:block>						
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="ClienteIdReparacionParsed"/>
							</fo:block>						
						</fo:table-cell>						
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								CIF
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="ClienteNifReparacionParsed"/>
							</fo:block>
						</fo:table-cell>						
					</fo:table-row>	
					<fo:table-row>										
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Nombre
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   border-style="solid" border-width="0.1mm" table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="ClienteNombreReparacionParsed"/>
							</fo:block>
						</fo:table-cell>						
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Nombre comercial
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="ClienteNombreComercialReparacionParsed"/>
							</fo:block>
						</fo:table-cell>																								
					</fo:table-row>
					<fo:table-row>										
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Teléfono
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="ClienteTelefonoReparacionParsed"/>
							</fo:block>
						</fo:table-cell>						
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Móvil
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="ClienteMovilReparacionParsed"/>
							</fo:block>
						</fo:table-cell>																								
					</fo:table-row>						
					
				</fo:table-body>
			</fo:table>					
					
			<fo:table table-layout="fixed">
				<fo:table-column column-width="4cm"/>
				<fo:table-column column-width="4cm"/>
				<fo:table-column column-width="4cm"/>
				<fo:table-column column-width="4cm"/>			
				<fo:table-body>					
					<fo:table-row>										
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Fecha entrada
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="FechaEntradaReparacionParsed"/>
							</fo:block>
						</fo:table-cell>						
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Fecha salida
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="FechaSalidaReparacionParsed"/>
							</fo:block>
						</fo:table-cell>																								
					</fo:table-row>	
					<fo:table-row>										
						<fo:table-cell number-columns-spanned="4"  text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt" space-after="8pt">
								
							</fo:block>
						</fo:table-cell>																		
					</fo:table-row>
					<fo:table-row>										
						<fo:table-cell number-columns-spanned="4"  text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="14pt">
								Orden de reparación / Resguardo depósito
							</fo:block>
						</fo:table-cell>																		
					</fo:table-row>															
					<fo:table-row>										
						<fo:table-cell number-columns-spanned="4"  text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Operaciones a realizar
							</fo:block>
						</fo:table-cell>																		
					</fo:table-row>
					<fo:table-row>										
						<fo:table-cell number-columns-spanned="4"  text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-top-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="ObsReparacionParsed"/>
							</fo:block>
						</fo:table-cell>																		
					</fo:table-row>	
					<fo:table-row>										
						<fo:table-cell number-columns-spanned="4"  text-align="left" padding-after="0.1cm" padding-before="0.1cm" table-layout="fixed">
							<fo:block font-size="10pt" space-after="10pt">
							</fo:block>
						</fo:table-cell>																		
					</fo:table-row>														
				</fo:table-body>
			</fo:table>
			
			<fo:table table-layout="fixed" border-top-style="solid" border-width="0.1mm" >
				<fo:table-column column-width="8cm"/>		
				<fo:table-column column-width="8cm"/>				
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-top-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="8pt" font-weight="bold" space-after="10pt" white-space-collapse="false">Plazo previsto de entrega:       días hábiles</fo:block>						
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-top-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="8pt" font-weight="bold" space-after="10pt" white-space-collapse="false">Gestión de estancia:       € por día</fo:block>						
						</fo:table-cell>						
					</fo:table-row>									
				</fo:table-body>
			</fo:table>			
			
			<fo:table table-layout="fixed"  >
				<fo:table-column column-width="16cm"/>						
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="8pt" white-space-collapse="false">Autorizo la realización de las operaciones descritas sobre el vehículo. Renuncio a la confección de presupuesto. Transcurrido 3 días hábiles a la fecha de plazo de entrega devenga gastos de estancia por el importe de           €/dia. Los presupuestos de reparación de autorradios no aceptados, supondrán un importe de           € (i.v.a. no incluido)</fo:block>						
						</fo:table-cell>						
					</fo:table-row>				
				</fo:table-body>
			</fo:table>																					
					
			<fo:table table-layout="fixed">
				<fo:table-column column-width="8cm"/>		
				<fo:table-column column-width="8cm"/>				
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell number-columns-spanned="2" text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-top-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="8pt" font-weight="bold" >
								(Leido y conforme)
							</fo:block>						
						</fo:table-cell>						
					</fo:table-row>	
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="8pt" font-weight="bold" space-after="60pt">
								Firma del cliente
							</fo:block>						
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="8pt" font-weight="bold" space-after="60pt">
								Firma y sello del Taller
							</fo:block>						
						</fo:table-cell>						
					</fo:table-row>									
				</fo:table-body>
			</fo:table>
			
			<fo:table table-layout="fixed"  >
				<fo:table-column column-width="1cm"/>		
				<fo:table-column column-width="15cm"/>				
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell number-columns-spanned="2" text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="8pt">
								Iniciales (Para autorización expresa, escriba sus iniciales)
							</fo:block>						
						</fo:table-cell>						
					</fo:table-row>	
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" table-layout="fixed">
							<fo:block font-size="8pt" border-style="solid" border-width="0.1mm" padding="-0.1cm" padding-after="0.0cm" padding-before="0.4cm">
								
							</fo:block>						
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="8pt" white-space-collapse="false">Autorizo la subcontratación de trabajos
Autorizo la utilización, si es necesario, de elementos reconstruidos</fo:block>						
						</fo:table-cell>						
					</fo:table-row>	
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm" table-layout="fixed">
							<fo:block font-size="8pt" border-style="solid" border-width="0.1mm" padding="-0.1cm" padding-after="0.0cm" padding-before="0.4cm">
								
							</fo:block>						
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="8pt">
								(El taller se responsabiliza de la garantía de los trabajos subcontratados y elementos reconstruidos)
							</fo:block>						
						</fo:table-cell>						
					</fo:table-row>													
				</fo:table-body>
			</fo:table>	
			
			<fo:table table-layout="fixed" >
				<fo:table-column column-width="3cm"/>
				<fo:table-column column-width="5cm"/>
				<fo:table-column column-width="3cm"/>
				<fo:table-column column-width="5cm"/>							
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell number-columns-spanned="2" text-align="left" padding-after="0.1cm" padding-before="0.1cm"  border-top-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="8pt">
								
							</fo:block>						
						</fo:table-cell>
						<fo:table-cell number-columns-spanned="2" text-align="center" padding-after="0.1cm" padding-before="0.1cm"  border-top-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="8pt" font-weight="bold">
								RENUNCIO A LA CONFECCIÓN DE PRESUPUESTO
							</fo:block>						
						</fo:table-cell>												
					</fo:table-row>	
					<fo:table-row>										
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Marca
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="VehiculoMarcaReparacionParsed"/>
							</fo:block>
						</fo:table-cell>						
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Matrícula
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="VehiculoMatriculaReparacionParsed"/>
							</fo:block>
						</fo:table-cell>																								
					</fo:table-row>	
					<fo:table-row>										
						<fo:table-cell text-align="left" padding="0.35cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Fecha entrada
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="FechaEntradaReparacionParsed"/>
							</fo:block>
						</fo:table-cell>						
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Fecha salida
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"  border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="FechaSalidaReparacionParsed"/>
							</fo:block>
						</fo:table-cell>																								
					</fo:table-row>								
				</fo:table-body>
			</fo:table>	
			<fo:table table-layout="fixed"  >
				<fo:table-column column-width="5cm"/>		
				<fo:table-column column-width="11cm"/>				
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block>
								Orden de Reparación
							</fo:block>						
						</fo:table-cell>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block>
								<xsl:value-of select="Id"/>
							</fo:block>						
						</fo:table-cell>						
					</fo:table-row>				
				</fo:table-body>
			</fo:table>
			
			<fo:table break-before="page" table-layout="fixed" >
				<fo:table-column column-width="2cm"/>
				<fo:table-column column-width="3cm"/>
				<fo:table-column column-width="2cm"/>
				<fo:table-column column-width="9cm"/>			
				<fo:table-body>					
					<xsl:for-each select="./OrdenTrabajo">
					<fo:table-row>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Código
							</fo:block>						
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="Id"/>
							</fo:block>						
						</fo:table-cell>						
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Tipo
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left" padding="0.4cm" padding-after="0.1cm" padding-before="0.1cm"   border-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="TipoOrdenTrabajoParsed"/>
							</fo:block>
						</fo:table-cell>						
					</fo:table-row>	
					<fo:table-row>
						<fo:table-cell number-columns-spanned="4"  text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="10pt">
								Descripción
							</fo:block>						
						</fo:table-cell>
					</fo:table-row>	
					<fo:table-row>
						<fo:table-cell number-columns-spanned="4"  text-align="left" padding-after="0.1cm" padding-before="0.1cm" border-top-style="solid" border-width="0.1mm"  table-layout="fixed">
							<fo:block font-size="10pt">
								<xsl:value-of select="DescripcionOrdenTrabajoParsed"/>
							</fo:block>						
						</fo:table-cell>
					</fo:table-row>	
					<fo:table-row>
						<fo:table-cell number-columns-spanned="4"  text-align="left" padding-after="0.1cm" padding-before="0.1cm" table-layout="fixed">
							<fo:block font-size="10pt" space-after="5pt">
							</fo:block>						
						</fo:table-cell>
					</fo:table-row>															
					</xsl:for-each>	
					<fo:table-row>
						<fo:table-cell number-columns-spanned="4"  text-align="left" padding-after="0.1cm" padding-before="0.1cm"  table-layout="fixed">
							<fo:block font-size="10pt" space-after="30pt">				
							</fo:block>						
						</fo:table-cell>
					</fo:table-row>														
				</fo:table-body>
			</fo:table>										
				
			<fo:table break-before="page" table-layout="fixed"  >
				<fo:table-column column-width="16cm"/>						
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block>
								CLAUSULAS Y CONDICIONES
							</fo:block>						
						</fo:table-cell>						
					</fo:table-row>
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block space-after="10pt"></fo:block>						
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	1. No aceptamos responsabilidad alguna por pérdida y/o daños de los vehículos o artículos en ellos depositados fuera de nuestro control.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	2. No se hacen responsables de los elemento de desgaste por mal uso del vehículo.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	3. Las piezas sustituidas, salvo las atendidas en garantía, estarán a disposición del clientehasta el momento de la retirada del vehículo. Posteriormente serán inutilizadas.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	4. El cliente autoriza a los empleados de esta Concesión a conducir el vehículo arriba consignado por calles y carreteras para efectuar las pruebas que se estimen necesarias.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	5. El presupuesto solicitado tendrá una validez máxima de 12 días hábiles.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	6. Los posibles cargos por los trabajos necesarios para la elaboración de un presupuesto solicitado, sólo se cobrará al cliente si no se desea realizar la reparación posterior.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	7. Una vez avisado el cliente de la terminación de los trabajos solicitados tendrá un plazo de 3 días hábiles para retirar el vehículo, a partir del cual se cobrarán los gastos de estancia y custodia.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	8. Si el cliente desiste, en cualquier momento, del encargo realizado, tendrá que abonar al taller el importe por los trabajos efectuados hasta la retirada del vehículo.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	9. Todas las reparaciones están garantizadas de acuerdo a la legislación de talleres vigente, es decir, por tres meses o 2.000 Kms, lo que antes ocurra. La garantía se entiende total; incluyendo mano de obra, piezas sustituidas, servicio de grúa, desplazamiento de operarios e impuestoa, y su cumplimiento se realizará sin que quepa postergación.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	10. Componentes electrónicos, garantía que marque el fabricante del componente.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	11. El cliente renuncia expresamente a solicitar PRESUPUESTO PREVIO de la reparación y AUTORIZA a realizar los trabajos de reparación solicitados utilizando la mano de obra y los materiales que sean necesarios según las normas de trabajo de la empresa.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	12. El cliente se hace cargo del importe de la reparación en caso de que la Compañía de Seguros no se haga responsable la misma.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	13. AUTORIZO que la pieza sustituida mediante una remanufacturada (*) quede a disposición del taller, y renuncio, por tanto a que me sea devuelta.</fo:block>
							<fo:block font-size="10pt" space-after="5pt" white-space-collapse="false">	14. Las formas de pago, antes de retirar el vehículo son las siguientes:</fo:block>
							<fo:block font-size="10pt" space-after="5pt" white-space-collapse="false">		a. En Metático.</fo:block>
							<fo:block font-size="10pt" space-after="5pt" white-space-collapse="false">		b. Mediante Tarjeta de Crédito.</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">		c. Domiciliación Bancaria (solo en oficinas bancarias de la provincia).</fo:block>
							<fo:block font-size="10pt" space-after="10pt" white-space-collapse="false">	15. Estoy conforme en que el pago del importe total de la reparación se realice al contado y siempre antes de retirar el vehículo, después de su reparación.</fo:block>						
						</fo:table-cell>						
					</fo:table-row>	
					<fo:table-row>
						<fo:table-cell text-align="left" padding-after="0.1cm" padding-before="0.1cm"   table-layout="fixed">
							<fo:block font-size="8pt">
								(*) Pieza reciclada
							</fo:block>						
						</fo:table-cell>						
					</fo:table-row>									
				</fo:table-body>
			</fo:table>																															
		</xsl:for-each>	
	</xsl:template>
	<xsl:include href="elementosCabecera.xslt"/>
</xsl:stylesheet>
