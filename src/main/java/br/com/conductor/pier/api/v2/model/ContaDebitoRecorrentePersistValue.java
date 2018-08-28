package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{conta_debito_recorrente_persist_description}}}
 **/

@ApiModel(description = "{{{conta_debito_recorrente_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaDebitoRecorrentePersistValue   {
  
  private Long idConta = null;
  private Long idTipoDebitoRecorrente = null;
  private Long idUsuario = null;
  private String login = null;
  private Integer numeroParcelas = null;

  
  /**
   * {{{conta_debito_recorrente_persist_id_conta_value}}}
   **/
  public ContaDebitoRecorrentePersistValue idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_debito_recorrente_persist_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{conta_debito_recorrente_persist_id_tipo_debito_recorrente_value}}}
   **/
  public ContaDebitoRecorrentePersistValue idTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_debito_recorrente_persist_id_tipo_debito_recorrente_value}}}")
  @JsonProperty("idTipoDebitoRecorrente")
  public Long getIdTipoDebitoRecorrente() {
    return idTipoDebitoRecorrente;
  }
  public void setIdTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
  }

  
  /**
   * {{{conta_debito_recorrente_persist_id_usuario_value}}}
   **/
  public ContaDebitoRecorrentePersistValue idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_debito_recorrente_persist_id_usuario_value}}}")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * {{{conta_debito_recorrente_persist_login_value}}}
   **/
  public ContaDebitoRecorrentePersistValue login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_debito_recorrente_persist_login_value}}}")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{conta_debito_recorrente_persist_num_parcelas_value}}}
   **/
  public ContaDebitoRecorrentePersistValue numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_debito_recorrente_persist_num_parcelas_value}}}")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaDebitoRecorrentePersistValue contaDebitoRecorrentePersistValue = (ContaDebitoRecorrentePersistValue) o;
    return Objects.equals(this.idConta, contaDebitoRecorrentePersistValue.idConta) &&
        Objects.equals(this.idTipoDebitoRecorrente, contaDebitoRecorrentePersistValue.idTipoDebitoRecorrente) &&
        Objects.equals(this.idUsuario, contaDebitoRecorrentePersistValue.idUsuario) &&
        Objects.equals(this.login, contaDebitoRecorrentePersistValue.login) &&
        Objects.equals(this.numeroParcelas, contaDebitoRecorrentePersistValue.numeroParcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idTipoDebitoRecorrente, idUsuario, login, numeroParcelas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoRecorrentePersistValue {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idTipoDebitoRecorrente: ").append(toIndentedString(idTipoDebitoRecorrente)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
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

