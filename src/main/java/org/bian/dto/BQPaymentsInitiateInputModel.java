package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQPaymentsInitiateInputModelPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentsInitiateInputModel
 */
public class BQPaymentsInitiateInputModel   {
  private BQPaymentsInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = null;

  private Object paymentsInitiateActionRecord = null;

  private BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentsInstanceRecord = null;


  /**
   * Get cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
  **/

  public BQPaymentsInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord getCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord(BQPaymentsInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord) {
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
   * @return paymentsInitiateActionRecord
  **/

  public Object getPaymentsInitiateActionRecord() {
    return paymentsInitiateActionRecord;
  }

  public void setPaymentsInitiateActionRecord(Object paymentsInitiateActionRecord) {
    this.paymentsInitiateActionRecord = paymentsInitiateActionRecord;
  }


  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  **/

  public BQPaymentsInitiateInputModelPaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }


}

