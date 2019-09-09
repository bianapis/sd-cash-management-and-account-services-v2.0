package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord;
import org.bian.dto.BQServiceFeesExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsExecuteInputModel
 */
public class BQDepositsAndWithdrawalsExecuteInputModel   {
  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = null;

  private String depositsAndWithdrawalsInstanceReference = null;

  private BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord = null;

  private Object depositsAndWithdrawalsExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals instance 
   * @return depositsAndWithdrawalsInstanceReference
  **/

  public String getDepositsAndWithdrawalsInstanceReference() {
    return depositsAndWithdrawalsInstanceReference;
  }

  public void setDepositsAndWithdrawalsInstanceReference(String depositsAndWithdrawalsInstanceReference) {
    this.depositsAndWithdrawalsInstanceReference = depositsAndWithdrawalsInstanceReference;
  }


  /**
   * Get depositsAndWithdrawalsInstanceRecord
   * @return depositsAndWithdrawalsInstanceRecord
  **/

  public BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord getDepositsAndWithdrawalsInstanceRecord() {
    return depositsAndWithdrawalsInstanceRecord;
  }

  public void setDepositsAndWithdrawalsInstanceRecord(BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return depositsAndWithdrawalsExecuteActionTaskRecord
  **/

  public Object getDepositsAndWithdrawalsExecuteActionTaskRecord() {
    return depositsAndWithdrawalsExecuteActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsExecuteActionTaskRecord(Object depositsAndWithdrawalsExecuteActionTaskRecord) {
    this.depositsAndWithdrawalsExecuteActionTaskRecord = depositsAndWithdrawalsExecuteActionTaskRecord;
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

