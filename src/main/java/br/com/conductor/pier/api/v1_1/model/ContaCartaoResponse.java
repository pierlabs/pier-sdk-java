package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaCartaoResponse   {
  
  private String cnpjLoja = null;
  private String cpf = null;
  private String dataCadastroConta = null;
  private String dataEmissaoIdentidade = null;
  private String dataNascimento = null;
  private String dddCelular = null;
  private Integer idConta = null;
  private String nome = null;
  private String numeroCelular = null;
  private String numeroIdentidade = null;
  private String orgaoIdentidade = null;
  private String possuiCompraAprovada = null;
  private Integer statusConta = null;
  private String ufIdentidade = null;

  
  /**
   **/
  public ContaCartaoResponse cnpjLoja(String cnpjLoja) {
    this.cnpjLoja = cnpjLoja;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cnpjLoja")
  public String getCnpjLoja() {
    return cnpjLoja;
  }
  public void setCnpjLoja(String cnpjLoja) {
    this.cnpjLoja = cnpjLoja;
  }

  
  /**
   **/
  public ContaCartaoResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  public ContaCartaoResponse dataCadastroConta(String dataCadastroConta) {
    this.dataCadastroConta = dataCadastroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataCadastroConta")
  public String getDataCadastroConta() {
    return dataCadastroConta;
  }
  public void setDataCadastroConta(String dataCadastroConta) {
    this.dataCadastroConta = dataCadastroConta;
  }

  
  /**
   **/
  public ContaCartaoResponse dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataEmissaoIdentidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   **/
  public ContaCartaoResponse dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   **/
  public ContaCartaoResponse dddCelular(String dddCelular) {
    this.dddCelular = dddCelular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dddCelular")
  public String getDddCelular() {
    return dddCelular;
  }
  public void setDddCelular(String dddCelular) {
    this.dddCelular = dddCelular;
  }

  
  /**
   **/
  public ContaCartaoResponse idConta(Integer idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idConta")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  public ContaCartaoResponse nome(String nome) {
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
  public ContaCartaoResponse numeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroCelular")
  public String getNumeroCelular() {
    return numeroCelular;
  }
  public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  
  /**
   **/
  public ContaCartaoResponse numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   **/
  public ContaCartaoResponse orgaoIdentidade(String orgaoIdentidade) {
    this.orgaoIdentidade = orgaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orgaoIdentidade")
  public String getOrgaoIdentidade() {
    return orgaoIdentidade;
  }
  public void setOrgaoIdentidade(String orgaoIdentidade) {
    this.orgaoIdentidade = orgaoIdentidade;
  }

  
  /**
   **/
  public ContaCartaoResponse possuiCompraAprovada(String possuiCompraAprovada) {
    this.possuiCompraAprovada = possuiCompraAprovada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("possuiCompraAprovada")
  public String getPossuiCompraAprovada() {
    return possuiCompraAprovada;
  }
  public void setPossuiCompraAprovada(String possuiCompraAprovada) {
    this.possuiCompraAprovada = possuiCompraAprovada;
  }

  
  /**
   **/
  public ContaCartaoResponse statusConta(Integer statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusConta")
  public Integer getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Integer statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   **/
  public ContaCartaoResponse ufIdentidade(String ufIdentidade) {
    this.ufIdentidade = ufIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ufIdentidade")
  public String getUfIdentidade() {
    return ufIdentidade;
  }
  public void setUfIdentidade(String ufIdentidade) {
    this.ufIdentidade = ufIdentidade;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaCartaoResponse contaCartaoResponse = (ContaCartaoResponse) o;
    return Objects.equals(this.cnpjLoja, contaCartaoResponse.cnpjLoja) &&
        Objects.equals(this.cpf, contaCartaoResponse.cpf) &&
        Objects.equals(this.dataCadastroConta, contaCartaoResponse.dataCadastroConta) &&
        Objects.equals(this.dataEmissaoIdentidade, contaCartaoResponse.dataEmissaoIdentidade) &&
        Objects.equals(this.dataNascimento, contaCartaoResponse.dataNascimento) &&
        Objects.equals(this.dddCelular, contaCartaoResponse.dddCelular) &&
        Objects.equals(this.idConta, contaCartaoResponse.idConta) &&
        Objects.equals(this.nome, contaCartaoResponse.nome) &&
        Objects.equals(this.numeroCelular, contaCartaoResponse.numeroCelular) &&
        Objects.equals(this.numeroIdentidade, contaCartaoResponse.numeroIdentidade) &&
        Objects.equals(this.orgaoIdentidade, contaCartaoResponse.orgaoIdentidade) &&
        Objects.equals(this.possuiCompraAprovada, contaCartaoResponse.possuiCompraAprovada) &&
        Objects.equals(this.statusConta, contaCartaoResponse.statusConta) &&
        Objects.equals(this.ufIdentidade, contaCartaoResponse.ufIdentidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cnpjLoja, cpf, dataCadastroConta, dataEmissaoIdentidade, dataNascimento, dddCelular, idConta, nome, numeroCelular, numeroIdentidade, orgaoIdentidade, possuiCompraAprovada, statusConta, ufIdentidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaCartaoResponse {\n");
    
    sb.append("    cnpjLoja: ").append(toIndentedString(cnpjLoja)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    dataCadastroConta: ").append(toIndentedString(dataCadastroConta)).append("\n");
    sb.append("    dataEmissaoIdentidade: ").append(toIndentedString(dataEmissaoIdentidade)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    dddCelular: ").append(toIndentedString(dddCelular)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    numeroCelular: ").append(toIndentedString(numeroCelular)).append("\n");
    sb.append("    numeroIdentidade: ").append(toIndentedString(numeroIdentidade)).append("\n");
    sb.append("    orgaoIdentidade: ").append(toIndentedString(orgaoIdentidade)).append("\n");
    sb.append("    possuiCompraAprovada: ").append(toIndentedString(possuiCompraAprovada)).append("\n");
    sb.append("    statusConta: ").append(toIndentedString(statusConta)).append("\n");
    sb.append("    ufIdentidade: ").append(toIndentedString(ufIdentidade)).append("\n");
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



