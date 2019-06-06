package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de persist\u00EAncia de favorito de recarga de celular
 **/

@ApiModel(description = "Objeto de persist\u00EAncia de favorito de recarga de celular")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RecargaCelularFavoritoPersist   {
  
  private String dddCelular = null;
  private String numeroCelular = null;
  private Boolean ativo = null;
  private String nome = null;

  
  /**
   * DDD do celular
   **/
  public RecargaCelularFavoritoPersist dddCelular(String dddCelular) {
    this.dddCelular = dddCelular;
    return this;
  }
  
  @ApiModelProperty(example = "041", required = true, value = "DDD do celular")
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
  public RecargaCelularFavoritoPersist numeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
    return this;
  }
  
  @ApiModelProperty(example = "999999999", required = true, value = "N\u00FAmero do celular")
  @JsonProperty("numeroCelular")
  public String getNumeroCelular() {
    return numeroCelular;
  }
  public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  
  /**
   * Indicador de status
   **/
  public RecargaCelularFavoritoPersist ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indicador de status")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Nome do propriet\u00E1rio do celular
   **/
  public RecargaCelularFavoritoPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "João Silva", value = "Nome do propriet\u00E1rio do celular")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecargaCelularFavoritoPersist recargaCelularFavoritoPersist = (RecargaCelularFavoritoPersist) o;
    return Objects.equals(this.dddCelular, recargaCelularFavoritoPersist.dddCelular) &&
        Objects.equals(this.numeroCelular, recargaCelularFavoritoPersist.numeroCelular) &&
        Objects.equals(this.ativo, recargaCelularFavoritoPersist.ativo) &&
        Objects.equals(this.nome, recargaCelularFavoritoPersist.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dddCelular, numeroCelular, ativo, nome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecargaCelularFavoritoPersist {\n");
    
    sb.append("    dddCelular: ").append(toIndentedString(dddCelular)).append("\n");
    sb.append("    numeroCelular: ").append(toIndentedString(numeroCelular)).append("\n");
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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

