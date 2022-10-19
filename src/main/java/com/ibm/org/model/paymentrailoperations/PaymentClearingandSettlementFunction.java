package com.ibm.org.model.paymentrailoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentClearingandSettlementFunction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:33.098Z[GMT]")

public class PaymentClearingandSettlementFunction   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("PaymentRailOperatingSessionReference")
  private String paymentRailOperatingSessionReference;

  @JsonProperty("PaymentClearingandSettlementFunctionReference")
  private String paymentClearingandSettlementFunctionReference;

  @JsonProperty("PaymentClearingandSettlementFunctionType")
  private String paymentClearingandSettlementFunctionType;

  public PaymentClearingandSettlementFunction preconditions(Object preconditions) {
    this.preconditions = preconditions;
    return this;
  }

  /**
   * Get preconditions
   * @return preconditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPreconditions() {
    return preconditions;
  }

  public void setPreconditions(Object preconditions) {
    this.preconditions = preconditions;
  }

  public PaymentClearingandSettlementFunction schedule(Object schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSchedule() {
    return schedule;
  }

  public void setSchedule(Object schedule) {
    this.schedule = schedule;
  }

  public PaymentClearingandSettlementFunction businessService(Object businessService) {
    this.businessService = businessService;
    return this;
  }

  /**
   * Get businessService
   * @return businessService
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessService() {
    return businessService;
  }

  public void setBusinessService(Object businessService) {
    this.businessService = businessService;
  }

  public PaymentClearingandSettlementFunction paymentRailOperatingSessionReference(String paymentRailOperatingSessionReference) {
    this.paymentRailOperatingSessionReference = paymentRailOperatingSessionReference;
    return this;
  }

  /**
   * Get paymentRailOperatingSessionReference
   * @return paymentRailOperatingSessionReference
  */
  @ApiModelProperty(value = "")


  public String getPaymentRailOperatingSessionReference() {
    return paymentRailOperatingSessionReference;
  }

  public void setPaymentRailOperatingSessionReference(String paymentRailOperatingSessionReference) {
    this.paymentRailOperatingSessionReference = paymentRailOperatingSessionReference;
  }

  public PaymentClearingandSettlementFunction paymentClearingandSettlementFunctionReference(String paymentClearingandSettlementFunctionReference) {
    this.paymentClearingandSettlementFunctionReference = paymentClearingandSettlementFunctionReference;
    return this;
  }

  /**
   * Get paymentClearingandSettlementFunctionReference
   * @return paymentClearingandSettlementFunctionReference
  */
  @ApiModelProperty(value = "")


  public String getPaymentClearingandSettlementFunctionReference() {
    return paymentClearingandSettlementFunctionReference;
  }

  public void setPaymentClearingandSettlementFunctionReference(String paymentClearingandSettlementFunctionReference) {
    this.paymentClearingandSettlementFunctionReference = paymentClearingandSettlementFunctionReference;
  }

  public PaymentClearingandSettlementFunction paymentClearingandSettlementFunctionType(String paymentClearingandSettlementFunctionType) {
    this.paymentClearingandSettlementFunctionType = paymentClearingandSettlementFunctionType;
    return this;
  }

  /**
   * Get paymentClearingandSettlementFunctionType
   * @return paymentClearingandSettlementFunctionType
  */
  @ApiModelProperty(value = "")


  public String getPaymentClearingandSettlementFunctionType() {
    return paymentClearingandSettlementFunctionType;
  }

  public void setPaymentClearingandSettlementFunctionType(String paymentClearingandSettlementFunctionType) {
    this.paymentClearingandSettlementFunctionType = paymentClearingandSettlementFunctionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentClearingandSettlementFunction paymentClearingandSettlementFunction = (PaymentClearingandSettlementFunction) o;
    return Objects.equals(this.preconditions, paymentClearingandSettlementFunction.preconditions) &&
        Objects.equals(this.schedule, paymentClearingandSettlementFunction.schedule) &&
        Objects.equals(this.businessService, paymentClearingandSettlementFunction.businessService) &&
        Objects.equals(this.paymentRailOperatingSessionReference, paymentClearingandSettlementFunction.paymentRailOperatingSessionReference) &&
        Objects.equals(this.paymentClearingandSettlementFunctionReference, paymentClearingandSettlementFunction.paymentClearingandSettlementFunctionReference) &&
        Objects.equals(this.paymentClearingandSettlementFunctionType, paymentClearingandSettlementFunction.paymentClearingandSettlementFunctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, paymentRailOperatingSessionReference, paymentClearingandSettlementFunctionReference, paymentClearingandSettlementFunctionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentClearingandSettlementFunction {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    paymentRailOperatingSessionReference: ").append(toIndentedString(paymentRailOperatingSessionReference)).append("\n");
    sb.append("    paymentClearingandSettlementFunctionReference: ").append(toIndentedString(paymentClearingandSettlementFunctionReference)).append("\n");
    sb.append("    paymentClearingandSettlementFunctionType: ").append(toIndentedString(paymentClearingandSettlementFunctionType)).append("\n");
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

