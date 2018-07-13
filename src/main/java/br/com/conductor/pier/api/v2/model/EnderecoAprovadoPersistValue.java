package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{endereco_aprovado_persist_description}}}
 **/

@ApiModel(description = "{{{endereco_aprovado_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EnderecoAprovadoPersistValue   {
  
  private Long idTipoEndereco = null;
  private String cep = null;
  private String logradouro = null;
  private Integer numero = null;
  private String complemento = null;
  private String pontoReferencia = null;
  private String bairro = null;
  private String cidade = null;
  private String uf = null;
  private String pais = null;
  private Boolean enderecoCorrespondencia = null;

  
  /**
   * {{{endereco_aprovado_persist_id_tipo_endereco_value}}}
   **/
  public EnderecoAprovadoPersistValue idTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{endereco_aprovado_persist_id_tipo_endereco_value}}}")
  @JsonProperty("idTipoEndereco")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * {{{endereco_aprovado_persist_cep_value}}}
   **/
  public EnderecoAprovadoPersistValue cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_persist_cep_value}}}")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{endereco_aprovado_persist_logradouro_value}}}
   **/
  public EnderecoAprovadoPersistValue logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_persist_logradouro_value}}}")
  @JsonProperty("logradouro")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * {{{endereco_aprovado_persist_numero_value}}}
   **/
  public EnderecoAprovadoPersistValue numero(Integer numero) {
    this.numero = numero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_persist_numero_value}}}")
  @JsonProperty("numero")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * {{{endereco_aprovado_persist_complemento_value}}}
   **/
  public EnderecoAprovadoPersistValue complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_persist_complemento_value}}}")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * {{{endereco_aprovado_persist_ponto_referencia_value}}}
   **/
  public EnderecoAprovadoPersistValue pontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_persist_ponto_referencia_value}}}")
  @JsonProperty("pontoReferencia")
  public String getPontoReferencia() {
    return pontoReferencia;
  }
  public void setPontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
  }

  
  /**
   * {{{endereco_aprovado_persist_bairro_value}}}
   **/
  public EnderecoAprovadoPersistValue bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_persist_bairro_value}}}")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{endereco_aprovado_persist_cidade_value}}}
   **/
  public EnderecoAprovadoPersistValue cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{endereco_aprovado_persist_cidade_value}}}")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{endereco_aprovado_persist_uf_value}}}
   **/
  public EnderecoAprovadoPersistValue uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{endereco_aprovado_persist_uf_value}}}")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{endereco_aprovado_persist_pais_value}}}
   **/
  public EnderecoAprovadoPersistValue pais(String pais) {
    this.pais = pais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_persist_pais_value}}}")
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * {{{endereco_aprovado_persist_endereco_correspondencia_value}}}
   **/
  public EnderecoAprovadoPersistValue enderecoCorrespondencia(Boolean enderecoCorrespondencia) {
    this.enderecoCorrespondencia = enderecoCorrespondencia;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "{{{endereco_aprovado_persist_endereco_correspondencia_value}}}")
  @JsonProperty("enderecoCorrespondencia")
  public Boolean getEnderecoCorrespondencia() {
    return enderecoCorrespondencia;
  }
  public void setEnderecoCorrespondencia(Boolean enderecoCorrespondencia) {
    this.enderecoCorrespondencia = enderecoCorrespondencia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnderecoAprovadoPersistValue enderecoAprovadoPersistValue = (EnderecoAprovadoPersistValue) o;
    return Objects.equals(this.idTipoEndereco, enderecoAprovadoPersistValue.idTipoEndereco) &&
        Objects.equals(this.cep, enderecoAprovadoPersistValue.cep) &&
        Objects.equals(this.logradouro, enderecoAprovadoPersistValue.logradouro) &&
        Objects.equals(this.numero, enderecoAprovadoPersistValue.numero) &&
        Objects.equals(this.complemento, enderecoAprovadoPersistValue.complemento) &&
        Objects.equals(this.pontoReferencia, enderecoAprovadoPersistValue.pontoReferencia) &&
        Objects.equals(this.bairro, enderecoAprovadoPersistValue.bairro) &&
        Objects.equals(this.cidade, enderecoAprovadoPersistValue.cidade) &&
        Objects.equals(this.uf, enderecoAprovadoPersistValue.uf) &&
        Objects.equals(this.pais, enderecoAprovadoPersistValue.pais) &&
        Objects.equals(this.enderecoCorrespondencia, enderecoAprovadoPersistValue.enderecoCorrespondencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoEndereco, cep, logradouro, numero, complemento, pontoReferencia, bairro, cidade, uf, pais, enderecoCorrespondencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoAprovadoPersistValue {\n");
    
    sb.append("    idTipoEndereco: ").append(toIndentedString(idTipoEndereco)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    pontoReferencia: ").append(toIndentedString(pontoReferencia)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    enderecoCorrespondencia: ").append(toIndentedString(enderecoCorrespondencia)).append("\n");
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



