package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{dados_cartao_impressao_response_description}}}
 **/

@ApiModel(description = "{{{dados_cartao_impressao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DadosCartaoImpressaoResponse   {
  
  private Long idConta = null;
  private Long idPessoa = null;
  private Long idCartao = null;
  private Long idBandeira = null;
  private Long idTipoCartao = null;
  private String numeroCartao = null;
  private String nomePlastico = null;
  private String cvv2 = null;
  private String dataGeracao = null;
  private String dataValidade = null;
  private String cpf = null;
  private String tipoPortador = null;
  private String trilha1 = null;
  private String trilha2 = null;
  private String trilhaCVV1 = null;
  private String trilhaCVV2 = null;
  private Integer flagVirtual = null;
  private String nomeBandeira = null;
  private Integer flagTitular = null;
  private Integer sequencialCartao = null;
  private Long idStatus = null;
  private String descricaoStatusCartao = null;
  private String dataStatus = null;
  private Long idEstagio = null;
  private String descricaoEstagio = null;
  private String dataEstagio = null;
  private String numeroBin = null;
  private Long idProduto = null;
  private String descricaoProduto = null;
  private Long idStatusConta = null;
  private Long descricaoStatusConta = null;
  private String dataEmbossing = null;
  private String codigoDesbloqueio = null;
  private String nomePessoa = null;
  private String tipoPessoa = null;
  private String dataNascimento = null;
  private Long idEndereco = null;
  private Long idTipoEndereco = null;
  private String descricaoTipoEndereco = null;
  private String cep = null;
  private String logradouro = null;
  private String numeroEndereco = null;
  private String complementoEndereco = null;
  private String bairro = null;
  private String cidade = null;
  private String uf = null;
  private String pais = null;
  private String senhaCriptografada = null;
  private String icvv = null;
  private Long idStatusImpressao = null;

  
  /**
   * {{{dados_cartao_impressao_response_id_conta_value}}}
   **/
  public DadosCartaoImpressaoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_pessoa_value}}}
   **/
  public DadosCartaoImpressaoResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_cartao_value}}}
   **/
  public DadosCartaoImpressaoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_bandeira_value}}}
   **/
  public DadosCartaoImpressaoResponse idBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_bandeira_value}}}")
  @JsonProperty("idBandeira")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_tipo_cartao_value}}}
   **/
  public DadosCartaoImpressaoResponse idTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_tipo_cartao_value}}}")
  @JsonProperty("idTipoCartao")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_numero_cartao_value}}}
   **/
  public DadosCartaoImpressaoResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_numero_cartao_value}}}")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_nome_plastico_value}}}
   **/
  public DadosCartaoImpressaoResponse nomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_nome_plastico_value}}}")
  @JsonProperty("nomePlastico")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * {{{dados_cartao_impressao_response_cvv2_value}}}
   **/
  public DadosCartaoImpressaoResponse cvv2(String cvv2) {
    this.cvv2 = cvv2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_cvv2_value}}}")
  @JsonProperty("cvv2")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_geracao_value}}}
   **/
  public DadosCartaoImpressaoResponse dataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_data_geracao_value}}}")
  @JsonProperty("dataGeracao")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_validade_value}}}
   **/
  public DadosCartaoImpressaoResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_data_validade_value}}}")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{dados_cartao_impressao_response_cpf_value}}}
   **/
  public DadosCartaoImpressaoResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_cpf_value}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{dados_cartao_impressao_response_tipo_portador_value}}}
   **/
  public DadosCartaoImpressaoResponse tipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_tipo_portador_value}}}")
  @JsonProperty("tipoPortador")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * {{{dados_cartao_impressao_response_trilha1_value}}}
   **/
  public DadosCartaoImpressaoResponse trilha1(String trilha1) {
    this.trilha1 = trilha1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_trilha1_value}}}")
  @JsonProperty("trilha1")
  public String getTrilha1() {
    return trilha1;
  }
  public void setTrilha1(String trilha1) {
    this.trilha1 = trilha1;
  }

  
  /**
   * {{{dados_cartao_impressao_response_trilha2_value}}}
   **/
  public DadosCartaoImpressaoResponse trilha2(String trilha2) {
    this.trilha2 = trilha2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_trilha2_value}}}")
  @JsonProperty("trilha2")
  public String getTrilha2() {
    return trilha2;
  }
  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }

  
  /**
   * {{{dados_cartao_impressao_response_trilha_c_v_v1_value}}}
   **/
  public DadosCartaoImpressaoResponse trilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_trilha_c_v_v1_value}}}")
  @JsonProperty("trilhaCVV1")
  public String getTrilhaCVV1() {
    return trilhaCVV1;
  }
  public void setTrilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
  }

  
  /**
   * {{{dados_cartao_impressao_response_trilha_c_v_v2_value}}}
   **/
  public DadosCartaoImpressaoResponse trilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_trilha_c_v_v2_value}}}")
  @JsonProperty("trilhaCVV2")
  public String getTrilhaCVV2() {
    return trilhaCVV2;
  }
  public void setTrilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
  }

  
  /**
   * {{{dados_cartao_impressao_response_flag_virtual_value}}}
   **/
  public DadosCartaoImpressaoResponse flagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_flag_virtual_value}}}")
  @JsonProperty("flagVirtual")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * {{{dados_cartao_impressao_response_nome_bandeira_value}}}
   **/
  public DadosCartaoImpressaoResponse nomeBandeira(String nomeBandeira) {
    this.nomeBandeira = nomeBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_nome_bandeira_value}}}")
  @JsonProperty("nomeBandeira")
  public String getNomeBandeira() {
    return nomeBandeira;
  }
  public void setNomeBandeira(String nomeBandeira) {
    this.nomeBandeira = nomeBandeira;
  }

  
  /**
   * {{{dados_cartao_impressao_response_flag_titular_value}}}
   **/
  public DadosCartaoImpressaoResponse flagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_flag_titular_value}}}")
  @JsonProperty("flagTitular")
  public Integer getFlagTitular() {
    return flagTitular;
  }
  public void setFlagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
  }

  
  /**
   * {{{dados_cartao_impressao_response_sequencial_cartao_value}}}
   **/
  public DadosCartaoImpressaoResponse sequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_sequencial_cartao_value}}}")
  @JsonProperty("sequencialCartao")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_status_value}}}
   **/
  public DadosCartaoImpressaoResponse idStatus(Long idStatus) {
    this.idStatus = idStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_status_value}}}")
  @JsonProperty("idStatus")
  public Long getIdStatus() {
    return idStatus;
  }
  public void setIdStatus(Long idStatus) {
    this.idStatus = idStatus;
  }

  
  /**
   * {{{dados_cartao_impressao_response_descricao_status_cartao_value}}}
   **/
  public DadosCartaoImpressaoResponse descricaoStatusCartao(String descricaoStatusCartao) {
    this.descricaoStatusCartao = descricaoStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_descricao_status_cartao_value}}}")
  @JsonProperty("descricaoStatusCartao")
  public String getDescricaoStatusCartao() {
    return descricaoStatusCartao;
  }
  public void setDescricaoStatusCartao(String descricaoStatusCartao) {
    this.descricaoStatusCartao = descricaoStatusCartao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_status_value}}}
   **/
  public DadosCartaoImpressaoResponse dataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_data_status_value}}}")
  @JsonProperty("dataStatus")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_estagio_value}}}
   **/
  public DadosCartaoImpressaoResponse idEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_estagio_value}}}")
  @JsonProperty("idEstagio")
  public Long getIdEstagio() {
    return idEstagio;
  }
  public void setIdEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
  }

  
  /**
   * {{{dados_cartao_impressao_response_descricao_estagio_value}}}
   **/
  public DadosCartaoImpressaoResponse descricaoEstagio(String descricaoEstagio) {
    this.descricaoEstagio = descricaoEstagio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_descricao_estagio_value}}}")
  @JsonProperty("descricaoEstagio")
  public String getDescricaoEstagio() {
    return descricaoEstagio;
  }
  public void setDescricaoEstagio(String descricaoEstagio) {
    this.descricaoEstagio = descricaoEstagio;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_estagio_value}}}
   **/
  public DadosCartaoImpressaoResponse dataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_data_estagio_value}}}")
  @JsonProperty("dataEstagio")
  public String getDataEstagio() {
    return dataEstagio;
  }
  public void setDataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
  }

  
  /**
   * {{{dados_cartao_impressao_response_numero_bin_value}}}
   **/
  public DadosCartaoImpressaoResponse numeroBin(String numeroBin) {
    this.numeroBin = numeroBin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_numero_bin_value}}}")
  @JsonProperty("numeroBin")
  public String getNumeroBin() {
    return numeroBin;
  }
  public void setNumeroBin(String numeroBin) {
    this.numeroBin = numeroBin;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_produto_value}}}
   **/
  public DadosCartaoImpressaoResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{dados_cartao_impressao_response_descricao_produto_value}}}
   **/
  public DadosCartaoImpressaoResponse descricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_descricao_produto_value}}}")
  @JsonProperty("descricaoProduto")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_status_conta_value}}}
   **/
  public DadosCartaoImpressaoResponse idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_status_conta_value}}}")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * {{{dados_cartao_impressao_response_descricao_status_conta_value}}}
   **/
  public DadosCartaoImpressaoResponse descricaoStatusConta(Long descricaoStatusConta) {
    this.descricaoStatusConta = descricaoStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_descricao_status_conta_value}}}")
  @JsonProperty("descricaoStatusConta")
  public Long getDescricaoStatusConta() {
    return descricaoStatusConta;
  }
  public void setDescricaoStatusConta(Long descricaoStatusConta) {
    this.descricaoStatusConta = descricaoStatusConta;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_embossing_value}}}
   **/
  public DadosCartaoImpressaoResponse dataEmbossing(String dataEmbossing) {
    this.dataEmbossing = dataEmbossing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_data_embossing_value}}}")
  @JsonProperty("dataEmbossing")
  public String getDataEmbossing() {
    return dataEmbossing;
  }
  public void setDataEmbossing(String dataEmbossing) {
    this.dataEmbossing = dataEmbossing;
  }

  
  /**
   * {{{dados_cartao_impressao_response_codigo_desbloqueio_value}}}
   **/
  public DadosCartaoImpressaoResponse codigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_codigo_desbloqueio_value}}}")
  @JsonProperty("codigoDesbloqueio")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  
  /**
   * {{{dados_cartao_impressao_response_nome_pessoa_value}}}
   **/
  public DadosCartaoImpressaoResponse nomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_nome_pessoa_value}}}")
  @JsonProperty("nomePessoa")
  public String getNomePessoa() {
    return nomePessoa;
  }
  public void setNomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
  }

  
  /**
   * {{{dados_cartao_impressao_response_tipo_pessoa_value}}}
   **/
  public DadosCartaoImpressaoResponse tipoPessoa(String tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_tipo_pessoa_value}}}")
  @JsonProperty("tipoPessoa")
  public String getTipoPessoa() {
    return tipoPessoa;
  }
  public void setTipoPessoa(String tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_nascimento_value}}}
   **/
  public DadosCartaoImpressaoResponse dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_data_nascimento_value}}}")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_endereco_value}}}
   **/
  public DadosCartaoImpressaoResponse idEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_endereco_value}}}")
  @JsonProperty("idEndereco")
  public Long getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_tipo_endereco_value}}}
   **/
  public DadosCartaoImpressaoResponse idTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_tipo_endereco_value}}}")
  @JsonProperty("idTipoEndereco")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * {{{dados_cartao_impressao_response_descricao_tipo_endereco_value}}}
   **/
  public DadosCartaoImpressaoResponse descricaoTipoEndereco(String descricaoTipoEndereco) {
    this.descricaoTipoEndereco = descricaoTipoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_descricao_tipo_endereco_value}}}")
  @JsonProperty("descricaoTipoEndereco")
  public String getDescricaoTipoEndereco() {
    return descricaoTipoEndereco;
  }
  public void setDescricaoTipoEndereco(String descricaoTipoEndereco) {
    this.descricaoTipoEndereco = descricaoTipoEndereco;
  }

  
  /**
   * {{{dados_cartao_impressao_response_cep_value}}}
   **/
  public DadosCartaoImpressaoResponse cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_cep_value}}}")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{dados_cartao_impressao_response_logradouro_value}}}
   **/
  public DadosCartaoImpressaoResponse logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_logradouro_value}}}")
  @JsonProperty("logradouro")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * {{{dados_cartao_impressao_response_numero_endereco_value}}}
   **/
  public DadosCartaoImpressaoResponse numeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_numero_endereco_value}}}")
  @JsonProperty("numeroEndereco")
  public String getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * {{{dados_cartao_impressao_response_complemento_endereco_value}}}
   **/
  public DadosCartaoImpressaoResponse complementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_complemento_endereco_value}}}")
  @JsonProperty("complementoEndereco")
  public String getComplementoEndereco() {
    return complementoEndereco;
  }
  public void setComplementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
  }

  
  /**
   * {{{dados_cartao_impressao_response_bairro_value}}}
   **/
  public DadosCartaoImpressaoResponse bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_bairro_value}}}")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{dados_cartao_impressao_response_cidade_value}}}
   **/
  public DadosCartaoImpressaoResponse cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_cidade_value}}}")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{dados_cartao_impressao_response_uf_value}}}
   **/
  public DadosCartaoImpressaoResponse uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_uf_value}}}")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{dados_cartao_impressao_response_pais_value}}}
   **/
  public DadosCartaoImpressaoResponse pais(String pais) {
    this.pais = pais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_pais_value}}}")
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * {{{dados_cartao_impressao_response_senha_criptografada_value}}}
   **/
  public DadosCartaoImpressaoResponse senhaCriptografada(String senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_senha_criptografada_value}}}")
  @JsonProperty("senhaCriptografada")
  public String getSenhaCriptografada() {
    return senhaCriptografada;
  }
  public void setSenhaCriptografada(String senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
  }

  
  /**
   * {{{dados_cartao_impressao_response_icvv_value}}}
   **/
  public DadosCartaoImpressaoResponse icvv(String icvv) {
    this.icvv = icvv;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_icvv_value}}}")
  @JsonProperty("icvv")
  public String getIcvv() {
    return icvv;
  }
  public void setIcvv(String icvv) {
    this.icvv = icvv;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_status_impressao_value}}}
   **/
  public DadosCartaoImpressaoResponse idStatusImpressao(Long idStatusImpressao) {
    this.idStatusImpressao = idStatusImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_impressao_response_id_status_impressao_value}}}")
  @JsonProperty("idStatusImpressao")
  public Long getIdStatusImpressao() {
    return idStatusImpressao;
  }
  public void setIdStatusImpressao(Long idStatusImpressao) {
    this.idStatusImpressao = idStatusImpressao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosCartaoImpressaoResponse dadosCartaoImpressaoResponse = (DadosCartaoImpressaoResponse) o;
    return Objects.equals(this.idConta, dadosCartaoImpressaoResponse.idConta) &&
        Objects.equals(this.idPessoa, dadosCartaoImpressaoResponse.idPessoa) &&
        Objects.equals(this.idCartao, dadosCartaoImpressaoResponse.idCartao) &&
        Objects.equals(this.idBandeira, dadosCartaoImpressaoResponse.idBandeira) &&
        Objects.equals(this.idTipoCartao, dadosCartaoImpressaoResponse.idTipoCartao) &&
        Objects.equals(this.numeroCartao, dadosCartaoImpressaoResponse.numeroCartao) &&
        Objects.equals(this.nomePlastico, dadosCartaoImpressaoResponse.nomePlastico) &&
        Objects.equals(this.cvv2, dadosCartaoImpressaoResponse.cvv2) &&
        Objects.equals(this.dataGeracao, dadosCartaoImpressaoResponse.dataGeracao) &&
        Objects.equals(this.dataValidade, dadosCartaoImpressaoResponse.dataValidade) &&
        Objects.equals(this.cpf, dadosCartaoImpressaoResponse.cpf) &&
        Objects.equals(this.tipoPortador, dadosCartaoImpressaoResponse.tipoPortador) &&
        Objects.equals(this.trilha1, dadosCartaoImpressaoResponse.trilha1) &&
        Objects.equals(this.trilha2, dadosCartaoImpressaoResponse.trilha2) &&
        Objects.equals(this.trilhaCVV1, dadosCartaoImpressaoResponse.trilhaCVV1) &&
        Objects.equals(this.trilhaCVV2, dadosCartaoImpressaoResponse.trilhaCVV2) &&
        Objects.equals(this.flagVirtual, dadosCartaoImpressaoResponse.flagVirtual) &&
        Objects.equals(this.nomeBandeira, dadosCartaoImpressaoResponse.nomeBandeira) &&
        Objects.equals(this.flagTitular, dadosCartaoImpressaoResponse.flagTitular) &&
        Objects.equals(this.sequencialCartao, dadosCartaoImpressaoResponse.sequencialCartao) &&
        Objects.equals(this.idStatus, dadosCartaoImpressaoResponse.idStatus) &&
        Objects.equals(this.descricaoStatusCartao, dadosCartaoImpressaoResponse.descricaoStatusCartao) &&
        Objects.equals(this.dataStatus, dadosCartaoImpressaoResponse.dataStatus) &&
        Objects.equals(this.idEstagio, dadosCartaoImpressaoResponse.idEstagio) &&
        Objects.equals(this.descricaoEstagio, dadosCartaoImpressaoResponse.descricaoEstagio) &&
        Objects.equals(this.dataEstagio, dadosCartaoImpressaoResponse.dataEstagio) &&
        Objects.equals(this.numeroBin, dadosCartaoImpressaoResponse.numeroBin) &&
        Objects.equals(this.idProduto, dadosCartaoImpressaoResponse.idProduto) &&
        Objects.equals(this.descricaoProduto, dadosCartaoImpressaoResponse.descricaoProduto) &&
        Objects.equals(this.idStatusConta, dadosCartaoImpressaoResponse.idStatusConta) &&
        Objects.equals(this.descricaoStatusConta, dadosCartaoImpressaoResponse.descricaoStatusConta) &&
        Objects.equals(this.dataEmbossing, dadosCartaoImpressaoResponse.dataEmbossing) &&
        Objects.equals(this.codigoDesbloqueio, dadosCartaoImpressaoResponse.codigoDesbloqueio) &&
        Objects.equals(this.nomePessoa, dadosCartaoImpressaoResponse.nomePessoa) &&
        Objects.equals(this.tipoPessoa, dadosCartaoImpressaoResponse.tipoPessoa) &&
        Objects.equals(this.dataNascimento, dadosCartaoImpressaoResponse.dataNascimento) &&
        Objects.equals(this.idEndereco, dadosCartaoImpressaoResponse.idEndereco) &&
        Objects.equals(this.idTipoEndereco, dadosCartaoImpressaoResponse.idTipoEndereco) &&
        Objects.equals(this.descricaoTipoEndereco, dadosCartaoImpressaoResponse.descricaoTipoEndereco) &&
        Objects.equals(this.cep, dadosCartaoImpressaoResponse.cep) &&
        Objects.equals(this.logradouro, dadosCartaoImpressaoResponse.logradouro) &&
        Objects.equals(this.numeroEndereco, dadosCartaoImpressaoResponse.numeroEndereco) &&
        Objects.equals(this.complementoEndereco, dadosCartaoImpressaoResponse.complementoEndereco) &&
        Objects.equals(this.bairro, dadosCartaoImpressaoResponse.bairro) &&
        Objects.equals(this.cidade, dadosCartaoImpressaoResponse.cidade) &&
        Objects.equals(this.uf, dadosCartaoImpressaoResponse.uf) &&
        Objects.equals(this.pais, dadosCartaoImpressaoResponse.pais) &&
        Objects.equals(this.senhaCriptografada, dadosCartaoImpressaoResponse.senhaCriptografada) &&
        Objects.equals(this.icvv, dadosCartaoImpressaoResponse.icvv) &&
        Objects.equals(this.idStatusImpressao, dadosCartaoImpressaoResponse.idStatusImpressao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idPessoa, idCartao, idBandeira, idTipoCartao, numeroCartao, nomePlastico, cvv2, dataGeracao, dataValidade, cpf, tipoPortador, trilha1, trilha2, trilhaCVV1, trilhaCVV2, flagVirtual, nomeBandeira, flagTitular, sequencialCartao, idStatus, descricaoStatusCartao, dataStatus, idEstagio, descricaoEstagio, dataEstagio, numeroBin, idProduto, descricaoProduto, idStatusConta, descricaoStatusConta, dataEmbossing, codigoDesbloqueio, nomePessoa, tipoPessoa, dataNascimento, idEndereco, idTipoEndereco, descricaoTipoEndereco, cep, logradouro, numeroEndereco, complementoEndereco, bairro, cidade, uf, pais, senhaCriptografada, icvv, idStatusImpressao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCartaoImpressaoResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idBandeira: ").append(toIndentedString(idBandeira)).append("\n");
    sb.append("    idTipoCartao: ").append(toIndentedString(idTipoCartao)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    nomePlastico: ").append(toIndentedString(nomePlastico)).append("\n");
    sb.append("    cvv2: ").append(toIndentedString(cvv2)).append("\n");
    sb.append("    dataGeracao: ").append(toIndentedString(dataGeracao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    tipoPortador: ").append(toIndentedString(tipoPortador)).append("\n");
    sb.append("    trilha1: ").append(toIndentedString(trilha1)).append("\n");
    sb.append("    trilha2: ").append(toIndentedString(trilha2)).append("\n");
    sb.append("    trilhaCVV1: ").append(toIndentedString(trilhaCVV1)).append("\n");
    sb.append("    trilhaCVV2: ").append(toIndentedString(trilhaCVV2)).append("\n");
    sb.append("    flagVirtual: ").append(toIndentedString(flagVirtual)).append("\n");
    sb.append("    nomeBandeira: ").append(toIndentedString(nomeBandeira)).append("\n");
    sb.append("    flagTitular: ").append(toIndentedString(flagTitular)).append("\n");
    sb.append("    sequencialCartao: ").append(toIndentedString(sequencialCartao)).append("\n");
    sb.append("    idStatus: ").append(toIndentedString(idStatus)).append("\n");
    sb.append("    descricaoStatusCartao: ").append(toIndentedString(descricaoStatusCartao)).append("\n");
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
    sb.append("    idEstagio: ").append(toIndentedString(idEstagio)).append("\n");
    sb.append("    descricaoEstagio: ").append(toIndentedString(descricaoEstagio)).append("\n");
    sb.append("    dataEstagio: ").append(toIndentedString(dataEstagio)).append("\n");
    sb.append("    numeroBin: ").append(toIndentedString(numeroBin)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    descricaoProduto: ").append(toIndentedString(descricaoProduto)).append("\n");
    sb.append("    idStatusConta: ").append(toIndentedString(idStatusConta)).append("\n");
    sb.append("    descricaoStatusConta: ").append(toIndentedString(descricaoStatusConta)).append("\n");
    sb.append("    dataEmbossing: ").append(toIndentedString(dataEmbossing)).append("\n");
    sb.append("    codigoDesbloqueio: ").append(toIndentedString(codigoDesbloqueio)).append("\n");
    sb.append("    nomePessoa: ").append(toIndentedString(nomePessoa)).append("\n");
    sb.append("    tipoPessoa: ").append(toIndentedString(tipoPessoa)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    idEndereco: ").append(toIndentedString(idEndereco)).append("\n");
    sb.append("    idTipoEndereco: ").append(toIndentedString(idTipoEndereco)).append("\n");
    sb.append("    descricaoTipoEndereco: ").append(toIndentedString(descricaoTipoEndereco)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    numeroEndereco: ").append(toIndentedString(numeroEndereco)).append("\n");
    sb.append("    complementoEndereco: ").append(toIndentedString(complementoEndereco)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    senhaCriptografada: ").append(toIndentedString(senhaCriptografada)).append("\n");
    sb.append("    icvv: ").append(toIndentedString(icvv)).append("\n");
    sb.append("    idStatusImpressao: ").append(toIndentedString(idStatusImpressao)).append("\n");
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



