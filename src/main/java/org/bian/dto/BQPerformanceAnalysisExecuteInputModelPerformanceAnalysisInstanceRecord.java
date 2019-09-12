package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecordProductPerformanceAnalysisTask;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecord
 */
public class BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecord   {
  private String productPerformanceAnalysisType = null;

  private BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecordProductPerformanceAnalysisTask productPerformanceAnalysisTask = null;


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

  public BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecordProductPerformanceAnalysisTask getProductPerformanceAnalysisTask() {
    return productPerformanceAnalysisTask;
  }

  public void setProductPerformanceAnalysisTask(BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecordProductPerformanceAnalysisTask productPerformanceAnalysisTask) {
    this.productPerformanceAnalysisTask = productPerformanceAnalysisTask;
  }


}

