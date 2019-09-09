package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord
 */
public class CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord   {
  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReportReference = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReportType = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceReportReference
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceReportReference() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceReportReference;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceReportReference(String cashManagementAndAccountServicesFulfillmentArrangementInstanceReportReference) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceReportReference = cashManagementAndAccountServicesFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceReportType
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceReportType() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceReportType;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceReportType(String cashManagementAndAccountServicesFulfillmentArrangementInstanceReportType) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceReportType = cashManagementAndAccountServicesFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceReportParameters
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceReportParameters() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceReportParameters;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceReportParameters(String cashManagementAndAccountServicesFulfillmentArrangementInstanceReportParameters) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceReportParameters = cashManagementAndAccountServicesFulfillmentArrangementInstanceReportParameters;
  }


}

