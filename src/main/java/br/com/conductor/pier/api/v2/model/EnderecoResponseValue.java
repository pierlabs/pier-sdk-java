package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{endereco_response_description}}}
 **/

@ApiModel(description = "{{{endereco_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EnderecoResponseValue   {
  
  private String cep = null;
  private String endereco = null;
  private String bairro = null;
  private String cidade = null;
  private String uf = null;

  
  /**
   * {{{endereco_response_cep_value}}}
   **/
  public EnderecoResponseValue cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_cep_value}}}")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{endereco_response_endereco_value}}}
   **/
  public EnderecoResponseValue endereco(String endereco) {
    this.endereco = endereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_endereco_value}}}")
  @JsonProperty("endereco")
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  
  /**
   * {{{endereco_response_bairro_value}}}
   **/
  public EnderecoResponseValue bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_bairro_value}}}")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{endereco_response_cidade_value}}}
   **/
  public EnderecoResponseValue cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_cidade_value}}}")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{endereco_response_uf_value}}}
   **/
  public EnderecoResponseValue uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_uf_value}}}")
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
    EnderecoResponseValue enderecoResponseValue = (EnderecoResponseValue) o;
    return Objects.equals(this.cep, enderecoResponseValue.cep) &&
        Objects.equals(this.endereco, enderecoResponseValue.endereco) &&
        Objects.equals(this.bairro, enderecoResponseValue.bairro) &&
        Objects.equals(this.cidade, enderecoResponseValue.cidade) &&
        Objects.equals(this.uf, enderecoResponseValue.uf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cep, endereco, bairro, cidade, uf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoResponseValue {\n");
    
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

