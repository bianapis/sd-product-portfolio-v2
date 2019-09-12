package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductPortfolioAnalysisEvaluateOutputModelProductPortfolioAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisEvaluateOutputModel
 */
public class CRProductPortfolioAnalysisEvaluateOutputModel   {
  private String productPortfolioAnalysisInstanceReference = null;

  private String productPortfolioAnalysisEvaluateActionReference = null;

  private Object productPortfolioAnalysisEvaluateActionRecord = null;

  private String productPortfolioAnalysisInstanceStatus = null;

  private CRProductPortfolioAnalysisEvaluateOutputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Portfolio Analysis instance 
   * @return productPortfolioAnalysisInstanceReference
  **/

  public String getProductPortfolioAnalysisInstanceReference() {
    return productPortfolioAnalysisInstanceReference;
  }

  public void setProductPortfolioAnalysisInstanceReference(String productPortfolioAnalysisInstanceReference) {
    this.productPortfolioAnalysisInstanceReference = productPortfolioAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return productPortfolioAnalysisEvaluateActionReference
  **/

  public String getProductPortfolioAnalysisEvaluateActionReference() {
    return productPortfolioAnalysisEvaluateActionReference;
  }

  public void setProductPortfolioAnalysisEvaluateActionReference(String productPortfolioAnalysisEvaluateActionReference) {
    this.productPortfolioAnalysisEvaluateActionReference = productPortfolioAnalysisEvaluateActionReference;
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

  public CRProductPortfolioAnalysisEvaluateOutputModelProductPortfolioAnalysisInstanceRecord getProductPortfolioAnalysisInstanceRecord() {
    return productPortfolioAnalysisInstanceRecord;
  }

  public void setProductPortfolioAnalysisInstanceRecord(CRProductPortfolioAnalysisEvaluateOutputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord) {
    this.productPortfolioAnalysisInstanceRecord = productPortfolioAnalysisInstanceRecord;
  }


}

