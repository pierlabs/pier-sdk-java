package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{propriedade_documento_request_description}}}
 **/

@ApiModel(description = "{{{propriedade_documento_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PropriedadeDocumentoRequest   {
  
  private String chave = null;
  private String valor = null;


  public enum DetalhesTipoEnum {
    IMAGEM("IMAGEM"),
    TEXTO("TEXTO"),
    NUMERO("NUMERO");

    private String value;

    DetalhesTipoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DetalhesTipoEnum detalhesTipo = null;
  private Boolean flagIndice = null;

  
  /**
   * {{{propriedade_documento_request_chave_value}}}
   **/
  public PropriedadeDocumentoRequest chave(String chave) {
    this.chave = chave;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{propriedade_documento_request_chave_value}}}")
  @JsonProperty("chave")
  public String getChave() {
    return chave;
  }
  public void setChave(String chave) {
    this.chave = chave;
  }

  
  /**
   * {{{propriedade_documento_request_valor_value}}}
   **/
  public PropriedadeDocumentoRequest valor(String valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{propriedade_documento_request_valor_value}}}")
  @JsonProperty("valor")
  public String getValor() {
    return valor;
  }
  public void setValor(String valor) {
    this.valor = valor;
  }

  
  /**
   * {{{propriedade_documento_request_detalhes_tipo_value}}}
   **/
  public PropriedadeDocumentoRequest detalhesTipo(DetalhesTipoEnum detalhesTipo) {
    this.detalhesTipo = detalhesTipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{propriedade_documento_request_detalhes_tipo_value}}}")
  @JsonProperty("detalhesTipo")
  public DetalhesTipoEnum getDetalhesTipo() {
    return detalhesTipo;
  }
  public void setDetalhesTipo(DetalhesTipoEnum detalhesTipo) {
    this.detalhesTipo = detalhesTipo;
  }

  
  /**
   * {{{propriedade_documento_request_flag_indice_value}}}
   **/
  public PropriedadeDocumentoRequest flagIndice(Boolean flagIndice) {
    this.flagIndice = flagIndice;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{propriedade_documento_request_flag_indice_value}}}")
  @JsonProperty("flagIndice")
  public Boolean getFlagIndice() {
    return flagIndice;
  }
  public void setFlagIndice(Boolean flagIndice) {
    this.flagIndice = flagIndice;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropriedadeDocumentoRequest propriedadeDocumentoRequest = (PropriedadeDocumentoRequest) o;
    return Objects.equals(this.chave, propriedadeDocumentoRequest.chave) &&
        Objects.equals(this.valor, propriedadeDocumentoRequest.valor) &&
        Objects.equals(this.detalhesTipo, propriedadeDocumentoRequest.detalhesTipo) &&
        Objects.equals(this.flagIndice, propriedadeDocumentoRequest.flagIndice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chave, valor, detalhesTipo, flagIndice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropriedadeDocumentoRequest {\n");
    
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    detalhesTipo: ").append(toIndentedString(detalhesTipo)).append("\n");
    sb.append("    flagIndice: ").append(toIndentedString(flagIndice)).append("\n");
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



