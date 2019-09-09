package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateInputModel
 */
public class BQIssuedDeviceInitiateInputModel   {
  private BQIssuedDeviceInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = null;

  private Object issuedDeviceInitiateActionRecord = null;

  private BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord = null;


  /**
   * Get cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
  **/

  public BQIssuedDeviceInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord getCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord(BQIssuedDeviceInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Cash Management And Account Services Fulfillment Arrangement instance 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceReference
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceReference() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceReference;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceReference(String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = cashManagementAndAccountServicesFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return issuedDeviceInitiateActionRecord
  **/

  public Object getIssuedDeviceInitiateActionRecord() {
    return issuedDeviceInitiateActionRecord;
  }

  public void setIssuedDeviceInitiateActionRecord(Object issuedDeviceInitiateActionRecord) {
    this.issuedDeviceInitiateActionRecord = issuedDeviceInitiateActionRecord;
  }


  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  **/

  public BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }


}

