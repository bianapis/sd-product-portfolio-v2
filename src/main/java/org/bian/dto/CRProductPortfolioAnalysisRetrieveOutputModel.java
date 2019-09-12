package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceAnalysis;
import org.bian.dto.CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecord;
import org.bian.dto.CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisRetrieveOutputModel
 */
public class CRProductPortfolioAnalysisRetrieveOutputModel   {
  private CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord = null;

  private String productPortfolioAnalysisRetrieveActionTaskReference = null;

  private Object productPortfolioAnalysisRetrieveActionTaskRecord = null;

  private String productPortfolioAnalysisRetrieveActionResponse = null;

  private CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceReportRecord productPortfolioAnalysisInstanceReportRecord = null;

  private CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceAnalysis productPortfolioAnalysisInstanceAnalysis = null;


  /**
   * Get productPortfolioAnalysisInstanceRecord
   * @return productPortfolioAnalysisInstanceRecord
  **/

  public CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecord getProductPortfolioAnalysisInstanceRecord() {
    return productPortfolioAnalysisInstanceRecord;
  }

  public void setProductPortfolioAnalysisInstanceRecord(CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord) {
    this.productPortfolioAnalysisInstanceRecord = productPortfolioAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Portfolio Analysis instance retrieve service call 
   * @return productPortfolioAnalysisRetrieveActionTaskReference
  **/

  public String getProductPortfolioAnalysisRetrieveActionTaskReference() {
    return productPortfolioAnalysisRetrieveActionTaskReference;
  }

  public void setProductPortfolioAnalysisRetrieveActionTaskReference(String productPortfolioAnalysisRetrieveActionTaskReference) {
    this.productPortfolioAnalysisRetrieveActionTaskReference = productPortfolioAnalysisRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productPortfolioAnalysisRetrieveActionResponse
  **/

  public String getProductPortfolioAnalysisRetrieveActionResponse() {
    return productPortfolioAnalysisRetrieveActionResponse;
  }

  public void setProductPortfolioAnalysisRetrieveActionResponse(String productPortfolioAnalysisRetrieveActionResponse) {
    this.productPortfolioAnalysisRetrieveActionResponse = productPortfolioAnalysisRetrieveActionResponse;
  }


  /**
   * Get productPortfolioAnalysisInstanceReportRecord
   * @return productPortfolioAnalysisInstanceReportRecord
  **/

  public CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceReportRecord getProductPortfolioAnalysisInstanceReportRecord() {
    return productPortfolioAnalysisInstanceReportRecord;
  }

  public void setProductPortfolioAnalysisInstanceReportRecord(CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceReportRecord productPortfolioAnalysisInstanceReportRecord) {
    this.productPortfolioAnalysisInstanceReportRecord = productPortfolioAnalysisInstanceReportRecord;
  }


  /**
   * Get productPortfolioAnalysisInstanceAnalysis
   * @return productPortfolioAnalysisInstanceAnalysis
  **/

  public CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceAnalysis getProductPortfolioAnalysisInstanceAnalysis() {
    return productPortfolioAnalysisInstanceAnalysis;
  }

  public void setProductPortfolioAnalysisInstanceAnalysis(CRProductPortfolioAnalysisRetrieveOutputModelProductPortfolioAnalysisInstanceAnalysis productPortfolioAnalysisInstanceAnalysis) {
    this.productPortfolioAnalysisInstanceAnalysis = productPortfolioAnalysisInstanceAnalysis;
  }


}

