package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositivePayExecuteInputModelPositivePayInstanceRecordCheckRegister
 */
public class BQPositivePayExecuteInputModelPositivePayInstanceRecordCheckRegister   {
  private String dateRange = null;

  private String checkDetails = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The date range covered by the list of checks 
   * @return dateRange
  **/

  public String getDateRange() {
    return dateRange;
  }

  public void setDateRange(String dateRange) {
    this.dateRange = dateRange;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The payment details for an issued check (used to cross check all submitted checks and filter fraud) 
   * @return checkDetails
  **/

  public String getCheckDetails() {
    return checkDetails;
  }

  public void setCheckDetails(String checkDetails) {
    this.checkDetails = checkDetails;
  }


}

