package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord
 */
public class CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveOutputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceReportRecord   {
  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReportData = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReportType = null;

  private Object cashManagementAndAccountServicesFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceReportData
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceReportData() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceReportData;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceReportData(String cashManagementAndAccountServicesFulfillmentArrangementInstanceReportData) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceReportData = cashManagementAndAccountServicesFulfillmentArrangementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceReport
  **/

  public Object getCashManagementAndAccountServicesFulfillmentArrangementInstanceReport() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceReport;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceReport(Object cashManagementAndAccountServicesFulfillmentArrangementInstanceReport) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceReport = cashManagementAndAccountServicesFulfillmentArrangementInstanceReport;
  }


}

