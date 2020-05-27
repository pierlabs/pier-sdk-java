package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da resposta do recurso de status CNAB sumarizado
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de status CNAB sumarizado")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusCnabSumarizadoResponse   {
  
  private Long id = null;
  private String descricao = null;
  private Boolean flagGerado = null;
  private Boolean flagEnviado = null;
  private Boolean flagRegistrado = null;
  private Boolean flagPago = null;
  private Boolean flagRejeitado = null;
  private Boolean flagIgnorado = null;
  private Boolean flagSemRange = null;

  
  /**
   * C\u00F3digo identificador do status CNAB sumarizado
   **/
  public StatusCnabSumarizadoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do status CNAB sumarizado")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do status CNAB sumarizado
   **/
  public StatusCnabSumarizadoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do status CNAB sumarizado")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que indica se foi gerado
   **/
  public StatusCnabSumarizadoResponse flagGerado(Boolean flagGerado) {
    this.flagGerado = flagGerado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se foi gerado")
  @JsonProperty("flagGerado")
  public Boolean getFlagGerado() {
    return flagGerado;
  }
  public void setFlagGerado(Boolean flagGerado) {
    this.flagGerado = flagGerado;
  }

  
  /**
   * Flag que indica se foi enviado
   **/
  public StatusCnabSumarizadoResponse flagEnviado(Boolean flagEnviado) {
    this.flagEnviado = flagEnviado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se foi enviado")
  @JsonProperty("flagEnviado")
  public Boolean getFlagEnviado() {
    return flagEnviado;
  }
  public void setFlagEnviado(Boolean flagEnviado) {
    this.flagEnviado = flagEnviado;
  }

  
  /**
   * Flag que indica se foi registrado
   **/
  public StatusCnabSumarizadoResponse flagRegistrado(Boolean flagRegistrado) {
    this.flagRegistrado = flagRegistrado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se foi registrado")
  @JsonProperty("flagRegistrado")
  public Boolean getFlagRegistrado() {
    return flagRegistrado;
  }
  public void setFlagRegistrado(Boolean flagRegistrado) {
    this.flagRegistrado = flagRegistrado;
  }

  
  /**
   * Flag que indica se foi pago
   **/
  public StatusCnabSumarizadoResponse flagPago(Boolean flagPago) {
    this.flagPago = flagPago;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se foi pago")
  @JsonProperty("flagPago")
  public Boolean getFlagPago() {
    return flagPago;
  }
  public void setFlagPago(Boolean flagPago) {
    this.flagPago = flagPago;
  }

  
  /**
   * Flag que indica se foi rejeitado
   **/
  public StatusCnabSumarizadoResponse flagRejeitado(Boolean flagRejeitado) {
    this.flagRejeitado = flagRejeitado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se foi rejeitado")
  @JsonProperty("flagRejeitado")
  public Boolean getFlagRejeitado() {
    return flagRejeitado;
  }
  public void setFlagRejeitado(Boolean flagRejeitado) {
    this.flagRejeitado = flagRejeitado;
  }

  
  /**
   * Flag que indica se foi ignorado
   **/
  public StatusCnabSumarizadoResponse flagIgnorado(Boolean flagIgnorado) {
    this.flagIgnorado = flagIgnorado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se foi ignorado")
  @JsonProperty("flagIgnorado")
  public Boolean getFlagIgnorado() {
    return flagIgnorado;
  }
  public void setFlagIgnorado(Boolean flagIgnorado) {
    this.flagIgnorado = flagIgnorado;
  }

  
  /**
   * Flag que indica se n\u00E3o possui range
   **/
  public StatusCnabSumarizadoResponse flagSemRange(Boolean flagSemRange) {
    this.flagSemRange = flagSemRange;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se n\u00E3o possui range")
  @JsonProperty("flagSemRange")
  public Boolean getFlagSemRange() {
    return flagSemRange;
  }
  public void setFlagSemRange(Boolean flagSemRange) {
    this.flagSemRange = flagSemRange;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCnabSumarizadoResponse statusCnabSumarizadoResponse = (StatusCnabSumarizadoResponse) o;
    return Objects.equals(this.id, statusCnabSumarizadoResponse.id) &&
        Objects.equals(this.descricao, statusCnabSumarizadoResponse.descricao) &&
        Objects.equals(this.flagGerado, statusCnabSumarizadoResponse.flagGerado) &&
        Objects.equals(this.flagEnviado, statusCnabSumarizadoResponse.flagEnviado) &&
        Objects.equals(this.flagRegistrado, statusCnabSumarizadoResponse.flagRegistrado) &&
        Objects.equals(this.flagPago, statusCnabSumarizadoResponse.flagPago) &&
        Objects.equals(this.flagRejeitado, statusCnabSumarizadoResponse.flagRejeitado) &&
        Objects.equals(this.flagIgnorado, statusCnabSumarizadoResponse.flagIgnorado) &&
        Objects.equals(this.flagSemRange, statusCnabSumarizadoResponse.flagSemRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, flagGerado, flagEnviado, flagRegistrado, flagPago, flagRejeitado, flagIgnorado, flagSemRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCnabSumarizadoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    flagGerado: ").append(toIndentedString(flagGerado)).append("\n");
    sb.append("    flagEnviado: ").append(toIndentedString(flagEnviado)).append("\n");
    sb.append("    flagRegistrado: ").append(toIndentedString(flagRegistrado)).append("\n");
    sb.append("    flagPago: ").append(toIndentedString(flagPago)).append("\n");
    sb.append("    flagRejeitado: ").append(toIndentedString(flagRejeitado)).append("\n");
    sb.append("    flagIgnorado: ").append(toIndentedString(flagIgnorado)).append("\n");
    sb.append("    flagSemRange: ").append(toIndentedString(flagSemRange)).append("\n");
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

