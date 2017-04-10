package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





/**
 * Transfer\u00C3\u00AAncia banc\u00C3\u00A1ria
 **/

@ApiModel(description = "Transfer\u00C3\u00AAncia banc\u00C3\u00A1ria")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LinkTransferenciaBancariaResponse   {
  
  private Long nsuorigem = null;
  private Long idAutorizacao = null;
  private Long idTransferencia = null;
  private String codigoAutorizacao = null;
  private Date dataAutorizacao = null;
  private String origem = null;
  private BigDecimal valor = null;
  private Long idOperacao = null;
  private String terminal = null;
  private Long idCartao = null;
  private Date dataCompra = null;
  private BigDecimal valorCompra = null;
  private Integer numeroParcelas = null;
  private BigDecimal valorParcela = null;
  private Long idEstabelecimento = null;
  private Date dataMovimento = null;
  private BigDecimal valorContrato = null;
  private BigDecimal taxaJuros = null;
  private BigDecimal valorIOF = null;
  private BigDecimal valorTAC = null;
  private Long idConta = null;
  private BigDecimal valorEntrada = null;
  private Date dataVencimentoReal = null;
  private String dataVencimentoPadrao = null;
  private Long idContaPortador = null;
  private Long numeroEstabelecimento = null;

  
  /**
   **/
  public LinkTransferenciaBancariaResponse nsuorigem(Long nsuorigem) {
    this.nsuorigem = nsuorigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nsuorigem")
  public Long getNsuorigem() {
    return nsuorigem;
  }
  public void setNsuorigem(Long nsuorigem) {
    this.nsuorigem = nsuorigem;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da autoriza\u00C3\u00A7\u00C3\u00A3o (id)
   **/
  public LinkTransferenciaBancariaResponse idAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da autoriza\u00C3\u00A7\u00C3\u00A3o (id)")
  @JsonProperty("idAutorizacao")
  public Long getIdAutorizacao() {
    return idAutorizacao;
  }
  public void setIdAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia (id)
   **/
  public LinkTransferenciaBancariaResponse idTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia (id)")
  @JsonProperty("idTransferencia")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * C\u00C3\u00B3digo da autoriza\u00C3\u00A7\u00C3\u00A3o
   **/
  public LinkTransferenciaBancariaResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo da autoriza\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * Data da autoriza\u00C3\u00A7\u00C3\u00A3o
   **/
  public LinkTransferenciaBancariaResponse dataAutorizacao(Date dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da autoriza\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("dataAutorizacao")
  public Date getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(Date dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   * Origem
   **/
  public LinkTransferenciaBancariaResponse origem(String origem) {
    this.origem = origem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origem")
  @JsonProperty("origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Valor
   **/
  public LinkTransferenciaBancariaResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de opera\u00C3\u00A7\u00C3\u00A3o (id)
   **/
  public LinkTransferenciaBancariaResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de opera\u00C3\u00A7\u00C3\u00A3o (id)")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Terminal
   **/
  public LinkTransferenciaBancariaResponse terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Terminal")
  @JsonProperty("terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o (id)
   **/
  public LinkTransferenciaBancariaResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o (id)")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Data da transfer\u00C3\u00AAncia
   **/
  public LinkTransferenciaBancariaResponse dataCompra(Date dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da transfer\u00C3\u00AAncia")
  @JsonProperty("dataCompra")
  public Date getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(Date dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia
   **/
  public LinkTransferenciaBancariaResponse valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da transfer\u00C3\u00AAncia")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * N\u00C3\u00BAmero de parcelas
   **/
  public LinkTransferenciaBancariaResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero de parcelas")
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
  public LinkTransferenciaBancariaResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da parcela")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id)
   **/
  public LinkTransferenciaBancariaResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id)")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Data do movimento
   **/
  public LinkTransferenciaBancariaResponse dataMovimento(Date dataMovimento) {
    this.dataMovimento = dataMovimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data do movimento")
  @JsonProperty("dataMovimento")
  public Date getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(Date dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque
   **/
  public LinkTransferenciaBancariaResponse valorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque")
  @JsonProperty("valorContrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Percentual de juros
   **/
  public LinkTransferenciaBancariaResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual de juros")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Valor do IOF
   **/
  public LinkTransferenciaBancariaResponse valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do IOF")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor da TAC
   **/
  public LinkTransferenciaBancariaResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da TAC")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id)
   **/
  public LinkTransferenciaBancariaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Valor da entrada (primeira parcela)
   **/
  public LinkTransferenciaBancariaResponse valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da entrada (primeira parcela)")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Data do vencimento real da fatura
   **/
  public LinkTransferenciaBancariaResponse dataVencimentoReal(Date dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data do vencimento real da fatura")
  @JsonProperty("dataVencimentoReal")
  public Date getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(Date dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Dia do vencimento padr\u00C3\u00A3o da fatura
   **/
  public LinkTransferenciaBancariaResponse dataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dia do vencimento padr\u00C3\u00A3o da fatura")
  @JsonProperty("dataVencimentoPadrao")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta banc\u00C3\u00A1ria de destino (id)
   **/
  public LinkTransferenciaBancariaResponse idContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta banc\u00C3\u00A1ria de destino (id)")
  @JsonProperty("idContaPortador")
  public Long getIdContaPortador() {
    return idContaPortador;
  }
  public void setIdContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
  }

  
  /**
   **/
  public LinkTransferenciaBancariaResponse numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroEstabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTransferenciaBancariaResponse linkTransferenciaBancariaResponse = (LinkTransferenciaBancariaResponse) o;
    return Objects.equals(this.nsuorigem, linkTransferenciaBancariaResponse.nsuorigem) &&
        Objects.equals(this.idAutorizacao, linkTransferenciaBancariaResponse.idAutorizacao) &&
        Objects.equals(this.idTransferencia, linkTransferenciaBancariaResponse.idTransferencia) &&
        Objects.equals(this.codigoAutorizacao, linkTransferenciaBancariaResponse.codigoAutorizacao) &&
        Objects.equals(this.dataAutorizacao, linkTransferenciaBancariaResponse.dataAutorizacao) &&
        Objects.equals(this.origem, linkTransferenciaBancariaResponse.origem) &&
        Objects.equals(this.valor, linkTransferenciaBancariaResponse.valor) &&
        Objects.equals(this.idOperacao, linkTransferenciaBancariaResponse.idOperacao) &&
        Objects.equals(this.terminal, linkTransferenciaBancariaResponse.terminal) &&
        Objects.equals(this.idCartao, linkTransferenciaBancariaResponse.idCartao) &&
        Objects.equals(this.dataCompra, linkTransferenciaBancariaResponse.dataCompra) &&
        Objects.equals(this.valorCompra, linkTransferenciaBancariaResponse.valorCompra) &&
        Objects.equals(this.numeroParcelas, linkTransferenciaBancariaResponse.numeroParcelas) &&
        Objects.equals(this.valorParcela, linkTransferenciaBancariaResponse.valorParcela) &&
        Objects.equals(this.idEstabelecimento, linkTransferenciaBancariaResponse.idEstabelecimento) &&
        Objects.equals(this.dataMovimento, linkTransferenciaBancariaResponse.dataMovimento) &&
        Objects.equals(this.valorContrato, linkTransferenciaBancariaResponse.valorContrato) &&
        Objects.equals(this.taxaJuros, linkTransferenciaBancariaResponse.taxaJuros) &&
        Objects.equals(this.valorIOF, linkTransferenciaBancariaResponse.valorIOF) &&
        Objects.equals(this.valorTAC, linkTransferenciaBancariaResponse.valorTAC) &&
        Objects.equals(this.idConta, linkTransferenciaBancariaResponse.idConta) &&
        Objects.equals(this.valorEntrada, linkTransferenciaBancariaResponse.valorEntrada) &&
        Objects.equals(this.dataVencimentoReal, linkTransferenciaBancariaResponse.dataVencimentoReal) &&
        Objects.equals(this.dataVencimentoPadrao, linkTransferenciaBancariaResponse.dataVencimentoPadrao) &&
        Objects.equals(this.idContaPortador, linkTransferenciaBancariaResponse.idContaPortador) &&
        Objects.equals(this.numeroEstabelecimento, linkTransferenciaBancariaResponse.numeroEstabelecimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuorigem, idAutorizacao, idTransferencia, codigoAutorizacao, dataAutorizacao, origem, valor, idOperacao, terminal, idCartao, dataCompra, valorCompra, numeroParcelas, valorParcela, idEstabelecimento, dataMovimento, valorContrato, taxaJuros, valorIOF, valorTAC, idConta, valorEntrada, dataVencimentoReal, dataVencimentoPadrao, idContaPortador, numeroEstabelecimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTransferenciaBancariaResponse {\n");
    
    sb.append("    nsuorigem: ").append(toIndentedString(nsuorigem)).append("\n");
    sb.append("    idAutorizacao: ").append(toIndentedString(idAutorizacao)).append("\n");
    sb.append("    idTransferencia: ").append(toIndentedString(idTransferencia)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    dataAutorizacao: ").append(toIndentedString(dataAutorizacao)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    dataMovimento: ").append(toIndentedString(dataMovimento)).append("\n");
    sb.append("    valorContrato: ").append(toIndentedString(valorContrato)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    valorEntrada: ").append(toIndentedString(valorEntrada)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    dataVencimentoPadrao: ").append(toIndentedString(dataVencimentoPadrao)).append("\n");
    sb.append("    idContaPortador: ").append(toIndentedString(idContaPortador)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
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



