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
public class ProductPortfolioApiServiceImpl implements ProductPortfolioApiService {

	public SDProductPortfolioActivateOutputModel activate(SDProductPortfolioActivateInputModel request){
		return JsonReader.read("activate-SDProductPortfolioActivateOutputModel.json",new TypeReference<SDProductPortfolioActivateOutputModel>(){});
	}
	
	public SDProductPortfolioConfigureOutputModel configure(String sdReferenceId, SDProductPortfolioConfigureInputModel request){
		return JsonReader.read("configure-SDProductPortfolioConfigureOutputModel.json",new TypeReference<SDProductPortfolioConfigureOutputModel>(){});
	}
	
	public CRProductPortfolioAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRProductPortfolioAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-CRProductPortfolioAnalysisEvaluateOutputModel.json",new TypeReference<CRProductPortfolioAnalysisEvaluateOutputModel>(){});
	}
	
	public BQPerformanceAnalysisEvaluateOutputModel evaluatePerformanceanalysis(String sdReferenceId, String crReferenceId, BQPerformanceAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-BQPerformanceAnalysisEvaluateOutputModel.json",new TypeReference<BQPerformanceAnalysisEvaluateOutputModel>(){});
	}
	
	public BQPerformanceAnalysisExchangeOutputModel exchangePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExchangeInputModel request){
		return JsonReader.read("exchange-BQPerformanceAnalysisExchangeOutputModel.json",new TypeReference<BQPerformanceAnalysisExchangeOutputModel>(){});
	}
	
	public BQPerformanceAnalysisExecuteOutputModel executePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExecuteInputModel request){
		return JsonReader.read("execute-BQPerformanceAnalysisExecuteOutputModel.json",new TypeReference<BQPerformanceAnalysisExecuteOutputModel>(){});
	}
	
	public SDProductPortfolioFeedbackOutputModel feedback(String sdReferenceId, SDProductPortfolioFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductPortfolioFeedbackOutputModel.json",new TypeReference<SDProductPortfolioFeedbackOutputModel>(){});
	}
	
	public BQPerformanceAnalysisRequestOutputModel requestPerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisRequestInputModel request){
		return JsonReader.read("request-BQPerformanceAnalysisRequestOutputModel.json",new TypeReference<BQPerformanceAnalysisRequestOutputModel>(){});
	}
	
	public CRProductPortfolioAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductPortfolioAnalysisRequestInputModel request){
		return JsonReader.read("request-CRProductPortfolioAnalysisRequestOutputModel.json",new TypeReference<CRProductPortfolioAnalysisRequestOutputModel>(){});
	}
	
	public CRProductPortfolioAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductPortfolioAnalysisRetrieveOutputModel.json",new TypeReference<CRProductPortfolioAnalysisRetrieveOutputModel>(){});
	}
	
	public BQPerformanceAnalysisRetrieveOutputModel retrievePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPerformanceAnalysisRetrieveOutputModel.json",new TypeReference<BQPerformanceAnalysisRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProductPortfolioRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductPortfolioRetrieveOutputModel.json",new TypeReference<SDProductPortfolioRetrieveOutputModel>(){});
	}
	
	public CRProductPortfolioAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductPortfolioAnalysisUpdateInputModel request){
		return JsonReader.read("update-CRProductPortfolioAnalysisUpdateOutputModel.json",new TypeReference<CRProductPortfolioAnalysisUpdateOutputModel>(){});
	}
	
	public BQPerformanceAnalysisUpdateOutputModel updatePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisUpdateInputModel request){
		return JsonReader.read("update-BQPerformanceAnalysisUpdateOutputModel.json",new TypeReference<BQPerformanceAnalysisUpdateOutputModel>(){});
	}
	
}
