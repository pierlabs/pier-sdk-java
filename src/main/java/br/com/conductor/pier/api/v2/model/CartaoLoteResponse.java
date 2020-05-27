package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Cartoes Lotes
 **/

@ApiModel(description = "Objeto Cartoes Lotes")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoLoteResponse   {
  
  private Long idCartao = null;
  private Long idLote = null;
  private Long idCartaoPai = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (IdCartao)
   **/
  public CartaoLoteResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (IdCartao)")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do lote (IdLote)
   **/
  public CartaoLoteResponse idLote(Long idLote) {
    this.idLote = idLote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do lote (IdLote)")
  @JsonProperty("idLote")
  public Long getIdLote() {
    return idLote;
  }
  public void setIdLote(Long idLote) {
    this.idLote = idLote;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o pai
   **/
  public CartaoLoteResponse idCartaoPai(Long idCartaoPai) {
    this.idCartaoPai = idCartaoPai;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o pai")
  @JsonProperty("idCartaoPai")
  public Long getIdCartaoPai() {
    return idCartaoPai;
  }
  public void setIdCartaoPai(Long idCartaoPai) {
    this.idCartaoPai = idCartaoPai;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoLoteResponse cartaoLoteResponse = (CartaoLoteResponse) o;
    return Objects.equals(this.idCartao, cartaoLoteResponse.idCartao) &&
        Objects.equals(this.idLote, cartaoLoteResponse.idLote) &&
        Objects.equals(this.idCartaoPai, cartaoLoteResponse.idCartaoPai);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartao, idLote, idCartaoPai);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoLoteResponse {\n");
    
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idLote: ").append(toIndentedString(idLote)).append("\n");
    sb.append("    idCartaoPai: ").append(toIndentedString(idCartaoPai)).append("\n");
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

