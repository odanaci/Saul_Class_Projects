//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.30 at 10:59:22 AM CET 
//


package be.liir.SpRL.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}URL"/>
 *         &lt;element ref="{}CP"/>
 *         &lt;element ref="{}TEXT"/>
 *         &lt;element ref="{}TAGS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "url",
    "cp",
    "text",
    "tags"
})
@XmlRootElement(name = "SpRL")
public class SpRL {

    @XmlElement(name = "URL", required = false)
    protected URL url;
    @XmlElement(name = "CP", required = false)
    protected CP cp;
    @XmlElement(name = "TEXT", required = true)
    protected TEXT text;
    @XmlElement(name = "TAGS", required = true)
    protected TAGS tags;
    
    @XmlTransient
    protected String filename;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link URL }
     *     
     */
    public URL getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link URL }
     *     
     */
    public void setURL(URL value) {
        this.url = value;
    }

    /**
     * Gets the value of the cp property.
     * 
     * @return
     *     possible object is
     *     {@link CP }
     *     
     */
    public CP getCP() {
        return cp;
    }

    /**
     * Sets the value of the cp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CP }
     *     
     */
    public void setCP(CP value) {
        this.cp = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link TEXT }
     *     
     */
    public TEXT getTEXT() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEXT }
     *     
     */
    public void setTEXT(TEXT value) {
        this.text = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link TAGS }
     *     
     */
    public TAGS getTAGS() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAGS }
     *     
     */
    public void setTAGS(TAGS value) {
        this.tags = value;
    }

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

}
