/*******************************************************************************
 * Copyright (c) 2017 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 02:08:21 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Vendor types allow categorizing vendors in ways that are meaningful to the business. For example, one could set up vendor types so that they indicate a vendor's industry or geographic location. The categorization then can be used for reporting.
 * 
 * <p>Java class for VendorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="FullyQualifiedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorType", propOrder = {
    "name",
    "parentRef",
    "fullyQualifiedName",
    "active"
})
public class VendorType
    extends IntuitEntity
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ParentRef")
    protected ReferenceType parentRef;
    @XmlElement(name = "FullyQualifiedName")
    protected String fullyQualifiedName;
    @XmlElement(name = "Active")
    protected Boolean active;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setParentRef(ReferenceType value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the fullyQualifiedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Sets the value of the fullyQualifiedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullyQualifiedName(String value) {
        this.fullyQualifiedName = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VendorType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final VendorType that = ((VendorType) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            ReferenceType lhsParentRef;
            lhsParentRef = this.getParentRef();
            ReferenceType rhsParentRef;
            rhsParentRef = that.getParentRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentRef", lhsParentRef), LocatorUtils.property(thatLocator, "parentRef", rhsParentRef), lhsParentRef, rhsParentRef)) {
                return false;
            }
        }
        {
            String lhsFullyQualifiedName;
            lhsFullyQualifiedName = this.getFullyQualifiedName();
            String rhsFullyQualifiedName;
            rhsFullyQualifiedName = that.getFullyQualifiedName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullyQualifiedName", lhsFullyQualifiedName), LocatorUtils.property(thatLocator, "fullyQualifiedName", rhsFullyQualifiedName), lhsFullyQualifiedName, rhsFullyQualifiedName)) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            ReferenceType theParentRef;
            theParentRef = this.getParentRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentRef", theParentRef), currentHashCode, theParentRef);
        }
        {
            String theFullyQualifiedName;
            theFullyQualifiedName = this.getFullyQualifiedName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fullyQualifiedName", theFullyQualifiedName), currentHashCode, theFullyQualifiedName);
        }
        {
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
