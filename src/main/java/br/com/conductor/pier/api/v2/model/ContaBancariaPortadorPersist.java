package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * ContaBancariaPortadorPersist
 **/

@ApiModel(description = "ContaBancariaPortadorPersist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaBancariaPortadorPersist   {
  
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
   * C\u00F3digo identificador da conta cart\u00E3o
   **/
  public ContaBancariaPortadorPersist idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador da conta cart\u00E3o")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Descri\u00E7\u00E3o da ag\u00EAncia
   **/
  public ContaBancariaPortadorPersist nomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o da ag\u00EAncia")
  @JsonProperty("nomeAgencia")
  public String getNomeAgencia() {
    return nomeAgencia;
  }
  public void setNomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
  }

  
  /**
   * C\u00F3digo do banco
   **/
  public ContaBancariaPortadorPersist banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo do banco")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia
   **/
  public ContaBancariaPortadorPersist numeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero da ag\u00EAncia")
  @JsonProperty("numeroAgencia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * D\u00EDgito da ag\u00EAncia
   **/
  public ContaBancariaPortadorPersist digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00EDgito da ag\u00EAncia")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * N\u00FAmero da conta
   **/
  public ContaBancariaPortadorPersist numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero da conta")
  @JsonProperty("numeroConta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * D\u00EDgito da conta
   **/
  public ContaBancariaPortadorPersist digitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00EDgito da conta")
  @JsonProperty("digitoConta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Sinaliza se conta banc\u00E1ria est\u00E1 ativa ou n\u00E3o (1: Ativa, 0: Inativa)
   **/
  public ContaBancariaPortadorPersist flagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sinaliza se conta banc\u00E1ria est\u00E1 ativa ou n\u00E3o (1: Ativa, 0: Inativa)")
  @JsonProperty("flagAtivo")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Sinaliza se origem \u00E9 DOC (1: DOC, 0: TED)
   **/
  public ContaBancariaPortadorPersist flagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sinaliza se origem \u00E9 DOC (1: DOC, 0: TED)")
  @JsonProperty("flagContaOrigemDoc")
  public Integer getFlagContaOrigemDoc() {
    return flagContaOrigemDoc;
  }
  public void setFlagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
  }

  
  /**
   * C\u00F3digo da pessoa
   **/
  public ContaBancariaPortadorPersist idPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo da pessoa")
  @JsonProperty("idPessoaFisica")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * Sinaliza se conta banc\u00E1ria \u00E9 poupan\u00E7a (1: Poupan\u00E7a, 0: Conta corrente)
   **/
  public ContaBancariaPortadorPersist flagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sinaliza se conta banc\u00E1ria \u00E9 poupan\u00E7a (1: Poupan\u00E7a, 0: Conta corrente)")
  @JsonProperty("flagContaPoupanca")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Nome do favorecido
   **/
  public ContaBancariaPortadorPersist favorecido(String favorecido) {
    this.favorecido = favorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do favorecido")
  @JsonProperty("favorecido")
  public String getFavorecido() {
    return favorecido;
  }
  public void setFavorecido(String favorecido) {
    this.favorecido = favorecido;
  }

  
  /**
   * Documento do favorecido
   **/
  public ContaBancariaPortadorPersist numeroReceiraFederal(String numeroReceiraFederal) {
    this.numeroReceiraFederal = numeroReceiraFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Documento do favorecido")
  @JsonProperty("numeroReceiraFederal")
  public String getNumeroReceiraFederal() {
    return numeroReceiraFederal;
  }
  public void setNumeroReceiraFederal(String numeroReceiraFederal) {
    this.numeroReceiraFederal = numeroReceiraFederal;
  }

  
  /**
   * Titularidade da conta (1:Portador \u00E9 o titular, 0: Portador n\u00E3o \u00E9 o t\u00EDtular
   **/
  public ContaBancariaPortadorPersist titularidade(Integer titularidade) {
    this.titularidade = titularidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Titularidade da conta (1:Portador \u00E9 o titular, 0: Portador n\u00E3o \u00E9 o t\u00EDtular")
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
    ContaBancariaPortadorPersist contaBancariaPortadorPersist = (ContaBancariaPortadorPersist) o;
    return Objects.equals(this.idConta, contaBancariaPortadorPersist.idConta) &&
        Objects.equals(this.nomeAgencia, contaBancariaPortadorPersist.nomeAgencia) &&
        Objects.equals(this.banco, contaBancariaPortadorPersist.banco) &&
        Objects.equals(this.numeroAgencia, contaBancariaPortadorPersist.numeroAgencia) &&
        Objects.equals(this.digitoAgencia, contaBancariaPortadorPersist.digitoAgencia) &&
        Objects.equals(this.numeroConta, contaBancariaPortadorPersist.numeroConta) &&
        Objects.equals(this.digitoConta, contaBancariaPortadorPersist.digitoConta) &&
        Objects.equals(this.flagAtivo, contaBancariaPortadorPersist.flagAtivo) &&
        Objects.equals(this.flagContaOrigemDoc, contaBancariaPortadorPersist.flagContaOrigemDoc) &&
        Objects.equals(this.idPessoaFisica, contaBancariaPortadorPersist.idPessoaFisica) &&
        Objects.equals(this.flagContaPoupanca, contaBancariaPortadorPersist.flagContaPoupanca) &&
        Objects.equals(this.favorecido, contaBancariaPortadorPersist.favorecido) &&
        Objects.equals(this.numeroReceiraFederal, contaBancariaPortadorPersist.numeroReceiraFederal) &&
        Objects.equals(this.titularidade, contaBancariaPortadorPersist.titularidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, nomeAgencia, banco, numeroAgencia, digitoAgencia, numeroConta, digitoConta, flagAtivo, flagContaOrigemDoc, idPessoaFisica, flagContaPoupanca, favorecido, numeroReceiraFederal, titularidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaBancariaPortadorPersist {\n");
    
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

