package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioMakeup
 */
public class CRProductPortfolioAnalysisEvaluateInputModelProductPortfolioAnalysisInstanceRecordProductPortfolioMakeup   {
  private String productType = null;

  private String productTypeDefinition = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The product type within the portfolio analysis 
   * @return productType
  **/

  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Specific properties and characteristics of the product that provide context for the performance analysis 
   * @return productTypeDefinition
  **/

  public String getProductTypeDefinition() {
    return productTypeDefinition;
  }

  public void setProductTypeDefinition(String productTypeDefinition) {
    this.productTypeDefinition = productTypeDefinition;
  }


}

