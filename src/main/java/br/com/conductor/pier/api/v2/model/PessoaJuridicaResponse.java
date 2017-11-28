package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de pessoa jur\u00C3\u00ADdica
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de pessoa jur\u00C3\u00ADdica")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaJuridicaResponse   {
  
  private Long id = null;
  private String razaoSocial = null;
  private String cnpj = null;
  private String inscricaoEstadual = null;
  private String contato = null;
  private Integer banco = null;
  private Integer agencia = null;
  private String digitoVerificadorAgencia = null;
  private String contaCorrente = null;
  private String digitoVerificadorContaCorrente = null;
  private String usuario = null;

  
  /**
   * C\u00C3\u00B3digo identificador da pessoa jur\u00C3\u00ADdica
   **/
  public PessoaJuridicaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da pessoa jur\u00C3\u00ADdica")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   **/
  public PessoaJuridicaResponse razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * C\u00C3\u00B3digo do Cadastro Nacional de Pessoas Jur\u00C3\u00ADdicas
   **/
  public PessoaJuridicaResponse cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo do Cadastro Nacional de Pessoas Jur\u00C3\u00ADdicas")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * N\u00C3\u00BAmero da inscri\u00C3\u00A7\u00C3\u00A3o estadual
   **/
  public PessoaJuridicaResponse inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da inscri\u00C3\u00A7\u00C3\u00A3o estadual")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Nome da pessoa para entrar em contato
   **/
  public PessoaJuridicaResponse contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da pessoa para entrar em contato")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * C\u00C3\u00B3digo do banco
   **/
  public PessoaJuridicaResponse banco(Integer banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo do banco")
  @JsonProperty("banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * C\u00C3\u00B3digo da ag\u00C3\u00AAncia
   **/
  public PessoaJuridicaResponse agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo da ag\u00C3\u00AAncia")
  @JsonProperty("agencia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * D\u00C3\u00ADgito verificador da ag\u00C3\u00AAncia
   **/
  public PessoaJuridicaResponse digitoVerificadorAgencia(String digitoVerificadorAgencia) {
    this.digitoVerificadorAgencia = digitoVerificadorAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00C3\u00ADgito verificador da ag\u00C3\u00AAncia")
  @JsonProperty("digitoVerificadorAgencia")
  public String getDigitoVerificadorAgencia() {
    return digitoVerificadorAgencia;
  }
  public void setDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
    this.digitoVerificadorAgencia = digitoVerificadorAgencia;
  }

  
  /**
   * C\u00C3\u00B3digo da Conta Corrente
   **/
  public PessoaJuridicaResponse contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo da Conta Corrente")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * D\u00C3\u00ADgito Verificador da Conta Corrente
   **/
  public PessoaJuridicaResponse digitoVerificadorContaCorrente(String digitoVerificadorContaCorrente) {
    this.digitoVerificadorContaCorrente = digitoVerificadorContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00C3\u00ADgito Verificador da Conta Corrente")
  @JsonProperty("digitoVerificadorContaCorrente")
  public String getDigitoVerificadorContaCorrente() {
    return digitoVerificadorContaCorrente;
  }
  public void setDigitoVerificadorContaCorrente(String digitoVerificadorContaCorrente) {
    this.digitoVerificadorContaCorrente = digitoVerificadorContaCorrente;
  }

  
  /**
   * Login do usu\u00C3\u00A1rio para registro da inser\u00C3\u00A7\u00C3\u00A3o
   **/
  public PessoaJuridicaResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Login do usu\u00C3\u00A1rio para registro da inser\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaJuridicaResponse pessoaJuridicaResponse = (PessoaJuridicaResponse) o;
    return Objects.equals(this.id, pessoaJuridicaResponse.id) &&
        Objects.equals(this.razaoSocial, pessoaJuridicaResponse.razaoSocial) &&
        Objects.equals(this.cnpj, pessoaJuridicaResponse.cnpj) &&
        Objects.equals(this.inscricaoEstadual, pessoaJuridicaResponse.inscricaoEstadual) &&
        Objects.equals(this.contato, pessoaJuridicaResponse.contato) &&
        Objects.equals(this.banco, pessoaJuridicaResponse.banco) &&
        Objects.equals(this.agencia, pessoaJuridicaResponse.agencia) &&
        Objects.equals(this.digitoVerificadorAgencia, pessoaJuridicaResponse.digitoVerificadorAgencia) &&
        Objects.equals(this.contaCorrente, pessoaJuridicaResponse.contaCorrente) &&
        Objects.equals(this.digitoVerificadorContaCorrente, pessoaJuridicaResponse.digitoVerificadorContaCorrente) &&
        Objects.equals(this.usuario, pessoaJuridicaResponse.usuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, razaoSocial, cnpj, inscricaoEstadual, contato, banco, agencia, digitoVerificadorAgencia, contaCorrente, digitoVerificadorContaCorrente, usuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    razaoSocial: ").append(toIndentedString(razaoSocial)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    inscricaoEstadual: ").append(toIndentedString(inscricaoEstadual)).append("\n");
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    digitoVerificadorAgencia: ").append(toIndentedString(digitoVerificadorAgencia)).append("\n");
    sb.append("    contaCorrente: ").append(toIndentedString(contaCorrente)).append("\n");
    sb.append("    digitoVerificadorContaCorrente: ").append(toIndentedString(digitoVerificadorContaCorrente)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
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



