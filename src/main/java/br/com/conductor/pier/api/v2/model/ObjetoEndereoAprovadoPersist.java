package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ObjetoEndereoAprovadoPersist   {
  
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
   * C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)
   **/
  public ObjetoEndereoAprovadoPersist idTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)")
  @JsonProperty("idTipoEndereco")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * Apresenta o C\u00F3digo de Endere\u00E7amento Postal (CEP)
   **/
  public ObjetoEndereoAprovadoPersist cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00F3digo de Endere\u00E7amento Postal (CEP)")
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
  public ObjetoEndereoAprovadoPersist logradouro(String logradouro) {
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
  public ObjetoEndereoAprovadoPersist numero(Integer numero) {
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
  public ObjetoEndereoAprovadoPersist complemento(String complemento) {
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
  public ObjetoEndereoAprovadoPersist pontoReferencia(String pontoReferencia) {
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
  public ObjetoEndereoAprovadoPersist bairro(String bairro) {
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
  public ObjetoEndereoAprovadoPersist cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta nome da cidade")
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
  public ObjetoEndereoAprovadoPersist uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta sigla da Unidade Federativa")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Apresenta nome do Pa\u00EDs
   **/
  public ObjetoEndereoAprovadoPersist pais(String pais) {
    this.pais = pais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta nome do Pa\u00EDs")
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
  public ObjetoEndereoAprovadoPersist enderecoCorrespondencia(Boolean enderecoCorrespondencia) {
    this.enderecoCorrespondencia = enderecoCorrespondencia;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Indica se o endere\u00E7o informado \u00E9 o de correspond\u00EAncia")
  @JsonProperty("enderecoCorrespondencia")
  public Boolean getEnderecoCorrespondencia() {
    return enderecoCorrespondencia;
  }
  public void setEnderecoCorrespondencia(Boolean enderecoCorrespondencia) {
    this.enderecoCorrespondencia = enderecoCorrespondencia;
  }

  
  /**
   * Apresenta o tempo de resid\u00EAncia em anos
   **/
  public ObjetoEndereoAprovadoPersist tempoResidenciaAnos(Integer tempoResidenciaAnos) {
    this.tempoResidenciaAnos = tempoResidenciaAnos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o tempo de resid\u00EAncia em anos")
  @JsonProperty("tempoResidenciaAnos")
  public Integer getTempoResidenciaAnos() {
    return tempoResidenciaAnos;
  }
  public void setTempoResidenciaAnos(Integer tempoResidenciaAnos) {
    this.tempoResidenciaAnos = tempoResidenciaAnos;
  }

  
  /**
   * Apresenta o tempo de resid\u00EAncia em meses
   **/
  public ObjetoEndereoAprovadoPersist tempoResidenciaMeses(Integer tempoResidenciaMeses) {
    this.tempoResidenciaMeses = tempoResidenciaMeses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o tempo de resid\u00EAncia em meses")
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
    ObjetoEndereoAprovadoPersist objetoEndereoAprovadoPersist = (ObjetoEndereoAprovadoPersist) o;
    return Objects.equals(this.idTipoEndereco, objetoEndereoAprovadoPersist.idTipoEndereco) &&
        Objects.equals(this.cep, objetoEndereoAprovadoPersist.cep) &&
        Objects.equals(this.logradouro, objetoEndereoAprovadoPersist.logradouro) &&
        Objects.equals(this.numero, objetoEndereoAprovadoPersist.numero) &&
        Objects.equals(this.complemento, objetoEndereoAprovadoPersist.complemento) &&
        Objects.equals(this.pontoReferencia, objetoEndereoAprovadoPersist.pontoReferencia) &&
        Objects.equals(this.bairro, objetoEndereoAprovadoPersist.bairro) &&
        Objects.equals(this.cidade, objetoEndereoAprovadoPersist.cidade) &&
        Objects.equals(this.uf, objetoEndereoAprovadoPersist.uf) &&
        Objects.equals(this.pais, objetoEndereoAprovadoPersist.pais) &&
        Objects.equals(this.enderecoCorrespondencia, objetoEndereoAprovadoPersist.enderecoCorrespondencia) &&
        Objects.equals(this.tempoResidenciaAnos, objetoEndereoAprovadoPersist.tempoResidenciaAnos) &&
        Objects.equals(this.tempoResidenciaMeses, objetoEndereoAprovadoPersist.tempoResidenciaMeses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoEndereco, cep, logradouro, numero, complemento, pontoReferencia, bairro, cidade, uf, pais, enderecoCorrespondencia, tempoResidenciaAnos, tempoResidenciaMeses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjetoEndereoAprovadoPersist {\n");
    
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

