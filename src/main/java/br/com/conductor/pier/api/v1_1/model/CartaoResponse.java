package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.*;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoResponse   {
  
  private String arquivoImpressao = null;
  private String codigoDesbloqueio = null;
  private LocalDateTime dataEstagioCartao = null;
  private LocalDateTime dataGeracao = null;
  private LocalDateTime dataImpressao = null;
  private LocalDateTime dataStatusCartao = null;
  private LocalDateTime dataValidade = null;
  private Integer flagImpressaoOrigemComercial = null;
  private Integer flagProvisorio = null;
  private Long id = null;
  private Long idConta = null;
  private Long idEstagioCartao = null;
  private Long idPessoa = null;
  private Long idStatusCartao = null;
  private String numeroCartao = null;
  private Integer portador = null;

  
  /**
   * Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.
   **/
  public CartaoResponse arquivoImpressao(String arquivoImpressao) {
    this.arquivoImpressao = arquivoImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.")
  @JsonProperty("arquivoImpressao")
  public String getArquivoImpressao() {
    return arquivoImpressao;
  }
  public void setArquivoImpressao(String arquivoImpressao) {
    this.arquivoImpressao = arquivoImpressao;
  }

  
  /**
   * Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.
   **/
  public CartaoResponse codigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.")
  @JsonProperty("codigoDesbloqueio")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  
  /**
   * Apresenta a data em que o idEstagioCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   **/
  public CartaoResponse dataEstagioCartao(LocalDateTime dataEstagioCartao) {
    this.dataEstagioCartao = dataEstagioCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a data em que o idEstagioCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.")
  @JsonProperty("dataEstagioCartao")
  public LocalDateTime getDataEstagioCartao() {
    return dataEstagioCartao;
  }
  public void setDataEstagioCartao(LocalDateTime dataEstagioCartao) {
    this.dataEstagioCartao = dataEstagioCartao;
  }

  
  /**
   * Apresenta a data em que o cart\u00C3\u00A3o foi gerado.
   **/
  public CartaoResponse dataGeracao(LocalDateTime dataGeracao) {
    this.dataGeracao = dataGeracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a data em que o cart\u00C3\u00A3o foi gerado.")
  @JsonProperty("dataGeracao")
  public LocalDateTime getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(LocalDateTime dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.
   **/
  public CartaoResponse dataImpressao(LocalDateTime dataImpressao) {
    this.dataImpressao = dataImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.")
  @JsonProperty("dataImpressao")
  public LocalDateTime getDataImpressao() {
    return dataImpressao;
  }
  public void setDataImpressao(LocalDateTime dataImpressao) {
    this.dataImpressao = dataImpressao;
  }

  
  /**
   * Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   **/
  public CartaoResponse dataStatusCartao(LocalDateTime dataStatusCartao) {
    this.dataStatusCartao = dataStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.")
  @JsonProperty("dataStatusCartao")
  public LocalDateTime getDataStatusCartao() {
    return dataStatusCartao;
  }
  public void setDataStatusCartao(LocalDateTime dataStatusCartao) {
    this.dataStatusCartao = dataStatusCartao;
  }

  
  /**
   * Apresenta a data de validade do cart\u00C3\u00A3o em formato MMAAAA, quando houver.
   **/
  public CartaoResponse dataValidade(LocalDateTime dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a data de validade do cart\u00C3\u00A3o em formato MMAAAA, quando houver.")
  @JsonProperty("dataValidade")
  public LocalDateTime getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(LocalDateTime dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.
   **/
  public CartaoResponse flagImpressaoOrigemComercial(Integer flagImpressaoOrigemComercial) {
    this.flagImpressaoOrigemComercial = flagImpressaoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.")
  @JsonProperty("flagImpressaoOrigemComercial")
  public Integer getFlagImpressaoOrigemComercial() {
    return flagImpressaoOrigemComercial;
  }
  public void setFlagImpressaoOrigemComercial(Integer flagImpressaoOrigemComercial) {
    this.flagImpressaoOrigemComercial = flagImpressaoOrigemComercial;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio. Ou seja, \u00C3\u00A9 um cart\u00C3\u00A3o para uso tempor\u00C3\u00A1rio quando se deseja permitir que o cliente transacione sem que ele tenha recebido um cart\u00C3\u00A3o definitivo.
   **/
  public CartaoResponse flagProvisorio(Integer flagProvisorio) {
    this.flagProvisorio = flagProvisorio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando ativa, indica que o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio. Ou seja, \u00C3\u00A9 um cart\u00C3\u00A3o para uso tempor\u00C3\u00A1rio quando se deseja permitir que o cliente transacione sem que ele tenha recebido um cart\u00C3\u00A3o definitivo.")
  @JsonProperty("flagProvisorio")
  public Integer getFlagProvisorio() {
    return flagProvisorio;
  }
  public void setFlagProvisorio(Integer flagProvisorio) {
    this.flagProvisorio = flagProvisorio;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   **/
  public CartaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence (id).
   **/
  public CartaoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence (id).")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   **/
  public CartaoResponse idEstagioCartao(Long idEstagioCartao) {
    this.idEstagioCartao = idEstagioCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).")
  @JsonProperty("idEstagioCartao")
  public Long getIdEstagioCartao() {
    return idEstagioCartao;
  }
  public void setIdEstagioCartao(Long idEstagioCartao) {
    this.idEstagioCartao = idEstagioCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)
   **/
  public CartaoResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).
   **/
  public CartaoResponse idStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).")
  @JsonProperty("idStatusCartao")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.
   **/
  public CartaoResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Indica qual \u00C3\u00A9 a rela\u00C3\u00A7\u00C3\u00A3o do portador do cart\u00C3\u00A3o com a conta. Quando \u00E2\u0080\u00981\u00E2\u0080\u0099, corresponde ao seu titular. Quando diferente disso, corresponde a um cart\u00C3\u00A3o adicional.
   **/
  public CartaoResponse portador(Integer portador) {
    this.portador = portador;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica qual \u00C3\u00A9 a rela\u00C3\u00A7\u00C3\u00A3o do portador do cart\u00C3\u00A3o com a conta. Quando \u00E2\u0080\u00981\u00E2\u0080\u0099, corresponde ao seu titular. Quando diferente disso, corresponde a um cart\u00C3\u00A3o adicional.")
  @JsonProperty("portador")
  public Integer getPortador() {
    return portador;
  }
  public void setPortador(Integer portador) {
    this.portador = portador;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoResponse cartaoResponse = (CartaoResponse) o;
    return Objects.equals(this.arquivoImpressao, cartaoResponse.arquivoImpressao) &&
        Objects.equals(this.codigoDesbloqueio, cartaoResponse.codigoDesbloqueio) &&
        Objects.equals(this.dataEstagioCartao, cartaoResponse.dataEstagioCartao) &&
        Objects.equals(this.dataGeracao, cartaoResponse.dataGeracao) &&
        Objects.equals(this.dataImpressao, cartaoResponse.dataImpressao) &&
        Objects.equals(this.dataStatusCartao, cartaoResponse.dataStatusCartao) &&
        Objects.equals(this.dataValidade, cartaoResponse.dataValidade) &&
        Objects.equals(this.flagImpressaoOrigemComercial, cartaoResponse.flagImpressaoOrigemComercial) &&
        Objects.equals(this.flagProvisorio, cartaoResponse.flagProvisorio) &&
        Objects.equals(this.id, cartaoResponse.id) &&
        Objects.equals(this.idConta, cartaoResponse.idConta) &&
        Objects.equals(this.idEstagioCartao, cartaoResponse.idEstagioCartao) &&
        Objects.equals(this.idPessoa, cartaoResponse.idPessoa) &&
        Objects.equals(this.idStatusCartao, cartaoResponse.idStatusCartao) &&
        Objects.equals(this.numeroCartao, cartaoResponse.numeroCartao) &&
        Objects.equals(this.portador, cartaoResponse.portador);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arquivoImpressao, codigoDesbloqueio, dataEstagioCartao, dataGeracao, dataImpressao, dataStatusCartao, dataValidade, flagImpressaoOrigemComercial, flagProvisorio, id, idConta, idEstagioCartao, idPessoa, idStatusCartao, numeroCartao, portador);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoResponse {\n");
    
    sb.append("    arquivoImpressao: ").append(toIndentedString(arquivoImpressao)).append("\n");
    sb.append("    codigoDesbloqueio: ").append(toIndentedString(codigoDesbloqueio)).append("\n");
    sb.append("    dataEstagioCartao: ").append(toIndentedString(dataEstagioCartao)).append("\n");
    sb.append("    dataGeracao: ").append(toIndentedString(dataGeracao)).append("\n");
    sb.append("    dataImpressao: ").append(toIndentedString(dataImpressao)).append("\n");
    sb.append("    dataStatusCartao: ").append(toIndentedString(dataStatusCartao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    flagImpressaoOrigemComercial: ").append(toIndentedString(flagImpressaoOrigemComercial)).append("\n");
    sb.append("    flagProvisorio: ").append(toIndentedString(flagProvisorio)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idEstagioCartao: ").append(toIndentedString(idEstagioCartao)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idStatusCartao: ").append(toIndentedString(idStatusCartao)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    portador: ").append(toIndentedString(portador)).append("\n");
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



