package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Authentication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T05:50:26.408Z[GMT]")

public class Authentication   {
  @JsonProperty("RequiredAuthenticationLevel")
  private String requiredAuthenticationLevel;

  @JsonProperty("AuthenticationTaskResult")
  private String authenticationTaskResult;

  public Authentication requiredAuthenticationLevel(String requiredAuthenticationLevel) {
    this.requiredAuthenticationLevel = requiredAuthenticationLevel;
    return this;
  }

  /**
   * Get requiredAuthenticationLevel
   * @return requiredAuthenticationLevel
  */
  @ApiModelProperty(value = "")


  public String getRequiredAuthenticationLevel() {
    return requiredAuthenticationLevel;
  }

  public void setRequiredAuthenticationLevel(String requiredAuthenticationLevel) {
    this.requiredAuthenticationLevel = requiredAuthenticationLevel;
  }

  public Authentication authenticationTaskResult(String authenticationTaskResult) {
    this.authenticationTaskResult = authenticationTaskResult;
    return this;
  }

  /**
   * Get authenticationTaskResult
   * @return authenticationTaskResult
  */
  @ApiModelProperty(value = "")


  public String getAuthenticationTaskResult() {
    return authenticationTaskResult;
  }

  public void setAuthenticationTaskResult(String authenticationTaskResult) {
    this.authenticationTaskResult = authenticationTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authentication authentication = (Authentication) o;
    return Objects.equals(this.requiredAuthenticationLevel, authentication.requiredAuthenticationLevel) &&
        Objects.equals(this.authenticationTaskResult, authentication.authenticationTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredAuthenticationLevel, authenticationTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authentication {\n");
    
    sb.append("    requiredAuthenticationLevel: ").append(toIndentedString(requiredAuthenticationLevel)).append("\n");
    sb.append("    authenticationTaskResult: ").append(toIndentedString(authenticationTaskResult)).append("\n");
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

