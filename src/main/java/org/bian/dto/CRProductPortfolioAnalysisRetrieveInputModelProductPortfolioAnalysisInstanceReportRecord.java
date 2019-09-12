package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceReportRecord
 */
public class CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceReportRecord   {
  private String productPortfolioAnalysisInstanceReportReference = null;

  private String productPortfolioAnalysisInstanceReportType = null;

  private String productPortfolioAnalysisInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productPortfolioAnalysisInstanceReportReference
  **/

  public String getProductPortfolioAnalysisInstanceReportReference() {
    return productPortfolioAnalysisInstanceReportReference;
  }

  public void setProductPortfolioAnalysisInstanceReportReference(String productPortfolioAnalysisInstanceReportReference) {
    this.productPortfolioAnalysisInstanceReportReference = productPortfolioAnalysisInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productPortfolioAnalysisInstanceReportParameters
  **/

  public String getProductPortfolioAnalysisInstanceReportParameters() {
    return productPortfolioAnalysisInstanceReportParameters;
  }

  public void setProductPortfolioAnalysisInstanceReportParameters(String productPortfolioAnalysisInstanceReportParameters) {
    this.productPortfolioAnalysisInstanceReportParameters = productPortfolioAnalysisInstanceReportParameters;
  }


}

