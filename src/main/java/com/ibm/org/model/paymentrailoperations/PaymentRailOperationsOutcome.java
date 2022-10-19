package com.ibm.org.model.paymentrailoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentRailOperationsOutcome
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:33.098Z[GMT]")

public class PaymentRailOperationsOutcome   {
  @JsonProperty("PaymentRailOperationsIncident")
  private String paymentRailOperationsIncident;

  @JsonProperty("PaymentRailOperationsProvision")
  private String paymentRailOperationsProvision;

  public PaymentRailOperationsOutcome paymentRailOperationsIncident(String paymentRailOperationsIncident) {
    this.paymentRailOperationsIncident = paymentRailOperationsIncident;
    return this;
  }

  /**
   * Get paymentRailOperationsIncident
   * @return paymentRailOperationsIncident
  */
  @ApiModelProperty(value = "")


  public String getPaymentRailOperationsIncident() {
    return paymentRailOperationsIncident;
  }

  public void setPaymentRailOperationsIncident(String paymentRailOperationsIncident) {
    this.paymentRailOperationsIncident = paymentRailOperationsIncident;
  }

  public PaymentRailOperationsOutcome paymentRailOperationsProvision(String paymentRailOperationsProvision) {
    this.paymentRailOperationsProvision = paymentRailOperationsProvision;
    return this;
  }

  /**
   * Get paymentRailOperationsProvision
   * @return paymentRailOperationsProvision
  */
  @ApiModelProperty(value = "")


  public String getPaymentRailOperationsProvision() {
    return paymentRailOperationsProvision;
  }

  public void setPaymentRailOperationsProvision(String paymentRailOperationsProvision) {
    this.paymentRailOperationsProvision = paymentRailOperationsProvision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRailOperationsOutcome paymentRailOperationsOutcome = (PaymentRailOperationsOutcome) o;
    return Objects.equals(this.paymentRailOperationsIncident, paymentRailOperationsOutcome.paymentRailOperationsIncident) &&
        Objects.equals(this.paymentRailOperationsProvision, paymentRailOperationsOutcome.paymentRailOperationsProvision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentRailOperationsIncident, paymentRailOperationsProvision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRailOperationsOutcome {\n");
    
    sb.append("    paymentRailOperationsIncident: ").append(toIndentedString(paymentRailOperationsIncident)).append("\n");
    sb.append("    paymentRailOperationsProvision: ").append(toIndentedString(paymentRailOperationsProvision)).append("\n");
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

