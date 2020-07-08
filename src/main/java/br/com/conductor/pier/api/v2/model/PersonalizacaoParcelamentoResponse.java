package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta que apresenta as informa\u00E7\u00F5es configuradas em um parcelamento personalizado
 **/

@ApiModel(description = "Objeto de resposta que apresenta as informa\u00E7\u00F5es configuradas em um parcelamento personalizado")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PersonalizacaoParcelamentoResponse   {
  
  private Long id = null;
  private Long idRegraCampanha = null;
  private Long idRegraCampanhaRotativo = null;
  private Boolean flagAntecipaContratosAbertos = null;
  private Boolean flagAntecipaParcRotativo = null;
  private Long idOperacao = null;
  private Long idOperacaoRotativo = null;

  
  /**
   * Identificador da configura\u00E7\u00E3o de parcelamento personalizado
   **/
  public PersonalizacaoParcelamentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da configura\u00E7\u00E3o de parcelamento personalizado")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da campanha
   **/
  public PersonalizacaoParcelamentoResponse idRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da campanha")
  @JsonProperty("idRegraCampanha")
  public Long getIdRegraCampanha() {
    return idRegraCampanha;
  }
  public void setIdRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
  }

  
  /**
   * Identificador da campanha de rotativo
   **/
  public PersonalizacaoParcelamentoResponse idRegraCampanhaRotativo(Long idRegraCampanhaRotativo) {
    this.idRegraCampanhaRotativo = idRegraCampanhaRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da campanha de rotativo")
  @JsonProperty("idRegraCampanhaRotativo")
  public Long getIdRegraCampanhaRotativo() {
    return idRegraCampanhaRotativo;
  }
  public void setIdRegraCampanhaRotativo(Long idRegraCampanhaRotativo) {
    this.idRegraCampanhaRotativo = idRegraCampanhaRotativo;
  }

  
  /**
   * Flag que identifica a ativa\u00E7\u00E3o da antecipa\u00E7\u00E3o de contratos abertos
   **/
  public PersonalizacaoParcelamentoResponse flagAntecipaContratosAbertos(Boolean flagAntecipaContratosAbertos) {
    this.flagAntecipaContratosAbertos = flagAntecipaContratosAbertos;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que identifica a ativa\u00E7\u00E3o da antecipa\u00E7\u00E3o de contratos abertos")
  @JsonProperty("flagAntecipaContratosAbertos")
  public Boolean getFlagAntecipaContratosAbertos() {
    return flagAntecipaContratosAbertos;
  }
  public void setFlagAntecipaContratosAbertos(Boolean flagAntecipaContratosAbertos) {
    this.flagAntecipaContratosAbertos = flagAntecipaContratosAbertos;
  }

  
  /**
   * Flag que identifica a ativa\u00E7\u00E3o da antecipa\u00E7\u00E3o de parcelamento rotativo
   **/
  public PersonalizacaoParcelamentoResponse flagAntecipaParcRotativo(Boolean flagAntecipaParcRotativo) {
    this.flagAntecipaParcRotativo = flagAntecipaParcRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que identifica a ativa\u00E7\u00E3o da antecipa\u00E7\u00E3o de parcelamento rotativo")
  @JsonProperty("flagAntecipaParcRotativo")
  public Boolean getFlagAntecipaParcRotativo() {
    return flagAntecipaParcRotativo;
  }
  public void setFlagAntecipaParcRotativo(Boolean flagAntecipaParcRotativo) {
    this.flagAntecipaParcRotativo = flagAntecipaParcRotativo;
  }

  
  /**
   * Identificador da opera\u00E7\u00E3o
   **/
  public PersonalizacaoParcelamentoResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da opera\u00E7\u00E3o")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Identificador da opera\u00E7\u00E3o de rotativo
   **/
  public PersonalizacaoParcelamentoResponse idOperacaoRotativo(Long idOperacaoRotativo) {
    this.idOperacaoRotativo = idOperacaoRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da opera\u00E7\u00E3o de rotativo")
  @JsonProperty("idOperacaoRotativo")
  public Long getIdOperacaoRotativo() {
    return idOperacaoRotativo;
  }
  public void setIdOperacaoRotativo(Long idOperacaoRotativo) {
    this.idOperacaoRotativo = idOperacaoRotativo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalizacaoParcelamentoResponse personalizacaoParcelamentoResponse = (PersonalizacaoParcelamentoResponse) o;
    return Objects.equals(this.id, personalizacaoParcelamentoResponse.id) &&
        Objects.equals(this.idRegraCampanha, personalizacaoParcelamentoResponse.idRegraCampanha) &&
        Objects.equals(this.idRegraCampanhaRotativo, personalizacaoParcelamentoResponse.idRegraCampanhaRotativo) &&
        Objects.equals(this.flagAntecipaContratosAbertos, personalizacaoParcelamentoResponse.flagAntecipaContratosAbertos) &&
        Objects.equals(this.flagAntecipaParcRotativo, personalizacaoParcelamentoResponse.flagAntecipaParcRotativo) &&
        Objects.equals(this.idOperacao, personalizacaoParcelamentoResponse.idOperacao) &&
        Objects.equals(this.idOperacaoRotativo, personalizacaoParcelamentoResponse.idOperacaoRotativo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idRegraCampanha, idRegraCampanhaRotativo, flagAntecipaContratosAbertos, flagAntecipaParcRotativo, idOperacao, idOperacaoRotativo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalizacaoParcelamentoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idRegraCampanha: ").append(toIndentedString(idRegraCampanha)).append("\n");
    sb.append("    idRegraCampanhaRotativo: ").append(toIndentedString(idRegraCampanhaRotativo)).append("\n");
    sb.append("    flagAntecipaContratosAbertos: ").append(toIndentedString(flagAntecipaContratosAbertos)).append("\n");
    sb.append("    flagAntecipaParcRotativo: ").append(toIndentedString(flagAntecipaParcRotativo)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    idOperacaoRotativo: ").append(toIndentedString(idOperacaoRotativo)).append("\n");
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

