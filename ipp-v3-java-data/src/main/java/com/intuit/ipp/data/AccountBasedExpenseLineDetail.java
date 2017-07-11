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
import java.math.BigDecimal;
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
 * 				Description: Account based expense
 * 				detail for a transaction line.
 * 			
 * 
 * <p>Java class for AccountBasedExpenseLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountBasedExpenseLineDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="ClassRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="AccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="BillableStatus" type="{http://schema.intuit.com/finance/v3}BillableStatusEnum" minOccurs="0"/>
 *         &lt;element name="MarkupInfo" type="{http://schema.intuit.com/finance/v3}MarkupInfo" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="TaxInclusiveAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExpenseDetailLineDetailEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBasedExpenseLineDetail", propOrder = {
    "customerRef",
    "classRef",
    "accountRef",
    "billableStatus",
    "markupInfo",
    "taxAmount",
    "taxCodeRef",
    "taxInclusiveAmt",
    "expenseDetailLineDetailEx"
})
public class AccountBasedExpenseLineDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CustomerRef")
    protected ReferenceType customerRef;
    @XmlElement(name = "ClassRef")
    protected ReferenceType classRef;
    @XmlElement(name = "AccountRef")
    protected ReferenceType accountRef;
    @XmlElement(name = "BillableStatus")
    protected BillableStatusEnum billableStatus;
    @XmlElement(name = "MarkupInfo")
    protected MarkupInfo markupInfo;
    @XmlElement(name = "TaxAmount")
    protected BigDecimal taxAmount;
    @XmlElement(name = "TaxCodeRef")
    protected ReferenceType taxCodeRef;
    @XmlElement(name = "TaxInclusiveAmt")
    protected BigDecimal taxInclusiveAmt;
    @XmlElement(name = "ExpenseDetailLineDetailEx")
    protected IntuitAnyType expenseDetailLineDetailEx;

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCustomerRef(ReferenceType value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClassRef(ReferenceType value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAccountRef(ReferenceType value) {
        this.accountRef = value;
    }

    /**
     * Gets the value of the billableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillableStatusEnum }
     *     
     */
    public BillableStatusEnum getBillableStatus() {
        return billableStatus;
    }

    /**
     * Sets the value of the billableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillableStatusEnum }
     *     
     */
    public void setBillableStatus(BillableStatusEnum value) {
        this.billableStatus = value;
    }

    /**
     * Gets the value of the markupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MarkupInfo }
     *     
     */
    public MarkupInfo getMarkupInfo() {
        return markupInfo;
    }

    /**
     * Sets the value of the markupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkupInfo }
     *     
     */
    public void setMarkupInfo(MarkupInfo value) {
        this.markupInfo = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    /**
     * Sets the value of the taxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxCodeRef(ReferenceType value) {
        this.taxCodeRef = value;
    }

    /**
     * Gets the value of the taxInclusiveAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxInclusiveAmt() {
        return taxInclusiveAmt;
    }

    /**
     * Sets the value of the taxInclusiveAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxInclusiveAmt(BigDecimal value) {
        this.taxInclusiveAmt = value;
    }

    /**
     * Gets the value of the expenseDetailLineDetailEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getExpenseDetailLineDetailEx() {
        return expenseDetailLineDetailEx;
    }

    /**
     * Sets the value of the expenseDetailLineDetailEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setExpenseDetailLineDetailEx(IntuitAnyType value) {
        this.expenseDetailLineDetailEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AccountBasedExpenseLineDetail that = ((AccountBasedExpenseLineDetail) object);
        {
            ReferenceType lhsCustomerRef;
            lhsCustomerRef = this.getCustomerRef();
            ReferenceType rhsCustomerRef;
            rhsCustomerRef = that.getCustomerRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerRef", lhsCustomerRef), LocatorUtils.property(thatLocator, "customerRef", rhsCustomerRef), lhsCustomerRef, rhsCustomerRef, (this.customerRef!= null), (that.customerRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsClassRef;
            lhsClassRef = this.getClassRef();
            ReferenceType rhsClassRef;
            rhsClassRef = that.getClassRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classRef", lhsClassRef), LocatorUtils.property(thatLocator, "classRef", rhsClassRef), lhsClassRef, rhsClassRef, (this.classRef!= null), (that.classRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsAccountRef;
            lhsAccountRef = this.getAccountRef();
            ReferenceType rhsAccountRef;
            rhsAccountRef = that.getAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountRef", lhsAccountRef), LocatorUtils.property(thatLocator, "accountRef", rhsAccountRef), lhsAccountRef, rhsAccountRef, (this.accountRef!= null), (that.accountRef!= null))) {
                return false;
            }
        }
        {
            BillableStatusEnum lhsBillableStatus;
            lhsBillableStatus = this.getBillableStatus();
            BillableStatusEnum rhsBillableStatus;
            rhsBillableStatus = that.getBillableStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billableStatus", lhsBillableStatus), LocatorUtils.property(thatLocator, "billableStatus", rhsBillableStatus), lhsBillableStatus, rhsBillableStatus, (this.billableStatus!= null), (that.billableStatus!= null))) {
                return false;
            }
        }
        {
            MarkupInfo lhsMarkupInfo;
            lhsMarkupInfo = this.getMarkupInfo();
            MarkupInfo rhsMarkupInfo;
            rhsMarkupInfo = that.getMarkupInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markupInfo", lhsMarkupInfo), LocatorUtils.property(thatLocator, "markupInfo", rhsMarkupInfo), lhsMarkupInfo, rhsMarkupInfo, (this.markupInfo!= null), (that.markupInfo!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTaxAmount;
            lhsTaxAmount = this.getTaxAmount();
            BigDecimal rhsTaxAmount;
            rhsTaxAmount = that.getTaxAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxAmount", lhsTaxAmount), LocatorUtils.property(thatLocator, "taxAmount", rhsTaxAmount), lhsTaxAmount, rhsTaxAmount, (this.taxAmount!= null), (that.taxAmount!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxCodeRef;
            lhsTaxCodeRef = this.getTaxCodeRef();
            ReferenceType rhsTaxCodeRef;
            rhsTaxCodeRef = that.getTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxCodeRef", lhsTaxCodeRef), LocatorUtils.property(thatLocator, "taxCodeRef", rhsTaxCodeRef), lhsTaxCodeRef, rhsTaxCodeRef, (this.taxCodeRef!= null), (that.taxCodeRef!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTaxInclusiveAmt;
            lhsTaxInclusiveAmt = this.getTaxInclusiveAmt();
            BigDecimal rhsTaxInclusiveAmt;
            rhsTaxInclusiveAmt = that.getTaxInclusiveAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxInclusiveAmt", lhsTaxInclusiveAmt), LocatorUtils.property(thatLocator, "taxInclusiveAmt", rhsTaxInclusiveAmt), lhsTaxInclusiveAmt, rhsTaxInclusiveAmt, (this.taxInclusiveAmt!= null), (that.taxInclusiveAmt!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsExpenseDetailLineDetailEx;
            lhsExpenseDetailLineDetailEx = this.getExpenseDetailLineDetailEx();
            IntuitAnyType rhsExpenseDetailLineDetailEx;
            rhsExpenseDetailLineDetailEx = that.getExpenseDetailLineDetailEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expenseDetailLineDetailEx", lhsExpenseDetailLineDetailEx), LocatorUtils.property(thatLocator, "expenseDetailLineDetailEx", rhsExpenseDetailLineDetailEx), lhsExpenseDetailLineDetailEx, rhsExpenseDetailLineDetailEx, (this.expenseDetailLineDetailEx!= null), (that.expenseDetailLineDetailEx!= null))) {
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
            ReferenceType theCustomerRef;
            theCustomerRef = this.getCustomerRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerRef", theCustomerRef), currentHashCode, theCustomerRef, (this.customerRef!= null));
        }
        {
            ReferenceType theClassRef;
            theClassRef = this.getClassRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classRef", theClassRef), currentHashCode, theClassRef, (this.classRef!= null));
        }
        {
            ReferenceType theAccountRef;
            theAccountRef = this.getAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountRef", theAccountRef), currentHashCode, theAccountRef, (this.accountRef!= null));
        }
        {
            BillableStatusEnum theBillableStatus;
            theBillableStatus = this.getBillableStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billableStatus", theBillableStatus), currentHashCode, theBillableStatus, (this.billableStatus!= null));
        }
        {
            MarkupInfo theMarkupInfo;
            theMarkupInfo = this.getMarkupInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markupInfo", theMarkupInfo), currentHashCode, theMarkupInfo, (this.markupInfo!= null));
        }
        {
            BigDecimal theTaxAmount;
            theTaxAmount = this.getTaxAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxAmount", theTaxAmount), currentHashCode, theTaxAmount, (this.taxAmount!= null));
        }
        {
            ReferenceType theTaxCodeRef;
            theTaxCodeRef = this.getTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxCodeRef", theTaxCodeRef), currentHashCode, theTaxCodeRef, (this.taxCodeRef!= null));
        }
        {
            BigDecimal theTaxInclusiveAmt;
            theTaxInclusiveAmt = this.getTaxInclusiveAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxInclusiveAmt", theTaxInclusiveAmt), currentHashCode, theTaxInclusiveAmt, (this.taxInclusiveAmt!= null));
        }
        {
            IntuitAnyType theExpenseDetailLineDetailEx;
            theExpenseDetailLineDetailEx = this.getExpenseDetailLineDetailEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expenseDetailLineDetailEx", theExpenseDetailLineDetailEx), currentHashCode, theExpenseDetailLineDetailEx, (this.expenseDetailLineDetailEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
