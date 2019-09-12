package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport
 */
public class CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport   {
  private String productAnalysisType = null;

  private String productAnalysisReportingDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines a type of performance analysis performed to products in the portfolio (e.g. scheduled review, specialized analysis, sensitivity assessment/projection) 
   * @return productAnalysisType
  **/

  public String getProductAnalysisType() {
    return productAnalysisType;
  }

  public void setProductAnalysisType(String productAnalysisType) {
    this.productAnalysisType = productAnalysisType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the performance report was completed 
   * @return productAnalysisReportingDate
  **/

  public String getProductAnalysisReportingDate() {
    return productAnalysisReportingDate;
  }

  public void setProductAnalysisReportingDate(String productAnalysisReportingDate) {
    this.productAnalysisReportingDate = productAnalysisReportingDate;
  }


}

