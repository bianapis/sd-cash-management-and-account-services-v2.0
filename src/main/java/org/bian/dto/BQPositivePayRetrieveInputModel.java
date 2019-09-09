package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPositivePayRetrieveInputModelPositivePayInstanceAnalysis;
import org.bian.dto.BQPositivePayRetrieveInputModelPositivePayInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPositivePayRetrieveInputModel
 */
public class BQPositivePayRetrieveInputModel   {
  private Object positivePayRetrieveActionTaskRecord = null;

  private String positivePayRetrieveActionRequest = null;

  private BQPositivePayRetrieveInputModelPositivePayInstanceReport positivePayInstanceReport = null;

  private BQPositivePayRetrieveInputModelPositivePayInstanceAnalysis positivePayInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return positivePayRetrieveActionTaskRecord
  **/

  public Object getPositivePayRetrieveActionTaskRecord() {
    return positivePayRetrieveActionTaskRecord;
  }

  public void setPositivePayRetrieveActionTaskRecord(Object positivePayRetrieveActionTaskRecord) {
    this.positivePayRetrieveActionTaskRecord = positivePayRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return positivePayRetrieveActionRequest
  **/

  public String getPositivePayRetrieveActionRequest() {
    return positivePayRetrieveActionRequest;
  }

  public void setPositivePayRetrieveActionRequest(String positivePayRetrieveActionRequest) {
    this.positivePayRetrieveActionRequest = positivePayRetrieveActionRequest;
  }


  /**
   * Get positivePayInstanceReport
   * @return positivePayInstanceReport
  **/

  public BQPositivePayRetrieveInputModelPositivePayInstanceReport getPositivePayInstanceReport() {
    return positivePayInstanceReport;
  }

  public void setPositivePayInstanceReport(BQPositivePayRetrieveInputModelPositivePayInstanceReport positivePayInstanceReport) {
    this.positivePayInstanceReport = positivePayInstanceReport;
  }


  /**
   * Get positivePayInstanceAnalysis
   * @return positivePayInstanceAnalysis
  **/

  public BQPositivePayRetrieveInputModelPositivePayInstanceAnalysis getPositivePayInstanceAnalysis() {
    return positivePayInstanceAnalysis;
  }

  public void setPositivePayInstanceAnalysis(BQPositivePayRetrieveInputModelPositivePayInstanceAnalysis positivePayInstanceAnalysis) {
    this.positivePayInstanceAnalysis = positivePayInstanceAnalysis;
  }


}

