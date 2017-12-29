package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso token
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso token")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TokenResponse   {
  
  private Long id = null;
  private String token = null;
  private Long base = null;
  private String owner = null;


  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    REVOKED("REVOKED"),
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;
  private String criadoPor = null;
  private Date dataCriacao = null;
  private String alteradoPor = null;
  private Date dataModificacao = null;

  
  /**
   * C\u00C3\u00B3digo identificador do token
   **/
  public TokenResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do token")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Token
   **/
  public TokenResponse token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da base
   **/
  public TokenResponse base(Long base) {
    this.base = base;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da base")
  @JsonProperty("base")
  public Long getBase() {
    return base;
  }
  public void setBase(Long base) {
    this.base = base;
  }

  
  /**
   * Owner do token
   **/
  public TokenResponse owner(String owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Owner do token")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   * Status do token
   **/
  public TokenResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do token")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o de quem criou o token
   **/
  public TokenResponse criadoPor(String criadoPor) {
    this.criadoPor = criadoPor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o de quem criou o token")
  @JsonProperty("criadoPor")
  public String getCriadoPor() {
    return criadoPor;
  }
  public void setCriadoPor(String criadoPor) {
    this.criadoPor = criadoPor;
  }

  
  /**
   * Data de cria\u00C3\u00A7\u00C3\u00A3o do token
   **/
  public TokenResponse dataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de cria\u00C3\u00A7\u00C3\u00A3o do token")
  @JsonProperty("dataCriacao")
  public Date getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o de quem alterou o token
   **/
  public TokenResponse alteradoPor(String alteradoPor) {
    this.alteradoPor = alteradoPor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o de quem alterou o token")
  @JsonProperty("alteradoPor")
  public String getAlteradoPor() {
    return alteradoPor;
  }
  public void setAlteradoPor(String alteradoPor) {
    this.alteradoPor = alteradoPor;
  }

  
  /**
   * Data de modifica\u00C3\u00A7\u00C3\u00A3o do token
   **/
  public TokenResponse dataModificacao(Date dataModificacao) {
    this.dataModificacao = dataModificacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de modifica\u00C3\u00A7\u00C3\u00A3o do token")
  @JsonProperty("dataModificacao")
  public Date getDataModificacao() {
    return dataModificacao;
  }
  public void setDataModificacao(Date dataModificacao) {
    this.dataModificacao = dataModificacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenResponse tokenResponse = (TokenResponse) o;
    return Objects.equals(this.id, tokenResponse.id) &&
        Objects.equals(this.token, tokenResponse.token) &&
        Objects.equals(this.base, tokenResponse.base) &&
        Objects.equals(this.owner, tokenResponse.owner) &&
        Objects.equals(this.status, tokenResponse.status) &&
        Objects.equals(this.criadoPor, tokenResponse.criadoPor) &&
        Objects.equals(this.dataCriacao, tokenResponse.dataCriacao) &&
        Objects.equals(this.alteradoPor, tokenResponse.alteradoPor) &&
        Objects.equals(this.dataModificacao, tokenResponse.dataModificacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, base, owner, status, criadoPor, dataCriacao, alteradoPor, dataModificacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    criadoPor: ").append(toIndentedString(criadoPor)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
    sb.append("    alteradoPor: ").append(toIndentedString(alteradoPor)).append("\n");
    sb.append("    dataModificacao: ").append(toIndentedString(dataModificacao)).append("\n");
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

