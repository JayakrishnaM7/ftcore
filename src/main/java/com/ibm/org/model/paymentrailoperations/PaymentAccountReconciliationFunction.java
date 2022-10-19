package com.ibm.org.model.paymentrailoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentAccountReconciliationFunction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:33.098Z[GMT]")

public class PaymentAccountReconciliationFunction   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("PaymentRailOperatingSessionReference")
  private String paymentRailOperatingSessionReference;

  @JsonProperty("PaymentAccountReconciliationFunctionReference")
  private String paymentAccountReconciliationFunctionReference;

  @JsonProperty("PaymentAccountReconciliationFunctionType")
  private String paymentAccountReconciliationFunctionType;

  public PaymentAccountReconciliationFunction preconditions(Object preconditions) {
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

  public PaymentAccountReconciliationFunction schedule(Object schedule) {
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

  public PaymentAccountReconciliationFunction businessService(Object businessService) {
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

  public PaymentAccountReconciliationFunction paymentRailOperatingSessionReference(String paymentRailOperatingSessionReference) {
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

  public PaymentAccountReconciliationFunction paymentAccountReconciliationFunctionReference(String paymentAccountReconciliationFunctionReference) {
    this.paymentAccountReconciliationFunctionReference = paymentAccountReconciliationFunctionReference;
    return this;
  }

  /**
   * Get paymentAccountReconciliationFunctionReference
   * @return paymentAccountReconciliationFunctionReference
  */
  @ApiModelProperty(value = "")


  public String getPaymentAccountReconciliationFunctionReference() {
    return paymentAccountReconciliationFunctionReference;
  }

  public void setPaymentAccountReconciliationFunctionReference(String paymentAccountReconciliationFunctionReference) {
    this.paymentAccountReconciliationFunctionReference = paymentAccountReconciliationFunctionReference;
  }

  public PaymentAccountReconciliationFunction paymentAccountReconciliationFunctionType(String paymentAccountReconciliationFunctionType) {
    this.paymentAccountReconciliationFunctionType = paymentAccountReconciliationFunctionType;
    return this;
  }

  /**
   * Get paymentAccountReconciliationFunctionType
   * @return paymentAccountReconciliationFunctionType
  */
  @ApiModelProperty(value = "")


  public String getPaymentAccountReconciliationFunctionType() {
    return paymentAccountReconciliationFunctionType;
  }

  public void setPaymentAccountReconciliationFunctionType(String paymentAccountReconciliationFunctionType) {
    this.paymentAccountReconciliationFunctionType = paymentAccountReconciliationFunctionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAccountReconciliationFunction paymentAccountReconciliationFunction = (PaymentAccountReconciliationFunction) o;
    return Objects.equals(this.preconditions, paymentAccountReconciliationFunction.preconditions) &&
        Objects.equals(this.schedule, paymentAccountReconciliationFunction.schedule) &&
        Objects.equals(this.businessService, paymentAccountReconciliationFunction.businessService) &&
        Objects.equals(this.paymentRailOperatingSessionReference, paymentAccountReconciliationFunction.paymentRailOperatingSessionReference) &&
        Objects.equals(this.paymentAccountReconciliationFunctionReference, paymentAccountReconciliationFunction.paymentAccountReconciliationFunctionReference) &&
        Objects.equals(this.paymentAccountReconciliationFunctionType, paymentAccountReconciliationFunction.paymentAccountReconciliationFunctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, paymentRailOperatingSessionReference, paymentAccountReconciliationFunctionReference, paymentAccountReconciliationFunctionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAccountReconciliationFunction {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    paymentRailOperatingSessionReference: ").append(toIndentedString(paymentRailOperatingSessionReference)).append("\n");
    sb.append("    paymentAccountReconciliationFunctionReference: ").append(toIndentedString(paymentAccountReconciliationFunctionReference)).append("\n");
    sb.append("    paymentAccountReconciliationFunctionType: ").append(toIndentedString(paymentAccountReconciliationFunctionType)).append("\n");
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

