package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecordProductPerformanceAnalysisTask;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecord
 */
public class BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecord   {
  private String productPerformanceAnalysisType = null;

  private BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecordProductPerformanceAnalysisTask productPerformanceAnalysisTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of analysis/algorithm used to evaluate and compare the product performance to prevailing market measures 
   * @return productPerformanceAnalysisType
  **/

  public String getProductPerformanceAnalysisType() {
    return productPerformanceAnalysisType;
  }

  public void setProductPerformanceAnalysisType(String productPerformanceAnalysisType) {
    this.productPerformanceAnalysisType = productPerformanceAnalysisType;
  }


  /**
   * Get productPerformanceAnalysisTask
   * @return productPerformanceAnalysisTask
  **/

  public BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecordProductPerformanceAnalysisTask getProductPerformanceAnalysisTask() {
    return productPerformanceAnalysisTask;
  }

  public void setProductPerformanceAnalysisTask(BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecordProductPerformanceAnalysisTask productPerformanceAnalysisTask) {
    this.productPerformanceAnalysisTask = productPerformanceAnalysisTask;
  }


}

