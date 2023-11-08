//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.11.04 a las 12:47:25 AM COT 
//


package www.Ws.emp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="factura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo_usuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cadena_rta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factura", propOrder = {
    "codigoUsuario",
    "cadenaRta"
})
public class Factura {

    @XmlElement(name = "codigo_usuario")
    protected int codigoUsuario;
    @XmlElement(name = "cadena_rta", required = true)
    protected String cadenaRta;

    /**
     * Obtiene el valor de la propiedad codigoUsuario.
     * 
     */
    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * Define el valor de la propiedad codigoUsuario.
     * 
     */
    public void setCodigoUsuario(int value) {
        this.codigoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad cadenaRta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadenaRta() {
        return cadenaRta;
    }

    /**
     * Define el valor de la propiedad cadenaRta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadenaRta(String value) {
        this.cadenaRta = value;
    }

}
