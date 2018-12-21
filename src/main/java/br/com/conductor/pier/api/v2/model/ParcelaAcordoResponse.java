package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{parcela_acordo_response_description}}}
 **/

@ApiModel(description = "{{{parcela_acordo_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParcelaAcordoResponse   {
  
  private Long id = null;
  private Long idAcordo = null;
  private Integer numeroParcela = null;
  private BigDecimal valorParcela = null;
  private String vencimentoParcela = null;
  private BigDecimal saldoParcela = null;
  private String nossoNumero = null;
  private Long idBoletoParcela = null;

  
  /**
   * {{{parcela_acordo_response_id_value}}}
   **/
  public ParcelaAcordoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcela_acordo_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{parcela_acordo_response_id_acordo_value}}}
   **/
  public ParcelaAcordoResponse idAcordo(Long idAcordo) {
    this.idAcordo = idAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcela_acordo_response_id_acordo_value}}}")
  @JsonProperty("idAcordo")
  public Long getIdAcordo() {
    return idAcordo;
  }
  public void setIdAcordo(Long idAcordo) {
    this.idAcordo = idAcordo;
  }

  
  /**
   * {{{parcela_acordo_response_numero_parcela_value}}}
   **/
  public ParcelaAcordoResponse numeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcela_acordo_response_numero_parcela_value}}}")
  @JsonProperty("numeroParcela")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * {{{parcela_acordo_response_valor_parcela_value}}}
   **/
  public ParcelaAcordoResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcela_acordo_response_valor_parcela_value}}}")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{parcela_acordo_response_vencimento_parcela_value}}}
   **/
  public ParcelaAcordoResponse vencimentoParcela(String vencimentoParcela) {
    this.vencimentoParcela = vencimentoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcela_acordo_response_vencimento_parcela_value}}}")
  @JsonProperty("vencimentoParcela")
  public String getVencimentoParcela() {
    return vencimentoParcela;
  }
  public void setVencimentoParcela(String vencimentoParcela) {
    this.vencimentoParcela = vencimentoParcela;
  }

  
  /**
   * {{{parcela_acordo_response_saldo_parcela_value}}}
   **/
  public ParcelaAcordoResponse saldoParcela(BigDecimal saldoParcela) {
    this.saldoParcela = saldoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcela_acordo_response_saldo_parcela_value}}}")
  @JsonProperty("saldoParcela")
  public BigDecimal getSaldoParcela() {
    return saldoParcela;
  }
  public void setSaldoParcela(BigDecimal saldoParcela) {
    this.saldoParcela = saldoParcela;
  }

  
  /**
   * {{{parcela_acordo_response_nosso_numero_value}}}
   **/
  public ParcelaAcordoResponse nossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcela_acordo_response_nosso_numero_value}}}")
  @JsonProperty("nossoNumero")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * {{{parcela_acordo_response_id_boleto_parcela_value}}}
   **/
  public ParcelaAcordoResponse idBoletoParcela(Long idBoletoParcela) {
    this.idBoletoParcela = idBoletoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcela_acordo_response_id_boleto_parcela_value}}}")
  @JsonProperty("idBoletoParcela")
  public Long getIdBoletoParcela() {
    return idBoletoParcela;
  }
  public void setIdBoletoParcela(Long idBoletoParcela) {
    this.idBoletoParcela = idBoletoParcela;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelaAcordoResponse parcelaAcordoResponse = (ParcelaAcordoResponse) o;
    return Objects.equals(this.id, parcelaAcordoResponse.id) &&
        Objects.equals(this.idAcordo, parcelaAcordoResponse.idAcordo) &&
        Objects.equals(this.numeroParcela, parcelaAcordoResponse.numeroParcela) &&
        Objects.equals(this.valorParcela, parcelaAcordoResponse.valorParcela) &&
        Objects.equals(this.vencimentoParcela, parcelaAcordoResponse.vencimentoParcela) &&
        Objects.equals(this.saldoParcela, parcelaAcordoResponse.saldoParcela) &&
        Objects.equals(this.nossoNumero, parcelaAcordoResponse.nossoNumero) &&
        Objects.equals(this.idBoletoParcela, parcelaAcordoResponse.idBoletoParcela);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idAcordo, numeroParcela, valorParcela, vencimentoParcela, saldoParcela, nossoNumero, idBoletoParcela);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelaAcordoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idAcordo: ").append(toIndentedString(idAcordo)).append("\n");
    sb.append("    numeroParcela: ").append(toIndentedString(numeroParcela)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    vencimentoParcela: ").append(toIndentedString(vencimentoParcela)).append("\n");
    sb.append("    saldoParcela: ").append(toIndentedString(saldoParcela)).append("\n");
    sb.append("    nossoNumero: ").append(toIndentedString(nossoNumero)).append("\n");
    sb.append("    idBoletoParcela: ").append(toIndentedString(idBoletoParcela)).append("\n");
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

