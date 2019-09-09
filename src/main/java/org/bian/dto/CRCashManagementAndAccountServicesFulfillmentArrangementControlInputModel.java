package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementControlInputModelCashManagementAndAccountServicesFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCashManagementAndAccountServicesFulfillmentArrangementControlInputModel
 */
public class CRCashManagementAndAccountServicesFulfillmentArrangementControlInputModel   {
  private String cashManagementAndAccountServicesServicingSessionReference = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = null;

  private Object cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskRecord = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementControlInputModelCashManagementAndAccountServicesFulfillmentArrangementControlActionRequest cashManagementAndAccountServicesFulfillmentArrangementControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCashManagementAndAccountServicesFulfillmentArrangementControlActionTaskRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementControlActionTaskRecord(Object cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskRecord = cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * Get cashManagementAndAccountServicesFulfillmentArrangementControlActionRequest
   * @return cashManagementAndAccountServicesFulfillmentArrangementControlActionRequest
  **/

  public CRCashManagementAndAccountServicesFulfillmentArrangementControlInputModelCashManagementAndAccountServicesFulfillmentArrangementControlActionRequest getCashManagementAndAccountServicesFulfillmentArrangementControlActionRequest() {
    return cashManagementAndAccountServicesFulfillmentArrangementControlActionRequest;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementControlActionRequest(CRCashManagementAndAccountServicesFulfillmentArrangementControlInputModelCashManagementAndAccountServicesFulfillmentArrangementControlActionRequest cashManagementAndAccountServicesFulfillmentArrangementControlActionRequest) {
    this.cashManagementAndAccountServicesFulfillmentArrangementControlActionRequest = cashManagementAndAccountServicesFulfillmentArrangementControlActionRequest;
  }


}

