package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Classe de retorno das parcelas de acordo
 **/

@ApiModel(description = "Classe de retorno das parcelas de acordo")
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
   * C\u00F3digo identificador da parcela do acordo
   **/
  public ParcelaAcordoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da parcela do acordo")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do acordo (Id)
   **/
  public ParcelaAcordoResponse idAcordo(Long idAcordo) {
    this.idAcordo = idAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do acordo (Id)")
  @JsonProperty("idAcordo")
  public Long getIdAcordo() {
    return idAcordo;
  }
  public void setIdAcordo(Long idAcordo) {
    this.idAcordo = idAcordo;
  }

  
  /**
   * N\u00FAmero da parcela
   **/
  public ParcelaAcordoResponse numeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da parcela")
  @JsonProperty("numeroParcela")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Valor da parcela
   **/
  public ParcelaAcordoResponse valorParcela(BigDecimal valorParcela) {
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
   * Data de vencimento da parcela
   **/
  public ParcelaAcordoResponse vencimentoParcela(String vencimentoParcela) {
    this.vencimentoParcela = vencimentoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento da parcela")
  @JsonProperty("vencimentoParcela")
  public String getVencimentoParcela() {
    return vencimentoParcela;
  }
  public void setVencimentoParcela(String vencimentoParcela) {
    this.vencimentoParcela = vencimentoParcela;
  }

  
  /**
   * Saldo da parcela
   **/
  public ParcelaAcordoResponse saldoParcela(BigDecimal saldoParcela) {
    this.saldoParcela = saldoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo da parcela")
  @JsonProperty("saldoParcela")
  public BigDecimal getSaldoParcela() {
    return saldoParcela;
  }
  public void setSaldoParcela(BigDecimal saldoParcela) {
    this.saldoParcela = saldoParcela;
  }

  
  /**
   * Nosso n\u00FAmero gerado por parcela
   **/
  public ParcelaAcordoResponse nossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nosso n\u00FAmero gerado por parcela")
  @JsonProperty("nossoNumero")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do boleto
   **/
  public ParcelaAcordoResponse idBoletoParcela(Long idBoletoParcela) {
    this.idBoletoParcela = idBoletoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do boleto")
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

