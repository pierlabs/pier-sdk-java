package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o para resposta de dados de Configuracao de Controle do Cartao
 **/

@ApiModel(description = "Representa\u00E7\u00E3o para resposta de dados de Configuracao de Controle do Cartao")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConfiguracaoControleCartaoResponse   {
  
  private Long id = null;
  private Long idCartao = null;
  private Integer permiteEcommerce = null;
  private Integer permiteSaque = null;
  private Integer permiteWallet = null;

  
  /**
   * C\u00F3digo Identificador da configura\u00E7\u00E3o na base (id)
   **/
  public ConfiguracaoControleCartaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo Identificador da configura\u00E7\u00E3o na base (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo Identificador do cart\u00E3o na base (id)
   **/
  public ConfiguracaoControleCartaoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo Identificador do cart\u00E3o na base (id)")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce
   **/
  public ConfiguracaoControleCartaoResponse permiteEcommerce(Integer permiteEcommerce) {
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
  public ConfiguracaoControleCartaoResponse permiteSaque(Integer permiteSaque) {
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
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por wallet
   **/
  public ConfiguracaoControleCartaoResponse permiteWallet(Integer permiteWallet) {
    this.permiteWallet = permiteWallet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por wallet")
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
    ConfiguracaoControleCartaoResponse configuracaoControleCartaoResponse = (ConfiguracaoControleCartaoResponse) o;
    return Objects.equals(this.id, configuracaoControleCartaoResponse.id) &&
        Objects.equals(this.idCartao, configuracaoControleCartaoResponse.idCartao) &&
        Objects.equals(this.permiteEcommerce, configuracaoControleCartaoResponse.permiteEcommerce) &&
        Objects.equals(this.permiteSaque, configuracaoControleCartaoResponse.permiteSaque) &&
        Objects.equals(this.permiteWallet, configuracaoControleCartaoResponse.permiteWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idCartao, permiteEcommerce, permiteSaque, permiteWallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoControleCartaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
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

