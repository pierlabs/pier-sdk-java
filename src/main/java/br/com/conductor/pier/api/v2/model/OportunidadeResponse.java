package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.DetalheOportunidadeResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Representa\u00E7\u00E3o da resposta do recurso Oportunidades
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso Oportunidades")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OportunidadeResponse   {
  
  private Long id = null;
  private Long idTipoOportunidade = null;
  private Long idStatusOportunidade = null;
  private String dataCadastro = null;
  private String dataAtualizacao = null;
  private String numeroReceitaFederal = null;
  private String dataInicioVigencia = null;
  private String dataFimVigencia = null;
  private Boolean flagAtivo = null;
  private List<DetalheOportunidadeResponse> detalhes = new ArrayList<DetalheOportunidadeResponse>();

  
  /**
   * C\u00F3digo identificador da oportunidade
   **/
  public OportunidadeResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da oportunidade")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador do tipo oportunidade
   **/
  public OportunidadeResponse idTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do tipo oportunidade")
  @JsonProperty("idTipoOportunidade")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * C\u00F3digo identificador do status oportunidade
   **/
  public OportunidadeResponse idStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do status oportunidade")
  @JsonProperty("idStatusOportunidade")
  public Long getIdStatusOportunidade() {
    return idStatusOportunidade;
  }
  public void setIdStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
  }

  
  /**
   * Data cadastro da oportunidade.
   **/
  public OportunidadeResponse dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data cadastro da oportunidade.")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Data atualiza\u00E7\u00E3o da oportunidade.
   **/
  public OportunidadeResponse dataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data atualiza\u00E7\u00E3o da oportunidade.")
  @JsonProperty("dataAtualizacao")
  public String getDataAtualizacao() {
    return dataAtualizacao;
  }
  public void setDataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  
  /**
   * N\u00FAmero receita federal do cliente ao qual ser\u00E1 ofertada a oportunidade
   **/
  public OportunidadeResponse numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero receita federal do cliente ao qual ser\u00E1 ofertada a oportunidade")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * In\u00EDcio da vig\u00EAncia da oportunidade
   **/
  public OportunidadeResponse dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "In\u00EDcio da vig\u00EAncia da oportunidade")
  @JsonProperty("dataInicioVigencia")
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }
  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  
  /**
   * Fim da vig\u00EAncia da oportunidade
   **/
  public OportunidadeResponse dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Fim da vig\u00EAncia da oportunidade")
  @JsonProperty("dataFimVigencia")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }
  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  
  /**
   * Flag de verifica\u00E7\u00E3o se a oportunidade est\u00E1 ativa
   **/
  public OportunidadeResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Flag de verifica\u00E7\u00E3o se a oportunidade est\u00E1 ativa")
  @JsonProperty("flagAtivo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Lista de detalhes da oportunidade
   **/
  public OportunidadeResponse detalhes(List<DetalheOportunidadeResponse> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de detalhes da oportunidade")
  @JsonProperty("detalhes")
  public List<DetalheOportunidadeResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<DetalheOportunidadeResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OportunidadeResponse oportunidadeResponse = (OportunidadeResponse) o;
    return Objects.equals(this.id, oportunidadeResponse.id) &&
        Objects.equals(this.idTipoOportunidade, oportunidadeResponse.idTipoOportunidade) &&
        Objects.equals(this.idStatusOportunidade, oportunidadeResponse.idStatusOportunidade) &&
        Objects.equals(this.dataCadastro, oportunidadeResponse.dataCadastro) &&
        Objects.equals(this.dataAtualizacao, oportunidadeResponse.dataAtualizacao) &&
        Objects.equals(this.numeroReceitaFederal, oportunidadeResponse.numeroReceitaFederal) &&
        Objects.equals(this.dataInicioVigencia, oportunidadeResponse.dataInicioVigencia) &&
        Objects.equals(this.dataFimVigencia, oportunidadeResponse.dataFimVigencia) &&
        Objects.equals(this.flagAtivo, oportunidadeResponse.flagAtivo) &&
        Objects.equals(this.detalhes, oportunidadeResponse.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoOportunidade, idStatusOportunidade, dataCadastro, dataAtualizacao, numeroReceitaFederal, dataInicioVigencia, dataFimVigencia, flagAtivo, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OportunidadeResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoOportunidade: ").append(toIndentedString(idTipoOportunidade)).append("\n");
    sb.append("    idStatusOportunidade: ").append(toIndentedString(idStatusOportunidade)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    dataAtualizacao: ").append(toIndentedString(dataAtualizacao)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
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

