package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Transfer\u00C3\u00AAncia banc\u00C3\u00A1ria
 **/

@ApiModel(description = "Transfer\u00C3\u00AAncia banc\u00C3\u00A1ria")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaBancariaPersist   {
  
  private BigDecimal valorCompra = null;
  private BigDecimal valor = null;
  private String documentoFavorecido = null;
  private Long banco = null;
  private String numeroAgencia = null;
  private String digitoAgencia = null;
  private String numeroConta = null;
  private String digitoConta = null;
  private Integer flagContaPoupanca = null;
  private String nomeFavorecido = null;

  
  /**
   * Valor da transfer\u00C3\u00AAncia
   **/
  public TransferenciaBancariaPersist valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da transfer\u00C3\u00AAncia")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia
   **/
  public TransferenciaBancariaPersist valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da transfer\u00C3\u00AAncia")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * N\u00C3\u00BAmero do CPF ou CNPJ.
   **/
  public TransferenciaBancariaPersist documentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00C3\u00BAmero do CPF ou CNPJ.")
  @JsonProperty("documentoFavorecido")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * C\u00C3\u00B3digo do banco
   **/
  public TransferenciaBancariaPersist banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo do banco")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * N\u00C3\u00BAmero da ag\u00C3\u00AAncia
   **/
  public TransferenciaBancariaPersist numeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00C3\u00BAmero da ag\u00C3\u00AAncia")
  @JsonProperty("numeroAgencia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * D\u00C3\u00ADgito da ag\u00C3\u00AAncia
   **/
  public TransferenciaBancariaPersist digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00C3\u00ADgito da ag\u00C3\u00AAncia")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * N\u00C3\u00BAmero da conta
   **/
  public TransferenciaBancariaPersist numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00C3\u00BAmero da conta")
  @JsonProperty("numeroConta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * D\u00C3\u00ADgito da conta
   **/
  public TransferenciaBancariaPersist digitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00C3\u00ADgito da conta")
  @JsonProperty("digitoConta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Sinaliza se conta banc\u00C3\u00A1ria \u00C3\u00A9 poupan\u00C3\u00A7a (1: Poupan\u00C3\u00A7a, 0: Conta corrente)
   **/
  public TransferenciaBancariaPersist flagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sinaliza se conta banc\u00C3\u00A1ria \u00C3\u00A9 poupan\u00C3\u00A7a (1: Poupan\u00C3\u00A7a, 0: Conta corrente)")
  @JsonProperty("flagContaPoupanca")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)'.
   **/
  public TransferenciaBancariaPersist nomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)'.")
  @JsonProperty("nomeFavorecido")
  public String getNomeFavorecido() {
    return nomeFavorecido;
  }
  public void setNomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferenciaBancariaPersist transferenciaBancariaPersist = (TransferenciaBancariaPersist) o;
    return Objects.equals(this.valorCompra, transferenciaBancariaPersist.valorCompra) &&
        Objects.equals(this.valor, transferenciaBancariaPersist.valor) &&
        Objects.equals(this.documentoFavorecido, transferenciaBancariaPersist.documentoFavorecido) &&
        Objects.equals(this.banco, transferenciaBancariaPersist.banco) &&
        Objects.equals(this.numeroAgencia, transferenciaBancariaPersist.numeroAgencia) &&
        Objects.equals(this.digitoAgencia, transferenciaBancariaPersist.digitoAgencia) &&
        Objects.equals(this.numeroConta, transferenciaBancariaPersist.numeroConta) &&
        Objects.equals(this.digitoConta, transferenciaBancariaPersist.digitoConta) &&
        Objects.equals(this.flagContaPoupanca, transferenciaBancariaPersist.flagContaPoupanca) &&
        Objects.equals(this.nomeFavorecido, transferenciaBancariaPersist.nomeFavorecido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valorCompra, valor, documentoFavorecido, banco, numeroAgencia, digitoAgencia, numeroConta, digitoConta, flagContaPoupanca, nomeFavorecido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaBancariaPersist {\n");
    
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    documentoFavorecido: ").append(toIndentedString(documentoFavorecido)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    numeroConta: ").append(toIndentedString(numeroConta)).append("\n");
    sb.append("    digitoConta: ").append(toIndentedString(digitoConta)).append("\n");
    sb.append("    flagContaPoupanca: ").append(toIndentedString(flagContaPoupanca)).append("\n");
    sb.append("    nomeFavorecido: ").append(toIndentedString(nomeFavorecido)).append("\n");
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

