package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{token_response_description}}}
 **/

@ApiModel(description = "{{{token_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TokenResponse   {
  
  private Long id = null;
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
  private String dataCriacao = null;
  private String alteradoPor = null;
  private String dataModificacao = null;

  
  /**
   * {{{token_dto_id_value}}}
   **/
  public TokenResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{token_dto_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{token_dto_base_value}}}
   **/
  public TokenResponse base(Long base) {
    this.base = base;
    return this;
  }
  
  @ApiModelProperty(example = "10", value = "{{{token_dto_base_value}}}")
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
  public TokenResponse owner(String owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "[Produção] Emissor Tal", value = "{{{token_dto_owner_value}}}")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   * {{{token_dto_status_value}}}
   **/
  public TokenResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "ACTIVE", value = "{{{token_dto_status_value}}}")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{token_dto_criado_por_value}}}
   **/
  public TokenResponse criadoPor(String criadoPor) {
    this.criadoPor = criadoPor;
    return this;
  }
  
  @ApiModelProperty(example = "fulano.detal", value = "{{{token_dto_criado_por_value}}}")
  @JsonProperty("criadoPor")
  public String getCriadoPor() {
    return criadoPor;
  }
  public void setCriadoPor(String criadoPor) {
    this.criadoPor = criadoPor;
  }

  
  /**
   * {{{token_dto_data_criacao_value}}}
   **/
  public TokenResponse dataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }
  
  @ApiModelProperty(example = "2018-01-01", value = "{{{token_dto_data_criacao_value}}}")
  @JsonProperty("dataCriacao")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * {{{token_dto_alterado_por_value}}}
   **/
  public TokenResponse alteradoPor(String alteradoPor) {
    this.alteradoPor = alteradoPor;
    return this;
  }
  
  @ApiModelProperty(example = "sicrano.detal", value = "{{{token_dto_alterado_por_value}}}")
  @JsonProperty("alteradoPor")
  public String getAlteradoPor() {
    return alteradoPor;
  }
  public void setAlteradoPor(String alteradoPor) {
    this.alteradoPor = alteradoPor;
  }

  
  /**
   * {{{token_dto_data_modificacao_value}}}
   **/
  public TokenResponse dataModificacao(String dataModificacao) {
    this.dataModificacao = dataModificacao;
    return this;
  }
  
  @ApiModelProperty(example = "2018-06-01", value = "{{{token_dto_data_modificacao_value}}}")
  @JsonProperty("dataModificacao")
  public String getDataModificacao() {
    return dataModificacao;
  }
  public void setDataModificacao(String dataModificacao) {
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
    return Objects.hash(id, base, owner, status, criadoPor, dataCriacao, alteradoPor, dataModificacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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



