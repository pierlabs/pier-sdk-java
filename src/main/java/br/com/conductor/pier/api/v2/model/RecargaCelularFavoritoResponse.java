package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta para favoritos de recarga de celular 
 **/

@ApiModel(description = "Objeto de resposta para favoritos de recarga de celular ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RecargaCelularFavoritoResponse   {
  
  private Boolean ativo = null;
  private String dddCelular = null;
  private String descricaoOperadora = null;
  private Long id = null;
  private Long idConta = null;
  private String nome = null;
  private String numeroCelular = null;

  
  /**
   * Indicador de status do favorito
   **/
  public RecargaCelularFavoritoResponse ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indicador de status do favorito")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * N\u00FAmero DDD do favorito
   **/
  public RecargaCelularFavoritoResponse dddCelular(String dddCelular) {
    this.dddCelular = dddCelular;
    return this;
  }
  
  @ApiModelProperty(example = "041", value = "N\u00FAmero DDD do favorito")
  @JsonProperty("dddCelular")
  public String getDddCelular() {
    return dddCelular;
  }
  public void setDddCelular(String dddCelular) {
    this.dddCelular = dddCelular;
  }

  
  /**
   * Descri\u00E7\u00E3o da operadora
   **/
  public RecargaCelularFavoritoResponse descricaoOperadora(String descricaoOperadora) {
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

  
  /**
   * Identificador do favorito
   **/
  public RecargaCelularFavoritoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Identificador do favorito")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da conta
   **/
  public RecargaCelularFavoritoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Nome do favorito
   **/
  public RecargaCelularFavoritoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "João Silva", value = "Nome do favorito")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * N\u00FAmero do celular do favorito
   **/
  public RecargaCelularFavoritoResponse numeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
    return this;
  }
  
  @ApiModelProperty(example = "999999999", value = "N\u00FAmero do celular do favorito")
  @JsonProperty("numeroCelular")
  public String getNumeroCelular() {
    return numeroCelular;
  }
  public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecargaCelularFavoritoResponse recargaCelularFavoritoResponse = (RecargaCelularFavoritoResponse) o;
    return Objects.equals(this.ativo, recargaCelularFavoritoResponse.ativo) &&
        Objects.equals(this.dddCelular, recargaCelularFavoritoResponse.dddCelular) &&
        Objects.equals(this.descricaoOperadora, recargaCelularFavoritoResponse.descricaoOperadora) &&
        Objects.equals(this.id, recargaCelularFavoritoResponse.id) &&
        Objects.equals(this.idConta, recargaCelularFavoritoResponse.idConta) &&
        Objects.equals(this.nome, recargaCelularFavoritoResponse.nome) &&
        Objects.equals(this.numeroCelular, recargaCelularFavoritoResponse.numeroCelular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ativo, dddCelular, descricaoOperadora, id, idConta, nome, numeroCelular);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecargaCelularFavoritoResponse {\n");
    
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
    sb.append("    dddCelular: ").append(toIndentedString(dddCelular)).append("\n");
    sb.append("    descricaoOperadora: ").append(toIndentedString(descricaoOperadora)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    numeroCelular: ").append(toIndentedString(numeroCelular)).append("\n");
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

