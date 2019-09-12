/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductPortfolioApiService {

	SDProductPortfolioActivateOutputModel activate(SDProductPortfolioActivateInputModel request);
	
	SDProductPortfolioConfigureOutputModel configure(String sdReferenceId, SDProductPortfolioConfigureInputModel request);
	
	CRProductPortfolioAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRProductPortfolioAnalysisEvaluateInputModel request);
	
	BQPerformanceAnalysisEvaluateOutputModel evaluatePerformanceanalysis(String sdReferenceId, String crReferenceId, BQPerformanceAnalysisEvaluateInputModel request);
	
	BQPerformanceAnalysisExchangeOutputModel exchangePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExchangeInputModel request);
	
	BQPerformanceAnalysisExecuteOutputModel executePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExecuteInputModel request);
	
	SDProductPortfolioFeedbackOutputModel feedback(String sdReferenceId, SDProductPortfolioFeedbackInputModel request);
	
	BQPerformanceAnalysisRequestOutputModel requestPerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisRequestInputModel request);
	
	CRProductPortfolioAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductPortfolioAnalysisRequestInputModel request);
	
	CRProductPortfolioAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQPerformanceAnalysisRetrieveOutputModel retrievePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProductPortfolioRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProductPortfolioAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductPortfolioAnalysisUpdateInputModel request);
	
	BQPerformanceAnalysisUpdateOutputModel updatePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisUpdateInputModel request);
	
}
