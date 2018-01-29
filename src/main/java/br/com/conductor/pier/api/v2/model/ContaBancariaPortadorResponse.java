package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaBancariaPortadorResponse   {
  
  private Long id = null;
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
   * C\u00C3\u00B3digo identificador da conta banc\u00C3\u00A1ria
   **/
  public ContaBancariaPortadorResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da conta banc\u00C3\u00A1ria")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta cart\u00C3\u00A3o
   **/
  public ContaBancariaPortadorResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da conta cart\u00C3\u00A3o")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o da ag\u00C3\u00AAncia
   **/
  public ContaBancariaPortadorResponse nomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o da ag\u00C3\u00AAncia")
  @JsonProperty("nomeAgencia")
  public String getNomeAgencia() {
    return nomeAgencia;
  }
  public void setNomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
  }

  
  /**
   * C\u00C3\u00B3digo do banco
   **/
  public ContaBancariaPortadorResponse banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo do banco")
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
  public ContaBancariaPortadorResponse numeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da ag\u00C3\u00AAncia")
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
  public ContaBancariaPortadorResponse digitoAgencia(String digitoAgencia) {
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
  public ContaBancariaPortadorResponse numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da conta")
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
  public ContaBancariaPortadorResponse digitoConta(String digitoConta) {
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
   * Sinaliza se conta banc\u00C3\u00A1ria est\u00C3\u00A1 ativa ou n\u00C3\u00A3o (1: Ativa, 0: Inativa)
   **/
  public ContaBancariaPortadorResponse flagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sinaliza se conta banc\u00C3\u00A1ria est\u00C3\u00A1 ativa ou n\u00C3\u00A3o (1: Ativa, 0: Inativa)")
  @JsonProperty("flagAtivo")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Sinaliza se origem \u00C3\u00A9 DOC (1: DOC, 0: TED)
   **/
  public ContaBancariaPortadorResponse flagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sinaliza se origem \u00C3\u00A9 DOC (1: DOC, 0: TED)")
  @JsonProperty("flagContaOrigemDoc")
  public Integer getFlagContaOrigemDoc() {
    return flagContaOrigemDoc;
  }
  public void setFlagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
  }

  
  /**
   * C\u00C3\u00B3digo da pessoa
   **/
  public ContaBancariaPortadorResponse idPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo da pessoa")
  @JsonProperty("idPessoaFisica")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * Sinaliza se conta banc\u00C3\u00A1ria \u00C3\u00A9 poupan\u00C3\u00A7a (1: Poupan\u00C3\u00A7a, 0: Conta corrente)
   **/
  public ContaBancariaPortadorResponse flagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sinaliza se conta banc\u00C3\u00A1ria \u00C3\u00A9 poupan\u00C3\u00A7a (1: Poupan\u00C3\u00A7a, 0: Conta corrente)")
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
  public ContaBancariaPortadorResponse favorecido(String favorecido) {
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
  public ContaBancariaPortadorResponse numeroReceiraFederal(String numeroReceiraFederal) {
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
   * Titularidade da conta (1:Portador \u00C3\u00A9 o titular, 0: Portador n\u00C3\u00A3o \u00C3\u00A9 o t\u00C3\u00ADtular
   **/
  public ContaBancariaPortadorResponse titularidade(Integer titularidade) {
    this.titularidade = titularidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Titularidade da conta (1:Portador \u00C3\u00A9 o titular, 0: Portador n\u00C3\u00A3o \u00C3\u00A9 o t\u00C3\u00ADtular")
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
    ContaBancariaPortadorResponse contaBancariaPortadorResponse = (ContaBancariaPortadorResponse) o;
    return Objects.equals(this.id, contaBancariaPortadorResponse.id) &&
        Objects.equals(this.idConta, contaBancariaPortadorResponse.idConta) &&
        Objects.equals(this.nomeAgencia, contaBancariaPortadorResponse.nomeAgencia) &&
        Objects.equals(this.banco, contaBancariaPortadorResponse.banco) &&
        Objects.equals(this.numeroAgencia, contaBancariaPortadorResponse.numeroAgencia) &&
        Objects.equals(this.digitoAgencia, contaBancariaPortadorResponse.digitoAgencia) &&
        Objects.equals(this.numeroConta, contaBancariaPortadorResponse.numeroConta) &&
        Objects.equals(this.digitoConta, contaBancariaPortadorResponse.digitoConta) &&
        Objects.equals(this.flagAtivo, contaBancariaPortadorResponse.flagAtivo) &&
        Objects.equals(this.flagContaOrigemDoc, contaBancariaPortadorResponse.flagContaOrigemDoc) &&
        Objects.equals(this.idPessoaFisica, contaBancariaPortadorResponse.idPessoaFisica) &&
        Objects.equals(this.flagContaPoupanca, contaBancariaPortadorResponse.flagContaPoupanca) &&
        Objects.equals(this.favorecido, contaBancariaPortadorResponse.favorecido) &&
        Objects.equals(this.numeroReceiraFederal, contaBancariaPortadorResponse.numeroReceiraFederal) &&
        Objects.equals(this.titularidade, contaBancariaPortadorResponse.titularidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, nomeAgencia, banco, numeroAgencia, digitoAgencia, numeroConta, digitoConta, flagAtivo, flagContaOrigemDoc, idPessoaFisica, flagContaPoupanca, favorecido, numeroReceiraFederal, titularidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaBancariaPortadorResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

