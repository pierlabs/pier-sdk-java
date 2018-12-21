package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object security code
 **/

@ApiModel(description = "Object security code")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CodigoSegurancaResponse   {
  
  private Long id = null;
  private Long idEmissor = null;
  private String modoEnvio = null;
  private String contato = null;
  private Boolean ativo = null;
  private String dataValidade = null;

  
  /**
   * Identification Code of the Safety Code (id)
   **/
  public CodigoSegurancaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Safety Code (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Issuer. (idIssuer)
   **/
  public CodigoSegurancaResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Issuer. (idIssuer)")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Show the sending model of the Safety Code
   **/
  public CodigoSegurancaResponse modoEnvio(String modoEnvio) {
    this.modoEnvio = modoEnvio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the sending model of the Safety Code")
  @JsonProperty("modoEnvio")
  public String getModoEnvio() {
    return modoEnvio;
  }
  public void setModoEnvio(String modoEnvio) {
    this.modoEnvio = modoEnvio;
  }

  
  /**
   * Show the contact of the safety code
   **/
  public CodigoSegurancaResponse contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the contact of the safety code")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * Show the statys of the Safety Code
   **/
  public CodigoSegurancaResponse ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Show the statys of the Safety Code")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Show the expiration date of the safety code created
   **/
  public CodigoSegurancaResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the expiration date of the safety code created")
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

