package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Usu\u00E1rio Token
 **/

@ApiModel(description = "Objeto Usu\u00E1rio Token")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioToken   {
  
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
   * CPF do usu\u00E1rio
   **/
  public UsuarioToken cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CPF do usu\u00E1rio")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Email do usu\u00E1rio
   **/
  public UsuarioToken email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email do usu\u00E1rio")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * DDD do telefone do usu\u00E1rio
   **/
  public UsuarioToken ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DDD do telefone do usu\u00E1rio")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00FAmero do telefone do usu\u00E1rio
   **/
  public UsuarioToken telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do telefone do usu\u00E1rio")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Data de nascimento do usu\u00E1rio
   **/
  public UsuarioToken dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de nascimento do usu\u00E1rio")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Flag que indica se deve ser enviado SMS
   **/
  public UsuarioToken enviaSMS(Boolean enviaSMS) {
    this.enviaSMS = enviaSMS;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se deve ser enviado SMS")
  @JsonProperty("enviaSMS")
  public Boolean getEnviaSMS() {
    return enviaSMS;
  }
  public void setEnviaSMS(Boolean enviaSMS) {
    this.enviaSMS = enviaSMS;
  }

  
  /**
   * Id do template do email
   **/
  public UsuarioToken idTemplateEmail(Long idTemplateEmail) {
    this.idTemplateEmail = idTemplateEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do template do email")
  @JsonProperty("idTemplateEmail")
  public Long getIdTemplateEmail() {
    return idTemplateEmail;
  }
  public void setIdTemplateEmail(Long idTemplateEmail) {
    this.idTemplateEmail = idTemplateEmail;
  }

  
  /**
   * Id do template de sms
   **/
  public UsuarioToken idTemplateSMS(Long idTemplateSMS) {
    this.idTemplateSMS = idTemplateSMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do template de sms")
  @JsonProperty("idTemplateSMS")
  public Long getIdTemplateSMS() {
    return idTemplateSMS;
  }
  public void setIdTemplateSMS(Long idTemplateSMS) {
    this.idTemplateSMS = idTemplateSMS;
  }

  
  /**
   * N\u00FAmero sequ\u00EAncial \u00FAnico para envio de sms
   **/
  public UsuarioToken nsu(Long nsu) {
    this.nsu = nsu;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero sequ\u00EAncial \u00FAnico para envio de sms")
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
    UsuarioToken usuarioToken = (UsuarioToken) o;
    return Objects.equals(this.cpf, usuarioToken.cpf) &&
        Objects.equals(this.email, usuarioToken.email) &&
        Objects.equals(this.ddd, usuarioToken.ddd) &&
        Objects.equals(this.telefone, usuarioToken.telefone) &&
        Objects.equals(this.dataNascimento, usuarioToken.dataNascimento) &&
        Objects.equals(this.enviaSMS, usuarioToken.enviaSMS) &&
        Objects.equals(this.idTemplateEmail, usuarioToken.idTemplateEmail) &&
        Objects.equals(this.idTemplateSMS, usuarioToken.idTemplateSMS) &&
        Objects.equals(this.nsu, usuarioToken.nsu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, email, ddd, telefone, dataNascimento, enviaSMS, idTemplateEmail, idTemplateSMS, nsu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioToken {\n");
    
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

