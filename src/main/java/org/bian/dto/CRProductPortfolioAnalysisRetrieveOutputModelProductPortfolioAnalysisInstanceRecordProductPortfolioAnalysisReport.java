package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport
 */
public class CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecordProductPortfolioAnalysisReport   {
  private String productAnalysisType = null;

  private String productAnalysisResult = null;

  private String productAnalysisReportingDate = null;

  private String documentDirectoryEntryInstanceReference = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The consolidated report of the performance evaluation and comparisons from the analysis 
   * @return productAnalysisResult
  **/

  public String getProductAnalysisResult() {
    return productAnalysisResult;
  }

  public void setProductAnalysisResult(String productAnalysisResult) {
    this.productAnalysisResult = productAnalysisResult;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated performance analysis reporting documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


}

