package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoProdutoResponse   {
  
  private String descricao = null;
  private Integer flagAntecipacao = null;
  private Integer flagConsignada = null;
  private Integer flagCreditoBeneficio = null;
  private Integer flagPrePago = null;
  private Long id = null;

  
  /**
   **/
  public TipoProdutoResponse descricao(String descricao) {
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
  public TipoProdutoResponse flagAntecipacao(Integer flagAntecipacao) {
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
  public TipoProdutoResponse flagConsignada(Integer flagConsignada) {
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
  public TipoProdutoResponse flagCreditoBeneficio(Integer flagCreditoBeneficio) {
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
  public TipoProdutoResponse flagPrePago(Integer flagPrePago) {
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

  
  /**
   **/
  public TipoProdutoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoProdutoResponse tipoProdutoResponse = (TipoProdutoResponse) o;
    return Objects.equals(this.descricao, tipoProdutoResponse.descricao) &&
        Objects.equals(this.flagAntecipacao, tipoProdutoResponse.flagAntecipacao) &&
        Objects.equals(this.flagConsignada, tipoProdutoResponse.flagConsignada) &&
        Objects.equals(this.flagCreditoBeneficio, tipoProdutoResponse.flagCreditoBeneficio) &&
        Objects.equals(this.flagPrePago, tipoProdutoResponse.flagPrePago) &&
        Objects.equals(this.id, tipoProdutoResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, flagAntecipacao, flagConsignada, flagCreditoBeneficio, flagPrePago, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoProdutoResponse {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    flagAntecipacao: ").append(toIndentedString(flagAntecipacao)).append("\n");
    sb.append("    flagConsignada: ").append(toIndentedString(flagConsignada)).append("\n");
    sb.append("    flagCreditoBeneficio: ").append(toIndentedString(flagCreditoBeneficio)).append("\n");
    sb.append("    flagPrePago: ").append(toIndentedString(flagPrePago)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

