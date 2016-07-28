package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaFisicaResponse   {
  
  private String bairro = null;
  private String cep = null;
  private String cidade = null;
  private String complementoLogradouro = null;
  private String cpf = null;
  private String dataEmissaoIdentidade = null;
  private String dataNascimento = null;
  private String dddcelular = null;
  private String dddtelefone = null;
  private String endereco = null;
  private Integer idPessoaFisica = null;
  private String identidade = null;
  private String nome = null;
  private String numeroCelular = null;
  private Integer numeroLogradouro = null;
  private String numeroTelefone = null;
  private String orgaoEmissor = null;
  private String sexo = null;
  private String uf = null;

  
  /**
   **/
  public PessoaFisicaResponse bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   **/
  public PessoaFisicaResponse cep(String cep) {
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
  public PessoaFisicaResponse cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   **/
  public PessoaFisicaResponse complementoLogradouro(String complementoLogradouro) {
    this.complementoLogradouro = complementoLogradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("complementoLogradouro")
  public String getComplementoLogradouro() {
    return complementoLogradouro;
  }
  public void setComplementoLogradouro(String complementoLogradouro) {
    this.complementoLogradouro = complementoLogradouro;
  }

  
  /**
   **/
  public PessoaFisicaResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  public PessoaFisicaResponse dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataEmissaoIdentidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   **/
  public PessoaFisicaResponse dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   **/
  public PessoaFisicaResponse dddcelular(String dddcelular) {
    this.dddcelular = dddcelular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dddcelular")
  public String getDddcelular() {
    return dddcelular;
  }
  public void setDddcelular(String dddcelular) {
    this.dddcelular = dddcelular;
  }

  
  /**
   **/
  public PessoaFisicaResponse dddtelefone(String dddtelefone) {
    this.dddtelefone = dddtelefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dddtelefone")
  public String getDddtelefone() {
    return dddtelefone;
  }
  public void setDddtelefone(String dddtelefone) {
    this.dddtelefone = dddtelefone;
  }

  
  /**
   **/
  public PessoaFisicaResponse endereco(String endereco) {
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
  public PessoaFisicaResponse idPessoaFisica(Integer idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idPessoaFisica")
  public Integer getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Integer idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   **/
  public PessoaFisicaResponse identidade(String identidade) {
    this.identidade = identidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("identidade")
  public String getIdentidade() {
    return identidade;
  }
  public void setIdentidade(String identidade) {
    this.identidade = identidade;
  }

  
  /**
   **/
  public PessoaFisicaResponse nome(String nome) {
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
  public PessoaFisicaResponse numeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroCelular")
  public String getNumeroCelular() {
    return numeroCelular;
  }
  public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  
  /**
   **/
  public PessoaFisicaResponse numeroLogradouro(Integer numeroLogradouro) {
    this.numeroLogradouro = numeroLogradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroLogradouro")
  public Integer getNumeroLogradouro() {
    return numeroLogradouro;
  }
  public void setNumeroLogradouro(Integer numeroLogradouro) {
    this.numeroLogradouro = numeroLogradouro;
  }

  
  /**
   **/
  public PessoaFisicaResponse numeroTelefone(String numeroTelefone) {
    this.numeroTelefone = numeroTelefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroTelefone")
  public String getNumeroTelefone() {
    return numeroTelefone;
  }
  public void setNumeroTelefone(String numeroTelefone) {
    this.numeroTelefone = numeroTelefone;
  }

  
  /**
   **/
  public PessoaFisicaResponse orgaoEmissor(String orgaoEmissor) {
    this.orgaoEmissor = orgaoEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orgaoEmissor")
  public String getOrgaoEmissor() {
    return orgaoEmissor;
  }
  public void setOrgaoEmissor(String orgaoEmissor) {
    this.orgaoEmissor = orgaoEmissor;
  }

  
  /**
   **/
  public PessoaFisicaResponse sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   **/
  public PessoaFisicaResponse uf(String uf) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaFisicaResponse pessoaFisicaResponse = (PessoaFisicaResponse) o;
    return Objects.equals(this.bairro, pessoaFisicaResponse.bairro) &&
        Objects.equals(this.cep, pessoaFisicaResponse.cep) &&
        Objects.equals(this.cidade, pessoaFisicaResponse.cidade) &&
        Objects.equals(this.complementoLogradouro, pessoaFisicaResponse.complementoLogradouro) &&
        Objects.equals(this.cpf, pessoaFisicaResponse.cpf) &&
        Objects.equals(this.dataEmissaoIdentidade, pessoaFisicaResponse.dataEmissaoIdentidade) &&
        Objects.equals(this.dataNascimento, pessoaFisicaResponse.dataNascimento) &&
        Objects.equals(this.dddcelular, pessoaFisicaResponse.dddcelular) &&
        Objects.equals(this.dddtelefone, pessoaFisicaResponse.dddtelefone) &&
        Objects.equals(this.endereco, pessoaFisicaResponse.endereco) &&
        Objects.equals(this.idPessoaFisica, pessoaFisicaResponse.idPessoaFisica) &&
        Objects.equals(this.identidade, pessoaFisicaResponse.identidade) &&
        Objects.equals(this.nome, pessoaFisicaResponse.nome) &&
        Objects.equals(this.numeroCelular, pessoaFisicaResponse.numeroCelular) &&
        Objects.equals(this.numeroLogradouro, pessoaFisicaResponse.numeroLogradouro) &&
        Objects.equals(this.numeroTelefone, pessoaFisicaResponse.numeroTelefone) &&
        Objects.equals(this.orgaoEmissor, pessoaFisicaResponse.orgaoEmissor) &&
        Objects.equals(this.sexo, pessoaFisicaResponse.sexo) &&
        Objects.equals(this.uf, pessoaFisicaResponse.uf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bairro, cep, cidade, complementoLogradouro, cpf, dataEmissaoIdentidade, dataNascimento, dddcelular, dddtelefone, endereco, idPessoaFisica, identidade, nome, numeroCelular, numeroLogradouro, numeroTelefone, orgaoEmissor, sexo, uf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaFisicaResponse {\n");
    
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    complementoLogradouro: ").append(toIndentedString(complementoLogradouro)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    dataEmissaoIdentidade: ").append(toIndentedString(dataEmissaoIdentidade)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    dddcelular: ").append(toIndentedString(dddcelular)).append("\n");
    sb.append("    dddtelefone: ").append(toIndentedString(dddtelefone)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("    idPessoaFisica: ").append(toIndentedString(idPessoaFisica)).append("\n");
    sb.append("    identidade: ").append(toIndentedString(identidade)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    numeroCelular: ").append(toIndentedString(numeroCelular)).append("\n");
    sb.append("    numeroLogradouro: ").append(toIndentedString(numeroLogradouro)).append("\n");
    sb.append("    numeroTelefone: ").append(toIndentedString(numeroTelefone)).append("\n");
    sb.append("    orgaoEmissor: ").append(toIndentedString(orgaoEmissor)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
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



