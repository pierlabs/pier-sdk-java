package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Response da lista de hist\u00F3rico altera\u00E7\u00E3o de endere\u00E7o
 **/

@ApiModel(description = "Objeto Response da lista de hist\u00F3rico altera\u00E7\u00E3o de endere\u00E7o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoEnderecoResponse   {
  
  private String dataUltimaAtualizacao = null;
  private String cpf = null;
  private Long idConta = null;
  private String nome = null;
  private String nomeLogradouroAnterior = null;
  private String ufAnterior = null;
  private String cidadeAnterior = null;
  private String cepAnterior = null;
  private Integer numeroAnterior = null;
  private String complementoAnterior = null;
  private String tipoEnderecoAnterior = null;
  private String dataInclusaoAnterior = null;
  private String nomeLogradouro = null;
  private String uf = null;
  private String cidade = null;
  private String cep = null;
  private Integer numero = null;
  private String complemento = null;
  private String tipoEndereco = null;
  private String dataInclusao = null;
  private String alteracaoAplicativo = null;

  
  /**
   * Data de \u00FAltima altera\u00E7\u00E3o
   **/
  public HistoricoEnderecoResponse dataUltimaAtualizacao(String dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de \u00FAltima altera\u00E7\u00E3o")
  @JsonProperty("dataUltimaAtualizacao")
  public String getDataUltimaAtualizacao() {
    return dataUltimaAtualizacao;
  }
  public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
  }

  
  /**
   * Cpf
   **/
  public HistoricoEnderecoResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cpf")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Identificador da conta
   **/
  public HistoricoEnderecoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Nome da pessoa
   **/
  public HistoricoEnderecoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da pessoa")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Nome do logradouro do endere\u00E7o antigo
   **/
  public HistoricoEnderecoResponse nomeLogradouroAnterior(String nomeLogradouroAnterior) {
    this.nomeLogradouroAnterior = nomeLogradouroAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do logradouro do endere\u00E7o antigo")
  @JsonProperty("nomeLogradouroAnterior")
  public String getNomeLogradouroAnterior() {
    return nomeLogradouroAnterior;
  }
  public void setNomeLogradouroAnterior(String nomeLogradouroAnterior) {
    this.nomeLogradouroAnterior = nomeLogradouroAnterior;
  }

  
  /**
   * Estado do endere\u00E7o antigo
   **/
  public HistoricoEnderecoResponse ufAnterior(String ufAnterior) {
    this.ufAnterior = ufAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Estado do endere\u00E7o antigo")
  @JsonProperty("ufAnterior")
  public String getUfAnterior() {
    return ufAnterior;
  }
  public void setUfAnterior(String ufAnterior) {
    this.ufAnterior = ufAnterior;
  }

  
  /**
   * Cidade do endere\u00E7o antigo
   **/
  public HistoricoEnderecoResponse cidadeAnterior(String cidadeAnterior) {
    this.cidadeAnterior = cidadeAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cidade do endere\u00E7o antigo")
  @JsonProperty("cidadeAnterior")
  public String getCidadeAnterior() {
    return cidadeAnterior;
  }
  public void setCidadeAnterior(String cidadeAnterior) {
    this.cidadeAnterior = cidadeAnterior;
  }

  
  /**
   * Cep do endere\u00E7o antigo
   **/
  public HistoricoEnderecoResponse cepAnterior(String cepAnterior) {
    this.cepAnterior = cepAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cep do endere\u00E7o antigo")
  @JsonProperty("cepAnterior")
  public String getCepAnterior() {
    return cepAnterior;
  }
  public void setCepAnterior(String cepAnterior) {
    this.cepAnterior = cepAnterior;
  }

  
  /**
   * N\u00FAmero do logradouro do endere\u00E7o antigo
   **/
  public HistoricoEnderecoResponse numeroAnterior(Integer numeroAnterior) {
    this.numeroAnterior = numeroAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do logradouro do endere\u00E7o antigo")
  @JsonProperty("numeroAnterior")
  public Integer getNumeroAnterior() {
    return numeroAnterior;
  }
  public void setNumeroAnterior(Integer numeroAnterior) {
    this.numeroAnterior = numeroAnterior;
  }

  
  /**
   * Complemento do endere\u00E7o antigo
   **/
  public HistoricoEnderecoResponse complementoAnterior(String complementoAnterior) {
    this.complementoAnterior = complementoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Complemento do endere\u00E7o antigo")
  @JsonProperty("complementoAnterior")
  public String getComplementoAnterior() {
    return complementoAnterior;
  }
  public void setComplementoAnterior(String complementoAnterior) {
    this.complementoAnterior = complementoAnterior;
  }

  
  /**
   * Tipo de endere\u00E7o do endere\u00E7o antigo
   **/
  public HistoricoEnderecoResponse tipoEnderecoAnterior(String tipoEnderecoAnterior) {
    this.tipoEnderecoAnterior = tipoEnderecoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de endere\u00E7o do endere\u00E7o antigo")
  @JsonProperty("tipoEnderecoAnterior")
  public String getTipoEnderecoAnterior() {
    return tipoEnderecoAnterior;
  }
  public void setTipoEnderecoAnterior(String tipoEnderecoAnterior) {
    this.tipoEnderecoAnterior = tipoEnderecoAnterior;
  }

  
  /**
   * Data de inclus\u00E3o do endere\u00E7o antigo
   **/
  public HistoricoEnderecoResponse dataInclusaoAnterior(String dataInclusaoAnterior) {
    this.dataInclusaoAnterior = dataInclusaoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de inclus\u00E3o do endere\u00E7o antigo")
  @JsonProperty("dataInclusaoAnterior")
  public String getDataInclusaoAnterior() {
    return dataInclusaoAnterior;
  }
  public void setDataInclusaoAnterior(String dataInclusaoAnterior) {
    this.dataInclusaoAnterior = dataInclusaoAnterior;
  }

  
  /**
   * Nome do logradouro do endere\u00E7o novo
   **/
  public HistoricoEnderecoResponse nomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do logradouro do endere\u00E7o novo")
  @JsonProperty("nomeLogradouro")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * Estado do endere\u00E7o novo
   **/
  public HistoricoEnderecoResponse uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Estado do endere\u00E7o novo")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Cidade do endere\u00E7o novo
   **/
  public HistoricoEnderecoResponse cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cidade do endere\u00E7o novo")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Cep do endere\u00E7o novo
   **/
  public HistoricoEnderecoResponse cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cep do endere\u00E7o novo")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * N\u00FAmero do logradouro do endere\u00E7o novo
   **/
  public HistoricoEnderecoResponse numero(Integer numero) {
    this.numero = numero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do logradouro do endere\u00E7o novo")
  @JsonProperty("numero")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * Complemento do endere\u00E7o novo
   **/
  public HistoricoEnderecoResponse complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Complemento do endere\u00E7o novo")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Tipo de endere\u00E7o do endere\u00E7o novo
   **/
  public HistoricoEnderecoResponse tipoEndereco(String tipoEndereco) {
    this.tipoEndereco = tipoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de endere\u00E7o do endere\u00E7o novo")
  @JsonProperty("tipoEndereco")
  public String getTipoEndereco() {
    return tipoEndereco;
  }
  public void setTipoEndereco(String tipoEndereco) {
    this.tipoEndereco = tipoEndereco;
  }

  
  /**
   * Data de inclus\u00E3o do endere\u00E7o novo
   **/
  public HistoricoEnderecoResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de inclus\u00E3o do endere\u00E7o novo")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Aplicativo respons\u00E1vel pela altera\u00E7\u00E3o
   **/
  public HistoricoEnderecoResponse alteracaoAplicativo(String alteracaoAplicativo) {
    this.alteracaoAplicativo = alteracaoAplicativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aplicativo respons\u00E1vel pela altera\u00E7\u00E3o")
  @JsonProperty("alteracaoAplicativo")
  public String getAlteracaoAplicativo() {
    return alteracaoAplicativo;
  }
  public void setAlteracaoAplicativo(String alteracaoAplicativo) {
    this.alteracaoAplicativo = alteracaoAplicativo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricoEnderecoResponse historicoEnderecoResponse = (HistoricoEnderecoResponse) o;
    return Objects.equals(this.dataUltimaAtualizacao, historicoEnderecoResponse.dataUltimaAtualizacao) &&
        Objects.equals(this.cpf, historicoEnderecoResponse.cpf) &&
        Objects.equals(this.idConta, historicoEnderecoResponse.idConta) &&
        Objects.equals(this.nome, historicoEnderecoResponse.nome) &&
        Objects.equals(this.nomeLogradouroAnterior, historicoEnderecoResponse.nomeLogradouroAnterior) &&
        Objects.equals(this.ufAnterior, historicoEnderecoResponse.ufAnterior) &&
        Objects.equals(this.cidadeAnterior, historicoEnderecoResponse.cidadeAnterior) &&
        Objects.equals(this.cepAnterior, historicoEnderecoResponse.cepAnterior) &&
        Objects.equals(this.numeroAnterior, historicoEnderecoResponse.numeroAnterior) &&
        Objects.equals(this.complementoAnterior, historicoEnderecoResponse.complementoAnterior) &&
        Objects.equals(this.tipoEnderecoAnterior, historicoEnderecoResponse.tipoEnderecoAnterior) &&
        Objects.equals(this.dataInclusaoAnterior, historicoEnderecoResponse.dataInclusaoAnterior) &&
        Objects.equals(this.nomeLogradouro, historicoEnderecoResponse.nomeLogradouro) &&
        Objects.equals(this.uf, historicoEnderecoResponse.uf) &&
        Objects.equals(this.cidade, historicoEnderecoResponse.cidade) &&
        Objects.equals(this.cep, historicoEnderecoResponse.cep) &&
        Objects.equals(this.numero, historicoEnderecoResponse.numero) &&
        Objects.equals(this.complemento, historicoEnderecoResponse.complemento) &&
        Objects.equals(this.tipoEndereco, historicoEnderecoResponse.tipoEndereco) &&
        Objects.equals(this.dataInclusao, historicoEnderecoResponse.dataInclusao) &&
        Objects.equals(this.alteracaoAplicativo, historicoEnderecoResponse.alteracaoAplicativo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataUltimaAtualizacao, cpf, idConta, nome, nomeLogradouroAnterior, ufAnterior, cidadeAnterior, cepAnterior, numeroAnterior, complementoAnterior, tipoEnderecoAnterior, dataInclusaoAnterior, nomeLogradouro, uf, cidade, cep, numero, complemento, tipoEndereco, dataInclusao, alteracaoAplicativo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoEnderecoResponse {\n");
    
    sb.append("    dataUltimaAtualizacao: ").append(toIndentedString(dataUltimaAtualizacao)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    nomeLogradouroAnterior: ").append(toIndentedString(nomeLogradouroAnterior)).append("\n");
    sb.append("    ufAnterior: ").append(toIndentedString(ufAnterior)).append("\n");
    sb.append("    cidadeAnterior: ").append(toIndentedString(cidadeAnterior)).append("\n");
    sb.append("    cepAnterior: ").append(toIndentedString(cepAnterior)).append("\n");
    sb.append("    numeroAnterior: ").append(toIndentedString(numeroAnterior)).append("\n");
    sb.append("    complementoAnterior: ").append(toIndentedString(complementoAnterior)).append("\n");
    sb.append("    tipoEnderecoAnterior: ").append(toIndentedString(tipoEnderecoAnterior)).append("\n");
    sb.append("    dataInclusaoAnterior: ").append(toIndentedString(dataInclusaoAnterior)).append("\n");
    sb.append("    nomeLogradouro: ").append(toIndentedString(nomeLogradouro)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    tipoEndereco: ").append(toIndentedString(tipoEndereco)).append("\n");
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    alteracaoAplicativo: ").append(toIndentedString(alteracaoAplicativo)).append("\n");
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

