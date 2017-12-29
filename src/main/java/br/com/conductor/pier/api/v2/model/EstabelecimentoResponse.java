package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Estabelecimento
 **/

@ApiModel(description = "Objeto Estabelecimento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EstabelecimentoResponse   {
  
  private Long id = null;
  private String numeroEstabelecimento = null;
  private Long numeroReceitaFederal = null;
  private String nome = null;
  private String descricao = null;
  private String nomeFantasia = null;
  private String cep = null;
  private String nomeLogradouro = null;
  private String numeroEndereco = null;
  private String complemento = null;
  private String bairro = null;
  private String cidade = null;
  private String uf = null;
  private String pais = null;
  private String dataCadastramento = null;
  private String obs = null;
  private String contato = null;
  private String email = null;
  private Integer flagArquivoSecrFazenda = null;
  private Integer flagCartaoDigitado = null;
  private Integer inativo = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id).
   **/
  public EstabelecimentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * N\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Conductor.
   **/
  public EstabelecimentoResponse numeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Conductor.")
  @JsonProperty("numeroEstabelecimento")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Receita Federal.
   **/
  public EstabelecimentoResponse numeroReceitaFederal(Long numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Receita Federal.")
  @JsonProperty("numeroReceitaFederal")
  public Long getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(Long numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Nome do Estabelecimento.
   **/
  public EstabelecimentoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Estabelecimento.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Raz\u00C3\u00A3o Social do Estabelecimento.
   **/
  public EstabelecimentoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Raz\u00C3\u00A3o Social do Estabelecimento.")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * T\u00C3\u00ADtulo Comercial do Estabelecimento.
   **/
  public EstabelecimentoResponse nomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "T\u00C3\u00ADtulo Comercial do Estabelecimento.")
  @JsonProperty("nomeFantasia")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).
   **/
  public EstabelecimentoResponse cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * Nome do Logradouro.
   **/
  public EstabelecimentoResponse nomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Logradouro.")
  @JsonProperty("nomeLogradouro")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * N\u00C3\u00BAmero do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoResponse numeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do endere\u00C3\u00A7o.")
  @JsonProperty("numeroEndereco")
  public String getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.
   **/
  public EstabelecimentoResponse complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Nome do bairro do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoResponse bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do bairro do endere\u00C3\u00A7o.")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Nome da cidade do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoResponse cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da cidade do endere\u00C3\u00A7o.")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.
   **/
  public EstabelecimentoResponse uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Nome do pa\u00C3\u00ADs.
   **/
  public EstabelecimentoResponse pais(String pais) {
    this.pais = pais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do pa\u00C3\u00ADs.")
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Data de Cadastro do Estabelecimento.
   **/
  public EstabelecimentoResponse dataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Cadastro do Estabelecimento.")
  @JsonProperty("dataCadastramento")
  public String getDataCadastramento() {
    return dataCadastramento;
  }
  public void setDataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
  }

  
  /**
   * Detalhes espec\u00C3\u00ADficos quanto ao Cadastro do Estabelecimento.
   **/
  public EstabelecimentoResponse obs(String obs) {
    this.obs = obs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detalhes espec\u00C3\u00ADficos quanto ao Cadastro do Estabelecimento.")
  @JsonProperty("obs")
  public String getObs() {
    return obs;
  }
  public void setObs(String obs) {
    this.obs = obs;
  }

  
  /**
   * Nome da pessoa para contato com o Estabelecimento.
   **/
  public EstabelecimentoResponse contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da pessoa para contato com o Estabelecimento.")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * E-mail da pessoa para contato com o Estabelecimento.
   **/
  public EstabelecimentoResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "E-mail da pessoa para contato com o Estabelecimento.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Indica se o estabelecimento ser\u00C3\u00A1 inclu\u00C3\u00ADdo no arquivo de registro para a Secretaria da Fazenda Estadual.
   **/
  public EstabelecimentoResponse flagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se o estabelecimento ser\u00C3\u00A1 inclu\u00C3\u00ADdo no arquivo de registro para a Secretaria da Fazenda Estadual.")
  @JsonProperty("flagArquivoSecrFazenda")
  public Integer getFlagArquivoSecrFazenda() {
    return flagArquivoSecrFazenda;
  }
  public void setFlagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
  }

  
  /**
   * Indica se o estabelecimento poder\u00C3\u00A1 originar transa\u00C3\u00A7\u00C3\u00B5es sem a leitura da tarja ou do chip do cart\u00C3\u00A3o.
   **/
  public EstabelecimentoResponse flagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se o estabelecimento poder\u00C3\u00A1 originar transa\u00C3\u00A7\u00C3\u00B5es sem a leitura da tarja ou do chip do cart\u00C3\u00A3o.")
  @JsonProperty("flagCartaoDigitado")
  public Integer getFlagCartaoDigitado() {
    return flagCartaoDigitado;
  }
  public void setFlagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
  }

  
  /**
   * Indica se o estabelecimento est\u00C3\u00A1 inativo.
   **/
  public EstabelecimentoResponse inativo(Integer inativo) {
    this.inativo = inativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se o estabelecimento est\u00C3\u00A1 inativo.")
  @JsonProperty("inativo")
  public Integer getInativo() {
    return inativo;
  }
  public void setInativo(Integer inativo) {
    this.inativo = inativo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstabelecimentoResponse estabelecimentoResponse = (EstabelecimentoResponse) o;
    return Objects.equals(this.id, estabelecimentoResponse.id) &&
        Objects.equals(this.numeroEstabelecimento, estabelecimentoResponse.numeroEstabelecimento) &&
        Objects.equals(this.numeroReceitaFederal, estabelecimentoResponse.numeroReceitaFederal) &&
        Objects.equals(this.nome, estabelecimentoResponse.nome) &&
        Objects.equals(this.descricao, estabelecimentoResponse.descricao) &&
        Objects.equals(this.nomeFantasia, estabelecimentoResponse.nomeFantasia) &&
        Objects.equals(this.cep, estabelecimentoResponse.cep) &&
        Objects.equals(this.nomeLogradouro, estabelecimentoResponse.nomeLogradouro) &&
        Objects.equals(this.numeroEndereco, estabelecimentoResponse.numeroEndereco) &&
        Objects.equals(this.complemento, estabelecimentoResponse.complemento) &&
        Objects.equals(this.bairro, estabelecimentoResponse.bairro) &&
        Objects.equals(this.cidade, estabelecimentoResponse.cidade) &&
        Objects.equals(this.uf, estabelecimentoResponse.uf) &&
        Objects.equals(this.pais, estabelecimentoResponse.pais) &&
        Objects.equals(this.dataCadastramento, estabelecimentoResponse.dataCadastramento) &&
        Objects.equals(this.obs, estabelecimentoResponse.obs) &&
        Objects.equals(this.contato, estabelecimentoResponse.contato) &&
        Objects.equals(this.email, estabelecimentoResponse.email) &&
        Objects.equals(this.flagArquivoSecrFazenda, estabelecimentoResponse.flagArquivoSecrFazenda) &&
        Objects.equals(this.flagCartaoDigitado, estabelecimentoResponse.flagCartaoDigitado) &&
        Objects.equals(this.inativo, estabelecimentoResponse.inativo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroEstabelecimento, numeroReceitaFederal, nome, descricao, nomeFantasia, cep, nomeLogradouro, numeroEndereco, complemento, bairro, cidade, uf, pais, dataCadastramento, obs, contato, email, flagArquivoSecrFazenda, flagCartaoDigitado, inativo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstabelecimentoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    nomeFantasia: ").append(toIndentedString(nomeFantasia)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    nomeLogradouro: ").append(toIndentedString(nomeLogradouro)).append("\n");
    sb.append("    numeroEndereco: ").append(toIndentedString(numeroEndereco)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    dataCadastramento: ").append(toIndentedString(dataCadastramento)).append("\n");
    sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    flagArquivoSecrFazenda: ").append(toIndentedString(flagArquivoSecrFazenda)).append("\n");
    sb.append("    flagCartaoDigitado: ").append(toIndentedString(flagCartaoDigitado)).append("\n");
    sb.append("    inativo: ").append(toIndentedString(inativo)).append("\n");
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

