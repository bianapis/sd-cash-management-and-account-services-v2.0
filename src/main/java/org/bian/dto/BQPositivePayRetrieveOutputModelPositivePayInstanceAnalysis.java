package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositivePayRetrieveOutputModelPositivePayInstanceAnalysis
 */
public class BQPositivePayRetrieveOutputModelPositivePayInstanceAnalysis   {
  private Object positivePayInstanceAnalysisRecord = null;

  private String positivePayInstanceAnalysisReportType = null;

  private String positivePayInstanceAnalysisParameters = null;

  private Object positivePayInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return positivePayInstanceAnalysisRecord
  **/

  public Object getPositivePayInstanceAnalysisRecord() {
    return positivePayInstanceAnalysisRecord;
  }

  public void setPositivePayInstanceAnalysisRecord(Object positivePayInstanceAnalysisRecord) {
    this.positivePayInstanceAnalysisRecord = positivePayInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return positivePayInstanceAnalysisReportType
  **/

  public String getPositivePayInstanceAnalysisReportType() {
    return positivePayInstanceAnalysisReportType;
  }

  public void setPositivePayInstanceAnalysisReportType(String positivePayInstanceAnalysisReportType) {
    this.positivePayInstanceAnalysisReportType = positivePayInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return positivePayInstanceAnalysisParameters
  **/

  public String getPositivePayInstanceAnalysisParameters() {
    return positivePayInstanceAnalysisParameters;
  }

  public void setPositivePayInstanceAnalysisParameters(String positivePayInstanceAnalysisParameters) {
    this.positivePayInstanceAnalysisParameters = positivePayInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return positivePayInstanceAnalysisReport
  **/

  public Object getPositivePayInstanceAnalysisReport() {
    return positivePayInstanceAnalysisReport;
  }

  public void setPositivePayInstanceAnalysisReport(Object positivePayInstanceAnalysisReport) {
    this.positivePayInstanceAnalysisReport = positivePayInstanceAnalysisReport;
  }


}

