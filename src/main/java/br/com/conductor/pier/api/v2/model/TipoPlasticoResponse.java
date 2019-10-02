package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoPlasticoResponse   {
  
  private Boolean bandeirado = null;
  private String fabrica = null;
  private Long id = null;
  private Long idEntidade = null;
  private String nome = null;
  private String nomeArquivo = null;
  private String tamanhoLinhas = null;
  private BigDecimal valorEmissao = null;

  
  /**
   **/
  public TipoPlasticoResponse bandeirado(Boolean bandeirado) {
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
  public TipoPlasticoResponse fabrica(String fabrica) {
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
  public TipoPlasticoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  public TipoPlasticoResponse idEntidade(Long idEntidade) {
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
  public TipoPlasticoResponse nome(String nome) {
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
  public TipoPlasticoResponse nomeArquivo(String nomeArquivo) {
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
  public TipoPlasticoResponse tamanhoLinhas(String tamanhoLinhas) {
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
  public TipoPlasticoResponse valorEmissao(BigDecimal valorEmissao) {
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
    TipoPlasticoResponse tipoPlasticoResponse = (TipoPlasticoResponse) o;
    return Objects.equals(this.bandeirado, tipoPlasticoResponse.bandeirado) &&
        Objects.equals(this.fabrica, tipoPlasticoResponse.fabrica) &&
        Objects.equals(this.id, tipoPlasticoResponse.id) &&
        Objects.equals(this.idEntidade, tipoPlasticoResponse.idEntidade) &&
        Objects.equals(this.nome, tipoPlasticoResponse.nome) &&
        Objects.equals(this.nomeArquivo, tipoPlasticoResponse.nomeArquivo) &&
        Objects.equals(this.tamanhoLinhas, tipoPlasticoResponse.tamanhoLinhas) &&
        Objects.equals(this.valorEmissao, tipoPlasticoResponse.valorEmissao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandeirado, fabrica, id, idEntidade, nome, nomeArquivo, tamanhoLinhas, valorEmissao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoPlasticoResponse {\n");
    
    sb.append("    bandeirado: ").append(toIndentedString(bandeirado)).append("\n");
    sb.append("    fabrica: ").append(toIndentedString(fabrica)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

