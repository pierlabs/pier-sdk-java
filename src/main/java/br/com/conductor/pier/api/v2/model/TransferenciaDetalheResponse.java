package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{transferencia_detalhe_response_description}}}
 **/

@ApiModel(description = "{{{transferencia_detalhe_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaDetalheResponse   {
  
  private Long id = null;
  private String dataTransferencia = null;
  private Long idContaOrigem = null;
  private String nomePessoaOrigem = null;
  private Long idContaDestino = null;
  private String nomePessoaDestino = null;
  private BigDecimal valorTransferencia = null;
  private BigDecimal valorTarifa = null;

  
  /**
   * {{{transferencia_detalhe_response_id_value}}}
   **/
  public TransferenciaDetalheResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_detalhe_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{transferencia_detalhe_response_data_transferencia_value}}}
   **/
  public TransferenciaDetalheResponse dataTransferencia(String dataTransferencia) {
    this.dataTransferencia = dataTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_detalhe_response_data_transferencia_value}}}")
  @JsonProperty("dataTransferencia")
  public String getDataTransferencia() {
    return dataTransferencia;
  }
  public void setDataTransferencia(String dataTransferencia) {
    this.dataTransferencia = dataTransferencia;
  }

  
  /**
   * {{{transferencia_detalhe_response_id_conta_origem_value}}}
   **/
  public TransferenciaDetalheResponse idContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_detalhe_response_id_conta_origem_value}}}")
  @JsonProperty("idContaOrigem")
  public Long getIdContaOrigem() {
    return idContaOrigem;
  }
  public void setIdContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
  }

  
  /**
   * {{{transferencia_detalhe_response_nome_pessoa_origem_value}}}
   **/
  public TransferenciaDetalheResponse nomePessoaOrigem(String nomePessoaOrigem) {
    this.nomePessoaOrigem = nomePessoaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_detalhe_response_nome_pessoa_origem_value}}}")
  @JsonProperty("nomePessoaOrigem")
  public String getNomePessoaOrigem() {
    return nomePessoaOrigem;
  }
  public void setNomePessoaOrigem(String nomePessoaOrigem) {
    this.nomePessoaOrigem = nomePessoaOrigem;
  }

  
  /**
   * {{{transferencia_detalhe_response_id_conta_destino_value}}}
   **/
  public TransferenciaDetalheResponse idContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_detalhe_response_id_conta_destino_value}}}")
  @JsonProperty("idContaDestino")
  public Long getIdContaDestino() {
    return idContaDestino;
  }
  public void setIdContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
  }

  
  /**
   * {{{transferencia_detalhe_response_nome_pessoa_destino_value}}}
   **/
  public TransferenciaDetalheResponse nomePessoaDestino(String nomePessoaDestino) {
    this.nomePessoaDestino = nomePessoaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_detalhe_response_nome_pessoa_destino_value}}}")
  @JsonProperty("nomePessoaDestino")
  public String getNomePessoaDestino() {
    return nomePessoaDestino;
  }
  public void setNomePessoaDestino(String nomePessoaDestino) {
    this.nomePessoaDestino = nomePessoaDestino;
  }

  
  /**
   * {{{transferencia_detalhe_response_valor_transferencia_value}}}
   **/
  public TransferenciaDetalheResponse valorTransferencia(BigDecimal valorTransferencia) {
    this.valorTransferencia = valorTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_detalhe_response_valor_transferencia_value}}}")
  @JsonProperty("valorTransferencia")
  public BigDecimal getValorTransferencia() {
    return valorTransferencia;
  }
  public void setValorTransferencia(BigDecimal valorTransferencia) {
    this.valorTransferencia = valorTransferencia;
  }

  
  /**
   * {{{transferencia_detalhe_response_valor_tarifa_value}}}
   **/
  public TransferenciaDetalheResponse valorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_detalhe_response_valor_tarifa_value}}}")
  @JsonProperty("valorTarifa")
  public BigDecimal getValorTarifa() {
    return valorTarifa;
  }
  public void setValorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferenciaDetalheResponse transferenciaDetalheResponse = (TransferenciaDetalheResponse) o;
    return Objects.equals(this.id, transferenciaDetalheResponse.id) &&
        Objects.equals(this.dataTransferencia, transferenciaDetalheResponse.dataTransferencia) &&
        Objects.equals(this.idContaOrigem, transferenciaDetalheResponse.idContaOrigem) &&
        Objects.equals(this.nomePessoaOrigem, transferenciaDetalheResponse.nomePessoaOrigem) &&
        Objects.equals(this.idContaDestino, transferenciaDetalheResponse.idContaDestino) &&
        Objects.equals(this.nomePessoaDestino, transferenciaDetalheResponse.nomePessoaDestino) &&
        Objects.equals(this.valorTransferencia, transferenciaDetalheResponse.valorTransferencia) &&
        Objects.equals(this.valorTarifa, transferenciaDetalheResponse.valorTarifa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataTransferencia, idContaOrigem, nomePessoaOrigem, idContaDestino, nomePessoaDestino, valorTransferencia, valorTarifa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaDetalheResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataTransferencia: ").append(toIndentedString(dataTransferencia)).append("\n");
    sb.append("    idContaOrigem: ").append(toIndentedString(idContaOrigem)).append("\n");
    sb.append("    nomePessoaOrigem: ").append(toIndentedString(nomePessoaOrigem)).append("\n");
    sb.append("    idContaDestino: ").append(toIndentedString(idContaDestino)).append("\n");
    sb.append("    nomePessoaDestino: ").append(toIndentedString(nomePessoaDestino)).append("\n");
    sb.append("    valorTransferencia: ").append(toIndentedString(valorTransferencia)).append("\n");
    sb.append("    valorTarifa: ").append(toIndentedString(valorTarifa)).append("\n");
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



