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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * QueryResponse entity describing the response of query
 * 
 * <p>Java class for BatchItemResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchItemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Warnings" type="{http://schema.intuit.com/finance/v3}Warnings" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://schema.intuit.com/finance/v3}IntuitObject"/>
 *           &lt;element name="Fault" type="{http://schema.intuit.com/finance/v3}Fault" minOccurs="0"/>
 *           &lt;element name="Report" type="{http://schema.intuit.com/finance/v3}Report" minOccurs="0"/>
 *           &lt;element name="QueryResponse" type="{http://schema.intuit.com/finance/v3}QueryResponse" minOccurs="0"/>
 *           &lt;element name="CDCResponse" type="{http://schema.intuit.com/finance/v3}CDCResponse" minOccurs="0"/>
 *           &lt;element name="CascadeResponse" type="{http://schema.intuit.com/finance/v3}CascadeResponse" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="bId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchItemResponse", propOrder = {
    "warnings",
    "intuitObject",
    "fault",
    "report",
    "queryResponse",
    "cdcResponse",
    "cascadeResponse"
})
public class BatchItemResponse implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Warnings")
    protected Warnings warnings;
    @XmlElementRef(name = "IntuitObject", namespace = "http://schema.intuit.com/finance/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends IntuitEntity> intuitObject;
    @XmlElement(name = "Fault")
    protected Fault fault;
    @XmlElement(name = "Report")
    protected Report report;
    @XmlElement(name = "QueryResponse")
    protected QueryResponse queryResponse;
    @XmlElement(name = "CDCResponse")
    protected CDCResponse cdcResponse;
    @XmlElement(name = "CascadeResponse")
    protected CascadeResponse cascadeResponse;
    @XmlAttribute(name = "bId")
    protected String bId;

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link Warnings }
     *     
     */
    public Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warnings }
     *     
     */
    public void setWarnings(Warnings value) {
        this.warnings = value;
    }

    /**
     * Any IntuitEntity derived object like Customer, Invoice can be part of response
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QbdtEntityIdMapping }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxService }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxAgency }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmailDeliveryInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}
     *     {@link JAXBElement }{@code <}{@link Status }{@code >}
     *     {@link JAXBElement }{@code <}{@link Attachable }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumberTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link Budget }{@code >}
     *     {@link JAXBElement }{@code <}{@link TDSMetadata }{@code >}
     *     {@link JAXBElement }{@code <}{@link Term }{@code >}
     *     {@link JAXBElement }{@code <}{@link Class }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxReturn }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link Preferences }{@code >}
     *     {@link JAXBElement }{@code <}{@link FixedAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     {@link JAXBElement }{@code <}{@link DateTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link Payment }{@code >}
     *     {@link JAXBElement }{@code <}{@link MasterAccount }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyCurrency }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bill }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReimburseCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     *     {@link JAXBElement }{@code <}{@link Company }{@code >}
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     *     {@link JAXBElement }{@code <}{@link Employee }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link SyncActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Estimate }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesRep }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserAlert }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     {@link JAXBElement }{@code <}{@link Department }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatementCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntuitEntity }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceLevel }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventorySite }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherName }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Purchase }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxRate }{@code >}
     *     
     */
    public JAXBElement<? extends IntuitEntity> getIntuitObject() {
        return intuitObject;
    }

    /**
     * Sets the value of the intuitObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QbdtEntityIdMapping }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxService }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxAgency }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmailDeliveryInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}
     *     {@link JAXBElement }{@code <}{@link Status }{@code >}
     *     {@link JAXBElement }{@code <}{@link Attachable }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumberTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link Budget }{@code >}
     *     {@link JAXBElement }{@code <}{@link TDSMetadata }{@code >}
     *     {@link JAXBElement }{@code <}{@link Term }{@code >}
     *     {@link JAXBElement }{@code <}{@link Class }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxReturn }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link Preferences }{@code >}
     *     {@link JAXBElement }{@code <}{@link FixedAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     {@link JAXBElement }{@code <}{@link DateTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link Payment }{@code >}
     *     {@link JAXBElement }{@code <}{@link MasterAccount }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyCurrency }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bill }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReimburseCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     *     {@link JAXBElement }{@code <}{@link Company }{@code >}
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     *     {@link JAXBElement }{@code <}{@link Employee }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link SyncActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Estimate }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesRep }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserAlert }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     {@link JAXBElement }{@code <}{@link Department }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatementCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntuitEntity }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceLevel }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventorySite }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherName }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Purchase }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxRate }{@code >}
     *     
     */
    public void setIntuitObject(JAXBElement<? extends IntuitEntity> value) {
        this.intuitObject = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setFault(Fault value) {
        this.fault = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link Report }
     *     
     */
    public Report getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link Report }
     *     
     */
    public void setReport(Report value) {
        this.report = value;
    }

    /**
     * Gets the value of the queryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResponse }
     *     
     */
    public QueryResponse getQueryResponse() {
        return queryResponse;
    }

    /**
     * Sets the value of the queryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResponse }
     *     
     */
    public void setQueryResponse(QueryResponse value) {
        this.queryResponse = value;
    }

    /**
     * Gets the value of the cdcResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CDCResponse }
     *     
     */
    public CDCResponse getCDCResponse() {
        return cdcResponse;
    }

    /**
     * Sets the value of the cdcResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDCResponse }
     *     
     */
    public void setCDCResponse(CDCResponse value) {
        this.cdcResponse = value;
    }

    /**
     * Gets the value of the cascadeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CascadeResponse }
     *     
     */
    public CascadeResponse getCascadeResponse() {
        return cascadeResponse;
    }

    /**
     * Sets the value of the cascadeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CascadeResponse }
     *     
     */
    public void setCascadeResponse(CascadeResponse value) {
        this.cascadeResponse = value;
    }

    /**
     * Gets the value of the bId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBId() {
        return bId;
    }

    /**
     * Sets the value of the bId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBId(String value) {
        this.bId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BatchItemResponse that = ((BatchItemResponse) object);
        {
            Warnings lhsWarnings;
            lhsWarnings = this.getWarnings();
            Warnings rhsWarnings;
            rhsWarnings = that.getWarnings();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warnings", lhsWarnings), LocatorUtils.property(thatLocator, "warnings", rhsWarnings), lhsWarnings, rhsWarnings, (this.warnings!= null), (that.warnings!= null))) {
                return false;
            }
        }
        {
            JAXBElement<? extends IntuitEntity> lhsIntuitObject;
            lhsIntuitObject = this.getIntuitObject();
            JAXBElement<? extends IntuitEntity> rhsIntuitObject;
            rhsIntuitObject = that.getIntuitObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intuitObject", lhsIntuitObject), LocatorUtils.property(thatLocator, "intuitObject", rhsIntuitObject), lhsIntuitObject, rhsIntuitObject, (this.intuitObject!= null), (that.intuitObject!= null))) {
                return false;
            }
        }
        {
            Fault lhsFault;
            lhsFault = this.getFault();
            Fault rhsFault;
            rhsFault = that.getFault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fault", lhsFault), LocatorUtils.property(thatLocator, "fault", rhsFault), lhsFault, rhsFault, (this.fault!= null), (that.fault!= null))) {
                return false;
            }
        }
        {
            Report lhsReport;
            lhsReport = this.getReport();
            Report rhsReport;
            rhsReport = that.getReport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "report", lhsReport), LocatorUtils.property(thatLocator, "report", rhsReport), lhsReport, rhsReport, (this.report!= null), (that.report!= null))) {
                return false;
            }
        }
        {
            QueryResponse lhsQueryResponse;
            lhsQueryResponse = this.getQueryResponse();
            QueryResponse rhsQueryResponse;
            rhsQueryResponse = that.getQueryResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryResponse", lhsQueryResponse), LocatorUtils.property(thatLocator, "queryResponse", rhsQueryResponse), lhsQueryResponse, rhsQueryResponse, (this.queryResponse!= null), (that.queryResponse!= null))) {
                return false;
            }
        }
        {
            CDCResponse lhsCDCResponse;
            lhsCDCResponse = this.getCDCResponse();
            CDCResponse rhsCDCResponse;
            rhsCDCResponse = that.getCDCResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdcResponse", lhsCDCResponse), LocatorUtils.property(thatLocator, "cdcResponse", rhsCDCResponse), lhsCDCResponse, rhsCDCResponse, (this.cdcResponse!= null), (that.cdcResponse!= null))) {
                return false;
            }
        }
        {
            CascadeResponse lhsCascadeResponse;
            lhsCascadeResponse = this.getCascadeResponse();
            CascadeResponse rhsCascadeResponse;
            rhsCascadeResponse = that.getCascadeResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cascadeResponse", lhsCascadeResponse), LocatorUtils.property(thatLocator, "cascadeResponse", rhsCascadeResponse), lhsCascadeResponse, rhsCascadeResponse, (this.cascadeResponse!= null), (that.cascadeResponse!= null))) {
                return false;
            }
        }
        {
            String lhsBId;
            lhsBId = this.getBId();
            String rhsBId;
            rhsBId = that.getBId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bId", lhsBId), LocatorUtils.property(thatLocator, "bId", rhsBId), lhsBId, rhsBId, (this.bId!= null), (that.bId!= null))) {
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
            Warnings theWarnings;
            theWarnings = this.getWarnings();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warnings", theWarnings), currentHashCode, theWarnings, (this.warnings!= null));
        }
        {
            JAXBElement<? extends IntuitEntity> theIntuitObject;
            theIntuitObject = this.getIntuitObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intuitObject", theIntuitObject), currentHashCode, theIntuitObject, (this.intuitObject!= null));
        }
        {
            Fault theFault;
            theFault = this.getFault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fault", theFault), currentHashCode, theFault, (this.fault!= null));
        }
        {
            Report theReport;
            theReport = this.getReport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "report", theReport), currentHashCode, theReport, (this.report!= null));
        }
        {
            QueryResponse theQueryResponse;
            theQueryResponse = this.getQueryResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryResponse", theQueryResponse), currentHashCode, theQueryResponse, (this.queryResponse!= null));
        }
        {
            CDCResponse theCDCResponse;
            theCDCResponse = this.getCDCResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdcResponse", theCDCResponse), currentHashCode, theCDCResponse, (this.cdcResponse!= null));
        }
        {
            CascadeResponse theCascadeResponse;
            theCascadeResponse = this.getCascadeResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cascadeResponse", theCascadeResponse), currentHashCode, theCascadeResponse, (this.cascadeResponse!= null));
        }
        {
            String theBId;
            theBId = this.getBId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bId", theBId), currentHashCode, theBId, (this.bId!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
