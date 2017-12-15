package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ParcelamentoTransferenciaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Parcelamento para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias
 **/

@ApiModel(description = "Parcelamento para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoTransferenciaResponse   {
  
  private Long codigoEspecial = null;
  private String vencimentoPrimeiraParcela = null;
  private Integer flagJuros = null;
  private Integer numeroMesesCarencia = null;
  private List<ParcelamentoTransferenciaResponse> parcelas = new ArrayList<ParcelamentoTransferenciaResponse>();

  
  /**
   * C\u00C3\u00B3digo de processamento da transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public PlanoParcelamentoTransferenciaResponse codigoEspecial(Long codigoEspecial) {
    this.codigoEspecial = codigoEspecial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de processamento da transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("codigoEspecial")
  public Long getCodigoEspecial() {
    return codigoEspecial;
  }
  public void setCodigoEspecial(Long codigoEspecial) {
    this.codigoEspecial = codigoEspecial;
  }

  
  /**
   * Data de vencimento da primeira parcela.
   **/
  public PlanoParcelamentoTransferenciaResponse vencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento da primeira parcela.")
  @JsonProperty("vencimentoPrimeiraParcela")
  public String getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * Flag indicativa para juros.
   **/
  public PlanoParcelamentoTransferenciaResponse flagJuros(Integer flagJuros) {
    this.flagJuros = flagJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag indicativa para juros.")
  @JsonProperty("flagJuros")
  public Integer getFlagJuros() {
    return flagJuros;
  }
  public void setFlagJuros(Integer flagJuros) {
    this.flagJuros = flagJuros;
  }

  
  /**
   * N\u00C3\u00BAmero de meses para car\u00C3\u00AAncia.
   **/
  public PlanoParcelamentoTransferenciaResponse numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero de meses para car\u00C3\u00AAncia.")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * Lista com os planos de parcelamento.
   **/
  public PlanoParcelamentoTransferenciaResponse parcelas(List<ParcelamentoTransferenciaResponse> parcelas) {
    this.parcelas = parcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista com os planos de parcelamento.")
  @JsonProperty("parcelas")
  public List<ParcelamentoTransferenciaResponse> getParcelas() {
    return parcelas;
  }
  public void setParcelas(List<ParcelamentoTransferenciaResponse> parcelas) {
    this.parcelas = parcelas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanoParcelamentoTransferenciaResponse planoParcelamentoTransferenciaResponse = (PlanoParcelamentoTransferenciaResponse) o;
    return Objects.equals(this.codigoEspecial, planoParcelamentoTransferenciaResponse.codigoEspecial) &&
        Objects.equals(this.vencimentoPrimeiraParcela, planoParcelamentoTransferenciaResponse.vencimentoPrimeiraParcela) &&
        Objects.equals(this.flagJuros, planoParcelamentoTransferenciaResponse.flagJuros) &&
        Objects.equals(this.numeroMesesCarencia, planoParcelamentoTransferenciaResponse.numeroMesesCarencia) &&
        Objects.equals(this.parcelas, planoParcelamentoTransferenciaResponse.parcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoEspecial, vencimentoPrimeiraParcela, flagJuros, numeroMesesCarencia, parcelas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaResponse {\n");
    
    sb.append("    codigoEspecial: ").append(toIndentedString(codigoEspecial)).append("\n");
    sb.append("    vencimentoPrimeiraParcela: ").append(toIndentedString(vencimentoPrimeiraParcela)).append("\n");
    sb.append("    flagJuros: ").append(toIndentedString(flagJuros)).append("\n");
    sb.append("    numeroMesesCarencia: ").append(toIndentedString(numeroMesesCarencia)).append("\n");
    sb.append("    parcelas: ").append(toIndentedString(parcelas)).append("\n");
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



