package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{cartao_embossing_response_description}}}
 **/

@ApiModel(description = "{{{cartao_embossing_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoEmbossingResponse   {
  
  private Integer flagVirtual = null;
  private Long idConta = null;
  private Long idPessoa = null;
  private Long idCartao = null;
  private Long idBandeira = null;
  private Long idTipoCartao = null;
  private String dataGeracao = null;
  private String dataValidade = null;
  private String nomeOrigemComercial = null;
  private String cpf = null;

  
  /**
   * {{{cartao_embossing_response_flag_virtual_value}}}
   **/
  public CartaoEmbossingResponse flagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_response_flag_virtual_value}}}")
  @JsonProperty("flagVirtual")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * {{{cartao_embossing_response_id_conta_value}}}
   **/
  public CartaoEmbossingResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{cartao_embossing_response_id_pessoa_value}}}
   **/
  public CartaoEmbossingResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_response_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{cartao_embossing_response_id_cartao_value}}}
   **/
  public CartaoEmbossingResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_response_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{cartao_embossing_response_id_bandeira_value}}}
   **/
  public CartaoEmbossingResponse idBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_response_id_bandeira_value}}}")
  @JsonProperty("idBandeira")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * {{{cartao_embossing_response_id_tipo_cartao_value}}}
   **/
  public CartaoEmbossingResponse idTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_response_id_tipo_cartao_value}}}")
  @JsonProperty("idTipoCartao")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * {{{cartao_embossing_response_data_geracao_value}}}
   **/
  public CartaoEmbossingResponse dataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_response_data_geracao_value}}}")
  @JsonProperty("dataGeracao")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * {{{cartao_embossing_response_data_validade_value}}}
   **/
  public CartaoEmbossingResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_response_data_validade_value}}}")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{cartao_embossing_response_nome_origem_comercial_value}}}
   **/
  public CartaoEmbossingResponse nomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_response_nome_origem_comercial_value}}}")
  @JsonProperty("nomeOrigemComercial")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * {{{cartao_embossing_response_cpf_value}}}
   **/
  public CartaoEmbossingResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_embossing_response_cpf_value}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoEmbossingResponse cartaoEmbossingResponse = (CartaoEmbossingResponse) o;
    return Objects.equals(this.flagVirtual, cartaoEmbossingResponse.flagVirtual) &&
        Objects.equals(this.idConta, cartaoEmbossingResponse.idConta) &&
        Objects.equals(this.idPessoa, cartaoEmbossingResponse.idPessoa) &&
        Objects.equals(this.idCartao, cartaoEmbossingResponse.idCartao) &&
        Objects.equals(this.idBandeira, cartaoEmbossingResponse.idBandeira) &&
        Objects.equals(this.idTipoCartao, cartaoEmbossingResponse.idTipoCartao) &&
        Objects.equals(this.dataGeracao, cartaoEmbossingResponse.dataGeracao) &&
        Objects.equals(this.dataValidade, cartaoEmbossingResponse.dataValidade) &&
        Objects.equals(this.nomeOrigemComercial, cartaoEmbossingResponse.nomeOrigemComercial) &&
        Objects.equals(this.cpf, cartaoEmbossingResponse.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagVirtual, idConta, idPessoa, idCartao, idBandeira, idTipoCartao, dataGeracao, dataValidade, nomeOrigemComercial, cpf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoEmbossingResponse {\n");
    
    sb.append("    flagVirtual: ").append(toIndentedString(flagVirtual)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idBandeira: ").append(toIndentedString(idBandeira)).append("\n");
    sb.append("    idTipoCartao: ").append(toIndentedString(idTipoCartao)).append("\n");
    sb.append("    dataGeracao: ").append(toIndentedString(dataGeracao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    nomeOrigemComercial: ").append(toIndentedString(nomeOrigemComercial)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
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

