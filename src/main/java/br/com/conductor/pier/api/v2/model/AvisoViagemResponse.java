package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{aviso_viagem_response_description}}}
 **/

@ApiModel(description = "{{{aviso_viagem_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AvisoViagemResponse   {
  
  private Long id = null;
  private Long idCartao = null;
  private String codigoPais = null;
  private String dataInicio = null;
  private String dataFim = null;
  private Integer flagAtivo = null;

  
  /**
   * {{{aviso_viagem_response_id_value}}}
   **/
  public AvisoViagemResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aviso_viagem_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{aviso_viagem_response_id_cartao_value}}}
   **/
  public AvisoViagemResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aviso_viagem_response_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{aviso_viagem_response_codigo_pais_value}}}
   **/
  public AvisoViagemResponse codigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aviso_viagem_response_codigo_pais_value}}}")
  @JsonProperty("codigoPais")
  public String getCodigoPais() {
    return codigoPais;
  }
  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

  
  /**
   * {{{aviso_viagem_response_data_inicio_value}}}
   **/
  public AvisoViagemResponse dataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aviso_viagem_response_data_inicio_value}}}")
  @JsonProperty("dataInicio")
  public String getDataInicio() {
    return dataInicio;
  }
  public void setDataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
  }

  
  /**
   * {{{aviso_viagem_response_data_fim_value}}}
   **/
  public AvisoViagemResponse dataFim(String dataFim) {
    this.dataFim = dataFim;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aviso_viagem_response_data_fim_value}}}")
  @JsonProperty("dataFim")
  public String getDataFim() {
    return dataFim;
  }
  public void setDataFim(String dataFim) {
    this.dataFim = dataFim;
  }

  
  /**
   * {{{aviso_viagem_response_flag_ativo_value}}}
   **/
  public AvisoViagemResponse flagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aviso_viagem_response_flag_ativo_value}}}")
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



