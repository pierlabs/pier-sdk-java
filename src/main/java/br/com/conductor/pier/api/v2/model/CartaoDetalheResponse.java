package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Cart\u00E3o com mais informa\u00E7\u00F5es
 **/

@ApiModel(description = "Objeto Cart\u00E3o com mais informa\u00E7\u00F5es")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoDetalheResponse   {
  
  private Long id = null;
  private Integer flagTitular = null;
  private Long idPessoa = null;
  private Integer sequencialCartao = null;
  private Long idConta = null;
  private Long idStatus = null;
  private String dataStatus = null;
  private Long idEstagio = null;
  private String dataEstagio = null;
  private Long numeroBin = null;
  private String numeroCartao = null;
  private Long numeroCartaoHash = null;
  private String numeroCartaoCriptografado = null;
  private String dataEmissao = null;
  private String dataValidade = null;
  private Integer cartaoVirtual = null;
  private Integer impressaoAvulsa = null;
  private String dataImpressao = null;
  private String nomeArquivoImpressao = null;
  private Long idProduto = null;
  private String nomeImpresso = null;
  private String codigoDesbloqueio = null;
  private String tipoPortador = null;
  private Long idStatusCartao = null;
  private String dataStatusCartao = null;
  private Long idEstagioCartao = null;
  private String dataEstagioCartao = null;
  private String dataGeracao = null;
  private Integer flagVirtual = null;
  private Integer flagImpressaoOrigemComercial = null;
  private String arquivoImpressao = null;
  private Integer portador = null;
  private Boolean flagCartaoMifare = null;
  private Long idImagem = null;
  private String descricaoTipoCartao = null;
  private Long tipoCartao = null;
  private Long idMifare = null;
  private String matriculaMifare = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o
   **/
  public CartaoDetalheResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o tipo do Portador do cart\u00E3o, sendo: (1: Titular, 0: Adicional)
   **/
  public CartaoDetalheResponse flagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o tipo do Portador do cart\u00E3o, sendo: (1: Titular, 0: Adicional)")
  @JsonProperty("flagTitular")
  public Integer getFlagTitular() {
    return flagTitular;
  }
  public void setFlagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o cart\u00E3o pertence
   **/
  public CartaoDetalheResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o cart\u00E3o pertence")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * N\u00FAmero sequencial do cart\u00E3o
   **/
  public CartaoDetalheResponse sequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero sequencial do cart\u00E3o")
  @JsonProperty("sequencialCartao")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Conta a qual o cart\u00E3o pertence
   **/
  public CartaoDetalheResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Conta a qual o cart\u00E3o pertence")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Status do Cart\u00E3o
   **/
  public CartaoDetalheResponse idStatus(Long idStatus) {
    this.idStatus = idStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Status do Cart\u00E3o")
  @JsonProperty("idStatus")
  public Long getIdStatus() {
    return idStatus;
  }
  public void setIdStatus(Long idStatus) {
    this.idStatus = idStatus;
  }

  
  /**
   * Apresenta a data em que o idStatusCartao atual do cart\u00E3o fora aplicado, quando houver
   **/
  public CartaoDetalheResponse dataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data em que o idStatusCartao atual do cart\u00E3o fora aplicado, quando houver")
  @JsonProperty("dataStatus")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Est\u00E1gio de Impress\u00E3o do Cart\u00E3o
   **/
  public CartaoDetalheResponse idEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Est\u00E1gio de Impress\u00E3o do Cart\u00E3o")
  @JsonProperty("idEstagio")
  public Long getIdEstagio() {
    return idEstagio;
  }
  public void setIdEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
  }

  
  /**
   * Apresenta a data em que o idEstagio atual do cart\u00E3o fora aplicado, quando houver
   **/
  public CartaoDetalheResponse dataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data em que o idEstagio atual do cart\u00E3o fora aplicado, quando houver")
  @JsonProperty("dataEstagio")
  public String getDataEstagio() {
    return dataEstagio;
  }
  public void setDataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
  }

  
  /**
   * N\u00FAmero do bin do cart\u00E3o
   **/
  public CartaoDetalheResponse numeroBin(Long numeroBin) {
    this.numeroBin = numeroBin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do bin do cart\u00E3o")
  @JsonProperty("numeroBin")
  public Long getNumeroBin() {
    return numeroBin;
  }
  public void setNumeroBin(Long numeroBin) {
    this.numeroBin = numeroBin;
  }

  
  /**
   * Apresenta o n\u00FAmero do cart\u00E3o
   **/
  public CartaoDetalheResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00FAmero do cart\u00E3o")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o hash
   **/
  public CartaoDetalheResponse numeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do cart\u00E3o hash")
  @JsonProperty("numeroCartaoHash")
  public Long getNumeroCartaoHash() {
    return numeroCartaoHash;
  }
  public void setNumeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o criptografado
   **/
  public CartaoDetalheResponse numeroCartaoCriptografado(String numeroCartaoCriptografado) {
    this.numeroCartaoCriptografado = numeroCartaoCriptografado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do cart\u00E3o criptografado")
  @JsonProperty("numeroCartaoCriptografado")
  public String getNumeroCartaoCriptografado() {
    return numeroCartaoCriptografado;
  }
  public void setNumeroCartaoCriptografado(String numeroCartaoCriptografado) {
    this.numeroCartaoCriptografado = numeroCartaoCriptografado;
  }

  
  /**
   * Apresenta a data de emiss\u00E3o do cart\u00E3o
   **/
  public CartaoDetalheResponse dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data de emiss\u00E3o do cart\u00E3o")
  @JsonProperty("dataEmissao")
  public String getDataEmissao() {
    return dataEmissao;
  }
  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  
  /**
   * Apresenta a data de validade do cart\u00E3o em formato yyyy-MM, quando houver
   **/
  public CartaoDetalheResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data de validade do cart\u00E3o em formato yyyy-MM, quando houver")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Apresenta o status que informa se o cart\u00E3o \u00E9 virtual. Sendo: (1: True, 0: False)
   **/
  public CartaoDetalheResponse cartaoVirtual(Integer cartaoVirtual) {
    this.cartaoVirtual = cartaoVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o status que informa se o cart\u00E3o \u00E9 virtual. Sendo: (1: True, 0: False)")
  @JsonProperty("cartaoVirtual")
  public Integer getCartaoVirtual() {
    return cartaoVirtual;
  }
  public void setCartaoVirtual(Integer cartaoVirtual) {
    this.cartaoVirtual = cartaoVirtual;
  }

  
  /**
   * Quando ativa, indica que o cart\u00E3o fora impresso na Origem Comercial
   **/
  public CartaoDetalheResponse impressaoAvulsa(Integer impressaoAvulsa) {
    this.impressaoAvulsa = impressaoAvulsa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que o cart\u00E3o fora impresso na Origem Comercial")
  @JsonProperty("impressaoAvulsa")
  public Integer getImpressaoAvulsa() {
    return impressaoAvulsa;
  }
  public void setImpressaoAvulsa(Integer impressaoAvulsa) {
    this.impressaoAvulsa = impressaoAvulsa;
  }

  
  /**
   * Apresenta a data em que o cart\u00E3o fora impresso, caso impress\u00E3o em loja, ou a data em que ele fora inclu\u00EDdo no arquivo para impress\u00E3o via gr\u00E1fica
   **/
  public CartaoDetalheResponse dataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data em que o cart\u00E3o fora impresso, caso impress\u00E3o em loja, ou a data em que ele fora inclu\u00EDdo no arquivo para impress\u00E3o via gr\u00E1fica")
  @JsonProperty("dataImpressao")
  public String getDataImpressao() {
    return dataImpressao;
  }
  public void setDataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
  }

  
  /**
   * Apresenta o nome do arquivo onde o cart\u00E3o fora inclu\u00EDdo para impress\u00E3o por uma gr\u00E1fica, quando houver
   **/
  public CartaoDetalheResponse nomeArquivoImpressao(String nomeArquivoImpressao) {
    this.nomeArquivoImpressao = nomeArquivoImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do arquivo onde o cart\u00E3o fora inclu\u00EDdo para impress\u00E3o por uma gr\u00E1fica, quando houver")
  @JsonProperty("nomeArquivoImpressao")
  public String getNomeArquivoImpressao() {
    return nomeArquivoImpressao;
  }
  public void setNomeArquivoImpressao(String nomeArquivoImpressao) {
    this.nomeArquivoImpressao = nomeArquivoImpressao;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Produto a qual o cart\u00E3o pertence
   **/
  public CartaoDetalheResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Produto a qual o cart\u00E3o pertence")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Apresenta o nome impresso no cart\u00E3o
   **/
  public CartaoDetalheResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome impresso no cart\u00E3o")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Apresenta um c\u00F3digo espec\u00EDfico para ser utilizado como vari\u00E1vel no processo de desbloqueio do cart\u00E3o para emissores que querem usar esta funcionalidade
   **/
  public CartaoDetalheResponse codigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta um c\u00F3digo espec\u00EDfico para ser utilizado como vari\u00E1vel no processo de desbloqueio do cart\u00E3o para emissores que querem usar esta funcionalidade")
  @JsonProperty("codigoDesbloqueio")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  
  /**
   * Apresenta o tipo do Portador do cart\u00E3o, sendo: ('T': Titular, 'A': Adicional)
   **/
  public CartaoDetalheResponse tipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o tipo do Portador do cart\u00E3o, sendo: ('T': Titular, 'A': Adicional)")
  @JsonProperty("tipoPortador")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Status do Cart\u00E3o
   **/
  public CartaoDetalheResponse idStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Status do Cart\u00E3o")
  @JsonProperty("idStatusCartao")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * Apresenta a data em que o idStatusCartao atual do cart\u00E3o fora aplicado, quando houver
   **/
  public CartaoDetalheResponse dataStatusCartao(String dataStatusCartao) {
    this.dataStatusCartao = dataStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data em que o idStatusCartao atual do cart\u00E3o fora aplicado, quando houver")
  @JsonProperty("dataStatusCartao")
  public String getDataStatusCartao() {
    return dataStatusCartao;
  }
  public void setDataStatusCartao(String dataStatusCartao) {
    this.dataStatusCartao = dataStatusCartao;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Est\u00E1gio de Impress\u00E3o do Cart\u00E3o
   **/
  public CartaoDetalheResponse idEstagioCartao(Long idEstagioCartao) {
    this.idEstagioCartao = idEstagioCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Est\u00E1gio de Impress\u00E3o do Cart\u00E3o")
  @JsonProperty("idEstagioCartao")
  public Long getIdEstagioCartao() {
    return idEstagioCartao;
  }
  public void setIdEstagioCartao(Long idEstagioCartao) {
    this.idEstagioCartao = idEstagioCartao;
  }

  
  /**
   * Apresenta a data em que o idEstagioCartao atual do cart\u00E3o fora aplicado, quando houver
   **/
  public CartaoDetalheResponse dataEstagioCartao(String dataEstagioCartao) {
    this.dataEstagioCartao = dataEstagioCartao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data em que o idEstagioCartao atual do cart\u00E3o fora aplicado, quando houver")
  @JsonProperty("dataEstagioCartao")
  public String getDataEstagioCartao() {
    return dataEstagioCartao;
  }
  public void setDataEstagioCartao(String dataEstagioCartao) {
    this.dataEstagioCartao = dataEstagioCartao;
  }

  
  /**
   * Apresenta a data em que o cart\u00E3o foi gerado
   **/
  public CartaoDetalheResponse dataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data em que o cart\u00E3o foi gerado")
  @JsonProperty("dataGeracao")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * Apresenta o status que informa se o cart\u00E3o \u00E9 virtual
   **/
  public CartaoDetalheResponse flagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o status que informa se o cart\u00E3o \u00E9 virtual")
  @JsonProperty("flagVirtual")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * Quando ativa, indica que o cart\u00E3o fora impresso na Origem Comercial
   **/
  public CartaoDetalheResponse flagImpressaoOrigemComercial(Integer flagImpressaoOrigemComercial) {
    this.flagImpressaoOrigemComercial = flagImpressaoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que o cart\u00E3o fora impresso na Origem Comercial")
  @JsonProperty("flagImpressaoOrigemComercial")
  public Integer getFlagImpressaoOrigemComercial() {
    return flagImpressaoOrigemComercial;
  }
  public void setFlagImpressaoOrigemComercial(Integer flagImpressaoOrigemComercial) {
    this.flagImpressaoOrigemComercial = flagImpressaoOrigemComercial;
  }

  
  /**
   * Apresenta o nome do arquivo onde o cart\u00E3o fora inclu\u00EDdo para impress\u00E3o por uma gr\u00E1fica, quando houver
   **/
  public CartaoDetalheResponse arquivoImpressao(String arquivoImpressao) {
    this.arquivoImpressao = arquivoImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do arquivo onde o cart\u00E3o fora inclu\u00EDdo para impress\u00E3o por uma gr\u00E1fica, quando houver")
  @JsonProperty("arquivoImpressao")
  public String getArquivoImpressao() {
    return arquivoImpressao;
  }
  public void setArquivoImpressao(String arquivoImpressao) {
    this.arquivoImpressao = arquivoImpressao;
  }

  
  /**
   * Apresenta o n\u00FAmero do portador do cart\u00E3o
   **/
  public CartaoDetalheResponse portador(Integer portador) {
    this.portador = portador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00FAmero do portador do cart\u00E3o")
  @JsonProperty("portador")
  public Integer getPortador() {
    return portador;
  }
  public void setPortador(Integer portador) {
    this.portador = portador;
  }

  
  /**
   * Identifica se o cart\u00E3o cont\u00E9m a tecnologia mifare
   **/
  public CartaoDetalheResponse flagCartaoMifare(Boolean flagCartaoMifare) {
    this.flagCartaoMifare = flagCartaoMifare;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Identifica se o cart\u00E3o cont\u00E9m a tecnologia mifare")
  @JsonProperty("flagCartaoMifare")
  public Boolean getFlagCartaoMifare() {
    return flagCartaoMifare;
  }
  public void setFlagCartaoMifare(Boolean flagCartaoMifare) {
    this.flagCartaoMifare = flagCartaoMifare;
  }

  
  /**
   * Apresenta o identificador da cor do cart\u00E3o
   **/
  public CartaoDetalheResponse idImagem(Long idImagem) {
    this.idImagem = idImagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o identificador da cor do cart\u00E3o")
  @JsonProperty("idImagem")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  
  /**
   * Descreve o tipo do cart\u00E3o
   **/
  public CartaoDetalheResponse descricaoTipoCartao(String descricaoTipoCartao) {
    this.descricaoTipoCartao = descricaoTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descreve o tipo do cart\u00E3o")
  @JsonProperty("descricaoTipoCartao")
  public String getDescricaoTipoCartao() {
    return descricaoTipoCartao;
  }
  public void setDescricaoTipoCartao(String descricaoTipoCartao) {
    this.descricaoTipoCartao = descricaoTipoCartao;
  }

  
  /**
   * Indica o identificador do tipo do cart\u00E3o
   **/
  public CartaoDetalheResponse tipoCartao(Long tipoCartao) {
    this.tipoCartao = tipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica o identificador do tipo do cart\u00E3o")
  @JsonProperty("tipoCartao")
  public Long getTipoCartao() {
    return tipoCartao;
  }
  public void setTipoCartao(Long tipoCartao) {
    this.tipoCartao = tipoCartao;
  }

  
  /**
   * C\u00F3digo identificador da tecnologia MIFARE
   **/
  public CartaoDetalheResponse idMifare(Long idMifare) {
    this.idMifare = idMifare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da tecnologia MIFARE")
  @JsonProperty("idMifare")
  public Long getIdMifare() {
    return idMifare;
  }
  public void setIdMifare(Long idMifare) {
    this.idMifare = idMifare;
  }

  
  /**
   * N\u00FAmero da matricula do portador
   **/
  public CartaoDetalheResponse matriculaMifare(String matriculaMifare) {
    this.matriculaMifare = matriculaMifare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da matricula do portador")
  @JsonProperty("matriculaMifare")
  public String getMatriculaMifare() {
    return matriculaMifare;
  }
  public void setMatriculaMifare(String matriculaMifare) {
    this.matriculaMifare = matriculaMifare;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoDetalheResponse cartaoDetalheResponse = (CartaoDetalheResponse) o;
    return Objects.equals(this.id, cartaoDetalheResponse.id) &&
        Objects.equals(this.flagTitular, cartaoDetalheResponse.flagTitular) &&
        Objects.equals(this.idPessoa, cartaoDetalheResponse.idPessoa) &&
        Objects.equals(this.sequencialCartao, cartaoDetalheResponse.sequencialCartao) &&
        Objects.equals(this.idConta, cartaoDetalheResponse.idConta) &&
        Objects.equals(this.idStatus, cartaoDetalheResponse.idStatus) &&
        Objects.equals(this.dataStatus, cartaoDetalheResponse.dataStatus) &&
        Objects.equals(this.idEstagio, cartaoDetalheResponse.idEstagio) &&
        Objects.equals(this.dataEstagio, cartaoDetalheResponse.dataEstagio) &&
        Objects.equals(this.numeroBin, cartaoDetalheResponse.numeroBin) &&
        Objects.equals(this.numeroCartao, cartaoDetalheResponse.numeroCartao) &&
        Objects.equals(this.numeroCartaoHash, cartaoDetalheResponse.numeroCartaoHash) &&
        Objects.equals(this.numeroCartaoCriptografado, cartaoDetalheResponse.numeroCartaoCriptografado) &&
        Objects.equals(this.dataEmissao, cartaoDetalheResponse.dataEmissao) &&
        Objects.equals(this.dataValidade, cartaoDetalheResponse.dataValidade) &&
        Objects.equals(this.cartaoVirtual, cartaoDetalheResponse.cartaoVirtual) &&
        Objects.equals(this.impressaoAvulsa, cartaoDetalheResponse.impressaoAvulsa) &&
        Objects.equals(this.dataImpressao, cartaoDetalheResponse.dataImpressao) &&
        Objects.equals(this.nomeArquivoImpressao, cartaoDetalheResponse.nomeArquivoImpressao) &&
        Objects.equals(this.idProduto, cartaoDetalheResponse.idProduto) &&
        Objects.equals(this.nomeImpresso, cartaoDetalheResponse.nomeImpresso) &&
        Objects.equals(this.codigoDesbloqueio, cartaoDetalheResponse.codigoDesbloqueio) &&
        Objects.equals(this.tipoPortador, cartaoDetalheResponse.tipoPortador) &&
        Objects.equals(this.idStatusCartao, cartaoDetalheResponse.idStatusCartao) &&
        Objects.equals(this.dataStatusCartao, cartaoDetalheResponse.dataStatusCartao) &&
        Objects.equals(this.idEstagioCartao, cartaoDetalheResponse.idEstagioCartao) &&
        Objects.equals(this.dataEstagioCartao, cartaoDetalheResponse.dataEstagioCartao) &&
        Objects.equals(this.dataGeracao, cartaoDetalheResponse.dataGeracao) &&
        Objects.equals(this.flagVirtual, cartaoDetalheResponse.flagVirtual) &&
        Objects.equals(this.flagImpressaoOrigemComercial, cartaoDetalheResponse.flagImpressaoOrigemComercial) &&
        Objects.equals(this.arquivoImpressao, cartaoDetalheResponse.arquivoImpressao) &&
        Objects.equals(this.portador, cartaoDetalheResponse.portador) &&
        Objects.equals(this.flagCartaoMifare, cartaoDetalheResponse.flagCartaoMifare) &&
        Objects.equals(this.idImagem, cartaoDetalheResponse.idImagem) &&
        Objects.equals(this.descricaoTipoCartao, cartaoDetalheResponse.descricaoTipoCartao) &&
        Objects.equals(this.tipoCartao, cartaoDetalheResponse.tipoCartao) &&
        Objects.equals(this.idMifare, cartaoDetalheResponse.idMifare) &&
        Objects.equals(this.matriculaMifare, cartaoDetalheResponse.matriculaMifare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, flagTitular, idPessoa, sequencialCartao, idConta, idStatus, dataStatus, idEstagio, dataEstagio, numeroBin, numeroCartao, numeroCartaoHash, numeroCartaoCriptografado, dataEmissao, dataValidade, cartaoVirtual, impressaoAvulsa, dataImpressao, nomeArquivoImpressao, idProduto, nomeImpresso, codigoDesbloqueio, tipoPortador, idStatusCartao, dataStatusCartao, idEstagioCartao, dataEstagioCartao, dataGeracao, flagVirtual, flagImpressaoOrigemComercial, arquivoImpressao, portador, flagCartaoMifare, idImagem, descricaoTipoCartao, tipoCartao, idMifare, matriculaMifare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoDetalheResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    flagTitular: ").append(toIndentedString(flagTitular)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    sequencialCartao: ").append(toIndentedString(sequencialCartao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idStatus: ").append(toIndentedString(idStatus)).append("\n");
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
    sb.append("    idEstagio: ").append(toIndentedString(idEstagio)).append("\n");
    sb.append("    dataEstagio: ").append(toIndentedString(dataEstagio)).append("\n");
    sb.append("    numeroBin: ").append(toIndentedString(numeroBin)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    numeroCartaoHash: ").append(toIndentedString(numeroCartaoHash)).append("\n");
    sb.append("    numeroCartaoCriptografado: ").append(toIndentedString(numeroCartaoCriptografado)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    cartaoVirtual: ").append(toIndentedString(cartaoVirtual)).append("\n");
    sb.append("    impressaoAvulsa: ").append(toIndentedString(impressaoAvulsa)).append("\n");
    sb.append("    dataImpressao: ").append(toIndentedString(dataImpressao)).append("\n");
    sb.append("    nomeArquivoImpressao: ").append(toIndentedString(nomeArquivoImpressao)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    codigoDesbloqueio: ").append(toIndentedString(codigoDesbloqueio)).append("\n");
    sb.append("    tipoPortador: ").append(toIndentedString(tipoPortador)).append("\n");
    sb.append("    idStatusCartao: ").append(toIndentedString(idStatusCartao)).append("\n");
    sb.append("    dataStatusCartao: ").append(toIndentedString(dataStatusCartao)).append("\n");
    sb.append("    idEstagioCartao: ").append(toIndentedString(idEstagioCartao)).append("\n");
    sb.append("    dataEstagioCartao: ").append(toIndentedString(dataEstagioCartao)).append("\n");
    sb.append("    dataGeracao: ").append(toIndentedString(dataGeracao)).append("\n");
    sb.append("    flagVirtual: ").append(toIndentedString(flagVirtual)).append("\n");
    sb.append("    flagImpressaoOrigemComercial: ").append(toIndentedString(flagImpressaoOrigemComercial)).append("\n");
    sb.append("    arquivoImpressao: ").append(toIndentedString(arquivoImpressao)).append("\n");
    sb.append("    portador: ").append(toIndentedString(portador)).append("\n");
    sb.append("    flagCartaoMifare: ").append(toIndentedString(flagCartaoMifare)).append("\n");
    sb.append("    idImagem: ").append(toIndentedString(idImagem)).append("\n");
    sb.append("    descricaoTipoCartao: ").append(toIndentedString(descricaoTipoCartao)).append("\n");
    sb.append("    tipoCartao: ").append(toIndentedString(tipoCartao)).append("\n");
    sb.append("    idMifare: ").append(toIndentedString(idMifare)).append("\n");
    sb.append("    matriculaMifare: ").append(toIndentedString(matriculaMifare)).append("\n");
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

