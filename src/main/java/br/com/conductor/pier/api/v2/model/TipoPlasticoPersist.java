package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoPlasticoPersist   {
  
  private Boolean bandeirado = null;
  private String fabrica = null;
  private Long idEntidade = null;
  private String nome = null;
  private String nomeArquivo = null;
  private String tamanhoLinhas = null;
  private BigDecimal valorEmissao = null;

  
  /**
   **/
  public TipoPlasticoPersist bandeirado(Boolean bandeirado) {
    this.bandeirado = bandeirado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bandeirado")
  public Boolean getBandeirado() {
    return bandeirado;
  }
  public void setBandeirado(Boolean bandeirado) {
    this.bandeirado = bandeirado;
  }

  
  /**
   **/
  public TipoPlasticoPersist fabrica(String fabrica) {
    this.fabrica = fabrica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fabrica")
  public String getFabrica() {
    return fabrica;
  }
  public void setFabrica(String fabrica) {
    this.fabrica = fabrica;
  }

  
  /**
   **/
  public TipoPlasticoPersist idEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idEntidade")
  public Long getIdEntidade() {
    return idEntidade;
  }
  public void setIdEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
  }

  
  /**
   **/
  public TipoPlasticoPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   **/
  public TipoPlasticoPersist nomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeArquivo")
  public String getNomeArquivo() {
    return nomeArquivo;
  }
  public void setNomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
  }

  
  /**
   **/
  public TipoPlasticoPersist tamanhoLinhas(String tamanhoLinhas) {
    this.tamanhoLinhas = tamanhoLinhas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tamanhoLinhas")
  public String getTamanhoLinhas() {
    return tamanhoLinhas;
  }
  public void setTamanhoLinhas(String tamanhoLinhas) {
    this.tamanhoLinhas = tamanhoLinhas;
  }

  
  /**
   **/
  public TipoPlasticoPersist valorEmissao(BigDecimal valorEmissao) {
    this.valorEmissao = valorEmissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorEmissao")
  public BigDecimal getValorEmissao() {
    return valorEmissao;
  }
  public void setValorEmissao(BigDecimal valorEmissao) {
    this.valorEmissao = valorEmissao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoPlasticoPersist tipoPlasticoPersist = (TipoPlasticoPersist) o;
    return Objects.equals(this.bandeirado, tipoPlasticoPersist.bandeirado) &&
        Objects.equals(this.fabrica, tipoPlasticoPersist.fabrica) &&
        Objects.equals(this.idEntidade, tipoPlasticoPersist.idEntidade) &&
        Objects.equals(this.nome, tipoPlasticoPersist.nome) &&
        Objects.equals(this.nomeArquivo, tipoPlasticoPersist.nomeArquivo) &&
        Objects.equals(this.tamanhoLinhas, tipoPlasticoPersist.tamanhoLinhas) &&
        Objects.equals(this.valorEmissao, tipoPlasticoPersist.valorEmissao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandeirado, fabrica, idEntidade, nome, nomeArquivo, tamanhoLinhas, valorEmissao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoPlasticoPersist {\n");
    
    sb.append("    bandeirado: ").append(toIndentedString(bandeirado)).append("\n");
    sb.append("    fabrica: ").append(toIndentedString(fabrica)).append("\n");
    sb.append("    idEntidade: ").append(toIndentedString(idEntidade)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    nomeArquivo: ").append(toIndentedString(nomeArquivo)).append("\n");
    sb.append("    tamanhoLinhas: ").append(toIndentedString(tamanhoLinhas)).append("\n");
    sb.append("    valorEmissao: ").append(toIndentedString(valorEmissao)).append("\n");
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

