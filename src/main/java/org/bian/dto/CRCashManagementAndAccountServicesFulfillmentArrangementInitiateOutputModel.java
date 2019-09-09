package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModel
 */
public class CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModel   {
  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInitiateActionReference = null;

  private Object cashManagementAndAccountServicesFulfillmentArrangementInitiateActionRecord = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceStatus = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cash Management And Account Services Fulfillment Arrangement instance 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceReference
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceReference() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceReference;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceReference(String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = cashManagementAndAccountServicesFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInitiateActionReference
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInitiateActionReference() {
    return cashManagementAndAccountServicesFulfillmentArrangementInitiateActionReference;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInitiateActionReference(String cashManagementAndAccountServicesFulfillmentArrangementInitiateActionReference) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInitiateActionReference = cashManagementAndAccountServicesFulfillmentArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInitiateActionRecord
  **/

  public Object getCashManagementAndAccountServicesFulfillmentArrangementInitiateActionRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementInitiateActionRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInitiateActionRecord(Object cashManagementAndAccountServicesFulfillmentArrangementInitiateActionRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInitiateActionRecord = cashManagementAndAccountServicesFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Cash Management And Account Services Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceStatus
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceStatus() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceStatus;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceStatus(String cashManagementAndAccountServicesFulfillmentArrangementInstanceStatus) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceStatus = cashManagementAndAccountServicesFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
  **/

  public CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord getCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord(CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }


}

