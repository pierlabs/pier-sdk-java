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
public class EnderecoResponse   {
  
  private Integer tempoResidenciaAnos = null;
  private Integer tempoResidenciaMeses = null;
  private Long id = null;
  private Long idPessoa = null;
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
  private String dataInclusao = null;
  private String dataUltimaAtualizacao = null;
  private Boolean flagCorrespondencia = null;

  
  /**
   * {{{endereco_response_tempo_residencia_anos_value}}}
   **/
  public EnderecoResponse tempoResidenciaAnos(Integer tempoResidenciaAnos) {
    this.tempoResidenciaAnos = tempoResidenciaAnos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_tempo_residencia_anos_value}}}")
  @JsonProperty("tempoResidenciaAnos")
  public Integer getTempoResidenciaAnos() {
    return tempoResidenciaAnos;
  }
  public void setTempoResidenciaAnos(Integer tempoResidenciaAnos) {
    this.tempoResidenciaAnos = tempoResidenciaAnos;
  }

  
  /**
   * {{{endereco_response_tempo_residencia_meses_value}}}
   **/
  public EnderecoResponse tempoResidenciaMeses(Integer tempoResidenciaMeses) {
    this.tempoResidenciaMeses = tempoResidenciaMeses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_tempo_residencia_meses_value}}}")
  @JsonProperty("tempoResidenciaMeses")
  public Integer getTempoResidenciaMeses() {
    return tempoResidenciaMeses;
  }
  public void setTempoResidenciaMeses(Integer tempoResidenciaMeses) {
    this.tempoResidenciaMeses = tempoResidenciaMeses;
  }

  
  /**
   * {{{endereco_response_id_value}}}
   **/
  public EnderecoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{endereco_response_id_pessoa_value}}}
   **/
  public EnderecoResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{endereco_response_id_tipo_endereco_value}}}
   **/
  public EnderecoResponse idTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_id_tipo_endereco_value}}}")
  @JsonProperty("idTipoEndereco")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * {{{endereco_response_cep_value}}}
   **/
  public EnderecoResponse cep(String cep) {
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
   * {{{endereco_response_logradouro_value}}}
   **/
  public EnderecoResponse logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_logradouro_value}}}")
  @JsonProperty("logradouro")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * {{{endereco_response_numero_value}}}
   **/
  public EnderecoResponse numero(Integer numero) {
    this.numero = numero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_numero_value}}}")
  @JsonProperty("numero")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * {{{endereco_response_complemento_value}}}
   **/
  public EnderecoResponse complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_complemento_value}}}")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * {{{endereco_response_ponto_referencia_value}}}
   **/
  public EnderecoResponse pontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_ponto_referencia_value}}}")
  @JsonProperty("pontoReferencia")
  public String getPontoReferencia() {
    return pontoReferencia;
  }
  public void setPontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
  }

  
  /**
   * {{{endereco_response_bairro_value}}}
   **/
  public EnderecoResponse bairro(String bairro) {
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
  public EnderecoResponse cidade(String cidade) {
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
  public EnderecoResponse uf(String uf) {
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

  
  /**
   * {{{endereco_response_pais_value}}}
   **/
  public EnderecoResponse pais(String pais) {
    this.pais = pais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_pais_value}}}")
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * {{{endereco_response_data_inclusao_value}}}
   **/
  public EnderecoResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_data_inclusao_value}}}")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{endereco_response_data_ultima_atualizacao_value}}}
   **/
  public EnderecoResponse dataUltimaAtualizacao(String dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{endereco_response_data_ultima_atualizacao_value}}}")
  @JsonProperty("dataUltimaAtualizacao")
  public String getDataUltimaAtualizacao() {
    return dataUltimaAtualizacao;
  }
  public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
  }

  
  /**
   * {{{endereco_response_flag_correspondencia_value}}}
   **/
  public EnderecoResponse flagCorrespondencia(Boolean flagCorrespondencia) {
    this.flagCorrespondencia = flagCorrespondencia;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{endereco_response_flag_correspondencia_value}}}")
  @JsonProperty("flagCorrespondencia")
  public Boolean getFlagCorrespondencia() {
    return flagCorrespondencia;
  }
  public void setFlagCorrespondencia(Boolean flagCorrespondencia) {
    this.flagCorrespondencia = flagCorrespondencia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnderecoResponse enderecoResponse = (EnderecoResponse) o;
    return Objects.equals(this.tempoResidenciaAnos, enderecoResponse.tempoResidenciaAnos) &&
        Objects.equals(this.tempoResidenciaMeses, enderecoResponse.tempoResidenciaMeses) &&
        Objects.equals(this.id, enderecoResponse.id) &&
        Objects.equals(this.idPessoa, enderecoResponse.idPessoa) &&
        Objects.equals(this.idTipoEndereco, enderecoResponse.idTipoEndereco) &&
        Objects.equals(this.cep, enderecoResponse.cep) &&
        Objects.equals(this.logradouro, enderecoResponse.logradouro) &&
        Objects.equals(this.numero, enderecoResponse.numero) &&
        Objects.equals(this.complemento, enderecoResponse.complemento) &&
        Objects.equals(this.pontoReferencia, enderecoResponse.pontoReferencia) &&
        Objects.equals(this.bairro, enderecoResponse.bairro) &&
        Objects.equals(this.cidade, enderecoResponse.cidade) &&
        Objects.equals(this.uf, enderecoResponse.uf) &&
        Objects.equals(this.pais, enderecoResponse.pais) &&
        Objects.equals(this.dataInclusao, enderecoResponse.dataInclusao) &&
        Objects.equals(this.dataUltimaAtualizacao, enderecoResponse.dataUltimaAtualizacao) &&
        Objects.equals(this.flagCorrespondencia, enderecoResponse.flagCorrespondencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tempoResidenciaAnos, tempoResidenciaMeses, id, idPessoa, idTipoEndereco, cep, logradouro, numero, complemento, pontoReferencia, bairro, cidade, uf, pais, dataInclusao, dataUltimaAtualizacao, flagCorrespondencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoResponse {\n");
    
    sb.append("    tempoResidenciaAnos: ").append(toIndentedString(tempoResidenciaAnos)).append("\n");
    sb.append("    tempoResidenciaMeses: ").append(toIndentedString(tempoResidenciaMeses)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
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
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    dataUltimaAtualizacao: ").append(toIndentedString(dataUltimaAtualizacao)).append("\n");
    sb.append("    flagCorrespondencia: ").append(toIndentedString(flagCorrespondencia)).append("\n");
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

