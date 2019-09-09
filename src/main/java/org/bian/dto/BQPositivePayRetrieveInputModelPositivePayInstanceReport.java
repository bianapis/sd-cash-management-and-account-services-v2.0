package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositivePayRetrieveInputModelPositivePayInstanceReport
 */
public class BQPositivePayRetrieveInputModelPositivePayInstanceReport   {
  private String positivePayInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return positivePayInstanceReportReference
  **/

  public String getPositivePayInstanceReportReference() {
    return positivePayInstanceReportReference;
  }

  public void setPositivePayInstanceReportReference(String positivePayInstanceReportReference) {
    this.positivePayInstanceReportReference = positivePayInstanceReportReference;
  }


}

