package com.ibm.org.model.fraudevalution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.fraudevalution.EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateFraudEvaluationAssessmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:15.398Z[GMT]")

public class EvaluateFraudEvaluationAssessmentResponse   {
  @JsonProperty("FraudEvaluationAssessment")
  private EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment fraudEvaluationAssessment;

  public EvaluateFraudEvaluationAssessmentResponse fraudEvaluationAssessment(EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment fraudEvaluationAssessment) {
    this.fraudEvaluationAssessment = fraudEvaluationAssessment;
    return this;
  }

  /**
   * Get fraudEvaluationAssessment
   * @return fraudEvaluationAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment getFraudEvaluationAssessment() {
    return fraudEvaluationAssessment;
  }

  public void setFraudEvaluationAssessment(EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment fraudEvaluationAssessment) {
    this.fraudEvaluationAssessment = fraudEvaluationAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateFraudEvaluationAssessmentResponse evaluateFraudEvaluationAssessmentResponse = (EvaluateFraudEvaluationAssessmentResponse) o;
    return Objects.equals(this.fraudEvaluationAssessment, evaluateFraudEvaluationAssessmentResponse.fraudEvaluationAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudEvaluationAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateFraudEvaluationAssessmentResponse {\n");
    
    sb.append("    fraudEvaluationAssessment: ").append(toIndentedString(fraudEvaluationAssessment)).append("\n");
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

