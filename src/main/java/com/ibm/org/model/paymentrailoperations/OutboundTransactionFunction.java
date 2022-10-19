package com.ibm.org.model.paymentrailoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OutboundTransactionFunction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:33.098Z[GMT]")

public class OutboundTransactionFunction   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("PaymentRailOperatingSessionReference")
  private String paymentRailOperatingSessionReference;

  @JsonProperty("OutboundTransactionFunctionReference")
  private String outboundTransactionFunctionReference;

  @JsonProperty("OutboundTransactionFunctionType")
  private String outboundTransactionFunctionType;

  public OutboundTransactionFunction preconditions(Object preconditions) {
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

  public OutboundTransactionFunction schedule(Object schedule) {
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

  public OutboundTransactionFunction businessService(Object businessService) {
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

  public OutboundTransactionFunction paymentRailOperatingSessionReference(String paymentRailOperatingSessionReference) {
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

  public OutboundTransactionFunction outboundTransactionFunctionReference(String outboundTransactionFunctionReference) {
    this.outboundTransactionFunctionReference = outboundTransactionFunctionReference;
    return this;
  }

  /**
   * Get outboundTransactionFunctionReference
   * @return outboundTransactionFunctionReference
  */
  @ApiModelProperty(value = "")


  public String getOutboundTransactionFunctionReference() {
    return outboundTransactionFunctionReference;
  }

  public void setOutboundTransactionFunctionReference(String outboundTransactionFunctionReference) {
    this.outboundTransactionFunctionReference = outboundTransactionFunctionReference;
  }

  public OutboundTransactionFunction outboundTransactionFunctionType(String outboundTransactionFunctionType) {
    this.outboundTransactionFunctionType = outboundTransactionFunctionType;
    return this;
  }

  /**
   * Get outboundTransactionFunctionType
   * @return outboundTransactionFunctionType
  */
  @ApiModelProperty(value = "")


  public String getOutboundTransactionFunctionType() {
    return outboundTransactionFunctionType;
  }

  public void setOutboundTransactionFunctionType(String outboundTransactionFunctionType) {
    this.outboundTransactionFunctionType = outboundTransactionFunctionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundTransactionFunction outboundTransactionFunction = (OutboundTransactionFunction) o;
    return Objects.equals(this.preconditions, outboundTransactionFunction.preconditions) &&
        Objects.equals(this.schedule, outboundTransactionFunction.schedule) &&
        Objects.equals(this.businessService, outboundTransactionFunction.businessService) &&
        Objects.equals(this.paymentRailOperatingSessionReference, outboundTransactionFunction.paymentRailOperatingSessionReference) &&
        Objects.equals(this.outboundTransactionFunctionReference, outboundTransactionFunction.outboundTransactionFunctionReference) &&
        Objects.equals(this.outboundTransactionFunctionType, outboundTransactionFunction.outboundTransactionFunctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, paymentRailOperatingSessionReference, outboundTransactionFunctionReference, outboundTransactionFunctionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundTransactionFunction {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    paymentRailOperatingSessionReference: ").append(toIndentedString(paymentRailOperatingSessionReference)).append("\n");
    sb.append("    outboundTransactionFunctionReference: ").append(toIndentedString(outboundTransactionFunctionReference)).append("\n");
    sb.append("    outboundTransactionFunctionType: ").append(toIndentedString(outboundTransactionFunctionType)).append("\n");
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

