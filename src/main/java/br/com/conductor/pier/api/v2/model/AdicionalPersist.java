package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TelefoneAdicionalPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Representa\u00E7\u00E3o da entrada do recurso de cadastrar adicionais
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da entrada do recurso de cadastrar adicionais")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdicionalPersist   {
  
  private String nome = null;
  private String nomeImpresso = null;
  private String numeroReceitaFederal = null;
  private String dataNascimento = null;
  private String sexo = null;
  private String numeroIdentidade = null;
  private String orgaoExpedidorIdentidade = null;
  private String unidadeFederativaIdentidade = null;
  private String dataEmissaoIdentidade = null;
  private Long idEstadoCivil = null;
  private Long idProfissao = null;
  private Long idNacionalidade = null;
  private Long idParentesco = null;
  private String email = null;
  private List<TelefoneAdicionalPersist> telefones = new ArrayList<TelefoneAdicionalPersist>();

  
  /**
   * Nome completo do Adicional.
   **/
  public AdicionalPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome completo do Adicional.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Nome do Adicional que ser\u00E1 gravado no Cart\u00E3o.
   **/
  public AdicionalPersist nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Adicional que ser\u00E1 gravado no Cart\u00E3o.")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * N\u00FAmero do CPF ou CNPJ do Adicional.
   **/
  public AdicionalPersist numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero do CPF ou CNPJ do Adicional.")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Data de Nascimento do Adicional em formato yyyy-MM-dd.
   **/
  public AdicionalPersist dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de Nascimento do Adicional em formato yyyy-MM-dd.")
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
  public AdicionalPersist sexo(String sexo) {
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
   * N\u00FAmero do Documento de Identidade do Adicional.
   **/
  public AdicionalPersist numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do Documento de Identidade do Adicional.")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Nome do Org\u00E3o Emissor do Documento de Identidade do Adicional.
   **/
  public AdicionalPersist orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Org\u00E3o Emissor do Documento de Identidade do Adicional.")
  @JsonProperty("orgaoExpedidorIdentidade")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Sigla da Unidade Federativa onde o Documento de Identidade do Adicional foi emitido.
   **/
  public AdicionalPersist unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sigla da Unidade Federativa onde o Documento de Identidade do Adicional foi emitido.")
  @JsonProperty("unidadeFederativaIdentidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Data de emiss\u00E3o do Documento de Identidade do Adicional em formato yyyy-MM-dd.
   **/
  public AdicionalPersist dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de emiss\u00E3o do Documento de Identidade do Adicional em formato yyyy-MM-dd.")
  @JsonProperty("dataEmissaoIdentidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Estado Civil do Adicional.
   **/
  public AdicionalPersist idEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do Estado Civil do Adicional.")
  @JsonProperty("idEstadoCivil")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Profissao do Adicional.
   **/
  public AdicionalPersist idProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da Profissao do Adicional.")
  @JsonProperty("idProfissao")
  public Long getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Nacionalidade do Adicional.
   **/
  public AdicionalPersist idNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da Nacionalidade do Adicional.")
  @JsonProperty("idNacionalidade")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular.
   **/
  public AdicionalPersist idParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular.")
  @JsonProperty("idParentesco")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular.
   **/
  public AdicionalPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Lista de telefones do adicional.
   **/
  public AdicionalPersist telefones(List<TelefoneAdicionalPersist> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de telefones do adicional.")
  @JsonProperty("telefones")
  public List<TelefoneAdicionalPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefoneAdicionalPersist> telefones) {
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
    AdicionalPersist adicionalPersist = (AdicionalPersist) o;
    return Objects.equals(this.nome, adicionalPersist.nome) &&
        Objects.equals(this.nomeImpresso, adicionalPersist.nomeImpresso) &&
        Objects.equals(this.numeroReceitaFederal, adicionalPersist.numeroReceitaFederal) &&
        Objects.equals(this.dataNascimento, adicionalPersist.dataNascimento) &&
        Objects.equals(this.sexo, adicionalPersist.sexo) &&
        Objects.equals(this.numeroIdentidade, adicionalPersist.numeroIdentidade) &&
        Objects.equals(this.orgaoExpedidorIdentidade, adicionalPersist.orgaoExpedidorIdentidade) &&
        Objects.equals(this.unidadeFederativaIdentidade, adicionalPersist.unidadeFederativaIdentidade) &&
        Objects.equals(this.dataEmissaoIdentidade, adicionalPersist.dataEmissaoIdentidade) &&
        Objects.equals(this.idEstadoCivil, adicionalPersist.idEstadoCivil) &&
        Objects.equals(this.idProfissao, adicionalPersist.idProfissao) &&
        Objects.equals(this.idNacionalidade, adicionalPersist.idNacionalidade) &&
        Objects.equals(this.idParentesco, adicionalPersist.idParentesco) &&
        Objects.equals(this.email, adicionalPersist.email) &&
        Objects.equals(this.telefones, adicionalPersist.telefones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, nomeImpresso, numeroReceitaFederal, dataNascimento, sexo, numeroIdentidade, orgaoExpedidorIdentidade, unidadeFederativaIdentidade, dataEmissaoIdentidade, idEstadoCivil, idProfissao, idNacionalidade, idParentesco, email, telefones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdicionalPersist {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    numeroIdentidade: ").append(toIndentedString(numeroIdentidade)).append("\n");
    sb.append("    orgaoExpedidorIdentidade: ").append(toIndentedString(orgaoExpedidorIdentidade)).append("\n");
    sb.append("    unidadeFederativaIdentidade: ").append(toIndentedString(unidadeFederativaIdentidade)).append("\n");
    sb.append("    dataEmissaoIdentidade: ").append(toIndentedString(dataEmissaoIdentidade)).append("\n");
    sb.append("    idEstadoCivil: ").append(toIndentedString(idEstadoCivil)).append("\n");
    sb.append("    idProfissao: ").append(toIndentedString(idProfissao)).append("\n");
    sb.append("    idNacionalidade: ").append(toIndentedString(idNacionalidade)).append("\n");
    sb.append("    idParentesco: ").append(toIndentedString(idParentesco)).append("\n");
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

