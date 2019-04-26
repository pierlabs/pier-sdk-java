package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Resposta da quebra do Acordo
 **/

@ApiModel(description = "Resposta da quebra do Acordo")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AcordoQuebraResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long statusConta = null;
  private BigDecimal saldoAtualFinal = null;
  private String dataQuebraAcordo = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do acordo (id)
   **/
  public AcordoQuebraResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do acordo (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da conta (idConta)
   **/
  public AcordoQuebraResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da conta (idConta)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Status da conta do acordo
   **/
  public AcordoQuebraResponse statusConta(Long statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da conta do acordo")
  @JsonProperty("statusConta")
  public Long getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Long statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Saldo atual final da conta
   **/
  public AcordoQuebraResponse saldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo atual final da conta")
  @JsonProperty("saldoAtualFinal")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Data de quebra do acordo
   **/
  public AcordoQuebraResponse dataQuebraAcordo(String dataQuebraAcordo) {
    this.dataQuebraAcordo = dataQuebraAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de quebra do acordo")
  @JsonProperty("dataQuebraAcordo")
  public String getDataQuebraAcordo() {
    return dataQuebraAcordo;
  }
  public void setDataQuebraAcordo(String dataQuebraAcordo) {
    this.dataQuebraAcordo = dataQuebraAcordo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcordoQuebraResponse acordoQuebraResponse = (AcordoQuebraResponse) o;
    return Objects.equals(this.id, acordoQuebraResponse.id) &&
        Objects.equals(this.idConta, acordoQuebraResponse.idConta) &&
        Objects.equals(this.statusConta, acordoQuebraResponse.statusConta) &&
        Objects.equals(this.saldoAtualFinal, acordoQuebraResponse.saldoAtualFinal) &&
        Objects.equals(this.dataQuebraAcordo, acordoQuebraResponse.dataQuebraAcordo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, statusConta, saldoAtualFinal, dataQuebraAcordo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoQuebraResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    statusConta: ").append(toIndentedString(statusConta)).append("\n");
    sb.append("    saldoAtualFinal: ").append(toIndentedString(saldoAtualFinal)).append("\n");
    sb.append("    dataQuebraAcordo: ").append(toIndentedString(dataQuebraAcordo)).append("\n");
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

