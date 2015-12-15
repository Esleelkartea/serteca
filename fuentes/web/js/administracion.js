
/* 
Identificadores Constantes:
	div_nuevo (div)
	div_header (div)
	div_query (div)
	inputQueryId (input)
	formNuevoId (form)
Identificadores Predefinidos:
	dinamic_grid_data_header (table)
	dinamic_grid_data (table)
	viewPort (div)
	container (div)

*/

var myLiveRicoGrid;

function cargaAlta()
{
 var iModoVisualizacion = parseInt($('iModoVisualizacion').value);	
 var strCamposDec = $('strFormCamposDec').value;
 var strCamposOblig = $('strFormCamposOblig').value;
 var strCampos = $('strFormCampos').value;
 var strValidarCamposForm = $('strValidarCamposForm').value;
 var strTipoEditor = $('strFormTipoEditor').value;
 var strLinkAddServlet = $('strLinkAddServlet').value;
 var strFormCamposWidth = $('strFormCamposWidth').value.split(";"); 
 var func_ver = $('strFunction').value;   
 var campos = strCampos.split(";");
 var validarCamposForm = strValidarCamposForm.split(";");
 var camposOblig = strCamposOblig.split(";");
 var tipoEditor = strTipoEditor.split(";");
 var camposDec = strCamposDec.split(";");
 var j=0,str="";
 str= str + "<form action='' name='formNuevoId' id='formNuevoId' method='POST'><div id='div_nuevo_cabecera' name='div_nuevo_cabecera' class='div_nuevo_cabecera'></div><div class='div_nuevo_cuerpo'>";
 for (j=0;j<campos.length;j++)
 {
 	if (tipoEditor[j].indexOf('HIDDEN') != -1)
 	{
 		str = str + "<span style='text-align:right;'><input type='hidden' name='" + campos[j] + "' id='" + campos[j] + "' value='' ></span>";
 	} 
 	if (tipoEditor[j].indexOf('NORMAL') != -1)
 	{
 		str = str + "<span class='spanDoble' style='width:" + strFormCamposWidth[j] + "'>" + camposDec[j] + "&nbsp;<input class='caja" + camposOblig[j] + " " + validarCamposForm[j] + "' type='text' name='" + campos[j] + "' id='" + campos[j] + "' value=''></span>";
 	}
 	if (tipoEditor[j].indexOf('LECTURA') != -1)
 	{
 		str = str + "<span class='spanDoble' style='width:" + strFormCamposWidth[j] + "'><table><tr><td>" + camposDec[j] + "&nbsp;</td><td class='cajaSpan'><span name='" + campos[j] + "' id='" + campos[j] + "'></span></td></tr></table></span>";
 	} 	
 	if (tipoEditor[j].indexOf('CHECK') != -1)
 	{
 		str = str + "<span class='spanDoble' style='width:" + strFormCamposWidth[j] + "'>" + camposDec[j] + "&nbsp;<input class='cajaCheck' type='checkbox' name='" + campos[j] + "' id='" + campos[j] + "'></span>";
 	} 	
 	if (tipoEditor[j].indexOf('AREA') != -1)
 	{
 		str = str + "<span class='spanDoble' style='width:" + strFormCamposWidth[j] + "'>" + camposDec[j] + "&nbsp;<textarea rows='6' class='cajaArea" + camposOblig[j] + " " + validarCamposForm[j] + "' id='" + campos[j] + "' name='" + campos[j] + "'></textarea></span>";
 	} 	
 	if (tipoEditor[j].indexOf('DATE') != -1)	
 	{
 		str = str + "<span class='spanDoble' style='width:" + strFormCamposWidth[j] + "'>" + camposDec[j] + "&nbsp;<input class='cajaFecha" + camposOblig[j] +  " " + validarCamposForm[j] + "' type='text' name='" + campos[j] + "' id='" + campos[j] + "' value=''>";
 		str = str + "<a href='#'><img id='" + campos[j] + "Trigger' src='../img/calendar.gif' alt='calendario' width='19' height='17' border='0'></a>";
 		str = str + "</span>";
 	}
 	if (tipoEditor[j].indexOf('AUTO') != -1)
 	{
 		str = str + "<span class='spanDoble' style='width:" + strFormCamposWidth[j] + "'>" + camposDec[j] + "&nbsp;<input class='inputAutoCompletar' type='text' name='" + campos[j] + "' id='" + campos[j] + "' value=''>";
 		str = str + "<div id='" + campos[j] + "Update' class='in-place-auto-div' style='display:none;height:200px;'></div>";
 		str = str + "</span>";	
 	}
 }
 var strModoVis = (iModoVisualizacion == 0)?'limpiar();':'';
 str = str + "</div><div class='div_nuevo_pie'><a href='#' onclick='valorCheckbox();alta(\"" + strLinkAddServlet + "\")'><img src='../img/aceptar.gif' alt='aceptar' align='middle' width='19' height='17' border='0'>&nbsp;Aceptar</a>&nbsp;&nbsp;&nbsp;<a href='#' onclick='" + strModoVis +  "eval(\"" + func_ver + "\");'>Cancelar&nbsp;<img src='../img/cancelar.gif' alt='cancelar' align='middle' width='19' height='17' border='0'></a></div>";
 str = str + "</form>";
 $('div_nuevo').style.display='block';
 $('div_nuevo').innerHTML=str; 	
 NuevosValidadores();
} 

function NuevosValidadores()
{
 var form = $('formNuevoId');
 var strFormCampos = $('strFormCampos').value;
 var formCampos = strFormCampos.split(";");
 var strValidarCamposForm = $('strValidarCamposForm').value;
 var validarCamposForm = strValidarCamposForm.split(";");

 for(var i=0; i< formCampos.length; i++){
	if (validarCamposForm[i].indexOf("validation-max") != -1)
	{ 	
			addValidarMax(validarCamposForm[i]);
	}
 }
}

function addValidarMax(strClass){
		var strTemp = strClass.substr(strClass.indexOf("validation-max")+15,strClass.length);
		strTemp = strTemp.substr(0,strTemp.indexOf("-es"));
 		var aviso = "Introducir como  máximo " + strTemp + " carácteres";
		var tipo = "validation-max-" + strTemp + "-es";
		var strValid = "";
		strValid = strValid + "this.rE = '^\.{1," + strTemp + "}$';";
		strValid = strValid + "var reg = new RegExp(this.rE);"; 
		strValid = strValid + "this.res = Validation.get('IsEmpty').test(v) || reg.test(v);return this.res;";
		var funcValid = new Function("v",strValid);
		var valid = Validation.add(tipo,aviso,funcValid);			
}

function NuevosAutocompletados()
{
 var strCampos = $('strFormCampos').value;
 var strTipoEditor = $('strFormTipoEditor').value;	
 var strLinksUlServlet = $('strFormLinksUlContentServlet').value;
 var linksUlServlet = strLinksUlServlet.split(";");
 var campos = strCampos.split(";");
 var tipoEditor = strTipoEditor.split(";");
 for (j=0;j<campos.length;j++)
 {
 	if (tipoEditor[j].indexOf('AUTO') != -1)
 	{
 		AutoCompletar(campos[j],campos[j] + "Update",linksUlServlet[j]);
 	}
 }
}

function NuevasFechas()
{
 var strCampos = $('strFormCampos').value;
 var strTipoEditor = $('strFormTipoEditor').value;
 var campos = strCampos.split(";");
 var tipoEditor = strTipoEditor.split(";");
 for (j=0;j<campos.length;j++)
 {
 	if (tipoEditor[j].indexOf('DATE') != -1)
 		CalendarSetup(campos[j],campos[j] + "Trigger");
 }
}

function compruebaParam()
{
	var strFormLinksElementServlet = $('strFormLinksElementServlet').value;
	var strTipoEditor = $('strFormTipoEditor').value;
	var linksElement = strFormLinksElementServlet.split(";");
	var tipoEditor = strTipoEditor.split(";");
	var param =  paramToStr();
 	for (j=0;j<linksElement.length;j++)
 	{
 		if (tipoEditor[j].indexOf('AUTO') != -1)
 		{	
 			//alert(linksElement[j] + " param: " + param);
			new Ajax.Request(linksElement[j],{method: 'get', parameters:param, onComplete:CalculaDato});
		}
	}
}

function CalculaDato(originalRequest)
{
        var resultXML=originalRequest.responseXML;
        var temp=resultXML.getElementsByTagName('result')[0].firstChild;
        //alert(temp.tagName+temp.firstChild.nodeValue);
        
   	document.getElementById(temp.tagName).value = temp.firstChild.nodeValue; 
}


function AutoCompletar(inputId,divId,linkServlet)
{
 new Ajax.ZkAutocompleter(inputId,divId,linkServlet,{minChars:2});
}

function CalendarSetup(inputId,trigger)
{
	Calendar.setup({
		inputField     :    inputId,            // id of the input field
		ifFormat       :    "%d-%m-%Y",      	      // format of the input field
		button         :    trigger // trigger for the calendar (button ID)
	});
}

function cargaGrid()
{
 var num_lineas_visibles = parseInt($('viewedRows').value)+1;	
 var campos = $('strCamposDec').value.split(";");
 var strCamposWidth = $('strCamposWidth').value.split(";");
 var i=0,j=0,str="",strH="";
 strH= strH + "<table id='dinamic_grid_data_header' name='dinamic_grid_data_header'><tr>";
 for (j=0;j<campos.length;j++)
 {
 	var valor = campos[j];
	if (campos[j].indexOf('Borrar') != -1)   		
   		valor = "<span class='eliminarHeader'>&#160;&#160;&#160;&#160;</span>";	
	if (campos[j].indexOf('Duplicar') != -1)   		
   		valor = "<span class='duplicarHeader'>&#160;&#160;&#160;&#160;</span>";   		
	if (campos[j].indexOf('Editar') != -1)   		
   		valor = "<span class='edicionHeader'>&#160;&#160;&#160;&#160;</span>";
 	strH = strH + "<th style='width:" + strCamposWidth[j] + "'>" + valor + "</th>";
 }
 strH = strH + "</tr></table>";
 $('div_header').style.display='block'; 
 $('div_header').innerHTML=strH;
 str = "<div id='viewPort'><table id='dinamic_grid_data' name='dinamic_grid_data'>"
 for (i=0;i<num_lineas_visibles;i++)
 {
 	var estilo = (i%2)?'lineaPar':'lineaImpar';
 	str = str + "<tr class='" + estilo + "'>";
 	for (j=0;j<campos.length;j++)
 	{
 		str = str + "<td style='width:" + strCamposWidth[j] + "'>&nbsp;a</td>";
 	}
 	str = str + "</tr>";
 }
 str = str + "</table></div>";

$('container').style.display='block'; 
$('container').innerHTML=str;
$('placeholder').style.display='block'; 
}

 function cargaQueryGrid()
 {
  var iModoVisualizacion = parseInt($('iModoVisualizacion').value); 
  var strModoVis = (iModoVisualizacion == 0)?'limpiar();':'';	
  var filtrar_viewedRows = parseInt($('viewedRows').value);
  var linkListaPdfServlet =  $('strLinkListaPdfServlet').value; 
  var str="";
  str = str + "<div><span class='titulo' id='titulo_" + $('strTableId').value + "'>" + $('strTituloLista').value + "</span>";
  if (linkListaPdfServlet != "")  
  	str = str + "<a href='#' onclick='imprimir(\"" + linkListaPdfServlet + "\");'><img src='../img/pdf.gif' alt='imprimir' align='middle' width='19' height='17' border='0'>&nbsp;Imprimir</a>&nbsp;&nbsp;&nbsp;";
  str = str + "<input type='text' class='caja' name='inputQueryId' id='inputQueryId' value='" + $('strQuery').value + "'/>&nbsp;";
  str = str + "<a href='#' onclick='filtrarQuery(" + filtrar_viewedRows + ");'/><img src='../img/lupa.gif' alt='buscar' align='middle' width='19' height='17' border='0'>&nbsp;&nbsp;Buscar</a>&nbsp;&nbsp;"; 
  str = str + "<a href='#' onclick='" + strModoVis +  "cargaAlta();NuevosAutocompletados();NuevasFechas();compruebaParam();'><img src='../img/nuevo.gif' alt='nuevo' align='middle' width='19' height='17' border='0'>&nbsp;Nuevo</a>&nbsp;&nbsp;&nbsp;";
  str = str + "</div>";
  str = str + cargaFiltro();
  str = str + cargaPadres();  
  //alert(str);
  $('div_query').style.display='block';
  $('div_query').innerHTML=str;
 }
 
 function imprimir(linkDetallePdfServlet)
 {
  var param =  paramToStr();
  if ($('strQuery').value != "")
  	param = param + "&" + "query=" + $('strQuery').value;
  if ($('strFiltroParam').value != "")
  	param = param + "&" + "filtro=" + $('strFiltroParam').value;
  if ((myLiveRicoGrid.sortCol != "") && (myLiveRicoGrid.sortDir != ""))
  	param = param + "&" + "sort_col=" + myLiveRicoGrid.sortCol + "&" + "sort_dir=" + myLiveRicoGrid.sortDir; 	  	
  //alert(param);		  	
  window.open(linkDetallePdfServlet + "?" + param);
 }
 
function alta(strLinkAddServlet)
{
 var func_ver = $('strFunction').value;
 var form = $('formNuevoId');
 var iModoVisualizacion = parseInt($('iModoVisualizacion').value);	
 var valid = new Validation('formNuevoId',{stopOnFirst:true});
  if(valid.validate()){
 	new Ajax.Request(strLinkAddServlet,{ parameters:Form.serialize(form),asynchronous:false });
	if (iModoVisualizacion == 0)
 		limpiar();
 	eval( func_ver );
 }
}  
 
 function filtrar(viewedRows,filtro)
 {
 //alert($('strParam').value);
  var iModoVisualizacion = parseInt($('iModoVisualizacion').value);
  if (iModoVisualizacion == 1)
  	limpiarNuevo(); 
  var param = calculaParam();	
  param.push("query=" + $('strQuery').value);
  if (filtro!=null){
	$('strFiltroParam').value=filtro;
	param.push("filtro=" + $('strFiltroParam').value);
  }
  //alert(param);

  myLiveRicoGrid.setRequestParams.apply(myLiveRicoGrid,param);
  myLiveRicoGrid.resetContents();
  myLiveRicoGrid.requestContentRefresh(0);
  var sRC = new SearchRowsConfigurator(myLiveRicoGrid, viewedRows,"strTotalRegistros","strGap");
  ajaxEngine.registerAjaxObject( 'configureWebSearchRows', sRC  );
  setTimeout('updateHeader(myLiveRicoGrid,0)',200);
 }
 
 function crear()
 {
  var regg = registrar();
  var strFiltroParam = $('strFiltroParam').value; 
  var strEventos = $('strEventos').value; 
  var eventos = strEventos.split(";");
  var viewedRows = parseInt($('viewedRows').value);
  var tableContentServlet = $('tableContentServlet').value;
  var strCampos = $('strCampos').value
  var campos = strCampos.split(";");
  var strEsOrdenable = $('strEsOrdenable').value;
  var esOrdenable =  strEsOrdenable.split(";");  
  var opts = {  onscroll :      updateHeader        
                ,sortAscendImg:        "../img/sort_asc.gif"
                ,sortDescendImg:       "../img/sort_desc.gif"   
              }; 
              
  var ops =[];
  for(var i=0;i< campos.length; i++){
  ops.push([campos[i],parseInt(esOrdenable[i])]);
  }
  Object.extend(opts,{columns:ops})              

  myLiveRicoGrid =  new Ajax.ZkLiveGrid('dinamic_grid_data', viewedRows,viewedRows,tableContentServlet,regg,eventos,opts);

  filtrar(viewedRows,strFiltroParam);
  setTimeout('updateHeader(myLiveRicoGrid,0)',1000);
  overIE('tr');
 } 
 
 function updateHeader(liveGrid, offset) {
 	var numUltimoRegistro;
 	numUltimoRegistro = offset+liveGrid.metaData.getPageSize();
 	numUltimoRegistro=((numUltimoRegistro>$("strTotalRegistros").value)? $("strTotalRegistros").value:numUltimoRegistro);
 	$("placeholder").innerHTML = (offset+1) + " - " + (numUltimoRegistro) + " de " + ($("strTotalRegistros").value);
 }
 
 function registrar()
 {
   var strMetodosController = $('strMetodosController').value;
   var strTipoEditor = $('strTipoEditor').value;
   var strLinksUlContentServlet = $('strLinksUlContentServlet').value;
   var strLinksUpdateServlet = $('strLinksUpdateServlet').value;
   var strValidarColumnasGrid = $('strValidarColumnasGrid').value;
   var metodos = strMetodosController.split(";");
   var validarColumnasGrid = strValidarColumnasGrid.split(";");
   var tipoEditor = strTipoEditor.split(";");
   var linksUpdate = strLinksUpdateServlet.split(";"); 
   var linksUl = strLinksUlContentServlet.split(";");
   var regg = new regist();
   for(i=0;i< metodos.length; i++)
   {
    if (validarColumnasGrid[i].indexOf("validation-max") != -1)
		addValidarMax(validarColumnasGrid[i]); 

   	if (tipoEditor[i].indexOf('NORMAL') != -1)
   		regg.addElemento(new editor('NORMAL',linksUpdate[i],i,metodos[i],null,validarColumnasGrid[i]));
   	if (tipoEditor[i].indexOf('AREA') != -1)
   		regg.addElemento(new editor('AREA',linksUpdate[i],i,metodos[i],null,validarColumnasGrid[i]));   		
   	if (tipoEditor[i].indexOf('DATE') != -1)
   		regg.addElemento(new editor('DATE',linksUpdate[i],i,metodos[i],null));
   	if (tipoEditor[i].indexOf('AUTO') != -1)	
   		regg.addElemento(new editor('AUTO',linksUpdate[i],i,metodos[i],linksUl[i])); 
	if (tipoEditor[i].indexOf('FREE_BORRAR') != -1)   		
   		regg.addElemento(new editor('FREE',borrar,i,metodos[i],null));	
	if (tipoEditor[i].indexOf('FREE_DUPLICAR') != -1)   		
   		regg.addElemento(new editor('FREE',duplicar,i,metodos[i],null));   		
	if (tipoEditor[i].indexOf('FREE_EDITAR') != -1)   		
   		regg.addElemento(new editor('FREE',editar,i,metodos[i],null));   		
   }
   return regg;
 }
 
function borrar(element,id)
{
	var viewedRows = parseInt($('viewedRows').value);
  	var strLinkDeleteServlet = $('strLinkDeleteServlet').value; 
  	//alert(id);
	if (confirm("¿Está usted seguro de borrar el registro?"))
	{
		new Ajax.Request(strLinkDeleteServlet,{ parameters:"borrarId="+id,
							asynchronous:true, 
							  onComplete:mensaje
							}
		);
		setTimeout("filtrar(" + viewedRows + ",null)",200);
	}
}

function mensaje(originalRequest)
{
	var formCabeceraLinks = $('strFormCabeceraLinks').value.split(";");
	var strHijos = "";
	for(i=0;i< formCabeceraLinks.length; i++)
		strHijos = strHijos + formCabeceraLinks[i] + " ";
        var resultXML=originalRequest.responseXML;
        if (resultXML.getElementsByTagName('estado')[0].firstChild.nodeValue == "NOT_OK")
		alert("No se ha podido eliminar el registro. Elimine antes sus " + strHijos);
	else
		alert("El registro se ha eliminado correctamente");	
}

function duplicar(element,id)
{
	var viewedRows = parseInt($('viewedRows').value);
  	var strLinkDuplicarServlet = $('strLinkDuplicarServlet').value; 
  	//alert(id);
	if (confirm("¿Está usted seguro de duplicar el registro?"))
	{
		new Ajax.Request(strLinkDuplicarServlet,{ parameters:"duplicarId="+id,
							  asynchronous:false
							}
		);
		filtrar(viewedRows,null);
	}
}


function editar(element, id)
{
	var strLinkEditServlet = $('strLinkEditServlet').value;
	var strLinkEditParam = $('strLinkEditParam').value;
	var param = strLinkEditParam+id;
	var myAjax = new Ajax.Request(strLinkEditServlet,{method: 'get', parameters:param, onComplete:Datos});
}
function Datos(originalRequest) 
{ 
	var iModoVisualizacion = parseInt($('iModoVisualizacion').value);
  	var strCampos = $('strFormCampos').value; 
  	var strMetodosController = $('strFormMetodosController').value;
  	var strTipoEditor = $('strFormTipoEditor').value;
  	var campos = strCampos.split(";"); 
  	var metodos = strMetodosController.split(";");
  	var tipoEditor = strTipoEditor.split(";");
  	if (iModoVisualizacion == 0)
		limpiar();
	cargaAlta();
	NuevosAutocompletados();
	NuevasFechas();
		
        var resultXML=originalRequest.responseXML;
        var temp=resultXML.getElementsByTagName('result')[0].firstChild;
        
   	for(i=0;i< metodos.length; i++)
   	{        
   		var strN=metodos[i];
   		try{
   		if(temp.getElementsByTagName(strN))
   		{
  			var elem = temp.getElementsByTagName(strN)[0].firstChild;
   			if (elem.childNodes[0]){
   				document.getElementById(campos[i]).className = elem.attributes[0].value;
   				elem = elem.firstChild;
   				
   			}
   			var valor = elem.nodeValue;
   			/*if (valor.indexOf('_Estilo_') != -1){
   				var temp = valor;
   				valor = temp.substr(0,temp.indexOf('_Estilo_'));
   				document.getElementById(campos[i]).className = temp.substr(temp.indexOf('_Estilo_')+1,temp.indexOf('_Estilo_')+10);
   			}*/
   			//if (valor.indexOf('_Estilo_') != -1) alert(valor);
   			if (valor == 'n/a') valor = "";
   			if (tipoEditor[i].indexOf('CHECK') != -1)
   			{
   				if (valor == '1')
   					document.getElementById(campos[i]).checked = true;
   				else
   					document.getElementById(campos[i]).checked = false;	
   			}
   			else
   			{
	   			if (tipoEditor[i].indexOf('LECTURA') != -1)
	   				document.getElementById(campos[i]).innerHTML = valor;
	   			else	
	   				document.getElementById(campos[i]).value = valor;
   			}
   		}
   		}catch(e){

   		}
   	}
   	var strIDName = document.getElementById(campos[0]).name;
   	var strIDValue = temp.getElementsByTagName(metodos[0])[0].firstChild.nodeValue;  	
   	ponerParam(strIDName,strIDValue);
   	cargaCabecera();

}

function cargaCabecera()
{
  	var strFormCabeceraLinks = $('strFormCabeceraLinks').value.split(";"); 
  	var strFormCabeceraFunctions = $('strFormCabeceraFunctions').value.split(";");
  	var linkDetallePdfServlet =  $('strLinkDetallePdfServlet').value;
  	var linkInformePdfServlet =  $('strLinkInformePdfServlet').value;  	
  	var str="";
  	str = str + "<div><span class='titulo' id='titulo_" + $('strTableId').value + "'>" + $('strTituloForm').value + "</span>";
  	if (linkDetallePdfServlet != "")
  		str = str + "<a href='#' onclick='imprimir(\"" + linkDetallePdfServlet + "\");'><img src='../img/pdf.gif' alt='imprimir' align='middle' width='19' height='17' border='0'>&nbsp;Imprimir</a>&nbsp;&nbsp;&nbsp;";
  	if (linkInformePdfServlet != "")
  		str = str + "<a href='#' onclick='imprimir(\"" + linkInformePdfServlet + "\");'><img src='../img/pdfInforme.gif' alt='imprimir' align='middle' width='19' height='17' border='0'>&nbsp;Informe</a>&nbsp;&nbsp;&nbsp;";  		
  	str = str + "</div>";
  	if ($('strFormCabeceraLinks').value != ""){
  		str = str + "<span class='spanDoble'>&nbsp;&nbsp;&nbsp;&nbsp;</span><span class='segundaLineaSpan'>&nbsp;&nbsp;&nbsp;&nbsp;<span>";
	   	for(i=0;i< strFormCabeceraLinks.length; i++)
	   	{ 
	   		str = str + "<a href='#' onclick='limpiar();resetQuery();ponerFiltro(\"\");" + strFormCabeceraFunctions[i] + ";'>" + strFormCabeceraLinks[i] + "<img src='../img/dcha.gif' alt='" + strFormCabeceraLinks[i] + "' align='middle' width='19' height='17' border='0'></a>";
	   	} 
	   	str = str + "</span>&nbsp;</span>";		
	}    	 
   	//alert(str); 	
   	$('div_nuevo_cabecera').innerHTML=str;	
}

function cargaPadres()
{
  	var strCabeceraLinks = $('strCabeceraLinks').value.split(";"); 
  	var strCabeceraFunctions = $('strCabeceraFunctions').value.split(";");
  	var str="";
  	if ($('strCabeceraLinks').value != ""){
  		str = str + "<span class='spanDoble'>&nbsp;&nbsp;&nbsp;&nbsp;</span><div class='segundaLinea'>&nbsp;&nbsp;&nbsp;&nbsp;<span>";
		for(i=0;i< strCabeceraLinks.length; i++)
		{ 
		   	str = str + "<a href='#' onclick='limpiar();resetQuery();ponerFiltro(\"\");" + strCabeceraFunctions[i] + ";'><img src='../img/izq.gif' alt='" + strCabeceraLinks[i] + "' align='middle' width='19' height='17' border='0'>" + strCabeceraLinks[i] + "</a>";
		} 
  		str = str + "</span>&nbsp;</div>";		
	}   	
   	return str;
}

function cargaFiltro()
{
 	var filtrar_viewedRows = parseInt($('viewedRows').value);
	var strFiltroLinks = $('strFiltroLinks').value.split(";"); 
  	var strFiltroFunctions = $('strFiltroFunctions').value.split(";");
  	var str="";
  	if ($('strFiltroLinks').value != ""){
  		str = str + "<span class='spanDoble'>&nbsp;&nbsp;&nbsp;&nbsp;</span><div class='segundaLinea'>&nbsp;&nbsp;&nbsp;&nbsp;<span>";
	   	for(i=0;i< strFiltroLinks.length; i++)
	   	{ 
	   		str = str + "<a href='#' onclick='filtrar(" + filtrar_viewedRows + ",\"" + strFiltroFunctions[i] + "\");'><img src='../img/filtro.gif' alt='Filtrar' align='middle' width='19' height='17' border='0'>&nbsp;&nbsp;" + strFiltroLinks[i] + "&nbsp;</a>";
	   	} 
  		str = str + "</span>&nbsp;</div>";		
	}	   	
	//alert (str);
   	return str;
}

/*function resetFiltro()
{ 
 $('strFiltroParam').value = '';
}*/
function ponerFiltro(valor)
{ 
 $('strFiltroParam').value = valor;
}

 function filtrarQuery(viewedRows)
 {
  $('strQuery').value = $('inputQueryId').value;
  filtrar(viewedRows,null);
 }
 
 function resetQuery()
 { 
  $('strQuery').value = '';
 }

function ponerParam(strIDName,strIDValue)
{
	if ($('strParam').value != "")
	{
		if ($('strParam').value.indexOf(';') != -1)
		{
			var arrParam = $('strParam').value.split(";");
			var bX = false;
			var iUlt = arrParam.length;
   			for (i=0;i<iUlt;i++)
   				if (arrParam[i].indexOf(strIDName) != -1)
   				{
   					arrParam[i]= strIDName + "=" + strIDValue;
   					bX = true;
   					iUlt = i;
   					break;
   				}
   			if (!bX)
   				arrParam[arrParam.length] = strIDName + "=" + strIDValue;	
   			$('strParam').value = arrParam[0];		
   			for (i=1;i<iUlt+1;i++)
   				$('strParam').value = $('strParam').value + ";" + arrParam[i];	
   		}
   		else
   			if ($('strParam').value.indexOf(strIDName) != -1)
   				$('strParam').value = strIDName + "=" + strIDValue;
   			else
   				$('strParam').value = $('strParam').value + ";" + strIDName + "=" + strIDValue;
   				
	}	
	else
		$('strParam').value = strIDName + "=" + strIDValue; 
	//alert($('strParam').value);	
}

function resetParam()
{
	$('strParam').value = '';
}

function calculaParam()
{
  var param = [];
  if ($('strParam').value.indexOf(';') != -1)
  	for (i=0;i<$('strParam').value.split(";").length;i++)
  		param.push($('strParam').value.split(";")[i]);
  else
  	param.push($('strParam').value);
  return param;	
}

function paramToStr()
{
	var param =  calculaParam();
	var paramStr = "";
	for (i=0;i<param.length;i++)
		paramStr = paramStr + "&" + param[i];
	return paramStr;
}

function valorCheckbox(){
 	for(i=0;i<document.getElementsByTagName("input").length;i++){
 		if(document.getElementsByTagName("input")[i].type == "checkbox"){
 			if(document.getElementsByTagName("input")[i].checked == true)
 				document.getElementsByTagName("input")[i].value = "1";
 		}
 	}
}
  
function limpiar()
{
 $('div_nuevo').style.display='none';
 $('div_query').style.display='none';
 $('div_header').style.display='none';
 $('container').style.display='none';
 $('placeholder').style.display='none';
 $('div_nuevo').innerHTML='';
 $('div_query').innerHTML='';
 $('div_header').innerHTML='';
 $('container').innerHTML='';
}

function limpiarNuevo()
{
 $('div_nuevo').style.display='none';
 $('div_nuevo').innerHTML='';	
}

//IE
function overIE(tipo){
if(document.getElementsByTagName) {
(function() {
var className = 'hovered',
pattern = new RegExp('(^|\\s+)' + className + '(\\s+|$)'),
rows = document.getElementsByTagName(tipo);

for(var i = 0, n = rows.length; i < n; ++i) {
rows[i].onmouseover = function() {
this.className += ' ' + className;
};
rows[i].onmouseout = function() {
this.className = this.className.replace(pattern, ' ');
};
}
rows = null;
})();
}

}