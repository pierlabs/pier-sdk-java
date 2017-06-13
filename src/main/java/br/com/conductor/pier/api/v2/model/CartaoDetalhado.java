package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Objeto Cart\u00C3\u00A3o com mais informa\u00C3\u00A7\u00C3\u00B5es
 **/

@ApiModel(description = "Objeto Cart\u00C3\u00A3o com mais informa\u00C3\u00A7\u00C3\u00B5es")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoDetalhado   {
  
  private Long id = null;
  private Long idStatusCartao = null;
  private Long idEstagioCartao = null;
  private Long idConta = null;
  private Long idPessoa = null;
  private Long idProduto = null;
  private String tipoPortador = null;
  private String numeroCartao = null;
  private String nomeImpresso = null;
  private String dataGeracao = null;
  private String dataStatusCartao = null;
  private String dataEstagioCartao = null;
  private String dataValidade = null;
  private String dataImpressao = null;
  private String arquivoImpressao = null;
  private Integer flagImpressaoOrigemComercial = null;
  private Integer flagVirtual = null;
  private String codigoDesbloqueio = null;
  private Integer sequencialCartao = null;
  private String descricaoTipoCartao = null;
  private Long tipoCartao = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   **/
  public CartaoDetalhado id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).
   **/
  public CartaoDetalhado idStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).")
  @JsonProperty("idStatusCartao")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   **/
  public CartaoDetalhado idEstagioCartao(Long idEstagioCartao) {
    this.idEstagioCartao = idEstagioCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).")
  @JsonProperty("idEstagioCartao")
  public Long getIdEstagioCartao() {
    return idEstagioCartao;
  }
  public void setIdEstagioCartao(Long idEstagioCartao) {
    this.idEstagioCartao = idEstagioCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence (id).
   **/
  public CartaoDetalhado idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence (id).")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)
   **/
  public CartaoDetalhado idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).
   **/
  public CartaoDetalhado idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: ('T': Titular, 'A': Adicional).
   **/
  public CartaoDetalhado tipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: ('T': Titular, 'A': Adicional).")
  @JsonProperty("tipoPortador")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.
   **/
  public CartaoDetalhado numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Apresenta o nome impresso no cart\u00C3\u00A3o.
   **/
  public CartaoDetalhado nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome impresso no cart\u00C3\u00A3o.")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Apresenta a data em que o cart\u00C3\u00A3o foi gerado.
   **/
  public CartaoDetalhado dataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data em que o cart\u00C3\u00A3o foi gerado.")
  @JsonProperty("dataGeracao")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   **/
  public CartaoDetalhado dataStatusCartao(String dataStatusCartao) {
    this.dataStatusCartao = dataStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.")
  @JsonProperty("dataStatusCartao")
  public String getDataStatusCartao() {
    return dataStatusCartao;
  }
  public void setDataStatusCartao(String dataStatusCartao) {
    this.dataStatusCartao = dataStatusCartao;
  }

  
  /**
   * Apresenta a data em que o idEstagioCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   **/
  public CartaoDetalhado dataEstagioCartao(String dataEstagioCartao) {
    this.dataEstagioCartao = dataEstagioCartao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data em que o idEstagioCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.")
  @JsonProperty("dataEstagioCartao")
  public String getDataEstagioCartao() {
    return dataEstagioCartao;
  }
  public void setDataEstagioCartao(String dataEstagioCartao) {
    this.dataEstagioCartao = dataEstagioCartao;
  }

  
  /**
   * Apresenta a data de validade do cart\u00C3\u00A3o em formato yyyy-MM, quando houver.
   **/
  public CartaoDetalhado dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data de validade do cart\u00C3\u00A3o em formato yyyy-MM, quando houver.")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.
   **/
  public CartaoDetalhado dataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.")
  @JsonProperty("dataImpressao")
  public String getDataImpressao() {
    return dataImpressao;
  }
  public void setDataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
  }

  
  /**
   * Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.
   **/
  public CartaoDetalhado arquivoImpressao(String arquivoImpressao) {
    this.arquivoImpressao = arquivoImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.")
  @JsonProperty("arquivoImpressao")
  public String getArquivoImpressao() {
    return arquivoImpressao;
  }
  public void setArquivoImpressao(String arquivoImpressao) {
    this.arquivoImpressao = arquivoImpressao;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.
   **/
  public CartaoDetalhado flagImpressaoOrigemComercial(Integer flagImpressaoOrigemComercial) {
    this.flagImpressaoOrigemComercial = flagImpressaoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.")
  @JsonProperty("flagImpressaoOrigemComercial")
  public Integer getFlagImpressaoOrigemComercial() {
    return flagImpressaoOrigemComercial;
  }
  public void setFlagImpressaoOrigemComercial(Integer flagImpressaoOrigemComercial) {
    this.flagImpressaoOrigemComercial = flagImpressaoOrigemComercial;
  }

  
  /**
   * Apresenta o status que informa se o cart\u00C3\u00A3o \u00C3\u00A9 virtual.
   **/
  public CartaoDetalhado flagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o status que informa se o cart\u00C3\u00A3o \u00C3\u00A9 virtual.")
  @JsonProperty("flagVirtual")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.
   **/
  public CartaoDetalhado codigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.")
  @JsonProperty("codigoDesbloqueio")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  
  /**
   * N\u00C3\u00BAmero sequencial do cart\u00C3\u00A3o
   **/
  public CartaoDetalhado sequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero sequencial do cart\u00C3\u00A3o")
  @JsonProperty("sequencialCartao")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * Descreve o tipo do cart\u00C3\u00A3o.
   **/
  public CartaoDetalhado descricaoTipoCartao(String descricaoTipoCartao) {
    this.descricaoTipoCartao = descricaoTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descreve o tipo do cart\u00C3\u00A3o.")
  @JsonProperty("descricaoTipoCartao")
  public String getDescricaoTipoCartao() {
    return descricaoTipoCartao;
  }
  public void setDescricaoTipoCartao(String descricaoTipoCartao) {
    this.descricaoTipoCartao = descricaoTipoCartao;
  }

  
  /**
   * Indica o identificador do tipo do cart\u00C3\u00A3o.
   **/
  public CartaoDetalhado tipoCartao(Long tipoCartao) {
    this.tipoCartao = tipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica o identificador do tipo do cart\u00C3\u00A3o.")
  @JsonProperty("tipoCartao")
  public Long getTipoCartao() {
    return tipoCartao;
  }
  public void setTipoCartao(Long tipoCartao) {
    this.tipoCartao = tipoCartao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoDetalhado cartaoDetalhado = (CartaoDetalhado) o;
    return Objects.equals(this.id, cartaoDetalhado.id) &&
        Objects.equals(this.idStatusCartao, cartaoDetalhado.idStatusCartao) &&
        Objects.equals(this.idEstagioCartao, cartaoDetalhado.idEstagioCartao) &&
        Objects.equals(this.idConta, cartaoDetalhado.idConta) &&
        Objects.equals(this.idPessoa, cartaoDetalhado.idPessoa) &&
        Objects.equals(this.idProduto, cartaoDetalhado.idProduto) &&
        Objects.equals(this.tipoPortador, cartaoDetalhado.tipoPortador) &&
        Objects.equals(this.numeroCartao, cartaoDetalhado.numeroCartao) &&
        Objects.equals(this.nomeImpresso, cartaoDetalhado.nomeImpresso) &&
        Objects.equals(this.dataGeracao, cartaoDetalhado.dataGeracao) &&
        Objects.equals(this.dataStatusCartao, cartaoDetalhado.dataStatusCartao) &&
        Objects.equals(this.dataEstagioCartao, cartaoDetalhado.dataEstagioCartao) &&
        Objects.equals(this.dataValidade, cartaoDetalhado.dataValidade) &&
        Objects.equals(this.dataImpressao, cartaoDetalhado.dataImpressao) &&
        Objects.equals(this.arquivoImpressao, cartaoDetalhado.arquivoImpressao) &&
        Objects.equals(this.flagImpressaoOrigemComercial, cartaoDetalhado.flagImpressaoOrigemComercial) &&
        Objects.equals(this.flagVirtual, cartaoDetalhado.flagVirtual) &&
        Objects.equals(this.codigoDesbloqueio, cartaoDetalhado.codigoDesbloqueio) &&
        Objects.equals(this.sequencialCartao, cartaoDetalhado.sequencialCartao) &&
        Objects.equals(this.descricaoTipoCartao, cartaoDetalhado.descricaoTipoCartao) &&
        Objects.equals(this.tipoCartao, cartaoDetalhado.tipoCartao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idStatusCartao, idEstagioCartao, idConta, idPessoa, idProduto, tipoPortador, numeroCartao, nomeImpresso, dataGeracao, dataStatusCartao, dataEstagioCartao, dataValidade, dataImpressao, arquivoImpressao, flagImpressaoOrigemComercial, flagVirtual, codigoDesbloqueio, sequencialCartao, descricaoTipoCartao, tipoCartao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoDetalhado {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idStatusCartao: ").append(toIndentedString(idStatusCartao)).append("\n");
    sb.append("    idEstagioCartao: ").append(toIndentedString(idEstagioCartao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    tipoPortador: ").append(toIndentedString(tipoPortador)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    dataGeracao: ").append(toIndentedString(dataGeracao)).append("\n");
    sb.append("    dataStatusCartao: ").append(toIndentedString(dataStatusCartao)).append("\n");
    sb.append("    dataEstagioCartao: ").append(toIndentedString(dataEstagioCartao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    dataImpressao: ").append(toIndentedString(dataImpressao)).append("\n");
    sb.append("    arquivoImpressao: ").append(toIndentedString(arquivoImpressao)).append("\n");
    sb.append("    flagImpressaoOrigemComercial: ").append(toIndentedString(flagImpressaoOrigemComercial)).append("\n");
    sb.append("    flagVirtual: ").append(toIndentedString(flagVirtual)).append("\n");
    sb.append("    codigoDesbloqueio: ").append(toIndentedString(codigoDesbloqueio)).append("\n");
    sb.append("    sequencialCartao: ").append(toIndentedString(sequencialCartao)).append("\n");
    sb.append("    descricaoTipoCartao: ").append(toIndentedString(descricaoTipoCartao)).append("\n");
    sb.append("    tipoCartao: ").append(toIndentedString(tipoCartao)).append("\n");
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



