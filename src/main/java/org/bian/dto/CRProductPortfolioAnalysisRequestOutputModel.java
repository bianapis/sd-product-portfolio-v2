package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductPortfolioAnalysisRequestOutputModelProductPortfolioAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisRequestOutputModel
 */
public class CRProductPortfolioAnalysisRequestOutputModel   {
  private CRProductPortfolioAnalysisRequestOutputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord = null;

  private String productPortfolioAnalysisRequestActionTaskReference = null;

  private Object productPortfolioAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get productPortfolioAnalysisInstanceRecord
   * @return productPortfolioAnalysisInstanceRecord
  **/

  public CRProductPortfolioAnalysisRequestOutputModelProductPortfolioAnalysisInstanceRecord getProductPortfolioAnalysisInstanceRecord() {
    return productPortfolioAnalysisInstanceRecord;
  }

  public void setProductPortfolioAnalysisInstanceRecord(CRProductPortfolioAnalysisRequestOutputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord) {
    this.productPortfolioAnalysisInstanceRecord = productPortfolioAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Portfolio Analysis instance request service call 
   * @return productPortfolioAnalysisRequestActionTaskReference
  **/

  public String getProductPortfolioAnalysisRequestActionTaskReference() {
    return productPortfolioAnalysisRequestActionTaskReference;
  }

  public void setProductPortfolioAnalysisRequestActionTaskReference(String productPortfolioAnalysisRequestActionTaskReference) {
    this.productPortfolioAnalysisRequestActionTaskReference = productPortfolioAnalysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productPortfolioAnalysisRequestActionTaskRecord
  **/

  public Object getProductPortfolioAnalysisRequestActionTaskRecord() {
    return productPortfolioAnalysisRequestActionTaskRecord;
  }

  public void setProductPortfolioAnalysisRequestActionTaskRecord(Object productPortfolioAnalysisRequestActionTaskRecord) {
    this.productPortfolioAnalysisRequestActionTaskRecord = productPortfolioAnalysisRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

