package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPositivePayExecuteInputModelPositivePayInstanceRecord;
import org.bian.dto.BQServiceFeesExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQPositivePayExecuteInputModel
 */
public class BQPositivePayExecuteInputModel   {
  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = null;

  private String positivePayInstanceReference = null;

  private BQPositivePayExecuteInputModelPositivePayInstanceRecord positivePayInstanceRecord = null;

  private Object positivePayExecuteActionTaskRecord = null;

  private BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Positive Pay instance 
   * @return positivePayInstanceReference
  **/

  public String getPositivePayInstanceReference() {
    return positivePayInstanceReference;
  }

  public void setPositivePayInstanceReference(String positivePayInstanceReference) {
    this.positivePayInstanceReference = positivePayInstanceReference;
  }


  /**
   * Get positivePayInstanceRecord
   * @return positivePayInstanceRecord
  **/

  public BQPositivePayExecuteInputModelPositivePayInstanceRecord getPositivePayInstanceRecord() {
    return positivePayInstanceRecord;
  }

  public void setPositivePayInstanceRecord(BQPositivePayExecuteInputModelPositivePayInstanceRecord positivePayInstanceRecord) {
    this.positivePayInstanceRecord = positivePayInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return positivePayExecuteActionTaskRecord
  **/

  public Object getPositivePayExecuteActionTaskRecord() {
    return positivePayExecuteActionTaskRecord;
  }

  public void setPositivePayExecuteActionTaskRecord(Object positivePayExecuteActionTaskRecord) {
    this.positivePayExecuteActionTaskRecord = positivePayExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQServiceFeesExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

