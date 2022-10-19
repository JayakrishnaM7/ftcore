package com.ibm.org.model.fraudevalution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.fraudevalution.EvaluateFraudEvaluationAssessmentRequestFraudEvaluationAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateFraudEvaluationAssessmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:15.398Z[GMT]")

public class EvaluateFraudEvaluationAssessmentRequest   {
  @JsonProperty("FraudEvaluationAssessment")
  private EvaluateFraudEvaluationAssessmentRequestFraudEvaluationAssessment fraudEvaluationAssessment;

  public EvaluateFraudEvaluationAssessmentRequest fraudEvaluationAssessment(EvaluateFraudEvaluationAssessmentRequestFraudEvaluationAssessment fraudEvaluationAssessment) {
    this.fraudEvaluationAssessment = fraudEvaluationAssessment;
    return this;
  }

  /**
   * Get fraudEvaluationAssessment
   * @return fraudEvaluationAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateFraudEvaluationAssessmentRequestFraudEvaluationAssessment getFraudEvaluationAssessment() {
    return fraudEvaluationAssessment;
  }

  public void setFraudEvaluationAssessment(EvaluateFraudEvaluationAssessmentRequestFraudEvaluationAssessment fraudEvaluationAssessment) {
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
    EvaluateFraudEvaluationAssessmentRequest evaluateFraudEvaluationAssessmentRequest = (EvaluateFraudEvaluationAssessmentRequest) o;
    return Objects.equals(this.fraudEvaluationAssessment, evaluateFraudEvaluationAssessmentRequest.fraudEvaluationAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudEvaluationAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateFraudEvaluationAssessmentRequest {\n");
    
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

