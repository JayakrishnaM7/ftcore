package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.sessiondialogue.UpdateQueryRequestCustomerContactSessionProcedure;
import com.ibm.org.model.sessiondialogue.UpdateSalesRequestSales;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateSalesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:26.408Z[GMT]")

public class UpdateSalesRequest   {
  @JsonProperty("CustomerContactSessionProcedure")
  private UpdateQueryRequestCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("Sales")
  private UpdateSalesRequestSales sales;

  public UpdateSalesRequest customerContactSessionProcedure(UpdateQueryRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
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

  public UpdateSalesRequest sales(UpdateSalesRequestSales sales) {
    this.sales = sales;
    return this;
  }

  /**
   * Get sales
   * @return sales
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateSalesRequestSales getSales() {
    return sales;
  }

  public void setSales(UpdateSalesRequestSales sales) {
    this.sales = sales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSalesRequest updateSalesRequest = (UpdateSalesRequest) o;
    return Objects.equals(this.customerContactSessionProcedure, updateSalesRequest.customerContactSessionProcedure) &&
        Objects.equals(this.sales, updateSalesRequest.sales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, sales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSalesRequest {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
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

