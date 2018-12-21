package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Person
 **/

@ApiModel(description = "Person")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaResponse   {
  
  private Long id = null;
  private String nome = null;
  private String tipo = null;
  private String cpf = null;
  private String cnpj = null;
  private String dataNascimento = null;
  private String numeroIdentidade = null;
  private String orgaoExpedidorIdentidade = null;
  private String sexo = null;
  private String unidadeFederativaIdentidade = null;
  private String dataEmissaoIdentidade = null;

  
  /**
   * Identification Code of the Person (id)
   **/
  public PessoaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identification Code of the Person (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Show the 'Full name of the PP' or the ' Full name of the social reason (Business name)'
   **/
  public PessoaResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Show the 'Full name of the PP' or the ' Full name of the social reason (Business name)'")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Identification Code of the Person type, being ('PP': Physical Person), ('PJ': Legal Person)
   **/
  public PessoaResponse tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identification Code of the Person type, being ('PP': Physical Person), ('PJ': Legal Person)")
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * CPF number, when it is PP
   **/
  public PessoaResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CPF number, when it is PP")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * CNPJ number, when it is LP
   **/
  public PessoaResponse cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CNPJ number, when it is LP")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * Birth date of the person, when it is PP, or the date of the Company Opening, when it is LP
   **/
  public PessoaResponse dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Birth date of the person, when it is PP, or the date of the Company Opening, when it is LP")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Identity Number
   **/
  public PessoaResponse numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identity Number")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Issuer Organ of the ID
   **/
  public PessoaResponse orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Issuer Organ of the ID")
  @JsonProperty("orgaoExpedidorIdentidade")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Identification Code of the Person sex, being: ('M': Male), ('F': Female), ('O': Other), ('N': Not Specified)
   **/
  public PessoaResponse sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Person sex, being: ('M': Male), ('F': Female), ('O': Other), ('N': Not Specified)")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * Acronym of the Federal Unity where was issued the Identity
   **/
  public PessoaResponse unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Acronym of the Federal Unity where was issued the Identity")
  @JsonProperty("unidadeFederativaIdentidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Issue date of the identity in the format yyyy-MM-dd
   **/
  public PessoaResponse dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Issue date of the identity in the format yyyy-MM-dd")
  @JsonProperty("dataEmissaoIdentidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaResponse pessoaResponse = (PessoaResponse) o;
    return Objects.equals(this.id, pessoaResponse.id) &&
        Objects.equals(this.nome, pessoaResponse.nome) &&
        Objects.equals(this.tipo, pessoaResponse.tipo) &&
        Objects.equals(this.cpf, pessoaResponse.cpf) &&
        Objects.equals(this.cnpj, pessoaResponse.cnpj) &&
        Objects.equals(this.dataNascimento, pessoaResponse.dataNascimento) &&
        Objects.equals(this.numeroIdentidade, pessoaResponse.numeroIdentidade) &&
        Objects.equals(this.orgaoExpedidorIdentidade, pessoaResponse.orgaoExpedidorIdentidade) &&
        Objects.equals(this.sexo, pessoaResponse.sexo) &&
        Objects.equals(this.unidadeFederativaIdentidade, pessoaResponse.unidadeFederativaIdentidade) &&
        Objects.equals(this.dataEmissaoIdentidade, pessoaResponse.dataEmissaoIdentidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, tipo, cpf, cnpj, dataNascimento, numeroIdentidade, orgaoExpedidorIdentidade, sexo, unidadeFederativaIdentidade, dataEmissaoIdentidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    numeroIdentidade: ").append(toIndentedString(numeroIdentidade)).append("\n");
    sb.append("    orgaoExpedidorIdentidade: ").append(toIndentedString(orgaoExpedidorIdentidade)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    unidadeFederativaIdentidade: ").append(toIndentedString(unidadeFederativaIdentidade)).append("\n");
    sb.append("    dataEmissaoIdentidade: ").append(toIndentedString(dataEmissaoIdentidade)).append("\n");
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

