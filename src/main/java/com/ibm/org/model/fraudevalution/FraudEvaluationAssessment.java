package com.ibm.org.model.fraudevalution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FraudEvaluationAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:15.398Z[GMT]")

public class FraudEvaluationAssessment   {
  @JsonProperty("ProductProductionSessionReference")
  private Object productProductionSessionReference;

  @JsonProperty("FraudEvaluationTestProfile")
  private String fraudEvaluationTestProfile;

  @JsonProperty("FraudEvaluationEnsembleTechniqueType")
  private String fraudEvaluationEnsembleTechniqueType;

  @JsonProperty("FraudEvaluationEnsembleTechniqueDefinition")
  private String fraudEvaluationEnsembleTechniqueDefinition;

  @JsonProperty("FraudEvaluationTransactionConsolidationRecord")
  private String fraudEvaluationTransactionConsolidationRecord;

  @JsonProperty("FraudEvaluationProductionAnomalyRecord")
  private String fraudEvaluationProductionAnomalyRecord;

  @JsonProperty("FraudEvaluationProductionAnomalyProductionTransactionReference")
  private Object fraudEvaluationProductionAnomalyProductionTransactionReference;

  public FraudEvaluationAssessment productProductionSessionReference(Object productProductionSessionReference) {
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

  public FraudEvaluationAssessment fraudEvaluationTestProfile(String fraudEvaluationTestProfile) {
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

  public FraudEvaluationAssessment fraudEvaluationEnsembleTechniqueType(String fraudEvaluationEnsembleTechniqueType) {
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

  public FraudEvaluationAssessment fraudEvaluationEnsembleTechniqueDefinition(String fraudEvaluationEnsembleTechniqueDefinition) {
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

  public FraudEvaluationAssessment fraudEvaluationTransactionConsolidationRecord(String fraudEvaluationTransactionConsolidationRecord) {
    this.fraudEvaluationTransactionConsolidationRecord = fraudEvaluationTransactionConsolidationRecord;
    return this;
  }

  /**
   * Get fraudEvaluationTransactionConsolidationRecord
   * @return fraudEvaluationTransactionConsolidationRecord
  */
  @ApiModelProperty(value = "")


  public String getFraudEvaluationTransactionConsolidationRecord() {
    return fraudEvaluationTransactionConsolidationRecord;
  }

  public void setFraudEvaluationTransactionConsolidationRecord(String fraudEvaluationTransactionConsolidationRecord) {
    this.fraudEvaluationTransactionConsolidationRecord = fraudEvaluationTransactionConsolidationRecord;
  }

  public FraudEvaluationAssessment fraudEvaluationProductionAnomalyRecord(String fraudEvaluationProductionAnomalyRecord) {
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

  public FraudEvaluationAssessment fraudEvaluationProductionAnomalyProductionTransactionReference(Object fraudEvaluationProductionAnomalyProductionTransactionReference) {
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
    FraudEvaluationAssessment fraudEvaluationAssessment = (FraudEvaluationAssessment) o;
    return Objects.equals(this.productProductionSessionReference, fraudEvaluationAssessment.productProductionSessionReference) &&
        Objects.equals(this.fraudEvaluationTestProfile, fraudEvaluationAssessment.fraudEvaluationTestProfile) &&
        Objects.equals(this.fraudEvaluationEnsembleTechniqueType, fraudEvaluationAssessment.fraudEvaluationEnsembleTechniqueType) &&
        Objects.equals(this.fraudEvaluationEnsembleTechniqueDefinition, fraudEvaluationAssessment.fraudEvaluationEnsembleTechniqueDefinition) &&
        Objects.equals(this.fraudEvaluationTransactionConsolidationRecord, fraudEvaluationAssessment.fraudEvaluationTransactionConsolidationRecord) &&
        Objects.equals(this.fraudEvaluationProductionAnomalyRecord, fraudEvaluationAssessment.fraudEvaluationProductionAnomalyRecord) &&
        Objects.equals(this.fraudEvaluationProductionAnomalyProductionTransactionReference, fraudEvaluationAssessment.fraudEvaluationProductionAnomalyProductionTransactionReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productProductionSessionReference, fraudEvaluationTestProfile, fraudEvaluationEnsembleTechniqueType, fraudEvaluationEnsembleTechniqueDefinition, fraudEvaluationTransactionConsolidationRecord, fraudEvaluationProductionAnomalyRecord, fraudEvaluationProductionAnomalyProductionTransactionReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudEvaluationAssessment {\n");
    
    sb.append("    productProductionSessionReference: ").append(toIndentedString(productProductionSessionReference)).append("\n");
    sb.append("    fraudEvaluationTestProfile: ").append(toIndentedString(fraudEvaluationTestProfile)).append("\n");
    sb.append("    fraudEvaluationEnsembleTechniqueType: ").append(toIndentedString(fraudEvaluationEnsembleTechniqueType)).append("\n");
    sb.append("    fraudEvaluationEnsembleTechniqueDefinition: ").append(toIndentedString(fraudEvaluationEnsembleTechniqueDefinition)).append("\n");
    sb.append("    fraudEvaluationTransactionConsolidationRecord: ").append(toIndentedString(fraudEvaluationTransactionConsolidationRecord)).append("\n");
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

