package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQServiceFeesInitiateInputModelServiceFeesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateInputModel
 */
public class BQServiceFeesInitiateInputModel   {
  private BQServiceFeesInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = null;

  private Object serviceFeesInitiateActionRecord = null;

  private BQServiceFeesInitiateInputModelServiceFeesInstanceRecord serviceFeesInstanceRecord = null;


  /**
   * Get cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
  **/

  public BQServiceFeesInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord getCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord(BQServiceFeesInitiateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Cash Management And Account Services Fulfillment Arrangement instance 
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceReference
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementInstanceReference() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceReference;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceReference(String cashManagementAndAccountServicesFulfillmentArrangementInstanceReference) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceReference = cashManagementAndAccountServicesFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return serviceFeesInitiateActionRecord
  **/

  public Object getServiceFeesInitiateActionRecord() {
    return serviceFeesInitiateActionRecord;
  }

  public void setServiceFeesInitiateActionRecord(Object serviceFeesInitiateActionRecord) {
    this.serviceFeesInitiateActionRecord = serviceFeesInitiateActionRecord;
  }


  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  **/

  public BQServiceFeesInitiateInputModelServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(BQServiceFeesInitiateInputModelServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }


}

