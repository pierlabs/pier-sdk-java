package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AjusteResponse   {
  
  private Long idAjuste = null;
  private Long idTipoAjuste = null;
  private Long idConta = null;
  private String dataAjuste = null;
  private BigDecimal valor = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do ajuste (id)
   **/
  public AjusteResponse idAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do ajuste (id)")
  @JsonProperty("idAjuste")
  public Long getIdAjuste() {
    return idAjuste;
  }
  public void setIdAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo do ajuste
   **/
  public AjusteResponse idTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo do ajuste")
  @JsonProperty("idTipoAjuste")
  public Long getIdTipoAjuste() {
    return idTipoAjuste;
  }
  public void setIdTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (idConta)
   **/
  public AjusteResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (idConta)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Data do ajuste
   **/
  public AjusteResponse dataAjuste(String dataAjuste) {
    this.dataAjuste = dataAjuste;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data do ajuste")
  @JsonProperty("dataAjuste")
  public String getDataAjuste() {
    return dataAjuste;
  }
  public void setDataAjuste(String dataAjuste) {
    this.dataAjuste = dataAjuste;
  }

  
  /**
   * Valor do ajuste
   **/
  public AjusteResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do ajuste")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AjusteResponse ajusteResponse = (AjusteResponse) o;
    return Objects.equals(this.idAjuste, ajusteResponse.idAjuste) &&
        Objects.equals(this.idTipoAjuste, ajusteResponse.idTipoAjuste) &&
        Objects.equals(this.idConta, ajusteResponse.idConta) &&
        Objects.equals(this.dataAjuste, ajusteResponse.dataAjuste) &&
        Objects.equals(this.valor, ajusteResponse.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAjuste, idTipoAjuste, idConta, dataAjuste, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AjusteResponse {\n");
    
    sb.append("    idAjuste: ").append(toIndentedString(idAjuste)).append("\n");
    sb.append("    idTipoAjuste: ").append(toIndentedString(idTipoAjuste)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    dataAjuste: ").append(toIndentedString(dataAjuste)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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



