package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * Objeto AtendimentoCliente
 **/

@ApiModel(description = "Objeto AtendimentoCliente")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AtendimentoCliente   {
  
  private Long idAtendimento = null;
  private Long idConta = null;
  private Long idTipoAtendimento = null;
  private String descricaoTipoAtendimento = null;
  private String conteudoAtendimento = null;
  private String detalhesAtendimento = null;
  private String nomeAtendente = null;
  private String nomeSistema = null;
  private Date dataHoraInicioAtendimento = null;
  private Date dataHoraFimAtendimento = null;
  private Date dataAtendimento = null;
  private Date dataAgendamento = null;
  private Date dataProcessamento = null;
  private Integer flagProcessamento = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Atendimento (id)
   **/
  public AtendimentoCliente idAtendimento(Long idAtendimento) {
    this.idAtendimento = idAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Atendimento (id)")
  @JsonProperty("idAtendimento")
  public Long getIdAtendimento() {
    return idAtendimento;
  }
  public void setIdAtendimento(Long idAtendimento) {
    this.idAtendimento = idAtendimento;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o Atendimento est\u00C3\u00A1 associado
   **/
  public AtendimentoCliente idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o Atendimento est\u00C3\u00A1 associado")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo de Atendimento (id)
   **/
  public AtendimentoCliente idTipoAtendimento(Long idTipoAtendimento) {
    this.idTipoAtendimento = idTipoAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo de Atendimento (id)")
  @JsonProperty("idTipoAtendimento")
  public Long getIdTipoAtendimento() {
    return idTipoAtendimento;
  }
  public void setIdTipoAtendimento(Long idTipoAtendimento) {
    this.idTipoAtendimento = idTipoAtendimento;
  }

  
  /**
   * Apresenta a descri\u00C3\u00A7\u00C3\u00A3o do Tipo de Atendimento
   **/
  public AtendimentoCliente descricaoTipoAtendimento(String descricaoTipoAtendimento) {
    this.descricaoTipoAtendimento = descricaoTipoAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a descri\u00C3\u00A7\u00C3\u00A3o do Tipo de Atendimento")
  @JsonProperty("descricaoTipoAtendimento")
  public String getDescricaoTipoAtendimento() {
    return descricaoTipoAtendimento;
  }
  public void setDescricaoTipoAtendimento(String descricaoTipoAtendimento) {
    this.descricaoTipoAtendimento = descricaoTipoAtendimento;
  }

  
  /**
   * Apresenta as informa\u00C3\u00A7\u00C3\u00B5es que foram utilizadas para consultar, cadastrar ou alterar informa\u00C3\u00A7\u00C3\u00B5es relacionadas ao Atendimento.
   **/
  public AtendimentoCliente conteudoAtendimento(String conteudoAtendimento) {
    this.conteudoAtendimento = conteudoAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta as informa\u00C3\u00A7\u00C3\u00B5es que foram utilizadas para consultar, cadastrar ou alterar informa\u00C3\u00A7\u00C3\u00B5es relacionadas ao Atendimento.")
  @JsonProperty("conteudoAtendimento")
  public String getConteudoAtendimento() {
    return conteudoAtendimento;
  }
  public void setConteudoAtendimento(String conteudoAtendimento) {
    this.conteudoAtendimento = conteudoAtendimento;
  }

  
  /**
   * Apresenta os detalhes lan\u00C3\u00A7ados pelo sistema ou pelo Atendente durante relacionados ao Atendimento.
   **/
  public AtendimentoCliente detalhesAtendimento(String detalhesAtendimento) {
    this.detalhesAtendimento = detalhesAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os detalhes lan\u00C3\u00A7ados pelo sistema ou pelo Atendente durante relacionados ao Atendimento.")
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
  public AtendimentoCliente nomeAtendente(String nomeAtendente) {
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
   * Apresenta o nome do Sistema, Servidor, M\u00C3\u00B3dulo ou M\u00C3\u00A9todo REST que originou o registro do Atendimento.
   **/
  public AtendimentoCliente nomeSistema(String nomeSistema) {
    this.nomeSistema = nomeSistema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do Sistema, Servidor, M\u00C3\u00B3dulo ou M\u00C3\u00A9todo REST que originou o registro do Atendimento.")
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
  public AtendimentoCliente dataHoraInicioAtendimento(Date dataHoraInicioAtendimento) {
    this.dataHoraInicioAtendimento = dataHoraInicioAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos.")
  @JsonProperty("dataHoraInicioAtendimento")
  public Date getDataHoraInicioAtendimento() {
    return dataHoraInicioAtendimento;
  }
  public void setDataHoraInicioAtendimento(Date dataHoraInicioAtendimento) {
    this.dataHoraInicioAtendimento = dataHoraInicioAtendimento;
  }

  
  /**
   * Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos.
   **/
  public AtendimentoCliente dataHoraFimAtendimento(Date dataHoraFimAtendimento) {
    this.dataHoraFimAtendimento = dataHoraFimAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos.")
  @JsonProperty("dataHoraFimAtendimento")
  public Date getDataHoraFimAtendimento() {
    return dataHoraFimAtendimento;
  }
  public void setDataHoraFimAtendimento(Date dataHoraFimAtendimento) {
    this.dataHoraFimAtendimento = dataHoraFimAtendimento;
  }

  
  /**
   * Apresenta a data em que o Atendimento foi realizado.
   **/
  public AtendimentoCliente dataAtendimento(Date dataAtendimento) {
    this.dataAtendimento = dataAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data em que o Atendimento foi realizado.")
  @JsonProperty("dataAtendimento")
  public Date getDataAtendimento() {
    return dataAtendimento;
  }
  public void setDataAtendimento(Date dataAtendimento) {
    this.dataAtendimento = dataAtendimento;
  }

  
  /**
   * Quando utilizado, de acordo com o Tipo de Atendimento, apresenta a data para processamento ou a data para retorno do Atendimento.
   **/
  public AtendimentoCliente dataAgendamento(Date dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando utilizado, de acordo com o Tipo de Atendimento, apresenta a data para processamento ou a data para retorno do Atendimento.")
  @JsonProperty("dataAgendamento")
  public Date getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(Date dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Quando utilizado, apresenta a data em que a solicita\u00C3\u00A7\u00C3\u00A3o registrada no Atendimento fora processada.
   **/
  public AtendimentoCliente dataProcessamento(Date dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando utilizado, apresenta a data em que a solicita\u00C3\u00A7\u00C3\u00A3o registrada no Atendimento fora processada.")
  @JsonProperty("dataProcessamento")
  public Date getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(Date dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * Quando aplic\u00C3\u00A1vel, de acordo com o Indica se o Processamento da solicita\u00C3\u00A7\u00C3\u00A3o fora realizado.
   **/
  public AtendimentoCliente flagProcessamento(Integer flagProcessamento) {
    this.flagProcessamento = flagProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando aplic\u00C3\u00A1vel, de acordo com o Indica se o Processamento da solicita\u00C3\u00A7\u00C3\u00A3o fora realizado.")
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
    AtendimentoCliente atendimentoCliente = (AtendimentoCliente) o;
    return Objects.equals(this.idAtendimento, atendimentoCliente.idAtendimento) &&
        Objects.equals(this.idConta, atendimentoCliente.idConta) &&
        Objects.equals(this.idTipoAtendimento, atendimentoCliente.idTipoAtendimento) &&
        Objects.equals(this.descricaoTipoAtendimento, atendimentoCliente.descricaoTipoAtendimento) &&
        Objects.equals(this.conteudoAtendimento, atendimentoCliente.conteudoAtendimento) &&
        Objects.equals(this.detalhesAtendimento, atendimentoCliente.detalhesAtendimento) &&
        Objects.equals(this.nomeAtendente, atendimentoCliente.nomeAtendente) &&
        Objects.equals(this.nomeSistema, atendimentoCliente.nomeSistema) &&
        Objects.equals(this.dataHoraInicioAtendimento, atendimentoCliente.dataHoraInicioAtendimento) &&
        Objects.equals(this.dataHoraFimAtendimento, atendimentoCliente.dataHoraFimAtendimento) &&
        Objects.equals(this.dataAtendimento, atendimentoCliente.dataAtendimento) &&
        Objects.equals(this.dataAgendamento, atendimentoCliente.dataAgendamento) &&
        Objects.equals(this.dataProcessamento, atendimentoCliente.dataProcessamento) &&
        Objects.equals(this.flagProcessamento, atendimentoCliente.flagProcessamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAtendimento, idConta, idTipoAtendimento, descricaoTipoAtendimento, conteudoAtendimento, detalhesAtendimento, nomeAtendente, nomeSistema, dataHoraInicioAtendimento, dataHoraFimAtendimento, dataAtendimento, dataAgendamento, dataProcessamento, flagProcessamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtendimentoCliente {\n");
    
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



