package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{ajuste_financeiro_response_description}}}
 **/

@ApiModel(description = "{{{ajuste_financeiro_response_description}}}")
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
   * {{{ajuste_financeiro_response_id_value}}}
   **/
  public AjusteFinanceiroResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{ajuste_financeiro_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{ajuste_financeiro_response_id_tipo_ajuste_value}}}
   **/
  public AjusteFinanceiroResponse idTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{ajuste_financeiro_response_id_tipo_ajuste_value}}}")
  @JsonProperty("idTipoAjuste")
  public Long getIdTipoAjuste() {
    return idTipoAjuste;
  }
  public void setIdTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
  }

  
  /**
   * {{{ajuste_financeiro_response_id_conta_value}}}
   **/
  public AjusteFinanceiroResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{ajuste_financeiro_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{ajuste_financeiro_response_data_ajuste_value}}}
   **/
  public AjusteFinanceiroResponse dataAjuste(String dataAjuste) {
    this.dataAjuste = dataAjuste;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{ajuste_financeiro_response_data_ajuste_value}}}")
  @JsonProperty("dataAjuste")
  public String getDataAjuste() {
    return dataAjuste;
  }
  public void setDataAjuste(String dataAjuste) {
    this.dataAjuste = dataAjuste;
  }

  
  /**
   * {{{ajuste_financeiro_response_valor_value}}}
   **/
  public AjusteFinanceiroResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{ajuste_financeiro_response_valor_value}}}")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{ajuste_financeiro_response_identificador_externo_value}}}
   **/
  public AjusteFinanceiroResponse identificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{ajuste_financeiro_response_identificador_externo_value}}}")
  @JsonProperty("identificadorExterno")
  public String getIdentificadorExterno() {
    return identificadorExterno;
  }
  public void setIdentificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
  }

  
  /**
   * {{{ajuste_financeiro_response_status_value}}}
   **/
  public AjusteFinanceiroResponse status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{ajuste_financeiro_response_status_value}}}")
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

