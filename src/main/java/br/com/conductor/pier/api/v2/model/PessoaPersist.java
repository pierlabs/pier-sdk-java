package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





/**
 * PessoaPersist
 **/

@ApiModel(description = "PessoaPersist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaPersist   {
  
  private String cpf = null;
  private Date dataEmissaoIdentidade = null;
  private Date dataNascimento = null;
  private String email = null;
  private String estadoCivil = null;
  private String nacionalidade = null;
  private String nome = null;
  private String numeroIdentidade = null;
  private String orgaoExpedidorIdentidade = null;
  private String profissao = null;
  private String sexo = null;
  private List<TelefonePessoaAprovadaPersist> telefones = new ArrayList<TelefonePessoaAprovadaPersist>();
  private String unidadeFederativaIdentidade = null;

  
  /**
   * N\u00C3\u00BAmero do CPF, quando PF.
   **/
  public PessoaPersist cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do CPF, quando PF.")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Data emiss\u00C3\u00A3o da Identidade
   **/
  public PessoaPersist dataEmissaoIdentidade(Date dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data emiss\u00C3\u00A3o da Identidade")
  @JsonProperty("dataEmissaoIdentidade")
  public Date getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(Date dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd.
   **/
  public PessoaPersist dataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd.")
  @JsonProperty("dataNascimento")
  public Date getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Email do s\u00C3\u00B3cio
   **/
  public PessoaPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email do s\u00C3\u00B3cio")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Estado civil do s\u00C3\u00B3cio
   **/
  public PessoaPersist estadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Estado civil do s\u00C3\u00B3cio")
  @JsonProperty("estadoCivil")
  public String getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  
  /**
   * Nacionalidade do s\u00C3\u00B3cio
   **/
  public PessoaPersist nacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nacionalidade do s\u00C3\u00B3cio")
  @JsonProperty("nacionalidade")
  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  
  /**
   * Apresenta o Nome do Socio
   **/
  public PessoaPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o Nome do Socio")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * N\u00C3\u00BAmero da Identidade.
   **/
  public PessoaPersist numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da Identidade.")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Org\u00C3\u00A3o expedidor da Identidade.
   **/
  public PessoaPersist orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Org\u00C3\u00A3o expedidor da Identidade.")
  @JsonProperty("orgaoExpedidorIdentidade")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Profiss\u00C3\u00A3o do s\u00C3\u00B3cio
   **/
  public PessoaPersist profissao(String profissao) {
    this.profissao = profissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Profiss\u00C3\u00A3o do s\u00C3\u00B3cio")
  @JsonProperty("profissao")
  public String getProfissao() {
    return profissao;
  }
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino).
   **/
  public PessoaPersist sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino).")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * Informa os telefones do s\u00C3\u00B3cio
   **/
  public PessoaPersist telefones(List<TelefonePessoaAprovadaPersist> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Informa os telefones do s\u00C3\u00B3cio")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersist> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * Sigla da Unidade Federativa de onde foi expedido a Identidade
   **/
  public PessoaPersist unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sigla da Unidade Federativa de onde foi expedido a Identidade")
  @JsonProperty("unidadeFederativaIdentidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaPersist pessoaPersist = (PessoaPersist) o;
    return Objects.equals(this.cpf, pessoaPersist.cpf) &&
        Objects.equals(this.dataEmissaoIdentidade, pessoaPersist.dataEmissaoIdentidade) &&
        Objects.equals(this.dataNascimento, pessoaPersist.dataNascimento) &&
        Objects.equals(this.email, pessoaPersist.email) &&
        Objects.equals(this.estadoCivil, pessoaPersist.estadoCivil) &&
        Objects.equals(this.nacionalidade, pessoaPersist.nacionalidade) &&
        Objects.equals(this.nome, pessoaPersist.nome) &&
        Objects.equals(this.numeroIdentidade, pessoaPersist.numeroIdentidade) &&
        Objects.equals(this.orgaoExpedidorIdentidade, pessoaPersist.orgaoExpedidorIdentidade) &&
        Objects.equals(this.profissao, pessoaPersist.profissao) &&
        Objects.equals(this.sexo, pessoaPersist.sexo) &&
        Objects.equals(this.telefones, pessoaPersist.telefones) &&
        Objects.equals(this.unidadeFederativaIdentidade, pessoaPersist.unidadeFederativaIdentidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, dataEmissaoIdentidade, dataNascimento, email, estadoCivil, nacionalidade, nome, numeroIdentidade, orgaoExpedidorIdentidade, profissao, sexo, telefones, unidadeFederativaIdentidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaPersist {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    dataEmissaoIdentidade: ").append(toIndentedString(dataEmissaoIdentidade)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    nacionalidade: ").append(toIndentedString(nacionalidade)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    numeroIdentidade: ").append(toIndentedString(numeroIdentidade)).append("\n");
    sb.append("    orgaoExpedidorIdentidade: ").append(toIndentedString(orgaoExpedidorIdentidade)).append("\n");
    sb.append("    profissao: ").append(toIndentedString(profissao)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
    sb.append("    unidadeFederativaIdentidade: ").append(toIndentedString(unidadeFederativaIdentidade)).append("\n");
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



