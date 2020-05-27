package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CdtTipoOperacao   {
  
  private String codigoProcessamento = null;
  private String codigoProcessamentoCancelamento = null;
  private String descricao = null;
  private BigDecimal excedentePermitido = null;
  private Boolean flagCobraJuros = null;
  private Boolean flagCobraProRata = null;
  private Boolean flagCobraTarifa = null;
  private Boolean flagCredito = null;
  private Boolean flagCreditoContestavel = null;
  private Boolean flagIOFApartado = null;
  private Boolean flagManterTaxaJurosNoRotativo = null;
  private Boolean flagPermitirParcelamento = null;
  private Integer flagPosProximoVencimento = null;
  private Integer flagTiraTac = null;
  private Long id = null;
  private Integer idEmissor = null;
  private Long idOperacaoOrigem = null;
  private Long idTabela = null;
  private Long idTabelaJuros = null;
  private String nome = null;
  private BigDecimal percentualTac = null;
  private Integer planoMaximo = null;
  private Integer planoMinimo = null;
  private BigDecimal remuneracaoEmissor = null;
  private BigDecimal tarifa = null;
  private BigDecimal taxaJuros = null;
  private String tipoExcedentePermitido = null;
  private String tipoOperacao = null;
  private BigDecimal valorMaximo = null;
  private BigDecimal valorMinimo = null;
  private BigDecimal valorOperacao = null;
  private Long valorParcela = null;
  private BigDecimal valorTAC = null;

  
  /**
   **/
  public CdtTipoOperacao codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   **/
  public CdtTipoOperacao codigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoProcessamentoCancelamento")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   **/
  public CdtTipoOperacao descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  public CdtTipoOperacao excedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("excedentePermitido")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   **/
  public CdtTipoOperacao flagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagCobraJuros")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   **/
  public CdtTipoOperacao flagCobraProRata(Boolean flagCobraProRata) {
    this.flagCobraProRata = flagCobraProRata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagCobraProRata")
  public Boolean getFlagCobraProRata() {
    return flagCobraProRata;
  }
  public void setFlagCobraProRata(Boolean flagCobraProRata) {
    this.flagCobraProRata = flagCobraProRata;
  }

  
  /**
   **/
  public CdtTipoOperacao flagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagCobraTarifa")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   **/
  public CdtTipoOperacao flagCredito(Boolean flagCredito) {
    this.flagCredito = flagCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagCredito")
  public Boolean getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Boolean flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   **/
  public CdtTipoOperacao flagCreditoContestavel(Boolean flagCreditoContestavel) {
    this.flagCreditoContestavel = flagCreditoContestavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagCreditoContestavel")
  public Boolean getFlagCreditoContestavel() {
    return flagCreditoContestavel;
  }
  public void setFlagCreditoContestavel(Boolean flagCreditoContestavel) {
    this.flagCreditoContestavel = flagCreditoContestavel;
  }

  
  /**
   **/
  public CdtTipoOperacao flagIOFApartado(Boolean flagIOFApartado) {
    this.flagIOFApartado = flagIOFApartado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagIOFApartado")
  public Boolean getFlagIOFApartado() {
    return flagIOFApartado;
  }
  public void setFlagIOFApartado(Boolean flagIOFApartado) {
    this.flagIOFApartado = flagIOFApartado;
  }

  
  /**
   **/
  public CdtTipoOperacao flagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagManterTaxaJurosNoRotativo")
  public Boolean getFlagManterTaxaJurosNoRotativo() {
    return flagManterTaxaJurosNoRotativo;
  }
  public void setFlagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
  }

  
  /**
   **/
  public CdtTipoOperacao flagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagPermitirParcelamento")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
  }

  
  /**
   **/
  public CdtTipoOperacao flagPosProximoVencimento(Integer flagPosProximoVencimento) {
    this.flagPosProximoVencimento = flagPosProximoVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagPosProximoVencimento")
  public Integer getFlagPosProximoVencimento() {
    return flagPosProximoVencimento;
  }
  public void setFlagPosProximoVencimento(Integer flagPosProximoVencimento) {
    this.flagPosProximoVencimento = flagPosProximoVencimento;
  }

  
  /**
   **/
  public CdtTipoOperacao flagTiraTac(Integer flagTiraTac) {
    this.flagTiraTac = flagTiraTac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagTiraTac")
  public Integer getFlagTiraTac() {
    return flagTiraTac;
  }
  public void setFlagTiraTac(Integer flagTiraTac) {
    this.flagTiraTac = flagTiraTac;
  }

  
  /**
   **/
  public CdtTipoOperacao id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  public CdtTipoOperacao idEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idEmissor")
  public Integer getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   **/
  public CdtTipoOperacao idOperacaoOrigem(Long idOperacaoOrigem) {
    this.idOperacaoOrigem = idOperacaoOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idOperacaoOrigem")
  public Long getIdOperacaoOrigem() {
    return idOperacaoOrigem;
  }
  public void setIdOperacaoOrigem(Long idOperacaoOrigem) {
    this.idOperacaoOrigem = idOperacaoOrigem;
  }

  
  /**
   **/
  public CdtTipoOperacao idTabela(Long idTabela) {
    this.idTabela = idTabela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idTabela")
  public Long getIdTabela() {
    return idTabela;
  }
  public void setIdTabela(Long idTabela) {
    this.idTabela = idTabela;
  }

  
  /**
   **/
  public CdtTipoOperacao idTabelaJuros(Long idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idTabelaJuros")
  public Long getIdTabelaJuros() {
    return idTabelaJuros;
  }
  public void setIdTabelaJuros(Long idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
  }

  
  /**
   **/
  public CdtTipoOperacao nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   **/
  public CdtTipoOperacao percentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("percentualTac")
  public BigDecimal getPercentualTac() {
    return percentualTac;
  }
  public void setPercentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
  }

  
  /**
   **/
  public CdtTipoOperacao planoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("planoMaximo")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   **/
  public CdtTipoOperacao planoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("planoMinimo")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   **/
  public CdtTipoOperacao remuneracaoEmissor(BigDecimal remuneracaoEmissor) {
    this.remuneracaoEmissor = remuneracaoEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remuneracaoEmissor")
  public BigDecimal getRemuneracaoEmissor() {
    return remuneracaoEmissor;
  }
  public void setRemuneracaoEmissor(BigDecimal remuneracaoEmissor) {
    this.remuneracaoEmissor = remuneracaoEmissor;
  }

  
  /**
   **/
  public CdtTipoOperacao tarifa(BigDecimal tarifa) {
    this.tarifa = tarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tarifa")
  public BigDecimal getTarifa() {
    return tarifa;
  }
  public void setTarifa(BigDecimal tarifa) {
    this.tarifa = tarifa;
  }

  
  /**
   **/
  public CdtTipoOperacao taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   **/
  public CdtTipoOperacao tipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoExcedentePermitido")
  public String getTipoExcedentePermitido() {
    return tipoExcedentePermitido;
  }
  public void setTipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
  }

  
  /**
   **/
  public CdtTipoOperacao tipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoOperacao")
  public String getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   **/
  public CdtTipoOperacao valorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorMaximo")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   **/
  public CdtTipoOperacao valorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorMinimo")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   **/
  public CdtTipoOperacao valorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorOperacao")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  
  /**
   **/
  public CdtTipoOperacao valorParcela(Long valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorParcela")
  public Long getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(Long valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   **/
  public CdtTipoOperacao valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdtTipoOperacao cdtTipoOperacao = (CdtTipoOperacao) o;
    return Objects.equals(this.codigoProcessamento, cdtTipoOperacao.codigoProcessamento) &&
        Objects.equals(this.codigoProcessamentoCancelamento, cdtTipoOperacao.codigoProcessamentoCancelamento) &&
        Objects.equals(this.descricao, cdtTipoOperacao.descricao) &&
        Objects.equals(this.excedentePermitido, cdtTipoOperacao.excedentePermitido) &&
        Objects.equals(this.flagCobraJuros, cdtTipoOperacao.flagCobraJuros) &&
        Objects.equals(this.flagCobraProRata, cdtTipoOperacao.flagCobraProRata) &&
        Objects.equals(this.flagCobraTarifa, cdtTipoOperacao.flagCobraTarifa) &&
        Objects.equals(this.flagCredito, cdtTipoOperacao.flagCredito) &&
        Objects.equals(this.flagCreditoContestavel, cdtTipoOperacao.flagCreditoContestavel) &&
        Objects.equals(this.flagIOFApartado, cdtTipoOperacao.flagIOFApartado) &&
        Objects.equals(this.flagManterTaxaJurosNoRotativo, cdtTipoOperacao.flagManterTaxaJurosNoRotativo) &&
        Objects.equals(this.flagPermitirParcelamento, cdtTipoOperacao.flagPermitirParcelamento) &&
        Objects.equals(this.flagPosProximoVencimento, cdtTipoOperacao.flagPosProximoVencimento) &&
        Objects.equals(this.flagTiraTac, cdtTipoOperacao.flagTiraTac) &&
        Objects.equals(this.id, cdtTipoOperacao.id) &&
        Objects.equals(this.idEmissor, cdtTipoOperacao.idEmissor) &&
        Objects.equals(this.idOperacaoOrigem, cdtTipoOperacao.idOperacaoOrigem) &&
        Objects.equals(this.idTabela, cdtTipoOperacao.idTabela) &&
        Objects.equals(this.idTabelaJuros, cdtTipoOperacao.idTabelaJuros) &&
        Objects.equals(this.nome, cdtTipoOperacao.nome) &&
        Objects.equals(this.percentualTac, cdtTipoOperacao.percentualTac) &&
        Objects.equals(this.planoMaximo, cdtTipoOperacao.planoMaximo) &&
        Objects.equals(this.planoMinimo, cdtTipoOperacao.planoMinimo) &&
        Objects.equals(this.remuneracaoEmissor, cdtTipoOperacao.remuneracaoEmissor) &&
        Objects.equals(this.tarifa, cdtTipoOperacao.tarifa) &&
        Objects.equals(this.taxaJuros, cdtTipoOperacao.taxaJuros) &&
        Objects.equals(this.tipoExcedentePermitido, cdtTipoOperacao.tipoExcedentePermitido) &&
        Objects.equals(this.tipoOperacao, cdtTipoOperacao.tipoOperacao) &&
        Objects.equals(this.valorMaximo, cdtTipoOperacao.valorMaximo) &&
        Objects.equals(this.valorMinimo, cdtTipoOperacao.valorMinimo) &&
        Objects.equals(this.valorOperacao, cdtTipoOperacao.valorOperacao) &&
        Objects.equals(this.valorParcela, cdtTipoOperacao.valorParcela) &&
        Objects.equals(this.valorTAC, cdtTipoOperacao.valorTAC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoProcessamento, codigoProcessamentoCancelamento, descricao, excedentePermitido, flagCobraJuros, flagCobraProRata, flagCobraTarifa, flagCredito, flagCreditoContestavel, flagIOFApartado, flagManterTaxaJurosNoRotativo, flagPermitirParcelamento, flagPosProximoVencimento, flagTiraTac, id, idEmissor, idOperacaoOrigem, idTabela, idTabelaJuros, nome, percentualTac, planoMaximo, planoMinimo, remuneracaoEmissor, tarifa, taxaJuros, tipoExcedentePermitido, tipoOperacao, valorMaximo, valorMinimo, valorOperacao, valorParcela, valorTAC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtTipoOperacao {\n");
    
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    codigoProcessamentoCancelamento: ").append(toIndentedString(codigoProcessamentoCancelamento)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    excedentePermitido: ").append(toIndentedString(excedentePermitido)).append("\n");
    sb.append("    flagCobraJuros: ").append(toIndentedString(flagCobraJuros)).append("\n");
    sb.append("    flagCobraProRata: ").append(toIndentedString(flagCobraProRata)).append("\n");
    sb.append("    flagCobraTarifa: ").append(toIndentedString(flagCobraTarifa)).append("\n");
    sb.append("    flagCredito: ").append(toIndentedString(flagCredito)).append("\n");
    sb.append("    flagCreditoContestavel: ").append(toIndentedString(flagCreditoContestavel)).append("\n");
    sb.append("    flagIOFApartado: ").append(toIndentedString(flagIOFApartado)).append("\n");
    sb.append("    flagManterTaxaJurosNoRotativo: ").append(toIndentedString(flagManterTaxaJurosNoRotativo)).append("\n");
    sb.append("    flagPermitirParcelamento: ").append(toIndentedString(flagPermitirParcelamento)).append("\n");
    sb.append("    flagPosProximoVencimento: ").append(toIndentedString(flagPosProximoVencimento)).append("\n");
    sb.append("    flagTiraTac: ").append(toIndentedString(flagTiraTac)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    idOperacaoOrigem: ").append(toIndentedString(idOperacaoOrigem)).append("\n");
    sb.append("    idTabela: ").append(toIndentedString(idTabela)).append("\n");
    sb.append("    idTabelaJuros: ").append(toIndentedString(idTabelaJuros)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    percentualTac: ").append(toIndentedString(percentualTac)).append("\n");
    sb.append("    planoMaximo: ").append(toIndentedString(planoMaximo)).append("\n");
    sb.append("    planoMinimo: ").append(toIndentedString(planoMinimo)).append("\n");
    sb.append("    remuneracaoEmissor: ").append(toIndentedString(remuneracaoEmissor)).append("\n");
    sb.append("    tarifa: ").append(toIndentedString(tarifa)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    tipoExcedentePermitido: ").append(toIndentedString(tipoExcedentePermitido)).append("\n");
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    valorMaximo: ").append(toIndentedString(valorMaximo)).append("\n");
    sb.append("    valorMinimo: ").append(toIndentedString(valorMinimo)).append("\n");
    sb.append("    valorOperacao: ").append(toIndentedString(valorOperacao)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
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

