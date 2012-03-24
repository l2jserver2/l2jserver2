//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.19 at 03:37:11 PM BRST 
//


package com.l2jserver.model.template;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculatorFunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculatorFunction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="set" type="{}CalculatorFunctionOperation" minOccurs="0"/>
 *         &lt;element name="add" type="{}CalculatorFunctionOperation" minOccurs="0"/>
 *         &lt;element name="subtract" type="{}CalculatorFunctionOperation" minOccurs="0"/>
 *         &lt;element name="random" type="{}CalculatorFunctionOperation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculatorFunction", propOrder = {
    "set",
    "add",
    "subtract",
    "random"
})
public class CalculatorFunction {

    protected CalculatorFunctionOperation set;
    protected CalculatorFunctionOperation add;
    protected CalculatorFunctionOperation subtract;
    protected CalculatorFunctionOperation random;

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatorFunctionOperation }
     *     
     */
    public CalculatorFunctionOperation getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatorFunctionOperation }
     *     
     */
    public void setSet(CalculatorFunctionOperation value) {
        this.set = value;
    }

    /**
     * Gets the value of the add property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatorFunctionOperation }
     *     
     */
    public CalculatorFunctionOperation getAdd() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatorFunctionOperation }
     *     
     */
    public void setAdd(CalculatorFunctionOperation value) {
        this.add = value;
    }

    /**
     * Gets the value of the subtract property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatorFunctionOperation }
     *     
     */
    public CalculatorFunctionOperation getSubtract() {
        return subtract;
    }

    /**
     * Sets the value of the subtract property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatorFunctionOperation }
     *     
     */
    public void setSubtract(CalculatorFunctionOperation value) {
        this.subtract = value;
    }

    /**
     * Gets the value of the random property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatorFunctionOperation }
     *     
     */
    public CalculatorFunctionOperation getRandom() {
        return random;
    }

    /**
     * Sets the value of the random property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatorFunctionOperation }
     *     
     */
    public void setRandom(CalculatorFunctionOperation value) {
        this.random = value;
    }

}
