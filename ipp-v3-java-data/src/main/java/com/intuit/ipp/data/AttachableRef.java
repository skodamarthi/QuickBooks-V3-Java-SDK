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
// Generated on: 2017.07.10 at 10:56:50 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Describes the details of the attachable and provides information such as where they are referenced and custom fields.
 * 			
 * 
 * <p>Java class for AttachableRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachableRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="LineInfo" type="{http://schema.intuit.com/finance/v3}id" minOccurs="0"/>
 *         &lt;element name="IncludeOnSend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://schema.intuit.com/finance/v3}CustomField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttachableRefEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachableRef", propOrder = {
    "entityRef",
    "lineInfo",
    "includeOnSend",
    "customField",
    "attachableRefEx"
})
public class AttachableRef implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EntityRef")
    protected ReferenceType entityRef;
    @XmlElement(name = "LineInfo")
    protected String lineInfo;
    @XmlElement(name = "IncludeOnSend")
    protected Boolean includeOnSend;
    @XmlElement(name = "CustomField")
    protected List<CustomField> customField;
    @XmlElement(name = "AttachableRefEx")
    protected IntuitAnyType attachableRefEx;

    /**
     * Gets the value of the entityRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getEntityRef() {
        return entityRef;
    }

    /**
     * Sets the value of the entityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setEntityRef(ReferenceType value) {
        this.entityRef = value;
    }

    /**
     * Gets the value of the lineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineInfo() {
        return lineInfo;
    }

    /**
     * Sets the value of the lineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineInfo(String value) {
        this.lineInfo = value;
    }

    /**
     * Gets the value of the includeOnSend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOnSend() {
        return includeOnSend;
    }

    /**
     * Sets the value of the includeOnSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOnSend(Boolean value) {
        this.includeOnSend = value;
    }

    /**
     * Gets the value of the customField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomField() {
        if (customField == null) {
            customField = new ArrayList<CustomField>();
        }
        return this.customField;
    }

    /**
     * Gets the value of the attachableRefEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getAttachableRefEx() {
        return attachableRefEx;
    }

    /**
     * Sets the value of the attachableRefEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setAttachableRefEx(IntuitAnyType value) {
        this.attachableRefEx = value;
    }

    /**
     * Sets the value of the customField property.
     * 
     * @param customField
     *     allowed object is
     *     {@link CustomField }
     *     
     */
    public void setCustomField(List<CustomField> customField) {
        this.customField = customField;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AttachableRef that = ((AttachableRef) object);
        {
            ReferenceType lhsEntityRef;
            lhsEntityRef = this.getEntityRef();
            ReferenceType rhsEntityRef;
            rhsEntityRef = that.getEntityRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityRef", lhsEntityRef), LocatorUtils.property(thatLocator, "entityRef", rhsEntityRef), lhsEntityRef, rhsEntityRef, (this.entityRef!= null), (that.entityRef!= null))) {
                return false;
            }
        }
        {
            String lhsLineInfo;
            lhsLineInfo = this.getLineInfo();
            String rhsLineInfo;
            rhsLineInfo = that.getLineInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineInfo", lhsLineInfo), LocatorUtils.property(thatLocator, "lineInfo", rhsLineInfo), lhsLineInfo, rhsLineInfo, (this.lineInfo!= null), (that.lineInfo!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIncludeOnSend;
            lhsIncludeOnSend = this.isIncludeOnSend();
            Boolean rhsIncludeOnSend;
            rhsIncludeOnSend = that.isIncludeOnSend();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includeOnSend", lhsIncludeOnSend), LocatorUtils.property(thatLocator, "includeOnSend", rhsIncludeOnSend), lhsIncludeOnSend, rhsIncludeOnSend, (this.includeOnSend!= null), (that.includeOnSend!= null))) {
                return false;
            }
        }
        {
            List<CustomField> lhsCustomField;
            lhsCustomField = (((this.customField!= null)&&(!this.customField.isEmpty()))?this.getCustomField():null);
            List<CustomField> rhsCustomField;
            rhsCustomField = (((that.customField!= null)&&(!that.customField.isEmpty()))?that.getCustomField():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customField", lhsCustomField), LocatorUtils.property(thatLocator, "customField", rhsCustomField), lhsCustomField, rhsCustomField, ((this.customField!= null)&&(!this.customField.isEmpty())), ((that.customField!= null)&&(!that.customField.isEmpty())))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsAttachableRefEx;
            lhsAttachableRefEx = this.getAttachableRefEx();
            IntuitAnyType rhsAttachableRefEx;
            rhsAttachableRefEx = that.getAttachableRefEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachableRefEx", lhsAttachableRefEx), LocatorUtils.property(thatLocator, "attachableRefEx", rhsAttachableRefEx), lhsAttachableRefEx, rhsAttachableRefEx, (this.attachableRefEx!= null), (that.attachableRefEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            ReferenceType theEntityRef;
            theEntityRef = this.getEntityRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityRef", theEntityRef), currentHashCode, theEntityRef, (this.entityRef!= null));
        }
        {
            String theLineInfo;
            theLineInfo = this.getLineInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineInfo", theLineInfo), currentHashCode, theLineInfo, (this.lineInfo!= null));
        }
        {
            Boolean theIncludeOnSend;
            theIncludeOnSend = this.isIncludeOnSend();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includeOnSend", theIncludeOnSend), currentHashCode, theIncludeOnSend, (this.includeOnSend!= null));
        }
        {
            List<CustomField> theCustomField;
            theCustomField = (((this.customField!= null)&&(!this.customField.isEmpty()))?this.getCustomField():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customField", theCustomField), currentHashCode, theCustomField, ((this.customField!= null)&&(!this.customField.isEmpty())));
        }
        {
            IntuitAnyType theAttachableRefEx;
            theAttachableRefEx = this.getAttachableRefEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachableRefEx", theAttachableRefEx), currentHashCode, theAttachableRefEx, (this.attachableRefEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
