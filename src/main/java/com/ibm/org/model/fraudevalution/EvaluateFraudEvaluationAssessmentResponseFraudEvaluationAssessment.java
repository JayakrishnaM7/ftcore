package com.ibm.org.model.fraudevalution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:15.398Z[GMT]")

public class EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment   {
  @JsonProperty("ProductProductionSessionReference")
  private Object productProductionSessionReference;

  @JsonProperty("FraudEvaluationTestProfile")
  private String fraudEvaluationTestProfile;

  @JsonProperty("FraudEvaluationEnsembleTechniqueType")
  private String fraudEvaluationEnsembleTechniqueType;

  @JsonProperty("FraudEvaluationEnsembleTechniqueDefinition")
  private String fraudEvaluationEnsembleTechniqueDefinition;

  @JsonProperty("FraudEvaluationProductionAnomalyRecord")
  private String fraudEvaluationProductionAnomalyRecord;

  @JsonProperty("FraudEvaluationProductionAnomalyProductionTransactionReference")
  private Object fraudEvaluationProductionAnomalyProductionTransactionReference;

  public EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment productProductionSessionReference(Object productProductionSessionReference) {
    this.productProductionSessionReference = productProductionSessionReference;
    return this;
  }

  /**
   * Get productProductionSessionReference
   * @return productProductionSessionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductProductionSessionReference() {
    return productProductionSessionReference;
  }

  public void setProductProductionSessionReference(Object productProductionSessionReference) {
    this.productProductionSessionReference = productProductionSessionReference;
  }

  public EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment fraudEvaluationTestProfile(String fraudEvaluationTestProfile) {
    this.fraudEvaluationTestProfile = fraudEvaluationTestProfile;
    return this;
  }

  /**
   * Get fraudEvaluationTestProfile
   * @return fraudEvaluationTestProfile
  */
  @ApiModelProperty(value = "")


  public String getFraudEvaluationTestProfile() {
    return fraudEvaluationTestProfile;
  }

  public void setFraudEvaluationTestProfile(String fraudEvaluationTestProfile) {
    this.fraudEvaluationTestProfile = fraudEvaluationTestProfile;
  }

  public EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment fraudEvaluationEnsembleTechniqueType(String fraudEvaluationEnsembleTechniqueType) {
    this.fraudEvaluationEnsembleTechniqueType = fraudEvaluationEnsembleTechniqueType;
    return this;
  }

  /**
   * Get fraudEvaluationEnsembleTechniqueType
   * @return fraudEvaluationEnsembleTechniqueType
  */
  @ApiModelProperty(value = "")


  public String getFraudEvaluationEnsembleTechniqueType() {
    return fraudEvaluationEnsembleTechniqueType;
  }

  public void setFraudEvaluationEnsembleTechniqueType(String fraudEvaluationEnsembleTechniqueType) {
    this.fraudEvaluationEnsembleTechniqueType = fraudEvaluationEnsembleTechniqueType;
  }

  public EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment fraudEvaluationEnsembleTechniqueDefinition(String fraudEvaluationEnsembleTechniqueDefinition) {
    this.fraudEvaluationEnsembleTechniqueDefinition = fraudEvaluationEnsembleTechniqueDefinition;
    return this;
  }

  /**
   * Get fraudEvaluationEnsembleTechniqueDefinition
   * @return fraudEvaluationEnsembleTechniqueDefinition
  */
  @ApiModelProperty(value = "")


  public String getFraudEvaluationEnsembleTechniqueDefinition() {
    return fraudEvaluationEnsembleTechniqueDefinition;
  }

  public void setFraudEvaluationEnsembleTechniqueDefinition(String fraudEvaluationEnsembleTechniqueDefinition) {
    this.fraudEvaluationEnsembleTechniqueDefinition = fraudEvaluationEnsembleTechniqueDefinition;
  }

  public EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment fraudEvaluationProductionAnomalyRecord(String fraudEvaluationProductionAnomalyRecord) {
    this.fraudEvaluationProductionAnomalyRecord = fraudEvaluationProductionAnomalyRecord;
    return this;
  }

  /**
   * Get fraudEvaluationProductionAnomalyRecord
   * @return fraudEvaluationProductionAnomalyRecord
  */
  @ApiModelProperty(value = "")


  public String getFraudEvaluationProductionAnomalyRecord() {
    return fraudEvaluationProductionAnomalyRecord;
  }

  public void setFraudEvaluationProductionAnomalyRecord(String fraudEvaluationProductionAnomalyRecord) {
    this.fraudEvaluationProductionAnomalyRecord = fraudEvaluationProductionAnomalyRecord;
  }

  public EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment fraudEvaluationProductionAnomalyProductionTransactionReference(Object fraudEvaluationProductionAnomalyProductionTransactionReference) {
    this.fraudEvaluationProductionAnomalyProductionTransactionReference = fraudEvaluationProductionAnomalyProductionTransactionReference;
    return this;
  }

  /**
   * Get fraudEvaluationProductionAnomalyProductionTransactionReference
   * @return fraudEvaluationProductionAnomalyProductionTransactionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getFraudEvaluationProductionAnomalyProductionTransactionReference() {
    return fraudEvaluationProductionAnomalyProductionTransactionReference;
  }

  public void setFraudEvaluationProductionAnomalyProductionTransactionReference(Object fraudEvaluationProductionAnomalyProductionTransactionReference) {
    this.fraudEvaluationProductionAnomalyProductionTransactionReference = fraudEvaluationProductionAnomalyProductionTransactionReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment evaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment = (EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment) o;
    return Objects.equals(this.productProductionSessionReference, evaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment.productProductionSessionReference) &&
        Objects.equals(this.fraudEvaluationTestProfile, evaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment.fraudEvaluationTestProfile) &&
        Objects.equals(this.fraudEvaluationEnsembleTechniqueType, evaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment.fraudEvaluationEnsembleTechniqueType) &&
        Objects.equals(this.fraudEvaluationEnsembleTechniqueDefinition, evaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment.fraudEvaluationEnsembleTechniqueDefinition) &&
        Objects.equals(this.fraudEvaluationProductionAnomalyRecord, evaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment.fraudEvaluationProductionAnomalyRecord) &&
        Objects.equals(this.fraudEvaluationProductionAnomalyProductionTransactionReference, evaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment.fraudEvaluationProductionAnomalyProductionTransactionReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productProductionSessionReference, fraudEvaluationTestProfile, fraudEvaluationEnsembleTechniqueType, fraudEvaluationEnsembleTechniqueDefinition, fraudEvaluationProductionAnomalyRecord, fraudEvaluationProductionAnomalyProductionTransactionReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateFraudEvaluationAssessmentResponseFraudEvaluationAssessment {\n");
    
    sb.append("    productProductionSessionReference: ").append(toIndentedString(productProductionSessionReference)).append("\n");
    sb.append("    fraudEvaluationTestProfile: ").append(toIndentedString(fraudEvaluationTestProfile)).append("\n");
    sb.append("    fraudEvaluationEnsembleTechniqueType: ").append(toIndentedString(fraudEvaluationEnsembleTechniqueType)).append("\n");
    sb.append("    fraudEvaluationEnsembleTechniqueDefinition: ").append(toIndentedString(fraudEvaluationEnsembleTechniqueDefinition)).append("\n");
    sb.append("    fraudEvaluationProductionAnomalyRecord: ").append(toIndentedString(fraudEvaluationProductionAnomalyRecord)).append("\n");
    sb.append("    fraudEvaluationProductionAnomalyProductionTransactionReference: ").append(toIndentedString(fraudEvaluationProductionAnomalyProductionTransactionReference)).append("\n");
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

