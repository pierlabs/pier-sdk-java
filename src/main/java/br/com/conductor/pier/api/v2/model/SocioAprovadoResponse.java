package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * PessoaPersist
 **/

@ApiModel(description = "PessoaPersist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SocioAprovadoResponse   {
  
  private Long id = null;
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
  private List<TelefonePessoaAprovadaResponse> telefones = new ArrayList<TelefonePessoaAprovadaResponse>();

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do S\u00F3cio (id)
   **/
  public SocioAprovadoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do S\u00F3cio (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o Nome do Socio
   **/
  public SocioAprovadoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o Nome do Socio")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * N\u00FAmero do CPF, quando PF.
   **/
  public SocioAprovadoResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do CPF, quando PF.")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd.
   **/
  public SocioAprovadoResponse dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd.")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino), (\"O\": Outro), (\"N\": N\u00E3o Especificado).
   **/
  public SocioAprovadoResponse sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino), (\"O\": Outro), (\"N\": N\u00E3o Especificado).")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * N\u00FAmero da Identidade.
   **/
  public SocioAprovadoResponse numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da Identidade.")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Org\u00E3o expedidor do RG.
   **/
  public SocioAprovadoResponse orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Org\u00E3o expedidor do RG.")
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
  public SocioAprovadoResponse unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
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

  
  /**
   * Data emiss\u00E3o da Identidade
   **/
  public SocioAprovadoResponse dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data emiss\u00E3o da Identidade")
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
  public SocioAprovadoResponse estadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Estado civil do s\u00F3cio")
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
  public SocioAprovadoResponse profissao(String profissao) {
    this.profissao = profissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Profiss\u00E3o do s\u00F3cio")
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
  public SocioAprovadoResponse nacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nacionalidade do s\u00F3cio")
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
  public SocioAprovadoResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email do s\u00F3cio")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Informa os telefones do s\u00F3cio
   **/
  public SocioAprovadoResponse telefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Informa os telefones do s\u00F3cio")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaResponse> telefones) {
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
    SocioAprovadoResponse socioAprovadoResponse = (SocioAprovadoResponse) o;
    return Objects.equals(this.id, socioAprovadoResponse.id) &&
        Objects.equals(this.nome, socioAprovadoResponse.nome) &&
        Objects.equals(this.cpf, socioAprovadoResponse.cpf) &&
        Objects.equals(this.dataNascimento, socioAprovadoResponse.dataNascimento) &&
        Objects.equals(this.sexo, socioAprovadoResponse.sexo) &&
        Objects.equals(this.numeroIdentidade, socioAprovadoResponse.numeroIdentidade) &&
        Objects.equals(this.orgaoExpedidorIdentidade, socioAprovadoResponse.orgaoExpedidorIdentidade) &&
        Objects.equals(this.unidadeFederativaIdentidade, socioAprovadoResponse.unidadeFederativaIdentidade) &&
        Objects.equals(this.dataEmissaoIdentidade, socioAprovadoResponse.dataEmissaoIdentidade) &&
        Objects.equals(this.estadoCivil, socioAprovadoResponse.estadoCivil) &&
        Objects.equals(this.profissao, socioAprovadoResponse.profissao) &&
        Objects.equals(this.nacionalidade, socioAprovadoResponse.nacionalidade) &&
        Objects.equals(this.email, socioAprovadoResponse.email) &&
        Objects.equals(this.telefones, socioAprovadoResponse.telefones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, cpf, dataNascimento, sexo, numeroIdentidade, orgaoExpedidorIdentidade, unidadeFederativaIdentidade, dataEmissaoIdentidade, estadoCivil, profissao, nacionalidade, email, telefones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocioAprovadoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

