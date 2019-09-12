package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductPortfolioAnalysisUpdateInputModelProductPortfolioAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisUpdateInputModel
 */
public class CRProductPortfolioAnalysisUpdateInputModel   {
  private String productPortfolioServicingSessionReference = null;

  private String productPortfolioAnalysisInstanceReference = null;

  private CRProductPortfolioAnalysisUpdateInputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord = null;

  private Object productPortfolioAnalysisUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get productPortfolioAnalysisInstanceRecord
   * @return productPortfolioAnalysisInstanceRecord
  **/

  public CRProductPortfolioAnalysisUpdateInputModelProductPortfolioAnalysisInstanceRecord getProductPortfolioAnalysisInstanceRecord() {
    return productPortfolioAnalysisInstanceRecord;
  }

  public void setProductPortfolioAnalysisInstanceRecord(CRProductPortfolioAnalysisUpdateInputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord) {
    this.productPortfolioAnalysisInstanceRecord = productPortfolioAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productPortfolioAnalysisUpdateActionTaskRecord
  **/

  public Object getProductPortfolioAnalysisUpdateActionTaskRecord() {
    return productPortfolioAnalysisUpdateActionTaskRecord;
  }

  public void setProductPortfolioAnalysisUpdateActionTaskRecord(Object productPortfolioAnalysisUpdateActionTaskRecord) {
    this.productPortfolioAnalysisUpdateActionTaskRecord = productPortfolioAnalysisUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

