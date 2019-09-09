package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPositivePayExecuteOutputModelPositivePayInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPositivePayExecuteOutputModel
 */
public class BQPositivePayExecuteOutputModel   {
  private BQPositivePayExecuteOutputModelPositivePayInstanceRecord positivePayInstanceRecord = null;

  private String positivePayExecuteActionTaskReference = null;

  private Object positivePayExecuteActionTaskRecord = null;

  private String positivePayExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get positivePayInstanceRecord
   * @return positivePayInstanceRecord
  **/

  public BQPositivePayExecuteOutputModelPositivePayInstanceRecord getPositivePayInstanceRecord() {
    return positivePayInstanceRecord;
  }

  public void setPositivePayInstanceRecord(BQPositivePayExecuteOutputModelPositivePayInstanceRecord positivePayInstanceRecord) {
    this.positivePayInstanceRecord = positivePayInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Positive Pay instance execute service call 
   * @return positivePayExecuteActionTaskReference
  **/

  public String getPositivePayExecuteActionTaskReference() {
    return positivePayExecuteActionTaskReference;
  }

  public void setPositivePayExecuteActionTaskReference(String positivePayExecuteActionTaskReference) {
    this.positivePayExecuteActionTaskReference = positivePayExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return positivePayExecuteActionTaskRecord
  **/

  public Object getPositivePayExecuteActionTaskRecord() {
    return positivePayExecuteActionTaskRecord;
  }

  public void setPositivePayExecuteActionTaskRecord(Object positivePayExecuteActionTaskRecord) {
    this.positivePayExecuteActionTaskRecord = positivePayExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Positive Pay execute transaction/record 
   * @return positivePayExecuteRecordReference
  **/

  public String getPositivePayExecuteRecordReference() {
    return positivePayExecuteRecordReference;
  }

  public void setPositivePayExecuteRecordReference(String positivePayExecuteRecordReference) {
    this.positivePayExecuteRecordReference = positivePayExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

