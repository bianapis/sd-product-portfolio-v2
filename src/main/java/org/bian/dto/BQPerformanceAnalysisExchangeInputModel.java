package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisExchangeInputModelPerformanceAnalysisExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisExchangeInputModel
 */
public class BQPerformanceAnalysisExchangeInputModel   {
  private String productPortfolioAnalysisInstanceReference = null;

  private String performanceAnalysisInstanceReference = null;

  private Object performanceAnalysisExchangeActionTaskRecord = null;

  private BQPerformanceAnalysisExchangeInputModelPerformanceAnalysisExchangeActionRequest performanceAnalysisExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance Analysis instance 
   * @return performanceAnalysisInstanceReference
  **/

  public String getPerformanceAnalysisInstanceReference() {
    return performanceAnalysisInstanceReference;
  }

  public void setPerformanceAnalysisInstanceReference(String performanceAnalysisInstanceReference) {
    this.performanceAnalysisInstanceReference = performanceAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return performanceAnalysisExchangeActionTaskRecord
  **/

  public Object getPerformanceAnalysisExchangeActionTaskRecord() {
    return performanceAnalysisExchangeActionTaskRecord;
  }

  public void setPerformanceAnalysisExchangeActionTaskRecord(Object performanceAnalysisExchangeActionTaskRecord) {
    this.performanceAnalysisExchangeActionTaskRecord = performanceAnalysisExchangeActionTaskRecord;
  }


  /**
   * Get performanceAnalysisExchangeActionRequest
   * @return performanceAnalysisExchangeActionRequest
  **/

  public BQPerformanceAnalysisExchangeInputModelPerformanceAnalysisExchangeActionRequest getPerformanceAnalysisExchangeActionRequest() {
    return performanceAnalysisExchangeActionRequest;
  }

  public void setPerformanceAnalysisExchangeActionRequest(BQPerformanceAnalysisExchangeInputModelPerformanceAnalysisExchangeActionRequest performanceAnalysisExchangeActionRequest) {
    this.performanceAnalysisExchangeActionRequest = performanceAnalysisExchangeActionRequest;
  }


}

