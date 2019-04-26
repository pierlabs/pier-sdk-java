package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * ContaPersist
 **/

@ApiModel(description = "ContaPersist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaPersist   {
  
  private Long idPessoa = null;
  private Long idOrigemComercial = null;
  private Long idProduto = null;
  private Integer diaVencimento = null;
  private BigDecimal valorRenda = null;
  private String canalEntrada = null;
  private Integer valorPontuacao = null;
  private Long idEnderecoCorrespondencia = null;
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteMaximo = null;
  private BigDecimal limiteParcelas = null;
  private BigDecimal limiteConsignado = null;
  private Integer flagFaturaPorEmail = null;
  private String funcaoAtiva = null;
  private String matricula = null;
  private String responsavelDigitacao = null;
  private Integer idPromotorVenda = null;
  private Long idStatusConta = null;

  
  /**
   * C\u00F3digo identificador da pessoa na base (id)
   **/
  public ContaPersist idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador da pessoa na base (id)")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial na base (id)
   **/
  public ContaPersist idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador da origem comercial na base (id)")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo identificador do produto na base (id)
   **/
  public ContaPersist idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do produto na base (id)")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Dia do vencimento da conta
   **/
  public ContaPersist diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Dia do vencimento da conta")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Valor da renda do titular da conta
   **/
  public ContaPersist valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da renda do titular da conta")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Nome do canal por onde a conta foi cadastrada
   **/
  public ContaPersist canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do canal por onde a conta foi cadastrada")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Valor da pontua\u00E7\u00E3o da conta
   **/
  public ContaPersist valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da pontua\u00E7\u00E3o da conta")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da conta
   **/
  public ContaPersist idEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da conta")
  @JsonProperty("idEnderecoCorrespondencia")
  public Long getIdEnderecoCorrespondencia() {
    return idEnderecoCorrespondencia;
  }
  public void setIdEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
  }

  
  /**
   * Limite global da conta
   **/
  public ContaPersist limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Limite global da conta")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Limite m\u00E1ximo da conta
   **/
  public ContaPersist limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Limite m\u00E1ximo da conta")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Limite de parcelas
   **/
  public ContaPersist limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Limite de parcelas")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Limite consignado da conta
   **/
  public ContaPersist limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Limite consignado da conta")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Identifica a maneira que a fatura \u00E9 enviada
   **/
  public ContaPersist flagFaturaPorEmail(Integer flagFaturaPorEmail) {
    this.flagFaturaPorEmail = flagFaturaPorEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifica a maneira que a fatura \u00E9 enviada")
  @JsonProperty("flagFaturaPorEmail")
  public Integer getFlagFaturaPorEmail() {
    return flagFaturaPorEmail;
  }
  public void setFlagFaturaPorEmail(Integer flagFaturaPorEmail) {
    this.flagFaturaPorEmail = flagFaturaPorEmail;
  }

  
  /**
   * Fun\u00E7\u00E3o ativa da conta. Representa a fun\u00E7\u00E3o na qual a conta encontra-se habilitada. Propriedade s\u00F3 deve ser informada caso o emissor fa\u00E7a uso de fun\u00E7\u00F5es para contas.  As fun\u00E7\u00F5es dispon\u00EDveis para contas podem ser visualizadas em api/contas/tipos-funcoes
   **/
  public ContaPersist funcaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fun\u00E7\u00E3o ativa da conta. Representa a fun\u00E7\u00E3o na qual a conta encontra-se habilitada. Propriedade s\u00F3 deve ser informada caso o emissor fa\u00E7a uso de fun\u00E7\u00F5es para contas.  As fun\u00E7\u00F5es dispon\u00EDveis para contas podem ser visualizadas em api/contas/tipos-funcoes")
  @JsonProperty("funcaoAtiva")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * Matr\u00EDcula da proposta
   **/
  public ContaPersist matricula(String matricula) {
    this.matricula = matricula;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Matr\u00EDcula da proposta")
  @JsonProperty("matricula")
  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  
  /**
   * Respons\u00E1vel pela digita\u00E7\u00E3o da proposta
   **/
  public ContaPersist responsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Respons\u00E1vel pela digita\u00E7\u00E3o da proposta")
  @JsonProperty("responsavelDigitacao")
  public String getResponsavelDigitacao() {
    return responsavelDigitacao;
  }
  public void setResponsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
  }

  
  /**
   * C\u00F3digo identificador do promotor de venda
   **/
  public ContaPersist idPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do promotor de venda")
  @JsonProperty("idPromotorVenda")
  public Integer getIdPromotorVenda() {
    return idPromotorVenda;
  }
  public void setIdPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
  }

  
  /**
   * Status da conta
   **/
  public ContaPersist idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da conta")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaPersist contaPersist = (ContaPersist) o;
    return Objects.equals(this.idPessoa, contaPersist.idPessoa) &&
        Objects.equals(this.idOrigemComercial, contaPersist.idOrigemComercial) &&
        Objects.equals(this.idProduto, contaPersist.idProduto) &&
        Objects.equals(this.diaVencimento, contaPersist.diaVencimento) &&
        Objects.equals(this.valorRenda, contaPersist.valorRenda) &&
        Objects.equals(this.canalEntrada, contaPersist.canalEntrada) &&
        Objects.equals(this.valorPontuacao, contaPersist.valorPontuacao) &&
        Objects.equals(this.idEnderecoCorrespondencia, contaPersist.idEnderecoCorrespondencia) &&
        Objects.equals(this.limiteGlobal, contaPersist.limiteGlobal) &&
        Objects.equals(this.limiteMaximo, contaPersist.limiteMaximo) &&
        Objects.equals(this.limiteParcelas, contaPersist.limiteParcelas) &&
        Objects.equals(this.limiteConsignado, contaPersist.limiteConsignado) &&
        Objects.equals(this.flagFaturaPorEmail, contaPersist.flagFaturaPorEmail) &&
        Objects.equals(this.funcaoAtiva, contaPersist.funcaoAtiva) &&
        Objects.equals(this.matricula, contaPersist.matricula) &&
        Objects.equals(this.responsavelDigitacao, contaPersist.responsavelDigitacao) &&
        Objects.equals(this.idPromotorVenda, contaPersist.idPromotorVenda) &&
        Objects.equals(this.idStatusConta, contaPersist.idStatusConta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, idOrigemComercial, idProduto, diaVencimento, valorRenda, canalEntrada, valorPontuacao, idEnderecoCorrespondencia, limiteGlobal, limiteMaximo, limiteParcelas, limiteConsignado, flagFaturaPorEmail, funcaoAtiva, matricula, responsavelDigitacao, idPromotorVenda, idStatusConta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaPersist {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    diaVencimento: ").append(toIndentedString(diaVencimento)).append("\n");
    sb.append("    valorRenda: ").append(toIndentedString(valorRenda)).append("\n");
    sb.append("    canalEntrada: ").append(toIndentedString(canalEntrada)).append("\n");
    sb.append("    valorPontuacao: ").append(toIndentedString(valorPontuacao)).append("\n");
    sb.append("    idEnderecoCorrespondencia: ").append(toIndentedString(idEnderecoCorrespondencia)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    limiteMaximo: ").append(toIndentedString(limiteMaximo)).append("\n");
    sb.append("    limiteParcelas: ").append(toIndentedString(limiteParcelas)).append("\n");
    sb.append("    limiteConsignado: ").append(toIndentedString(limiteConsignado)).append("\n");
    sb.append("    flagFaturaPorEmail: ").append(toIndentedString(flagFaturaPorEmail)).append("\n");
    sb.append("    funcaoAtiva: ").append(toIndentedString(funcaoAtiva)).append("\n");
    sb.append("    matricula: ").append(toIndentedString(matricula)).append("\n");
    sb.append("    responsavelDigitacao: ").append(toIndentedString(responsavelDigitacao)).append("\n");
    sb.append("    idPromotorVenda: ").append(toIndentedString(idPromotorVenda)).append("\n");
    sb.append("    idStatusConta: ").append(toIndentedString(idStatusConta)).append("\n");
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

