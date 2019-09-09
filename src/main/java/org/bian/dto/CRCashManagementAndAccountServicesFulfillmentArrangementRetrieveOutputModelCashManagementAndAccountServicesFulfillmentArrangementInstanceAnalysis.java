package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis
 */
public class CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis   {
  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisData = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisData
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisData() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisData(String cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisData) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisData = cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReportType() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReportType(String cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReportType) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReportType = cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReport() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReport(Object cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReport) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReport = cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReport;
  }


}

