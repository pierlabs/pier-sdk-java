package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.CdtDetalheOportunidadeAUD;
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
public class OportunidadeAUDResponse   {
  
  private Long id = null;
  private Long idTipoOportunidade = null;
  private Long idStatusOportunidade = null;
  private String dataCadastro = null;
  private String dataAtualizacao = null;
  private String numeroReceitaFederal = null;
  private String dataInicioVigencia = null;
  private String dataFimVigencia = null;
  private Boolean flagAtivo = null;
  private List<CdtDetalheOportunidadeAUD> detalhes = new ArrayList<CdtDetalheOportunidadeAUD>();
  private String revDate = null;
  private Long revType = null;
  private Long rev = null;

  
  /**
   * C\u00F3digo identificador da oportunidade
   **/
  public OportunidadeAUDResponse id(Long id) {
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
  public OportunidadeAUDResponse idTipoOportunidade(Long idTipoOportunidade) {
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
  public OportunidadeAUDResponse idStatusOportunidade(Long idStatusOportunidade) {
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
  public OportunidadeAUDResponse dataCadastro(String dataCadastro) {
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
  public OportunidadeAUDResponse dataAtualizacao(String dataAtualizacao) {
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
  public OportunidadeAUDResponse numeroReceitaFederal(String numeroReceitaFederal) {
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
  public OportunidadeAUDResponse dataInicioVigencia(String dataInicioVigencia) {
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
   * fim da vig\u00EAncia da oportunidade
   **/
  public OportunidadeAUDResponse dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "fim da vig\u00EAncia da oportunidade")
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
  public OportunidadeAUDResponse flagAtivo(Boolean flagAtivo) {
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
  public OportunidadeAUDResponse detalhes(List<CdtDetalheOportunidadeAUD> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de detalhes da oportunidade")
  @JsonProperty("detalhes")
  public List<CdtDetalheOportunidadeAUD> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<CdtDetalheOportunidadeAUD> detalhes) {
    this.detalhes = detalhes;
  }

  
  /**
   * Data da auditoria
   **/
  public OportunidadeAUDResponse revDate(String revDate) {
    this.revDate = revDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da auditoria")
  @JsonProperty("revDate")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   * Tipo da auditoria
   **/
  public OportunidadeAUDResponse revType(Long revType) {
    this.revType = revType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo da auditoria")
  @JsonProperty("revType")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
  }

  
  /**
   * Identificador da auditoria
   **/
  public OportunidadeAUDResponse rev(Long rev) {
    this.rev = rev;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da auditoria")
  @JsonProperty("rev")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OportunidadeAUDResponse oportunidadeAUDResponse = (OportunidadeAUDResponse) o;
    return Objects.equals(this.id, oportunidadeAUDResponse.id) &&
        Objects.equals(this.idTipoOportunidade, oportunidadeAUDResponse.idTipoOportunidade) &&
        Objects.equals(this.idStatusOportunidade, oportunidadeAUDResponse.idStatusOportunidade) &&
        Objects.equals(this.dataCadastro, oportunidadeAUDResponse.dataCadastro) &&
        Objects.equals(this.dataAtualizacao, oportunidadeAUDResponse.dataAtualizacao) &&
        Objects.equals(this.numeroReceitaFederal, oportunidadeAUDResponse.numeroReceitaFederal) &&
        Objects.equals(this.dataInicioVigencia, oportunidadeAUDResponse.dataInicioVigencia) &&
        Objects.equals(this.dataFimVigencia, oportunidadeAUDResponse.dataFimVigencia) &&
        Objects.equals(this.flagAtivo, oportunidadeAUDResponse.flagAtivo) &&
        Objects.equals(this.detalhes, oportunidadeAUDResponse.detalhes) &&
        Objects.equals(this.revDate, oportunidadeAUDResponse.revDate) &&
        Objects.equals(this.revType, oportunidadeAUDResponse.revType) &&
        Objects.equals(this.rev, oportunidadeAUDResponse.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoOportunidade, idStatusOportunidade, dataCadastro, dataAtualizacao, numeroReceitaFederal, dataInicioVigencia, dataFimVigencia, flagAtivo, detalhes, revDate, revType, rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OportunidadeAUDResponse {\n");
    
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
    sb.append("    revDate: ").append(toIndentedString(revDate)).append("\n");
    sb.append("    revType: ").append(toIndentedString(revType)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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

