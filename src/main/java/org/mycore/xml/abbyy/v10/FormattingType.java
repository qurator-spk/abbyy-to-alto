//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.18 at 01:41:32 PM CEST 
//


package org.mycore.xml.abbyy.v10;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormattingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormattingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="charParams" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}CharParamsType"/>
 *           &lt;element name="wordRecVariants">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="wordRecVariant" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}WordRecognitionVariant" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="lang" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ff" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fs" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="bold" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="italic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="subscript" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="superscript" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="smallcaps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="underline" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="strikeout" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="scaling" type="{http://www.w3.org/2001/XMLSchema}integer" default="1000" />
 *       &lt;attribute name="spacing" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="base64encoded" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattingType", propOrder = {
    "content"
})
public class FormattingType {

    @XmlElementRefs({
        @XmlElementRef(name = "wordRecVariants", namespace = "http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "charParams", namespace = "http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "lang", required = true)
    protected String lang;
    @XmlAttribute(name = "ff")
    protected String ff;
    @XmlAttribute(name = "fs")
    protected Float fs;
    @XmlAttribute(name = "bold")
    protected Boolean bold;
    @XmlAttribute(name = "italic")
    protected Boolean italic;
    @XmlAttribute(name = "subscript")
    protected Boolean subscript;
    @XmlAttribute(name = "superscript")
    protected Boolean superscript;
    @XmlAttribute(name = "smallcaps")
    protected Boolean smallcaps;
    @XmlAttribute(name = "underline")
    protected Boolean underline;
    @XmlAttribute(name = "strikeout")
    protected Boolean strikeout;
    @XmlAttribute(name = "color")
    protected BigInteger color;
    @XmlAttribute(name = "scaling")
    protected BigInteger scaling;
    @XmlAttribute(name = "spacing")
    protected BigInteger spacing;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "base64encoded")
    protected Boolean base64Encoded;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FormattingType.WordRecVariants }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link CharParamsType }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the ff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFf() {
        return ff;
    }

    /**
     * Sets the value of the ff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFf(String value) {
        this.ff = value;
    }

    /**
     * Gets the value of the fs property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFs() {
        return fs;
    }

    /**
     * Sets the value of the fs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFs(Float value) {
        this.fs = value;
    }

    /**
     * Gets the value of the bold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBold() {
        if (bold == null) {
            return false;
        } else {
            return bold;
        }
    }

    /**
     * Sets the value of the bold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBold(Boolean value) {
        this.bold = value;
    }

    /**
     * Gets the value of the italic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isItalic() {
        if (italic == null) {
            return false;
        } else {
            return italic;
        }
    }

    /**
     * Sets the value of the italic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItalic(Boolean value) {
        this.italic = value;
    }

    /**
     * Gets the value of the subscript property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSubscript() {
        if (subscript == null) {
            return false;
        } else {
            return subscript;
        }
    }

    /**
     * Sets the value of the subscript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscript(Boolean value) {
        this.subscript = value;
    }

    /**
     * Gets the value of the superscript property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSuperscript() {
        if (superscript == null) {
            return false;
        } else {
            return superscript;
        }
    }

    /**
     * Sets the value of the superscript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuperscript(Boolean value) {
        this.superscript = value;
    }

    /**
     * Gets the value of the smallcaps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmallcaps() {
        if (smallcaps == null) {
            return false;
        } else {
            return smallcaps;
        }
    }

    /**
     * Sets the value of the smallcaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmallcaps(Boolean value) {
        this.smallcaps = value;
    }

    /**
     * Gets the value of the underline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnderline() {
        if (underline == null) {
            return false;
        } else {
            return underline;
        }
    }

    /**
     * Sets the value of the underline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderline(Boolean value) {
        this.underline = value;
    }

    /**
     * Gets the value of the strikeout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStrikeout() {
        if (strikeout == null) {
            return false;
        } else {
            return strikeout;
        }
    }

    /**
     * Sets the value of the strikeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrikeout(Boolean value) {
        this.strikeout = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColor() {
        if (color == null) {
            return new BigInteger("0");
        } else {
            return color;
        }
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColor(BigInteger value) {
        this.color = value;
    }

    /**
     * Gets the value of the scaling property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScaling() {
        if (scaling == null) {
            return new BigInteger("1000");
        } else {
            return scaling;
        }
    }

    /**
     * Sets the value of the scaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScaling(BigInteger value) {
        this.scaling = value;
    }

    /**
     * Gets the value of the spacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpacing() {
        if (spacing == null) {
            return new BigInteger("0");
        } else {
            return spacing;
        }
    }

    /**
     * Sets the value of the spacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpacing(BigInteger value) {
        this.spacing = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the base64Encoded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBase64Encoded() {
        if (base64Encoded == null) {
            return false;
        } else {
            return base64Encoded;
        }
    }

    /**
     * Sets the value of the base64Encoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBase64Encoded(Boolean value) {
        this.base64Encoded = value;
    }


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
     *         &lt;element name="wordRecVariant" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}WordRecognitionVariant" maxOccurs="unbounded" minOccurs="0"/>
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
        "wordRecVariant"
    })
    public static class WordRecVariants {

        protected List<WordRecognitionVariant> wordRecVariant;

        /**
         * Gets the value of the wordRecVariant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wordRecVariant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWordRecVariant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WordRecognitionVariant }
         * 
         * 
         */
        public List<WordRecognitionVariant> getWordRecVariant() {
            if (wordRecVariant == null) {
                wordRecVariant = new ArrayList<WordRecognitionVariant>();
            }
            return this.wordRecVariant;
        }

    }

}