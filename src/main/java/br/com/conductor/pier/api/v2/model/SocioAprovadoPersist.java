package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto de persist\u00EAncia do s\u00F3cio da pessoa aprovada
 **/

@ApiModel(description = "Objeto de persist\u00EAncia do s\u00F3cio da pessoa aprovada")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SocioAprovadoPersist   {
  
  private String nome = null;
  private String cpf = null;
  private String dataNascimento = null;
  private String sexo = null;
  private String numeroIdentidade = null;
  private String orgaoExpedidorIdentidade = null;
  private String unidadeFederativaIdentidade = null;
  private String dataEmissaoIdentidade = null;
  private String estadoCivil = null;
  private String profissao = null;
  private String nacionalidade = null;
  private String email = null;
  private Boolean flagDeficienteVisual = null;
  private List<TelefonePessoaAprovadaPersist> telefones = new ArrayList<TelefonePessoaAprovadaPersist>();

  
  /**
   * Nome do s\u00F3cio
   **/
  public SocioAprovadoPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "Cicrano de Tal", required = true, value = "Nome do s\u00F3cio")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * CPF do s\u00F3cio
   **/
  public SocioAprovadoPersist cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "22646872070", value = "CPF do s\u00F3cio")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd
   **/
  public SocioAprovadoPersist dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "1980-01-01", required = true, value = "Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Sexo do s\u00F3cio
   **/
  public SocioAprovadoPersist sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "M", value = "Sexo do s\u00F3cio")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * N\u00FAmero da Identidade
   **/
  public SocioAprovadoPersist numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "987654321", value = "N\u00FAmero da Identidade")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Org\u00E3o expedidor da Identidade
   **/
  public SocioAprovadoPersist orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "SSP", value = "Org\u00E3o expedidor da Identidade")
  @JsonProperty("orgaoExpedidorIdentidade")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Sigla da Unidade Federativa de onde foi expedido a Identidade
   **/
  public SocioAprovadoPersist unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "PB", value = "Sigla da Unidade Federativa de onde foi expedido a Identidade")
  @JsonProperty("unidadeFederativaIdentidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Data emiss\u00E3o da Identidade
   **/
  public SocioAprovadoPersist dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "2000-01-01", value = "Data emiss\u00E3o da Identidade")
  @JsonProperty("dataEmissaoIdentidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * Estado civil do s\u00F3cio
   **/
  public SocioAprovadoPersist estadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "SOLTEIRO", value = "Estado civil do s\u00F3cio")
  @JsonProperty("estadoCivil")
  public String getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  
  /**
   * Profiss\u00E3o do s\u00F3cio
   **/
  public SocioAprovadoPersist profissao(String profissao) {
    this.profissao = profissao;
    return this;
  }
  
  @ApiModelProperty(example = "Entregador", value = "Profiss\u00E3o do s\u00F3cio")
  @JsonProperty("profissao")
  public String getProfissao() {
    return profissao;
  }
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  
  /**
   * Nacionalidade do s\u00F3cio
   **/
  public SocioAprovadoPersist nacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "Brasileiro", value = "Nacionalidade do s\u00F3cio")
  @JsonProperty("nacionalidade")
  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  
  /**
   * Email do s\u00F3cio
   **/
  public SocioAprovadoPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "sicrano.tal@email.com", value = "Email do s\u00F3cio")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Flag que identifica uma pessoa como deficiente visual
   **/
  public SocioAprovadoPersist flagDeficienteVisual(Boolean flagDeficienteVisual) {
    this.flagDeficienteVisual = flagDeficienteVisual;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que identifica uma pessoa como deficiente visual")
  @JsonProperty("flagDeficienteVisual")
  public Boolean getFlagDeficienteVisual() {
    return flagDeficienteVisual;
  }
  public void setFlagDeficienteVisual(Boolean flagDeficienteVisual) {
    this.flagDeficienteVisual = flagDeficienteVisual;
  }

  
  /**
   * Telefones do s\u00F3cio
   **/
  public SocioAprovadoPersist telefones(List<TelefonePessoaAprovadaPersist> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Telefones do s\u00F3cio")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersist> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocioAprovadoPersist socioAprovadoPersist = (SocioAprovadoPersist) o;
    return Objects.equals(this.nome, socioAprovadoPersist.nome) &&
        Objects.equals(this.cpf, socioAprovadoPersist.cpf) &&
        Objects.equals(this.dataNascimento, socioAprovadoPersist.dataNascimento) &&
        Objects.equals(this.sexo, socioAprovadoPersist.sexo) &&
        Objects.equals(this.numeroIdentidade, socioAprovadoPersist.numeroIdentidade) &&
        Objects.equals(this.orgaoExpedidorIdentidade, socioAprovadoPersist.orgaoExpedidorIdentidade) &&
        Objects.equals(this.unidadeFederativaIdentidade, socioAprovadoPersist.unidadeFederativaIdentidade) &&
        Objects.equals(this.dataEmissaoIdentidade, socioAprovadoPersist.dataEmissaoIdentidade) &&
        Objects.equals(this.estadoCivil, socioAprovadoPersist.estadoCivil) &&
        Objects.equals(this.profissao, socioAprovadoPersist.profissao) &&
        Objects.equals(this.nacionalidade, socioAprovadoPersist.nacionalidade) &&
        Objects.equals(this.email, socioAprovadoPersist.email) &&
        Objects.equals(this.flagDeficienteVisual, socioAprovadoPersist.flagDeficienteVisual) &&
        Objects.equals(this.telefones, socioAprovadoPersist.telefones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cpf, dataNascimento, sexo, numeroIdentidade, orgaoExpedidorIdentidade, unidadeFederativaIdentidade, dataEmissaoIdentidade, estadoCivil, profissao, nacionalidade, email, flagDeficienteVisual, telefones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocioAprovadoPersist {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    numeroIdentidade: ").append(toIndentedString(numeroIdentidade)).append("\n");
    sb.append("    orgaoExpedidorIdentidade: ").append(toIndentedString(orgaoExpedidorIdentidade)).append("\n");
    sb.append("    unidadeFederativaIdentidade: ").append(toIndentedString(unidadeFederativaIdentidade)).append("\n");
    sb.append("    dataEmissaoIdentidade: ").append(toIndentedString(dataEmissaoIdentidade)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    profissao: ").append(toIndentedString(profissao)).append("\n");
    sb.append("    nacionalidade: ").append(toIndentedString(nacionalidade)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    flagDeficienteVisual: ").append(toIndentedString(flagDeficienteVisual)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
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

