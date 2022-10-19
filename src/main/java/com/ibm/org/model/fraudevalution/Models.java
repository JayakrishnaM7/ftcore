package com.ibm.org.model.fraudevalution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Models
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:15.398Z[GMT]")

public class Models   {
  @JsonProperty("ModelsTestResult")
  private String modelsTestResult;

  @JsonProperty("ModelsTestWorkProduct")
  private String modelsTestWorkProduct;

  public Models modelsTestResult(String modelsTestResult) {
    this.modelsTestResult = modelsTestResult;
    return this;
  }

  /**
   * Get modelsTestResult
   * @return modelsTestResult
  */
  @ApiModelProperty(value = "")


  public String getModelsTestResult() {
    return modelsTestResult;
  }

  public void setModelsTestResult(String modelsTestResult) {
    this.modelsTestResult = modelsTestResult;
  }

  public Models modelsTestWorkProduct(String modelsTestWorkProduct) {
    this.modelsTestWorkProduct = modelsTestWorkProduct;
    return this;
  }

  /**
   * Get modelsTestWorkProduct
   * @return modelsTestWorkProduct
  */
  @ApiModelProperty(value = "")


  public String getModelsTestWorkProduct() {
    return modelsTestWorkProduct;
  }

  public void setModelsTestWorkProduct(String modelsTestWorkProduct) {
    this.modelsTestWorkProduct = modelsTestWorkProduct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Models models = (Models) o;
    return Objects.equals(this.modelsTestResult, models.modelsTestResult) &&
        Objects.equals(this.modelsTestWorkProduct, models.modelsTestWorkProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelsTestResult, modelsTestWorkProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Models {\n");
    
    sb.append("    modelsTestResult: ").append(toIndentedString(modelsTestResult)).append("\n");
    sb.append("    modelsTestWorkProduct: ").append(toIndentedString(modelsTestWorkProduct)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

