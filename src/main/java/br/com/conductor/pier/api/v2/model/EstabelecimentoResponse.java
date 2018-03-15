package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ConsultaCadastroEstabelecimentoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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
  private Integer flagMatriz = null;
  private Long idGrupoEconomico = null;
  private Long numeroReceitaFederal = null;
  private String nome = null;
  private String descricao = null;
  private String nomeFantasia = null;
  private String cep = null;
  private String nomeLogradouro = null;
  private String numeroEndereco = null;
  private String bairro = null;
  private String cidade = null;
  private String complemento = null;
  private String uf = null;
  private String cep2 = null;
  private String nomeLogradouro2 = null;
  private String numeroEndereco2 = null;
  private String bairro2 = null;
  private String cidade2 = null;
  private String complemento2 = null;
  private String uf2 = null;
  private String obs = null;
  private String contato = null;
  private String email = null;
  private Integer flagArquivoSecrFazenda = null;
  private Integer flagCartaoDigitado = null;
  private Integer inativo = null;
  private Long idMoeda = null;
  private Long idPais = null;
  private Integer associadoSPCBrasil = null;
  private Long mcc = null;
  private Long idTipoEstabelecimento = null;
  private Integer correspondencia = null;
  private String cargoContato = null;


  public enum TipoPagamentoEnum {
    CENTRALIZADO("CENTRALIZADO"),
    PV("PV");

    private String value;

    TipoPagamentoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoPagamentoEnum tipoPagamento = null;
  private ConsultaCadastroEstabelecimentoDTO consulta = null;
  private ConsultaCadastroEstabelecimentoDTO consulta2 = null;
  private ConsultaCadastroEstabelecimentoDTO consulta3 = null;
  private String terminal = null;
  private String dataCadastramento = null;
  private String usuario = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do estabelecimento (id).
   **/
  public EstabelecimentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do estabelecimento (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * N\u00FAmero de identifica\u00E7\u00E3o do Estabelecimento na Conductor.
   **/
  public EstabelecimentoResponse numeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de identifica\u00E7\u00E3o do Estabelecimento na Conductor.")
  @JsonProperty("numeroEstabelecimento")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Indica se \u00E9 matriz ou filial.
   **/
  public EstabelecimentoResponse flagMatriz(Integer flagMatriz) {
    this.flagMatriz = flagMatriz;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se \u00E9 matriz ou filial.")
  @JsonProperty("flagMatriz")
  public Integer getFlagMatriz() {
    return flagMatriz;
  }
  public void setFlagMatriz(Integer flagMatriz) {
    this.flagMatriz = flagMatriz;
  }

  
  /**
   * Apresenta o n\u00FAmero de identifica\u00E7\u00E3o do Grupo Econ\u00F4mico.
   **/
  public EstabelecimentoResponse idGrupoEconomico(Long idGrupoEconomico) {
    this.idGrupoEconomico = idGrupoEconomico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00FAmero de identifica\u00E7\u00E3o do Grupo Econ\u00F4mico.")
  @JsonProperty("idGrupoEconomico")
  public Long getIdGrupoEconomico() {
    return idGrupoEconomico;
  }
  public void setIdGrupoEconomico(Long idGrupoEconomico) {
    this.idGrupoEconomico = idGrupoEconomico;
  }

  
  /**
   * Apresenta o n\u00FAmero de identifica\u00E7\u00E3o do Estabelecimento na Receita Federal.
   **/
  public EstabelecimentoResponse numeroReceitaFederal(Long numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00FAmero de identifica\u00E7\u00E3o do Estabelecimento na Receita Federal.")
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
   * Raz\u00E3o Social do Estabelecimento.
   **/
  public EstabelecimentoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Raz\u00E3o Social do Estabelecimento.")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * T\u00EDtulo Comercial do Estabelecimento.
   **/
  public EstabelecimentoResponse nomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "T\u00EDtulo Comercial do Estabelecimento.")
  @JsonProperty("nomeFantasia")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * C\u00F3digo de Endere\u00E7amento Postal (CEP).
   **/
  public EstabelecimentoResponse cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Endere\u00E7amento Postal (CEP).")
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
   * N\u00FAmero do endere\u00E7o.
   **/
  public EstabelecimentoResponse numeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do endere\u00E7o.")
  @JsonProperty("numeroEndereco")
  public String getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Nome do bairro do endere\u00E7o.
   **/
  public EstabelecimentoResponse bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do bairro do endere\u00E7o.")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Nome da cidade do endere\u00E7o.
   **/
  public EstabelecimentoResponse cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da cidade do endere\u00E7o.")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Descri\u00E7\u00F5es complementares referente ao endere\u00E7o.
   **/
  public EstabelecimentoResponse complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00F5es complementares referente ao endere\u00E7o.")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o.
   **/
  public EstabelecimentoResponse uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o.")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * C\u00F3digo de Endere\u00E7amento Postal (CEP).
   **/
  public EstabelecimentoResponse cep2(String cep2) {
    this.cep2 = cep2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Endere\u00E7amento Postal (CEP).")
  @JsonProperty("cep2")
  public String getCep2() {
    return cep2;
  }
  public void setCep2(String cep2) {
    this.cep2 = cep2;
  }

  
  /**
   * Nome do Logradouro .
   **/
  public EstabelecimentoResponse nomeLogradouro2(String nomeLogradouro2) {
    this.nomeLogradouro2 = nomeLogradouro2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Logradouro .")
  @JsonProperty("nomeLogradouro2")
  public String getNomeLogradouro2() {
    return nomeLogradouro2;
  }
  public void setNomeLogradouro2(String nomeLogradouro2) {
    this.nomeLogradouro2 = nomeLogradouro2;
  }

  
  /**
   * N\u00FAmero do endere\u00E7o.
   **/
  public EstabelecimentoResponse numeroEndereco2(String numeroEndereco2) {
    this.numeroEndereco2 = numeroEndereco2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do endere\u00E7o.")
  @JsonProperty("numeroEndereco2")
  public String getNumeroEndereco2() {
    return numeroEndereco2;
  }
  public void setNumeroEndereco2(String numeroEndereco2) {
    this.numeroEndereco2 = numeroEndereco2;
  }

  
  /**
   * Nome do bairro do endere\u00E7o.
   **/
  public EstabelecimentoResponse bairro2(String bairro2) {
    this.bairro2 = bairro2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do bairro do endere\u00E7o.")
  @JsonProperty("bairro2")
  public String getBairro2() {
    return bairro2;
  }
  public void setBairro2(String bairro2) {
    this.bairro2 = bairro2;
  }

  
  /**
   * Nome da cidade do endere\u00E7o.
   **/
  public EstabelecimentoResponse cidade2(String cidade2) {
    this.cidade2 = cidade2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da cidade do endere\u00E7o.")
  @JsonProperty("cidade2")
  public String getCidade2() {
    return cidade2;
  }
  public void setCidade2(String cidade2) {
    this.cidade2 = cidade2;
  }

  
  /**
   * Descri\u00E7\u00F5es complementares referente ao endere\u00E7o.
   **/
  public EstabelecimentoResponse complemento2(String complemento2) {
    this.complemento2 = complemento2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00F5es complementares referente ao endere\u00E7o.")
  @JsonProperty("complemento2")
  public String getComplemento2() {
    return complemento2;
  }
  public void setComplemento2(String complemento2) {
    this.complemento2 = complemento2;
  }

  
  /**
   * Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o.
   **/
  public EstabelecimentoResponse uf2(String uf2) {
    this.uf2 = uf2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o.")
  @JsonProperty("uf2")
  public String getUf2() {
    return uf2;
  }
  public void setUf2(String uf2) {
    this.uf2 = uf2;
  }

  
  /**
   * Detalhes espec\u00EDficos quanto ao Cadastro do Estabelecimento.
   **/
  public EstabelecimentoResponse obs(String obs) {
    this.obs = obs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detalhes espec\u00EDficos quanto ao Cadastro do Estabelecimento.")
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
   * Indica se o estabelecimento ser\u00E1 inclu\u00EDdo no arquivo de registro para a Secretaria da Fazenda Estadual.
   **/
  public EstabelecimentoResponse flagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se o estabelecimento ser\u00E1 inclu\u00EDdo no arquivo de registro para a Secretaria da Fazenda Estadual.")
  @JsonProperty("flagArquivoSecrFazenda")
  public Integer getFlagArquivoSecrFazenda() {
    return flagArquivoSecrFazenda;
  }
  public void setFlagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
  }

  
  /**
   * Indica se o estabelecimento poder\u00E1 originar transa\u00E7\u00F5es sem a leitura da tarja ou do chip do cart\u00E3o.
   **/
  public EstabelecimentoResponse flagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se o estabelecimento poder\u00E1 originar transa\u00E7\u00F5es sem a leitura da tarja ou do chip do cart\u00E3o.")
  @JsonProperty("flagCartaoDigitado")
  public Integer getFlagCartaoDigitado() {
    return flagCartaoDigitado;
  }
  public void setFlagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
  }

  
  /**
   * Indica se o estabelecimento est\u00E1 inativo.
   **/
  public EstabelecimentoResponse inativo(Integer inativo) {
    this.inativo = inativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se o estabelecimento est\u00E1 inativo.")
  @JsonProperty("inativo")
  public Integer getInativo() {
    return inativo;
  }
  public void setInativo(Integer inativo) {
    this.inativo = inativo;
  }

  
  /**
   * C\u00F3digo identificador da moeda.
   **/
  public EstabelecimentoResponse idMoeda(Long idMoeda) {
    this.idMoeda = idMoeda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da moeda.")
  @JsonProperty("idMoeda")
  public Long getIdMoeda() {
    return idMoeda;
  }
  public void setIdMoeda(Long idMoeda) {
    this.idMoeda = idMoeda;
  }

  
  /**
   * Identificador de Pa\u00EDs.
   **/
  public EstabelecimentoResponse idPais(Long idPais) {
    this.idPais = idPais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador de Pa\u00EDs.")
  @JsonProperty("idPais")
  public Long getIdPais() {
    return idPais;
  }
  public void setIdPais(Long idPais) {
    this.idPais = idPais;
  }

  
  /**
   * N\u00FAmero do associado ao SPCBrasil.
   **/
  public EstabelecimentoResponse associadoSPCBrasil(Integer associadoSPCBrasil) {
    this.associadoSPCBrasil = associadoSPCBrasil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do associado ao SPCBrasil.")
  @JsonProperty("associadoSPCBrasil")
  public Integer getAssociadoSPCBrasil() {
    return associadoSPCBrasil;
  }
  public void setAssociadoSPCBrasil(Integer associadoSPCBrasil) {
    this.associadoSPCBrasil = associadoSPCBrasil;
  }

  
  /**
   * C\u00F3digo de Categoria de Mercado.
   **/
  public EstabelecimentoResponse mcc(Long mcc) {
    this.mcc = mcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Categoria de Mercado.")
  @JsonProperty("mcc")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de Estabelecimento.
   **/
  public EstabelecimentoResponse idTipoEstabelecimento(Long idTipoEstabelecimento) {
    this.idTipoEstabelecimento = idTipoEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de Estabelecimento.")
  @JsonProperty("idTipoEstabelecimento")
  public Long getIdTipoEstabelecimento() {
    return idTipoEstabelecimento;
  }
  public void setIdTipoEstabelecimento(Long idTipoEstabelecimento) {
    this.idTipoEstabelecimento = idTipoEstabelecimento;
  }

  
  /**
   * Tipo da Correspond\u00EAncia (ORIGEM, CORRESPONDENCIA).
   **/
  public EstabelecimentoResponse correspondencia(Integer correspondencia) {
    this.correspondencia = correspondencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo da Correspond\u00EAncia (ORIGEM, CORRESPONDENCIA).")
  @JsonProperty("correspondencia")
  public Integer getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Integer correspondencia) {
    this.correspondencia = correspondencia;
  }

  
  /**
   * Cargo do contato do estabelecimento.
   **/
  public EstabelecimentoResponse cargoContato(String cargoContato) {
    this.cargoContato = cargoContato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cargo do contato do estabelecimento.")
  @JsonProperty("cargoContato")
  public String getCargoContato() {
    return cargoContato;
  }
  public void setCargoContato(String cargoContato) {
    this.cargoContato = cargoContato;
  }

  
  /**
   * Tipo do regime de pagamento do estabelecimento.
   **/
  public EstabelecimentoResponse tipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do regime de pagamento do estabelecimento.")
  @JsonProperty("tipoPagamento")
  public TipoPagamentoEnum getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  
  /**
   * Consulta de cadastro n\u00FAmero um.
   **/
  public EstabelecimentoResponse consulta(ConsultaCadastroEstabelecimentoDTO consulta) {
    this.consulta = consulta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Consulta de cadastro n\u00FAmero um.")
  @JsonProperty("consulta")
  public ConsultaCadastroEstabelecimentoDTO getConsulta() {
    return consulta;
  }
  public void setConsulta(ConsultaCadastroEstabelecimentoDTO consulta) {
    this.consulta = consulta;
  }

  
  /**
   * Consulta de cadastro n\u00FAmero dois.
   **/
  public EstabelecimentoResponse consulta2(ConsultaCadastroEstabelecimentoDTO consulta2) {
    this.consulta2 = consulta2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Consulta de cadastro n\u00FAmero dois.")
  @JsonProperty("consulta2")
  public ConsultaCadastroEstabelecimentoDTO getConsulta2() {
    return consulta2;
  }
  public void setConsulta2(ConsultaCadastroEstabelecimentoDTO consulta2) {
    this.consulta2 = consulta2;
  }

  
  /**
   * Consulta de cadastro n\u00FAmero tr\u00EAs.
   **/
  public EstabelecimentoResponse consulta3(ConsultaCadastroEstabelecimentoDTO consulta3) {
    this.consulta3 = consulta3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Consulta de cadastro n\u00FAmero tr\u00EAs.")
  @JsonProperty("consulta3")
  public ConsultaCadastroEstabelecimentoDTO getConsulta3() {
    return consulta3;
  }
  public void setConsulta3(ConsultaCadastroEstabelecimentoDTO consulta3) {
    this.consulta3 = consulta3;
  }

  
  /**
   * Terminal do estabelecimento.
   **/
  public EstabelecimentoResponse terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Terminal do estabelecimento.")
  @JsonProperty("terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
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
   * Usu\u00E1rio da aplica\u00E7\u00E3o.
   **/
  public EstabelecimentoResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Usu\u00E1rio da aplica\u00E7\u00E3o.")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
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
        Objects.equals(this.flagMatriz, estabelecimentoResponse.flagMatriz) &&
        Objects.equals(this.idGrupoEconomico, estabelecimentoResponse.idGrupoEconomico) &&
        Objects.equals(this.numeroReceitaFederal, estabelecimentoResponse.numeroReceitaFederal) &&
        Objects.equals(this.nome, estabelecimentoResponse.nome) &&
        Objects.equals(this.descricao, estabelecimentoResponse.descricao) &&
        Objects.equals(this.nomeFantasia, estabelecimentoResponse.nomeFantasia) &&
        Objects.equals(this.cep, estabelecimentoResponse.cep) &&
        Objects.equals(this.nomeLogradouro, estabelecimentoResponse.nomeLogradouro) &&
        Objects.equals(this.numeroEndereco, estabelecimentoResponse.numeroEndereco) &&
        Objects.equals(this.bairro, estabelecimentoResponse.bairro) &&
        Objects.equals(this.cidade, estabelecimentoResponse.cidade) &&
        Objects.equals(this.complemento, estabelecimentoResponse.complemento) &&
        Objects.equals(this.uf, estabelecimentoResponse.uf) &&
        Objects.equals(this.cep2, estabelecimentoResponse.cep2) &&
        Objects.equals(this.nomeLogradouro2, estabelecimentoResponse.nomeLogradouro2) &&
        Objects.equals(this.numeroEndereco2, estabelecimentoResponse.numeroEndereco2) &&
        Objects.equals(this.bairro2, estabelecimentoResponse.bairro2) &&
        Objects.equals(this.cidade2, estabelecimentoResponse.cidade2) &&
        Objects.equals(this.complemento2, estabelecimentoResponse.complemento2) &&
        Objects.equals(this.uf2, estabelecimentoResponse.uf2) &&
        Objects.equals(this.obs, estabelecimentoResponse.obs) &&
        Objects.equals(this.contato, estabelecimentoResponse.contato) &&
        Objects.equals(this.email, estabelecimentoResponse.email) &&
        Objects.equals(this.flagArquivoSecrFazenda, estabelecimentoResponse.flagArquivoSecrFazenda) &&
        Objects.equals(this.flagCartaoDigitado, estabelecimentoResponse.flagCartaoDigitado) &&
        Objects.equals(this.inativo, estabelecimentoResponse.inativo) &&
        Objects.equals(this.idMoeda, estabelecimentoResponse.idMoeda) &&
        Objects.equals(this.idPais, estabelecimentoResponse.idPais) &&
        Objects.equals(this.associadoSPCBrasil, estabelecimentoResponse.associadoSPCBrasil) &&
        Objects.equals(this.mcc, estabelecimentoResponse.mcc) &&
        Objects.equals(this.idTipoEstabelecimento, estabelecimentoResponse.idTipoEstabelecimento) &&
        Objects.equals(this.correspondencia, estabelecimentoResponse.correspondencia) &&
        Objects.equals(this.cargoContato, estabelecimentoResponse.cargoContato) &&
        Objects.equals(this.tipoPagamento, estabelecimentoResponse.tipoPagamento) &&
        Objects.equals(this.consulta, estabelecimentoResponse.consulta) &&
        Objects.equals(this.consulta2, estabelecimentoResponse.consulta2) &&
        Objects.equals(this.consulta3, estabelecimentoResponse.consulta3) &&
        Objects.equals(this.terminal, estabelecimentoResponse.terminal) &&
        Objects.equals(this.dataCadastramento, estabelecimentoResponse.dataCadastramento) &&
        Objects.equals(this.usuario, estabelecimentoResponse.usuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroEstabelecimento, flagMatriz, idGrupoEconomico, numeroReceitaFederal, nome, descricao, nomeFantasia, cep, nomeLogradouro, numeroEndereco, bairro, cidade, complemento, uf, cep2, nomeLogradouro2, numeroEndereco2, bairro2, cidade2, complemento2, uf2, obs, contato, email, flagArquivoSecrFazenda, flagCartaoDigitado, inativo, idMoeda, idPais, associadoSPCBrasil, mcc, idTipoEstabelecimento, correspondencia, cargoContato, tipoPagamento, consulta, consulta2, consulta3, terminal, dataCadastramento, usuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstabelecimentoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    flagMatriz: ").append(toIndentedString(flagMatriz)).append("\n");
    sb.append("    idGrupoEconomico: ").append(toIndentedString(idGrupoEconomico)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    nomeFantasia: ").append(toIndentedString(nomeFantasia)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    nomeLogradouro: ").append(toIndentedString(nomeLogradouro)).append("\n");
    sb.append("    numeroEndereco: ").append(toIndentedString(numeroEndereco)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    cep2: ").append(toIndentedString(cep2)).append("\n");
    sb.append("    nomeLogradouro2: ").append(toIndentedString(nomeLogradouro2)).append("\n");
    sb.append("    numeroEndereco2: ").append(toIndentedString(numeroEndereco2)).append("\n");
    sb.append("    bairro2: ").append(toIndentedString(bairro2)).append("\n");
    sb.append("    cidade2: ").append(toIndentedString(cidade2)).append("\n");
    sb.append("    complemento2: ").append(toIndentedString(complemento2)).append("\n");
    sb.append("    uf2: ").append(toIndentedString(uf2)).append("\n");
    sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    flagArquivoSecrFazenda: ").append(toIndentedString(flagArquivoSecrFazenda)).append("\n");
    sb.append("    flagCartaoDigitado: ").append(toIndentedString(flagCartaoDigitado)).append("\n");
    sb.append("    inativo: ").append(toIndentedString(inativo)).append("\n");
    sb.append("    idMoeda: ").append(toIndentedString(idMoeda)).append("\n");
    sb.append("    idPais: ").append(toIndentedString(idPais)).append("\n");
    sb.append("    associadoSPCBrasil: ").append(toIndentedString(associadoSPCBrasil)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    idTipoEstabelecimento: ").append(toIndentedString(idTipoEstabelecimento)).append("\n");
    sb.append("    correspondencia: ").append(toIndentedString(correspondencia)).append("\n");
    sb.append("    cargoContato: ").append(toIndentedString(cargoContato)).append("\n");
    sb.append("    tipoPagamento: ").append(toIndentedString(tipoPagamento)).append("\n");
    sb.append("    consulta: ").append(toIndentedString(consulta)).append("\n");
    sb.append("    consulta2: ").append(toIndentedString(consulta2)).append("\n");
    sb.append("    consulta3: ").append(toIndentedString(consulta3)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    dataCadastramento: ").append(toIndentedString(dataCadastramento)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
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

