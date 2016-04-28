package br.com.conductor.pier.api.v1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1.model.Body;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BodyAccessToken   {
  
  private Body body = null;

  
  /**
   **/
  public BodyAccessToken body(Body body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("body")
  public Body getBody() {
    return body;
  }
  public void setBody(Body body) {
    this.body = body;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyAccessToken bodyAccessToken = (BodyAccessToken) o;
    return Objects.equals(this.body, bodyAccessToken.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyAccessToken {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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



