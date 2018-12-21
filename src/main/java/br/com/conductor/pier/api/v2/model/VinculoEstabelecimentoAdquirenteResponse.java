package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{vinculo_estabelecimento_adquirente_response_description}}}
 **/

@ApiModel(description = "{{{vinculo_estabelecimento_adquirente_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class VinculoEstabelecimentoAdquirenteResponse   {
  
  private Long id = null;
  private Long idEstabelecimento = null;
  private Long idAdquirente = null;
  private String codigoEstabelecimentoAdquirente = null;
  private String dataHoraCadastro = null;
  private String mensagem = null;
  private Integer status = null;

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_id_value}}}
   **/
  public VinculoEstabelecimentoAdquirenteResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{vinculo_estabelecimento_adquirente_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_id_estabelecimento_value}}}
   **/
  public VinculoEstabelecimentoAdquirenteResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{vinculo_estabelecimento_adquirente_response_id_estabelecimento_value}}}")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_id_adquirente_value}}}
   **/
  public VinculoEstabelecimentoAdquirenteResponse idAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{vinculo_estabelecimento_adquirente_response_id_adquirente_value}}}")
  @JsonProperty("idAdquirente")
  public Long getIdAdquirente() {
    return idAdquirente;
  }
  public void setIdAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_codigo_estabelecimento_adquirente_value}}}
   **/
  public VinculoEstabelecimentoAdquirenteResponse codigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{vinculo_estabelecimento_adquirente_response_codigo_estabelecimento_adquirente_value}}}")
  @JsonProperty("codigoEstabelecimentoAdquirente")
  public String getCodigoEstabelecimentoAdquirente() {
    return codigoEstabelecimentoAdquirente;
  }
  public void setCodigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_data_hora_cadastro_value}}}
   **/
  public VinculoEstabelecimentoAdquirenteResponse dataHoraCadastro(String dataHoraCadastro) {
    this.dataHoraCadastro = dataHoraCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{vinculo_estabelecimento_adquirente_response_data_hora_cadastro_value}}}")
  @JsonProperty("dataHoraCadastro")
  public String getDataHoraCadastro() {
    return dataHoraCadastro;
  }
  public void setDataHoraCadastro(String dataHoraCadastro) {
    this.dataHoraCadastro = dataHoraCadastro;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_mensagem_value}}}
   **/
  public VinculoEstabelecimentoAdquirenteResponse mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{vinculo_estabelecimento_adquirente_response_mensagem_value}}}")
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_status_value}}}
   **/
  public VinculoEstabelecimentoAdquirenteResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{vinculo_estabelecimento_adquirente_response_status_value}}}")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
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
    VinculoEstabelecimentoAdquirenteResponse vinculoEstabelecimentoAdquirenteResponse = (VinculoEstabelecimentoAdquirenteResponse) o;
    return Objects.equals(this.id, vinculoEstabelecimentoAdquirenteResponse.id) &&
        Objects.equals(this.idEstabelecimento, vinculoEstabelecimentoAdquirenteResponse.idEstabelecimento) &&
        Objects.equals(this.idAdquirente, vinculoEstabelecimentoAdquirenteResponse.idAdquirente) &&
        Objects.equals(this.codigoEstabelecimentoAdquirente, vinculoEstabelecimentoAdquirenteResponse.codigoEstabelecimentoAdquirente) &&
        Objects.equals(this.dataHoraCadastro, vinculoEstabelecimentoAdquirenteResponse.dataHoraCadastro) &&
        Objects.equals(this.mensagem, vinculoEstabelecimentoAdquirenteResponse.mensagem) &&
        Objects.equals(this.status, vinculoEstabelecimentoAdquirenteResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idEstabelecimento, idAdquirente, codigoEstabelecimentoAdquirente, dataHoraCadastro, mensagem, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoEstabelecimentoAdquirenteResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idAdquirente: ").append(toIndentedString(idAdquirente)).append("\n");
    sb.append("    codigoEstabelecimentoAdquirente: ").append(toIndentedString(codigoEstabelecimentoAdquirente)).append("\n");
    sb.append("    dataHoraCadastro: ").append(toIndentedString(dataHoraCadastro)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
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

