package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositivePayExecuteOutputModelPositivePayInstanceRecord
 */
public class BQPositivePayExecuteOutputModelPositivePayInstanceRecord   {
  private String positivePayCheckRegisterReportingSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule that defines when the corporate provides the list of issued checks for the bank to use to filter fraudulent checks 
   * @return positivePayCheckRegisterReportingSchedule
  **/

  public String getPositivePayCheckRegisterReportingSchedule() {
    return positivePayCheckRegisterReportingSchedule;
  }

  public void setPositivePayCheckRegisterReportingSchedule(String positivePayCheckRegisterReportingSchedule) {
    this.positivePayCheckRegisterReportingSchedule = positivePayCheckRegisterReportingSchedule;
  }


}

