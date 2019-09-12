package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceReportRecord
 */
public class CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceReportRecord   {
  private String productPortfolioAnalysisInstanceReportData = null;

  private String productPortfolioAnalysisInstanceReportType = null;

  private Object productPortfolioAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productPortfolioAnalysisInstanceReportData
  **/

  public String getProductPortfolioAnalysisInstanceReportData() {
    return productPortfolioAnalysisInstanceReportData;
  }

  public void setProductPortfolioAnalysisInstanceReportData(String productPortfolioAnalysisInstanceReportData) {
    this.productPortfolioAnalysisInstanceReportData = productPortfolioAnalysisInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productPortfolioAnalysisInstanceReportType
  **/

  public String getProductPortfolioAnalysisInstanceReportType() {
    return productPortfolioAnalysisInstanceReportType;
  }

  public void setProductPortfolioAnalysisInstanceReportType(String productPortfolioAnalysisInstanceReportType) {
    this.productPortfolioAnalysisInstanceReportType = productPortfolioAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productPortfolioAnalysisInstanceReport
  **/

  public Object getProductPortfolioAnalysisInstanceReport() {
    return productPortfolioAnalysisInstanceReport;
  }

  public void setProductPortfolioAnalysisInstanceReport(Object productPortfolioAnalysisInstanceReport) {
    this.productPortfolioAnalysisInstanceReport = productPortfolioAnalysisInstanceReport;
  }


}

