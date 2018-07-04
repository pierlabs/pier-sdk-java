package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{token_persist_description}}}
 **/

@ApiModel(description = "{{{token_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TokenPersistValue   {
  
  private String token = null;
  private Long base = null;
  private String owner = null;
  private String criadoPor = null;

  
  /**
   * {{{token_dto_token_value}}}
   **/
  public TokenPersistValue token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "6c10e1241eRs", required = true, value = "{{{token_dto_token_value}}}")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * {{{token_dto_base_value}}}
   **/
  public TokenPersistValue base(Long base) {
    this.base = base;
    return this;
  }
  
  @ApiModelProperty(example = "10", required = true, value = "{{{token_dto_base_value}}}")
  @JsonProperty("base")
  public Long getBase() {
    return base;
  }
  public void setBase(Long base) {
    this.base = base;
  }

  
  /**
   * {{{token_dto_owner_value}}}
   **/
  public TokenPersistValue owner(String owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "[Produção] Emissor Tal", required = true, value = "{{{token_dto_owner_value}}}")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   * {{{token_dto_criado_por_value}}}
   **/
  public TokenPersistValue criadoPor(String criadoPor) {
    this.criadoPor = criadoPor;
    return this;
  }
  
  @ApiModelProperty(example = "fulano.detal", required = true, value = "{{{token_dto_criado_por_value}}}")
  @JsonProperty("criadoPor")
  public String getCriadoPor() {
    return criadoPor;
  }
  public void setCriadoPor(String criadoPor) {
    this.criadoPor = criadoPor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenPersistValue tokenPersistValue = (TokenPersistValue) o;
    return Objects.equals(this.token, tokenPersistValue.token) &&
        Objects.equals(this.base, tokenPersistValue.base) &&
        Objects.equals(this.owner, tokenPersistValue.owner) &&
        Objects.equals(this.criadoPor, tokenPersistValue.criadoPor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, base, owner, criadoPor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenPersistValue {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    criadoPor: ").append(toIndentedString(criadoPor)).append("\n");
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



