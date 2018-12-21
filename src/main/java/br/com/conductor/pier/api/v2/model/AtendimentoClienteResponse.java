package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object AttendanceClient
 **/

@ApiModel(description = "Object AttendanceClient")
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
   * Identification Code of the Attendance (id)
   **/
  public AtendimentoClienteResponse idAtendimento(Long idAtendimento) {
    this.idAtendimento = idAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Attendance (id)")
  @JsonProperty("idAtendimento")
  public Long getIdAtendimento() {
    return idAtendimento;
  }
  public void setIdAtendimento(Long idAtendimento) {
    this.idAtendimento = idAtendimento;
  }

  
  /**
   * Identification Code of the account which the attendance is associated
   **/
  public AtendimentoClienteResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the account which the attendance is associated")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the type of attendance (id)
   **/
  public AtendimentoClienteResponse idTipoAtendimento(Long idTipoAtendimento) {
    this.idTipoAtendimento = idTipoAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the type of attendance (id)")
  @JsonProperty("idTipoAtendimento")
  public Long getIdTipoAtendimento() {
    return idTipoAtendimento;
  }
  public void setIdTipoAtendimento(Long idTipoAtendimento) {
    this.idTipoAtendimento = idTipoAtendimento;
  }

  
  /**
   * Show the description of the Type of Attendance
   **/
  public AtendimentoClienteResponse descricaoTipoAtendimento(String descricaoTipoAtendimento) {
    this.descricaoTipoAtendimento = descricaoTipoAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the description of the Type of Attendance")
  @JsonProperty("descricaoTipoAtendimento")
  public String getDescricaoTipoAtendimento() {
    return descricaoTipoAtendimento;
  }
  public void setDescricaoTipoAtendimento(String descricaoTipoAtendimento) {
    this.descricaoTipoAtendimento = descricaoTipoAtendimento;
  }

  
  /**
   * Show the information that were used to retrieve, register or update information related to the Attendance
   **/
  public AtendimentoClienteResponse conteudoAtendimento(String conteudoAtendimento) {
    this.conteudoAtendimento = conteudoAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the information that were used to retrieve, register or update information related to the Attendance")
  @JsonProperty("conteudoAtendimento")
  public String getConteudoAtendimento() {
    return conteudoAtendimento;
  }
  public void setConteudoAtendimento(String conteudoAtendimento) {
    this.conteudoAtendimento = conteudoAtendimento;
  }

  
  /**
   * Show the details launched by the system or by the attendant during the attendance
   **/
  public AtendimentoClienteResponse detalhesAtendimento(String detalhesAtendimento) {
    this.detalhesAtendimento = detalhesAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the details launched by the system or by the attendant during the attendance")
  @JsonProperty("detalhesAtendimento")
  public String getDetalhesAtendimento() {
    return detalhesAtendimento;
  }
  public void setDetalhesAtendimento(String detalhesAtendimento) {
    this.detalhesAtendimento = detalhesAtendimento;
  }

  
  /**
   * Show the name of the Attendant that registered the Attendance
   **/
  public AtendimentoClienteResponse nomeAtendente(String nomeAtendente) {
    this.nomeAtendente = nomeAtendente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the name of the Attendant that registered the Attendance")
  @JsonProperty("nomeAtendente")
  public String getNomeAtendente() {
    return nomeAtendente;
  }
  public void setNomeAtendente(String nomeAtendente) {
    this.nomeAtendente = nomeAtendente;
  }

  
  /**
   * Show the name of the System, Server, Module or Method REST that originated the register of the Attendance
   **/
  public AtendimentoClienteResponse nomeSistema(String nomeSistema) {
    this.nomeSistema = nomeSistema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the name of the System, Server, Module or Method REST that originated the register of the Attendance")
  @JsonProperty("nomeSistema")
  public String getNomeSistema() {
    return nomeSistema;
  }
  public void setNomeSistema(String nomeSistema) {
    this.nomeSistema = nomeSistema;
  }

  
  /**
   * Show the date and time which the attendance was begun. Whe it is used, it serves to measure the performance of the attendances
   **/
  public AtendimentoClienteResponse dataHoraInicioAtendimento(String dataHoraInicioAtendimento) {
    this.dataHoraInicioAtendimento = dataHoraInicioAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Show the date and time which the attendance was begun. Whe it is used, it serves to measure the performance of the attendances")
  @JsonProperty("dataHoraInicioAtendimento")
  public String getDataHoraInicioAtendimento() {
    return dataHoraInicioAtendimento;
  }
  public void setDataHoraInicioAtendimento(String dataHoraInicioAtendimento) {
    this.dataHoraInicioAtendimento = dataHoraInicioAtendimento;
  }

  
  /**
   * Show the date and time which the attendance was begun. When it is used, it serves to measure the performance of the attendances
   **/
  public AtendimentoClienteResponse dataHoraFimAtendimento(String dataHoraFimAtendimento) {
    this.dataHoraFimAtendimento = dataHoraFimAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Show the date and time which the attendance was begun. When it is used, it serves to measure the performance of the attendances")
  @JsonProperty("dataHoraFimAtendimento")
  public String getDataHoraFimAtendimento() {
    return dataHoraFimAtendimento;
  }
  public void setDataHoraFimAtendimento(String dataHoraFimAtendimento) {
    this.dataHoraFimAtendimento = dataHoraFimAtendimento;
  }

  
  /**
   * Present the date and time which the attendance was made
   **/
  public AtendimentoClienteResponse dataAtendimento(String dataAtendimento) {
    this.dataAtendimento = dataAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Present the date and time which the attendance was made")
  @JsonProperty("dataAtendimento")
  public String getDataAtendimento() {
    return dataAtendimento;
  }
  public void setDataAtendimento(String dataAtendimento) {
    this.dataAtendimento = dataAtendimento;
  }

  
  /**
   * When it is used, according to the type of attendance, show the date and time for the processing or the date to return the Attendance
   **/
  public AtendimentoClienteResponse dataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "When it is used, according to the type of attendance, show the date and time for the processing or the date to return the Attendance")
  @JsonProperty("dataAgendamento")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * When it is used, show the date and time which the request registered in the attendance
   **/
  public AtendimentoClienteResponse dataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "When it is used, show the date and time which the request registered in the attendance")
  @JsonProperty("dataProcessamento")
  public String getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * when applicable, according to the indication if the resquest processing has been made
   **/
  public AtendimentoClienteResponse flagProcessamento(Integer flagProcessamento) {
    this.flagProcessamento = flagProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "when applicable, according to the indication if the resquest processing has been made")
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

