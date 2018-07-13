package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{pais_response_description}}}
 **/

@ApiModel(description = "{{{pais_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PaisResponse   {
  
  private Long id = null;
  private String codigo = null;
  private String sigla = null;
  private String descricao = null;


  public enum ContinenteEnum {
    AFRICA("AFRICA"),
    AMERICA_LATINA("AMERICA_LATINA"),
    AMERICA_NORTE("AMERICA_NORTE"),
    ASIA("ASIA"),
    ANTARTIDA("ANTARTIDA"),
    EUROPA("EUROPA"),
    OCEANIA("OCEANIA");

    private String value;

    ContinenteEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ContinenteEnum continente = null;
  private Boolean flagAtivo = null;

  
  /**
   * {{{pais_response_id_value}}}
   **/
  public PaisResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pais_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{pais_response_codigo_value}}}
   **/
  public PaisResponse codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pais_response_codigo_value}}}")
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * {{{pais_response_sigla_value}}}
   **/
  public PaisResponse sigla(String sigla) {
    this.sigla = sigla;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pais_response_sigla_value}}}")
  @JsonProperty("sigla")
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  
  /**
   * {{{pais_response_descricao_value}}}
   **/
  public PaisResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pais_response_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{pais_response_continente_value}}}
   **/
  public PaisResponse continente(ContinenteEnum continente) {
    this.continente = continente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pais_response_continente_value}}}")
  @JsonProperty("continente")
  public ContinenteEnum getContinente() {
    return continente;
  }
  public void setContinente(ContinenteEnum continente) {
    this.continente = continente;
  }

  
  /**
   * {{{pais_response_flag_ativo_value}}}
   **/
  public PaisResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{pais_response_flag_ativo_value}}}")
  @JsonProperty("flagAtivo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
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
    PaisResponse paisResponse = (PaisResponse) o;
    return Objects.equals(this.id, paisResponse.id) &&
        Objects.equals(this.codigo, paisResponse.codigo) &&
        Objects.equals(this.sigla, paisResponse.sigla) &&
        Objects.equals(this.descricao, paisResponse.descricao) &&
        Objects.equals(this.continente, paisResponse.continente) &&
        Objects.equals(this.flagAtivo, paisResponse.flagAtivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codigo, sigla, descricao, continente, flagAtivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaisResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    sigla: ").append(toIndentedString(sigla)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    continente: ").append(toIndentedString(continente)).append("\n");
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



