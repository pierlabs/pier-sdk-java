package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoProdutoPersist   {
  
  private String descricao = null;
  private Integer flagAntecipacao = null;
  private Integer flagConsignada = null;
  private Integer flagCreditoBeneficio = null;
  private Integer flagPrePago = null;

  
  /**
   **/
  public TipoProdutoPersist descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  public TipoProdutoPersist flagAntecipacao(Integer flagAntecipacao) {
    this.flagAntecipacao = flagAntecipacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagAntecipacao")
  public Integer getFlagAntecipacao() {
    return flagAntecipacao;
  }
  public void setFlagAntecipacao(Integer flagAntecipacao) {
    this.flagAntecipacao = flagAntecipacao;
  }

  
  /**
   **/
  public TipoProdutoPersist flagConsignada(Integer flagConsignada) {
    this.flagConsignada = flagConsignada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagConsignada")
  public Integer getFlagConsignada() {
    return flagConsignada;
  }
  public void setFlagConsignada(Integer flagConsignada) {
    this.flagConsignada = flagConsignada;
  }

  
  /**
   **/
  public TipoProdutoPersist flagCreditoBeneficio(Integer flagCreditoBeneficio) {
    this.flagCreditoBeneficio = flagCreditoBeneficio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagCreditoBeneficio")
  public Integer getFlagCreditoBeneficio() {
    return flagCreditoBeneficio;
  }
  public void setFlagCreditoBeneficio(Integer flagCreditoBeneficio) {
    this.flagCreditoBeneficio = flagCreditoBeneficio;
  }

  
  /**
   **/
  public TipoProdutoPersist flagPrePago(Integer flagPrePago) {
    this.flagPrePago = flagPrePago;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagPrePago")
  public Integer getFlagPrePago() {
    return flagPrePago;
  }
  public void setFlagPrePago(Integer flagPrePago) {
    this.flagPrePago = flagPrePago;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoProdutoPersist tipoProdutoPersist = (TipoProdutoPersist) o;
    return Objects.equals(this.descricao, tipoProdutoPersist.descricao) &&
        Objects.equals(this.flagAntecipacao, tipoProdutoPersist.flagAntecipacao) &&
        Objects.equals(this.flagConsignada, tipoProdutoPersist.flagConsignada) &&
        Objects.equals(this.flagCreditoBeneficio, tipoProdutoPersist.flagCreditoBeneficio) &&
        Objects.equals(this.flagPrePago, tipoProdutoPersist.flagPrePago);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, flagAntecipacao, flagConsignada, flagCreditoBeneficio, flagPrePago);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoProdutoPersist {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    flagAntecipacao: ").append(toIndentedString(flagAntecipacao)).append("\n");
    sb.append("    flagConsignada: ").append(toIndentedString(flagConsignada)).append("\n");
    sb.append("    flagCreditoBeneficio: ").append(toIndentedString(flagCreditoBeneficio)).append("\n");
    sb.append("    flagPrePago: ").append(toIndentedString(flagPrePago)).append("\n");
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

