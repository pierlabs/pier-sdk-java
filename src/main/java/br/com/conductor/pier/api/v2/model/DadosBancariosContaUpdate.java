package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{dados_bancarios_conta_update_description}}}
 **/

@ApiModel(description = "{{{dados_bancarios_conta_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DadosBancariosContaUpdate   {
  
  private Long idConta = null;
  private Long codigoBanco = null;
  private Long numeroAgencia = null;
  private String numeroContaCorrente = null;
  private Long idTipoContaBancaria = null;

  
  /**
   * {{{dados_bancarios_conta_update_idConta_value}}}
   **/
  public DadosBancariosContaUpdate idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_bancarios_conta_update_idConta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{dados_bancarios_conta_update_banco_value}}}
   **/
  public DadosBancariosContaUpdate codigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_bancarios_conta_update_banco_value}}}")
  @JsonProperty("codigoBanco")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * {{{dados_bancarios_conta_update_agencia_value}}}
   **/
  public DadosBancariosContaUpdate numeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_bancarios_conta_update_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public Long getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{dados_bancarios_conta_update_contaCorrente_value}}}
   **/
  public DadosBancariosContaUpdate numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_bancarios_conta_update_contaCorrente_value}}}")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{dados_bancarios_conta_update_idTipoContaBancaria_value}}}
   **/
  public DadosBancariosContaUpdate idTipoContaBancaria(Long idTipoContaBancaria) {
    this.idTipoContaBancaria = idTipoContaBancaria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_bancarios_conta_update_idTipoContaBancaria_value}}}")
  @JsonProperty("idTipoContaBancaria")
  public Long getIdTipoContaBancaria() {
    return idTipoContaBancaria;
  }
  public void setIdTipoContaBancaria(Long idTipoContaBancaria) {
    this.idTipoContaBancaria = idTipoContaBancaria;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosBancariosContaUpdate dadosBancariosContaUpdate = (DadosBancariosContaUpdate) o;
    return Objects.equals(this.idConta, dadosBancariosContaUpdate.idConta) &&
        Objects.equals(this.codigoBanco, dadosBancariosContaUpdate.codigoBanco) &&
        Objects.equals(this.numeroAgencia, dadosBancariosContaUpdate.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, dadosBancariosContaUpdate.numeroContaCorrente) &&
        Objects.equals(this.idTipoContaBancaria, dadosBancariosContaUpdate.idTipoContaBancaria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, codigoBanco, numeroAgencia, numeroContaCorrente, idTipoContaBancaria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosBancariosContaUpdate {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    codigoBanco: ").append(toIndentedString(codigoBanco)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    idTipoContaBancaria: ").append(toIndentedString(idTipoContaBancaria)).append("\n");
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

