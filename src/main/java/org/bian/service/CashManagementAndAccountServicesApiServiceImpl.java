/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CashManagementAndAccountServicesApiServiceImpl implements CashManagementAndAccountServicesApiService {

	public SDCashManagementAndAccountServicesActivateOutputModel activate(SDCashManagementAndAccountServicesActivateInputModel request){
		return JsonReader.read("activate-SDCashManagementAndAccountServicesActivateOutputModel.json",new TypeReference<SDCashManagementAndAccountServicesActivateOutputModel>(){});
	}
	
	public SDCashManagementAndAccountServicesConfigureOutputModel configure(String sdReferenceId, SDCashManagementAndAccountServicesConfigureInputModel request){
		return JsonReader.read("configure-SDCashManagementAndAccountServicesConfigureOutputModel.json",new TypeReference<SDCashManagementAndAccountServicesConfigureOutputModel>(){});
	}
	
	public CRCashManagementAndAccountServicesFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCashManagementAndAccountServicesFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRCashManagementAndAccountServicesFulfillmentArrangementControlOutputModel.json",new TypeReference<CRCashManagementAndAccountServicesFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQAccountLienExchangeOutputModel exchangeAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienExchangeInputModel request){
		return JsonReader.read("exchange-BQAccountLienExchangeOutputModel.json",new TypeReference<BQAccountLienExchangeOutputModel>(){});
	}
	
	public BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request){
		return JsonReader.read("exchange-BQPaymentsExchangeOutputModel.json",new TypeReference<BQPaymentsExchangeOutputModel>(){});
	}
	
	public BQAccountSweepExecuteOutputModel executeAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepExecuteInputModel request){
		return JsonReader.read("execute-BQAccountSweepExecuteOutputModel.json",new TypeReference<BQAccountSweepExecuteOutputModel>(){});
	}
	
	public BQDepositsAndWithdrawalsExecuteOutputModel executeDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsAndWithdrawalsExecuteInputModel request){
		return JsonReader.read("execute-BQDepositsAndWithdrawalsExecuteOutputModel.json",new TypeReference<BQDepositsAndWithdrawalsExecuteOutputModel>(){});
	}
	
	public BQPaymentsExecuteOutputModel executePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExecuteInputModel request){
		return JsonReader.read("execute-BQPaymentsExecuteOutputModel.json",new TypeReference<BQPaymentsExecuteOutputModel>(){});
	}
	
	public BQPositivePayExecuteOutputModel executePositivepay(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPositivePayExecuteInputModel request){
		return JsonReader.read("execute-BQPositivePayExecuteOutputModel.json",new TypeReference<BQPositivePayExecuteOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public SDCashManagementAndAccountServicesFeedbackOutputModel feedback(String sdReferenceId, SDCashManagementAndAccountServicesFeedbackInputModel request){
		return JsonReader.read("feedback-SDCashManagementAndAccountServicesFeedbackOutputModel.json",new TypeReference<SDCashManagementAndAccountServicesFeedbackOutputModel>(){});
	}
	
	public CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCashManagementAndAccountServicesFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRCashManagementAndAccountServicesFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQAccountLienInitiateOutputModel initiateAccountlien(String sdReferenceId, String crReferenceId, BQAccountLienInitiateInputModel request){
		return JsonReader.read("initiate-BQAccountLienInitiateOutputModel.json",new TypeReference<BQAccountLienInitiateOutputModel>(){});
	}
	
	public BQAccountSweepInitiateOutputModel initiateAccountsweep(String sdReferenceId, String crReferenceId, BQAccountSweepInitiateInputModel request){
		return JsonReader.read("initiate-BQAccountSweepInitiateOutputModel.json",new TypeReference<BQAccountSweepInitiateOutputModel>(){});
	}
	
	public BQDepositsAndWithdrawalsInitiateOutputModel initiateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, BQDepositsAndWithdrawalsInitiateInputModel request){
		return JsonReader.read("initiate-BQDepositsAndWithdrawalsInitiateOutputModel.json",new TypeReference<BQDepositsAndWithdrawalsInitiateOutputModel>(){});
	}
	
	public BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request){
		return JsonReader.read("initiate-BQIssuedDeviceInitiateOutputModel.json",new TypeReference<BQIssuedDeviceInitiateOutputModel>(){});
	}
	
	public BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request){
		return JsonReader.read("initiate-BQPaymentsInitiateOutputModel.json",new TypeReference<BQPaymentsInitiateOutputModel>(){});
	}
	
	public BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request){
		return JsonReader.read("initiate-BQServiceFeesInitiateOutputModel.json",new TypeReference<BQServiceFeesInitiateOutputModel>(){});
	}
	
	public BQIssuedDeviceRequestOutputModel requestIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceRequestInputModel request){
		return JsonReader.read("request-BQIssuedDeviceRequestOutputModel.json",new TypeReference<BQIssuedDeviceRequestOutputModel>(){});
	}
	
	public CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRCashManagementAndAccountServicesFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAccountLienRetrieveOutputModel retrieveAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAccountLienRetrieveOutputModel.json",new TypeReference<BQAccountLienRetrieveOutputModel>(){});
	}
	
	public BQAccountSweepRetrieveOutputModel retrieveAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAccountSweepRetrieveOutputModel.json",new TypeReference<BQAccountSweepRetrieveOutputModel>(){});
	}
	
	public BQDepositsAndWithdrawalsRetrieveOutputModel retrieveDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDepositsAndWithdrawalsRetrieveOutputModel.json",new TypeReference<BQDepositsAndWithdrawalsRetrieveOutputModel>(){});
	}
	
	public BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInterestRetrieveOutputModel.json",new TypeReference<BQInterestRetrieveOutputModel>(){});
	}
	
	public BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQIssuedDeviceRetrieveOutputModel.json",new TypeReference<BQIssuedDeviceRetrieveOutputModel>(){});
	}
	
	public BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentsRetrieveOutputModel.json",new TypeReference<BQPaymentsRetrieveOutputModel>(){});
	}
	
	public BQPositivePayRetrieveOutputModel retrievePositivepay(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPositivePayRetrieveOutputModel.json",new TypeReference<BQPositivePayRetrieveOutputModel>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCashManagementAndAccountServicesRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCashManagementAndAccountServicesRetrieveOutputModel.json",new TypeReference<SDCashManagementAndAccountServicesRetrieveOutputModel>(){});
	}
	
	public CRCashManagementAndAccountServicesFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCashManagementAndAccountServicesFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRCashManagementAndAccountServicesFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRCashManagementAndAccountServicesFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQAccountLienUpdateOutputModel updateAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienUpdateInputModel request){
		return JsonReader.read("update-BQAccountLienUpdateOutputModel.json",new TypeReference<BQAccountLienUpdateOutputModel>(){});
	}
	
	public BQAccountSweepUpdateOutputModel updateAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepUpdateInputModel request){
		return JsonReader.read("update-BQAccountSweepUpdateOutputModel.json",new TypeReference<BQAccountSweepUpdateOutputModel>(){});
	}
	
	public BQDepositsAndWithdrawalsUpdateOutputModel updateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsAndWithdrawalsUpdateInputModel request){
		return JsonReader.read("update-BQDepositsAndWithdrawalsUpdateOutputModel.json",new TypeReference<BQDepositsAndWithdrawalsUpdateOutputModel>(){});
	}
	
	public BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request){
		return JsonReader.read("update-BQIssuedDeviceUpdateOutputModel.json",new TypeReference<BQIssuedDeviceUpdateOutputModel>(){});
	}
	
	public BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request){
		return JsonReader.read("update-BQPaymentsUpdateOutputModel.json",new TypeReference<BQPaymentsUpdateOutputModel>(){});
	}
	
}
