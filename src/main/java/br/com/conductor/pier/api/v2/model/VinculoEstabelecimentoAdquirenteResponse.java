package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta do VinculoEstabelecimentoAdquirente
 **/

@ApiModel(description = "Objeto de resposta do VinculoEstabelecimentoAdquirente")
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
   * C\u00F3digo de Identifica\u00E7\u00E3o do VinculoEstabelecimentoAdquirente (id).
   **/
  public VinculoEstabelecimentoAdquirenteResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do VinculoEstabelecimentoAdquirente (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento (id).
   **/
  public VinculoEstabelecimentoAdquirenteResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento (id).")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Adquirente (id).
   **/
  public VinculoEstabelecimentoAdquirenteResponse idAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Adquirente (id).")
  @JsonProperty("idAdquirente")
  public Long getIdAdquirente() {
    return idAdquirente;
  }
  public void setIdAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
  }

  
  /**
   * C\u00F3digo do v\u00EDnculo entre o estabelecimento e o adquirente.
   **/
  public VinculoEstabelecimentoAdquirenteResponse codigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do v\u00EDnculo entre o estabelecimento e o adquirente.")
  @JsonProperty("codigoEstabelecimentoAdquirente")
  public String getCodigoEstabelecimentoAdquirente() {
    return codigoEstabelecimentoAdquirente;
  }
  public void setCodigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
  }

  
  /**
   * Data de cadastro do v\u00EDnculo.
   **/
  public VinculoEstabelecimentoAdquirenteResponse dataHoraCadastro(String dataHoraCadastro) {
    this.dataHoraCadastro = dataHoraCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de cadastro do v\u00EDnculo.")
  @JsonProperty("dataHoraCadastro")
  public String getDataHoraCadastro() {
    return dataHoraCadastro;
  }
  public void setDataHoraCadastro(String dataHoraCadastro) {
    this.dataHoraCadastro = dataHoraCadastro;
  }

  
  /**
   * Data de cadastro do v\u00EDnculo.
   **/
  public VinculoEstabelecimentoAdquirenteResponse mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de cadastro do v\u00EDnculo.")
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * Data de cadastro do v\u00EDnculo.
   **/
  public VinculoEstabelecimentoAdquirenteResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de cadastro do v\u00EDnculo.")
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

