package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioMakeup;
import org.bian.dto.CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecord
 */
public class CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecord   {
  private CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioMakeup productPortfolioMakeup = null;

  private String productPortfolioPerformanceGoals = null;

  private String productPortfolioAnalysisSchedule = null;

  private CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport productPortfolioAnalysisReport = null;


  /**
   * Get productPortfolioMakeup
   * @return productPortfolioMakeup
  **/

  public CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioMakeup getProductPortfolioMakeup() {
    return productPortfolioMakeup;
  }

  public void setProductPortfolioMakeup(CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioMakeup productPortfolioMakeup) {
    this.productPortfolioMakeup = productPortfolioMakeup;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the performance goals for products as defined by senior management functions (target/anticipated and actual as assessed). 
   * @return productPortfolioPerformanceGoals
  **/

  public String getProductPortfolioPerformanceGoals() {
    return productPortfolioPerformanceGoals;
  }

  public void setProductPortfolioPerformanceGoals(String productPortfolioPerformanceGoals) {
    this.productPortfolioPerformanceGoals = productPortfolioPerformanceGoals;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for performing product portfolio analysis for the enterprise or division 
   * @return productPortfolioAnalysisSchedule
  **/

  public String getProductPortfolioAnalysisSchedule() {
    return productPortfolioAnalysisSchedule;
  }

  public void setProductPortfolioAnalysisSchedule(String productPortfolioAnalysisSchedule) {
    this.productPortfolioAnalysisSchedule = productPortfolioAnalysisSchedule;
  }


  /**
   * Get productPortfolioAnalysisReport
   * @return productPortfolioAnalysisReport
  **/

  public CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport getProductPortfolioAnalysisReport() {
    return productPortfolioAnalysisReport;
  }

  public void setProductPortfolioAnalysisReport(CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport productPortfolioAnalysisReport) {
    this.productPortfolioAnalysisReport = productPortfolioAnalysisReport;
  }


}

