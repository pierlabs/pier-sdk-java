package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaJuridicaResponse   {
  
  private Long id = null;
  private String contato = null;
  private String razaoSocial = null;
  private String numeroReceitaFederal = null;
  private String inscricaoEstadual = null;
  private Integer banco = null;
  private Integer agencia = null;
  private String digitoAgencia = null;
  private String contaCorrente = null;
  private String digitoContaCorrente = null;

  
  /**
   * {{{pessoa_juridica_persist_id_value}}}
   **/
  public PessoaJuridicaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_persist_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{pessoa_juridica_persist_contato_value}}}
   **/
  public PessoaJuridicaResponse contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_persist_contato_value}}}")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * {{{pessoa_juridica_persist_razao_social_value}}}
   **/
  public PessoaJuridicaResponse razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_persist_razao_social_value}}}")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * {{{pessoa_juridica_persist_CGC_value}}}
   **/
  public PessoaJuridicaResponse numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_persist_CGC_value}}}")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{pessoa_juridica_persist_inscricao_estadual_value}}}
   **/
  public PessoaJuridicaResponse inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_persist_inscricao_estadual_value}}}")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * {{{pessoa_juridica_persist_banco_value}}}
   **/
  public PessoaJuridicaResponse banco(Integer banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_persist_banco_value}}}")
  @JsonProperty("banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * {{{pessoa_juridica_persist_agencia_value}}}
   **/
  public PessoaJuridicaResponse agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_persist_agencia_value}}}")
  @JsonProperty("agencia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{pessoa_juridica_persist_digito_agencia_value}}}
   **/
  public PessoaJuridicaResponse digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_persist_digito_agencia_value}}}")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{pessoa_juridica_persist_conta_corrente_value}}}
   **/
  public PessoaJuridicaResponse contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_persist_conta_corrente_value}}}")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * {{{pessoa_juridica_persist_digito_conta_corrente_value}}}
   **/
  public PessoaJuridicaResponse digitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_persist_digito_conta_corrente_value}}}")
  @JsonProperty("digitoContaCorrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
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
        Objects.equals(this.contato, pessoaJuridicaResponse.contato) &&
        Objects.equals(this.razaoSocial, pessoaJuridicaResponse.razaoSocial) &&
        Objects.equals(this.numeroReceitaFederal, pessoaJuridicaResponse.numeroReceitaFederal) &&
        Objects.equals(this.inscricaoEstadual, pessoaJuridicaResponse.inscricaoEstadual) &&
        Objects.equals(this.banco, pessoaJuridicaResponse.banco) &&
        Objects.equals(this.agencia, pessoaJuridicaResponse.agencia) &&
        Objects.equals(this.digitoAgencia, pessoaJuridicaResponse.digitoAgencia) &&
        Objects.equals(this.contaCorrente, pessoaJuridicaResponse.contaCorrente) &&
        Objects.equals(this.digitoContaCorrente, pessoaJuridicaResponse.digitoContaCorrente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contato, razaoSocial, numeroReceitaFederal, inscricaoEstadual, banco, agencia, digitoAgencia, contaCorrente, digitoContaCorrente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    razaoSocial: ").append(toIndentedString(razaoSocial)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    inscricaoEstadual: ").append(toIndentedString(inscricaoEstadual)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    contaCorrente: ").append(toIndentedString(contaCorrente)).append("\n");
    sb.append("    digitoContaCorrente: ").append(toIndentedString(digitoContaCorrente)).append("\n");
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

