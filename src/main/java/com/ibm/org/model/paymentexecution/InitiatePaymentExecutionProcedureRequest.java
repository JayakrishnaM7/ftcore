package com.ibm.org.model.paymentexecution;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.paymentexecution.InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentExecutionProcedureRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:31.098Z[GMT]")

public class InitiatePaymentExecutionProcedureRequest   {
  @JsonProperty("PaymentExecutionProcedure")
  private InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentExecutionProcedure;

  public InitiatePaymentExecutionProcedureRequest paymentExecutionProcedure(InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
    return this;
  }

  /**
   * Get paymentExecutionProcedure
   * @return paymentExecutionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure getPaymentExecutionProcedure() {
    return paymentExecutionProcedure;
  }

  public void setPaymentExecutionProcedure(InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest = (InitiatePaymentExecutionProcedureRequest) o;
    return Objects.equals(this.paymentExecutionProcedure, initiatePaymentExecutionProcedureRequest.paymentExecutionProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentExecutionProcedureRequest {\n");
    
    sb.append("    paymentExecutionProcedure: ").append(toIndentedString(paymentExecutionProcedure)).append("\n");
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
