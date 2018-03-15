package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Endere\u00E7o Aprovado
 **/

@ApiModel(description = "Objeto Endere\u00E7o Aprovado")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EnderecoAprovadoResponse   {
  
  private Long id = null;
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
   * C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)
   **/
  public EnderecoAprovadoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)
   **/
  public EnderecoAprovadoResponse idTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)")
  @JsonProperty("idTipoEndereco")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * Apresenta o C\u00F3digo de Endere\u00E7amento Postal (CEP) no formaro '58800000'
   **/
  public EnderecoAprovadoResponse cep(String cep) {
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
   * Apresenta o nome do Logradouro
   **/
  public EnderecoAprovadoResponse logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do Logradouro")
  @JsonProperty("logradouro")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * Apresenta o n\u00FAmero do endere\u00E7o
   **/
  public EnderecoAprovadoResponse numero(Integer numero) {
    this.numero = numero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00FAmero do endere\u00E7o")
  @JsonProperty("numero")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * Apresenta descri\u00E7oes complementares referente ao endere\u00E7o
   **/
  public EnderecoAprovadoResponse complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta descri\u00E7oes complementares referente ao endere\u00E7o")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Apresenta a descri\u00E7\u00E3o de ponto de refer\u00EAncia do endere\u00E7o
   **/
  public EnderecoAprovadoResponse pontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a descri\u00E7\u00E3o de ponto de refer\u00EAncia do endere\u00E7o")
  @JsonProperty("pontoReferencia")
  public String getPontoReferencia() {
    return pontoReferencia;
  }
  public void setPontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
  }

  
  /**
   * Apresenta nome do bairro
   **/
  public EnderecoAprovadoResponse bairro(String bairro) {
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
  public EnderecoAprovadoResponse cidade(String cidade) {
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
  public EnderecoAprovadoResponse uf(String uf) {
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

  
  /**
   * Apresenta nome do Pais
   **/
  public EnderecoAprovadoResponse pais(String pais) {
    this.pais = pais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta nome do Pais")
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Indica se o endere\u00E7o informado \u00E9 o de correspond\u00EAncia
   **/
  public EnderecoAprovadoResponse enderecoCorrespondencia(Boolean enderecoCorrespondencia) {
    this.enderecoCorrespondencia = enderecoCorrespondencia;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o endere\u00E7o informado \u00E9 o de correspond\u00EAncia")
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
    EnderecoAprovadoResponse enderecoAprovadoResponse = (EnderecoAprovadoResponse) o;
    return Objects.equals(this.id, enderecoAprovadoResponse.id) &&
        Objects.equals(this.idTipoEndereco, enderecoAprovadoResponse.idTipoEndereco) &&
        Objects.equals(this.cep, enderecoAprovadoResponse.cep) &&
        Objects.equals(this.logradouro, enderecoAprovadoResponse.logradouro) &&
        Objects.equals(this.numero, enderecoAprovadoResponse.numero) &&
        Objects.equals(this.complemento, enderecoAprovadoResponse.complemento) &&
        Objects.equals(this.pontoReferencia, enderecoAprovadoResponse.pontoReferencia) &&
        Objects.equals(this.bairro, enderecoAprovadoResponse.bairro) &&
        Objects.equals(this.cidade, enderecoAprovadoResponse.cidade) &&
        Objects.equals(this.uf, enderecoAprovadoResponse.uf) &&
        Objects.equals(this.pais, enderecoAprovadoResponse.pais) &&
        Objects.equals(this.enderecoCorrespondencia, enderecoAprovadoResponse.enderecoCorrespondencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoEndereco, cep, logradouro, numero, complemento, pontoReferencia, bairro, cidade, uf, pais, enderecoCorrespondencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoAprovadoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

