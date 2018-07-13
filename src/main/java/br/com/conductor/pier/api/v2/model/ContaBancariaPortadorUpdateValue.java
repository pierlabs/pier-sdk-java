package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{conta_bancaria_portador_update_description}}}
 **/

@ApiModel(description = "{{{conta_bancaria_portador_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaBancariaPortadorUpdateValue   {
  
  private String nomeAgencia = null;
  private Long banco = null;
  private String numeroAgencia = null;
  private String digitoAgencia = null;
  private String numeroConta = null;
  private String digitoConta = null;
  private Integer flagAtivo = null;
  private Integer flagContaOrigemDoc = null;
  private Integer flagContaPoupanca = null;
  private String favorecido = null;
  private String numeroReceiraFederal = null;
  private Integer titularidade = null;

  
  /**
   * {{{conta_bancaria_portador_update_nome_agencia_value}}}
   **/
  public ContaBancariaPortadorUpdateValue nomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_bancaria_portador_update_nome_agencia_value}}}")
  @JsonProperty("nomeAgencia")
  public String getNomeAgencia() {
    return nomeAgencia;
  }
  public void setNomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
  }

  
  /**
   * {{{conta_bancaria_portador_update_banco_value}}}
   **/
  public ContaBancariaPortadorUpdateValue banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_update_banco_value}}}")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * {{{conta_bancaria_portador_update_numero_agencia_value}}}
   **/
  public ContaBancariaPortadorUpdateValue numeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_update_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{conta_bancaria_portador_update_digito_agencia_value}}}
   **/
  public ContaBancariaPortadorUpdateValue digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_bancaria_portador_update_digito_agencia_value}}}")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{conta_bancaria_portador_update_numero_conta_value}}}
   **/
  public ContaBancariaPortadorUpdateValue numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_update_numero_conta_value}}}")
  @JsonProperty("numeroConta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * {{{conta_bancaria_portador_update_digito_conta_value}}}
   **/
  public ContaBancariaPortadorUpdateValue digitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_bancaria_portador_update_digito_conta_value}}}")
  @JsonProperty("digitoConta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * {{{conta_bancaria_portador_update_flag_ativo_value}}}
   **/
  public ContaBancariaPortadorUpdateValue flagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_update_flag_ativo_value}}}")
  @JsonProperty("flagAtivo")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{conta_bancaria_portador_update_flag_conta_origem_doc_value}}}
   **/
  public ContaBancariaPortadorUpdateValue flagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_update_flag_conta_origem_doc_value}}}")
  @JsonProperty("flagContaOrigemDoc")
  public Integer getFlagContaOrigemDoc() {
    return flagContaOrigemDoc;
  }
  public void setFlagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
  }

  
  /**
   * {{{conta_bancaria_portador_update_flag_conta_poupanca_value}}}
   **/
  public ContaBancariaPortadorUpdateValue flagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_update_flag_conta_poupanca_value}}}")
  @JsonProperty("flagContaPoupanca")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * {{{conta_bancaria_portador_update_favorecido_value}}}
   **/
  public ContaBancariaPortadorUpdateValue favorecido(String favorecido) {
    this.favorecido = favorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_update_favorecido_value}}}")
  @JsonProperty("favorecido")
  public String getFavorecido() {
    return favorecido;
  }
  public void setFavorecido(String favorecido) {
    this.favorecido = favorecido;
  }

  
  /**
   * {{{conta_bancaria_portador_update_numero_receira_federal_value}}}
   **/
  public ContaBancariaPortadorUpdateValue numeroReceiraFederal(String numeroReceiraFederal) {
    this.numeroReceiraFederal = numeroReceiraFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_update_numero_receira_federal_value}}}")
  @JsonProperty("numeroReceiraFederal")
  public String getNumeroReceiraFederal() {
    return numeroReceiraFederal;
  }
  public void setNumeroReceiraFederal(String numeroReceiraFederal) {
    this.numeroReceiraFederal = numeroReceiraFederal;
  }

  
  /**
   * {{{conta_bancaria_portador_update_titularidade_value}}}
   **/
  public ContaBancariaPortadorUpdateValue titularidade(Integer titularidade) {
    this.titularidade = titularidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_bancaria_portador_update_titularidade_value}}}")
  @JsonProperty("titularidade")
  public Integer getTitularidade() {
    return titularidade;
  }
  public void setTitularidade(Integer titularidade) {
    this.titularidade = titularidade;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaBancariaPortadorUpdateValue contaBancariaPortadorUpdateValue = (ContaBancariaPortadorUpdateValue) o;
    return Objects.equals(this.nomeAgencia, contaBancariaPortadorUpdateValue.nomeAgencia) &&
        Objects.equals(this.banco, contaBancariaPortadorUpdateValue.banco) &&
        Objects.equals(this.numeroAgencia, contaBancariaPortadorUpdateValue.numeroAgencia) &&
        Objects.equals(this.digitoAgencia, contaBancariaPortadorUpdateValue.digitoAgencia) &&
        Objects.equals(this.numeroConta, contaBancariaPortadorUpdateValue.numeroConta) &&
        Objects.equals(this.digitoConta, contaBancariaPortadorUpdateValue.digitoConta) &&
        Objects.equals(this.flagAtivo, contaBancariaPortadorUpdateValue.flagAtivo) &&
        Objects.equals(this.flagContaOrigemDoc, contaBancariaPortadorUpdateValue.flagContaOrigemDoc) &&
        Objects.equals(this.flagContaPoupanca, contaBancariaPortadorUpdateValue.flagContaPoupanca) &&
        Objects.equals(this.favorecido, contaBancariaPortadorUpdateValue.favorecido) &&
        Objects.equals(this.numeroReceiraFederal, contaBancariaPortadorUpdateValue.numeroReceiraFederal) &&
        Objects.equals(this.titularidade, contaBancariaPortadorUpdateValue.titularidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeAgencia, banco, numeroAgencia, digitoAgencia, numeroConta, digitoConta, flagAtivo, flagContaOrigemDoc, flagContaPoupanca, favorecido, numeroReceiraFederal, titularidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaBancariaPortadorUpdateValue {\n");
    
    sb.append("    nomeAgencia: ").append(toIndentedString(nomeAgencia)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    numeroConta: ").append(toIndentedString(numeroConta)).append("\n");
    sb.append("    digitoConta: ").append(toIndentedString(digitoConta)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    flagContaOrigemDoc: ").append(toIndentedString(flagContaOrigemDoc)).append("\n");
    sb.append("    flagContaPoupanca: ").append(toIndentedString(flagContaPoupanca)).append("\n");
    sb.append("    favorecido: ").append(toIndentedString(favorecido)).append("\n");
    sb.append("    numeroReceiraFederal: ").append(toIndentedString(numeroReceiraFederal)).append("\n");
    sb.append("    titularidade: ").append(toIndentedString(titularidade)).append("\n");
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



