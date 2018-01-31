package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Lote Cart\u00C3\u00B5es Pr\u00C3\u00A9-Pagos
 **/

@ApiModel(description = "Lote Cart\u00C3\u00B5es Pr\u00C3\u00A9-Pagos")
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do lote de cart\u00C3\u00B5es pr\u00C3\u00A9-pagos (id).
   **/
  public LoteCartoesPrePagosResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do lote de cart\u00C3\u00B5es pr\u00C3\u00A9-pagos (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da origem comercial.
   **/
  public LoteCartoesPrePagosResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificador da origem comercial.")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do Produto.
   **/
  public LoteCartoesPrePagosResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificador do Produto.")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do tipo do cart\u00C3\u00A3o.
   **/
  public LoteCartoesPrePagosResponse idTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificador do tipo do cart\u00C3\u00A3o.")
  @JsonProperty("idTipoCartao")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da Imagem do cart\u00C3\u00A3o.
   **/
  public LoteCartoesPrePagosResponse idImagem(Long idImagem) {
    this.idImagem = idImagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificador da Imagem do cart\u00C3\u00A3o.")
  @JsonProperty("idImagem")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o.
   **/
  public LoteCartoesPrePagosResponse idEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o.")
  @JsonProperty("idEndereco")
  public Long getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   * N\u00C3\u00BAmero de cart\u00C3\u00B5es existentes no Lote.
   **/
  public LoteCartoesPrePagosResponse quantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00C3\u00BAmero de cart\u00C3\u00B5es existentes no Lote.")
  @JsonProperty("quantidade")
  public Integer getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  
  /**
   * Data de cadastro do lote de cart\u00C3\u00B5es pr\u00C3\u00A9-pagos.
   **/
  public LoteCartoesPrePagosResponse dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Data de cadastro do lote de cart\u00C3\u00B5es pr\u00C3\u00A9-pagos.")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Nome do usu\u00C3\u00A1rio que criou o lote.
   **/
  public LoteCartoesPrePagosResponse usuarioCadastro(String usuarioCadastro) {
    this.usuarioCadastro = usuarioCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome do usu\u00C3\u00A1rio que criou o lote.")
  @JsonProperty("usuarioCadastro")
  public String getUsuarioCadastro() {
    return usuarioCadastro;
  }
  public void setUsuarioCadastro(String usuarioCadastro) {
    this.usuarioCadastro = usuarioCadastro;
  }

  
  /**
   * Indica o status de processamento do lote.
   **/
  public LoteCartoesPrePagosResponse statusProcessamento(Integer statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica o status de processamento do lote.")
  @JsonProperty("statusProcessamento")
  public Integer getStatusProcessamento() {
    return statusProcessamento;
  }
  public void setStatusProcessamento(Integer statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
  }

  
  /**
   * N\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o externo (utilizado pelo emissor).
   **/
  public LoteCartoesPrePagosResponse identificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o externo (utilizado pelo emissor).")
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

