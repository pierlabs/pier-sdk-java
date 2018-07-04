package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{inscricao_apn_persistencia_descricao}}}
 **/

@ApiModel(description = "{{{inscricao_apn_persistencia_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class InscricaoApnPersistencia   {
  
  private String deviceToken = null;
  private Long idAplicacaoMobile = null;
  private List<Long> idCartoes = new ArrayList<Long>();

  
  /**
   * {{{inscricao_apn_persistencia_device_token_descricao}}}
   **/
  public InscricaoApnPersistencia deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{inscricao_apn_persistencia_device_token_descricao}}}")
  @JsonProperty("deviceToken")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * {{{inscricao_apn_persistencia_id_aplicacao_mobile_descricao}}}
   **/
  public InscricaoApnPersistencia idAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{inscricao_apn_persistencia_id_aplicacao_mobile_descricao}}}")
  @JsonProperty("idAplicacaoMobile")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * {{{inscricao_apn_persistencia_id_cartoes_descricao}}}
   **/
  public InscricaoApnPersistencia idCartoes(List<Long> idCartoes) {
    this.idCartoes = idCartoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{inscricao_apn_persistencia_id_cartoes_descricao}}}")
  @JsonProperty("idCartoes")
  public List<Long> getIdCartoes() {
    return idCartoes;
  }
  public void setIdCartoes(List<Long> idCartoes) {
    this.idCartoes = idCartoes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InscricaoApnPersistencia inscricaoApnPersistencia = (InscricaoApnPersistencia) o;
    return Objects.equals(this.deviceToken, inscricaoApnPersistencia.deviceToken) &&
        Objects.equals(this.idAplicacaoMobile, inscricaoApnPersistencia.idAplicacaoMobile) &&
        Objects.equals(this.idCartoes, inscricaoApnPersistencia.idCartoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceToken, idAplicacaoMobile, idCartoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InscricaoApnPersistencia {\n");
    
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    idAplicacaoMobile: ").append(toIndentedString(idAplicacaoMobile)).append("\n");
    sb.append("    idCartoes: ").append(toIndentedString(idCartoes)).append("\n");
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



