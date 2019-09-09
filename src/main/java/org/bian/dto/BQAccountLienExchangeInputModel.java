package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienExchangeInputModelAccountLienExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAccountLienExchangeInputModel
 */
public class BQAccountLienExchangeInputModel   {
  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = null;

  private String accountLienInstanceReference = null;

  private Object accountLienExchangeActionTaskRecord = null;

  private BQAccountLienExchangeInputModelAccountLienExchangeActionRequest accountLienExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Lien instance 
   * @return accountLienInstanceReference
  **/

  public String getAccountLienInstanceReference() {
    return accountLienInstanceReference;
  }

  public void setAccountLienInstanceReference(String accountLienInstanceReference) {
    this.accountLienInstanceReference = accountLienInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return accountLienExchangeActionTaskRecord
  **/

  public Object getAccountLienExchangeActionTaskRecord() {
    return accountLienExchangeActionTaskRecord;
  }

  public void setAccountLienExchangeActionTaskRecord(Object accountLienExchangeActionTaskRecord) {
    this.accountLienExchangeActionTaskRecord = accountLienExchangeActionTaskRecord;
  }


  /**
   * Get accountLienExchangeActionRequest
   * @return accountLienExchangeActionRequest
  **/

  public BQAccountLienExchangeInputModelAccountLienExchangeActionRequest getAccountLienExchangeActionRequest() {
    return accountLienExchangeActionRequest;
  }

  public void setAccountLienExchangeActionRequest(BQAccountLienExchangeInputModelAccountLienExchangeActionRequest accountLienExchangeActionRequest) {
    this.accountLienExchangeActionRequest = accountLienExchangeActionRequest;
  }


}

