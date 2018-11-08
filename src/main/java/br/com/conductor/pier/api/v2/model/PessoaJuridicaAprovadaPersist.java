package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.EnderecoAprovadoPersistValue;
import br.com.conductor.pier.api.v2.model.ReferenciaComercialAprovadoPersistValue;
import br.com.conductor.pier.api.v2.model.SocioAprovadoPersistValue;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersistValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{pessoa_juridica_aprovada_persist_description}}}
 **/

@ApiModel(description = "{{{pessoa_juridica_aprovada_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaJuridicaAprovadaPersist   {
  
  private String razaoSocial = null;
  private String nomeFantasia = null;
  private String cnpj = null;
  private String inscricaoEstadual = null;
  private String dataAberturaEmpresa = null;
  private Long idOrigemComercial = null;
  private Long idProduto = null;
  private Integer numeroBanco = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorrente = null;
  private String email = null;
  private Integer diaVencimento = null;
  private String nomeImpresso = null;
  private BigDecimal valorRenda = null;
  private String canalEntrada = null;
  private Integer valorPontuacao = null;
  private List<TelefonePessoaAprovadaPersistValue> telefones = new ArrayList<TelefonePessoaAprovadaPersistValue>();
  private List<EnderecoAprovadoPersistValue> enderecos = new ArrayList<EnderecoAprovadoPersistValue>();
  private List<SocioAprovadoPersistValue> socios = new ArrayList<SocioAprovadoPersistValue>();
  private List<ReferenciaComercialAprovadoPersistValue> referenciasComerciais = new ArrayList<ReferenciaComercialAprovadoPersistValue>();
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteMaximo = null;
  private BigDecimal limiteParcelas = null;
  private Boolean impedidoFinanciamento = null;

  
  /**
   * {{{pessoa_juridica_aprovada_persist_razao_social_value}}}
   **/
  public PessoaJuridicaAprovadaPersist razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_persist_razao_social_value}}}")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_nome_fantasia_value}}}
   **/
  public PessoaJuridicaAprovadaPersist nomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_nome_fantasia_value}}}")
  @JsonProperty("nomeFantasia")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_cnpj_value}}}
   **/
  public PessoaJuridicaAprovadaPersist cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_persist_cnpj_value}}}")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_inscricao_estadual_value}}}
   **/
  public PessoaJuridicaAprovadaPersist inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_inscricao_estadual_value}}}")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_data_abertura_empresa_value}}}
   **/
  public PessoaJuridicaAprovadaPersist dataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_persist_data_abertura_empresa_value}}}")
  @JsonProperty("dataAberturaEmpresa")
  public String getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_id_origem_comercial_value}}}
   **/
  public PessoaJuridicaAprovadaPersist idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_persist_id_origem_comercial_value}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_id_produto_value}}}
   **/
  public PessoaJuridicaAprovadaPersist idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_persist_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_numero_banco_value}}}
   **/
  public PessoaJuridicaAprovadaPersist numeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_numero_banco_value}}}")
  @JsonProperty("numeroBanco")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_numero_agencia_value}}}
   **/
  public PessoaJuridicaAprovadaPersist numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_numero_conta_corrente_value}}}
   **/
  public PessoaJuridicaAprovadaPersist numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_numero_conta_corrente_value}}}")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_email_value}}}
   **/
  public PessoaJuridicaAprovadaPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_dia_vencimento_value}}}
   **/
  public PessoaJuridicaAprovadaPersist diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_persist_dia_vencimento_value}}}")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_nome_impresso_value}}}
   **/
  public PessoaJuridicaAprovadaPersist nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_nome_impresso_value}}}")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_valor_renda_value}}}
   **/
  public PessoaJuridicaAprovadaPersist valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_valor_renda_value}}}")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_canal_entrada_value}}}
   **/
  public PessoaJuridicaAprovadaPersist canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_canal_entrada_value}}}")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_valor_pontuacao_value}}}
   **/
  public PessoaJuridicaAprovadaPersist valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_valor_pontuacao_value}}}")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_telefones_value}}}
   **/
  public PessoaJuridicaAprovadaPersist telefones(List<TelefonePessoaAprovadaPersistValue> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_telefones_value}}}")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaPersistValue> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersistValue> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_enderecos_value}}}
   **/
  public PessoaJuridicaAprovadaPersist enderecos(List<EnderecoAprovadoPersistValue> enderecos) {
    this.enderecos = enderecos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_persist_enderecos_value}}}")
  @JsonProperty("enderecos")
  public List<EnderecoAprovadoPersistValue> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoPersistValue> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_socios_value}}}
   **/
  public PessoaJuridicaAprovadaPersist socios(List<SocioAprovadoPersistValue> socios) {
    this.socios = socios;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_socios_value}}}")
  @JsonProperty("socios")
  public List<SocioAprovadoPersistValue> getSocios() {
    return socios;
  }
  public void setSocios(List<SocioAprovadoPersistValue> socios) {
    this.socios = socios;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_referencias_comerciais_value}}}
   **/
  public PessoaJuridicaAprovadaPersist referenciasComerciais(List<ReferenciaComercialAprovadoPersistValue> referenciasComerciais) {
    this.referenciasComerciais = referenciasComerciais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_persist_referencias_comerciais_value}}}")
  @JsonProperty("referenciasComerciais")
  public List<ReferenciaComercialAprovadoPersistValue> getReferenciasComerciais() {
    return referenciasComerciais;
  }
  public void setReferenciasComerciais(List<ReferenciaComercialAprovadoPersistValue> referenciasComerciais) {
    this.referenciasComerciais = referenciasComerciais;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_limite_global_value}}}
   **/
  public PessoaJuridicaAprovadaPersist limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_persist_limite_global_value}}}")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_limite_maximo_value}}}
   **/
  public PessoaJuridicaAprovadaPersist limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_persist_limite_maximo_value}}}")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_limite_parcelas_value}}}
   **/
  public PessoaJuridicaAprovadaPersist limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_persist_limite_parcelas_value}}}")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_impedido_de_financiamento_value}}}
   **/
  public PessoaJuridicaAprovadaPersist impedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{pessoa_juridica_aprovada_persist_impedido_de_financiamento_value}}}")
  @JsonProperty("impedidoFinanciamento")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaJuridicaAprovadaPersist pessoaJuridicaAprovadaPersist = (PessoaJuridicaAprovadaPersist) o;
    return Objects.equals(this.razaoSocial, pessoaJuridicaAprovadaPersist.razaoSocial) &&
        Objects.equals(this.nomeFantasia, pessoaJuridicaAprovadaPersist.nomeFantasia) &&
        Objects.equals(this.cnpj, pessoaJuridicaAprovadaPersist.cnpj) &&
        Objects.equals(this.inscricaoEstadual, pessoaJuridicaAprovadaPersist.inscricaoEstadual) &&
        Objects.equals(this.dataAberturaEmpresa, pessoaJuridicaAprovadaPersist.dataAberturaEmpresa) &&
        Objects.equals(this.idOrigemComercial, pessoaJuridicaAprovadaPersist.idOrigemComercial) &&
        Objects.equals(this.idProduto, pessoaJuridicaAprovadaPersist.idProduto) &&
        Objects.equals(this.numeroBanco, pessoaJuridicaAprovadaPersist.numeroBanco) &&
        Objects.equals(this.numeroAgencia, pessoaJuridicaAprovadaPersist.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, pessoaJuridicaAprovadaPersist.numeroContaCorrente) &&
        Objects.equals(this.email, pessoaJuridicaAprovadaPersist.email) &&
        Objects.equals(this.diaVencimento, pessoaJuridicaAprovadaPersist.diaVencimento) &&
        Objects.equals(this.nomeImpresso, pessoaJuridicaAprovadaPersist.nomeImpresso) &&
        Objects.equals(this.valorRenda, pessoaJuridicaAprovadaPersist.valorRenda) &&
        Objects.equals(this.canalEntrada, pessoaJuridicaAprovadaPersist.canalEntrada) &&
        Objects.equals(this.valorPontuacao, pessoaJuridicaAprovadaPersist.valorPontuacao) &&
        Objects.equals(this.telefones, pessoaJuridicaAprovadaPersist.telefones) &&
        Objects.equals(this.enderecos, pessoaJuridicaAprovadaPersist.enderecos) &&
        Objects.equals(this.socios, pessoaJuridicaAprovadaPersist.socios) &&
        Objects.equals(this.referenciasComerciais, pessoaJuridicaAprovadaPersist.referenciasComerciais) &&
        Objects.equals(this.limiteGlobal, pessoaJuridicaAprovadaPersist.limiteGlobal) &&
        Objects.equals(this.limiteMaximo, pessoaJuridicaAprovadaPersist.limiteMaximo) &&
        Objects.equals(this.limiteParcelas, pessoaJuridicaAprovadaPersist.limiteParcelas) &&
        Objects.equals(this.impedidoFinanciamento, pessoaJuridicaAprovadaPersist.impedidoFinanciamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(razaoSocial, nomeFantasia, cnpj, inscricaoEstadual, dataAberturaEmpresa, idOrigemComercial, idProduto, numeroBanco, numeroAgencia, numeroContaCorrente, email, diaVencimento, nomeImpresso, valorRenda, canalEntrada, valorPontuacao, telefones, enderecos, socios, referenciasComerciais, limiteGlobal, limiteMaximo, limiteParcelas, impedidoFinanciamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaAprovadaPersist {\n");
    
    sb.append("    razaoSocial: ").append(toIndentedString(razaoSocial)).append("\n");
    sb.append("    nomeFantasia: ").append(toIndentedString(nomeFantasia)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    inscricaoEstadual: ").append(toIndentedString(inscricaoEstadual)).append("\n");
    sb.append("    dataAberturaEmpresa: ").append(toIndentedString(dataAberturaEmpresa)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    numeroBanco: ").append(toIndentedString(numeroBanco)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    diaVencimento: ").append(toIndentedString(diaVencimento)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    valorRenda: ").append(toIndentedString(valorRenda)).append("\n");
    sb.append("    canalEntrada: ").append(toIndentedString(canalEntrada)).append("\n");
    sb.append("    valorPontuacao: ").append(toIndentedString(valorPontuacao)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
    sb.append("    enderecos: ").append(toIndentedString(enderecos)).append("\n");
    sb.append("    socios: ").append(toIndentedString(socios)).append("\n");
    sb.append("    referenciasComerciais: ").append(toIndentedString(referenciasComerciais)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    limiteMaximo: ").append(toIndentedString(limiteMaximo)).append("\n");
    sb.append("    limiteParcelas: ").append(toIndentedString(limiteParcelas)).append("\n");
    sb.append("    impedidoFinanciamento: ").append(toIndentedString(impedidoFinanciamento)).append("\n");
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

