package com.ibm.org.model.paymentrailoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InboundTransactionFunction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:33.098Z[GMT]")

public class InboundTransactionFunction   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("PaymentRailOperatingSessionReference")
  private String paymentRailOperatingSessionReference;

  @JsonProperty("InboundTransactionFunctionReference")
  private String inboundTransactionFunctionReference;

  @JsonProperty("InboundTransactionFunctionType")
  private String inboundTransactionFunctionType;

  public InboundTransactionFunction preconditions(Object preconditions) {
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

  public InboundTransactionFunction schedule(Object schedule) {
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

  public InboundTransactionFunction businessService(Object businessService) {
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

  public InboundTransactionFunction paymentRailOperatingSessionReference(String paymentRailOperatingSessionReference) {
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

  public InboundTransactionFunction inboundTransactionFunctionReference(String inboundTransactionFunctionReference) {
    this.inboundTransactionFunctionReference = inboundTransactionFunctionReference;
    return this;
  }

  /**
   * Get inboundTransactionFunctionReference
   * @return inboundTransactionFunctionReference
  */
  @ApiModelProperty(value = "")


  public String getInboundTransactionFunctionReference() {
    return inboundTransactionFunctionReference;
  }

  public void setInboundTransactionFunctionReference(String inboundTransactionFunctionReference) {
    this.inboundTransactionFunctionReference = inboundTransactionFunctionReference;
  }

  public InboundTransactionFunction inboundTransactionFunctionType(String inboundTransactionFunctionType) {
    this.inboundTransactionFunctionType = inboundTransactionFunctionType;
    return this;
  }

  /**
   * Get inboundTransactionFunctionType
   * @return inboundTransactionFunctionType
  */
  @ApiModelProperty(value = "")


  public String getInboundTransactionFunctionType() {
    return inboundTransactionFunctionType;
  }

  public void setInboundTransactionFunctionType(String inboundTransactionFunctionType) {
    this.inboundTransactionFunctionType = inboundTransactionFunctionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundTransactionFunction inboundTransactionFunction = (InboundTransactionFunction) o;
    return Objects.equals(this.preconditions, inboundTransactionFunction.preconditions) &&
        Objects.equals(this.schedule, inboundTransactionFunction.schedule) &&
        Objects.equals(this.businessService, inboundTransactionFunction.businessService) &&
        Objects.equals(this.paymentRailOperatingSessionReference, inboundTransactionFunction.paymentRailOperatingSessionReference) &&
        Objects.equals(this.inboundTransactionFunctionReference, inboundTransactionFunction.inboundTransactionFunctionReference) &&
        Objects.equals(this.inboundTransactionFunctionType, inboundTransactionFunction.inboundTransactionFunctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, paymentRailOperatingSessionReference, inboundTransactionFunctionReference, inboundTransactionFunctionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundTransactionFunction {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    paymentRailOperatingSessionReference: ").append(toIndentedString(paymentRailOperatingSessionReference)).append("\n");
    sb.append("    inboundTransactionFunctionReference: ").append(toIndentedString(inboundTransactionFunctionReference)).append("\n");
    sb.append("    inboundTransactionFunctionType: ").append(toIndentedString(inboundTransactionFunctionType)).append("\n");
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

