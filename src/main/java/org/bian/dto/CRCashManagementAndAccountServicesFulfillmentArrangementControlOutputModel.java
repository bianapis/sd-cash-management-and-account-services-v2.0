package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCashManagementAndAccountServicesFulfillmentArrangementControlOutputModel
 */
public class CRCashManagementAndAccountServicesFulfillmentArrangementControlOutputModel   {
  private String cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskReference = null;

  private Object cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskRecord = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cash Management And Account Services Fulfillment Arrangement instance control processing service call 
   * @return cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskReference
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementControlActionTaskReference() {
    return cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskReference;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementControlActionTaskReference(String cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskReference) {
    this.cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskReference = cashManagementAndAccountServicesFulfillmentArrangementControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return cashManagementAndAccountServicesFulfillmentArrangementControlActionResponse
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementControlActionResponse() {
    return cashManagementAndAccountServicesFulfillmentArrangementControlActionResponse;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementControlActionResponse(String cashManagementAndAccountServicesFulfillmentArrangementControlActionResponse) {
    this.cashManagementAndAccountServicesFulfillmentArrangementControlActionResponse = cashManagementAndAccountServicesFulfillmentArrangementControlActionResponse;
  }


}

