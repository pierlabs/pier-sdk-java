package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta do benef\u00EDcio
 **/

@ApiModel(description = "Objeto de resposta do benef\u00EDcio")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BeneficioResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private String numeroBeneficio = null;
  private Integer mesProvaVida = null;
  private Boolean status = null;
  private String tipoBeneficio = null;

  
  /**
   * Identificador do benef\u00EDcio
   **/
  public BeneficioResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do benef\u00EDcio")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da conta
   **/
  public BeneficioResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * N\u00FAmero do benef\u00EDcio
   **/
  public BeneficioResponse numeroBeneficio(String numeroBeneficio) {
    this.numeroBeneficio = numeroBeneficio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do benef\u00EDcio")
  @JsonProperty("numeroBeneficio")
  public String getNumeroBeneficio() {
    return numeroBeneficio;
  }
  public void setNumeroBeneficio(String numeroBeneficio) {
    this.numeroBeneficio = numeroBeneficio;
  }

  
  /**
   * M\u00EAs de prova de vida do benefici\u00E1rio
   **/
  public BeneficioResponse mesProvaVida(Integer mesProvaVida) {
    this.mesProvaVida = mesProvaVida;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "M\u00EAs de prova de vida do benefici\u00E1rio")
  @JsonProperty("mesProvaVida")
  public Integer getMesProvaVida() {
    return mesProvaVida;
  }
  public void setMesProvaVida(Integer mesProvaVida) {
    this.mesProvaVida = mesProvaVida;
  }

  
  /**
   * Status do benef\u00EDcio(1 = ATIVO, 0 = INATIVO)
   **/
  public BeneficioResponse status(Boolean status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Status do benef\u00EDcio(1 = ATIVO, 0 = INATIVO)")
  @JsonProperty("status")
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }

  
  /**
   * Tipo do benef\u00EDcio
   **/
  public BeneficioResponse tipoBeneficio(String tipoBeneficio) {
    this.tipoBeneficio = tipoBeneficio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do benef\u00EDcio")
  @JsonProperty("tipoBeneficio")
  public String getTipoBeneficio() {
    return tipoBeneficio;
  }
  public void setTipoBeneficio(String tipoBeneficio) {
    this.tipoBeneficio = tipoBeneficio;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeneficioResponse beneficioResponse = (BeneficioResponse) o;
    return Objects.equals(this.id, beneficioResponse.id) &&
        Objects.equals(this.idConta, beneficioResponse.idConta) &&
        Objects.equals(this.numeroBeneficio, beneficioResponse.numeroBeneficio) &&
        Objects.equals(this.mesProvaVida, beneficioResponse.mesProvaVida) &&
        Objects.equals(this.status, beneficioResponse.status) &&
        Objects.equals(this.tipoBeneficio, beneficioResponse.tipoBeneficio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, numeroBeneficio, mesProvaVida, status, tipoBeneficio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficioResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    numeroBeneficio: ").append(toIndentedString(numeroBeneficio)).append("\n");
    sb.append("    mesProvaVida: ").append(toIndentedString(mesProvaVida)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tipoBeneficio: ").append(toIndentedString(tipoBeneficio)).append("\n");
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

