package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AjusteFinanceiroResponse   {
  
  private Long id = null;
  private Long idTipoAjuste = null;
  private Long idConta = null;
  private String dataAjuste = null;
  private BigDecimal valor = null;
  private String identificadorExterno = null;
  private Long status = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do ajuste (id)
   **/
  public AjusteFinanceiroResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do ajuste (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo do ajuste
   **/
  public AjusteFinanceiroResponse idTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo do ajuste")
  @JsonProperty("idTipoAjuste")
  public Long getIdTipoAjuste() {
    return idTipoAjuste;
  }
  public void setIdTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta (idConta)
   **/
  public AjusteFinanceiroResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta (idConta)")
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
  public AjusteFinanceiroResponse dataAjuste(String dataAjuste) {
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
  public AjusteFinanceiroResponse valor(BigDecimal valor) {
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

  
  /**
   * Descri\u00E7\u00E3o do status da autoriza\u00E7\u00E3o da compra.
   **/
  public AjusteFinanceiroResponse identificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do status da autoriza\u00E7\u00E3o da compra.")
  @JsonProperty("identificadorExterno")
  public String getIdentificadorExterno() {
    return identificadorExterno;
  }
  public void setIdentificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
  }

  
  /**
   * Status do ajuste.
   **/
  public AjusteFinanceiroResponse status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do ajuste.")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AjusteFinanceiroResponse ajusteFinanceiroResponse = (AjusteFinanceiroResponse) o;
    return Objects.equals(this.id, ajusteFinanceiroResponse.id) &&
        Objects.equals(this.idTipoAjuste, ajusteFinanceiroResponse.idTipoAjuste) &&
        Objects.equals(this.idConta, ajusteFinanceiroResponse.idConta) &&
        Objects.equals(this.dataAjuste, ajusteFinanceiroResponse.dataAjuste) &&
        Objects.equals(this.valor, ajusteFinanceiroResponse.valor) &&
        Objects.equals(this.identificadorExterno, ajusteFinanceiroResponse.identificadorExterno) &&
        Objects.equals(this.status, ajusteFinanceiroResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoAjuste, idConta, dataAjuste, valor, identificadorExterno, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AjusteFinanceiroResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoAjuste: ").append(toIndentedString(idTipoAjuste)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    dataAjuste: ").append(toIndentedString(dataAjuste)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    identificadorExterno: ").append(toIndentedString(identificadorExterno)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

