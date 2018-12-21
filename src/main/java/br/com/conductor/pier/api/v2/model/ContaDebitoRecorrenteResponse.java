package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Response Representation of the Recurrent Debit Account resource
 **/

@ApiModel(description = "Response Representation of the Recurrent Debit Account resource")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaDebitoRecorrenteResponse   {
  
  private Boolean ativo = null;
  private String dataHoraFim = null;
  private String dataHoraInicio = null;
  private String dataHoraUltimoPagamento = null;
  private String descricao = null;
  private Long idConta = null;
  private Long idContaDebitoRecorrente = null;
  private Long idTipoDebitoRecorrente = null;
  private Long idUsuario = null;
  private String login = null;
  private Integer numeroParcelas = null;
  private String origem = null;

  
  /**
   * Identify if the debit recurrent is active
   **/
  public ContaDebitoRecorrenteResponse ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Identify if the debit recurrent is active")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Ending date the recurrent debit
   **/
  public ContaDebitoRecorrenteResponse dataHoraFim(String dataHoraFim) {
    this.dataHoraFim = dataHoraFim;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ending date the recurrent debit")
  @JsonProperty("dataHoraFim")
  public String getDataHoraFim() {
    return dataHoraFim;
  }
  public void setDataHoraFim(String dataHoraFim) {
    this.dataHoraFim = dataHoraFim;
  }

  
  /**
   * Beginning date of the recurrent debit
   **/
  public ContaDebitoRecorrenteResponse dataHoraInicio(String dataHoraInicio) {
    this.dataHoraInicio = dataHoraInicio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Beginning date of the recurrent debit")
  @JsonProperty("dataHoraInicio")
  public String getDataHoraInicio() {
    return dataHoraInicio;
  }
  public void setDataHoraInicio(String dataHoraInicio) {
    this.dataHoraInicio = dataHoraInicio;
  }

  
  /**
   * Date of the last payment effected
   **/
  public ContaDebitoRecorrenteResponse dataHoraUltimoPagamento(String dataHoraUltimoPagamento) {
    this.dataHoraUltimoPagamento = dataHoraUltimoPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of the last payment effected")
  @JsonProperty("dataHoraUltimoPagamento")
  public String getDataHoraUltimoPagamento() {
    return dataHoraUltimoPagamento;
  }
  public void setDataHoraUltimoPagamento(String dataHoraUltimoPagamento) {
    this.dataHoraUltimoPagamento = dataHoraUltimoPagamento;
  }

  
  /**
   * Description of the type of recurrent debit
   **/
  public ContaDebitoRecorrenteResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the type of recurrent debit")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Identification Code of the Account (id)
   **/
  public ContaDebitoRecorrenteResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Account (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the DebitAccountRecurrent (id)
   **/
  public ContaDebitoRecorrenteResponse idContaDebitoRecorrente(Long idContaDebitoRecorrente) {
    this.idContaDebitoRecorrente = idContaDebitoRecorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the DebitAccountRecurrent (id)")
  @JsonProperty("idContaDebitoRecorrente")
  public Long getIdContaDebitoRecorrente() {
    return idContaDebitoRecorrente;
  }
  public void setIdContaDebitoRecorrente(Long idContaDebitoRecorrente) {
    this.idContaDebitoRecorrente = idContaDebitoRecorrente;
  }

  
  /**
   * Identification Code of the type of recurrent debit (id)
   **/
  public ContaDebitoRecorrenteResponse idTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the type of recurrent debit (id)")
  @JsonProperty("idTipoDebitoRecorrente")
  public Long getIdTipoDebitoRecorrente() {
    return idTipoDebitoRecorrente;
  }
  public void setIdTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
  }

  
  /**
   * Logged user id
   **/
  public ContaDebitoRecorrenteResponse idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Logged user id")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * User loging logged in the system
   **/
  public ContaDebitoRecorrenteResponse login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User loging logged in the system")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Portion quantity for recurrent debit
   **/
  public ContaDebitoRecorrenteResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Portion quantity for recurrent debit")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Origin where was made the register modification
   **/
  public ContaDebitoRecorrenteResponse origem(String origem) {
    this.origem = origem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origin where was made the register modification")
  @JsonProperty("origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaDebitoRecorrenteResponse contaDebitoRecorrenteResponse = (ContaDebitoRecorrenteResponse) o;
    return Objects.equals(this.ativo, contaDebitoRecorrenteResponse.ativo) &&
        Objects.equals(this.dataHoraFim, contaDebitoRecorrenteResponse.dataHoraFim) &&
        Objects.equals(this.dataHoraInicio, contaDebitoRecorrenteResponse.dataHoraInicio) &&
        Objects.equals(this.dataHoraUltimoPagamento, contaDebitoRecorrenteResponse.dataHoraUltimoPagamento) &&
        Objects.equals(this.descricao, contaDebitoRecorrenteResponse.descricao) &&
        Objects.equals(this.idConta, contaDebitoRecorrenteResponse.idConta) &&
        Objects.equals(this.idContaDebitoRecorrente, contaDebitoRecorrenteResponse.idContaDebitoRecorrente) &&
        Objects.equals(this.idTipoDebitoRecorrente, contaDebitoRecorrenteResponse.idTipoDebitoRecorrente) &&
        Objects.equals(this.idUsuario, contaDebitoRecorrenteResponse.idUsuario) &&
        Objects.equals(this.login, contaDebitoRecorrenteResponse.login) &&
        Objects.equals(this.numeroParcelas, contaDebitoRecorrenteResponse.numeroParcelas) &&
        Objects.equals(this.origem, contaDebitoRecorrenteResponse.origem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ativo, dataHoraFim, dataHoraInicio, dataHoraUltimoPagamento, descricao, idConta, idContaDebitoRecorrente, idTipoDebitoRecorrente, idUsuario, login, numeroParcelas, origem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoRecorrenteResponse {\n");
    
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
    sb.append("    dataHoraFim: ").append(toIndentedString(dataHoraFim)).append("\n");
    sb.append("    dataHoraInicio: ").append(toIndentedString(dataHoraInicio)).append("\n");
    sb.append("    dataHoraUltimoPagamento: ").append(toIndentedString(dataHoraUltimoPagamento)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idContaDebitoRecorrente: ").append(toIndentedString(idContaDebitoRecorrente)).append("\n");
    sb.append("    idTipoDebitoRecorrente: ").append(toIndentedString(idTipoDebitoRecorrente)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
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

