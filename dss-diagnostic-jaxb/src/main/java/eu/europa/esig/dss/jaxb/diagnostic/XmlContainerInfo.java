//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.12 at 10:48:08 AM CEST 
//


package eu.europa.esig.dss.jaxb.diagnostic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContainerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContainerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MimeTypeFilePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MimeTypeContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManifestFiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ManifestFile" type="{http://dss.esig.europa.eu/validation/diagnostic}ManifestFile" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContentFiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContentFile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerInfo", propOrder = {
    "containerType",
    "zipComment",
    "mimeTypeFilePresent",
    "mimeTypeContent",
    "manifestFiles",
    "contentFiles"
})
public class XmlContainerInfo {

    @XmlElement(name = "ContainerType")
    protected String containerType;
    @XmlElement(name = "ZipComment")
    protected String zipComment;
    @XmlElement(name = "MimeTypeFilePresent")
    protected Boolean mimeTypeFilePresent;
    @XmlElement(name = "MimeTypeContent")
    protected String mimeTypeContent;
    @XmlElementWrapper(name = "ManifestFiles")
    @XmlElement(name = "ManifestFile", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlManifestFile> manifestFiles;
    @XmlElementWrapper(name = "ContentFiles")
    @XmlElement(name = "ContentFile", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> contentFiles;

    /**
     * Gets the value of the containerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerType() {
        return containerType;
    }

    /**
     * Sets the value of the containerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerType(String value) {
        this.containerType = value;
    }

    /**
     * Gets the value of the zipComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipComment() {
        return zipComment;
    }

    /**
     * Sets the value of the zipComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipComment(String value) {
        this.zipComment = value;
    }

    /**
     * Gets the value of the mimeTypeFilePresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMimeTypeFilePresent() {
        return mimeTypeFilePresent;
    }

    /**
     * Sets the value of the mimeTypeFilePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMimeTypeFilePresent(Boolean value) {
        this.mimeTypeFilePresent = value;
    }

    /**
     * Gets the value of the mimeTypeContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeTypeContent() {
        return mimeTypeContent;
    }

    /**
     * Sets the value of the mimeTypeContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeTypeContent(String value) {
        this.mimeTypeContent = value;
    }

    public List<XmlManifestFile> getManifestFiles() {
        if (manifestFiles == null) {
            manifestFiles = new ArrayList<XmlManifestFile>();
        }
        return manifestFiles;
    }

    public void setManifestFiles(List<XmlManifestFile> manifestFiles) {
        this.manifestFiles = manifestFiles;
    }

    public List<String> getContentFiles() {
        if (contentFiles == null) {
            contentFiles = new ArrayList<String>();
        }
        return contentFiles;
    }

    public void setContentFiles(List<String> contentFiles) {
        this.contentFiles = contentFiles;
    }

}
