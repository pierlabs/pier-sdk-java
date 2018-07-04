package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{integracao_emissor_response_description}}}
 **/

@ApiModel(description = "{{{integracao_emissor_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class IntegracaoEmissorResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long idArquivo = null;
  private String status = null;
  private String dataInclusao = null;
  private String dataAlteracao = null;

  
  /**
   * {{{integracao_emissor_response_id_value}}}
   **/
  public IntegracaoEmissorResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{integracao_emissor_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{integracao_emissor_response_id_conta_value}}}
   **/
  public IntegracaoEmissorResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{integracao_emissor_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{integracao_emissor_response_id_arquivo_value}}}
   **/
  public IntegracaoEmissorResponse idArquivo(Long idArquivo) {
    this.idArquivo = idArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{integracao_emissor_response_id_arquivo_value}}}")
  @JsonProperty("idArquivo")
  public Long getIdArquivo() {
    return idArquivo;
  }
  public void setIdArquivo(Long idArquivo) {
    this.idArquivo = idArquivo;
  }

  
  /**
   * {{{integracao_emissor_response_status_value}}}
   **/
  public IntegracaoEmissorResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{integracao_emissor_response_status_value}}}")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * {{{integracao_emissor_response_data_inclusao_value}}}
   **/
  public IntegracaoEmissorResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{integracao_emissor_response_data_inclusao_value}}}")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{integracao_emissor_response_data_alteracao_value}}}
   **/
  public IntegracaoEmissorResponse dataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{integracao_emissor_response_data_alteracao_value}}}")
  @JsonProperty("dataAlteracao")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegracaoEmissorResponse integracaoEmissorResponse = (IntegracaoEmissorResponse) o;
    return Objects.equals(this.id, integracaoEmissorResponse.id) &&
        Objects.equals(this.idConta, integracaoEmissorResponse.idConta) &&
        Objects.equals(this.idArquivo, integracaoEmissorResponse.idArquivo) &&
        Objects.equals(this.status, integracaoEmissorResponse.status) &&
        Objects.equals(this.dataInclusao, integracaoEmissorResponse.dataInclusao) &&
        Objects.equals(this.dataAlteracao, integracaoEmissorResponse.dataAlteracao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, idArquivo, status, dataInclusao, dataAlteracao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idArquivo: ").append(toIndentedString(idArquivo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    dataAlteracao: ").append(toIndentedString(dataAlteracao)).append("\n");
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



