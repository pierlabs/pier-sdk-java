package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso pa\u00C3\u00ADses
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso pa\u00C3\u00ADses")
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
   * C\u00C3\u00B3digo identificador \u00C3\u00BAnico do pa\u00C3\u00ADs na base
   **/
  public PaisResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador \u00C3\u00BAnico do pa\u00C3\u00ADs na base")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do pa\u00C3\u00ADs
   **/
  public PaisResponse codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do pa\u00C3\u00ADs")
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Sigla do pa\u00C3\u00ADs
   **/
  public PaisResponse sigla(String sigla) {
    this.sigla = sigla;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sigla do pa\u00C3\u00ADs")
  @JsonProperty("sigla")
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  
  /**
   * Nome do pa\u00C3\u00ADs
   **/
  public PaisResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do pa\u00C3\u00ADs")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Continente no qual o pa\u00C3\u00ADs faz parte
   **/
  public PaisResponse continente(ContinenteEnum continente) {
    this.continente = continente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Continente no qual o pa\u00C3\u00ADs faz parte")
  @JsonProperty("continente")
  public ContinenteEnum getContinente() {
    return continente;
  }
  public void setContinente(ContinenteEnum continente) {
    this.continente = continente;
  }

  
  /**
   * Atributo que representa se o pa\u00C3\u00ADs est\u00C3\u00A1 ativo
   **/
  public PaisResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Atributo que representa se o pa\u00C3\u00ADs est\u00C3\u00A1 ativo")
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

