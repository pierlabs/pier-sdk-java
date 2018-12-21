package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object User Token
 **/

@ApiModel(description = "Object User Token")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UserToken   {
  
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
   * Represents the CPF number of the user
   **/
  public UserToken cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the CPF number of the user")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * The user email
   **/
  public UserToken email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user email")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * DDD of the cell phone
   **/
  public UserToken ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DDD of the cell phone")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * Phone number
   **/
  public UserToken telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phone number")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * The user date of birth
   **/
  public UserToken dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "The user date of birth")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Indicates if SMS send is enable
   **/
  public UserToken enviaSMS(Boolean enviaSMS) {
    this.enviaSMS = enviaSMS;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indicates if SMS send is enable")
  @JsonProperty("enviaSMS")
  public Boolean getEnviaSMS() {
    return enviaSMS;
  }
  public void setEnviaSMS(Boolean enviaSMS) {
    this.enviaSMS = enviaSMS;
  }

  
  /**
   * The template id of the email
   **/
  public UserToken idTemplateEmail(Long idTemplateEmail) {
    this.idTemplateEmail = idTemplateEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The template id of the email")
  @JsonProperty("idTemplateEmail")
  public Long getIdTemplateEmail() {
    return idTemplateEmail;
  }
  public void setIdTemplateEmail(Long idTemplateEmail) {
    this.idTemplateEmail = idTemplateEmail;
  }

  
  /**
   * The template id of the SMS
   **/
  public UserToken idTemplateSMS(Long idTemplateSMS) {
    this.idTemplateSMS = idTemplateSMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The template id of the SMS")
  @JsonProperty("idTemplateSMS")
  public Long getIdTemplateSMS() {
    return idTemplateSMS;
  }
  public void setIdTemplateSMS(Long idTemplateSMS) {
    this.idTemplateSMS = idTemplateSMS;
  }

  
  /**
   * Unique sequential number
   **/
  public UserToken nsu(Long nsu) {
    this.nsu = nsu;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique sequential number")
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
    UserToken userToken = (UserToken) o;
    return Objects.equals(this.cpf, userToken.cpf) &&
        Objects.equals(this.email, userToken.email) &&
        Objects.equals(this.ddd, userToken.ddd) &&
        Objects.equals(this.telefone, userToken.telefone) &&
        Objects.equals(this.dataNascimento, userToken.dataNascimento) &&
        Objects.equals(this.enviaSMS, userToken.enviaSMS) &&
        Objects.equals(this.idTemplateEmail, userToken.idTemplateEmail) &&
        Objects.equals(this.idTemplateSMS, userToken.idTemplateSMS) &&
        Objects.equals(this.nsu, userToken.nsu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, email, ddd, telefone, dataNascimento, enviaSMS, idTemplateEmail, idTemplateSMS, nsu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserToken {\n");
    
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

