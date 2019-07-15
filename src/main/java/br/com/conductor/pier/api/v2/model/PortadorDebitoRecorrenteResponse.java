package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o de resposta do d\u00E9bito recorrente do portador
 **/

@ApiModel(description = "Representa\u00E7\u00E3o de resposta do d\u00E9bito recorrente do portador")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PortadorDebitoRecorrenteResponse   {
  
  private String dataFimDescontoAnuidade = null;
  private String dataHoraFim = null;
  private String dataHoraInicio = null;
  private Boolean flagCartaoDesbloqueado = null;
  private Boolean flagLancatarifa = null;
  private Long id = null;
  private Long idAnuidade = null;
  private Long idConta = null;
  private Long idProduto = null;
  private Integer numeroParcela = null;
  private Integer parcelaPerdida = null;
  private BigDecimal percentualDesconto = null;
  private Integer portador = null;
  private BigDecimal valorOriginal = null;
  private BigDecimal valorParcela = null;

  
  /**
   * Data referente ao final do desconto da anuidade
   **/
  public PortadorDebitoRecorrenteResponse dataFimDescontoAnuidade(String dataFimDescontoAnuidade) {
    this.dataFimDescontoAnuidade = dataFimDescontoAnuidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data referente ao final do desconto da anuidade")
  @JsonProperty("dataFimDescontoAnuidade")
  public String getDataFimDescontoAnuidade() {
    return dataFimDescontoAnuidade;
  }
  public void setDataFimDescontoAnuidade(String dataFimDescontoAnuidade) {
    this.dataFimDescontoAnuidade = dataFimDescontoAnuidade;
  }

  
  /**
   * Data e hora do fim da recorr\u00EAncia do d\u00E9bito
   **/
  public PortadorDebitoRecorrenteResponse dataHoraFim(String dataHoraFim) {
    this.dataHoraFim = dataHoraFim;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data e hora do fim da recorr\u00EAncia do d\u00E9bito")
  @JsonProperty("dataHoraFim")
  public String getDataHoraFim() {
    return dataHoraFim;
  }
  public void setDataHoraFim(String dataHoraFim) {
    this.dataHoraFim = dataHoraFim;
  }

  
  /**
   * Data e hora do in\u00EDcio da recorr\u00EAncia do d\u00E9bito
   **/
  public PortadorDebitoRecorrenteResponse dataHoraInicio(String dataHoraInicio) {
    this.dataHoraInicio = dataHoraInicio;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data e hora do in\u00EDcio da recorr\u00EAncia do d\u00E9bito")
  @JsonProperty("dataHoraInicio")
  public String getDataHoraInicio() {
    return dataHoraInicio;
  }
  public void setDataHoraInicio(String dataHoraInicio) {
    this.dataHoraInicio = dataHoraInicio;
  }

  
  /**
   * Flag para identifica\u00E7\u00E3o de cart\u00E3o desbloqueado
   **/
  public PortadorDebitoRecorrenteResponse flagCartaoDesbloqueado(Boolean flagCartaoDesbloqueado) {
    this.flagCartaoDesbloqueado = flagCartaoDesbloqueado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para identifica\u00E7\u00E3o de cart\u00E3o desbloqueado")
  @JsonProperty("flagCartaoDesbloqueado")
  public Boolean getFlagCartaoDesbloqueado() {
    return flagCartaoDesbloqueado;
  }
  public void setFlagCartaoDesbloqueado(Boolean flagCartaoDesbloqueado) {
    this.flagCartaoDesbloqueado = flagCartaoDesbloqueado;
  }

  
  /**
   * Flag para identifica\u00E7\u00E3o de lan\u00E7ametno de tarifa
   **/
  public PortadorDebitoRecorrenteResponse flagLancatarifa(Boolean flagLancatarifa) {
    this.flagLancatarifa = flagLancatarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para identifica\u00E7\u00E3o de lan\u00E7ametno de tarifa")
  @JsonProperty("flagLancatarifa")
  public Boolean getFlagLancatarifa() {
    return flagLancatarifa;
  }
  public void setFlagLancatarifa(Boolean flagLancatarifa) {
    this.flagLancatarifa = flagLancatarifa;
  }

  
  /**
   * C\u00F3digo identificador do registro de d\u00E9bito recorrente do portador (id)
   **/
  public PortadorDebitoRecorrenteResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do registro de d\u00E9bito recorrente do portador (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador da anuidade
   **/
  public PortadorDebitoRecorrenteResponse idAnuidade(Long idAnuidade) {
    this.idAnuidade = idAnuidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da anuidade")
  @JsonProperty("idAnuidade")
  public Long getIdAnuidade() {
    return idAnuidade;
  }
  public void setIdAnuidade(Long idAnuidade) {
    this.idAnuidade = idAnuidade;
  }

  
  /**
   * C\u00F3digo identificador da conta (id)
   **/
  public PortadorDebitoRecorrenteResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da conta (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo identificador do produto
   **/
  public PortadorDebitoRecorrenteResponse idProduto(Long idProduto) {
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
   * N\u00FAmero de parcelas recorrentes
   **/
  public PortadorDebitoRecorrenteResponse numeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de parcelas recorrentes")
  @JsonProperty("numeroParcela")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * N\u00FAmero de parcelas ja pedidas
   **/
  public PortadorDebitoRecorrenteResponse parcelaPerdida(Integer parcelaPerdida) {
    this.parcelaPerdida = parcelaPerdida;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de parcelas ja pedidas")
  @JsonProperty("parcelaPerdida")
  public Integer getParcelaPerdida() {
    return parcelaPerdida;
  }
  public void setParcelaPerdida(Integer parcelaPerdida) {
    this.parcelaPerdida = parcelaPerdida;
  }

  
  /**
   * Percentual de desconto de cada parcela
   **/
  public PortadorDebitoRecorrenteResponse percentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual de desconto de cada parcela")
  @JsonProperty("percentualDesconto")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * N\u00FAmero referente ao portador
   **/
  public PortadorDebitoRecorrenteResponse portador(Integer portador) {
    this.portador = portador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero referente ao portador")
  @JsonProperty("portador")
  public Integer getPortador() {
    return portador;
  }
  public void setPortador(Integer portador) {
    this.portador = portador;
  }

  
  /**
   * Valor total sem aplica\u00E7\u00E3o da porcentagem de desconto
   **/
  public PortadorDebitoRecorrenteResponse valorOriginal(BigDecimal valorOriginal) {
    this.valorOriginal = valorOriginal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total sem aplica\u00E7\u00E3o da porcentagem de desconto")
  @JsonProperty("valorOriginal")
  public BigDecimal getValorOriginal() {
    return valorOriginal;
  }
  public void setValorOriginal(BigDecimal valorOriginal) {
    this.valorOriginal = valorOriginal;
  }

  
  /**
   * Valor da parcela com aplica\u00E7\u00E3o da porcentagem de desconto
   **/
  public PortadorDebitoRecorrenteResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da parcela com aplica\u00E7\u00E3o da porcentagem de desconto")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortadorDebitoRecorrenteResponse portadorDebitoRecorrenteResponse = (PortadorDebitoRecorrenteResponse) o;
    return Objects.equals(this.dataFimDescontoAnuidade, portadorDebitoRecorrenteResponse.dataFimDescontoAnuidade) &&
        Objects.equals(this.dataHoraFim, portadorDebitoRecorrenteResponse.dataHoraFim) &&
        Objects.equals(this.dataHoraInicio, portadorDebitoRecorrenteResponse.dataHoraInicio) &&
        Objects.equals(this.flagCartaoDesbloqueado, portadorDebitoRecorrenteResponse.flagCartaoDesbloqueado) &&
        Objects.equals(this.flagLancatarifa, portadorDebitoRecorrenteResponse.flagLancatarifa) &&
        Objects.equals(this.id, portadorDebitoRecorrenteResponse.id) &&
        Objects.equals(this.idAnuidade, portadorDebitoRecorrenteResponse.idAnuidade) &&
        Objects.equals(this.idConta, portadorDebitoRecorrenteResponse.idConta) &&
        Objects.equals(this.idProduto, portadorDebitoRecorrenteResponse.idProduto) &&
        Objects.equals(this.numeroParcela, portadorDebitoRecorrenteResponse.numeroParcela) &&
        Objects.equals(this.parcelaPerdida, portadorDebitoRecorrenteResponse.parcelaPerdida) &&
        Objects.equals(this.percentualDesconto, portadorDebitoRecorrenteResponse.percentualDesconto) &&
        Objects.equals(this.portador, portadorDebitoRecorrenteResponse.portador) &&
        Objects.equals(this.valorOriginal, portadorDebitoRecorrenteResponse.valorOriginal) &&
        Objects.equals(this.valorParcela, portadorDebitoRecorrenteResponse.valorParcela);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataFimDescontoAnuidade, dataHoraFim, dataHoraInicio, flagCartaoDesbloqueado, flagLancatarifa, id, idAnuidade, idConta, idProduto, numeroParcela, parcelaPerdida, percentualDesconto, portador, valorOriginal, valorParcela);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortadorDebitoRecorrenteResponse {\n");
    
    sb.append("    dataFimDescontoAnuidade: ").append(toIndentedString(dataFimDescontoAnuidade)).append("\n");
    sb.append("    dataHoraFim: ").append(toIndentedString(dataHoraFim)).append("\n");
    sb.append("    dataHoraInicio: ").append(toIndentedString(dataHoraInicio)).append("\n");
    sb.append("    flagCartaoDesbloqueado: ").append(toIndentedString(flagCartaoDesbloqueado)).append("\n");
    sb.append("    flagLancatarifa: ").append(toIndentedString(flagLancatarifa)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idAnuidade: ").append(toIndentedString(idAnuidade)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    numeroParcela: ").append(toIndentedString(numeroParcela)).append("\n");
    sb.append("    parcelaPerdida: ").append(toIndentedString(parcelaPerdida)).append("\n");
    sb.append("    percentualDesconto: ").append(toIndentedString(percentualDesconto)).append("\n");
    sb.append("    portador: ").append(toIndentedString(portador)).append("\n");
    sb.append("    valorOriginal: ").append(toIndentedString(valorOriginal)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
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

