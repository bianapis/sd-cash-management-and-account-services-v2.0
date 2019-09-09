package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModel
 */
public class CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModel   {
  private String cashManagementAndAccountServicesServicingSessionReference = null;

  private Object cashManagementAndAccountServicesFulfillmentArrangementInitiateActionRecord = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceStatus = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cashManagementAndAccountServicesServicingSessionReference
  **/

  public String getCashManagementAndAccountServicesServicingSessionReference() {
    return cashManagementAndAccountServicesServicingSessionReference;
  }

  public void setCashManagementAndAccountServicesServicingSessionReference(String cashManagementAndAccountServicesServicingSessionReference) {
    this.cashManagementAndAccountServicesServicingSessionReference = cashManagementAndAccountServicesServicingSessionReference;
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

  public CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord getCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord(CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }


}

