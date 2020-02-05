package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class InstituicaoPagamentoResponse   {
  
  private String cep = null;
  private String cnpj = null;
  private String codigoMunicipio = null;
  private String email = null;
  private String endereco = null;
  private String fone = null;
  private Long id = null;
  private String nome = null;
  private String nomeFantasia = null;
  private String nomeResponsavel = null;
  private String uf = null;
  private String ufFisco = null;

  
  /**
   **/
  public InstituicaoPagamentoResponse cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   **/
  public InstituicaoPagamentoResponse cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   **/
  public InstituicaoPagamentoResponse codigoMunicipio(String codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoMunicipio")
  public String getCodigoMunicipio() {
    return codigoMunicipio;
  }
  public void setCodigoMunicipio(String codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
  }

  
  /**
   **/
  public InstituicaoPagamentoResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  public InstituicaoPagamentoResponse endereco(String endereco) {
    this.endereco = endereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endereco")
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  
  /**
   **/
  public InstituicaoPagamentoResponse fone(String fone) {
    this.fone = fone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fone")
  public String getFone() {
    return fone;
  }
  public void setFone(String fone) {
    this.fone = fone;
  }

  
  /**
   **/
  public InstituicaoPagamentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  public InstituicaoPagamentoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   **/
  public InstituicaoPagamentoResponse nomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeFantasia")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   **/
  public InstituicaoPagamentoResponse nomeResponsavel(String nomeResponsavel) {
    this.nomeResponsavel = nomeResponsavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeResponsavel")
  public String getNomeResponsavel() {
    return nomeResponsavel;
  }
  public void setNomeResponsavel(String nomeResponsavel) {
    this.nomeResponsavel = nomeResponsavel;
  }

  
  /**
   **/
  public InstituicaoPagamentoResponse uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   **/
  public InstituicaoPagamentoResponse ufFisco(String ufFisco) {
    this.ufFisco = ufFisco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ufFisco")
  public String getUfFisco() {
    return ufFisco;
  }
  public void setUfFisco(String ufFisco) {
    this.ufFisco = ufFisco;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstituicaoPagamentoResponse instituicaoPagamentoResponse = (InstituicaoPagamentoResponse) o;
    return Objects.equals(this.cep, instituicaoPagamentoResponse.cep) &&
        Objects.equals(this.cnpj, instituicaoPagamentoResponse.cnpj) &&
        Objects.equals(this.codigoMunicipio, instituicaoPagamentoResponse.codigoMunicipio) &&
        Objects.equals(this.email, instituicaoPagamentoResponse.email) &&
        Objects.equals(this.endereco, instituicaoPagamentoResponse.endereco) &&
        Objects.equals(this.fone, instituicaoPagamentoResponse.fone) &&
        Objects.equals(this.id, instituicaoPagamentoResponse.id) &&
        Objects.equals(this.nome, instituicaoPagamentoResponse.nome) &&
        Objects.equals(this.nomeFantasia, instituicaoPagamentoResponse.nomeFantasia) &&
        Objects.equals(this.nomeResponsavel, instituicaoPagamentoResponse.nomeResponsavel) &&
        Objects.equals(this.uf, instituicaoPagamentoResponse.uf) &&
        Objects.equals(this.ufFisco, instituicaoPagamentoResponse.ufFisco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cep, cnpj, codigoMunicipio, email, endereco, fone, id, nome, nomeFantasia, nomeResponsavel, uf, ufFisco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstituicaoPagamentoResponse {\n");
    
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    codigoMunicipio: ").append(toIndentedString(codigoMunicipio)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("    fone: ").append(toIndentedString(fone)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    nomeFantasia: ").append(toIndentedString(nomeFantasia)).append("\n");
    sb.append("    nomeResponsavel: ").append(toIndentedString(nomeResponsavel)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    ufFisco: ").append(toIndentedString(ufFisco)).append("\n");
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

