package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Batch Prepaid cards
 **/

@ApiModel(description = "Batch Prepaid cards")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LoteCartoesPrePagosResponse   {
  
  private Long id = null;
  private Long idOrigemComercial = null;
  private Long idProduto = null;
  private Long idTipoCartao = null;
  private Long idImagem = null;
  private Long idEndereco = null;
  private Integer quantidade = null;
  private String dataCadastro = null;
  private String usuarioCadastro = null;
  private Integer statusProcessamento = null;
  private String identificadorExterno = null;

  
  /**
   * Identifica??o Code of the pre-paid card batch (id)
   **/
  public LoteCartoesPrePagosResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifica??o Code of the pre-paid card batch (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identifier code of the Commercial origin
   **/
  public LoteCartoesPrePagosResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier code of the Commercial origin")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Identifier Code of the Product
   **/
  public LoteCartoesPrePagosResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier Code of the Product")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identifier Code of the card type
   **/
  public LoteCartoesPrePagosResponse idTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier Code of the card type")
  @JsonProperty("idTipoCartao")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * Identifier code of the card image
   **/
  public LoteCartoesPrePagosResponse idImagem(Long idImagem) {
    this.idImagem = idImagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier code of the card image")
  @JsonProperty("idImagem")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  
  /**
   * Identification Code of the address
   **/
  public LoteCartoesPrePagosResponse idEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identification Code of the address")
  @JsonProperty("idEndereco")
  public Long getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   * Number of existing cards in the batch
   **/
  public LoteCartoesPrePagosResponse quantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of existing cards in the batch")
  @JsonProperty("quantidade")
  public Integer getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  
  /**
   * Register date of the pre-paid card batch
   **/
  public LoteCartoesPrePagosResponse dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Register date of the pre-paid card batch")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Username that created the batch
   **/
  public LoteCartoesPrePagosResponse usuarioCadastro(String usuarioCadastro) {
    this.usuarioCadastro = usuarioCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Username that created the batch")
  @JsonProperty("usuarioCadastro")
  public String getUsuarioCadastro() {
    return usuarioCadastro;
  }
  public void setUsuarioCadastro(String usuarioCadastro) {
    this.usuarioCadastro = usuarioCadastro;
  }

  
  /**
   * Indicate the processin status of the batch
   **/
  public LoteCartoesPrePagosResponse statusProcessamento(Integer statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicate the processin status of the batch")
  @JsonProperty("statusProcessamento")
  public Integer getStatusProcessamento() {
    return statusProcessamento;
  }
  public void setStatusProcessamento(Integer statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
  }

  
  /**
   * External identification number (used by the issuer)
   **/
  public LoteCartoesPrePagosResponse identificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "External identification number (used by the issuer)")
  @JsonProperty("identificadorExterno")
  public String getIdentificadorExterno() {
    return identificadorExterno;
  }
  public void setIdentificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoteCartoesPrePagosResponse loteCartoesPrePagosResponse = (LoteCartoesPrePagosResponse) o;
    return Objects.equals(this.id, loteCartoesPrePagosResponse.id) &&
        Objects.equals(this.idOrigemComercial, loteCartoesPrePagosResponse.idOrigemComercial) &&
        Objects.equals(this.idProduto, loteCartoesPrePagosResponse.idProduto) &&
        Objects.equals(this.idTipoCartao, loteCartoesPrePagosResponse.idTipoCartao) &&
        Objects.equals(this.idImagem, loteCartoesPrePagosResponse.idImagem) &&
        Objects.equals(this.idEndereco, loteCartoesPrePagosResponse.idEndereco) &&
        Objects.equals(this.quantidade, loteCartoesPrePagosResponse.quantidade) &&
        Objects.equals(this.dataCadastro, loteCartoesPrePagosResponse.dataCadastro) &&
        Objects.equals(this.usuarioCadastro, loteCartoesPrePagosResponse.usuarioCadastro) &&
        Objects.equals(this.statusProcessamento, loteCartoesPrePagosResponse.statusProcessamento) &&
        Objects.equals(this.identificadorExterno, loteCartoesPrePagosResponse.identificadorExterno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idOrigemComercial, idProduto, idTipoCartao, idImagem, idEndereco, quantidade, dataCadastro, usuarioCadastro, statusProcessamento, identificadorExterno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteCartoesPrePagosResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idTipoCartao: ").append(toIndentedString(idTipoCartao)).append("\n");
    sb.append("    idImagem: ").append(toIndentedString(idImagem)).append("\n");
    sb.append("    idEndereco: ").append(toIndentedString(idEndereco)).append("\n");
    sb.append("    quantidade: ").append(toIndentedString(quantidade)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    usuarioCadastro: ").append(toIndentedString(usuarioCadastro)).append("\n");
    sb.append("    statusProcessamento: ").append(toIndentedString(statusProcessamento)).append("\n");
    sb.append("    identificadorExterno: ").append(toIndentedString(identificadorExterno)).append("\n");
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

