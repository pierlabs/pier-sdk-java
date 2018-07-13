package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{usuario_token_persistencia_descricao}}}
 **/

@ApiModel(description = "{{{usuario_token_persistencia_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioTokenPersistencia   {
  
  private String cpf = null;
  private String email = null;
  private String ddd = null;
  private String telefone = null;
  private String dataNascimento = null;
  private Boolean enviaSMS = null;
  private Long idTemplateEmail = null;
  private Long idTemplateSMS = null;
  private Long nsu = null;

  
  /**
   * {{{usuario_token_persistencia_cpf_descricao}}}
   **/
  public UsuarioTokenPersistencia cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_persistencia_cpf_descricao}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{usuario_token_persistencia_email_descricao}}}
   **/
  public UsuarioTokenPersistencia email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_persistencia_email_descricao}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{usuario_token_persistencia_ddd_descricao}}}
   **/
  public UsuarioTokenPersistencia ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_persistencia_ddd_descricao}}}")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{usuario_token_persistencia_telefone_descricao}}}
   **/
  public UsuarioTokenPersistencia telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_persistencia_telefone_descricao}}}")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{usuario_token_persistencia_data_nascimento_descricao}}}
   **/
  public UsuarioTokenPersistencia dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "{{{usuario_token_persistencia_data_nascimento_descricao}}}")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{usuario_token_persistencia_envia_sms_descricao}}}
   **/
  public UsuarioTokenPersistencia enviaSMS(Boolean enviaSMS) {
    this.enviaSMS = enviaSMS;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{usuario_token_persistencia_envia_sms_descricao}}}")
  @JsonProperty("enviaSMS")
  public Boolean getEnviaSMS() {
    return enviaSMS;
  }
  public void setEnviaSMS(Boolean enviaSMS) {
    this.enviaSMS = enviaSMS;
  }

  
  /**
   * {{{usuario_token_persistencia_id_template_email_descricao}}}
   **/
  public UsuarioTokenPersistencia idTemplateEmail(Long idTemplateEmail) {
    this.idTemplateEmail = idTemplateEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_persistencia_id_template_email_descricao}}}")
  @JsonProperty("idTemplateEmail")
  public Long getIdTemplateEmail() {
    return idTemplateEmail;
  }
  public void setIdTemplateEmail(Long idTemplateEmail) {
    this.idTemplateEmail = idTemplateEmail;
  }

  
  /**
   * {{{usuario_token_persistencia_id_template_sms_descricao}}}
   **/
  public UsuarioTokenPersistencia idTemplateSMS(Long idTemplateSMS) {
    this.idTemplateSMS = idTemplateSMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_persistencia_id_template_sms_descricao}}}")
  @JsonProperty("idTemplateSMS")
  public Long getIdTemplateSMS() {
    return idTemplateSMS;
  }
  public void setIdTemplateSMS(Long idTemplateSMS) {
    this.idTemplateSMS = idTemplateSMS;
  }

  
  /**
   * {{{usuario_token_persistencia_nsu_descricao}}}
   **/
  public UsuarioTokenPersistencia nsu(Long nsu) {
    this.nsu = nsu;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_persistencia_nsu_descricao}}}")
  @JsonProperty("nsu")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioTokenPersistencia usuarioTokenPersistencia = (UsuarioTokenPersistencia) o;
    return Objects.equals(this.cpf, usuarioTokenPersistencia.cpf) &&
        Objects.equals(this.email, usuarioTokenPersistencia.email) &&
        Objects.equals(this.ddd, usuarioTokenPersistencia.ddd) &&
        Objects.equals(this.telefone, usuarioTokenPersistencia.telefone) &&
        Objects.equals(this.dataNascimento, usuarioTokenPersistencia.dataNascimento) &&
        Objects.equals(this.enviaSMS, usuarioTokenPersistencia.enviaSMS) &&
        Objects.equals(this.idTemplateEmail, usuarioTokenPersistencia.idTemplateEmail) &&
        Objects.equals(this.idTemplateSMS, usuarioTokenPersistencia.idTemplateSMS) &&
        Objects.equals(this.nsu, usuarioTokenPersistencia.nsu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, email, ddd, telefone, dataNascimento, enviaSMS, idTemplateEmail, idTemplateSMS, nsu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioTokenPersistencia {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    enviaSMS: ").append(toIndentedString(enviaSMS)).append("\n");
    sb.append("    idTemplateEmail: ").append(toIndentedString(idTemplateEmail)).append("\n");
    sb.append("    idTemplateSMS: ").append(toIndentedString(idTemplateSMS)).append("\n");
    sb.append("    nsu: ").append(toIndentedString(nsu)).append("\n");
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



