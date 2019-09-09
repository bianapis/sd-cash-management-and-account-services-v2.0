package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModel
 */
public class CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModel   {
  private Object cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionRequest = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord = null;

  private CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getCashManagementAndAccountServicesFulfillmentArrangementRetrieveActionTaskRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementRetrieveActionTaskRecord(Object cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionTaskRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionTaskRecord = cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionRequest
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementRetrieveActionRequest() {
    return cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionRequest;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementRetrieveActionRequest(String cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionRequest) {
    this.cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionRequest = cashManagementAndAccountServicesFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get cashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord
  **/

  public CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord getCashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord(CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord = cashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis
  **/

  public CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis getCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis(CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis = cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis;
  }


}
