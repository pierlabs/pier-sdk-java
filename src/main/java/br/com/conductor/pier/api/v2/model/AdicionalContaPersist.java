package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da entrada do recurso de cadastrar adicionais
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da entrada do recurso de cadastrar adicionais")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdicionalContaPersist   {
  
  private Long idPessoa = null;
  private String nomeImpresso = null;
  private Long idEstadoCivil = null;
  private Long idProfissao = null;
  private Long idNacionalidade = null;
  private Long idParentesco = null;
  private String email = null;

  
  /**
   * Id da pessoa que ser\u00E1 o adicional da conta
   **/
  public AdicionalContaPersist idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id da pessoa que ser\u00E1 o adicional da conta")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Nome do Adicional que ser\u00E1 gravado no Cart\u00E3o
   **/
  public AdicionalContaPersist nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Adicional que ser\u00E1 gravado no Cart\u00E3o")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Estado Civil do Adicional
   **/
  public AdicionalContaPersist idEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do Estado Civil do Adicional")
  @JsonProperty("idEstadoCivil")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Profiss\u00E3o do Adicional
   **/
  public AdicionalContaPersist idProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da Profiss\u00E3o do Adicional")
  @JsonProperty("idProfissao")
  public Long getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Nacionalidade do Adicional
   **/
  public AdicionalContaPersist idNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da Nacionalidade do Adicional")
  @JsonProperty("idNacionalidade")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular
   **/
  public AdicionalContaPersist idParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular")
  @JsonProperty("idParentesco")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * Email do Adicional
   **/
  public AdicionalContaPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email do Adicional")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdicionalContaPersist adicionalContaPersist = (AdicionalContaPersist) o;
    return Objects.equals(this.idPessoa, adicionalContaPersist.idPessoa) &&
        Objects.equals(this.nomeImpresso, adicionalContaPersist.nomeImpresso) &&
        Objects.equals(this.idEstadoCivil, adicionalContaPersist.idEstadoCivil) &&
        Objects.equals(this.idProfissao, adicionalContaPersist.idProfissao) &&
        Objects.equals(this.idNacionalidade, adicionalContaPersist.idNacionalidade) &&
        Objects.equals(this.idParentesco, adicionalContaPersist.idParentesco) &&
        Objects.equals(this.email, adicionalContaPersist.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, nomeImpresso, idEstadoCivil, idProfissao, idNacionalidade, idParentesco, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdicionalContaPersist {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    idEstadoCivil: ").append(toIndentedString(idEstadoCivil)).append("\n");
    sb.append("    idProfissao: ").append(toIndentedString(idProfissao)).append("\n");
    sb.append("    idNacionalidade: ").append(toIndentedString(idNacionalidade)).append("\n");
    sb.append("    idParentesco: ").append(toIndentedString(idParentesco)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

