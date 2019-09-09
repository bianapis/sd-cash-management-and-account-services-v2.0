package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
 */
public class BQDepositsAndWithdrawalsInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord   {
  private BQDepositsAndWithdrawalsInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public BQDepositsAndWithdrawalsInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(BQDepositsAndWithdrawalsInitiateOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
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

