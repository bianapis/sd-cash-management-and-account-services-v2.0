package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordLinkedAccounts;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
 */
public class BQServiceFeesInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String cashManagementAndAccountServicesAccountNumber = null;

  private String accountType = null;

  private String accountCurrency = null;

  private String taxReference = null;

  private String restrictionOptionSetting = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cash Management And Account Services product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated Cash Management And Account Services account number in any suitable format (e.g. IBAN) 
   * @return cashManagementAndAccountServicesAccountNumber
  **/

  public String getCashManagementAndAccountServicesAccountNumber() {
    return cashManagementAndAccountServicesAccountNumber;
  }

  public void setCashManagementAndAccountServicesAccountNumber(String cashManagementAndAccountServicesAccountNumber) {
    this.cashManagementAndAccountServicesAccountNumber = cashManagementAndAccountServicesAccountNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of cash management and account services account (e.g. corporate, small business) 
   * @return accountType
  **/

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The primary account currency 
   * @return accountCurrency
  **/

  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  **/

  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }


  /**
   * Get linkedAccounts
   * @return linkedAccounts
  **/

  public CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordLinkedAccounts getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

