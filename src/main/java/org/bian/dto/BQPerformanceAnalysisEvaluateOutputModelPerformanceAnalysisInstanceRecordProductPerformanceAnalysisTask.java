package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecordProductPerformanceAnalysisTask
 */
public class BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecordProductPerformanceAnalysisTask   {
  private String productPerformanceRequestSpecification = null;

  private String productPerformanceModelReference = null;

  private Object productPerformanceProductServiceActivityReport = null;

  private Object productPerformanceFinancialMarketResearchReport = null;

  private String productPerformanceWorkProducts = null;

  private String productPerformanceRequestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific details of the performance analysis (can be a default/standard scheduled analysis or a specialist/ad-hoc request) 
   * @return productPerformanceRequestSpecification
  **/

  public String getProductPerformanceRequestSpecification() {
    return productPerformanceRequestSpecification;
  }

  public void setProductPerformanceRequestSpecification(String productPerformanceRequestSpecification) {
    this.productPerformanceRequestSpecification = productPerformanceRequestSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the performance analysis model used 
   * @return productPerformanceModelReference
  **/

  public String getProductPerformanceModelReference() {
    return productPerformanceModelReference;
  }

  public void setProductPerformanceModelReference(String productPerformanceModelReference) {
    this.productPerformanceModelReference = productPerformanceModelReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The data file, report of product related transaction details used in the analysis 
   * @return productPerformanceProductServiceActivityReport
  **/

  public Object getProductPerformanceProductServiceActivityReport() {
    return productPerformanceProductServiceActivityReport;
  }

  public void setProductPerformanceProductServiceActivityReport(Object productPerformanceProductServiceActivityReport) {
    this.productPerformanceProductServiceActivityReport = productPerformanceProductServiceActivityReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The content of selected financial market research report or market transaction database in any suitable form used for comparisons when appropriate 
   * @return productPerformanceFinancialMarketResearchReport
  **/

  public Object getProductPerformanceFinancialMarketResearchReport() {
    return productPerformanceFinancialMarketResearchReport;
  }

  public void setProductPerformanceFinancialMarketResearchReport(Object productPerformanceFinancialMarketResearchReport) {
    this.productPerformanceFinancialMarketResearchReport = productPerformanceFinancialMarketResearchReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return productPerformanceWorkProducts
  **/

  public String getProductPerformanceWorkProducts() {
    return productPerformanceWorkProducts;
  }

  public void setProductPerformanceWorkProducts(String productPerformanceWorkProducts) {
    this.productPerformanceWorkProducts = productPerformanceWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output from executing the selected product performance analysis  
   * @return productPerformanceRequestResult
  **/

  public String getProductPerformanceRequestResult() {
    return productPerformanceRequestResult;
  }

  public void setProductPerformanceRequestResult(String productPerformanceRequestResult) {
    this.productPerformanceRequestResult = productPerformanceRequestResult;
  }


}

