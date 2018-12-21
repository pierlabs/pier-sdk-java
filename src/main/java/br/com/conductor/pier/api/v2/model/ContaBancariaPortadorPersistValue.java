package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{conta_bancaria_portador_persist_description}}}
 **/

@ApiModel(description = "{{{conta_bancaria_portador_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaBancariaPortadorPersistValue   {
  
  private Long idConta = null;
  private String nomeAgencia = null;
  private Long banco = null;
  private String numeroAgencia = null;
  private String digitoAgencia = null;
  private String numeroConta = null;
  private String digitoConta = null;
  private Integer flagAtivo = null;
  private Integer flagContaOrigemDoc = null;
  private Long idPessoaFisica = null;
  private Integer flagContaPoupanca = null;
  private String favorecido = null;
  private String numeroReceiraFederal = null;
  private Integer titularidade = null;

  
  /**
   * {{{conta_bancaria_portador_persist_id_conta_value}}}
   **/
  public ContaBancariaPortadorPersistValue idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_persist_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_nome_agencia_value}}}
   **/
  public ContaBancariaPortadorPersistValue nomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_bancaria_portador_persist_nome_agencia_value}}}")
  @JsonProperty("nomeAgencia")
  public String getNomeAgencia() {
    return nomeAgencia;
  }
  public void setNomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_banco_value}}}
   **/
  public ContaBancariaPortadorPersistValue banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_persist_banco_value}}}")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_numero_agencia_value}}}
   **/
  public ContaBancariaPortadorPersistValue numeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_persist_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_digito_agencia_value}}}
   **/
  public ContaBancariaPortadorPersistValue digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_bancaria_portador_persist_digito_agencia_value}}}")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_numero_conta_value}}}
   **/
  public ContaBancariaPortadorPersistValue numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_persist_numero_conta_value}}}")
  @JsonProperty("numeroConta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_digito_conta_value}}}
   **/
  public ContaBancariaPortadorPersistValue digitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_bancaria_portador_persist_digito_conta_value}}}")
  @JsonProperty("digitoConta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_flag_ativo_value}}}
   **/
  public ContaBancariaPortadorPersistValue flagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_persist_flag_ativo_value}}}")
  @JsonProperty("flagAtivo")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_flag_conta_origem_doc_value}}}
   **/
  public ContaBancariaPortadorPersistValue flagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_persist_flag_conta_origem_doc_value}}}")
  @JsonProperty("flagContaOrigemDoc")
  public Integer getFlagContaOrigemDoc() {
    return flagContaOrigemDoc;
  }
  public void setFlagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_id_pessoa_fisica_value}}}
   **/
  public ContaBancariaPortadorPersistValue idPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_persist_id_pessoa_fisica_value}}}")
  @JsonProperty("idPessoaFisica")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_flag_conta_poupanca_value}}}
   **/
  public ContaBancariaPortadorPersistValue flagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_bancaria_portador_persist_flag_conta_poupanca_value}}}")
  @JsonProperty("flagContaPoupanca")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_favorecido_value}}}
   **/
  public ContaBancariaPortadorPersistValue favorecido(String favorecido) {
    this.favorecido = favorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_bancaria_portador_persist_favorecido_value}}}")
  @JsonProperty("favorecido")
  public String getFavorecido() {
    return favorecido;
  }
  public void setFavorecido(String favorecido) {
    this.favorecido = favorecido;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_numero_receira_federal_value}}}
   **/
  public ContaBancariaPortadorPersistValue numeroReceiraFederal(String numeroReceiraFederal) {
    this.numeroReceiraFederal = numeroReceiraFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_bancaria_portador_persist_numero_receira_federal_value}}}")
  @JsonProperty("numeroReceiraFederal")
  public String getNumeroReceiraFederal() {
    return numeroReceiraFederal;
  }
  public void setNumeroReceiraFederal(String numeroReceiraFederal) {
    this.numeroReceiraFederal = numeroReceiraFederal;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_titularidade_value}}}
   **/
  public ContaBancariaPortadorPersistValue titularidade(Integer titularidade) {
    this.titularidade = titularidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_bancaria_portador_persist_titularidade_value}}}")
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
    ContaBancariaPortadorPersistValue contaBancariaPortadorPersistValue = (ContaBancariaPortadorPersistValue) o;
    return Objects.equals(this.idConta, contaBancariaPortadorPersistValue.idConta) &&
        Objects.equals(this.nomeAgencia, contaBancariaPortadorPersistValue.nomeAgencia) &&
        Objects.equals(this.banco, contaBancariaPortadorPersistValue.banco) &&
        Objects.equals(this.numeroAgencia, contaBancariaPortadorPersistValue.numeroAgencia) &&
        Objects.equals(this.digitoAgencia, contaBancariaPortadorPersistValue.digitoAgencia) &&
        Objects.equals(this.numeroConta, contaBancariaPortadorPersistValue.numeroConta) &&
        Objects.equals(this.digitoConta, contaBancariaPortadorPersistValue.digitoConta) &&
        Objects.equals(this.flagAtivo, contaBancariaPortadorPersistValue.flagAtivo) &&
        Objects.equals(this.flagContaOrigemDoc, contaBancariaPortadorPersistValue.flagContaOrigemDoc) &&
        Objects.equals(this.idPessoaFisica, contaBancariaPortadorPersistValue.idPessoaFisica) &&
        Objects.equals(this.flagContaPoupanca, contaBancariaPortadorPersistValue.flagContaPoupanca) &&
        Objects.equals(this.favorecido, contaBancariaPortadorPersistValue.favorecido) &&
        Objects.equals(this.numeroReceiraFederal, contaBancariaPortadorPersistValue.numeroReceiraFederal) &&
        Objects.equals(this.titularidade, contaBancariaPortadorPersistValue.titularidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, nomeAgencia, banco, numeroAgencia, digitoAgencia, numeroConta, digitoConta, flagAtivo, flagContaOrigemDoc, idPessoaFisica, flagContaPoupanca, favorecido, numeroReceiraFederal, titularidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaBancariaPortadorPersistValue {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    nomeAgencia: ").append(toIndentedString(nomeAgencia)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    numeroConta: ").append(toIndentedString(numeroConta)).append("\n");
    sb.append("    digitoConta: ").append(toIndentedString(digitoConta)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    flagContaOrigemDoc: ").append(toIndentedString(flagContaOrigemDoc)).append("\n");
    sb.append("    idPessoaFisica: ").append(toIndentedString(idPessoaFisica)).append("\n");
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

