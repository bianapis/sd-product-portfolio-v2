package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceAnalysis
 */
public class CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceAnalysis   {
  private String productPortfolioAnalysisInstanceAnalysisReference = null;

  private String productPortfolioAnalysisInstanceAnalysisReportType = null;

  private String productPortfolioAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productPortfolioAnalysisInstanceAnalysisReference
  **/

  public String getProductPortfolioAnalysisInstanceAnalysisReference() {
    return productPortfolioAnalysisInstanceAnalysisReference;
  }

  public void setProductPortfolioAnalysisInstanceAnalysisReference(String productPortfolioAnalysisInstanceAnalysisReference) {
    this.productPortfolioAnalysisInstanceAnalysisReference = productPortfolioAnalysisInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productPortfolioAnalysisInstanceAnalysisParameters
  **/

  public String getProductPortfolioAnalysisInstanceAnalysisParameters() {
    return productPortfolioAnalysisInstanceAnalysisParameters;
  }

  public void setProductPortfolioAnalysisInstanceAnalysisParameters(String productPortfolioAnalysisInstanceAnalysisParameters) {
    this.productPortfolioAnalysisInstanceAnalysisParameters = productPortfolioAnalysisInstanceAnalysisParameters;
  }


}

