package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object Card with more information
 **/

@ApiModel(description = "Object Card with more information")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoDetalheResponse   {
  
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
  private String descricaoTipoCartao = null;
  private Long idProduto = null;
  private String nomeImpresso = null;
  private Long tipoCartao = null;
  private String codigoDesbloqueio = null;

  
  /**
   * Identification Code of the Card
   **/
  public CartaoDetalheResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Card")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Show the tiype of the Cardholder, being: (1: Holder, 0: Additional)
   **/
  public CartaoDetalheResponse flagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the tiype of the Cardholder, being: (1: Holder, 0: Additional)")
  @JsonProperty("flagTitular")
  public Integer getFlagTitular() {
    return flagTitular;
  }
  public void setFlagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
  }

  
  /**
   * Identification Code of the Person which the card belongs
   **/
  public CartaoDetalheResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Person which the card belongs")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Card Sequel Number
   **/
  public CartaoDetalheResponse sequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Card Sequel Number")
  @JsonProperty("sequencialCartao")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * Identification Code of the Account which the card belongs
   **/
  public CartaoDetalheResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Account which the card belongs")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Card Status
   **/
  public CartaoDetalheResponse idStatus(Long idStatus) {
    this.idStatus = idStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Card Status")
  @JsonProperty("idStatus")
  public Long getIdStatus() {
    return idStatus;
  }
  public void setIdStatus(Long idStatus) {
    this.idStatus = idStatus;
  }

  
  /**
   * Show the date which the current idStatusCard was applied, when there is
   **/
  public CartaoDetalheResponse dataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Show the date which the current idStatusCard was applied, when there is")
  @JsonProperty("dataStatus")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   * Identification Code of the Stage Printed Card
   **/
  public CartaoDetalheResponse idEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Stage Printed Card")
  @JsonProperty("idEstagio")
  public Long getIdEstagio() {
    return idEstagio;
  }
  public void setIdEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
  }

  
  /**
   * Show te date which the current idStage of the card applied, when there is
   **/
  public CartaoDetalheResponse dataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Show te date which the current idStage of the card applied, when there is")
  @JsonProperty("dataEstagio")
  public String getDataEstagio() {
    return dataEstagio;
  }
  public void setDataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
  }

  
  /**
   * Bin number of the card
   **/
  public CartaoDetalheResponse numeroBin(Long numeroBin) {
    this.numeroBin = numeroBin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bin number of the card")
  @JsonProperty("numeroBin")
  public Long getNumeroBin() {
    return numeroBin;
  }
  public void setNumeroBin(Long numeroBin) {
    this.numeroBin = numeroBin;
  }

  
  /**
   * Show the card number
   **/
  public CartaoDetalheResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the card number")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Hash Card Number
   **/
  public CartaoDetalheResponse numeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hash Card Number")
  @JsonProperty("numeroCartaoHash")
  public Long getNumeroCartaoHash() {
    return numeroCartaoHash;
  }
  public void setNumeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
  }

  
  /**
   * Encrypted Card Number
   **/
  public CartaoDetalheResponse numeroCartaoCriptografado(String numeroCartaoCriptografado) {
    this.numeroCartaoCriptografado = numeroCartaoCriptografado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Encrypted Card Number")
  @JsonProperty("numeroCartaoCriptografado")
  public String getNumeroCartaoCriptografado() {
    return numeroCartaoCriptografado;
  }
  public void setNumeroCartaoCriptografado(String numeroCartaoCriptografado) {
    this.numeroCartaoCriptografado = numeroCartaoCriptografado;
  }

  
  /**
   * Show the issue date of the card
   **/
  public CartaoDetalheResponse dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Show the issue date of the card")
  @JsonProperty("dataEmissao")
  public String getDataEmissao() {
    return dataEmissao;
  }
  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  
  /**
   * Show the Expiration date of the card in the format yyyy-MM, when there is
   **/
  public CartaoDetalheResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Show the Expiration date of the card in the format yyyy-MM, when there is")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Show the status that informs if the card is virtual, being: (1: True, 0: False)
   **/
  public CartaoDetalheResponse cartaoVirtual(Integer cartaoVirtual) {
    this.cartaoVirtual = cartaoVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the status that informs if the card is virtual, being: (1: True, 0: False)")
  @JsonProperty("cartaoVirtual")
  public Integer getCartaoVirtual() {
    return cartaoVirtual;
  }
  public void setCartaoVirtual(Integer cartaoVirtual) {
    this.cartaoVirtual = cartaoVirtual;
  }

  
  /**
   * When it is active, indicates that the card was printed in the Commercial Origin
   **/
  public CartaoDetalheResponse impressaoAvulsa(Integer impressaoAvulsa) {
    this.impressaoAvulsa = impressaoAvulsa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When it is active, indicates that the card was printed in the Commercial Origin")
  @JsonProperty("impressaoAvulsa")
  public Integer getImpressaoAvulsa() {
    return impressaoAvulsa;
  }
  public void setImpressaoAvulsa(Integer impressaoAvulsa) {
    this.impressaoAvulsa = impressaoAvulsa;
  }

  
  /**
   * Show the date of the card that was printed, in case of printing in a store, or the date which was included in the file for printing in a Graphic
   **/
  public CartaoDetalheResponse dataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Show the date of the card that was printed, in case of printing in a store, or the date which was included in the file for printing in a Graphic")
  @JsonProperty("dataImpressao")
  public String getDataImpressao() {
    return dataImpressao;
  }
  public void setDataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
  }

  
  /**
   * Show the name of the file where the card was included for printing, when there is
   **/
  public CartaoDetalheResponse nomeArquivoImpressao(String nomeArquivoImpressao) {
    this.nomeArquivoImpressao = nomeArquivoImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the name of the file where the card was included for printing, when there is")
  @JsonProperty("nomeArquivoImpressao")
  public String getNomeArquivoImpressao() {
    return nomeArquivoImpressao;
  }
  public void setNomeArquivoImpressao(String nomeArquivoImpressao) {
    this.nomeArquivoImpressao = nomeArquivoImpressao;
  }

  
  /**
   * Describe the type of the card
   **/
  public CartaoDetalheResponse descricaoTipoCartao(String descricaoTipoCartao) {
    this.descricaoTipoCartao = descricaoTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describe the type of the card")
  @JsonProperty("descricaoTipoCartao")
  public String getDescricaoTipoCartao() {
    return descricaoTipoCartao;
  }
  public void setDescricaoTipoCartao(String descricaoTipoCartao) {
    this.descricaoTipoCartao = descricaoTipoCartao;
  }

  
  /**
   * Identification Code of the Product which the card belongs
   **/
  public CartaoDetalheResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Product which the card belongs")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Show the name printed on the card
   **/
  public CartaoDetalheResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the name printed on the card")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Indicate the identifier of the card type
   **/
  public CartaoDetalheResponse tipoCartao(Long tipoCartao) {
    this.tipoCartao = tipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicate the identifier of the card type")
  @JsonProperty("tipoCartao")
  public Long getTipoCartao() {
    return tipoCartao;
  }
  public void setTipoCartao(Long tipoCartao) {
    this.tipoCartao = tipoCartao;
  }

  
  /**
   * Show a specific code to be used as a variable in the process of unlock the card for issuer that want to use this functionality
   **/
  public CartaoDetalheResponse codigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show a specific code to be used as a variable in the process of unlock the card for issuer that want to use this functionality")
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
    CartaoDetalheResponse cartaoDetalheResponse = (CartaoDetalheResponse) o;
    return Objects.equals(this.id, cartaoDetalheResponse.id) &&
        Objects.equals(this.flagTitular, cartaoDetalheResponse.flagTitular) &&
        Objects.equals(this.idPessoa, cartaoDetalheResponse.idPessoa) &&
        Objects.equals(this.sequencialCartao, cartaoDetalheResponse.sequencialCartao) &&
        Objects.equals(this.idConta, cartaoDetalheResponse.idConta) &&
        Objects.equals(this.idStatus, cartaoDetalheResponse.idStatus) &&
        Objects.equals(this.dataStatus, cartaoDetalheResponse.dataStatus) &&
        Objects.equals(this.idEstagio, cartaoDetalheResponse.idEstagio) &&
        Objects.equals(this.dataEstagio, cartaoDetalheResponse.dataEstagio) &&
        Objects.equals(this.numeroBin, cartaoDetalheResponse.numeroBin) &&
        Objects.equals(this.numeroCartao, cartaoDetalheResponse.numeroCartao) &&
        Objects.equals(this.numeroCartaoHash, cartaoDetalheResponse.numeroCartaoHash) &&
        Objects.equals(this.numeroCartaoCriptografado, cartaoDetalheResponse.numeroCartaoCriptografado) &&
        Objects.equals(this.dataEmissao, cartaoDetalheResponse.dataEmissao) &&
        Objects.equals(this.dataValidade, cartaoDetalheResponse.dataValidade) &&
        Objects.equals(this.cartaoVirtual, cartaoDetalheResponse.cartaoVirtual) &&
        Objects.equals(this.impressaoAvulsa, cartaoDetalheResponse.impressaoAvulsa) &&
        Objects.equals(this.dataImpressao, cartaoDetalheResponse.dataImpressao) &&
        Objects.equals(this.nomeArquivoImpressao, cartaoDetalheResponse.nomeArquivoImpressao) &&
        Objects.equals(this.descricaoTipoCartao, cartaoDetalheResponse.descricaoTipoCartao) &&
        Objects.equals(this.idProduto, cartaoDetalheResponse.idProduto) &&
        Objects.equals(this.nomeImpresso, cartaoDetalheResponse.nomeImpresso) &&
        Objects.equals(this.tipoCartao, cartaoDetalheResponse.tipoCartao) &&
        Objects.equals(this.codigoDesbloqueio, cartaoDetalheResponse.codigoDesbloqueio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, flagTitular, idPessoa, sequencialCartao, idConta, idStatus, dataStatus, idEstagio, dataEstagio, numeroBin, numeroCartao, numeroCartaoHash, numeroCartaoCriptografado, dataEmissao, dataValidade, cartaoVirtual, impressaoAvulsa, dataImpressao, nomeArquivoImpressao, descricaoTipoCartao, idProduto, nomeImpresso, tipoCartao, codigoDesbloqueio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoDetalheResponse {\n");
    
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
    sb.append("    descricaoTipoCartao: ").append(toIndentedString(descricaoTipoCartao)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    tipoCartao: ").append(toIndentedString(tipoCartao)).append("\n");
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

