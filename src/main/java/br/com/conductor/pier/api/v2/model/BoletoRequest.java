package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Par\u00E2metros de requisi\u00E7\u00E3o de um Boleto
 **/

@ApiModel(description = "Par\u00E2metros de requisi\u00E7\u00E3o de um Boleto")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BoletoRequest   {
  
  private Long idConta = null;
  private Long tipoBoleto = null;
  private BigDecimal valor = null;
  private String dataVencimento = null;
  private Long idConvenio = null;
  private Long idPessoafontePagadora = null;
  private Integer tipoPagamento = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta (ID)
   **/
  public BoletoRequest idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o da Conta (ID)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Tipo de Boleto a ser gerado
   **/
  public BoletoRequest tipoBoleto(Long tipoBoleto) {
    this.tipoBoleto = tipoBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Tipo de Boleto a ser gerado")
  @JsonProperty("tipoBoleto")
  public Long getTipoBoleto() {
    return tipoBoleto;
  }
  public void setTipoBoleto(Long tipoBoleto) {
    this.tipoBoleto = tipoBoleto;
  }

  
  /**
   * Valor da cobran\u00E7a gerada
   **/
  public BoletoRequest valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da cobran\u00E7a gerada")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Data de vencimento da cobran\u00E7a
   **/
  public BoletoRequest dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Data de vencimento da cobran\u00E7a")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio para onde o boleto deve ser gerado
   **/
  public BoletoRequest idConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio para onde o boleto deve ser gerado")
  @JsonProperty("idConvenio")
  public Long getIdConvenio() {
    return idConvenio;
  }
  public void setIdConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da pessoa que ser\u00E1 a fonte pagadora do boleto
   **/
  public BoletoRequest idPessoafontePagadora(Long idPessoafontePagadora) {
    this.idPessoafontePagadora = idPessoafontePagadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da pessoa que ser\u00E1 a fonte pagadora do boleto")
  @JsonProperty("idPessoafontePagadora")
  public Long getIdPessoafontePagadora() {
    return idPessoafontePagadora;
  }
  public void setIdPessoafontePagadora(Long idPessoafontePagadora) {
    this.idPessoafontePagadora = idPessoafontePagadora;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de pagamento
   **/
  public BoletoRequest tipoPagamento(Integer tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de pagamento")
  @JsonProperty("tipoPagamento")
  public Integer getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(Integer tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoletoRequest boletoRequest = (BoletoRequest) o;
    return Objects.equals(this.idConta, boletoRequest.idConta) &&
        Objects.equals(this.tipoBoleto, boletoRequest.tipoBoleto) &&
        Objects.equals(this.valor, boletoRequest.valor) &&
        Objects.equals(this.dataVencimento, boletoRequest.dataVencimento) &&
        Objects.equals(this.idConvenio, boletoRequest.idConvenio) &&
        Objects.equals(this.idPessoafontePagadora, boletoRequest.idPessoafontePagadora) &&
        Objects.equals(this.tipoPagamento, boletoRequest.tipoPagamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, tipoBoleto, valor, dataVencimento, idConvenio, idPessoafontePagadora, tipoPagamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoRequest {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    tipoBoleto: ").append(toIndentedString(tipoBoleto)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    idConvenio: ").append(toIndentedString(idConvenio)).append("\n");
    sb.append("    idPessoafontePagadora: ").append(toIndentedString(idPessoafontePagadora)).append("\n");
    sb.append("    tipoPagamento: ").append(toIndentedString(tipoPagamento)).append("\n");
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

