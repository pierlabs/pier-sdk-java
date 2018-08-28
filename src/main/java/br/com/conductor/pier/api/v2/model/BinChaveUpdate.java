package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BinChaveUpdate   {
  
  private String chave = null;
  private String checkValue = null;
  private Boolean flagDescriptografado = null;
  private Long idBin = null;
  private Long idTipoChave = null;
  private String label = null;
  private String validade = null;

  
  /**
   **/
  public BinChaveUpdate chave(String chave) {
    this.chave = chave;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chave")
  public String getChave() {
    return chave;
  }
  public void setChave(String chave) {
    this.chave = chave;
  }

  
  /**
   **/
  public BinChaveUpdate checkValue(String checkValue) {
    this.checkValue = checkValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("checkValue")
  public String getCheckValue() {
    return checkValue;
  }
  public void setCheckValue(String checkValue) {
    this.checkValue = checkValue;
  }

  
  /**
   **/
  public BinChaveUpdate flagDescriptografado(Boolean flagDescriptografado) {
    this.flagDescriptografado = flagDescriptografado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagDescriptografado")
  public Boolean getFlagDescriptografado() {
    return flagDescriptografado;
  }
  public void setFlagDescriptografado(Boolean flagDescriptografado) {
    this.flagDescriptografado = flagDescriptografado;
  }

  
  /**
   **/
  public BinChaveUpdate idBin(Long idBin) {
    this.idBin = idBin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idBin")
  public Long getIdBin() {
    return idBin;
  }
  public void setIdBin(Long idBin) {
    this.idBin = idBin;
  }

  
  /**
   **/
  public BinChaveUpdate idTipoChave(Long idTipoChave) {
    this.idTipoChave = idTipoChave;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idTipoChave")
  public Long getIdTipoChave() {
    return idTipoChave;
  }
  public void setIdTipoChave(Long idTipoChave) {
    this.idTipoChave = idTipoChave;
  }

  
  /**
   **/
  public BinChaveUpdate label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   **/
  public BinChaveUpdate validade(String validade) {
    this.validade = validade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("validade")
  public String getValidade() {
    return validade;
  }
  public void setValidade(String validade) {
    this.validade = validade;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinChaveUpdate binChaveUpdate = (BinChaveUpdate) o;
    return Objects.equals(this.chave, binChaveUpdate.chave) &&
        Objects.equals(this.checkValue, binChaveUpdate.checkValue) &&
        Objects.equals(this.flagDescriptografado, binChaveUpdate.flagDescriptografado) &&
        Objects.equals(this.idBin, binChaveUpdate.idBin) &&
        Objects.equals(this.idTipoChave, binChaveUpdate.idTipoChave) &&
        Objects.equals(this.label, binChaveUpdate.label) &&
        Objects.equals(this.validade, binChaveUpdate.validade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chave, checkValue, flagDescriptografado, idBin, idTipoChave, label, validade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinChaveUpdate {\n");
    
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
    sb.append("    checkValue: ").append(toIndentedString(checkValue)).append("\n");
    sb.append("    flagDescriptografado: ").append(toIndentedString(flagDescriptografado)).append("\n");
    sb.append("    idBin: ").append(toIndentedString(idBin)).append("\n");
    sb.append("    idTipoChave: ").append(toIndentedString(idTipoChave)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    validade: ").append(toIndentedString(validade)).append("\n");
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

