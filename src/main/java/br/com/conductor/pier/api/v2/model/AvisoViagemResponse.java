package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Response representation of the travel notification resource
 **/

@ApiModel(description = "Response representation of the travel notification resource")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AvisoViagemResponse   {
  
  private Long id = null;
  private Long idCartao = null;
  private String codigoPais = null;
  private String dataInicio = null;
  private String dataFim = null;
  private Integer flagAtivo = null;

  
  /**
   * Unique identifier Code of the travel notification in the base (id)
   **/
  public AvisoViagemResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier Code of the travel notification in the base (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identifier Code of the card in the base (id)
   **/
  public AvisoViagemResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the card in the base (id)")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Identifier Code of the country in the base (id)
   **/
  public AvisoViagemResponse codigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the country in the base (id)")
  @JsonProperty("codigoPais")
  public String getCodigoPais() {
    return codigoPais;
  }
  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

  
  /**
   * Beginning date of the travel notification
   **/
  public AvisoViagemResponse dataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Beginning date of the travel notification")
  @JsonProperty("dataInicio")
  public String getDataInicio() {
    return dataInicio;
  }
  public void setDataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
  }

  
  /**
   * Ending date of the travel notification
   **/
  public AvisoViagemResponse dataFim(String dataFim) {
    this.dataFim = dataFim;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ending date of the travel notification")
  @JsonProperty("dataFim")
  public String getDataFim() {
    return dataFim;
  }
  public void setDataFim(String dataFim) {
    this.dataFim = dataFim;
  }

  
  /**
   * Identify if the travel notification is active or not
   **/
  public AvisoViagemResponse flagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identify if the travel notification is active or not")
  @JsonProperty("flagAtivo")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvisoViagemResponse avisoViagemResponse = (AvisoViagemResponse) o;
    return Objects.equals(this.id, avisoViagemResponse.id) &&
        Objects.equals(this.idCartao, avisoViagemResponse.idCartao) &&
        Objects.equals(this.codigoPais, avisoViagemResponse.codigoPais) &&
        Objects.equals(this.dataInicio, avisoViagemResponse.dataInicio) &&
        Objects.equals(this.dataFim, avisoViagemResponse.dataFim) &&
        Objects.equals(this.flagAtivo, avisoViagemResponse.flagAtivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idCartao, codigoPais, dataInicio, dataFim, flagAtivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvisoViagemResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    codigoPais: ").append(toIndentedString(codigoPais)).append("\n");
    sb.append("    dataInicio: ").append(toIndentedString(dataInicio)).append("\n");
    sb.append("    dataFim: ").append(toIndentedString(dataFim)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
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

