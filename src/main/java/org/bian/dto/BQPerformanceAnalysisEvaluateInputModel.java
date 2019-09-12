package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisEvaluateInputModelPerformanceAnalysisInstanceRecord;
import org.bian.dto.BQPerformanceAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisEvaluateInputModel
 */
public class BQPerformanceAnalysisEvaluateInputModel   {
  private BQPerformanceAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord = null;

  private String productPortfolioAnalysisInstanceReference = null;

  private Object performanceAnalysisInitiateActionRecord = null;

  private BQPerformanceAnalysisEvaluateInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord = null;


  /**
   * Get productPortfolioAnalysisInstanceRecord
   * @return productPortfolioAnalysisInstanceRecord
  **/

  public BQPerformanceAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord getProductPortfolioAnalysisInstanceRecord() {
    return productPortfolioAnalysisInstanceRecord;
  }

  public void setProductPortfolioAnalysisInstanceRecord(BQPerformanceAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord) {
    this.productPortfolioAnalysisInstanceRecord = productPortfolioAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product Portfolio Analysis instance 
   * @return productPortfolioAnalysisInstanceReference
  **/

  public String getProductPortfolioAnalysisInstanceReference() {
    return productPortfolioAnalysisInstanceReference;
  }

  public void setProductPortfolioAnalysisInstanceReference(String productPortfolioAnalysisInstanceReference) {
    this.productPortfolioAnalysisInstanceReference = productPortfolioAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return performanceAnalysisInitiateActionRecord
  **/

  public Object getPerformanceAnalysisInitiateActionRecord() {
    return performanceAnalysisInitiateActionRecord;
  }

  public void setPerformanceAnalysisInitiateActionRecord(Object performanceAnalysisInitiateActionRecord) {
    this.performanceAnalysisInitiateActionRecord = performanceAnalysisInitiateActionRecord;
  }


  /**
   * Get performanceAnalysisInstanceRecord
   * @return performanceAnalysisInstanceRecord
  **/

  public BQPerformanceAnalysisEvaluateInputModelPerformanceAnalysisInstanceRecord getPerformanceAnalysisInstanceRecord() {
    return performanceAnalysisInstanceRecord;
  }

  public void setPerformanceAnalysisInstanceRecord(BQPerformanceAnalysisEvaluateInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord) {
    this.performanceAnalysisInstanceRecord = performanceAnalysisInstanceRecord;
  }


}

