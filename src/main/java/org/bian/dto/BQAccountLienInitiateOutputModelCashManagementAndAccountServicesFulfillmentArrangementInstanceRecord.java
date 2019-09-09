package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordLinkedAccounts;

import javax.validation.Valid;
  
/**
 * BQAccountLienInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
 */
public class BQAccountLienInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord   {
  private String entitlementOptionDefinition = null;

  private String restrictionOptionDefinition = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts = null;

  private BQAccountLienInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option 
   * @return entitlementOptionDefinition
  **/

  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option 
   * @return restrictionOptionDefinition
  **/

  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
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

  public BQAccountLienInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(BQAccountLienInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
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

