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
public class ConfiguracaoControleCartao   {
  
  private Integer permiteEcommerce = null;
  private Integer permiteSaque = null;
  private Integer permiteWallet = null;

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce
   **/
  public ConfiguracaoControleCartao permiteEcommerce(Integer permiteEcommerce) {
    this.permiteEcommerce = permiteEcommerce;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce")
  @JsonProperty("permiteEcommerce")
  public Integer getPermiteEcommerce() {
    return permiteEcommerce;
  }
  public void setPermiteEcommerce(Integer permiteEcommerce) {
    this.permiteEcommerce = permiteEcommerce;
  }

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque
   **/
  public ConfiguracaoControleCartao permiteSaque(Integer permiteSaque) {
    this.permiteSaque = permiteSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque")
  @JsonProperty("permiteSaque")
  public Integer getPermiteSaque() {
    return permiteSaque;
  }
  public void setPermiteSaque(Integer permiteSaque) {
    this.permiteSaque = permiteSaque;
  }

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por meio wallet
   **/
  public ConfiguracaoControleCartao permiteWallet(Integer permiteWallet) {
    this.permiteWallet = permiteWallet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por meio wallet")
  @JsonProperty("permiteWallet")
  public Integer getPermiteWallet() {
    return permiteWallet;
  }
  public void setPermiteWallet(Integer permiteWallet) {
    this.permiteWallet = permiteWallet;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguracaoControleCartao configuracaoControleCartao = (ConfiguracaoControleCartao) o;
    return Objects.equals(this.permiteEcommerce, configuracaoControleCartao.permiteEcommerce) &&
        Objects.equals(this.permiteSaque, configuracaoControleCartao.permiteSaque) &&
        Objects.equals(this.permiteWallet, configuracaoControleCartao.permiteWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permiteEcommerce, permiteSaque, permiteWallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoControleCartao {\n");
    
    sb.append("    permiteEcommerce: ").append(toIndentedString(permiteEcommerce)).append("\n");
    sb.append("    permiteSaque: ").append(toIndentedString(permiteSaque)).append("\n");
    sb.append("    permiteWallet: ").append(toIndentedString(permiteWallet)).append("\n");
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

