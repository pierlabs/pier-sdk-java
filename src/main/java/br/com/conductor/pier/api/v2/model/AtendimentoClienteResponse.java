package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto AtendimentoCliente
 **/

@ApiModel(description = "Objeto AtendimentoCliente")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AtendimentoClienteResponse   {
  
  private Long idAtendimento = null;
  private Long idConta = null;
  private Long idTipoAtendimento = null;
  private String descricaoTipoAtendimento = null;
  private String conteudoAtendimento = null;
  private String detalhesAtendimento = null;
  private String nomeAtendente = null;
  private String nomeSistema = null;
  private String dataHoraInicioAtendimento = null;
  private String dataHoraFimAtendimento = null;
  private String dataAtendimento = null;
  private String dataAgendamento = null;
  private String dataProcessamento = null;
  private Integer flagProcessamento = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Atendimento (id)
   **/
  public AtendimentoClienteResponse idAtendimento(Long idAtendimento) {
    this.idAtendimento = idAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Atendimento (id)")
  @JsonProperty("idAtendimento")
  public Long getIdAtendimento() {
    return idAtendimento;
  }
  public void setIdAtendimento(Long idAtendimento) {
    this.idAtendimento = idAtendimento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Conta a qual o Atendimento est\u00E1 associado
   **/
  public AtendimentoClienteResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Conta a qual o Atendimento est\u00E1 associado")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo de Atendimento (id)
   **/
  public AtendimentoClienteResponse idTipoAtendimento(Long idTipoAtendimento) {
    this.idTipoAtendimento = idTipoAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo de Atendimento (id)")
  @JsonProperty("idTipoAtendimento")
  public Long getIdTipoAtendimento() {
    return idTipoAtendimento;
  }
  public void setIdTipoAtendimento(Long idTipoAtendimento) {
    this.idTipoAtendimento = idTipoAtendimento;
  }

  
  /**
   * Apresenta a descri\u00E7\u00E3o do Tipo de Atendimento
   **/
  public AtendimentoClienteResponse descricaoTipoAtendimento(String descricaoTipoAtendimento) {
    this.descricaoTipoAtendimento = descricaoTipoAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a descri\u00E7\u00E3o do Tipo de Atendimento")
  @JsonProperty("descricaoTipoAtendimento")
  public String getDescricaoTipoAtendimento() {
    return descricaoTipoAtendimento;
  }
  public void setDescricaoTipoAtendimento(String descricaoTipoAtendimento) {
    this.descricaoTipoAtendimento = descricaoTipoAtendimento;
  }

  
  /**
   * Apresenta as informa\u00E7\u00F5es que foram utilizadas para consultar, cadastrar ou alterar informa\u00E7\u00F5es relacionadas ao Atendimento.
   **/
  public AtendimentoClienteResponse conteudoAtendimento(String conteudoAtendimento) {
    this.conteudoAtendimento = conteudoAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta as informa\u00E7\u00F5es que foram utilizadas para consultar, cadastrar ou alterar informa\u00E7\u00F5es relacionadas ao Atendimento.")
  @JsonProperty("conteudoAtendimento")
  public String getConteudoAtendimento() {
    return conteudoAtendimento;
  }
  public void setConteudoAtendimento(String conteudoAtendimento) {
    this.conteudoAtendimento = conteudoAtendimento;
  }

  
  /**
   * Apresenta os detalhes lan\u00E7ados pelo sistema ou pelo Atendente durante relacionados ao Atendimento.
   **/
  public AtendimentoClienteResponse detalhesAtendimento(String detalhesAtendimento) {
    this.detalhesAtendimento = detalhesAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os detalhes lan\u00E7ados pelo sistema ou pelo Atendente durante relacionados ao Atendimento.")
  @JsonProperty("detalhesAtendimento")
  public String getDetalhesAtendimento() {
    return detalhesAtendimento;
  }
  public void setDetalhesAtendimento(String detalhesAtendimento) {
    this.detalhesAtendimento = detalhesAtendimento;
  }

  
  /**
   * Apresenta o nome do Atendente que registrou o Atendimento.
   **/
  public AtendimentoClienteResponse nomeAtendente(String nomeAtendente) {
    this.nomeAtendente = nomeAtendente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do Atendente que registrou o Atendimento.")
  @JsonProperty("nomeAtendente")
  public String getNomeAtendente() {
    return nomeAtendente;
  }
  public void setNomeAtendente(String nomeAtendente) {
    this.nomeAtendente = nomeAtendente;
  }

  
  /**
   * Apresenta o nome do Sistema, Servidor, M\u00F3dulo ou M\u00E9todo REST que originou o registro do Atendimento.
   **/
  public AtendimentoClienteResponse nomeSistema(String nomeSistema) {
    this.nomeSistema = nomeSistema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do Sistema, Servidor, M\u00F3dulo ou M\u00E9todo REST que originou o registro do Atendimento.")
  @JsonProperty("nomeSistema")
  public String getNomeSistema() {
    return nomeSistema;
  }
  public void setNomeSistema(String nomeSistema) {
    this.nomeSistema = nomeSistema;
  }

  
  /**
   * Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos.
   **/
  public AtendimentoClienteResponse dataHoraInicioAtendimento(String dataHoraInicioAtendimento) {
    this.dataHoraInicioAtendimento = dataHoraInicioAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos.")
  @JsonProperty("dataHoraInicioAtendimento")
  public String getDataHoraInicioAtendimento() {
    return dataHoraInicioAtendimento;
  }
  public void setDataHoraInicioAtendimento(String dataHoraInicioAtendimento) {
    this.dataHoraInicioAtendimento = dataHoraInicioAtendimento;
  }

  
  /**
   * Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos.
   **/
  public AtendimentoClienteResponse dataHoraFimAtendimento(String dataHoraFimAtendimento) {
    this.dataHoraFimAtendimento = dataHoraFimAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos.")
  @JsonProperty("dataHoraFimAtendimento")
  public String getDataHoraFimAtendimento() {
    return dataHoraFimAtendimento;
  }
  public void setDataHoraFimAtendimento(String dataHoraFimAtendimento) {
    this.dataHoraFimAtendimento = dataHoraFimAtendimento;
  }

  
  /**
   * Apresenta a data e hora em que o Atendimento foi realizado.
   **/
  public AtendimentoClienteResponse dataAtendimento(String dataAtendimento) {
    this.dataAtendimento = dataAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data e hora em que o Atendimento foi realizado.")
  @JsonProperty("dataAtendimento")
  public String getDataAtendimento() {
    return dataAtendimento;
  }
  public void setDataAtendimento(String dataAtendimento) {
    this.dataAtendimento = dataAtendimento;
  }

  
  /**
   * Quando utilizado, de acordo com o Tipo de Atendimento, apresenta a data e hora para processamento ou a data para retorno do Atendimento.
   **/
  public AtendimentoClienteResponse dataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Quando utilizado, de acordo com o Tipo de Atendimento, apresenta a data e hora para processamento ou a data para retorno do Atendimento.")
  @JsonProperty("dataAgendamento")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Quando utilizado, apresenta a data e hora em que a solicita\u00E7\u00E3o registrada no Atendimento fora processada.
   **/
  public AtendimentoClienteResponse dataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Quando utilizado, apresenta a data e hora em que a solicita\u00E7\u00E3o registrada no Atendimento fora processada.")
  @JsonProperty("dataProcessamento")
  public String getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * Quando aplic\u00E1vel, de acordo com o Indica se o Processamento da solicita\u00E7\u00E3o fora realizado.
   **/
  public AtendimentoClienteResponse flagProcessamento(Integer flagProcessamento) {
    this.flagProcessamento = flagProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando aplic\u00E1vel, de acordo com o Indica se o Processamento da solicita\u00E7\u00E3o fora realizado.")
  @JsonProperty("flagProcessamento")
  public Integer getFlagProcessamento() {
    return flagProcessamento;
  }
  public void setFlagProcessamento(Integer flagProcessamento) {
    this.flagProcessamento = flagProcessamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtendimentoClienteResponse atendimentoClienteResponse = (AtendimentoClienteResponse) o;
    return Objects.equals(this.idAtendimento, atendimentoClienteResponse.idAtendimento) &&
        Objects.equals(this.idConta, atendimentoClienteResponse.idConta) &&
        Objects.equals(this.idTipoAtendimento, atendimentoClienteResponse.idTipoAtendimento) &&
        Objects.equals(this.descricaoTipoAtendimento, atendimentoClienteResponse.descricaoTipoAtendimento) &&
        Objects.equals(this.conteudoAtendimento, atendimentoClienteResponse.conteudoAtendimento) &&
        Objects.equals(this.detalhesAtendimento, atendimentoClienteResponse.detalhesAtendimento) &&
        Objects.equals(this.nomeAtendente, atendimentoClienteResponse.nomeAtendente) &&
        Objects.equals(this.nomeSistema, atendimentoClienteResponse.nomeSistema) &&
        Objects.equals(this.dataHoraInicioAtendimento, atendimentoClienteResponse.dataHoraInicioAtendimento) &&
        Objects.equals(this.dataHoraFimAtendimento, atendimentoClienteResponse.dataHoraFimAtendimento) &&
        Objects.equals(this.dataAtendimento, atendimentoClienteResponse.dataAtendimento) &&
        Objects.equals(this.dataAgendamento, atendimentoClienteResponse.dataAgendamento) &&
        Objects.equals(this.dataProcessamento, atendimentoClienteResponse.dataProcessamento) &&
        Objects.equals(this.flagProcessamento, atendimentoClienteResponse.flagProcessamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAtendimento, idConta, idTipoAtendimento, descricaoTipoAtendimento, conteudoAtendimento, detalhesAtendimento, nomeAtendente, nomeSistema, dataHoraInicioAtendimento, dataHoraFimAtendimento, dataAtendimento, dataAgendamento, dataProcessamento, flagProcessamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtendimentoClienteResponse {\n");
    
    sb.append("    idAtendimento: ").append(toIndentedString(idAtendimento)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idTipoAtendimento: ").append(toIndentedString(idTipoAtendimento)).append("\n");
    sb.append("    descricaoTipoAtendimento: ").append(toIndentedString(descricaoTipoAtendimento)).append("\n");
    sb.append("    conteudoAtendimento: ").append(toIndentedString(conteudoAtendimento)).append("\n");
    sb.append("    detalhesAtendimento: ").append(toIndentedString(detalhesAtendimento)).append("\n");
    sb.append("    nomeAtendente: ").append(toIndentedString(nomeAtendente)).append("\n");
    sb.append("    nomeSistema: ").append(toIndentedString(nomeSistema)).append("\n");
    sb.append("    dataHoraInicioAtendimento: ").append(toIndentedString(dataHoraInicioAtendimento)).append("\n");
    sb.append("    dataHoraFimAtendimento: ").append(toIndentedString(dataHoraFimAtendimento)).append("\n");
    sb.append("    dataAtendimento: ").append(toIndentedString(dataAtendimento)).append("\n");
    sb.append("    dataAgendamento: ").append(toIndentedString(dataAgendamento)).append("\n");
    sb.append("    dataProcessamento: ").append(toIndentedString(dataProcessamento)).append("\n");
    sb.append("    flagProcessamento: ").append(toIndentedString(flagProcessamento)).append("\n");
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

