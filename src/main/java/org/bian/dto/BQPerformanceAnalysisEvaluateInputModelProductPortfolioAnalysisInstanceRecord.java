package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord
 */
public class BQPerformanceAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord   {
  private String productPortfolioAnalysisSchedule = null;

  private BQPerformanceAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport productPortfolioAnalysisReport = null;


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

  public BQPerformanceAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport getProductPortfolioAnalysisReport() {
    return productPortfolioAnalysisReport;
  }

  public void setProductPortfolioAnalysisReport(BQPerformanceAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport productPortfolioAnalysisReport) {
    this.productPortfolioAnalysisReport = productPortfolioAnalysisReport;
  }


}

