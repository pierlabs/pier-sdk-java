package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto que representa o response das transa\u00E7\u00F5es negadas
 **/

@ApiModel(description = "Objeto que representa o response das transa\u00E7\u00F5es negadas")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransacaoNegadaResponse   {
  
  private Long id = null;
  private Long idProduto = null;
  private Long idCartao = null;
  private String numeroCartao = null;
  private String codigoProcessamento = null;
  private String codigoProcessamentoDescricao = null;
  private BigDecimal valor = null;
  private Integer parcelas = null;
  private String nomeEstabelecimento = null;
  private String dataHoraEntrada = null;
  private String dataHoraSaida = null;
  private String codigoResposta = null;
  private String respostaAutorizador = null;
  private Long idDescricao = null;
  private String descricaoAplicativo = null;
  private String descricaoTerminal = null;
  private String moedaEstrangeira = null;
  private BigDecimal valorCompraMoedaEstrangeira = null;
  private BigDecimal cotacaoDolar = null;

  
  /**
   * C\u00F3digo identificador da mensagem
   **/
  public TransacaoNegadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da mensagem")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador do produto
   **/
  public TransacaoNegadaResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do produto")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo identificador do cart\u00E3o
   **/
  public TransacaoNegadaResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o mascarado
   **/
  public TransacaoNegadaResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do cart\u00E3o mascarado")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * C\u00F3digo de processamento
   **/
  public TransacaoNegadaResponse codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de processamento")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Descri\u00E7\u00E3o do c\u00F3digo de processamento
   **/
  public TransacaoNegadaResponse codigoProcessamentoDescricao(String codigoProcessamentoDescricao) {
    this.codigoProcessamentoDescricao = codigoProcessamentoDescricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do c\u00F3digo de processamento")
  @JsonProperty("codigoProcessamentoDescricao")
  public String getCodigoProcessamentoDescricao() {
    return codigoProcessamentoDescricao;
  }
  public void setCodigoProcessamentoDescricao(String codigoProcessamentoDescricao) {
    this.codigoProcessamentoDescricao = codigoProcessamentoDescricao;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o
   **/
  public TransacaoNegadaResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da transa\u00E7\u00E3o")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Quantidade de parcelas para parcelamento
   **/
  public TransacaoNegadaResponse parcelas(Integer parcelas) {
    this.parcelas = parcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de parcelas para parcelamento")
  @JsonProperty("parcelas")
  public Integer getParcelas() {
    return parcelas;
  }
  public void setParcelas(Integer parcelas) {
    this.parcelas = parcelas;
  }

  
  /**
   * Nome do estabelecimento onde ocorreu a transa\u00E7\u00E3o
   **/
  public TransacaoNegadaResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do estabelecimento onde ocorreu a transa\u00E7\u00E3o")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Data e hora em que a transa\u00E7\u00E3o entrou no autorizador
   **/
  public TransacaoNegadaResponse dataHoraEntrada(String dataHoraEntrada) {
    this.dataHoraEntrada = dataHoraEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-ddT00:00:00.000Z", value = "Data e hora em que a transa\u00E7\u00E3o entrou no autorizador")
  @JsonProperty("dataHoraEntrada")
  public String getDataHoraEntrada() {
    return dataHoraEntrada;
  }
  public void setDataHoraEntrada(String dataHoraEntrada) {
    this.dataHoraEntrada = dataHoraEntrada;
  }

  
  /**
   * Data e hora em que a transa\u00E7\u00E3o saiu do autorizador
   **/
  public TransacaoNegadaResponse dataHoraSaida(String dataHoraSaida) {
    this.dataHoraSaida = dataHoraSaida;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-ddT00:00:00.000Z", value = "Data e hora em que a transa\u00E7\u00E3o saiu do autorizador")
  @JsonProperty("dataHoraSaida")
  public String getDataHoraSaida() {
    return dataHoraSaida;
  }
  public void setDataHoraSaida(String dataHoraSaida) {
    this.dataHoraSaida = dataHoraSaida;
  }

  
  /**
   * C\u00F3digo da mensagem de resposta
   **/
  public TransacaoNegadaResponse codigoResposta(String codigoResposta) {
    this.codigoResposta = codigoResposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo da mensagem de resposta")
  @JsonProperty("codigoResposta")
  public String getCodigoResposta() {
    return codigoResposta;
  }
  public void setCodigoResposta(String codigoResposta) {
    this.codigoResposta = codigoResposta;
  }

  
  /**
   * Mensagem de resposta do autorizador
   **/
  public TransacaoNegadaResponse respostaAutorizador(String respostaAutorizador) {
    this.respostaAutorizador = respostaAutorizador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mensagem de resposta do autorizador")
  @JsonProperty("respostaAutorizador")
  public String getRespostaAutorizador() {
    return respostaAutorizador;
  }
  public void setRespostaAutorizador(String respostaAutorizador) {
    this.respostaAutorizador = respostaAutorizador;
  }

  
  /**
   * C\u00F3digo da mensagem de transa\u00E7\u00E3o
   **/
  public TransacaoNegadaResponse idDescricao(Long idDescricao) {
    this.idDescricao = idDescricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo da mensagem de transa\u00E7\u00E3o")
  @JsonProperty("idDescricao")
  public Long getIdDescricao() {
    return idDescricao;
  }
  public void setIdDescricao(Long idDescricao) {
    this.idDescricao = idDescricao;
  }

  
  /**
   * Mensagem de transa\u00E7\u00E3o do Aplicativo
   **/
  public TransacaoNegadaResponse descricaoAplicativo(String descricaoAplicativo) {
    this.descricaoAplicativo = descricaoAplicativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mensagem de transa\u00E7\u00E3o do Aplicativo")
  @JsonProperty("descricaoAplicativo")
  public String getDescricaoAplicativo() {
    return descricaoAplicativo;
  }
  public void setDescricaoAplicativo(String descricaoAplicativo) {
    this.descricaoAplicativo = descricaoAplicativo;
  }

  
  /**
   * Mensagem de transa\u00E7\u00E3o do Terminal
   **/
  public TransacaoNegadaResponse descricaoTerminal(String descricaoTerminal) {
    this.descricaoTerminal = descricaoTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mensagem de transa\u00E7\u00E3o do Terminal")
  @JsonProperty("descricaoTerminal")
  public String getDescricaoTerminal() {
    return descricaoTerminal;
  }
  public void setDescricaoTerminal(String descricaoTerminal) {
    this.descricaoTerminal = descricaoTerminal;
  }

  
  /**
   * S\u00EDmbolo da moeda estrangeira
   **/
  public TransacaoNegadaResponse moedaEstrangeira(String moedaEstrangeira) {
    this.moedaEstrangeira = moedaEstrangeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "S\u00EDmbolo da moeda estrangeira")
  @JsonProperty("moedaEstrangeira")
  public String getMoedaEstrangeira() {
    return moedaEstrangeira;
  }
  public void setMoedaEstrangeira(String moedaEstrangeira) {
    this.moedaEstrangeira = moedaEstrangeira;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o em moeda estrangeira
   **/
  public TransacaoNegadaResponse valorCompraMoedaEstrangeira(BigDecimal valorCompraMoedaEstrangeira) {
    this.valorCompraMoedaEstrangeira = valorCompraMoedaEstrangeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da transa\u00E7\u00E3o em moeda estrangeira")
  @JsonProperty("valorCompraMoedaEstrangeira")
  public BigDecimal getValorCompraMoedaEstrangeira() {
    return valorCompraMoedaEstrangeira;
  }
  public void setValorCompraMoedaEstrangeira(BigDecimal valorCompraMoedaEstrangeira) {
    this.valorCompraMoedaEstrangeira = valorCompraMoedaEstrangeira;
  }

  
  /**
   * Valor da cota\u00E7\u00E3o do d\u00F3lar no dia da transa\u00E7ao
   **/
  public TransacaoNegadaResponse cotacaoDolar(BigDecimal cotacaoDolar) {
    this.cotacaoDolar = cotacaoDolar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da cota\u00E7\u00E3o do d\u00F3lar no dia da transa\u00E7ao")
  @JsonProperty("cotacaoDolar")
  public BigDecimal getCotacaoDolar() {
    return cotacaoDolar;
  }
  public void setCotacaoDolar(BigDecimal cotacaoDolar) {
    this.cotacaoDolar = cotacaoDolar;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransacaoNegadaResponse transacaoNegadaResponse = (TransacaoNegadaResponse) o;
    return Objects.equals(this.id, transacaoNegadaResponse.id) &&
        Objects.equals(this.idProduto, transacaoNegadaResponse.idProduto) &&
        Objects.equals(this.idCartao, transacaoNegadaResponse.idCartao) &&
        Objects.equals(this.numeroCartao, transacaoNegadaResponse.numeroCartao) &&
        Objects.equals(this.codigoProcessamento, transacaoNegadaResponse.codigoProcessamento) &&
        Objects.equals(this.codigoProcessamentoDescricao, transacaoNegadaResponse.codigoProcessamentoDescricao) &&
        Objects.equals(this.valor, transacaoNegadaResponse.valor) &&
        Objects.equals(this.parcelas, transacaoNegadaResponse.parcelas) &&
        Objects.equals(this.nomeEstabelecimento, transacaoNegadaResponse.nomeEstabelecimento) &&
        Objects.equals(this.dataHoraEntrada, transacaoNegadaResponse.dataHoraEntrada) &&
        Objects.equals(this.dataHoraSaida, transacaoNegadaResponse.dataHoraSaida) &&
        Objects.equals(this.codigoResposta, transacaoNegadaResponse.codigoResposta) &&
        Objects.equals(this.respostaAutorizador, transacaoNegadaResponse.respostaAutorizador) &&
        Objects.equals(this.idDescricao, transacaoNegadaResponse.idDescricao) &&
        Objects.equals(this.descricaoAplicativo, transacaoNegadaResponse.descricaoAplicativo) &&
        Objects.equals(this.descricaoTerminal, transacaoNegadaResponse.descricaoTerminal) &&
        Objects.equals(this.moedaEstrangeira, transacaoNegadaResponse.moedaEstrangeira) &&
        Objects.equals(this.valorCompraMoedaEstrangeira, transacaoNegadaResponse.valorCompraMoedaEstrangeira) &&
        Objects.equals(this.cotacaoDolar, transacaoNegadaResponse.cotacaoDolar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idProduto, idCartao, numeroCartao, codigoProcessamento, codigoProcessamentoDescricao, valor, parcelas, nomeEstabelecimento, dataHoraEntrada, dataHoraSaida, codigoResposta, respostaAutorizador, idDescricao, descricaoAplicativo, descricaoTerminal, moedaEstrangeira, valorCompraMoedaEstrangeira, cotacaoDolar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoNegadaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    codigoProcessamentoDescricao: ").append(toIndentedString(codigoProcessamentoDescricao)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    parcelas: ").append(toIndentedString(parcelas)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    dataHoraEntrada: ").append(toIndentedString(dataHoraEntrada)).append("\n");
    sb.append("    dataHoraSaida: ").append(toIndentedString(dataHoraSaida)).append("\n");
    sb.append("    codigoResposta: ").append(toIndentedString(codigoResposta)).append("\n");
    sb.append("    respostaAutorizador: ").append(toIndentedString(respostaAutorizador)).append("\n");
    sb.append("    idDescricao: ").append(toIndentedString(idDescricao)).append("\n");
    sb.append("    descricaoAplicativo: ").append(toIndentedString(descricaoAplicativo)).append("\n");
    sb.append("    descricaoTerminal: ").append(toIndentedString(descricaoTerminal)).append("\n");
    sb.append("    moedaEstrangeira: ").append(toIndentedString(moedaEstrangeira)).append("\n");
    sb.append("    valorCompraMoedaEstrangeira: ").append(toIndentedString(valorCompraMoedaEstrangeira)).append("\n");
    sb.append("    cotacaoDolar: ").append(toIndentedString(cotacaoDolar)).append("\n");
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

