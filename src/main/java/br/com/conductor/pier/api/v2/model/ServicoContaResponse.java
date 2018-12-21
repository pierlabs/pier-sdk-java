package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Response Service Account Object
 **/

@ApiModel(description = "Response Service Account Object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ServicoContaResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long idTipoServico = null;
  private String dataAtivacao = null;
  private Long idUsuarioAtivacao = null;
  private Long idPlataformaAtivacao = null;
  private String dataCancelamento = null;
  private Long idUsuarioCancelamento = null;
  private Long idPlataformaCancelamento = null;

  
  /**
   * Account Service Identifier
   **/
  public ServicoContaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Account Service Identifier")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Account Identifier
   **/
  public ServicoContaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Account Identifier")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Service Type Identifier
   **/
  public ServicoContaResponse idTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service Type Identifier")
  @JsonProperty("idTipoServico")
  public Long getIdTipoServico() {
    return idTipoServico;
  }
  public void setIdTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
  }

  
  /**
   * Service activation date
   **/
  public ServicoContaResponse dataAtivacao(String dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service activation date")
  @JsonProperty("dataAtivacao")
  public String getDataAtivacao() {
    return dataAtivacao;
  }
  public void setDataAtivacao(String dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
  }

  
  /**
   * User activated the service
   **/
  public ServicoContaResponse idUsuarioAtivacao(Long idUsuarioAtivacao) {
    this.idUsuarioAtivacao = idUsuarioAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User activated the service")
  @JsonProperty("idUsuarioAtivacao")
  public Long getIdUsuarioAtivacao() {
    return idUsuarioAtivacao;
  }
  public void setIdUsuarioAtivacao(Long idUsuarioAtivacao) {
    this.idUsuarioAtivacao = idUsuarioAtivacao;
  }

  
  /**
   * Platform activated service
   **/
  public ServicoContaResponse idPlataformaAtivacao(Long idPlataformaAtivacao) {
    this.idPlataformaAtivacao = idPlataformaAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Platform activated service")
  @JsonProperty("idPlataformaAtivacao")
  public Long getIdPlataformaAtivacao() {
    return idPlataformaAtivacao;
  }
  public void setIdPlataformaAtivacao(Long idPlataformaAtivacao) {
    this.idPlataformaAtivacao = idPlataformaAtivacao;
  }

  
  /**
   * Service cancellation date
   **/
  public ServicoContaResponse dataCancelamento(String dataCancelamento) {
    this.dataCancelamento = dataCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service cancellation date")
  @JsonProperty("dataCancelamento")
  public String getDataCancelamento() {
    return dataCancelamento;
  }
  public void setDataCancelamento(String dataCancelamento) {
    this.dataCancelamento = dataCancelamento;
  }

  
  /**
   * User canceled service
   **/
  public ServicoContaResponse idUsuarioCancelamento(Long idUsuarioCancelamento) {
    this.idUsuarioCancelamento = idUsuarioCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User canceled service")
  @JsonProperty("idUsuarioCancelamento")
  public Long getIdUsuarioCancelamento() {
    return idUsuarioCancelamento;
  }
  public void setIdUsuarioCancelamento(Long idUsuarioCancelamento) {
    this.idUsuarioCancelamento = idUsuarioCancelamento;
  }

  
  /**
   * Platform canceled service
   **/
  public ServicoContaResponse idPlataformaCancelamento(Long idPlataformaCancelamento) {
    this.idPlataformaCancelamento = idPlataformaCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Platform canceled service")
  @JsonProperty("idPlataformaCancelamento")
  public Long getIdPlataformaCancelamento() {
    return idPlataformaCancelamento;
  }
  public void setIdPlataformaCancelamento(Long idPlataformaCancelamento) {
    this.idPlataformaCancelamento = idPlataformaCancelamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicoContaResponse servicoContaResponse = (ServicoContaResponse) o;
    return Objects.equals(this.id, servicoContaResponse.id) &&
        Objects.equals(this.idConta, servicoContaResponse.idConta) &&
        Objects.equals(this.idTipoServico, servicoContaResponse.idTipoServico) &&
        Objects.equals(this.dataAtivacao, servicoContaResponse.dataAtivacao) &&
        Objects.equals(this.idUsuarioAtivacao, servicoContaResponse.idUsuarioAtivacao) &&
        Objects.equals(this.idPlataformaAtivacao, servicoContaResponse.idPlataformaAtivacao) &&
        Objects.equals(this.dataCancelamento, servicoContaResponse.dataCancelamento) &&
        Objects.equals(this.idUsuarioCancelamento, servicoContaResponse.idUsuarioCancelamento) &&
        Objects.equals(this.idPlataformaCancelamento, servicoContaResponse.idPlataformaCancelamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, idTipoServico, dataAtivacao, idUsuarioAtivacao, idPlataformaAtivacao, dataCancelamento, idUsuarioCancelamento, idPlataformaCancelamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicoContaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idTipoServico: ").append(toIndentedString(idTipoServico)).append("\n");
    sb.append("    dataAtivacao: ").append(toIndentedString(dataAtivacao)).append("\n");
    sb.append("    idUsuarioAtivacao: ").append(toIndentedString(idUsuarioAtivacao)).append("\n");
    sb.append("    idPlataformaAtivacao: ").append(toIndentedString(idPlataformaAtivacao)).append("\n");
    sb.append("    dataCancelamento: ").append(toIndentedString(dataCancelamento)).append("\n");
    sb.append("    idUsuarioCancelamento: ").append(toIndentedString(idUsuarioCancelamento)).append("\n");
    sb.append("    idPlataformaCancelamento: ").append(toIndentedString(idPlataformaCancelamento)).append("\n");
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

