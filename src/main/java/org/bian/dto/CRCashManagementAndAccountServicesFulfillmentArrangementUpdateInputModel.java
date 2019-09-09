package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementUpdateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCashManagementAndAccountServicesFulfillmentArrangementUpdateInputModel
 */
public class CRCashManagementAndAccountServicesFulfillmentArrangementUpdateInputModel   {
  private String cashManagementAndAccountServicesServicingSessionReference = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementUpdateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = null;

  private Object cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
  **/

  public CRCashManagementAndAccountServicesFulfillmentArrangementUpdateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord getCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord(CRCashManagementAndAccountServicesFulfillmentArrangementUpdateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord(Object cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord = cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

