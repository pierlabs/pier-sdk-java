package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * D\u00C3\u00ADvida do cliente
 **/

@ApiModel(description = "D\u00C3\u00ADvida do cliente")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DividaClienteResponse   {
  
  private Long id = null;
  private String dataVencimentoFaturaAtraso = null;
  private Long quantidadeDiasAtraso = null;
  private String dataVencimentoAcordo = null;
  private Long quantidadeDiasAtrasoCorrigido = null;
  private BigDecimal valorSaldoDevedor = null;
  private BigDecimal taxaCorrecao = null;
  private BigDecimal valorCorrecao = null;
  private BigDecimal valorIOF = null;
  private BigDecimal valorSaldoCorrigido = null;
  private Long idStatusConta = null;
  private String descricaoStatusConta = null;
  private Long idStatusAcordo = null;
  private String descricaoStatusAcordo = null;
  private Long idEscritorioCobranca = null;
  private String nomeEscritorioCobranca = null;
  private String emailPessoaConta = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id)
   **/
  public DividaClienteResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Data de vencimento da cobran\u00C3\u00A7a
   **/
  public DividaClienteResponse dataVencimentoFaturaAtraso(String dataVencimentoFaturaAtraso) {
    this.dataVencimentoFaturaAtraso = dataVencimentoFaturaAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento da cobran\u00C3\u00A7a")
  @JsonProperty("dataVencimentoFaturaAtraso")
  public String getDataVencimentoFaturaAtraso() {
    return dataVencimentoFaturaAtraso;
  }
  public void setDataVencimentoFaturaAtraso(String dataVencimentoFaturaAtraso) {
    this.dataVencimentoFaturaAtraso = dataVencimentoFaturaAtraso;
  }

  
  /**
   * Quantidade de dias em atraso at\u00C3\u00A9 a data de vencimento da cobran\u00C3\u00A7a
   **/
  public DividaClienteResponse quantidadeDiasAtraso(Long quantidadeDiasAtraso) {
    this.quantidadeDiasAtraso = quantidadeDiasAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de dias em atraso at\u00C3\u00A9 a data de vencimento da cobran\u00C3\u00A7a")
  @JsonProperty("quantidadeDiasAtraso")
  public Long getQuantidadeDiasAtraso() {
    return quantidadeDiasAtraso;
  }
  public void setQuantidadeDiasAtraso(Long quantidadeDiasAtraso) {
    this.quantidadeDiasAtraso = quantidadeDiasAtraso;
  }

  
  /**
   * Data de vencimento do acordo
   **/
  public DividaClienteResponse dataVencimentoAcordo(String dataVencimentoAcordo) {
    this.dataVencimentoAcordo = dataVencimentoAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento do acordo")
  @JsonProperty("dataVencimentoAcordo")
  public String getDataVencimentoAcordo() {
    return dataVencimentoAcordo;
  }
  public void setDataVencimentoAcordo(String dataVencimentoAcordo) {
    this.dataVencimentoAcordo = dataVencimentoAcordo;
  }

  
  /**
   * Quantidade de dias em atraso at\u00C3\u00A9 a data de vencimento do acordo
   **/
  public DividaClienteResponse quantidadeDiasAtrasoCorrigido(Long quantidadeDiasAtrasoCorrigido) {
    this.quantidadeDiasAtrasoCorrigido = quantidadeDiasAtrasoCorrigido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de dias em atraso at\u00C3\u00A9 a data de vencimento do acordo")
  @JsonProperty("quantidadeDiasAtrasoCorrigido")
  public Long getQuantidadeDiasAtrasoCorrigido() {
    return quantidadeDiasAtrasoCorrigido;
  }
  public void setQuantidadeDiasAtrasoCorrigido(Long quantidadeDiasAtrasoCorrigido) {
    this.quantidadeDiasAtrasoCorrigido = quantidadeDiasAtrasoCorrigido;
  }

  
  /**
   * Valor do saldo devedor at\u00C3\u00A9 a data de vencimento da cobran\u00C3\u00A7a
   **/
  public DividaClienteResponse valorSaldoDevedor(BigDecimal valorSaldoDevedor) {
    this.valorSaldoDevedor = valorSaldoDevedor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do saldo devedor at\u00C3\u00A9 a data de vencimento da cobran\u00C3\u00A7a")
  @JsonProperty("valorSaldoDevedor")
  public BigDecimal getValorSaldoDevedor() {
    return valorSaldoDevedor;
  }
  public void setValorSaldoDevedor(BigDecimal valorSaldoDevedor) {
    this.valorSaldoDevedor = valorSaldoDevedor;
  }

  
  /**
   * Percentual de corre\u00C3\u00A7\u00C3\u00A3o
   **/
  public DividaClienteResponse taxaCorrecao(BigDecimal taxaCorrecao) {
    this.taxaCorrecao = taxaCorrecao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual de corre\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("taxaCorrecao")
  public BigDecimal getTaxaCorrecao() {
    return taxaCorrecao;
  }
  public void setTaxaCorrecao(BigDecimal taxaCorrecao) {
    this.taxaCorrecao = taxaCorrecao;
  }

  
  /**
   * Valor da corre\u00C3\u00A7\u00C3\u00A3o
   **/
  public DividaClienteResponse valorCorrecao(BigDecimal valorCorrecao) {
    this.valorCorrecao = valorCorrecao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da corre\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("valorCorrecao")
  public BigDecimal getValorCorrecao() {
    return valorCorrecao;
  }
  public void setValorCorrecao(BigDecimal valorCorrecao) {
    this.valorCorrecao = valorCorrecao;
  }

  
  /**
   * Valor do IOF devido
   **/
  public DividaClienteResponse valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do IOF devido")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor do saldo devedor corrido da d\u00C3\u00ADvida at\u00C3\u00A9 a data de vencimento do acordo
   **/
  public DividaClienteResponse valorSaldoCorrigido(BigDecimal valorSaldoCorrigido) {
    this.valorSaldoCorrigido = valorSaldoCorrigido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do saldo devedor corrido da d\u00C3\u00ADvida at\u00C3\u00A9 a data de vencimento do acordo")
  @JsonProperty("valorSaldoCorrigido")
  public BigDecimal getValorSaldoCorrigido() {
    return valorSaldoCorrigido;
  }
  public void setValorSaldoCorrigido(BigDecimal valorSaldoCorrigido) {
    this.valorSaldoCorrigido = valorSaldoCorrigido;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do status da conta (id)
   **/
  public DividaClienteResponse idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do status da conta (id)")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status da conta
   **/
  public DividaClienteResponse descricaoStatusConta(String descricaoStatusConta) {
    this.descricaoStatusConta = descricaoStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do status da conta")
  @JsonProperty("descricaoStatusConta")
  public String getDescricaoStatusConta() {
    return descricaoStatusConta;
  }
  public void setDescricaoStatusConta(String descricaoStatusConta) {
    this.descricaoStatusConta = descricaoStatusConta;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do status do acordo (id)
   **/
  public DividaClienteResponse idStatusAcordo(Long idStatusAcordo) {
    this.idStatusAcordo = idStatusAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do status do acordo (id)")
  @JsonProperty("idStatusAcordo")
  public Long getIdStatusAcordo() {
    return idStatusAcordo;
  }
  public void setIdStatusAcordo(Long idStatusAcordo) {
    this.idStatusAcordo = idStatusAcordo;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status do acordo
   **/
  public DividaClienteResponse descricaoStatusAcordo(String descricaoStatusAcordo) {
    this.descricaoStatusAcordo = descricaoStatusAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do status do acordo")
  @JsonProperty("descricaoStatusAcordo")
  public String getDescricaoStatusAcordo() {
    return descricaoStatusAcordo;
  }
  public void setDescricaoStatusAcordo(String descricaoStatusAcordo) {
    this.descricaoStatusAcordo = descricaoStatusAcordo;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do escrit\u00C3\u00B3rio de cobran\u00C3\u00A7a
   **/
  public DividaClienteResponse idEscritorioCobranca(Long idEscritorioCobranca) {
    this.idEscritorioCobranca = idEscritorioCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do escrit\u00C3\u00B3rio de cobran\u00C3\u00A7a")
  @JsonProperty("idEscritorioCobranca")
  public Long getIdEscritorioCobranca() {
    return idEscritorioCobranca;
  }
  public void setIdEscritorioCobranca(Long idEscritorioCobranca) {
    this.idEscritorioCobranca = idEscritorioCobranca;
  }

  
  /**
   * Nome do escrit\u00C3\u00B3rio de cobran\u00C3\u00A7a
   **/
  public DividaClienteResponse nomeEscritorioCobranca(String nomeEscritorioCobranca) {
    this.nomeEscritorioCobranca = nomeEscritorioCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do escrit\u00C3\u00B3rio de cobran\u00C3\u00A7a")
  @JsonProperty("nomeEscritorioCobranca")
  public String getNomeEscritorioCobranca() {
    return nomeEscritorioCobranca;
  }
  public void setNomeEscritorioCobranca(String nomeEscritorioCobranca) {
    this.nomeEscritorioCobranca = nomeEscritorioCobranca;
  }

  
  /**
   * Email do devedor
   **/
  public DividaClienteResponse emailPessoaConta(String emailPessoaConta) {
    this.emailPessoaConta = emailPessoaConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email do devedor")
  @JsonProperty("emailPessoaConta")
  public String getEmailPessoaConta() {
    return emailPessoaConta;
  }
  public void setEmailPessoaConta(String emailPessoaConta) {
    this.emailPessoaConta = emailPessoaConta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DividaClienteResponse dividaClienteResponse = (DividaClienteResponse) o;
    return Objects.equals(this.id, dividaClienteResponse.id) &&
        Objects.equals(this.dataVencimentoFaturaAtraso, dividaClienteResponse.dataVencimentoFaturaAtraso) &&
        Objects.equals(this.quantidadeDiasAtraso, dividaClienteResponse.quantidadeDiasAtraso) &&
        Objects.equals(this.dataVencimentoAcordo, dividaClienteResponse.dataVencimentoAcordo) &&
        Objects.equals(this.quantidadeDiasAtrasoCorrigido, dividaClienteResponse.quantidadeDiasAtrasoCorrigido) &&
        Objects.equals(this.valorSaldoDevedor, dividaClienteResponse.valorSaldoDevedor) &&
        Objects.equals(this.taxaCorrecao, dividaClienteResponse.taxaCorrecao) &&
        Objects.equals(this.valorCorrecao, dividaClienteResponse.valorCorrecao) &&
        Objects.equals(this.valorIOF, dividaClienteResponse.valorIOF) &&
        Objects.equals(this.valorSaldoCorrigido, dividaClienteResponse.valorSaldoCorrigido) &&
        Objects.equals(this.idStatusConta, dividaClienteResponse.idStatusConta) &&
        Objects.equals(this.descricaoStatusConta, dividaClienteResponse.descricaoStatusConta) &&
        Objects.equals(this.idStatusAcordo, dividaClienteResponse.idStatusAcordo) &&
        Objects.equals(this.descricaoStatusAcordo, dividaClienteResponse.descricaoStatusAcordo) &&
        Objects.equals(this.idEscritorioCobranca, dividaClienteResponse.idEscritorioCobranca) &&
        Objects.equals(this.nomeEscritorioCobranca, dividaClienteResponse.nomeEscritorioCobranca) &&
        Objects.equals(this.emailPessoaConta, dividaClienteResponse.emailPessoaConta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataVencimentoFaturaAtraso, quantidadeDiasAtraso, dataVencimentoAcordo, quantidadeDiasAtrasoCorrigido, valorSaldoDevedor, taxaCorrecao, valorCorrecao, valorIOF, valorSaldoCorrigido, idStatusConta, descricaoStatusConta, idStatusAcordo, descricaoStatusAcordo, idEscritorioCobranca, nomeEscritorioCobranca, emailPessoaConta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DividaClienteResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataVencimentoFaturaAtraso: ").append(toIndentedString(dataVencimentoFaturaAtraso)).append("\n");
    sb.append("    quantidadeDiasAtraso: ").append(toIndentedString(quantidadeDiasAtraso)).append("\n");
    sb.append("    dataVencimentoAcordo: ").append(toIndentedString(dataVencimentoAcordo)).append("\n");
    sb.append("    quantidadeDiasAtrasoCorrigido: ").append(toIndentedString(quantidadeDiasAtrasoCorrigido)).append("\n");
    sb.append("    valorSaldoDevedor: ").append(toIndentedString(valorSaldoDevedor)).append("\n");
    sb.append("    taxaCorrecao: ").append(toIndentedString(taxaCorrecao)).append("\n");
    sb.append("    valorCorrecao: ").append(toIndentedString(valorCorrecao)).append("\n");
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
    sb.append("    valorSaldoCorrigido: ").append(toIndentedString(valorSaldoCorrigido)).append("\n");
    sb.append("    idStatusConta: ").append(toIndentedString(idStatusConta)).append("\n");
    sb.append("    descricaoStatusConta: ").append(toIndentedString(descricaoStatusConta)).append("\n");
    sb.append("    idStatusAcordo: ").append(toIndentedString(idStatusAcordo)).append("\n");
    sb.append("    descricaoStatusAcordo: ").append(toIndentedString(descricaoStatusAcordo)).append("\n");
    sb.append("    idEscritorioCobranca: ").append(toIndentedString(idEscritorioCobranca)).append("\n");
    sb.append("    nomeEscritorioCobranca: ").append(toIndentedString(nomeEscritorioCobranca)).append("\n");
    sb.append("    emailPessoaConta: ").append(toIndentedString(emailPessoaConta)).append("\n");
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

