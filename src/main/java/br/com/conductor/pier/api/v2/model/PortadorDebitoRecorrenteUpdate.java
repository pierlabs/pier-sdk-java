package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o da atualiza\u00E7\u00E3o do d\u00E9bito recorrente do portador
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da atualiza\u00E7\u00E3o do d\u00E9bito recorrente do portador")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PortadorDebitoRecorrenteUpdate   {
  
  private Integer portador = null;
  private Long idProduto = null;
  private Long idAnuidade = null;
  private String dataHoraInicio = null;
  private String dataHoraFim = null;
  private Integer numeroParcela = null;
  private Integer parcelaPerdida = null;
  private BigDecimal valorParcela = null;
  private BigDecimal valorOriginal = null;
  private BigDecimal percentualDesconto = null;
  private Boolean flagCartaoDesbloqueado = null;
  private Boolean flagLancatarifa = null;
  private String dataFimDescontoAnuidade = null;

  
  /**
   * N\u00FAmero referente ao portador
   **/
  public PortadorDebitoRecorrenteUpdate portador(Integer portador) {
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
   * C\u00F3digo identificador do produto
   **/
  public PortadorDebitoRecorrenteUpdate idProduto(Long idProduto) {
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
   * C\u00F3digo identificador da anuidade inv\u00E1lido
   **/
  public PortadorDebitoRecorrenteUpdate idAnuidade(Long idAnuidade) {
    this.idAnuidade = idAnuidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da anuidade inv\u00E1lido")
  @JsonProperty("idAnuidade")
  public Long getIdAnuidade() {
    return idAnuidade;
  }
  public void setIdAnuidade(Long idAnuidade) {
    this.idAnuidade = idAnuidade;
  }

  
  /**
   * Data e hora do in\u00EDcio da recorr\u00EAncia do d\u00E9bito
   **/
  public PortadorDebitoRecorrenteUpdate dataHoraInicio(String dataHoraInicio) {
    this.dataHoraInicio = dataHoraInicio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora do in\u00EDcio da recorr\u00EAncia do d\u00E9bito")
  @JsonProperty("dataHoraInicio")
  public String getDataHoraInicio() {
    return dataHoraInicio;
  }
  public void setDataHoraInicio(String dataHoraInicio) {
    this.dataHoraInicio = dataHoraInicio;
  }

  
  /**
   * Data e hora do fim da recorr\u00EAncia do d\u00E9bito
   **/
  public PortadorDebitoRecorrenteUpdate dataHoraFim(String dataHoraFim) {
    this.dataHoraFim = dataHoraFim;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora do fim da recorr\u00EAncia do d\u00E9bito")
  @JsonProperty("dataHoraFim")
  public String getDataHoraFim() {
    return dataHoraFim;
  }
  public void setDataHoraFim(String dataHoraFim) {
    this.dataHoraFim = dataHoraFim;
  }

  
  /**
   * N\u00FAmero de parcelas recorrentes
   **/
  public PortadorDebitoRecorrenteUpdate numeroParcela(Integer numeroParcela) {
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
   * N\u00FAmero de parcelas j\u00E1 pedidas
   **/
  public PortadorDebitoRecorrenteUpdate parcelaPerdida(Integer parcelaPerdida) {
    this.parcelaPerdida = parcelaPerdida;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de parcelas j\u00E1 pedidas")
  @JsonProperty("parcelaPerdida")
  public Integer getParcelaPerdida() {
    return parcelaPerdida;
  }
  public void setParcelaPerdida(Integer parcelaPerdida) {
    this.parcelaPerdida = parcelaPerdida;
  }

  
  /**
   * Valor da parcela com aplica\u00E7\u00E3o da parcela de desconto
   **/
  public PortadorDebitoRecorrenteUpdate valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da parcela com aplica\u00E7\u00E3o da parcela de desconto")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Valor total sem a aplica\u00E7\u00E3o da porcentagem de desconto
   **/
  public PortadorDebitoRecorrenteUpdate valorOriginal(BigDecimal valorOriginal) {
    this.valorOriginal = valorOriginal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total sem a aplica\u00E7\u00E3o da porcentagem de desconto")
  @JsonProperty("valorOriginal")
  public BigDecimal getValorOriginal() {
    return valorOriginal;
  }
  public void setValorOriginal(BigDecimal valorOriginal) {
    this.valorOriginal = valorOriginal;
  }

  
  /**
   * Percentual de desconto de cada parcela
   **/
  public PortadorDebitoRecorrenteUpdate percentualDesconto(BigDecimal percentualDesconto) {
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
   * Falg para identifica\u00E7\u00E3o de cart\u00E3o desbloqueado
   **/
  public PortadorDebitoRecorrenteUpdate flagCartaoDesbloqueado(Boolean flagCartaoDesbloqueado) {
    this.flagCartaoDesbloqueado = flagCartaoDesbloqueado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Falg para identifica\u00E7\u00E3o de cart\u00E3o desbloqueado")
  @JsonProperty("flagCartaoDesbloqueado")
  public Boolean getFlagCartaoDesbloqueado() {
    return flagCartaoDesbloqueado;
  }
  public void setFlagCartaoDesbloqueado(Boolean flagCartaoDesbloqueado) {
    this.flagCartaoDesbloqueado = flagCartaoDesbloqueado;
  }

  
  /**
   * Falg para identifica\u00E7\u00E3o de lan\u00E7amento de tarifa
   **/
  public PortadorDebitoRecorrenteUpdate flagLancatarifa(Boolean flagLancatarifa) {
    this.flagLancatarifa = flagLancatarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Falg para identifica\u00E7\u00E3o de lan\u00E7amento de tarifa")
  @JsonProperty("flagLancatarifa")
  public Boolean getFlagLancatarifa() {
    return flagLancatarifa;
  }
  public void setFlagLancatarifa(Boolean flagLancatarifa) {
    this.flagLancatarifa = flagLancatarifa;
  }

  
  /**
   * Data referente ao final do desconto da anuidade
   **/
  public PortadorDebitoRecorrenteUpdate dataFimDescontoAnuidade(String dataFimDescontoAnuidade) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortadorDebitoRecorrenteUpdate portadorDebitoRecorrenteUpdate = (PortadorDebitoRecorrenteUpdate) o;
    return Objects.equals(this.portador, portadorDebitoRecorrenteUpdate.portador) &&
        Objects.equals(this.idProduto, portadorDebitoRecorrenteUpdate.idProduto) &&
        Objects.equals(this.idAnuidade, portadorDebitoRecorrenteUpdate.idAnuidade) &&
        Objects.equals(this.dataHoraInicio, portadorDebitoRecorrenteUpdate.dataHoraInicio) &&
        Objects.equals(this.dataHoraFim, portadorDebitoRecorrenteUpdate.dataHoraFim) &&
        Objects.equals(this.numeroParcela, portadorDebitoRecorrenteUpdate.numeroParcela) &&
        Objects.equals(this.parcelaPerdida, portadorDebitoRecorrenteUpdate.parcelaPerdida) &&
        Objects.equals(this.valorParcela, portadorDebitoRecorrenteUpdate.valorParcela) &&
        Objects.equals(this.valorOriginal, portadorDebitoRecorrenteUpdate.valorOriginal) &&
        Objects.equals(this.percentualDesconto, portadorDebitoRecorrenteUpdate.percentualDesconto) &&
        Objects.equals(this.flagCartaoDesbloqueado, portadorDebitoRecorrenteUpdate.flagCartaoDesbloqueado) &&
        Objects.equals(this.flagLancatarifa, portadorDebitoRecorrenteUpdate.flagLancatarifa) &&
        Objects.equals(this.dataFimDescontoAnuidade, portadorDebitoRecorrenteUpdate.dataFimDescontoAnuidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portador, idProduto, idAnuidade, dataHoraInicio, dataHoraFim, numeroParcela, parcelaPerdida, valorParcela, valorOriginal, percentualDesconto, flagCartaoDesbloqueado, flagLancatarifa, dataFimDescontoAnuidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortadorDebitoRecorrenteUpdate {\n");
    
    sb.append("    portador: ").append(toIndentedString(portador)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idAnuidade: ").append(toIndentedString(idAnuidade)).append("\n");
    sb.append("    dataHoraInicio: ").append(toIndentedString(dataHoraInicio)).append("\n");
    sb.append("    dataHoraFim: ").append(toIndentedString(dataHoraFim)).append("\n");
    sb.append("    numeroParcela: ").append(toIndentedString(numeroParcela)).append("\n");
    sb.append("    parcelaPerdida: ").append(toIndentedString(parcelaPerdida)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    valorOriginal: ").append(toIndentedString(valorOriginal)).append("\n");
    sb.append("    percentualDesconto: ").append(toIndentedString(percentualDesconto)).append("\n");
    sb.append("    flagCartaoDesbloqueado: ").append(toIndentedString(flagCartaoDesbloqueado)).append("\n");
    sb.append("    flagLancatarifa: ").append(toIndentedString(flagLancatarifa)).append("\n");
    sb.append("    dataFimDescontoAnuidade: ").append(toIndentedString(dataFimDescontoAnuidade)).append("\n");
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

