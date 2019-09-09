package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis
 */
public class CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysis   {
  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReference = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReportType = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReference() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReference(String cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReference) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReference = cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisParameters() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisParameters(String cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisParameters) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisParameters = cashManagementAndAccountServicesFulfillmentArrangementInstanceAnalysisParameters;
  }


}

