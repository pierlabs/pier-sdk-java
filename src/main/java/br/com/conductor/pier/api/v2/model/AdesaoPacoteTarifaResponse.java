package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.PacoteTarifaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o do recurso Ades\u00E3o Pacote Tarifa
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do recurso Ades\u00E3o Pacote Tarifa")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdesaoPacoteTarifaResponse   {
  
  private Integer aplicacaoUtilizado = null;
  private Integer bilheteUnicoUtilizado = null;
  private Integer boletoUtilizado = null;
  private Integer ciclo = null;
  private Boolean cobraTarifa = null;
  private String dataFimCiclo = null;
  private String dataHoraAtivacao = null;
  private String dataHoraDesativacao = null;
  private Long id = null;
  private Long idConta = null;
  private PacoteTarifaResponse pacoteTarifa = null;
  private Integer pagamentoContaUtilizado = null;
  private Integer recargaCelularUtilizado = null;
  private Integer saqueUtilizado = null;
  private Boolean tarifaManutencaoCobrada = null;
  private Integer transferenciaUtilizado = null;

  
  /**
   * Aplica\u00E7\u00E3o utilizado
   **/
  public AdesaoPacoteTarifaResponse aplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aplica\u00E7\u00E3o utilizado")
  @JsonProperty("aplicacaoUtilizado")
  public Integer getAplicacaoUtilizado() {
    return aplicacaoUtilizado;
  }
  public void setAplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
  }

  
  /**
   * Bilhete \u00FAnico utilizado
   **/
  public AdesaoPacoteTarifaResponse bilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bilhete \u00FAnico utilizado")
  @JsonProperty("bilheteUnicoUtilizado")
  public Integer getBilheteUnicoUtilizado() {
    return bilheteUnicoUtilizado;
  }
  public void setBilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
  }

  
  /**
   * Boleto utilizado
   **/
  public AdesaoPacoteTarifaResponse boletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boleto utilizado")
  @JsonProperty("boletoUtilizado")
  public Integer getBoletoUtilizado() {
    return boletoUtilizado;
  }
  public void setBoletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
  }

  
  /**
   * Ciclo da ades\u00E3o
   **/
  public AdesaoPacoteTarifaResponse ciclo(Integer ciclo) {
    this.ciclo = ciclo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ciclo da ades\u00E3o")
  @JsonProperty("ciclo")
  public Integer getCiclo() {
    return ciclo;
  }
  public void setCiclo(Integer ciclo) {
    this.ciclo = ciclo;
  }

  
  /**
   * Tarifa cobrada
   **/
  public AdesaoPacoteTarifaResponse cobraTarifa(Boolean cobraTarifa) {
    this.cobraTarifa = cobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Tarifa cobrada")
  @JsonProperty("cobraTarifa")
  public Boolean getCobraTarifa() {
    return cobraTarifa;
  }
  public void setCobraTarifa(Boolean cobraTarifa) {
    this.cobraTarifa = cobraTarifa;
  }

  
  /**
   * Data fim do ciclo
   **/
  public AdesaoPacoteTarifaResponse dataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data fim do ciclo")
  @JsonProperty("dataFimCiclo")
  public String getDataFimCiclo() {
    return dataFimCiclo;
  }
  public void setDataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
  }

  
  /**
   * Data da ativa\u00E7\u00E3o
   **/
  public AdesaoPacoteTarifaResponse dataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da ativa\u00E7\u00E3o")
  @JsonProperty("dataHoraAtivacao")
  public String getDataHoraAtivacao() {
    return dataHoraAtivacao;
  }
  public void setDataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
  }

  
  /**
   * Data da desativa\u00E7\u00E3o
   **/
  public AdesaoPacoteTarifaResponse dataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da desativa\u00E7\u00E3o")
  @JsonProperty("dataHoraDesativacao")
  public String getDataHoraDesativacao() {
    return dataHoraDesativacao;
  }
  public void setDataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
  }

  
  /**
   * Id da ades\u00E3o
   **/
  public AdesaoPacoteTarifaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id da ades\u00E3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id da conta
   **/
  public AdesaoPacoteTarifaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Pacote de tarifa
   **/
  public AdesaoPacoteTarifaResponse pacoteTarifa(PacoteTarifaResponse pacoteTarifa) {
    this.pacoteTarifa = pacoteTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pacote de tarifa")
  @JsonProperty("pacoteTarifa")
  public PacoteTarifaResponse getPacoteTarifa() {
    return pacoteTarifa;
  }
  public void setPacoteTarifa(PacoteTarifaResponse pacoteTarifa) {
    this.pacoteTarifa = pacoteTarifa;
  }

  
  /**
   * Pagamento de conta utilizado
   **/
  public AdesaoPacoteTarifaResponse pagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pagamento de conta utilizado")
  @JsonProperty("pagamentoContaUtilizado")
  public Integer getPagamentoContaUtilizado() {
    return pagamentoContaUtilizado;
  }
  public void setPagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
  }

  
  /**
   * Recarga de celular utilizado
   **/
  public AdesaoPacoteTarifaResponse recargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Recarga de celular utilizado")
  @JsonProperty("recargaCelularUtilizado")
  public Integer getRecargaCelularUtilizado() {
    return recargaCelularUtilizado;
  }
  public void setRecargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
  }

  
  /**
   * Saque utilizado
   **/
  public AdesaoPacoteTarifaResponse saqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saque utilizado")
  @JsonProperty("saqueUtilizado")
  public Integer getSaqueUtilizado() {
    return saqueUtilizado;
  }
  public void setSaqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
  }

  
  /**
   * Tarifa manuten\u00E7\u00E3o cobrada
   **/
  public AdesaoPacoteTarifaResponse tarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Tarifa manuten\u00E7\u00E3o cobrada")
  @JsonProperty("tarifaManutencaoCobrada")
  public Boolean getTarifaManutencaoCobrada() {
    return tarifaManutencaoCobrada;
  }
  public void setTarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
  }

  
  /**
   * Transfer\u00EAncia utilizado
   **/
  public AdesaoPacoteTarifaResponse transferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transfer\u00EAncia utilizado")
  @JsonProperty("transferenciaUtilizado")
  public Integer getTransferenciaUtilizado() {
    return transferenciaUtilizado;
  }
  public void setTransferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdesaoPacoteTarifaResponse adesaoPacoteTarifaResponse = (AdesaoPacoteTarifaResponse) o;
    return Objects.equals(this.aplicacaoUtilizado, adesaoPacoteTarifaResponse.aplicacaoUtilizado) &&
        Objects.equals(this.bilheteUnicoUtilizado, adesaoPacoteTarifaResponse.bilheteUnicoUtilizado) &&
        Objects.equals(this.boletoUtilizado, adesaoPacoteTarifaResponse.boletoUtilizado) &&
        Objects.equals(this.ciclo, adesaoPacoteTarifaResponse.ciclo) &&
        Objects.equals(this.cobraTarifa, adesaoPacoteTarifaResponse.cobraTarifa) &&
        Objects.equals(this.dataFimCiclo, adesaoPacoteTarifaResponse.dataFimCiclo) &&
        Objects.equals(this.dataHoraAtivacao, adesaoPacoteTarifaResponse.dataHoraAtivacao) &&
        Objects.equals(this.dataHoraDesativacao, adesaoPacoteTarifaResponse.dataHoraDesativacao) &&
        Objects.equals(this.id, adesaoPacoteTarifaResponse.id) &&
        Objects.equals(this.idConta, adesaoPacoteTarifaResponse.idConta) &&
        Objects.equals(this.pacoteTarifa, adesaoPacoteTarifaResponse.pacoteTarifa) &&
        Objects.equals(this.pagamentoContaUtilizado, adesaoPacoteTarifaResponse.pagamentoContaUtilizado) &&
        Objects.equals(this.recargaCelularUtilizado, adesaoPacoteTarifaResponse.recargaCelularUtilizado) &&
        Objects.equals(this.saqueUtilizado, adesaoPacoteTarifaResponse.saqueUtilizado) &&
        Objects.equals(this.tarifaManutencaoCobrada, adesaoPacoteTarifaResponse.tarifaManutencaoCobrada) &&
        Objects.equals(this.transferenciaUtilizado, adesaoPacoteTarifaResponse.transferenciaUtilizado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aplicacaoUtilizado, bilheteUnicoUtilizado, boletoUtilizado, ciclo, cobraTarifa, dataFimCiclo, dataHoraAtivacao, dataHoraDesativacao, id, idConta, pacoteTarifa, pagamentoContaUtilizado, recargaCelularUtilizado, saqueUtilizado, tarifaManutencaoCobrada, transferenciaUtilizado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoPacoteTarifaResponse {\n");
    
    sb.append("    aplicacaoUtilizado: ").append(toIndentedString(aplicacaoUtilizado)).append("\n");
    sb.append("    bilheteUnicoUtilizado: ").append(toIndentedString(bilheteUnicoUtilizado)).append("\n");
    sb.append("    boletoUtilizado: ").append(toIndentedString(boletoUtilizado)).append("\n");
    sb.append("    ciclo: ").append(toIndentedString(ciclo)).append("\n");
    sb.append("    cobraTarifa: ").append(toIndentedString(cobraTarifa)).append("\n");
    sb.append("    dataFimCiclo: ").append(toIndentedString(dataFimCiclo)).append("\n");
    sb.append("    dataHoraAtivacao: ").append(toIndentedString(dataHoraAtivacao)).append("\n");
    sb.append("    dataHoraDesativacao: ").append(toIndentedString(dataHoraDesativacao)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    pacoteTarifa: ").append(toIndentedString(pacoteTarifa)).append("\n");
    sb.append("    pagamentoContaUtilizado: ").append(toIndentedString(pagamentoContaUtilizado)).append("\n");
    sb.append("    recargaCelularUtilizado: ").append(toIndentedString(recargaCelularUtilizado)).append("\n");
    sb.append("    saqueUtilizado: ").append(toIndentedString(saqueUtilizado)).append("\n");
    sb.append("    tarifaManutencaoCobrada: ").append(toIndentedString(tarifaManutencaoCobrada)).append("\n");
    sb.append("    transferenciaUtilizado: ").append(toIndentedString(transferenciaUtilizado)).append("\n");
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

