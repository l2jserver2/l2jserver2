//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.19 at 03:37:11 PM BRST 
//


package com.l2jserver.model.template;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="castle">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="siege">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="zone" type="{zones}ZoneType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = {
    "castle"
})
@XmlRootElement(name = "zones", namespace = "zones")
public class Zones {

    @XmlElement(required = true)
    protected Zones.Castle castle;

    /**
     * Gets the value of the castle property.
     * 
     * @return
     *     possible object is
     *     {@link Zones.Castle }
     *     
     */
    public Zones.Castle getCastle() {
        return castle;
    }

    /**
     * Sets the value of the castle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zones.Castle }
     *     
     */
    public void setCastle(Zones.Castle value) {
        this.castle = value;
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
     *         &lt;element name="siege">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="zone" type="{zones}ZoneType"/>
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
    @XmlType(name = "", propOrder = {
        "siege"
    })
    public static class Castle {

        @XmlElement(required = true)
        protected Zones.Castle.Siege siege;

        /**
         * Gets the value of the siege property.
         * 
         * @return
         *     possible object is
         *     {@link Zones.Castle.Siege }
         *     
         */
        public Zones.Castle.Siege getSiege() {
            return siege;
        }

        /**
         * Sets the value of the siege property.
         * 
         * @param value
         *     allowed object is
         *     {@link Zones.Castle.Siege }
         *     
         */
        public void setSiege(Zones.Castle.Siege value) {
            this.siege = value;
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
         *         &lt;element name="zone" type="{zones}ZoneType"/>
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
            "zone"
        })
        public static class Siege {

            @XmlElement(required = true)
            protected ZoneType zone;

            /**
             * Gets the value of the zone property.
             * 
             * @return
             *     possible object is
             *     {@link ZoneType }
             *     
             */
            public ZoneType getZone() {
                return zone;
            }

            /**
             * Sets the value of the zone property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZoneType }
             *     
             */
            public void setZone(ZoneType value) {
                this.zone = value;
            }

        }

    }

}
