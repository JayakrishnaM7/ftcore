package com.ibm.org.model.fraudevalution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RuleSetsandDecisionTrees
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:15.398Z[GMT]")

public class RuleSetsandDecisionTrees   {
  @JsonProperty("RuleSetsAndDecisionTreesTestResult")
  private String ruleSetsAndDecisionTreesTestResult;

  @JsonProperty("RuleSetsAndDecisionTreesTestWorkProduct")
  private String ruleSetsAndDecisionTreesTestWorkProduct;

  public RuleSetsandDecisionTrees ruleSetsAndDecisionTreesTestResult(String ruleSetsAndDecisionTreesTestResult) {
    this.ruleSetsAndDecisionTreesTestResult = ruleSetsAndDecisionTreesTestResult;
    return this;
  }

  /**
   * Get ruleSetsAndDecisionTreesTestResult
   * @return ruleSetsAndDecisionTreesTestResult
  */
  @ApiModelProperty(value = "")


  public String getRuleSetsAndDecisionTreesTestResult() {
    return ruleSetsAndDecisionTreesTestResult;
  }

  public void setRuleSetsAndDecisionTreesTestResult(String ruleSetsAndDecisionTreesTestResult) {
    this.ruleSetsAndDecisionTreesTestResult = ruleSetsAndDecisionTreesTestResult;
  }

  public RuleSetsandDecisionTrees ruleSetsAndDecisionTreesTestWorkProduct(String ruleSetsAndDecisionTreesTestWorkProduct) {
    this.ruleSetsAndDecisionTreesTestWorkProduct = ruleSetsAndDecisionTreesTestWorkProduct;
    return this;
  }

  /**
   * Get ruleSetsAndDecisionTreesTestWorkProduct
   * @return ruleSetsAndDecisionTreesTestWorkProduct
  */
  @ApiModelProperty(value = "")


  public String getRuleSetsAndDecisionTreesTestWorkProduct() {
    return ruleSetsAndDecisionTreesTestWorkProduct;
  }

  public void setRuleSetsAndDecisionTreesTestWorkProduct(String ruleSetsAndDecisionTreesTestWorkProduct) {
    this.ruleSetsAndDecisionTreesTestWorkProduct = ruleSetsAndDecisionTreesTestWorkProduct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleSetsandDecisionTrees ruleSetsandDecisionTrees = (RuleSetsandDecisionTrees) o;
    return Objects.equals(this.ruleSetsAndDecisionTreesTestResult, ruleSetsandDecisionTrees.ruleSetsAndDecisionTreesTestResult) &&
        Objects.equals(this.ruleSetsAndDecisionTreesTestWorkProduct, ruleSetsandDecisionTrees.ruleSetsAndDecisionTreesTestWorkProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleSetsAndDecisionTreesTestResult, ruleSetsAndDecisionTreesTestWorkProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSetsandDecisionTrees {\n");
    
    sb.append("    ruleSetsAndDecisionTreesTestResult: ").append(toIndentedString(ruleSetsAndDecisionTreesTestResult)).append("\n");
    sb.append("    ruleSetsAndDecisionTreesTestWorkProduct: ").append(toIndentedString(ruleSetsAndDecisionTreesTestWorkProduct)).append("\n");
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

