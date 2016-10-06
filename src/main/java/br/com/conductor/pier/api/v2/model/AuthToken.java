package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ExtraInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AuthToken   {
  
  private String code = null;
  private ExtraInfo extraInfo = null;
  private Integer id = null;
  private String owner = null;


  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    REVOKED("REVOKED"),
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;

  
  /**
   **/
  public AuthToken code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  public AuthToken extraInfo(ExtraInfo extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraInfo")
  public ExtraInfo getExtraInfo() {
    return extraInfo;
  }
  public void setExtraInfo(ExtraInfo extraInfo) {
    this.extraInfo = extraInfo;
  }

  
  /**
   **/
  public AuthToken id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  public AuthToken owner(String owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   **/
  public AuthToken status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthToken authToken = (AuthToken) o;
    return Objects.equals(this.code, authToken.code) &&
        Objects.equals(this.extraInfo, authToken.extraInfo) &&
        Objects.equals(this.id, authToken.id) &&
        Objects.equals(this.owner, authToken.owner) &&
        Objects.equals(this.status, authToken.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, extraInfo, id, owner, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthToken {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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



