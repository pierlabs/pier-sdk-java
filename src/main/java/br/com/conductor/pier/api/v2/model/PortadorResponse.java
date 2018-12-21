package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Cardholder
 **/

@ApiModel(description = "Cardholder")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PortadorResponse   {
  
  private Long idConta = null;
  private Long idProduto = null;
  private Long idPessoa = null;
  private Long idParentesco = null;
  private String tipoPortador = null;
  private String nomeImpresso = null;
  private Long idTipoCartao = null;
  private Integer flagAtivo = null;
  private String dataCadastroPortador = null;
  private String dataCancelamentoPortador = null;

  
  /**
   * Identification Code of the Account (id)
   **/
  public PortadorResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Account (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Product (id)
   **/
  public PortadorResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Product (id)")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identification Code of the Person (id)
   **/
  public PortadorResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Person (id)")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Identification Code of the Kinship (id)
   **/
  public PortadorResponse idParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Kinship (id)")
  @JsonProperty("idParentesco")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * Show the type of Cardholder, being ('H': Holder, 'A': Additional)
   **/
  public PortadorResponse tipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the type of Cardholder, being ('H': Holder, 'A': Additional)")
  @JsonProperty("tipoPortador")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * Show the name to be printed on the card
   **/
  public PortadorResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the name to be printed on the card")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Show the identification Code of the Card type (id), that will be used to create cards of this cardholder, linked to the respective account through the Idaccount field
   **/
  public PortadorResponse idTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the identification Code of the Card type (id), that will be used to create cards of this cardholder, linked to the respective account through the Idaccount field")
  @JsonProperty("idTipoCartao")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * When it is active, indicate that the register of the Cardholder is active, in issuers that make this type of manangement
   **/
  public PortadorResponse flagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When it is active, indicate that the register of the Cardholder is active, in issuers that make this type of manangement")
  @JsonProperty("flagAtivo")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * show the date which the Cardholder was registered, when there is this information
   **/
  public PortadorResponse dataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "show the date which the Cardholder was registered, when there is this information")
  @JsonProperty("dataCadastroPortador")
  public String getDataCadastroPortador() {
    return dataCadastroPortador;
  }
  public void setDataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
  }

  
  /**
   * Show the date which the Cardholder was canceled, when there is this information
   **/
  public PortadorResponse dataCancelamentoPortador(String dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the date which the Cardholder was canceled, when there is this information")
  @JsonProperty("dataCancelamentoPortador")
  public String getDataCancelamentoPortador() {
    return dataCancelamentoPortador;
  }
  public void setDataCancelamentoPortador(String dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortadorResponse portadorResponse = (PortadorResponse) o;
    return Objects.equals(this.idConta, portadorResponse.idConta) &&
        Objects.equals(this.idProduto, portadorResponse.idProduto) &&
        Objects.equals(this.idPessoa, portadorResponse.idPessoa) &&
        Objects.equals(this.idParentesco, portadorResponse.idParentesco) &&
        Objects.equals(this.tipoPortador, portadorResponse.tipoPortador) &&
        Objects.equals(this.nomeImpresso, portadorResponse.nomeImpresso) &&
        Objects.equals(this.idTipoCartao, portadorResponse.idTipoCartao) &&
        Objects.equals(this.flagAtivo, portadorResponse.flagAtivo) &&
        Objects.equals(this.dataCadastroPortador, portadorResponse.dataCadastroPortador) &&
        Objects.equals(this.dataCancelamentoPortador, portadorResponse.dataCancelamentoPortador);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idProduto, idPessoa, idParentesco, tipoPortador, nomeImpresso, idTipoCartao, flagAtivo, dataCadastroPortador, dataCancelamentoPortador);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortadorResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idParentesco: ").append(toIndentedString(idParentesco)).append("\n");
    sb.append("    tipoPortador: ").append(toIndentedString(tipoPortador)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    idTipoCartao: ").append(toIndentedString(idTipoCartao)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    dataCadastroPortador: ").append(toIndentedString(dataCadastroPortador)).append("\n");
    sb.append("    dataCancelamentoPortador: ").append(toIndentedString(dataCancelamentoPortador)).append("\n");
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

