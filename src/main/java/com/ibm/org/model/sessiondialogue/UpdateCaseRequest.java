package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.sessiondialogue.UpdateCaseRequestCase;
import com.ibm.org.model.sessiondialogue.UpdateQueryRequestCustomerContactSessionProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCaseRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:26.408Z[GMT]")

public class UpdateCaseRequest   {
  @JsonProperty("CustomerContactSessionProcedure")
  private UpdateQueryRequestCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("Case")
  private UpdateCaseRequestCase _case;

  public UpdateCaseRequest customerContactSessionProcedure(UpdateQueryRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
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

  public UpdateCaseRequest _case(UpdateCaseRequestCase _case) {
    this._case = _case;
    return this;
  }

  /**
   * Get _case
   * @return _case
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCaseRequestCase getCase() {
    return _case;
  }

  public void setCase(UpdateCaseRequestCase _case) {
    this._case = _case;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCaseRequest updateCaseRequest = (UpdateCaseRequest) o;
    return Objects.equals(this.customerContactSessionProcedure, updateCaseRequest.customerContactSessionProcedure) &&
        Objects.equals(this._case, updateCaseRequest._case);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, _case);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCaseRequest {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    _case: ").append(toIndentedString(_case)).append("\n");
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

