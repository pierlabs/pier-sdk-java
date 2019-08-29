package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o da entidade de persist\u00EAncia para um novo acordo. 
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da entidade de persist\u00EAncia para um novo acordo. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AcordoPersist   {
  
  private Long idConta = null;
  private Long idEscritorioCobranca = null;
  private BigDecimal valorLiquido = null;
  private BigDecimal valorEntrada = null;
  private BigDecimal valorParcelaUm = null;
  private BigDecimal valorParcelas = null;
  private BigDecimal saldoDevedorCreliq = null;
  private BigDecimal saldoDevedorCorrigido = null;
  private Integer quantidadeParcelas = null;
  private BigDecimal percentualCorrecao = null;
  private BigDecimal percentualDesconto = null;
  private BigDecimal valorDesconto = null;
  private Integer diasAtraso = null;
  private String dataVencimentoEntrada = null;
  private String responsavel = null;
  private Boolean isComIOF = null;
  private String nossoNumero = null;
  private BigDecimal valorIOF = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta (ID).
   **/
  public AcordoPersist idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da Conta (ID).")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identifica\u00E7\u00E3o do escrit\u00F3rio de cobran\u00E7a.
   **/
  public AcordoPersist idEscritorioCobranca(Long idEscritorioCobranca) {
    this.idEscritorioCobranca = idEscritorioCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica\u00E7\u00E3o do escrit\u00F3rio de cobran\u00E7a.")
  @JsonProperty("idEscritorioCobranca")
  public Long getIdEscritorioCobranca() {
    return idEscritorioCobranca;
  }
  public void setIdEscritorioCobranca(Long idEscritorioCobranca) {
    this.idEscritorioCobranca = idEscritorioCobranca;
  }

  
  /**
   * Valor liquido do acordo.
   **/
  public AcordoPersist valorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor liquido do acordo.")
  @JsonProperty("valorLiquido")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   * Valor da parcela de entrada do acordo.
   **/
  public AcordoPersist valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da parcela de entrada do acordo.")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Valor da primeira parcela do acordo.
   **/
  public AcordoPersist valorParcelaUm(BigDecimal valorParcelaUm) {
    this.valorParcelaUm = valorParcelaUm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da primeira parcela do acordo.")
  @JsonProperty("valorParcelaUm")
  public BigDecimal getValorParcelaUm() {
    return valorParcelaUm;
  }
  public void setValorParcelaUm(BigDecimal valorParcelaUm) {
    this.valorParcelaUm = valorParcelaUm;
  }

  
  /**
   * Valor das demais parcelas do acordo.
   **/
  public AcordoPersist valorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor das demais parcelas do acordo.")
  @JsonProperty("valorParcelas")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * Saldo devedor CRELIQ.
   **/
  public AcordoPersist saldoDevedorCreliq(BigDecimal saldoDevedorCreliq) {
    this.saldoDevedorCreliq = saldoDevedorCreliq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo devedor CRELIQ.")
  @JsonProperty("saldoDevedorCreliq")
  public BigDecimal getSaldoDevedorCreliq() {
    return saldoDevedorCreliq;
  }
  public void setSaldoDevedorCreliq(BigDecimal saldoDevedorCreliq) {
    this.saldoDevedorCreliq = saldoDevedorCreliq;
  }

  
  /**
   * Saldo devedor corrigido.
   **/
  public AcordoPersist saldoDevedorCorrigido(BigDecimal saldoDevedorCorrigido) {
    this.saldoDevedorCorrigido = saldoDevedorCorrigido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo devedor corrigido.")
  @JsonProperty("saldoDevedorCorrigido")
  public BigDecimal getSaldoDevedorCorrigido() {
    return saldoDevedorCorrigido;
  }
  public void setSaldoDevedorCorrigido(BigDecimal saldoDevedorCorrigido) {
    this.saldoDevedorCorrigido = saldoDevedorCorrigido;
  }

  
  /**
   * Quantidade de parcelas do acordo.
   **/
  public AcordoPersist quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de parcelas do acordo.")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Percentual de corre\u00E7\u00E3o da div\u00EDda.
   **/
  public AcordoPersist percentualCorrecao(BigDecimal percentualCorrecao) {
    this.percentualCorrecao = percentualCorrecao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual de corre\u00E7\u00E3o da div\u00EDda.")
  @JsonProperty("percentualCorrecao")
  public BigDecimal getPercentualCorrecao() {
    return percentualCorrecao;
  }
  public void setPercentualCorrecao(BigDecimal percentualCorrecao) {
    this.percentualCorrecao = percentualCorrecao;
  }

  
  /**
   * Percentual de desconto aplicado.
   **/
  public AcordoPersist percentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual de desconto aplicado.")
  @JsonProperty("percentualDesconto")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * Valor do desconto aplicado.
   **/
  public AcordoPersist valorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do desconto aplicado.")
  @JsonProperty("valorDesconto")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * Total de dias em atraso.
   **/
  public AcordoPersist diasAtraso(Integer diasAtraso) {
    this.diasAtraso = diasAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total de dias em atraso.")
  @JsonProperty("diasAtraso")
  public Integer getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Integer diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  
  /**
   * Data de vencimento da parcela de entrada.
   **/
  public AcordoPersist dataVencimentoEntrada(String dataVencimentoEntrada) {
    this.dataVencimentoEntrada = dataVencimentoEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento da parcela de entrada.")
  @JsonProperty("dataVencimentoEntrada")
  public String getDataVencimentoEntrada() {
    return dataVencimentoEntrada;
  }
  public void setDataVencimentoEntrada(String dataVencimentoEntrada) {
    this.dataVencimentoEntrada = dataVencimentoEntrada;
  }

  
  /**
   * Nome do respons\u00E1vel por inputar o acordo.
   **/
  public AcordoPersist responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do respons\u00E1vel por inputar o acordo.")
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Flag indicativa para lan\u00E7amento do IOF no momento da cria\u00E7\u00E3o do acordo
   **/
  public AcordoPersist isComIOF(Boolean isComIOF) {
    this.isComIOF = isComIOF;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicativa para lan\u00E7amento do IOF no momento da cria\u00E7\u00E3o do acordo")
  @JsonProperty("isComIOF")
  public Boolean getIsComIOF() {
    return isComIOF;
  }
  public void setIsComIOF(Boolean isComIOF) {
    this.isComIOF = isComIOF;
  }

  
  /**
   * N\u00FAmero do boleto caso ele j\u00E1 tenha sido gerado antes do acordo.
   **/
  public AcordoPersist nossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do boleto caso ele j\u00E1 tenha sido gerado antes do acordo.")
  @JsonProperty("nossoNumero")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * Valor do IOF
   **/
  public AcordoPersist valorIOF(BigDecimal valorIOF) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcordoPersist acordoPersist = (AcordoPersist) o;
    return Objects.equals(this.idConta, acordoPersist.idConta) &&
        Objects.equals(this.idEscritorioCobranca, acordoPersist.idEscritorioCobranca) &&
        Objects.equals(this.valorLiquido, acordoPersist.valorLiquido) &&
        Objects.equals(this.valorEntrada, acordoPersist.valorEntrada) &&
        Objects.equals(this.valorParcelaUm, acordoPersist.valorParcelaUm) &&
        Objects.equals(this.valorParcelas, acordoPersist.valorParcelas) &&
        Objects.equals(this.saldoDevedorCreliq, acordoPersist.saldoDevedorCreliq) &&
        Objects.equals(this.saldoDevedorCorrigido, acordoPersist.saldoDevedorCorrigido) &&
        Objects.equals(this.quantidadeParcelas, acordoPersist.quantidadeParcelas) &&
        Objects.equals(this.percentualCorrecao, acordoPersist.percentualCorrecao) &&
        Objects.equals(this.percentualDesconto, acordoPersist.percentualDesconto) &&
        Objects.equals(this.valorDesconto, acordoPersist.valorDesconto) &&
        Objects.equals(this.diasAtraso, acordoPersist.diasAtraso) &&
        Objects.equals(this.dataVencimentoEntrada, acordoPersist.dataVencimentoEntrada) &&
        Objects.equals(this.responsavel, acordoPersist.responsavel) &&
        Objects.equals(this.isComIOF, acordoPersist.isComIOF) &&
        Objects.equals(this.nossoNumero, acordoPersist.nossoNumero) &&
        Objects.equals(this.valorIOF, acordoPersist.valorIOF);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idEscritorioCobranca, valorLiquido, valorEntrada, valorParcelaUm, valorParcelas, saldoDevedorCreliq, saldoDevedorCorrigido, quantidadeParcelas, percentualCorrecao, percentualDesconto, valorDesconto, diasAtraso, dataVencimentoEntrada, responsavel, isComIOF, nossoNumero, valorIOF);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoPersist {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idEscritorioCobranca: ").append(toIndentedString(idEscritorioCobranca)).append("\n");
    sb.append("    valorLiquido: ").append(toIndentedString(valorLiquido)).append("\n");
    sb.append("    valorEntrada: ").append(toIndentedString(valorEntrada)).append("\n");
    sb.append("    valorParcelaUm: ").append(toIndentedString(valorParcelaUm)).append("\n");
    sb.append("    valorParcelas: ").append(toIndentedString(valorParcelas)).append("\n");
    sb.append("    saldoDevedorCreliq: ").append(toIndentedString(saldoDevedorCreliq)).append("\n");
    sb.append("    saldoDevedorCorrigido: ").append(toIndentedString(saldoDevedorCorrigido)).append("\n");
    sb.append("    quantidadeParcelas: ").append(toIndentedString(quantidadeParcelas)).append("\n");
    sb.append("    percentualCorrecao: ").append(toIndentedString(percentualCorrecao)).append("\n");
    sb.append("    percentualDesconto: ").append(toIndentedString(percentualDesconto)).append("\n");
    sb.append("    valorDesconto: ").append(toIndentedString(valorDesconto)).append("\n");
    sb.append("    diasAtraso: ").append(toIndentedString(diasAtraso)).append("\n");
    sb.append("    dataVencimentoEntrada: ").append(toIndentedString(dataVencimentoEntrada)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("    isComIOF: ").append(toIndentedString(isComIOF)).append("\n");
    sb.append("    nossoNumero: ").append(toIndentedString(nossoNumero)).append("\n");
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
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

