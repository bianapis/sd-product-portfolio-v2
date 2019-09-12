package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductPortfolioAnalysisUpdateInputModelProductPortfolioAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisUpdateOutputModel
 */
public class CRProductPortfolioAnalysisUpdateOutputModel   {
  private CRProductPortfolioAnalysisUpdateInputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord = null;

  private String productPortfolioAnalysisUpdateActionTaskReference = null;

  private Object productPortfolioAnalysisUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productPortfolioAnalysisUpdateActionTaskReference
  **/

  public String getProductPortfolioAnalysisUpdateActionTaskReference() {
    return productPortfolioAnalysisUpdateActionTaskReference;
  }

  public void setProductPortfolioAnalysisUpdateActionTaskReference(String productPortfolioAnalysisUpdateActionTaskReference) {
    this.productPortfolioAnalysisUpdateActionTaskReference = productPortfolioAnalysisUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

