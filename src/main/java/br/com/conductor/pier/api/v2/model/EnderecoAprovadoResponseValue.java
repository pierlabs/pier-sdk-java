package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EnderecoAprovadoResponseValue   {
  
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
  private Integer tempoResidenciaAnos = null;
  private Integer tempoResidenciaMeses = null;

  
  /**
   * {{{endereco_aprovado_response_id_value}}}
   **/
  public EnderecoAprovadoResponseValue id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{endereco_aprovado_response_id_tipo_endereco_value}}}
   **/
  public EnderecoAprovadoResponseValue idTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_id_tipo_endereco_value}}}")
  @JsonProperty("idTipoEndereco")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * {{{endereco_aprovado_response_cep_value}}}
   **/
  public EnderecoAprovadoResponseValue cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_cep_value}}}")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{endereco_aprovado_response_logradouro_value}}}
   **/
  public EnderecoAprovadoResponseValue logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_logradouro_value}}}")
  @JsonProperty("logradouro")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * {{{endereco_aprovado_response_numero_value}}}
   **/
  public EnderecoAprovadoResponseValue numero(Integer numero) {
    this.numero = numero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_numero_value}}}")
  @JsonProperty("numero")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * {{{endereco_aprovado_response_complemento_value}}}
   **/
  public EnderecoAprovadoResponseValue complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_complemento_value}}}")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * {{{endereco_aprovado_response_ponto_referencia_value}}}
   **/
  public EnderecoAprovadoResponseValue pontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_ponto_referencia_value}}}")
  @JsonProperty("pontoReferencia")
  public String getPontoReferencia() {
    return pontoReferencia;
  }
  public void setPontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
  }

  
  /**
   * {{{endereco_aprovado_response_bairro_value}}}
   **/
  public EnderecoAprovadoResponseValue bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_bairro_value}}}")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{endereco_aprovado_response_cidade_value}}}
   **/
  public EnderecoAprovadoResponseValue cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_cidade_value}}}")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{endereco_aprovado_response_uf_value}}}
   **/
  public EnderecoAprovadoResponseValue uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_uf_value}}}")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{endereco_aprovado_response_pais_value}}}
   **/
  public EnderecoAprovadoResponseValue pais(String pais) {
    this.pais = pais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_pais_value}}}")
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * {{{endereco_aprovado_response_endereco_correspondencia_value}}}
   **/
  public EnderecoAprovadoResponseValue enderecoCorrespondencia(Boolean enderecoCorrespondencia) {
    this.enderecoCorrespondencia = enderecoCorrespondencia;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{endereco_aprovado_response_endereco_correspondencia_value}}}")
  @JsonProperty("enderecoCorrespondencia")
  public Boolean getEnderecoCorrespondencia() {
    return enderecoCorrespondencia;
  }
  public void setEnderecoCorrespondencia(Boolean enderecoCorrespondencia) {
    this.enderecoCorrespondencia = enderecoCorrespondencia;
  }

  
  /**
   * {{{endereco_aprovado_response_tempo_Residencia_Anos_value}}}
   **/
  public EnderecoAprovadoResponseValue tempoResidenciaAnos(Integer tempoResidenciaAnos) {
    this.tempoResidenciaAnos = tempoResidenciaAnos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_tempo_Residencia_Anos_value}}}")
  @JsonProperty("tempoResidenciaAnos")
  public Integer getTempoResidenciaAnos() {
    return tempoResidenciaAnos;
  }
  public void setTempoResidenciaAnos(Integer tempoResidenciaAnos) {
    this.tempoResidenciaAnos = tempoResidenciaAnos;
  }

  
  /**
   * {{{endereco_aprovado_response_tempo_Residencia_Meses_value}}}
   **/
  public EnderecoAprovadoResponseValue tempoResidenciaMeses(Integer tempoResidenciaMeses) {
    this.tempoResidenciaMeses = tempoResidenciaMeses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_aprovado_response_tempo_Residencia_Meses_value}}}")
  @JsonProperty("tempoResidenciaMeses")
  public Integer getTempoResidenciaMeses() {
    return tempoResidenciaMeses;
  }
  public void setTempoResidenciaMeses(Integer tempoResidenciaMeses) {
    this.tempoResidenciaMeses = tempoResidenciaMeses;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnderecoAprovadoResponseValue enderecoAprovadoResponseValue = (EnderecoAprovadoResponseValue) o;
    return Objects.equals(this.id, enderecoAprovadoResponseValue.id) &&
        Objects.equals(this.idTipoEndereco, enderecoAprovadoResponseValue.idTipoEndereco) &&
        Objects.equals(this.cep, enderecoAprovadoResponseValue.cep) &&
        Objects.equals(this.logradouro, enderecoAprovadoResponseValue.logradouro) &&
        Objects.equals(this.numero, enderecoAprovadoResponseValue.numero) &&
        Objects.equals(this.complemento, enderecoAprovadoResponseValue.complemento) &&
        Objects.equals(this.pontoReferencia, enderecoAprovadoResponseValue.pontoReferencia) &&
        Objects.equals(this.bairro, enderecoAprovadoResponseValue.bairro) &&
        Objects.equals(this.cidade, enderecoAprovadoResponseValue.cidade) &&
        Objects.equals(this.uf, enderecoAprovadoResponseValue.uf) &&
        Objects.equals(this.pais, enderecoAprovadoResponseValue.pais) &&
        Objects.equals(this.enderecoCorrespondencia, enderecoAprovadoResponseValue.enderecoCorrespondencia) &&
        Objects.equals(this.tempoResidenciaAnos, enderecoAprovadoResponseValue.tempoResidenciaAnos) &&
        Objects.equals(this.tempoResidenciaMeses, enderecoAprovadoResponseValue.tempoResidenciaMeses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoEndereco, cep, logradouro, numero, complemento, pontoReferencia, bairro, cidade, uf, pais, enderecoCorrespondencia, tempoResidenciaAnos, tempoResidenciaMeses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoAprovadoResponseValue {\n");
    
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
    sb.append("    tempoResidenciaAnos: ").append(toIndentedString(tempoResidenciaAnos)).append("\n");
    sb.append("    tempoResidenciaMeses: ").append(toIndentedString(tempoResidenciaMeses)).append("\n");
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

