package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto para persist\u00EAncia de Configuracao de Controle do Cartao
 **/

@ApiModel(description = "Objeto para persist\u00EAncia de Configuracao de Controle do Cartao")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConfiguracaoControleCartaoPersist   {
  
  private Boolean permiteEcommerce = null;
  private Boolean permiteSaque = null;
  private Boolean permiteWallet = null;
  private Boolean permiteControleMCC = null;

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce
   **/
  public ConfiguracaoControleCartaoPersist permiteEcommerce(Boolean permiteEcommerce) {
    this.permiteEcommerce = permiteEcommerce;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce")
  @JsonProperty("permiteEcommerce")
  public Boolean getPermiteEcommerce() {
    return permiteEcommerce;
  }
  public void setPermiteEcommerce(Boolean permiteEcommerce) {
    this.permiteEcommerce = permiteEcommerce;
  }

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque
   **/
  public ConfiguracaoControleCartaoPersist permiteSaque(Boolean permiteSaque) {
    this.permiteSaque = permiteSaque;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque")
  @JsonProperty("permiteSaque")
  public Boolean getPermiteSaque() {
    return permiteSaque;
  }
  public void setPermiteSaque(Boolean permiteSaque) {
    this.permiteSaque = permiteSaque;
  }

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por meio wallet
   **/
  public ConfiguracaoControleCartaoPersist permiteWallet(Boolean permiteWallet) {
    this.permiteWallet = permiteWallet;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por meio wallet")
  @JsonProperty("permiteWallet")
  public Boolean getPermiteWallet() {
    return permiteWallet;
  }
  public void setPermiteWallet(Boolean permiteWallet) {
    this.permiteWallet = permiteWallet;
  }

  
  /**
   * Indica se o cart\u00E3o est\u00E1 ativo para controle por grupos de MCCs
   **/
  public ConfiguracaoControleCartaoPersist permiteControleMCC(Boolean permiteControleMCC) {
    this.permiteControleMCC = permiteControleMCC;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o cart\u00E3o est\u00E1 ativo para controle por grupos de MCCs")
  @JsonProperty("permiteControleMCC")
  public Boolean getPermiteControleMCC() {
    return permiteControleMCC;
  }
  public void setPermiteControleMCC(Boolean permiteControleMCC) {
    this.permiteControleMCC = permiteControleMCC;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguracaoControleCartaoPersist configuracaoControleCartaoPersist = (ConfiguracaoControleCartaoPersist) o;
    return Objects.equals(this.permiteEcommerce, configuracaoControleCartaoPersist.permiteEcommerce) &&
        Objects.equals(this.permiteSaque, configuracaoControleCartaoPersist.permiteSaque) &&
        Objects.equals(this.permiteWallet, configuracaoControleCartaoPersist.permiteWallet) &&
        Objects.equals(this.permiteControleMCC, configuracaoControleCartaoPersist.permiteControleMCC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permiteEcommerce, permiteSaque, permiteWallet, permiteControleMCC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoControleCartaoPersist {\n");
    
    sb.append("    permiteEcommerce: ").append(toIndentedString(permiteEcommerce)).append("\n");
    sb.append("    permiteSaque: ").append(toIndentedString(permiteSaque)).append("\n");
    sb.append("    permiteWallet: ").append(toIndentedString(permiteWallet)).append("\n");
    sb.append("    permiteControleMCC: ").append(toIndentedString(permiteControleMCC)).append("\n");
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

