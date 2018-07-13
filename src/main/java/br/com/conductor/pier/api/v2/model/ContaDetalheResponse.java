package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{conta_detalhe_response_description}}}
 **/

@ApiModel(description = "{{{conta_detalhe_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaDetalheResponse   {
  
  private Long id = null;
  private Long idPessoa = null;
  private String nome = null;
  private Long idProduto = null;
  private Long idOrigemComercial = null;
  private String nomeOrigemComercial = null;
  private Long idFantasiaBasica = null;
  private String nomeFantasiaBasica = null;
  private Long idStatusConta = null;
  private String statusConta = null;
  private Integer diaVencimento = null;
  private Integer melhorDiaCompra = null;
  private String dataStatusConta = null;
  private BigDecimal valorRenda = null;
  private String dataCadastro = null;
  private String dataUltimaAlteracaoVencimento = null;
  private String dataHoraUltimaCompra = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorrente = null;
  private String formaEnvioFatura = null;
  private Boolean titular = null;
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteSaqueGlobal = null;
  private BigDecimal saldoDisponivelGlobal = null;
  private BigDecimal saldoDisponivelSaque = null;
  private Long diasAtraso = null;

  
  /**
   * {{{conta_detalhe_response_id_value}}}
   **/
  public ContaDetalheResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{conta_detalhe_response_id_pessoa_value}}}
   **/
  public ContaDetalheResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{conta_detalhe_response_nome_value}}}
   **/
  public ContaDetalheResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{conta_detalhe_response_id_produto_value}}}
   **/
  public ContaDetalheResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{conta_detalhe_response_id_origem_comercial_value}}}
   **/
  public ContaDetalheResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_id_origem_comercial_value}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{conta_detalhe_response_nome_origem_comercial_value}}}
   **/
  public ContaDetalheResponse nomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_nome_origem_comercial_value}}}")
  @JsonProperty("nomeOrigemComercial")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * {{{conta_detalhe_response_id_fantasia_basica_value}}}
   **/
  public ContaDetalheResponse idFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_id_fantasia_basica_value}}}")
  @JsonProperty("idFantasiaBasica")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * {{{conta_detalhe_response_nome_fantasia_basica_value}}}
   **/
  public ContaDetalheResponse nomeFantasiaBasica(String nomeFantasiaBasica) {
    this.nomeFantasiaBasica = nomeFantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_nome_fantasia_basica_value}}}")
  @JsonProperty("nomeFantasiaBasica")
  public String getNomeFantasiaBasica() {
    return nomeFantasiaBasica;
  }
  public void setNomeFantasiaBasica(String nomeFantasiaBasica) {
    this.nomeFantasiaBasica = nomeFantasiaBasica;
  }

  
  /**
   * {{{conta_detalhe_response_id_status_conta_value}}}
   **/
  public ContaDetalheResponse idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_id_status_conta_value}}}")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * {{{conta_detalhe_response_status_conta_value}}}
   **/
  public ContaDetalheResponse statusConta(String statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_status_conta_value}}}")
  @JsonProperty("statusConta")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * {{{conta_detalhe_response_dia_vencimento_value}}}
   **/
  public ContaDetalheResponse diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_dia_vencimento_value}}}")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{conta_detalhe_response_melhor_dia_compra_value}}}
   **/
  public ContaDetalheResponse melhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_melhor_dia_compra_value}}}")
  @JsonProperty("melhorDiaCompra")
  public Integer getMelhorDiaCompra() {
    return melhorDiaCompra;
  }
  public void setMelhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
  }

  
  /**
   * {{{conta_detalhe_response_data_status_conta_value}}}
   **/
  public ContaDetalheResponse dataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_data_status_conta_value}}}")
  @JsonProperty("dataStatusConta")
  public String getDataStatusConta() {
    return dataStatusConta;
  }
  public void setDataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
  }

  
  /**
   * {{{conta_detalhe_response_valor_renda_value}}}
   **/
  public ContaDetalheResponse valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_valor_renda_value}}}")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * {{{conta_detalhe_response_data_cadastro_value}}}
   **/
  public ContaDetalheResponse dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_data_cadastro_value}}}")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * {{{conta_detalhe_response_data_ultima_alteracao_vencimento_value}}}
   **/
  public ContaDetalheResponse dataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_data_ultima_alteracao_vencimento_value}}}")
  @JsonProperty("dataUltimaAlteracaoVencimento")
  public String getDataUltimaAlteracaoVencimento() {
    return dataUltimaAlteracaoVencimento;
  }
  public void setDataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
  }

  
  /**
   * {{{conta_detalhe_response_data_hora_ultima_compra_value}}}
   **/
  public ContaDetalheResponse dataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_data_hora_ultima_compra_value}}}")
  @JsonProperty("dataHoraUltimaCompra")
  public String getDataHoraUltimaCompra() {
    return dataHoraUltimaCompra;
  }
  public void setDataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
  }

  
  /**
   * {{{conta_detalhe_response_numero_agencia_value}}}
   **/
  public ContaDetalheResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{conta_detalhe_response_numero_conta_corrente_value}}}
   **/
  public ContaDetalheResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_numero_conta_corrente_value}}}")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{conta_detalhe_response_forma_envio_fatura_value}}}
   **/
  public ContaDetalheResponse formaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_forma_envio_fatura_value}}}")
  @JsonProperty("formaEnvioFatura")
  public String getFormaEnvioFatura() {
    return formaEnvioFatura;
  }
  public void setFormaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
  }

  
  /**
   * {{{conta_detalhe_response_titular_value}}}
   **/
  public ContaDetalheResponse titular(Boolean titular) {
    this.titular = titular;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{conta_detalhe_response_titular_value}}}")
  @JsonProperty("titular")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * {{{conta_detalhe_response_limite_global_value}}}
   **/
  public ContaDetalheResponse limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_limite_global_value}}}")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{conta_detalhe_response_limite_saque_global_value}}}
   **/
  public ContaDetalheResponse limiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_limite_saque_global_value}}}")
  @JsonProperty("limiteSaqueGlobal")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * {{{conta_detalhe_response_saldo_disponivel_global_value}}}
   **/
  public ContaDetalheResponse saldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_saldo_disponivel_global_value}}}")
  @JsonProperty("saldoDisponivelGlobal")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * {{{conta_detalhe_response_saldo_disponivel_saque_value}}}
   **/
  public ContaDetalheResponse saldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_saldo_disponivel_saque_value}}}")
  @JsonProperty("saldoDisponivelSaque")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * {{{conta_detalhe_response_dias_atraso_value}}}
   **/
  public ContaDetalheResponse diasAtraso(Long diasAtraso) {
    this.diasAtraso = diasAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_detalhe_response_dias_atraso_value}}}")
  @JsonProperty("diasAtraso")
  public Long getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Long diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaDetalheResponse contaDetalheResponse = (ContaDetalheResponse) o;
    return Objects.equals(this.id, contaDetalheResponse.id) &&
        Objects.equals(this.idPessoa, contaDetalheResponse.idPessoa) &&
        Objects.equals(this.nome, contaDetalheResponse.nome) &&
        Objects.equals(this.idProduto, contaDetalheResponse.idProduto) &&
        Objects.equals(this.idOrigemComercial, contaDetalheResponse.idOrigemComercial) &&
        Objects.equals(this.nomeOrigemComercial, contaDetalheResponse.nomeOrigemComercial) &&
        Objects.equals(this.idFantasiaBasica, contaDetalheResponse.idFantasiaBasica) &&
        Objects.equals(this.nomeFantasiaBasica, contaDetalheResponse.nomeFantasiaBasica) &&
        Objects.equals(this.idStatusConta, contaDetalheResponse.idStatusConta) &&
        Objects.equals(this.statusConta, contaDetalheResponse.statusConta) &&
        Objects.equals(this.diaVencimento, contaDetalheResponse.diaVencimento) &&
        Objects.equals(this.melhorDiaCompra, contaDetalheResponse.melhorDiaCompra) &&
        Objects.equals(this.dataStatusConta, contaDetalheResponse.dataStatusConta) &&
        Objects.equals(this.valorRenda, contaDetalheResponse.valorRenda) &&
        Objects.equals(this.dataCadastro, contaDetalheResponse.dataCadastro) &&
        Objects.equals(this.dataUltimaAlteracaoVencimento, contaDetalheResponse.dataUltimaAlteracaoVencimento) &&
        Objects.equals(this.dataHoraUltimaCompra, contaDetalheResponse.dataHoraUltimaCompra) &&
        Objects.equals(this.numeroAgencia, contaDetalheResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, contaDetalheResponse.numeroContaCorrente) &&
        Objects.equals(this.formaEnvioFatura, contaDetalheResponse.formaEnvioFatura) &&
        Objects.equals(this.titular, contaDetalheResponse.titular) &&
        Objects.equals(this.limiteGlobal, contaDetalheResponse.limiteGlobal) &&
        Objects.equals(this.limiteSaqueGlobal, contaDetalheResponse.limiteSaqueGlobal) &&
        Objects.equals(this.saldoDisponivelGlobal, contaDetalheResponse.saldoDisponivelGlobal) &&
        Objects.equals(this.saldoDisponivelSaque, contaDetalheResponse.saldoDisponivelSaque) &&
        Objects.equals(this.diasAtraso, contaDetalheResponse.diasAtraso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idPessoa, nome, idProduto, idOrigemComercial, nomeOrigemComercial, idFantasiaBasica, nomeFantasiaBasica, idStatusConta, statusConta, diaVencimento, melhorDiaCompra, dataStatusConta, valorRenda, dataCadastro, dataUltimaAlteracaoVencimento, dataHoraUltimaCompra, numeroAgencia, numeroContaCorrente, formaEnvioFatura, titular, limiteGlobal, limiteSaqueGlobal, saldoDisponivelGlobal, saldoDisponivelSaque, diasAtraso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDetalheResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    nomeOrigemComercial: ").append(toIndentedString(nomeOrigemComercial)).append("\n");
    sb.append("    idFantasiaBasica: ").append(toIndentedString(idFantasiaBasica)).append("\n");
    sb.append("    nomeFantasiaBasica: ").append(toIndentedString(nomeFantasiaBasica)).append("\n");
    sb.append("    idStatusConta: ").append(toIndentedString(idStatusConta)).append("\n");
    sb.append("    statusConta: ").append(toIndentedString(statusConta)).append("\n");
    sb.append("    diaVencimento: ").append(toIndentedString(diaVencimento)).append("\n");
    sb.append("    melhorDiaCompra: ").append(toIndentedString(melhorDiaCompra)).append("\n");
    sb.append("    dataStatusConta: ").append(toIndentedString(dataStatusConta)).append("\n");
    sb.append("    valorRenda: ").append(toIndentedString(valorRenda)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    dataUltimaAlteracaoVencimento: ").append(toIndentedString(dataUltimaAlteracaoVencimento)).append("\n");
    sb.append("    dataHoraUltimaCompra: ").append(toIndentedString(dataHoraUltimaCompra)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    formaEnvioFatura: ").append(toIndentedString(formaEnvioFatura)).append("\n");
    sb.append("    titular: ").append(toIndentedString(titular)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    limiteSaqueGlobal: ").append(toIndentedString(limiteSaqueGlobal)).append("\n");
    sb.append("    saldoDisponivelGlobal: ").append(toIndentedString(saldoDisponivelGlobal)).append("\n");
    sb.append("    saldoDisponivelSaque: ").append(toIndentedString(saldoDisponivelSaque)).append("\n");
    sb.append("    diasAtraso: ").append(toIndentedString(diasAtraso)).append("\n");
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



