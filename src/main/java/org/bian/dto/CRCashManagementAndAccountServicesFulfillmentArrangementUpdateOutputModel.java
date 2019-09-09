package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCashManagementAndAccountServicesFulfillmentArrangementUpdateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCashManagementAndAccountServicesFulfillmentArrangementUpdateOutputModel
 */
public class CRCashManagementAndAccountServicesFulfillmentArrangementUpdateOutputModel   {
  private CRCashManagementAndAccountServicesFulfillmentArrangementUpdateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = null;

  private String cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskReference = null;

  private Object cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
   * @return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord
  **/

  public CRCashManagementAndAccountServicesFulfillmentArrangementUpdateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord getCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord(CRCashManagementAndAccountServicesFulfillmentArrangementUpdateInputModelCashManagementAndAccountServicesFulfillmentArrangementInstanceRecord cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord = cashManagementAndAccountServicesFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getCashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskReference() {
    return cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskReference(String cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskReference) {
    this.cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskReference = cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord() {
    return cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord(Object cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord) {
    this.cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord = cashManagementAndAccountServicesFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

