package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Endere\u00C3\u00A7o
 **/

@ApiModel(description = "Objeto Endere\u00C3\u00A7o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EnderecoResponse   {
  
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

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o (id).
   **/
  public EnderecoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o endere\u00C3\u00A7o pertence (id)
   **/
  public EnderecoResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o endere\u00C3\u00A7o pertence (id)")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Tipo Endere\u00C3\u00A7o (id)
   **/
  public EnderecoResponse idTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Tipo Endere\u00C3\u00A7o (id)")
  @JsonProperty("idTipoEndereco")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * Apresenta o C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP) no formaro '58800000'
   **/
  public EnderecoResponse cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP) no formaro '58800000'")
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
  public EnderecoResponse logradouro(String logradouro) {
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
   * Apresenta o n\u00C3\u00BAmero do endere\u00C3\u00A7o
   **/
  public EnderecoResponse numero(Integer numero) {
    this.numero = numero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00C3\u00BAmero do endere\u00C3\u00A7o")
  @JsonProperty("numero")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * Apresenta descri\u00C3\u00A7oes complementares referente ao endere\u00C3\u00A7o
   **/
  public EnderecoResponse complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta descri\u00C3\u00A7oes complementares referente ao endere\u00C3\u00A7o")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Apresenta a descri\u00C3\u00A7\u00C3\u00A3o de ponto de refer\u00C3\u00AAncia do endere\u00C3\u00A7o
   **/
  public EnderecoResponse pontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a descri\u00C3\u00A7\u00C3\u00A3o de ponto de refer\u00C3\u00AAncia do endere\u00C3\u00A7o")
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
  public EnderecoResponse bairro(String bairro) {
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
  public EnderecoResponse cidade(String cidade) {
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
  public EnderecoResponse uf(String uf) {
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
  public EnderecoResponse pais(String pais) {
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
   * Apresenta a data em que fora cadastrado o Endere\u00C3\u00A7o
   **/
  public EnderecoResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data em que fora cadastrado o Endere\u00C3\u00A7o")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Data em que fora realizada a \u00C3\u00BAltima mudan\u00C3\u00A7a neste registro de endere\u00C3\u00A7o. Quando n\u00C3\u00A3o tiver ocorrido mudan\u00C3\u00A7a, conter\u00C3\u00A1 a mesma informa\u00C3\u00A7\u00C3\u00A3o que o campo dataInclusao
   **/
  public EnderecoResponse dataUltimaAtualizacao(String dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data em que fora realizada a \u00C3\u00BAltima mudan\u00C3\u00A7a neste registro de endere\u00C3\u00A7o. Quando n\u00C3\u00A3o tiver ocorrido mudan\u00C3\u00A7a, conter\u00C3\u00A1 a mesma informa\u00C3\u00A7\u00C3\u00A3o que o campo dataInclusao")
  @JsonProperty("dataUltimaAtualizacao")
  public String getDataUltimaAtualizacao() {
    return dataUltimaAtualizacao;
  }
  public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
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
    return Objects.equals(this.id, enderecoResponse.id) &&
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
        Objects.equals(this.dataUltimaAtualizacao, enderecoResponse.dataUltimaAtualizacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idPessoa, idTipoEndereco, cep, logradouro, numero, complemento, pontoReferencia, bairro, cidade, uf, pais, dataInclusao, dataUltimaAtualizacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoResponse {\n");
    
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

