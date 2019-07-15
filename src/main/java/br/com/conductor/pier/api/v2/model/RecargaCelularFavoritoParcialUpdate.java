package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto da atualiza\u00E7\u00E3o parcial de favorito de recarga de celular
 **/

@ApiModel(description = "Objeto da atualiza\u00E7\u00E3o parcial de favorito de recarga de celular")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RecargaCelularFavoritoParcialUpdate   {
  
  private String dddCelular = null;
  private String numeroCelular = null;
  private String nome = null;
  private Boolean ativo = null;
  private String descricaoOperadora = null;

  
  /**
   * DDD do celular
   **/
  public RecargaCelularFavoritoParcialUpdate dddCelular(String dddCelular) {
    this.dddCelular = dddCelular;
    return this;
  }
  
  @ApiModelProperty(example = "041", value = "DDD do celular")
  @JsonProperty("dddCelular")
  public String getDddCelular() {
    return dddCelular;
  }
  public void setDddCelular(String dddCelular) {
    this.dddCelular = dddCelular;
  }

  
  /**
   * N\u00FAmero do celular
   **/
  public RecargaCelularFavoritoParcialUpdate numeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
    return this;
  }
  
  @ApiModelProperty(example = "999999999", value = "N\u00FAmero do celular")
  @JsonProperty("numeroCelular")
  public String getNumeroCelular() {
    return numeroCelular;
  }
  public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  
  /**
   * Nome do propriet\u00E1rio do celular
   **/
  public RecargaCelularFavoritoParcialUpdate nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "João da Silva", value = "Nome do propriet\u00E1rio do celular")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Indicador de status do favorito
   **/
  public RecargaCelularFavoritoParcialUpdate ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indicador de status do favorito")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Descri\u00E7\u00E3o da operadora
   **/
  public RecargaCelularFavoritoParcialUpdate descricaoOperadora(String descricaoOperadora) {
    this.descricaoOperadora = descricaoOperadora;
    return this;
  }
  
  @ApiModelProperty(example = "VIVO", value = "Descri\u00E7\u00E3o da operadora")
  @JsonProperty("descricaoOperadora")
  public String getDescricaoOperadora() {
    return descricaoOperadora;
  }
  public void setDescricaoOperadora(String descricaoOperadora) {
    this.descricaoOperadora = descricaoOperadora;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecargaCelularFavoritoParcialUpdate recargaCelularFavoritoParcialUpdate = (RecargaCelularFavoritoParcialUpdate) o;
    return Objects.equals(this.dddCelular, recargaCelularFavoritoParcialUpdate.dddCelular) &&
        Objects.equals(this.numeroCelular, recargaCelularFavoritoParcialUpdate.numeroCelular) &&
        Objects.equals(this.nome, recargaCelularFavoritoParcialUpdate.nome) &&
        Objects.equals(this.ativo, recargaCelularFavoritoParcialUpdate.ativo) &&
        Objects.equals(this.descricaoOperadora, recargaCelularFavoritoParcialUpdate.descricaoOperadora);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dddCelular, numeroCelular, nome, ativo, descricaoOperadora);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecargaCelularFavoritoParcialUpdate {\n");
    
    sb.append("    dddCelular: ").append(toIndentedString(dddCelular)).append("\n");
    sb.append("    numeroCelular: ").append(toIndentedString(numeroCelular)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
    sb.append("    descricaoOperadora: ").append(toIndentedString(descricaoOperadora)).append("\n");
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

