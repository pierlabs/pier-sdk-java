package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Request Parameters for validation of the cardholder dates
 **/

@ApiModel(description = "Request Parameters for validation of the cardholder dates")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DadosPortadorRequest   {
  
  private String cartao = null;
  private String cpf = null;
  private String nome = null;
  private String dataNascimento = null;
  private String cepResidencial = null;
  private String email = null;
  private String ddd = null;
  private String telefone = null;

  
  /**
   * Number of the card
   **/
  public DadosPortadorRequest cartao(String cartao) {
    this.cartao = cartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of the card")
  @JsonProperty("cartao")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * CPF number
   **/
  public DadosPortadorRequest cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "CPF number")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Cardholder name
   **/
  public DadosPortadorRequest nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cardholder name")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Birth date of the cardholder
   **/
  public DadosPortadorRequest dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Birth date of the cardholder")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Zip code of the Cardholder residence of the account
   **/
  public DadosPortadorRequest cepResidencial(String cepResidencial) {
    this.cepResidencial = cepResidencial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Zip code of the Cardholder residence of the account")
  @JsonProperty("cepResidencial")
  public String getCepResidencial() {
    return cepResidencial;
  }
  public void setCepResidencial(String cepResidencial) {
    this.cepResidencial = cepResidencial;
  }

  
  /**
   * E-mail of the cardholder
   **/
  public DadosPortadorRequest email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "E-mail of the cardholder")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * DDD of the telephone number of the cardholder
   **/
  public DadosPortadorRequest ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DDD of the telephone number of the cardholder")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * Telephone Number of the cardholder
   **/
  public DadosPortadorRequest telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Telephone Number of the cardholder")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosPortadorRequest dadosPortadorRequest = (DadosPortadorRequest) o;
    return Objects.equals(this.cartao, dadosPortadorRequest.cartao) &&
        Objects.equals(this.cpf, dadosPortadorRequest.cpf) &&
        Objects.equals(this.nome, dadosPortadorRequest.nome) &&
        Objects.equals(this.dataNascimento, dadosPortadorRequest.dataNascimento) &&
        Objects.equals(this.cepResidencial, dadosPortadorRequest.cepResidencial) &&
        Objects.equals(this.email, dadosPortadorRequest.email) &&
        Objects.equals(this.ddd, dadosPortadorRequest.ddd) &&
        Objects.equals(this.telefone, dadosPortadorRequest.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartao, cpf, nome, dataNascimento, cepResidencial, email, ddd, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosPortadorRequest {\n");
    
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    cepResidencial: ").append(toIndentedString(cepResidencial)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
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

