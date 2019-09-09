package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsInitiateOutputModel
 */
public class BQDepositsAndWithdrawalsInitiateOutputModel   {
  private BQDepositsAndWithdrawalsInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = null;

  private String depositsAndWithdrawalsInstanceReference = null;

  private String depositsAndWithdrawalsInitiateActionReference = null;

  private Object depositsAndWithdrawalsInitiateActionRecord = null;

  private String depositsAndWithdrawalsInstanceStatus = null;


  /**
   * Get cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
  **/

  public BQDepositsAndWithdrawalsInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord getCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord(BQDepositsAndWithdrawalsInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return depositsAndWithdrawalsInitiateActionReference
  **/

  public String getDepositsAndWithdrawalsInitiateActionReference() {
    return depositsAndWithdrawalsInitiateActionReference;
  }

  public void setDepositsAndWithdrawalsInitiateActionReference(String depositsAndWithdrawalsInitiateActionReference) {
    this.depositsAndWithdrawalsInitiateActionReference = depositsAndWithdrawalsInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return depositsAndWithdrawalsInitiateActionRecord
  **/

  public Object getDepositsAndWithdrawalsInitiateActionRecord() {
    return depositsAndWithdrawalsInitiateActionRecord;
  }

  public void setDepositsAndWithdrawalsInitiateActionRecord(Object depositsAndWithdrawalsInitiateActionRecord) {
    this.depositsAndWithdrawalsInitiateActionRecord = depositsAndWithdrawalsInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Deposits And Withdrawals instance (e.g. initialised, pending, active) 
   * @return depositsAndWithdrawalsInstanceStatus
  **/

  public String getDepositsAndWithdrawalsInstanceStatus() {
    return depositsAndWithdrawalsInstanceStatus;
  }

  public void setDepositsAndWithdrawalsInstanceStatus(String depositsAndWithdrawalsInstanceStatus) {
    this.depositsAndWithdrawalsInstanceStatus = depositsAndWithdrawalsInstanceStatus;
  }


}

