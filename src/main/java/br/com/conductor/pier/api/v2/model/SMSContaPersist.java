package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de persist\u00EAncia de SMSConta
 **/

@ApiModel(description = "Objeto de persist\u00EAncia de SMSConta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SMSContaPersist   {
  
  private Long idSMSTipoServico = null;

  
  /**
   * Id do tipo servi\u00E7o SMS (Id_SMSTipoServico)
   **/
  public SMSContaPersist idSMSTipoServico(Long idSMSTipoServico) {
    this.idSMSTipoServico = idSMSTipoServico;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id do tipo servi\u00E7o SMS (Id_SMSTipoServico)")
  @JsonProperty("idSMSTipoServico")
  public Long getIdSMSTipoServico() {
    return idSMSTipoServico;
  }
  public void setIdSMSTipoServico(Long idSMSTipoServico) {
    this.idSMSTipoServico = idSMSTipoServico;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSContaPersist sMSContaPersist = (SMSContaPersist) o;
    return Objects.equals(this.idSMSTipoServico, sMSContaPersist.idSMSTipoServico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSMSTipoServico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSContaPersist {\n");
    
    sb.append("    idSMSTipoServico: ").append(toIndentedString(idSMSTipoServico)).append("\n");
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

