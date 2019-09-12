package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord;
import org.bian.dto.CRProductPortfolioAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisRequestInputModel
 */
public class CRProductPortfolioAnalysisRequestInputModel   {
  private String productPortfolioServicingSessionReference = null;

  private String productPortfolioAnalysisInstanceReference = null;

  private CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord = null;

  private Object productPortfolioAnalysisRequestActionTaskRecord = null;

  private CRProductPortfolioAnalysisRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord getProductPortfolioAnalysisInstanceRecord() {
    return productPortfolioAnalysisInstanceRecord;
  }

  public void setProductPortfolioAnalysisInstanceRecord(CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecord productPortfolioAnalysisInstanceRecord) {
    this.productPortfolioAnalysisInstanceRecord = productPortfolioAnalysisInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductPortfolioAnalysisRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductPortfolioAnalysisRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

