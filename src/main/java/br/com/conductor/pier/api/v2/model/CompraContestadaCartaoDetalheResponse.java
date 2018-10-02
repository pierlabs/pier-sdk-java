package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * {{{compra_contestada_cartao_detalhe_response_description}}}
 **/

@ApiModel(description = "{{{compra_contestada_cartao_detalhe_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CompraContestadaCartaoDetalheResponse   {
  
  private String numeroCartao = null;
  private String portador = null;
  private Long idConta = null;
  private String nomePlastico = null;
  private Date dataValidade = null;
  private String statusCartao = null;
  private String statusCartaoDescricao = null;

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_numero_cartao_value}}}
   **/
  public CompraContestadaCartaoDetalheResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_detalhe_response_numero_cartao_value}}}")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_portador_value}}}
   **/
  public CompraContestadaCartaoDetalheResponse portador(String portador) {
    this.portador = portador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_detalhe_response_portador_value}}}")
  @JsonProperty("portador")
  public String getPortador() {
    return portador;
  }
  public void setPortador(String portador) {
    this.portador = portador;
  }

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_id_conta_value}}}
   **/
  public CompraContestadaCartaoDetalheResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_detalhe_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_nome_plastico_value}}}
   **/
  public CompraContestadaCartaoDetalheResponse nomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_detalhe_response_nome_plastico_value}}}")
  @JsonProperty("nomePlastico")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_data_validade_value}}}
   **/
  public CompraContestadaCartaoDetalheResponse dataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_detalhe_response_data_validade_value}}}")
  @JsonProperty("dataValidade")
  public Date getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_status_cartao_value}}}
   **/
  public CompraContestadaCartaoDetalheResponse statusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_detalhe_response_status_cartao_value}}}")
  @JsonProperty("statusCartao")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_status_cartao_descricao_value}}}
   **/
  public CompraContestadaCartaoDetalheResponse statusCartaoDescricao(String statusCartaoDescricao) {
    this.statusCartaoDescricao = statusCartaoDescricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_cartao_detalhe_response_status_cartao_descricao_value}}}")
  @JsonProperty("statusCartaoDescricao")
  public String getStatusCartaoDescricao() {
    return statusCartaoDescricao;
  }
  public void setStatusCartaoDescricao(String statusCartaoDescricao) {
    this.statusCartaoDescricao = statusCartaoDescricao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompraContestadaCartaoDetalheResponse compraContestadaCartaoDetalheResponse = (CompraContestadaCartaoDetalheResponse) o;
    return Objects.equals(this.numeroCartao, compraContestadaCartaoDetalheResponse.numeroCartao) &&
        Objects.equals(this.portador, compraContestadaCartaoDetalheResponse.portador) &&
        Objects.equals(this.idConta, compraContestadaCartaoDetalheResponse.idConta) &&
        Objects.equals(this.nomePlastico, compraContestadaCartaoDetalheResponse.nomePlastico) &&
        Objects.equals(this.dataValidade, compraContestadaCartaoDetalheResponse.dataValidade) &&
        Objects.equals(this.statusCartao, compraContestadaCartaoDetalheResponse.statusCartao) &&
        Objects.equals(this.statusCartaoDescricao, compraContestadaCartaoDetalheResponse.statusCartaoDescricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroCartao, portador, idConta, nomePlastico, dataValidade, statusCartao, statusCartaoDescricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraContestadaCartaoDetalheResponse {\n");
    
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    portador: ").append(toIndentedString(portador)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    nomePlastico: ").append(toIndentedString(nomePlastico)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    statusCartao: ").append(toIndentedString(statusCartao)).append("\n");
    sb.append("    statusCartaoDescricao: ").append(toIndentedString(statusCartaoDescricao)).append("\n");
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

