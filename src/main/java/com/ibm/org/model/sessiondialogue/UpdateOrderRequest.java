package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.sessiondialogue.UpdateOrderRequestOrder;
import com.ibm.org.model.sessiondialogue.UpdateQueryRequestCustomerContactSessionProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:26.408Z[GMT]")

public class UpdateOrderRequest   {
  @JsonProperty("CustomerContactSessionProcedure")
  private UpdateQueryRequestCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("Order")
  private UpdateOrderRequestOrder order;

  public UpdateOrderRequest customerContactSessionProcedure(UpdateQueryRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
    return this;
  }

  /**
   * Get customerContactSessionProcedure
   * @return customerContactSessionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateQueryRequestCustomerContactSessionProcedure getCustomerContactSessionProcedure() {
    return customerContactSessionProcedure;
  }

  public void setCustomerContactSessionProcedure(UpdateQueryRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
  }

  public UpdateOrderRequest order(UpdateOrderRequestOrder order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateOrderRequestOrder getOrder() {
    return order;
  }

  public void setOrder(UpdateOrderRequestOrder order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderRequest updateOrderRequest = (UpdateOrderRequest) o;
    return Objects.equals(this.customerContactSessionProcedure, updateOrderRequest.customerContactSessionProcedure) &&
        Objects.equals(this.order, updateOrderRequest.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderRequest {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
