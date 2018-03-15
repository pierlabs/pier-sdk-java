package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto conta
 **/

@ApiModel(description = "Objeto conta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaResponse   {
  
  private Long id = null;
  private Long idProduto = null;
  private Long idOrigemComercial = null;
  private Long idPessoa = null;
  private Long idStatusConta = null;
  private Integer diaVencimento = null;
  private Integer melhorDiaCompra = null;
  private String dataStatusConta = null;
  private String dataCadastro = null;
  private String dataUltimaAlteracaoVencimento = null;
  private BigDecimal valorRenda = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o de conta (id).
   **/
  public ContaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o de conta (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do produto ao qual a conta faz parte. (id).
   **/
  public ContaResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do produto ao qual a conta faz parte. (id).")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Origem Comercial (id) que deu origem a Conta.
   **/
  public ContaResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Origem Comercial (id) que deu origem a Conta.")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa Titular da Conta (id).
   **/
  public ContaResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa Titular da Conta (id).")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do status atribuido a conta.
   **/
  public ContaResponse idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do status atribuido a conta.")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Apresenta o dia de vencimento.
   **/
  public ContaResponse diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o dia de vencimento.")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Apresenta o melhor dia de compra.
   **/
  public ContaResponse melhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o melhor dia de compra.")
  @JsonProperty("melhorDiaCompra")
  public Integer getMelhorDiaCompra() {
    return melhorDiaCompra;
  }
  public void setMelhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
  }

  
  /**
   * Apresenta a data em que o idStatusConta atual fora atribu\u00EDdo para ela.
   **/
  public ContaResponse dataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data em que o idStatusConta atual fora atribu\u00EDdo para ela.")
  @JsonProperty("dataStatusConta")
  public String getDataStatusConta() {
    return dataStatusConta;
  }
  public void setDataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
  }

  
  /**
   * Apresenta a data em que o cart\u00E3o foi gerado.
   **/
  public ContaResponse dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data em que o cart\u00E3o foi gerado.")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Apresenta a data da ultima altera\u00E7\u00E3o de vencimento.
   **/
  public ContaResponse dataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data da ultima altera\u00E7\u00E3o de vencimento.")
  @JsonProperty("dataUltimaAlteracaoVencimento")
  public String getDataUltimaAlteracaoVencimento() {
    return dataUltimaAlteracaoVencimento;
  }
  public void setDataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
  }

  
  /**
   * Apresenta o valor da renda comprovada
   **/
  public ContaResponse valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor da renda comprovada")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaResponse contaResponse = (ContaResponse) o;
    return Objects.equals(this.id, contaResponse.id) &&
        Objects.equals(this.idProduto, contaResponse.idProduto) &&
        Objects.equals(this.idOrigemComercial, contaResponse.idOrigemComercial) &&
        Objects.equals(this.idPessoa, contaResponse.idPessoa) &&
        Objects.equals(this.idStatusConta, contaResponse.idStatusConta) &&
        Objects.equals(this.diaVencimento, contaResponse.diaVencimento) &&
        Objects.equals(this.melhorDiaCompra, contaResponse.melhorDiaCompra) &&
        Objects.equals(this.dataStatusConta, contaResponse.dataStatusConta) &&
        Objects.equals(this.dataCadastro, contaResponse.dataCadastro) &&
        Objects.equals(this.dataUltimaAlteracaoVencimento, contaResponse.dataUltimaAlteracaoVencimento) &&
        Objects.equals(this.valorRenda, contaResponse.valorRenda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idProduto, idOrigemComercial, idPessoa, idStatusConta, diaVencimento, melhorDiaCompra, dataStatusConta, dataCadastro, dataUltimaAlteracaoVencimento, valorRenda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idStatusConta: ").append(toIndentedString(idStatusConta)).append("\n");
    sb.append("    diaVencimento: ").append(toIndentedString(diaVencimento)).append("\n");
    sb.append("    melhorDiaCompra: ").append(toIndentedString(melhorDiaCompra)).append("\n");
    sb.append("    dataStatusConta: ").append(toIndentedString(dataStatusConta)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    dataUltimaAlteracaoVencimento: ").append(toIndentedString(dataUltimaAlteracaoVencimento)).append("\n");
    sb.append("    valorRenda: ").append(toIndentedString(valorRenda)).append("\n");
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

