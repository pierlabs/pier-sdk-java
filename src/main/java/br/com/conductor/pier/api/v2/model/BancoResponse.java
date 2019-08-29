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
  private String ispb = null;
  private String cnpj = null;
  private Boolean flagAtivoBacen = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Banco (id)
   **/
  public BancoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Banco (id)")
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
   * Descri\u00E7\u00E3o do banco
   **/
  public BancoResponse descricao(String descricao) {
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

  
  /**
   * C\u00F3digo ispb do banco
   **/
  public BancoResponse ispb(String ispb) {
    this.ispb = ispb;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo ispb do banco")
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
  public BancoResponse cnpj(String cnpj) {
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
  public BancoResponse flagAtivoBacen(Boolean flagAtivoBacen) {
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
    BancoResponse bancoResponse = (BancoResponse) o;
    return Objects.equals(this.id, bancoResponse.id) &&
        Objects.equals(this.nome, bancoResponse.nome) &&
        Objects.equals(this.descricao, bancoResponse.descricao) &&
        Objects.equals(this.digitoBanco, bancoResponse.digitoBanco) &&
        Objects.equals(this.ispb, bancoResponse.ispb) &&
        Objects.equals(this.cnpj, bancoResponse.cnpj) &&
        Objects.equals(this.flagAtivoBacen, bancoResponse.flagAtivoBacen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, descricao, digitoBanco, ispb, cnpj, flagAtivoBacen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BancoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    digitoBanco: ").append(toIndentedString(digitoBanco)).append("\n");
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

