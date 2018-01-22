package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Banco
 **/

@ApiModel(description = "Objeto Banco")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BancoResponse   {
  
  private Long id = null;
  private String nome = null;
  private String descricao = null;
  private String digitoBanco = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Banco (id).
   **/
  public BancoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Banco (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do banco
   **/
  public BancoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do banco")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do banco
   **/
  public BancoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do banco")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Digito do banco
   **/
  public BancoResponse digitoBanco(String digitoBanco) {
    this.digitoBanco = digitoBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Digito do banco")
  @JsonProperty("digitoBanco")
  public String getDigitoBanco() {
    return digitoBanco;
  }
  public void setDigitoBanco(String digitoBanco) {
    this.digitoBanco = digitoBanco;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BancoResponse bancoResponse = (BancoResponse) o;
    return Objects.equals(this.id, bancoResponse.id) &&
        Objects.equals(this.nome, bancoResponse.nome) &&
        Objects.equals(this.descricao, bancoResponse.descricao) &&
        Objects.equals(this.digitoBanco, bancoResponse.digitoBanco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, descricao, digitoBanco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BancoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    digitoBanco: ").append(toIndentedString(digitoBanco)).append("\n");
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

