package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de requisi\u00E7\u00E3o para cria\u00E7\u00E3o de um novo evento externo de compras
 **/

@ApiModel(description = "Objeto de requisi\u00E7\u00E3o para cria\u00E7\u00E3o de um novo evento externo de compras")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EventoExternoCompraPersist   {
  
  private Long idEstabelecimento = null;
  private Long idConta = null;
  private Long idCartao = null;
  private String dataCompra = null;
  private Long idOperacao = null;
  private Integer numeroParcelas = null;
  private BigDecimal valorParcela = null;
  private BigDecimal valorContrato = null;
  private BigDecimal valorCompra = null;
  private BigDecimal valorEncargosTotais = null;
  private BigDecimal taxaJuros = null;
  private BigDecimal valorIOF = null;
  private BigDecimal valorTAC = null;
  private String origem = null;
  private Integer carencia = null;
  private String nomeEstabelecimento = null;

  
  /**
   * C\u00F3digo do estabelecimento
   **/
  public EventoExternoCompraPersist idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo do estabelecimento")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo da conta
   **/
  public EventoExternoCompraPersist idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo do cart\u00E3o
   **/
  public EventoExternoCompraPersist idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo do cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Data da compra
   **/
  public EventoExternoCompraPersist dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Data da compra")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * C\u00F3digo do tipo de opera\u00E7\u00E3o
   **/
  public EventoExternoCompraPersist idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo do tipo de opera\u00E7\u00E3o")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * N\u00FAmero de parcelas
   **/
  public EventoExternoCompraPersist numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero de parcelas")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Valor da parcela
   **/
  public EventoExternoCompraPersist valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da parcela")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Valor contrato
   **/
  public EventoExternoCompraPersist valorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor contrato")
  @JsonProperty("valorContrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Valor da compra
   **/
  public EventoExternoCompraPersist valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da compra")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Valor dos encargos totais
   **/
  public EventoExternoCompraPersist valorEncargosTotais(BigDecimal valorEncargosTotais) {
    this.valorEncargosTotais = valorEncargosTotais;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor dos encargos totais")
  @JsonProperty("valorEncargosTotais")
  public BigDecimal getValorEncargosTotais() {
    return valorEncargosTotais;
  }
  public void setValorEncargosTotais(BigDecimal valorEncargosTotais) {
    this.valorEncargosTotais = valorEncargosTotais;
  }

  
  /**
   * Valor da taxa de juros
   **/
  public EventoExternoCompraPersist taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da taxa de juros")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Valor IOF
   **/
  public EventoExternoCompraPersist valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor IOF")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor TAC
   **/
  public EventoExternoCompraPersist valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor TAC")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Origem do evento
   **/
  public EventoExternoCompraPersist origem(String origem) {
    this.origem = origem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Origem do evento")
  @JsonProperty("origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Quantidade de meses de carencia
   **/
  public EventoExternoCompraPersist carencia(Integer carencia) {
    this.carencia = carencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de meses de carencia")
  @JsonProperty("carencia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Nome do estabelecimento
   **/
  public EventoExternoCompraPersist nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do estabelecimento")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventoExternoCompraPersist eventoExternoCompraPersist = (EventoExternoCompraPersist) o;
    return Objects.equals(this.idEstabelecimento, eventoExternoCompraPersist.idEstabelecimento) &&
        Objects.equals(this.idConta, eventoExternoCompraPersist.idConta) &&
        Objects.equals(this.idCartao, eventoExternoCompraPersist.idCartao) &&
        Objects.equals(this.dataCompra, eventoExternoCompraPersist.dataCompra) &&
        Objects.equals(this.idOperacao, eventoExternoCompraPersist.idOperacao) &&
        Objects.equals(this.numeroParcelas, eventoExternoCompraPersist.numeroParcelas) &&
        Objects.equals(this.valorParcela, eventoExternoCompraPersist.valorParcela) &&
        Objects.equals(this.valorContrato, eventoExternoCompraPersist.valorContrato) &&
        Objects.equals(this.valorCompra, eventoExternoCompraPersist.valorCompra) &&
        Objects.equals(this.valorEncargosTotais, eventoExternoCompraPersist.valorEncargosTotais) &&
        Objects.equals(this.taxaJuros, eventoExternoCompraPersist.taxaJuros) &&
        Objects.equals(this.valorIOF, eventoExternoCompraPersist.valorIOF) &&
        Objects.equals(this.valorTAC, eventoExternoCompraPersist.valorTAC) &&
        Objects.equals(this.origem, eventoExternoCompraPersist.origem) &&
        Objects.equals(this.carencia, eventoExternoCompraPersist.carencia) &&
        Objects.equals(this.nomeEstabelecimento, eventoExternoCompraPersist.nomeEstabelecimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEstabelecimento, idConta, idCartao, dataCompra, idOperacao, numeroParcelas, valorParcela, valorContrato, valorCompra, valorEncargosTotais, taxaJuros, valorIOF, valorTAC, origem, carencia, nomeEstabelecimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventoExternoCompraPersist {\n");
    
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    valorContrato: ").append(toIndentedString(valorContrato)).append("\n");
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    valorEncargosTotais: ").append(toIndentedString(valorEncargosTotais)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    carencia: ").append(toIndentedString(carencia)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
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

