package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class Chronology   {
  
  private String calendarType = null;
  private String id = null;

  
  /**
   **/
  public Chronology calendarType(String calendarType) {
    this.calendarType = calendarType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calendarType")
  public String getCalendarType() {
    return calendarType;
  }
  public void setCalendarType(String calendarType) {
    this.calendarType = calendarType;
  }

  
  /**
   **/
  public Chronology id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chronology chronology = (Chronology) o;
    return Objects.equals(this.calendarType, chronology.calendarType) &&
        Objects.equals(this.id, chronology.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chronology {\n");
    
    sb.append("    calendarType: ").append(toIndentedString(calendarType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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



