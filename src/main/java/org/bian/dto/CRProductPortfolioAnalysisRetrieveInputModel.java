package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceAnalysis;
import org.bian.dto.CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisRetrieveInputModel
 */
public class CRProductPortfolioAnalysisRetrieveInputModel   {
  private Object productPortfolioAnalysisRetrieveActionTaskRecord = null;

  private String productPortfolioAnalysisRetrieveActionRequest = null;

  private CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceReportRecord productPortfolioAnalysisInstanceReportRecord = null;

  private CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceAnalysis productPortfolioAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productPortfolioAnalysisRetrieveActionTaskRecord
  **/

  public Object getProductPortfolioAnalysisRetrieveActionTaskRecord() {
    return productPortfolioAnalysisRetrieveActionTaskRecord;
  }

  public void setProductPortfolioAnalysisRetrieveActionTaskRecord(Object productPortfolioAnalysisRetrieveActionTaskRecord) {
    this.productPortfolioAnalysisRetrieveActionTaskRecord = productPortfolioAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productPortfolioAnalysisRetrieveActionRequest
  **/

  public String getProductPortfolioAnalysisRetrieveActionRequest() {
    return productPortfolioAnalysisRetrieveActionRequest;
  }

  public void setProductPortfolioAnalysisRetrieveActionRequest(String productPortfolioAnalysisRetrieveActionRequest) {
    this.productPortfolioAnalysisRetrieveActionRequest = productPortfolioAnalysisRetrieveActionRequest;
  }


  /**
   * Get productPortfolioAnalysisInstanceReportRecord
   * @return productPortfolioAnalysisInstanceReportRecord
  **/

  public CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceReportRecord getProductPortfolioAnalysisInstanceReportRecord() {
    return productPortfolioAnalysisInstanceReportRecord;
  }

  public void setProductPortfolioAnalysisInstanceReportRecord(CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceReportRecord productPortfolioAnalysisInstanceReportRecord) {
    this.productPortfolioAnalysisInstanceReportRecord = productPortfolioAnalysisInstanceReportRecord;
  }


  /**
   * Get productPortfolioAnalysisInstanceAnalysis
   * @return productPortfolioAnalysisInstanceAnalysis
  **/

  public CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceAnalysis getProductPortfolioAnalysisInstanceAnalysis() {
    return productPortfolioAnalysisInstanceAnalysis;
  }

  public void setProductPortfolioAnalysisInstanceAnalysis(CRProductPortfolioAnalysisRetrieveInputModelProductPortfolioAnalysisInstanceAnalysis productPortfolioAnalysisInstanceAnalysis) {
    this.productPortfolioAnalysisInstanceAnalysis = productPortfolioAnalysisInstanceAnalysis;
  }


}

