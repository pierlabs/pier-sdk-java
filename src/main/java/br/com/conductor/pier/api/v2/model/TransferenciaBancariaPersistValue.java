package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{transferencia_bancaria_persist_description}}}
 **/

@ApiModel(description = "{{{transferencia_bancaria_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaBancariaPersistValue   {
  
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
   * {{{transferencia_bancaria_persist_valor_compra_value}}}
   **/
  public TransferenciaBancariaPersistValue valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_bancaria_persist_valor_compra_value}}}")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * {{{transferencia_bancaria_persist_valor_value}}}
   **/
  public TransferenciaBancariaPersistValue valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_bancaria_persist_valor_value}}}")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{transferencia_bancaria_persist_documento_favorecido_value}}}
   **/
  public TransferenciaBancariaPersistValue documentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_bancaria_persist_documento_favorecido_value}}}")
  @JsonProperty("documentoFavorecido")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * {{{transferencia_bancaria_persist_banco_value}}}
   **/
  public TransferenciaBancariaPersistValue banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_bancaria_persist_banco_value}}}")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * {{{transferencia_bancaria_persist_numero_agencia_value}}}
   **/
  public TransferenciaBancariaPersistValue numeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_bancaria_persist_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{transferencia_bancaria_persist_digito_agencia_value}}}
   **/
  public TransferenciaBancariaPersistValue digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_persist_digito_agencia_value}}}")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{transferencia_bancaria_persist_numero_conta_value}}}
   **/
  public TransferenciaBancariaPersistValue numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_bancaria_persist_numero_conta_value}}}")
  @JsonProperty("numeroConta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * {{{transferencia_bancaria_persist_digito_conta_value}}}
   **/
  public TransferenciaBancariaPersistValue digitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_persist_digito_conta_value}}}")
  @JsonProperty("digitoConta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * {{{transferencia_bancaria_persist_flag_conta_poupanca_value}}}
   **/
  public TransferenciaBancariaPersistValue flagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_bancaria_persist_flag_conta_poupanca_value}}}")
  @JsonProperty("flagContaPoupanca")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * {{{transferencia_bancaria_persist_nome_favorecido_value}}}
   **/
  public TransferenciaBancariaPersistValue nomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_bancaria_persist_nome_favorecido_value}}}")
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
    TransferenciaBancariaPersistValue transferenciaBancariaPersistValue = (TransferenciaBancariaPersistValue) o;
    return Objects.equals(this.valorCompra, transferenciaBancariaPersistValue.valorCompra) &&
        Objects.equals(this.valor, transferenciaBancariaPersistValue.valor) &&
        Objects.equals(this.documentoFavorecido, transferenciaBancariaPersistValue.documentoFavorecido) &&
        Objects.equals(this.banco, transferenciaBancariaPersistValue.banco) &&
        Objects.equals(this.numeroAgencia, transferenciaBancariaPersistValue.numeroAgencia) &&
        Objects.equals(this.digitoAgencia, transferenciaBancariaPersistValue.digitoAgencia) &&
        Objects.equals(this.numeroConta, transferenciaBancariaPersistValue.numeroConta) &&
        Objects.equals(this.digitoConta, transferenciaBancariaPersistValue.digitoConta) &&
        Objects.equals(this.flagContaPoupanca, transferenciaBancariaPersistValue.flagContaPoupanca) &&
        Objects.equals(this.nomeFavorecido, transferenciaBancariaPersistValue.nomeFavorecido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valorCompra, valor, documentoFavorecido, banco, numeroAgencia, digitoAgencia, numeroConta, digitoConta, flagContaPoupanca, nomeFavorecido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaBancariaPersistValue {\n");
    
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

