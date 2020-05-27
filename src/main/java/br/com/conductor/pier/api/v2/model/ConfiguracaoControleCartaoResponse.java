package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o para resposta de dados de Configuracao de Controle do Cartao
 **/

@ApiModel(description = "Representa\u00E7\u00E3o para resposta de dados de Configuracao de Controle do Cartao")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConfiguracaoControleCartaoResponse   {
  
  private Long id = null;
  private Long idCartao = null;
  private Boolean permiteEcommerce = null;
  private Boolean permiteSaque = null;
  private Boolean permiteWallet = null;
  private Boolean permiteControleMCC = null;
  private Boolean permiteCompraInternacional = null;
  private Boolean permiteTarjaMagnetica = null;
  private Boolean permiteContactless = null;
  private BigDecimal limiteContactlessSemSenha = null;
  private String funcaoAtiva = null;

  
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
  public ConfiguracaoControleCartaoResponse permiteEcommerce(Boolean permiteEcommerce) {
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
  public ConfiguracaoControleCartaoResponse permiteSaque(Boolean permiteSaque) {
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
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por wallet
   **/
  public ConfiguracaoControleCartaoResponse permiteWallet(Boolean permiteWallet) {
    this.permiteWallet = permiteWallet;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por wallet")
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
  public ConfiguracaoControleCartaoResponse permiteControleMCC(Boolean permiteControleMCC) {
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

  
  /**
   * Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es internacionais
   **/
  public ConfiguracaoControleCartaoResponse permiteCompraInternacional(Boolean permiteCompraInternacional) {
    this.permiteCompraInternacional = permiteCompraInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es internacionais")
  @JsonProperty("permiteCompraInternacional")
  public Boolean getPermiteCompraInternacional() {
    return permiteCompraInternacional;
  }
  public void setPermiteCompraInternacional(Boolean permiteCompraInternacional) {
    this.permiteCompraInternacional = permiteCompraInternacional;
  }

  
  /**
   * Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es por tarja magnetica
   **/
  public ConfiguracaoControleCartaoResponse permiteTarjaMagnetica(Boolean permiteTarjaMagnetica) {
    this.permiteTarjaMagnetica = permiteTarjaMagnetica;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es por tarja magnetica")
  @JsonProperty("permiteTarjaMagnetica")
  public Boolean getPermiteTarjaMagnetica() {
    return permiteTarjaMagnetica;
  }
  public void setPermiteTarjaMagnetica(Boolean permiteTarjaMagnetica) {
    this.permiteTarjaMagnetica = permiteTarjaMagnetica;
  }

  
  /**
   * Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es via contactless
   **/
  public ConfiguracaoControleCartaoResponse permiteContactless(Boolean permiteContactless) {
    this.permiteContactless = permiteContactless;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es via contactless")
  @JsonProperty("permiteContactless")
  public Boolean getPermiteContactless() {
    return permiteContactless;
  }
  public void setPermiteContactless(Boolean permiteContactless) {
    this.permiteContactless = permiteContactless;
  }

  
  /**
   * Indica o limite usado em transa\u00E7\u00F5es com a fun\u00E7\u00E3o contactless sem senha. O valor m\u00E1ximo \u00E9 50 e o m\u00EDnimo \u00E9 1.
   **/
  public ConfiguracaoControleCartaoResponse limiteContactlessSemSenha(BigDecimal limiteContactlessSemSenha) {
    this.limiteContactlessSemSenha = limiteContactlessSemSenha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica o limite usado em transa\u00E7\u00F5es com a fun\u00E7\u00E3o contactless sem senha. O valor m\u00E1ximo \u00E9 50 e o m\u00EDnimo \u00E9 1.")
  @JsonProperty("limiteContactlessSemSenha")
  public BigDecimal getLimiteContactlessSemSenha() {
    return limiteContactlessSemSenha;
  }
  public void setLimiteContactlessSemSenha(BigDecimal limiteContactlessSemSenha) {
    this.limiteContactlessSemSenha = limiteContactlessSemSenha;
  }

  
  /**
   * Indica o tipo de fun\u00E7\u00E3o ativa.
   **/
  public ConfiguracaoControleCartaoResponse funcaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica o tipo de fun\u00E7\u00E3o ativa.")
  @JsonProperty("funcaoAtiva")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
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
        Objects.equals(this.permiteWallet, configuracaoControleCartaoResponse.permiteWallet) &&
        Objects.equals(this.permiteControleMCC, configuracaoControleCartaoResponse.permiteControleMCC) &&
        Objects.equals(this.permiteCompraInternacional, configuracaoControleCartaoResponse.permiteCompraInternacional) &&
        Objects.equals(this.permiteTarjaMagnetica, configuracaoControleCartaoResponse.permiteTarjaMagnetica) &&
        Objects.equals(this.permiteContactless, configuracaoControleCartaoResponse.permiteContactless) &&
        Objects.equals(this.limiteContactlessSemSenha, configuracaoControleCartaoResponse.limiteContactlessSemSenha) &&
        Objects.equals(this.funcaoAtiva, configuracaoControleCartaoResponse.funcaoAtiva);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idCartao, permiteEcommerce, permiteSaque, permiteWallet, permiteControleMCC, permiteCompraInternacional, permiteTarjaMagnetica, permiteContactless, limiteContactlessSemSenha, funcaoAtiva);
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
    sb.append("    permiteControleMCC: ").append(toIndentedString(permiteControleMCC)).append("\n");
    sb.append("    permiteCompraInternacional: ").append(toIndentedString(permiteCompraInternacional)).append("\n");
    sb.append("    permiteTarjaMagnetica: ").append(toIndentedString(permiteTarjaMagnetica)).append("\n");
    sb.append("    permiteContactless: ").append(toIndentedString(permiteContactless)).append("\n");
    sb.append("    limiteContactlessSemSenha: ").append(toIndentedString(limiteContactlessSemSenha)).append("\n");
    sb.append("    funcaoAtiva: ").append(toIndentedString(funcaoAtiva)).append("\n");
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

