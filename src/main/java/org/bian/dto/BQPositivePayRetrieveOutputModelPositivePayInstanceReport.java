package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositivePayRetrieveOutputModelPositivePayInstanceReport
 */
public class BQPositivePayRetrieveOutputModelPositivePayInstanceReport   {
  private Object positivePayInstanceReportRecord = null;

  private String positivePayInstanceReportType = null;

  private String positivePayInstanceReportParameters = null;

  private Object positivePayInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return positivePayInstanceReportRecord
  **/

  public Object getPositivePayInstanceReportRecord() {
    return positivePayInstanceReportRecord;
  }

  public void setPositivePayInstanceReportRecord(Object positivePayInstanceReportRecord) {
    this.positivePayInstanceReportRecord = positivePayInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return positivePayInstanceReportType
  **/

  public String getPositivePayInstanceReportType() {
    return positivePayInstanceReportType;
  }

  public void setPositivePayInstanceReportType(String positivePayInstanceReportType) {
    this.positivePayInstanceReportType = positivePayInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return positivePayInstanceReportParameters
  **/

  public String getPositivePayInstanceReportParameters() {
    return positivePayInstanceReportParameters;
  }

  public void setPositivePayInstanceReportParameters(String positivePayInstanceReportParameters) {
    this.positivePayInstanceReportParameters = positivePayInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return positivePayInstanceReport
  **/

  public Object getPositivePayInstanceReport() {
    return positivePayInstanceReport;
  }

  public void setPositivePayInstanceReport(Object positivePayInstanceReport) {
    this.positivePayInstanceReport = positivePayInstanceReport;
  }


}

