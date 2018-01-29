package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Job
 **/

@ApiModel(description = "Job")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class JobResponse   {
  
  private Long id = null;
  private String descricao = null;
  private String groovy = null;
  private String cron = null;


  public enum StatusEnum {
    INATIVO("INATIVO"),
    ATIVO("ATIVO");

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
   * Identificador do Job
   **/
  public JobResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do Job")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descricao do Job
   **/
  public JobResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descricao do Job")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Script Groovy do Job
   **/
  public JobResponse groovy(String groovy) {
    this.groovy = groovy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Script Groovy do Job")
  @JsonProperty("groovy")
  public String getGroovy() {
    return groovy;
  }
  public void setGroovy(String groovy) {
    this.groovy = groovy;
  }

  
  /**
   * Cron do Job
   **/
  public JobResponse cron(String cron) {
    this.cron = cron;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cron do Job")
  @JsonProperty("cron")
  public String getCron() {
    return cron;
  }
  public void setCron(String cron) {
    this.cron = cron;
  }

  
  /**
   * Status do Job no agendador de tarefas
   **/
  public JobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do Job no agendador de tarefas")
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
    JobResponse jobResponse = (JobResponse) o;
    return Objects.equals(this.id, jobResponse.id) &&
        Objects.equals(this.descricao, jobResponse.descricao) &&
        Objects.equals(this.groovy, jobResponse.groovy) &&
        Objects.equals(this.cron, jobResponse.cron) &&
        Objects.equals(this.status, jobResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, groovy, cron, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    groovy: ").append(toIndentedString(groovy)).append("\n");
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
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

