package net.idtoki.serteca.group;

import net.idtoki.serteca.model.FormaPagoPeer;
import net.idtoki.serteca.model.FormaPago;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Tue May 16 09:57:47 CEST 2006]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
public class FormaPagoGroupBean
    extends net.idtoki.serteca.group.BaseFormaPagoGroupBean
{
  public FormaPagoGroupBean(){
        this.dbField = FormaPagoPeer.ID;
        
//podemos fijar el numero de elementos por pagina recogiendo el entero de un archivo de configuracion
//this.setNumeroElementosPorPagina(int);
//si no se utiliza this.setNumeroElementosPorPagina(); el numero por defecto es 10

  }
}


