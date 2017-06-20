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
import java.util.ArrayList;
import java.util.List;
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
 * 
 * 				Product: ALL
 * 				Description: Contains the details of an
 * 				inventory assembly item.
 * 			
 * 
 * <p>Java class for ItemAssemblyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemAssemblyDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemAssemblyLine" type="{http://schema.intuit.com/finance/v3}ItemComponentLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAssemblyDetail", propOrder = {
    "itemAssemblyLine"
})
public class ItemAssemblyDetail
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemAssemblyLine")
    protected List<ItemComponentLine> itemAssemblyLine;

    /**
     * Gets the value of the itemAssemblyLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemAssemblyLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemAssemblyLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemComponentLine }
     * 
     * 
     */
    public List<ItemComponentLine> getItemAssemblyLine() {
        if (itemAssemblyLine == null) {
            itemAssemblyLine = new ArrayList<ItemComponentLine>();
        }
        return this.itemAssemblyLine;
    }

    /**
     * Sets the value of the itemAssemblyLine property.
     * 
     * @param itemAssemblyLine
     *     allowed object is
     *     {@link ItemComponentLine }
     *     
     */
    public void setItemAssemblyLine(List<ItemComponentLine> itemAssemblyLine) {
        this.itemAssemblyLine = itemAssemblyLine;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ItemAssemblyDetail)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemAssemblyDetail that = ((ItemAssemblyDetail) object);
        {
            List<ItemComponentLine> lhsItemAssemblyLine;
            lhsItemAssemblyLine = (((this.itemAssemblyLine!= null)&&(!this.itemAssemblyLine.isEmpty()))?this.getItemAssemblyLine():null);
            List<ItemComponentLine> rhsItemAssemblyLine;
            rhsItemAssemblyLine = (((that.itemAssemblyLine!= null)&&(!that.itemAssemblyLine.isEmpty()))?that.getItemAssemblyLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemAssemblyLine", lhsItemAssemblyLine), LocatorUtils.property(thatLocator, "itemAssemblyLine", rhsItemAssemblyLine), lhsItemAssemblyLine, rhsItemAssemblyLine)) {
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
        int currentHashCode = 1;
        {
            List<ItemComponentLine> theItemAssemblyLine;
            theItemAssemblyLine = (((this.itemAssemblyLine!= null)&&(!this.itemAssemblyLine.isEmpty()))?this.getItemAssemblyLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemAssemblyLine", theItemAssemblyLine), currentHashCode, theItemAssemblyLine);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
