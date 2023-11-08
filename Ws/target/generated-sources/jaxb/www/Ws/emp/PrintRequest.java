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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo_usuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="instancia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codigoUsuario",
    "instancia"
})
@XmlRootElement(name = "printRequest")
public class PrintRequest {

    @XmlElement(name = "codigo_usuario")
    protected int codigoUsuario;
    @XmlElement(required = true)
    protected String instancia;

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
     * Obtiene el valor de la propiedad instancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstancia() {
        return instancia;
    }

    /**
     * Define el valor de la propiedad instancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstancia(String value) {
        this.instancia = value;
    }

}
