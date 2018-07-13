package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{cartao_response_description}}}
 **/

@ApiModel(description = "{{{cartao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoResponse   {
  
  private Long id = null;
  private Integer flagTitular = null;
  private Long idPessoa = null;
  private Integer sequencialCartao = null;
  private Long idConta = null;
  private Long idStatus = null;
  private String dataStatus = null;
  private Long idEstagio = null;
  private String dataEstagio = null;
  private Long numeroBin = null;
  private String numeroCartao = null;
  private Long numeroCartaoHash = null;
  private String numeroCartaoCriptografado = null;
  private String dataEmissao = null;
  private String dataValidade = null;
  private Integer cartaoVirtual = null;
  private Integer impressaoAvulsa = null;
  private String dataImpressao = null;
  private String nomeArquivoImpressao = null;
  private Long idProduto = null;
  private String nomeImpresso = null;
  private String codigoDesbloqueio = null;

  
  /**
   * {{{cartao_response_id_value}}}
   **/
  public CartaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{cartao_response_flag_titular_value}}}
   **/
  public CartaoResponse flagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_flag_titular_value}}}")
  @JsonProperty("flagTitular")
  public Integer getFlagTitular() {
    return flagTitular;
  }
  public void setFlagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
  }

  
  /**
   * {{{cartao_response_id_pessoa_value}}}
   **/
  public CartaoResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{cartao_response_sequencial_cartao_value}}}
   **/
  public CartaoResponse sequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_sequencial_cartao_value}}}")
  @JsonProperty("sequencialCartao")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * {{{cartao_response_id_conta_value}}}
   **/
  public CartaoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{cartao_response_id_status_value}}}
   **/
  public CartaoResponse idStatus(Long idStatus) {
    this.idStatus = idStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_id_status_value}}}")
  @JsonProperty("idStatus")
  public Long getIdStatus() {
    return idStatus;
  }
  public void setIdStatus(Long idStatus) {
    this.idStatus = idStatus;
  }

  
  /**
   * {{{cartao_response_data_status_value}}}
   **/
  public CartaoResponse dataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{cartao_response_data_status_value}}}")
  @JsonProperty("dataStatus")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   * {{{cartao_response_id_estagio_value}}}
   **/
  public CartaoResponse idEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_id_estagio_value}}}")
  @JsonProperty("idEstagio")
  public Long getIdEstagio() {
    return idEstagio;
  }
  public void setIdEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
  }

  
  /**
   * {{{cartao_response_data_estagio_value}}}
   **/
  public CartaoResponse dataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{cartao_response_data_estagio_value}}}")
  @JsonProperty("dataEstagio")
  public String getDataEstagio() {
    return dataEstagio;
  }
  public void setDataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
  }

  
  /**
   * {{{cartao_response_numero_bin_value}}}
   **/
  public CartaoResponse numeroBin(Long numeroBin) {
    this.numeroBin = numeroBin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_numero_bin_value}}}")
  @JsonProperty("numeroBin")
  public Long getNumeroBin() {
    return numeroBin;
  }
  public void setNumeroBin(Long numeroBin) {
    this.numeroBin = numeroBin;
  }

  
  /**
   * {{{cartao_response_numero_cartao_value}}}
   **/
  public CartaoResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_numero_cartao_value}}}")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{cartao_response_numero_cartao_hash_value}}}
   **/
  public CartaoResponse numeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_numero_cartao_hash_value}}}")
  @JsonProperty("numeroCartaoHash")
  public Long getNumeroCartaoHash() {
    return numeroCartaoHash;
  }
  public void setNumeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
  }

  
  /**
   * {{{cartao_response_numero_cartao_criptografado_value}}}
   **/
  public CartaoResponse numeroCartaoCriptografado(String numeroCartaoCriptografado) {
    this.numeroCartaoCriptografado = numeroCartaoCriptografado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_numero_cartao_criptografado_value}}}")
  @JsonProperty("numeroCartaoCriptografado")
  public String getNumeroCartaoCriptografado() {
    return numeroCartaoCriptografado;
  }
  public void setNumeroCartaoCriptografado(String numeroCartaoCriptografado) {
    this.numeroCartaoCriptografado = numeroCartaoCriptografado;
  }

  
  /**
   * {{{cartao_response_data_emissao_value}}}
   **/
  public CartaoResponse dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{cartao_response_data_emissao_value}}}")
  @JsonProperty("dataEmissao")
  public String getDataEmissao() {
    return dataEmissao;
  }
  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  
  /**
   * {{{cartao_response_data_validade_value}}}
   **/
  public CartaoResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{cartao_response_data_validade_value}}}")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{cartao_response_cartao_virtual_value}}}
   **/
  public CartaoResponse cartaoVirtual(Integer cartaoVirtual) {
    this.cartaoVirtual = cartaoVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_cartao_virtual_value}}}")
  @JsonProperty("cartaoVirtual")
  public Integer getCartaoVirtual() {
    return cartaoVirtual;
  }
  public void setCartaoVirtual(Integer cartaoVirtual) {
    this.cartaoVirtual = cartaoVirtual;
  }

  
  /**
   * {{{cartao_response_impressao_avulsa_value}}}
   **/
  public CartaoResponse impressaoAvulsa(Integer impressaoAvulsa) {
    this.impressaoAvulsa = impressaoAvulsa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_impressao_avulsa_value}}}")
  @JsonProperty("impressaoAvulsa")
  public Integer getImpressaoAvulsa() {
    return impressaoAvulsa;
  }
  public void setImpressaoAvulsa(Integer impressaoAvulsa) {
    this.impressaoAvulsa = impressaoAvulsa;
  }

  
  /**
   * {{{cartao_response_data_impressao_value}}}
   **/
  public CartaoResponse dataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{cartao_response_data_impressao_value}}}")
  @JsonProperty("dataImpressao")
  public String getDataImpressao() {
    return dataImpressao;
  }
  public void setDataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
  }

  
  /**
   * {{{cartao_response_nome_arquivo_impressao_value}}}
   **/
  public CartaoResponse nomeArquivoImpressao(String nomeArquivoImpressao) {
    this.nomeArquivoImpressao = nomeArquivoImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_nome_arquivo_impressao_value}}}")
  @JsonProperty("nomeArquivoImpressao")
  public String getNomeArquivoImpressao() {
    return nomeArquivoImpressao;
  }
  public void setNomeArquivoImpressao(String nomeArquivoImpressao) {
    this.nomeArquivoImpressao = nomeArquivoImpressao;
  }

  
  /**
   * {{{cartao_response_id_produto_value}}}
   **/
  public CartaoResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{cartao_response_nome_impresso_value}}}
   **/
  public CartaoResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_nome_impresso_value}}}")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{cartao_response_codigo_desbloqueio_value}}}
   **/
  public CartaoResponse codigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_response_codigo_desbloqueio_value}}}")
  @JsonProperty("codigoDesbloqueio")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoResponse cartaoResponse = (CartaoResponse) o;
    return Objects.equals(this.id, cartaoResponse.id) &&
        Objects.equals(this.flagTitular, cartaoResponse.flagTitular) &&
        Objects.equals(this.idPessoa, cartaoResponse.idPessoa) &&
        Objects.equals(this.sequencialCartao, cartaoResponse.sequencialCartao) &&
        Objects.equals(this.idConta, cartaoResponse.idConta) &&
        Objects.equals(this.idStatus, cartaoResponse.idStatus) &&
        Objects.equals(this.dataStatus, cartaoResponse.dataStatus) &&
        Objects.equals(this.idEstagio, cartaoResponse.idEstagio) &&
        Objects.equals(this.dataEstagio, cartaoResponse.dataEstagio) &&
        Objects.equals(this.numeroBin, cartaoResponse.numeroBin) &&
        Objects.equals(this.numeroCartao, cartaoResponse.numeroCartao) &&
        Objects.equals(this.numeroCartaoHash, cartaoResponse.numeroCartaoHash) &&
        Objects.equals(this.numeroCartaoCriptografado, cartaoResponse.numeroCartaoCriptografado) &&
        Objects.equals(this.dataEmissao, cartaoResponse.dataEmissao) &&
        Objects.equals(this.dataValidade, cartaoResponse.dataValidade) &&
        Objects.equals(this.cartaoVirtual, cartaoResponse.cartaoVirtual) &&
        Objects.equals(this.impressaoAvulsa, cartaoResponse.impressaoAvulsa) &&
        Objects.equals(this.dataImpressao, cartaoResponse.dataImpressao) &&
        Objects.equals(this.nomeArquivoImpressao, cartaoResponse.nomeArquivoImpressao) &&
        Objects.equals(this.idProduto, cartaoResponse.idProduto) &&
        Objects.equals(this.nomeImpresso, cartaoResponse.nomeImpresso) &&
        Objects.equals(this.codigoDesbloqueio, cartaoResponse.codigoDesbloqueio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, flagTitular, idPessoa, sequencialCartao, idConta, idStatus, dataStatus, idEstagio, dataEstagio, numeroBin, numeroCartao, numeroCartaoHash, numeroCartaoCriptografado, dataEmissao, dataValidade, cartaoVirtual, impressaoAvulsa, dataImpressao, nomeArquivoImpressao, idProduto, nomeImpresso, codigoDesbloqueio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    flagTitular: ").append(toIndentedString(flagTitular)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    sequencialCartao: ").append(toIndentedString(sequencialCartao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idStatus: ").append(toIndentedString(idStatus)).append("\n");
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
    sb.append("    idEstagio: ").append(toIndentedString(idEstagio)).append("\n");
    sb.append("    dataEstagio: ").append(toIndentedString(dataEstagio)).append("\n");
    sb.append("    numeroBin: ").append(toIndentedString(numeroBin)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    numeroCartaoHash: ").append(toIndentedString(numeroCartaoHash)).append("\n");
    sb.append("    numeroCartaoCriptografado: ").append(toIndentedString(numeroCartaoCriptografado)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    cartaoVirtual: ").append(toIndentedString(cartaoVirtual)).append("\n");
    sb.append("    impressaoAvulsa: ").append(toIndentedString(impressaoAvulsa)).append("\n");
    sb.append("    dataImpressao: ").append(toIndentedString(dataImpressao)).append("\n");
    sb.append("    nomeArquivoImpressao: ").append(toIndentedString(nomeArquivoImpressao)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    codigoDesbloqueio: ").append(toIndentedString(codigoDesbloqueio)).append("\n");
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



