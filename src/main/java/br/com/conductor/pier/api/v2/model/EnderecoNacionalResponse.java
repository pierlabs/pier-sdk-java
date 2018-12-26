package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Endere\u00E7o
 **/

@ApiModel(description = "Objeto Endere\u00E7o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EnderecoNacionalResponse   {
  
  private String cep = null;
  private String endereco = null;
  private String bairro = null;
  private String cidade = null;
  private String uf = null;

  
  /**
   * Apresenta o C\u00F3digo de Endere\u00E7amento Postal (CEP) no formaro '58800000'
   **/
  public EnderecoNacionalResponse cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00F3digo de Endere\u00E7amento Postal (CEP) no formaro '58800000'")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * Endere\u00E7o
   **/
  public EnderecoNacionalResponse endereco(String endereco) {
    this.endereco = endereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Endere\u00E7o")
  @JsonProperty("endereco")
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  
  /**
   * Apresenta nome do bairro
   **/
  public EnderecoNacionalResponse bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta nome do bairro")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Apresenta nome da cidade
   **/
  public EnderecoNacionalResponse cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta nome da cidade")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Apresenta sigla da Unidade Federativa
   **/
  public EnderecoNacionalResponse uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta sigla da Unidade Federativa")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnderecoNacionalResponse enderecoNacionalResponse = (EnderecoNacionalResponse) o;
    return Objects.equals(this.cep, enderecoNacionalResponse.cep) &&
        Objects.equals(this.endereco, enderecoNacionalResponse.endereco) &&
        Objects.equals(this.bairro, enderecoNacionalResponse.bairro) &&
        Objects.equals(this.cidade, enderecoNacionalResponse.cidade) &&
        Objects.equals(this.uf, enderecoNacionalResponse.uf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cep, endereco, bairro, cidade, uf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoNacionalResponse {\n");
    
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
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

