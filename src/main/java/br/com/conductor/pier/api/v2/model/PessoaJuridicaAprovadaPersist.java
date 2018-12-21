package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ObjectAddressApproved;
import br.com.conductor.pier.api.v2.model.PersonPersist;
import br.com.conductor.pier.api.v2.model.RefenceCommercialApprovedPersist;
import br.com.conductor.pier.api.v2.model.TelephonePersonApprovedPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * PersonLegalApprovedPersist
 **/

@ApiModel(description = "PersonLegalApprovedPersist")
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
  private List<TelephonePersonApprovedPersist> telefones = new ArrayList<TelephonePersonApprovedPersist>();
  private List<ObjectAddressApproved> enderecos = new ArrayList<ObjectAddressApproved>();
  private List<PersonPersist> socios = new ArrayList<PersonPersist>();
  private List<RefenceCommercialApprovedPersist> referenciasComerciais = new ArrayList<RefenceCommercialApprovedPersist>();
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteMaximo = null;
  private BigDecimal limiteParcelas = null;
  private Boolean impedidoFinanciamento = null;

  
  /**
   * Show the full name of the social reason (business name)'
   **/
  public PessoaJuridicaAprovadaPersist razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Show the full name of the social reason (business name)'")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Show the fantasy name of the company
   **/
  public PessoaJuridicaAprovadaPersist nomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the fantasy name of the company")
  @JsonProperty("nomeFantasia")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * CNPJ
   **/
  public PessoaJuridicaAprovadaPersist cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "CNPJ")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * State registration number
   **/
  public PessoaJuridicaAprovadaPersist inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State registration number")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Company opening date, this date must be informed in the format: yyyy-MM-dd
   **/
  public PessoaJuridicaAprovadaPersist dataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Company opening date, this date must be informed in the format: yyyy-MM-dd")
  @JsonProperty("dataAberturaEmpresa")
  public String getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * Id or the commercial origin
   **/
  public PessoaJuridicaAprovadaPersist idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id or the commercial origin")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Id product
   **/
  public PessoaJuridicaAprovadaPersist idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id product")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Bank number
   **/
  public PessoaJuridicaAprovadaPersist numeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bank number")
  @JsonProperty("numeroBanco")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * Agency Number
   **/
  public PessoaJuridicaAprovadaPersist numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agency Number")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Number of the current account
   **/
  public PessoaJuridicaAprovadaPersist numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of the current account")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Email of the company
   **/
  public PessoaJuridicaAprovadaPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email of the company")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Expiration date
   **/
  public PessoaJuridicaAprovadaPersist diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Expiration date")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Name that must be printed on the card
   **/
  public PessoaJuridicaAprovadaPersist nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name that must be printed on the card")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Apresenta o valor da renda compravada
   **/
  public PessoaJuridicaAprovadaPersist valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor da renda compravada")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Indicate the channel which the register of the client was created
   **/
  public PessoaJuridicaAprovadaPersist canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicate the channel which the register of the client was created")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Indicate the value of the puntuaction attributed to the client (case it is not informed it will be attributed the value =0)
   **/
  public PessoaJuridicaAprovadaPersist valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicate the value of the puntuaction attributed to the client (case it is not informed it will be attributed the value =0)")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * List the Telephones of the Company
   **/
  public PessoaJuridicaAprovadaPersist telefones(List<TelephonePersonApprovedPersist> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List the Telephones of the Company")
  @JsonProperty("telefones")
  public List<TelephonePersonApprovedPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelephonePersonApprovedPersist> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * It can be informed the following types of address: Residencial, Commercial and Others
   **/
  public PessoaJuridicaAprovadaPersist enderecos(List<ObjectAddressApproved> enderecos) {
    this.enderecos = enderecos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "It can be informed the following types of address: Residencial, Commercial and Others")
  @JsonProperty("enderecos")
  public List<ObjectAddressApproved> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<ObjectAddressApproved> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * Show the dates of the partners, in case of existence
   **/
  public PessoaJuridicaAprovadaPersist socios(List<PersonPersist> socios) {
    this.socios = socios;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the dates of the partners, in case of existence")
  @JsonProperty("socios")
  public List<PersonPersist> getSocios() {
    return socios;
  }
  public void setSocios(List<PersonPersist> socios) {
    this.socios = socios;
  }

  
  /**
   * show the dates of the commercial references
   **/
  public PessoaJuridicaAprovadaPersist referenciasComerciais(List<RefenceCommercialApprovedPersist> referenciasComerciais) {
    this.referenciasComerciais = referenciasComerciais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "show the dates of the commercial references")
  @JsonProperty("referenciasComerciais")
  public List<RefenceCommercialApprovedPersist> getReferenciasComerciais() {
    return referenciasComerciais;
  }
  public void setReferenciasComerciais(List<RefenceCommercialApprovedPersist> referenciasComerciais) {
    this.referenciasComerciais = referenciasComerciais;
  }

  
  /**
   * Value of the Global Limit
   **/
  public PessoaJuridicaAprovadaPersist limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value of the Global Limit")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Maximum value of the credit limit to make transactions
   **/
  public PessoaJuridicaAprovadaPersist limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum value of the credit limit to make transactions")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Credit Limit Value accumulated of the sum of the purchase parcels
   **/
  public PessoaJuridicaAprovadaPersist limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Credit Limit Value accumulated of the sum of the purchase parcels")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) 
   **/
  public PessoaJuridicaAprovadaPersist impedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) ")
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

