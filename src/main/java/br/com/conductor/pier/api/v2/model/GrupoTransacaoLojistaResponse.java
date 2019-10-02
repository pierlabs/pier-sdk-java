package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Descri\u00E7\u00E3o do objeto de resposta do grupo de transa\u00E7\u00E3o lojista
 **/

@ApiModel(description = "Descri\u00E7\u00E3o do objeto de resposta do grupo de transa\u00E7\u00E3o lojista")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GrupoTransacaoLojistaResponse   {
  
  private Long id = null;
  private String descricao = null;
  private Boolean flagCompra = null;
  private Boolean flagSaque = null;
  private Boolean flagComissao = null;
  private Boolean flagChargeBack = null;
  private Boolean flagOutrosDebitos = null;
  private Boolean flagPagamento = null;
  private Boolean flagOutrosCreditos = null;

  
  /**
   * C\u00F3digo identificador do grupo de transa\u00E7\u00E3o lojista
   **/
  public GrupoTransacaoLojistaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do grupo de transa\u00E7\u00E3o lojista")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do grupo de transa\u00E7\u00E3o lojista
   **/
  public GrupoTransacaoLojistaResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do grupo de transa\u00E7\u00E3o lojista")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Indica se permite compra
   **/
  public GrupoTransacaoLojistaResponse flagCompra(Boolean flagCompra) {
    this.flagCompra = flagCompra;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se permite compra")
  @JsonProperty("flagCompra")
  public Boolean getFlagCompra() {
    return flagCompra;
  }
  public void setFlagCompra(Boolean flagCompra) {
    this.flagCompra = flagCompra;
  }

  
  /**
   * Indica se permite saque
   **/
  public GrupoTransacaoLojistaResponse flagSaque(Boolean flagSaque) {
    this.flagSaque = flagSaque;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se permite saque")
  @JsonProperty("flagSaque")
  public Boolean getFlagSaque() {
    return flagSaque;
  }
  public void setFlagSaque(Boolean flagSaque) {
    this.flagSaque = flagSaque;
  }

  
  /**
   * Indica se recebe comiss\u00E3o
   **/
  public GrupoTransacaoLojistaResponse flagComissao(Boolean flagComissao) {
    this.flagComissao = flagComissao;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se recebe comiss\u00E3o")
  @JsonProperty("flagComissao")
  public Boolean getFlagComissao() {
    return flagComissao;
  }
  public void setFlagComissao(Boolean flagComissao) {
    this.flagComissao = flagComissao;
  }

  
  /**
   * Indica se permite chargeback
   **/
  public GrupoTransacaoLojistaResponse flagChargeBack(Boolean flagChargeBack) {
    this.flagChargeBack = flagChargeBack;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se permite chargeback")
  @JsonProperty("flagChargeBack")
  public Boolean getFlagChargeBack() {
    return flagChargeBack;
  }
  public void setFlagChargeBack(Boolean flagChargeBack) {
    this.flagChargeBack = flagChargeBack;
  }

  
  /**
   * Indica se recebe outros d\u00E9bitos
   **/
  public GrupoTransacaoLojistaResponse flagOutrosDebitos(Boolean flagOutrosDebitos) {
    this.flagOutrosDebitos = flagOutrosDebitos;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se recebe outros d\u00E9bitos")
  @JsonProperty("flagOutrosDebitos")
  public Boolean getFlagOutrosDebitos() {
    return flagOutrosDebitos;
  }
  public void setFlagOutrosDebitos(Boolean flagOutrosDebitos) {
    this.flagOutrosDebitos = flagOutrosDebitos;
  }

  
  /**
   * Indica pagamento
   **/
  public GrupoTransacaoLojistaResponse flagPagamento(Boolean flagPagamento) {
    this.flagPagamento = flagPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica pagamento")
  @JsonProperty("flagPagamento")
  public Boolean getFlagPagamento() {
    return flagPagamento;
  }
  public void setFlagPagamento(Boolean flagPagamento) {
    this.flagPagamento = flagPagamento;
  }

  
  /**
   * Indica se recebe outros cr\u00E9ditos
   **/
  public GrupoTransacaoLojistaResponse flagOutrosCreditos(Boolean flagOutrosCreditos) {
    this.flagOutrosCreditos = flagOutrosCreditos;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se recebe outros cr\u00E9ditos")
  @JsonProperty("flagOutrosCreditos")
  public Boolean getFlagOutrosCreditos() {
    return flagOutrosCreditos;
  }
  public void setFlagOutrosCreditos(Boolean flagOutrosCreditos) {
    this.flagOutrosCreditos = flagOutrosCreditos;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrupoTransacaoLojistaResponse grupoTransacaoLojistaResponse = (GrupoTransacaoLojistaResponse) o;
    return Objects.equals(this.id, grupoTransacaoLojistaResponse.id) &&
        Objects.equals(this.descricao, grupoTransacaoLojistaResponse.descricao) &&
        Objects.equals(this.flagCompra, grupoTransacaoLojistaResponse.flagCompra) &&
        Objects.equals(this.flagSaque, grupoTransacaoLojistaResponse.flagSaque) &&
        Objects.equals(this.flagComissao, grupoTransacaoLojistaResponse.flagComissao) &&
        Objects.equals(this.flagChargeBack, grupoTransacaoLojistaResponse.flagChargeBack) &&
        Objects.equals(this.flagOutrosDebitos, grupoTransacaoLojistaResponse.flagOutrosDebitos) &&
        Objects.equals(this.flagPagamento, grupoTransacaoLojistaResponse.flagPagamento) &&
        Objects.equals(this.flagOutrosCreditos, grupoTransacaoLojistaResponse.flagOutrosCreditos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, flagCompra, flagSaque, flagComissao, flagChargeBack, flagOutrosDebitos, flagPagamento, flagOutrosCreditos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoTransacaoLojistaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    flagCompra: ").append(toIndentedString(flagCompra)).append("\n");
    sb.append("    flagSaque: ").append(toIndentedString(flagSaque)).append("\n");
    sb.append("    flagComissao: ").append(toIndentedString(flagComissao)).append("\n");
    sb.append("    flagChargeBack: ").append(toIndentedString(flagChargeBack)).append("\n");
    sb.append("    flagOutrosDebitos: ").append(toIndentedString(flagOutrosDebitos)).append("\n");
    sb.append("    flagPagamento: ").append(toIndentedString(flagPagamento)).append("\n");
    sb.append("    flagOutrosCreditos: ").append(toIndentedString(flagOutrosCreditos)).append("\n");
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

