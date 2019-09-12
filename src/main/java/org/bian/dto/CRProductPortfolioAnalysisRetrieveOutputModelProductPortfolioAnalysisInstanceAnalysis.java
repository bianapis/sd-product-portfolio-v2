package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceAnalysis
 */
public class CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceAnalysis   {
  private String productPortfolioAnalysisInstanceAnalysisData = null;

  private String productPortfolioAnalysisInstanceAnalysisReportType = null;

  private Object productPortfolioAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productPortfolioAnalysisInstanceAnalysisData
  **/

  public String getProductPortfolioAnalysisInstanceAnalysisData() {
    return productPortfolioAnalysisInstanceAnalysisData;
  }

  public void setProductPortfolioAnalysisInstanceAnalysisData(String productPortfolioAnalysisInstanceAnalysisData) {
    this.productPortfolioAnalysisInstanceAnalysisData = productPortfolioAnalysisInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productPortfolioAnalysisInstanceAnalysisReportType
  **/

  public String getProductPortfolioAnalysisInstanceAnalysisReportType() {
    return productPortfolioAnalysisInstanceAnalysisReportType;
  }

  public void setProductPortfolioAnalysisInstanceAnalysisReportType(String productPortfolioAnalysisInstanceAnalysisReportType) {
    this.productPortfolioAnalysisInstanceAnalysisReportType = productPortfolioAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productPortfolioAnalysisInstanceAnalysisReport
  **/

  public Object getProductPortfolioAnalysisInstanceAnalysisReport() {
    return productPortfolioAnalysisInstanceAnalysisReport;
  }

  public void setProductPortfolioAnalysisInstanceAnalysisReport(Object productPortfolioAnalysisInstanceAnalysisReport) {
    this.productPortfolioAnalysisInstanceAnalysisReport = productPortfolioAnalysisInstanceAnalysisReport;
  }


}

