package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{lote_cartoes_pre_pagos_response_description}}}
 **/

@ApiModel(description = "{{{lote_cartoes_pre_pagos_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LoteCartoesPrePagosResponse   {
  
  private Long id = null;
  private Long idOrigemComercial = null;
  private Long idProduto = null;
  private Long idTipoCartao = null;
  private Long idImagem = null;
  private Long idEndereco = null;
  private Integer quantidade = null;
  private String dataCadastro = null;
  private String usuarioCadastro = null;
  private Integer statusProcessamento = null;
  private String identificadorExterno = null;

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_value}}}
   **/
  public LoteCartoesPrePagosResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{lote_cartoes_pre_pagos_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_origem_comercial_value}}}
   **/
  public LoteCartoesPrePagosResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{lote_cartoes_pre_pagos_response_id_origem_comercial_value}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_produto_value}}}
   **/
  public LoteCartoesPrePagosResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{lote_cartoes_pre_pagos_response_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_tipo_cartao_value}}}
   **/
  public LoteCartoesPrePagosResponse idTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{lote_cartoes_pre_pagos_response_id_tipo_cartao_value}}}")
  @JsonProperty("idTipoCartao")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_imagem_value}}}
   **/
  public LoteCartoesPrePagosResponse idImagem(Long idImagem) {
    this.idImagem = idImagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{lote_cartoes_pre_pagos_response_id_imagem_value}}}")
  @JsonProperty("idImagem")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_endereco_value}}}
   **/
  public LoteCartoesPrePagosResponse idEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{lote_cartoes_pre_pagos_response_id_endereco_value}}}")
  @JsonProperty("idEndereco")
  public Long getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_quantidade_value}}}
   **/
  public LoteCartoesPrePagosResponse quantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{lote_cartoes_pre_pagos_response_quantidade_value}}}")
  @JsonProperty("quantidade")
  public Integer getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_data_cadastro_value}}}
   **/
  public LoteCartoesPrePagosResponse dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{lote_cartoes_pre_pagos_response_data_cadastro_value}}}")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_usuario_cadastro_value}}}
   **/
  public LoteCartoesPrePagosResponse usuarioCadastro(String usuarioCadastro) {
    this.usuarioCadastro = usuarioCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{lote_cartoes_pre_pagos_response_usuario_cadastro_value}}}")
  @JsonProperty("usuarioCadastro")
  public String getUsuarioCadastro() {
    return usuarioCadastro;
  }
  public void setUsuarioCadastro(String usuarioCadastro) {
    this.usuarioCadastro = usuarioCadastro;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_status_processamento_value}}}
   **/
  public LoteCartoesPrePagosResponse statusProcessamento(Integer statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{lote_cartoes_pre_pagos_response_status_processamento_value}}}")
  @JsonProperty("statusProcessamento")
  public Integer getStatusProcessamento() {
    return statusProcessamento;
  }
  public void setStatusProcessamento(Integer statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_identificador_externo_value}}}
   **/
  public LoteCartoesPrePagosResponse identificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{lote_cartoes_pre_pagos_response_identificador_externo_value}}}")
  @JsonProperty("identificadorExterno")
  public String getIdentificadorExterno() {
    return identificadorExterno;
  }
  public void setIdentificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoteCartoesPrePagosResponse loteCartoesPrePagosResponse = (LoteCartoesPrePagosResponse) o;
    return Objects.equals(this.id, loteCartoesPrePagosResponse.id) &&
        Objects.equals(this.idOrigemComercial, loteCartoesPrePagosResponse.idOrigemComercial) &&
        Objects.equals(this.idProduto, loteCartoesPrePagosResponse.idProduto) &&
        Objects.equals(this.idTipoCartao, loteCartoesPrePagosResponse.idTipoCartao) &&
        Objects.equals(this.idImagem, loteCartoesPrePagosResponse.idImagem) &&
        Objects.equals(this.idEndereco, loteCartoesPrePagosResponse.idEndereco) &&
        Objects.equals(this.quantidade, loteCartoesPrePagosResponse.quantidade) &&
        Objects.equals(this.dataCadastro, loteCartoesPrePagosResponse.dataCadastro) &&
        Objects.equals(this.usuarioCadastro, loteCartoesPrePagosResponse.usuarioCadastro) &&
        Objects.equals(this.statusProcessamento, loteCartoesPrePagosResponse.statusProcessamento) &&
        Objects.equals(this.identificadorExterno, loteCartoesPrePagosResponse.identificadorExterno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idOrigemComercial, idProduto, idTipoCartao, idImagem, idEndereco, quantidade, dataCadastro, usuarioCadastro, statusProcessamento, identificadorExterno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteCartoesPrePagosResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idTipoCartao: ").append(toIndentedString(idTipoCartao)).append("\n");
    sb.append("    idImagem: ").append(toIndentedString(idImagem)).append("\n");
    sb.append("    idEndereco: ").append(toIndentedString(idEndereco)).append("\n");
    sb.append("    quantidade: ").append(toIndentedString(quantidade)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    usuarioCadastro: ").append(toIndentedString(usuarioCadastro)).append("\n");
    sb.append("    statusProcessamento: ").append(toIndentedString(statusProcessamento)).append("\n");
    sb.append("    identificadorExterno: ").append(toIndentedString(identificadorExterno)).append("\n");
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



