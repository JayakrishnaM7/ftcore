package com.ibm.org.model.paymentrailoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentRailOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:33.098Z[GMT]")

public class PaymentRailOperatingSession   {
  @JsonProperty("PaymentRailOperatingSessionSchedule")
  private Object paymentRailOperatingSessionSchedule;

  @JsonProperty("PaymentRailOperatingSessionStatus")
  private String paymentRailOperatingSessionStatus;

  @JsonProperty("PaymentRailOperatingSessionUsageLog")
  private String paymentRailOperatingSessionUsageLog;

  @JsonProperty("PaymentRailOperatingSessionAssociatedPartyReference")
  private Object paymentRailOperatingSessionAssociatedPartyReference;

  @JsonProperty("PaymentRailOperatingSessionServiceProviderReference")
  private Object paymentRailOperatingSessionServiceProviderReference;

  @JsonProperty("PaymentRailOperatingSessionType")
  private String paymentRailOperatingSessionType;

  @JsonProperty("PaymentRailOperatingSessionServiceProviderSchedule")
  private Object paymentRailOperatingSessionServiceProviderSchedule;

  @JsonProperty("PaymentRailOperatingSessionServiceType")
  private String paymentRailOperatingSessionServiceType;

  @JsonProperty("PaymentRailOperatingSessionServiceConfiguration")
  private String paymentRailOperatingSessionServiceConfiguration;

  @JsonProperty("PaymentRailOperatingSessionReference")
  private String paymentRailOperatingSessionReference;

  public PaymentRailOperatingSession paymentRailOperatingSessionSchedule(Object paymentRailOperatingSessionSchedule) {
    this.paymentRailOperatingSessionSchedule = paymentRailOperatingSessionSchedule;
    return this;
  }

  /**
   * Get paymentRailOperatingSessionSchedule
   * @return paymentRailOperatingSessionSchedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentRailOperatingSessionSchedule() {
    return paymentRailOperatingSessionSchedule;
  }

  public void setPaymentRailOperatingSessionSchedule(Object paymentRailOperatingSessionSchedule) {
    this.paymentRailOperatingSessionSchedule = paymentRailOperatingSessionSchedule;
  }

  public PaymentRailOperatingSession paymentRailOperatingSessionStatus(String paymentRailOperatingSessionStatus) {
    this.paymentRailOperatingSessionStatus = paymentRailOperatingSessionStatus;
    return this;
  }

  /**
   * Get paymentRailOperatingSessionStatus
   * @return paymentRailOperatingSessionStatus
  */
  @ApiModelProperty(value = "")


  public String getPaymentRailOperatingSessionStatus() {
    return paymentRailOperatingSessionStatus;
  }

  public void setPaymentRailOperatingSessionStatus(String paymentRailOperatingSessionStatus) {
    this.paymentRailOperatingSessionStatus = paymentRailOperatingSessionStatus;
  }

  public PaymentRailOperatingSession paymentRailOperatingSessionUsageLog(String paymentRailOperatingSessionUsageLog) {
    this.paymentRailOperatingSessionUsageLog = paymentRailOperatingSessionUsageLog;
    return this;
  }

  /**
   * Get paymentRailOperatingSessionUsageLog
   * @return paymentRailOperatingSessionUsageLog
  */
  @ApiModelProperty(value = "")


  public String getPaymentRailOperatingSessionUsageLog() {
    return paymentRailOperatingSessionUsageLog;
  }

  public void setPaymentRailOperatingSessionUsageLog(String paymentRailOperatingSessionUsageLog) {
    this.paymentRailOperatingSessionUsageLog = paymentRailOperatingSessionUsageLog;
  }

  public PaymentRailOperatingSession paymentRailOperatingSessionAssociatedPartyReference(Object paymentRailOperatingSessionAssociatedPartyReference) {
    this.paymentRailOperatingSessionAssociatedPartyReference = paymentRailOperatingSessionAssociatedPartyReference;
    return this;
  }

  /**
   * Get paymentRailOperatingSessionAssociatedPartyReference
   * @return paymentRailOperatingSessionAssociatedPartyReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentRailOperatingSessionAssociatedPartyReference() {
    return paymentRailOperatingSessionAssociatedPartyReference;
  }

  public void setPaymentRailOperatingSessionAssociatedPartyReference(Object paymentRailOperatingSessionAssociatedPartyReference) {
    this.paymentRailOperatingSessionAssociatedPartyReference = paymentRailOperatingSessionAssociatedPartyReference;
  }

  public PaymentRailOperatingSession paymentRailOperatingSessionServiceProviderReference(Object paymentRailOperatingSessionServiceProviderReference) {
    this.paymentRailOperatingSessionServiceProviderReference = paymentRailOperatingSessionServiceProviderReference;
    return this;
  }

  /**
   * Get paymentRailOperatingSessionServiceProviderReference
   * @return paymentRailOperatingSessionServiceProviderReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentRailOperatingSessionServiceProviderReference() {
    return paymentRailOperatingSessionServiceProviderReference;
  }

  public void setPaymentRailOperatingSessionServiceProviderReference(Object paymentRailOperatingSessionServiceProviderReference) {
    this.paymentRailOperatingSessionServiceProviderReference = paymentRailOperatingSessionServiceProviderReference;
  }

  public PaymentRailOperatingSession paymentRailOperatingSessionType(String paymentRailOperatingSessionType) {
    this.paymentRailOperatingSessionType = paymentRailOperatingSessionType;
    return this;
  }

  /**
   * Get paymentRailOperatingSessionType
   * @return paymentRailOperatingSessionType
  */
  @ApiModelProperty(value = "")


  public String getPaymentRailOperatingSessionType() {
    return paymentRailOperatingSessionType;
  }

  public void setPaymentRailOperatingSessionType(String paymentRailOperatingSessionType) {
    this.paymentRailOperatingSessionType = paymentRailOperatingSessionType;
  }

  public PaymentRailOperatingSession paymentRailOperatingSessionServiceProviderSchedule(Object paymentRailOperatingSessionServiceProviderSchedule) {
    this.paymentRailOperatingSessionServiceProviderSchedule = paymentRailOperatingSessionServiceProviderSchedule;
    return this;
  }

  /**
   * Get paymentRailOperatingSessionServiceProviderSchedule
   * @return paymentRailOperatingSessionServiceProviderSchedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentRailOperatingSessionServiceProviderSchedule() {
    return paymentRailOperatingSessionServiceProviderSchedule;
  }

  public void setPaymentRailOperatingSessionServiceProviderSchedule(Object paymentRailOperatingSessionServiceProviderSchedule) {
    this.paymentRailOperatingSessionServiceProviderSchedule = paymentRailOperatingSessionServiceProviderSchedule;
  }

  public PaymentRailOperatingSession paymentRailOperatingSessionServiceType(String paymentRailOperatingSessionServiceType) {
    this.paymentRailOperatingSessionServiceType = paymentRailOperatingSessionServiceType;
    return this;
  }

  /**
   * Get paymentRailOperatingSessionServiceType
   * @return paymentRailOperatingSessionServiceType
  */
  @ApiModelProperty(value = "")


  public String getPaymentRailOperatingSessionServiceType() {
    return paymentRailOperatingSessionServiceType;
  }

  public void setPaymentRailOperatingSessionServiceType(String paymentRailOperatingSessionServiceType) {
    this.paymentRailOperatingSessionServiceType = paymentRailOperatingSessionServiceType;
  }

  public PaymentRailOperatingSession paymentRailOperatingSessionServiceConfiguration(String paymentRailOperatingSessionServiceConfiguration) {
    this.paymentRailOperatingSessionServiceConfiguration = paymentRailOperatingSessionServiceConfiguration;
    return this;
  }

  /**
   * Get paymentRailOperatingSessionServiceConfiguration
   * @return paymentRailOperatingSessionServiceConfiguration
  */
  @ApiModelProperty(value = "")


  public String getPaymentRailOperatingSessionServiceConfiguration() {
    return paymentRailOperatingSessionServiceConfiguration;
  }

  public void setPaymentRailOperatingSessionServiceConfiguration(String paymentRailOperatingSessionServiceConfiguration) {
    this.paymentRailOperatingSessionServiceConfiguration = paymentRailOperatingSessionServiceConfiguration;
  }

  public PaymentRailOperatingSession paymentRailOperatingSessionReference(String paymentRailOperatingSessionReference) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRailOperatingSession paymentRailOperatingSession = (PaymentRailOperatingSession) o;
    return Objects.equals(this.paymentRailOperatingSessionSchedule, paymentRailOperatingSession.paymentRailOperatingSessionSchedule) &&
        Objects.equals(this.paymentRailOperatingSessionStatus, paymentRailOperatingSession.paymentRailOperatingSessionStatus) &&
        Objects.equals(this.paymentRailOperatingSessionUsageLog, paymentRailOperatingSession.paymentRailOperatingSessionUsageLog) &&
        Objects.equals(this.paymentRailOperatingSessionAssociatedPartyReference, paymentRailOperatingSession.paymentRailOperatingSessionAssociatedPartyReference) &&
        Objects.equals(this.paymentRailOperatingSessionServiceProviderReference, paymentRailOperatingSession.paymentRailOperatingSessionServiceProviderReference) &&
        Objects.equals(this.paymentRailOperatingSessionType, paymentRailOperatingSession.paymentRailOperatingSessionType) &&
        Objects.equals(this.paymentRailOperatingSessionServiceProviderSchedule, paymentRailOperatingSession.paymentRailOperatingSessionServiceProviderSchedule) &&
        Objects.equals(this.paymentRailOperatingSessionServiceType, paymentRailOperatingSession.paymentRailOperatingSessionServiceType) &&
        Objects.equals(this.paymentRailOperatingSessionServiceConfiguration, paymentRailOperatingSession.paymentRailOperatingSessionServiceConfiguration) &&
        Objects.equals(this.paymentRailOperatingSessionReference, paymentRailOperatingSession.paymentRailOperatingSessionReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentRailOperatingSessionSchedule, paymentRailOperatingSessionStatus, paymentRailOperatingSessionUsageLog, paymentRailOperatingSessionAssociatedPartyReference, paymentRailOperatingSessionServiceProviderReference, paymentRailOperatingSessionType, paymentRailOperatingSessionServiceProviderSchedule, paymentRailOperatingSessionServiceType, paymentRailOperatingSessionServiceConfiguration, paymentRailOperatingSessionReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRailOperatingSession {\n");
    
    sb.append("    paymentRailOperatingSessionSchedule: ").append(toIndentedString(paymentRailOperatingSessionSchedule)).append("\n");
    sb.append("    paymentRailOperatingSessionStatus: ").append(toIndentedString(paymentRailOperatingSessionStatus)).append("\n");
    sb.append("    paymentRailOperatingSessionUsageLog: ").append(toIndentedString(paymentRailOperatingSessionUsageLog)).append("\n");
    sb.append("    paymentRailOperatingSessionAssociatedPartyReference: ").append(toIndentedString(paymentRailOperatingSessionAssociatedPartyReference)).append("\n");
    sb.append("    paymentRailOperatingSessionServiceProviderReference: ").append(toIndentedString(paymentRailOperatingSessionServiceProviderReference)).append("\n");
    sb.append("    paymentRailOperatingSessionType: ").append(toIndentedString(paymentRailOperatingSessionType)).append("\n");
    sb.append("    paymentRailOperatingSessionServiceProviderSchedule: ").append(toIndentedString(paymentRailOperatingSessionServiceProviderSchedule)).append("\n");
    sb.append("    paymentRailOperatingSessionServiceType: ").append(toIndentedString(paymentRailOperatingSessionServiceType)).append("\n");
    sb.append("    paymentRailOperatingSessionServiceConfiguration: ").append(toIndentedString(paymentRailOperatingSessionServiceConfiguration)).append("\n");
    sb.append("    paymentRailOperatingSessionReference: ").append(toIndentedString(paymentRailOperatingSessionReference)).append("\n");
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

