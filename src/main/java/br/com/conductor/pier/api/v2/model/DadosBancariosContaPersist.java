package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{dados_bancarios_conta_persist_description}}}
 **/

@ApiModel(description = "{{{dados_bancarios_conta_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DadosBancariosContaPersist   {
  
  private Long idConta = null;
  private Long numeroAgencia = null;
  private String numeroContaCorrente = null;
  private Long codigoBanco = null;
  private Long idTipoContaBancaria = null;
  private String dvContaCorrente = null;
  private Integer dvAgencia = null;

  
  /**
   * {{{dados_bancarios_conta_persist_id_conta_value}}}
   **/
  public DadosBancariosContaPersist idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_bancarios_conta_persist_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{dados_bancarios_conta_persist_numero_agencia_value}}}
   **/
  public DadosBancariosContaPersist numeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_bancarios_conta_persist_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public Long getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{dados_bancarios_conta_persist_numero_conta_corrente_value}}}
   **/
  public DadosBancariosContaPersist numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_bancarios_conta_persist_numero_conta_corrente_value}}}")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{dados_bancarios_conta_persist_codigo_banco_value}}}
   **/
  public DadosBancariosContaPersist codigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_bancarios_conta_persist_codigo_banco_value}}}")
  @JsonProperty("codigoBanco")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * {{{dados_bancarios_conta_persist_id_tipo_conta_bancaria_value}}}
   **/
  public DadosBancariosContaPersist idTipoContaBancaria(Long idTipoContaBancaria) {
    this.idTipoContaBancaria = idTipoContaBancaria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_bancarios_conta_persist_id_tipo_conta_bancaria_value}}}")
  @JsonProperty("idTipoContaBancaria")
  public Long getIdTipoContaBancaria() {
    return idTipoContaBancaria;
  }
  public void setIdTipoContaBancaria(Long idTipoContaBancaria) {
    this.idTipoContaBancaria = idTipoContaBancaria;
  }

  
  /**
   **/
  public DadosBancariosContaPersist dvContaCorrente(String dvContaCorrente) {
    this.dvContaCorrente = dvContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dvContaCorrente")
  public String getDvContaCorrente() {
    return dvContaCorrente;
  }
  public void setDvContaCorrente(String dvContaCorrente) {
    this.dvContaCorrente = dvContaCorrente;
  }

  
  /**
   **/
  public DadosBancariosContaPersist dvAgencia(Integer dvAgencia) {
    this.dvAgencia = dvAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dvAgencia")
  public Integer getDvAgencia() {
    return dvAgencia;
  }
  public void setDvAgencia(Integer dvAgencia) {
    this.dvAgencia = dvAgencia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosBancariosContaPersist dadosBancariosContaPersist = (DadosBancariosContaPersist) o;
    return Objects.equals(this.idConta, dadosBancariosContaPersist.idConta) &&
        Objects.equals(this.numeroAgencia, dadosBancariosContaPersist.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, dadosBancariosContaPersist.numeroContaCorrente) &&
        Objects.equals(this.codigoBanco, dadosBancariosContaPersist.codigoBanco) &&
        Objects.equals(this.idTipoContaBancaria, dadosBancariosContaPersist.idTipoContaBancaria) &&
        Objects.equals(this.dvContaCorrente, dadosBancariosContaPersist.dvContaCorrente) &&
        Objects.equals(this.dvAgencia, dadosBancariosContaPersist.dvAgencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, numeroAgencia, numeroContaCorrente, codigoBanco, idTipoContaBancaria, dvContaCorrente, dvAgencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosBancariosContaPersist {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    codigoBanco: ").append(toIndentedString(codigoBanco)).append("\n");
    sb.append("    idTipoContaBancaria: ").append(toIndentedString(idTipoContaBancaria)).append("\n");
    sb.append("    dvContaCorrente: ").append(toIndentedString(dvContaCorrente)).append("\n");
    sb.append("    dvAgencia: ").append(toIndentedString(dvAgencia)).append("\n");
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

