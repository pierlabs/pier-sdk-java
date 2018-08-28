package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{codigo_seguranca_response_description}}}
 **/

@ApiModel(description = "{{{codigo_seguranca_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CodigoSegurancaResponse   {
  
  private Long id = null;
  private Long idEmissor = null;
  private String modoEnvio = null;
  private String contato = null;
  private Boolean ativo = null;
  private String dataValidade = null;

  
  /**
   * {{{codigo_seguranca_response_id_value}}}
   **/
  public CodigoSegurancaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{codigo_seguranca_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{codigo_seguranca_response_id_emissor_value}}}
   **/
  public CodigoSegurancaResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{codigo_seguranca_response_id_emissor_value}}}")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{codigo_seguranca_response_modo_envio_value}}}
   **/
  public CodigoSegurancaResponse modoEnvio(String modoEnvio) {
    this.modoEnvio = modoEnvio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{codigo_seguranca_response_modo_envio_value}}}")
  @JsonProperty("modoEnvio")
  public String getModoEnvio() {
    return modoEnvio;
  }
  public void setModoEnvio(String modoEnvio) {
    this.modoEnvio = modoEnvio;
  }

  
  /**
   * {{{codigo_seguranca_response_contato_value}}}
   **/
  public CodigoSegurancaResponse contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{codigo_seguranca_response_contato_value}}}")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * {{{codigo_seguranca_response_ativo_value}}}
   **/
  public CodigoSegurancaResponse ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{codigo_seguranca_response_ativo_value}}}")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * {{{codigo_seguranca_response_data_validade_value}}}
   **/
  public CodigoSegurancaResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{codigo_seguranca_response_data_validade_value}}}")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodigoSegurancaResponse codigoSegurancaResponse = (CodigoSegurancaResponse) o;
    return Objects.equals(this.id, codigoSegurancaResponse.id) &&
        Objects.equals(this.idEmissor, codigoSegurancaResponse.idEmissor) &&
        Objects.equals(this.modoEnvio, codigoSegurancaResponse.modoEnvio) &&
        Objects.equals(this.contato, codigoSegurancaResponse.contato) &&
        Objects.equals(this.ativo, codigoSegurancaResponse.ativo) &&
        Objects.equals(this.dataValidade, codigoSegurancaResponse.dataValidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idEmissor, modoEnvio, contato, ativo, dataValidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    modoEnvio: ").append(toIndentedString(modoEnvio)).append("\n");
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
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

