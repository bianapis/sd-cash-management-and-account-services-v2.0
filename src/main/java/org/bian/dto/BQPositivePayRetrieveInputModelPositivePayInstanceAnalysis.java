package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositivePayRetrieveInputModelPositivePayInstanceAnalysis
 */
public class BQPositivePayRetrieveInputModelPositivePayInstanceAnalysis   {
  private String positivePayInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return positivePayInstanceAnalysisReference
  **/

  public String getPositivePayInstanceAnalysisReference() {
    return positivePayInstanceAnalysisReference;
  }

  public void setPositivePayInstanceAnalysisReference(String positivePayInstanceAnalysisReference) {
    this.positivePayInstanceAnalysisReference = positivePayInstanceAnalysisReference;
  }


}

