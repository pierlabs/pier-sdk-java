package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto banco a ser persistido
 **/

@ApiModel(description = "Objeto banco a ser persistido")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BancoPersist   {
  
  private String nome = null;
  private String descricao = null;
  private String digitoBanco = null;
  private Long codigoBanco = null;
  private String ispb = null;
  private String cnpj = null;
  private Boolean flagAtivoBacen = null;

  
  /**
   * Nome do banco
   **/
  public BancoPersist nome(String nome) {
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
   * Descri\u00E7\u00E3o do banco
   **/
  public BancoPersist descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do banco")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * D\u00EDgito identificador do banco
   **/
  public BancoPersist digitoBanco(String digitoBanco) {
    this.digitoBanco = digitoBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00EDgito identificador do banco")
  @JsonProperty("digitoBanco")
  public String getDigitoBanco() {
    return digitoBanco;
  }
  public void setDigitoBanco(String digitoBanco) {
    this.digitoBanco = digitoBanco;
  }

  
  /**
   * Codigo identificador do banco
   **/
  public BancoPersist codigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Codigo identificador do banco")
  @JsonProperty("codigoBanco")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * Numero ispb do banco
   **/
  public BancoPersist ispb(String ispb) {
    this.ispb = ispb;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Numero ispb do banco")
  @JsonProperty("ispb")
  public String getIspb() {
    return ispb;
  }
  public void setIspb(String ispb) {
    this.ispb = ispb;
  }

  
  /**
   * N\u00FAmero do CNPJ do banco
   **/
  public BancoPersist cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do CNPJ do banco")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * Indica se o banco est\u00E1 ativo no BACEN
   **/
  public BancoPersist flagAtivoBacen(Boolean flagAtivoBacen) {
    this.flagAtivoBacen = flagAtivoBacen;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o banco est\u00E1 ativo no BACEN")
  @JsonProperty("flagAtivoBacen")
  public Boolean getFlagAtivoBacen() {
    return flagAtivoBacen;
  }
  public void setFlagAtivoBacen(Boolean flagAtivoBacen) {
    this.flagAtivoBacen = flagAtivoBacen;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BancoPersist bancoPersist = (BancoPersist) o;
    return Objects.equals(this.nome, bancoPersist.nome) &&
        Objects.equals(this.descricao, bancoPersist.descricao) &&
        Objects.equals(this.digitoBanco, bancoPersist.digitoBanco) &&
        Objects.equals(this.codigoBanco, bancoPersist.codigoBanco) &&
        Objects.equals(this.ispb, bancoPersist.ispb) &&
        Objects.equals(this.cnpj, bancoPersist.cnpj) &&
        Objects.equals(this.flagAtivoBacen, bancoPersist.flagAtivoBacen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, descricao, digitoBanco, codigoBanco, ispb, cnpj, flagAtivoBacen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BancoPersist {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    digitoBanco: ").append(toIndentedString(digitoBanco)).append("\n");
    sb.append("    codigoBanco: ").append(toIndentedString(codigoBanco)).append("\n");
    sb.append("    ispb: ").append(toIndentedString(ispb)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    flagAtivoBacen: ").append(toIndentedString(flagAtivoBacen)).append("\n");
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

