package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersistValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{socio_aprovado_persist_description}}}
 **/

@ApiModel(description = "{{{socio_aprovado_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SocioAprovadoPersistValue   {
  
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
  private List<TelefonePessoaAprovadaPersistValue> telefones = new ArrayList<TelefonePessoaAprovadaPersistValue>();

  
  /**
   * {{{socio_aprovado_persist_nome_value}}}
   **/
  public SocioAprovadoPersistValue nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{socio_aprovado_persist_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{socio_aprovado_persist_cpf_value}}}
   **/
  public SocioAprovadoPersistValue cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_cpf_value}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{socio_aprovado_persist_data_nascimento_value}}}
   **/
  public SocioAprovadoPersistValue dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_data_nascimento_value}}}")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{socio_aprovado_persist_sexo_value}}}
   **/
  public SocioAprovadoPersistValue sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_sexo_value}}}")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * {{{socio_aprovado_persist_numero_identidade_value}}}
   **/
  public SocioAprovadoPersistValue numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_numero_identidade_value}}}")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * {{{socio_aprovado_persist_orgao_expedidor_identidade_value}}}
   **/
  public SocioAprovadoPersistValue orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_orgao_expedidor_identidade_value}}}")
  @JsonProperty("orgaoExpedidorIdentidade")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * {{{socio_aprovado_persist_unidade_federativa_identidade_value}}}
   **/
  public SocioAprovadoPersistValue unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_unidade_federativa_identidade_value}}}")
  @JsonProperty("unidadeFederativaIdentidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * {{{socio_aprovado_persist_data_emissao_identidade_value}}}
   **/
  public SocioAprovadoPersistValue dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_data_emissao_identidade_value}}}")
  @JsonProperty("dataEmissaoIdentidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * {{{socio_aprovado_persist_estado_civil_value}}}
   **/
  public SocioAprovadoPersistValue estadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_estado_civil_value}}}")
  @JsonProperty("estadoCivil")
  public String getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  
  /**
   * {{{socio_aprovado_persist_profissao_value}}}
   **/
  public SocioAprovadoPersistValue profissao(String profissao) {
    this.profissao = profissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_profissao_value}}}")
  @JsonProperty("profissao")
  public String getProfissao() {
    return profissao;
  }
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  
  /**
   * {{{socio_aprovado_persist_nacionalidade_value}}}
   **/
  public SocioAprovadoPersistValue nacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_nacionalidade_value}}}")
  @JsonProperty("nacionalidade")
  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  
  /**
   * {{{socio_aprovado_persist_email_value}}}
   **/
  public SocioAprovadoPersistValue email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{socio_aprovado_persist_telefones_value}}}
   **/
  public SocioAprovadoPersistValue telefones(List<TelefonePessoaAprovadaPersistValue> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{socio_aprovado_persist_telefones_value}}}")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaPersistValue> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersistValue> telefones) {
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
    SocioAprovadoPersistValue socioAprovadoPersistValue = (SocioAprovadoPersistValue) o;
    return Objects.equals(this.nome, socioAprovadoPersistValue.nome) &&
        Objects.equals(this.cpf, socioAprovadoPersistValue.cpf) &&
        Objects.equals(this.dataNascimento, socioAprovadoPersistValue.dataNascimento) &&
        Objects.equals(this.sexo, socioAprovadoPersistValue.sexo) &&
        Objects.equals(this.numeroIdentidade, socioAprovadoPersistValue.numeroIdentidade) &&
        Objects.equals(this.orgaoExpedidorIdentidade, socioAprovadoPersistValue.orgaoExpedidorIdentidade) &&
        Objects.equals(this.unidadeFederativaIdentidade, socioAprovadoPersistValue.unidadeFederativaIdentidade) &&
        Objects.equals(this.dataEmissaoIdentidade, socioAprovadoPersistValue.dataEmissaoIdentidade) &&
        Objects.equals(this.estadoCivil, socioAprovadoPersistValue.estadoCivil) &&
        Objects.equals(this.profissao, socioAprovadoPersistValue.profissao) &&
        Objects.equals(this.nacionalidade, socioAprovadoPersistValue.nacionalidade) &&
        Objects.equals(this.email, socioAprovadoPersistValue.email) &&
        Objects.equals(this.telefones, socioAprovadoPersistValue.telefones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cpf, dataNascimento, sexo, numeroIdentidade, orgaoExpedidorIdentidade, unidadeFederativaIdentidade, dataEmissaoIdentidade, estadoCivil, profissao, nacionalidade, email, telefones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocioAprovadoPersistValue {\n");
    
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



