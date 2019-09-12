package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisEvaluateInputModel
 */
public class CRProductPortfolioAnalysisEvaluateInputModel   {
  private String productPortfolioServicingSessionReference = null;

  private Object productPortfolioAnalysisEvaluateActionRecord = null;

  private String productPortfolioAnalysisInstanceStatus = null;

  private CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productPortfolioServicingSessionReference
  **/

  public String getProductPortfolioServicingSessionReference() {
    return productPortfolioServicingSessionReference;
  }

  public void setProductPortfolioServicingSessionReference(String productPortfolioServicingSessionReference) {
    this.productPortfolioServicingSessionReference = productPortfolioServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return productPortfolioAnalysisEvaluateActionRecord
  **/

  public Object getProductPortfolioAnalysisEvaluateActionRecord() {
    return productPortfolioAnalysisEvaluateActionRecord;
  }

  public void setProductPortfolioAnalysisEvaluateActionRecord(Object productPortfolioAnalysisEvaluateActionRecord) {
    this.productPortfolioAnalysisEvaluateActionRecord = productPortfolioAnalysisEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product Portfolio Analysis instance (e.g. initialised, pending, active) 
   * @return productPortfolioAnalysisInstanceStatus
  **/

  public String getProductPortfolioAnalysisInstanceStatus() {
    return productPortfolioAnalysisInstanceStatus;
  }

  public void setProductPortfolioAnalysisInstanceStatus(String productPortfolioAnalysisInstanceStatus) {
    this.productPortfolioAnalysisInstanceStatus = productPortfolioAnalysisInstanceStatus;
  }


  /**
   * Get productPortfolioAnalysisInstanceRecord
   * @return productPortfolioAnalysisInstanceRecord
  **/

  public CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord getProductPortfolioAnalysisInstanceRecord() {
    return productPortfolioAnalysisInstanceRecord;
  }

  public void setProductPortfolioAnalysisInstanceRecord(CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord) {
    this.productPortfolioAnalysisInstanceRecord = productPortfolioAnalysisInstanceRecord;
  }


}

