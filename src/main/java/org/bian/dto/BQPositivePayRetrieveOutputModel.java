package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPositivePayExecuteInputModelPositivePayInstanceRecord;
import org.bian.dto.BQPositivePayRetrieveOutputModelPositivePayInstanceAnalysis;
import org.bian.dto.BQPositivePayRetrieveOutputModelPositivePayInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPositivePayRetrieveOutputModel
 */
public class BQPositivePayRetrieveOutputModel   {
  private BQPositivePayExecuteInputModelPositivePayInstanceRecord positivePayInstanceRecord = null;

  private String positivePayRetrieveActionTaskReference = null;

  private Object positivePayRetrieveActionTaskRecord = null;

  private String positivePayRetrieveActionResponse = null;

  private BQPositivePayRetrieveOutputModelPositivePayInstanceReport positivePayInstanceReport = null;

  private BQPositivePayRetrieveOutputModelPositivePayInstanceAnalysis positivePayInstanceAnalysis = null;


  /**
   * Get positivePayInstanceRecord
   * @return positivePayInstanceRecord
  **/

  public BQPositivePayExecuteInputModelPositivePayInstanceRecord getPositivePayInstanceRecord() {
    return positivePayInstanceRecord;
  }

  public void setPositivePayInstanceRecord(BQPositivePayExecuteInputModelPositivePayInstanceRecord positivePayInstanceRecord) {
    this.positivePayInstanceRecord = positivePayInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Positive Pay instance retrieve service call 
   * @return positivePayRetrieveActionTaskReference
  **/

  public String getPositivePayRetrieveActionTaskReference() {
    return positivePayRetrieveActionTaskReference;
  }

  public void setPositivePayRetrieveActionTaskReference(String positivePayRetrieveActionTaskReference) {
    this.positivePayRetrieveActionTaskReference = positivePayRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return positivePayRetrieveActionResponse
  **/

  public String getPositivePayRetrieveActionResponse() {
    return positivePayRetrieveActionResponse;
  }

  public void setPositivePayRetrieveActionResponse(String positivePayRetrieveActionResponse) {
    this.positivePayRetrieveActionResponse = positivePayRetrieveActionResponse;
  }


  /**
   * Get positivePayInstanceReport
   * @return positivePayInstanceReport
  **/

  public BQPositivePayRetrieveOutputModelPositivePayInstanceReport getPositivePayInstanceReport() {
    return positivePayInstanceReport;
  }

  public void setPositivePayInstanceReport(BQPositivePayRetrieveOutputModelPositivePayInstanceReport positivePayInstanceReport) {
    this.positivePayInstanceReport = positivePayInstanceReport;
  }


  /**
   * Get positivePayInstanceAnalysis
   * @return positivePayInstanceAnalysis
  **/

  public BQPositivePayRetrieveOutputModelPositivePayInstanceAnalysis getPositivePayInstanceAnalysis() {
    return positivePayInstanceAnalysis;
  }

  public void setPositivePayInstanceAnalysis(BQPositivePayRetrieveOutputModelPositivePayInstanceAnalysis positivePayInstanceAnalysis) {
    this.positivePayInstanceAnalysis = positivePayInstanceAnalysis;
  }


}

