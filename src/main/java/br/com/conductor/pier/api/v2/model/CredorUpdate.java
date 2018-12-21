package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TelefoneEscritorioCobrancaDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CredorUpdate   {
  
  private List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca = new ArrayList<TelefoneEscritorioCobrancaDTO>();
  private String nomeCredor = null;
  private Integer diaPagamentoSemanal = null;
  private Integer diaPagamentoMensal = null;
  private Integer diaPagamentoDecendialPrimeiro = null;
  private Integer diaPagamentoDecendialSegundo = null;
  private Integer diaPagamentoDecendialTerceiro = null;
  private Integer diaPagamentoQuinzenalPrimeiro = null;
  private Integer diaPagamentoQuinzenalSegundo = null;
  private Integer banco = null;
  private Integer agencia = null;
  private String digitoAgencia = null;
  private String contaCorrente = null;
  private String digitoContaCorrente = null;
  private Boolean credorBanco = null;
  private BigDecimal percentualRAV = null;


  public enum RecebeRAVEnum {
    NAO_TEM_PERMISSAO_RAV("NAO_TEM_PERMISSAO_RAV"),
    CREDITO_RAV("CREDITO_RAV"),
    DEBITO_RAV("DEBITO_RAV");

    private String value;

    RecebeRAVEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RecebeRAVEnum recebeRAV = null;
  private BigDecimal percentualMultiplica = null;
  private BigDecimal taxaAdministrativa = null;
  private BigDecimal taxaBanco = null;
  private BigDecimal limiteRAV = null;
  private Long idCredorRAV = null;


  public enum PeriodicidadeEnum {
    DIARIO("DIARIO"),
    SEMANAL("SEMANAL"),
    MENSAL("MENSAL"),
    DECENDIAL("DECENDIAL"),
    QUINZENAL("QUINZENAL");

    private String value;

    PeriodicidadeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PeriodicidadeEnum periodicidade = null;
  private Long idPessoaJuridica = null;
  private Boolean flagEscritorioCobranca = null;
  private String prefixo = null;
  private Boolean ativo = null;
  private String nomeContato = null;
  private String email = null;
  private String nomeLogradouro = null;
  private Integer numeroEndereco = null;
  private String complementoEndereco = null;
  private String bairro = null;
  private String cidade = null;
  private String cep = null;
  private String uf = null;
  private String responsavel = null;
  private Integer flagSegundaViaAcordo = null;
  private BigDecimal valorMinimoParcela = null;
  private BigDecimal descontoMaximo = null;

  
  /**
   * lender phones for billing
   **/
  public CredorUpdate telefonesEscritoriosCobranca(List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca) {
    this.telefonesEscritoriosCobranca = telefonesEscritoriosCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender phones for billing")
  @JsonProperty("telefonesEscritoriosCobranca")
  public List<TelefoneEscritorioCobrancaDTO> getTelefonesEscritoriosCobranca() {
    return telefonesEscritoriosCobranca;
  }
  public void setTelefonesEscritoriosCobranca(List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca) {
    this.telefonesEscritoriosCobranca = telefonesEscritoriosCobranca;
  }

  
  /**
   * lender update name lender
   **/
  public CredorUpdate nomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender update name lender")
  @JsonProperty("nomeCredor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * creditor update weekly payment
   **/
  public CredorUpdate diaPagamentoSemanal(Integer diaPagamentoSemanal) {
    this.diaPagamentoSemanal = diaPagamentoSemanal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor update weekly payment")
  @JsonProperty("diaPagamentoSemanal")
  public Integer getDiaPagamentoSemanal() {
    return diaPagamentoSemanal;
  }
  public void setDiaPagamentoSemanal(Integer diaPagamentoSemanal) {
    this.diaPagamentoSemanal = diaPagamentoSemanal;
  }

  
  /**
   * creditor update monthly payment
   **/
  public CredorUpdate diaPagamentoMensal(Integer diaPagamentoMensal) {
    this.diaPagamentoMensal = diaPagamentoMensal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor update monthly payment")
  @JsonProperty("diaPagamentoMensal")
  public Integer getDiaPagamentoMensal() {
    return diaPagamentoMensal;
  }
  public void setDiaPagamentoMensal(Integer diaPagamentoMensal) {
    this.diaPagamentoMensal = diaPagamentoMensal;
  }

  
  /**
   * lender pays off the first ten-day payment
   **/
  public CredorUpdate diaPagamentoDecendialPrimeiro(Integer diaPagamentoDecendialPrimeiro) {
    this.diaPagamentoDecendialPrimeiro = diaPagamentoDecendialPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender pays off the first ten-day payment")
  @JsonProperty("diaPagamentoDecendialPrimeiro")
  public Integer getDiaPagamentoDecendialPrimeiro() {
    return diaPagamentoDecendialPrimeiro;
  }
  public void setDiaPagamentoDecendialPrimeiro(Integer diaPagamentoDecendialPrimeiro) {
    this.diaPagamentoDecendialPrimeiro = diaPagamentoDecendialPrimeiro;
  }

  
  /**
   * lender pays second decimal payment
   **/
  public CredorUpdate diaPagamentoDecendialSegundo(Integer diaPagamentoDecendialSegundo) {
    this.diaPagamentoDecendialSegundo = diaPagamentoDecendialSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender pays second decimal payment")
  @JsonProperty("diaPagamentoDecendialSegundo")
  public Integer getDiaPagamentoDecendialSegundo() {
    return diaPagamentoDecendialSegundo;
  }
  public void setDiaPagamentoDecendialSegundo(Integer diaPagamentoDecendialSegundo) {
    this.diaPagamentoDecendialSegundo = diaPagamentoDecendialSegundo;
  }

  
  /**
   * creditor replies third decimal payment
   **/
  public CredorUpdate diaPagamentoDecendialTerceiro(Integer diaPagamentoDecendialTerceiro) {
    this.diaPagamentoDecendialTerceiro = diaPagamentoDecendialTerceiro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor replies third decimal payment")
  @JsonProperty("diaPagamentoDecendialTerceiro")
  public Integer getDiaPagamentoDecendialTerceiro() {
    return diaPagamentoDecendialTerceiro;
  }
  public void setDiaPagamentoDecendialTerceiro(Integer diaPagamentoDecendialTerceiro) {
    this.diaPagamentoDecendialTerceiro = diaPagamentoDecendialTerceiro;
  }

  
  /**
   * lender replies biweekly payment first
   **/
  public CredorUpdate diaPagamentoQuinzenalPrimeiro(Integer diaPagamentoQuinzenalPrimeiro) {
    this.diaPagamentoQuinzenalPrimeiro = diaPagamentoQuinzenalPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender replies biweekly payment first")
  @JsonProperty("diaPagamentoQuinzenalPrimeiro")
  public Integer getDiaPagamentoQuinzenalPrimeiro() {
    return diaPagamentoQuinzenalPrimeiro;
  }
  public void setDiaPagamentoQuinzenalPrimeiro(Integer diaPagamentoQuinzenalPrimeiro) {
    this.diaPagamentoQuinzenalPrimeiro = diaPagamentoQuinzenalPrimeiro;
  }

  
  /**
   * lender replies biweekly payment first
   **/
  public CredorUpdate diaPagamentoQuinzenalSegundo(Integer diaPagamentoQuinzenalSegundo) {
    this.diaPagamentoQuinzenalSegundo = diaPagamentoQuinzenalSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender replies biweekly payment first")
  @JsonProperty("diaPagamentoQuinzenalSegundo")
  public Integer getDiaPagamentoQuinzenalSegundo() {
    return diaPagamentoQuinzenalSegundo;
  }
  public void setDiaPagamentoQuinzenalSegundo(Integer diaPagamentoQuinzenalSegundo) {
    this.diaPagamentoQuinzenalSegundo = diaPagamentoQuinzenalSegundo;
  }

  
  /**
   * bank lender update
   **/
  public CredorUpdate banco(Integer banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "bank lender update")
  @JsonProperty("banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * lender update agency
   **/
  public CredorUpdate agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender update agency")
  @JsonProperty("agencia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * lender update agency digit
   **/
  public CredorUpdate digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender update agency digit")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * creditor update checking account
   **/
  public CredorUpdate contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor update checking account")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * current account lender
   **/
  public CredorUpdate digitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "current account lender")
  @JsonProperty("digitoContaCorrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * lender update bank creditor
   **/
  public CredorUpdate credorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "lender update bank creditor")
  @JsonProperty("credorBanco")
  public Boolean getCredorBanco() {
    return credorBanco;
  }
  public void setCredorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
  }

  
  /**
   * percent rav update creditor
   **/
  public CredorUpdate percentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "percent rav update creditor")
  @JsonProperty("percentualRAV")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * creditor update receives rav
   **/
  public CredorUpdate recebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor update receives rav")
  @JsonProperty("recebeRAV")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * percentage update creditor multiplies
   **/
  public CredorUpdate percentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "percentage update creditor multiplies")
  @JsonProperty("percentualMultiplica")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * lender update rate adm
   **/
  public CredorUpdate taxaAdministrativa(BigDecimal taxaAdministrativa) {
    this.taxaAdministrativa = taxaAdministrativa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "lender update rate adm")
  @JsonProperty("taxaAdministrativa")
  public BigDecimal getTaxaAdministrativa() {
    return taxaAdministrativa;
  }
  public void setTaxaAdministrativa(BigDecimal taxaAdministrativa) {
    this.taxaAdministrativa = taxaAdministrativa;
  }

  
  /**
   * creditor bank rate update
   **/
  public CredorUpdate taxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor bank rate update")
  @JsonProperty("taxaBanco")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * creditor update limit rav
   **/
  public CredorUpdate limiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor update limit rav")
  @JsonProperty("limiteRAV")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  
  /**
   * creditor update id creditor rav
   **/
  public CredorUpdate idCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "creditor update id creditor rav")
  @JsonProperty("idCredorRAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * creditor request periodicity
   **/
  public CredorUpdate periodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "creditor request periodicity")
  @JsonProperty("periodicidade")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * creditor request legal id person
   **/
  public CredorUpdate idPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "creditor request legal id person")
  @JsonProperty("idPessoaJuridica")
  public Long getIdPessoaJuridica() {
    return idPessoaJuridica;
  }
  public void setIdPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
  }

  
  /**
   * creditor update flag billing desk
   **/
  public CredorUpdate flagEscritorioCobranca(Boolean flagEscritorioCobranca) {
    this.flagEscritorioCobranca = flagEscritorioCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "creditor update flag billing desk")
  @JsonProperty("flagEscritorioCobranca")
  public Boolean getFlagEscritorioCobranca() {
    return flagEscritorioCobranca;
  }
  public void setFlagEscritorioCobranca(Boolean flagEscritorioCobranca) {
    this.flagEscritorioCobranca = flagEscritorioCobranca;
  }

  
  /**
   * creditor update prefix
   **/
  public CredorUpdate prefixo(String prefixo) {
    this.prefixo = prefixo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor update prefix")
  @JsonProperty("prefixo")
  public String getPrefixo() {
    return prefixo;
  }
  public void setPrefixo(String prefixo) {
    this.prefixo = prefixo;
  }

  
  /**
   * creditor update flag active
   **/
  public CredorUpdate ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "creditor update flag active")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * creditor update contact
   **/
  public CredorUpdate nomeContato(String nomeContato) {
    this.nomeContato = nomeContato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor update contact")
  @JsonProperty("nomeContato")
  public String getNomeContato() {
    return nomeContato;
  }
  public void setNomeContato(String nomeContato) {
    this.nomeContato = nomeContato;
  }

  
  /**
   * creditor update email
   **/
  public CredorUpdate email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor update email")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * lender update public place
   **/
  public CredorUpdate nomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender update public place")
  @JsonProperty("nomeLogradouro")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * creditor update address number
   **/
  public CredorUpdate numeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor update address number")
  @JsonProperty("numeroEndereco")
  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * lender update complement
   **/
  public CredorUpdate complementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender update complement")
  @JsonProperty("complementoEndereco")
  public String getComplementoEndereco() {
    return complementoEndereco;
  }
  public void setComplementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
  }

  
  /**
   * lender update neighborhood
   **/
  public CredorUpdate bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender update neighborhood")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * lender update city
   **/
  public CredorUpdate cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender update city")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * lender update cep
   **/
  public CredorUpdate cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender update cep")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * lender update uf
   **/
  public CredorUpdate uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender update uf")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * lender responsible update
   **/
  public CredorUpdate responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender responsible update")
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * creditor update flag second via arrangement
   **/
  public CredorUpdate flagSegundaViaAcordo(Integer flagSegundaViaAcordo) {
    this.flagSegundaViaAcordo = flagSegundaViaAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "creditor update flag second via arrangement")
  @JsonProperty("flagSegundaViaAcordo")
  public Integer getFlagSegundaViaAcordo() {
    return flagSegundaViaAcordo;
  }
  public void setFlagSegundaViaAcordo(Integer flagSegundaViaAcordo) {
    this.flagSegundaViaAcordo = flagSegundaViaAcordo;
  }

  
  /**
   * lender update minimum value plot
   **/
  public CredorUpdate valorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "lender update minimum value plot")
  @JsonProperty("valorMinimoParcela")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * maximum discount creditor update
   **/
  public CredorUpdate descontoMaximo(BigDecimal descontoMaximo) {
    this.descontoMaximo = descontoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "maximum discount creditor update")
  @JsonProperty("descontoMaximo")
  public BigDecimal getDescontoMaximo() {
    return descontoMaximo;
  }
  public void setDescontoMaximo(BigDecimal descontoMaximo) {
    this.descontoMaximo = descontoMaximo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredorUpdate credorUpdate = (CredorUpdate) o;
    return Objects.equals(this.telefonesEscritoriosCobranca, credorUpdate.telefonesEscritoriosCobranca) &&
        Objects.equals(this.nomeCredor, credorUpdate.nomeCredor) &&
        Objects.equals(this.diaPagamentoSemanal, credorUpdate.diaPagamentoSemanal) &&
        Objects.equals(this.diaPagamentoMensal, credorUpdate.diaPagamentoMensal) &&
        Objects.equals(this.diaPagamentoDecendialPrimeiro, credorUpdate.diaPagamentoDecendialPrimeiro) &&
        Objects.equals(this.diaPagamentoDecendialSegundo, credorUpdate.diaPagamentoDecendialSegundo) &&
        Objects.equals(this.diaPagamentoDecendialTerceiro, credorUpdate.diaPagamentoDecendialTerceiro) &&
        Objects.equals(this.diaPagamentoQuinzenalPrimeiro, credorUpdate.diaPagamentoQuinzenalPrimeiro) &&
        Objects.equals(this.diaPagamentoQuinzenalSegundo, credorUpdate.diaPagamentoQuinzenalSegundo) &&
        Objects.equals(this.banco, credorUpdate.banco) &&
        Objects.equals(this.agencia, credorUpdate.agencia) &&
        Objects.equals(this.digitoAgencia, credorUpdate.digitoAgencia) &&
        Objects.equals(this.contaCorrente, credorUpdate.contaCorrente) &&
        Objects.equals(this.digitoContaCorrente, credorUpdate.digitoContaCorrente) &&
        Objects.equals(this.credorBanco, credorUpdate.credorBanco) &&
        Objects.equals(this.percentualRAV, credorUpdate.percentualRAV) &&
        Objects.equals(this.recebeRAV, credorUpdate.recebeRAV) &&
        Objects.equals(this.percentualMultiplica, credorUpdate.percentualMultiplica) &&
        Objects.equals(this.taxaAdministrativa, credorUpdate.taxaAdministrativa) &&
        Objects.equals(this.taxaBanco, credorUpdate.taxaBanco) &&
        Objects.equals(this.limiteRAV, credorUpdate.limiteRAV) &&
        Objects.equals(this.idCredorRAV, credorUpdate.idCredorRAV) &&
        Objects.equals(this.periodicidade, credorUpdate.periodicidade) &&
        Objects.equals(this.idPessoaJuridica, credorUpdate.idPessoaJuridica) &&
        Objects.equals(this.flagEscritorioCobranca, credorUpdate.flagEscritorioCobranca) &&
        Objects.equals(this.prefixo, credorUpdate.prefixo) &&
        Objects.equals(this.ativo, credorUpdate.ativo) &&
        Objects.equals(this.nomeContato, credorUpdate.nomeContato) &&
        Objects.equals(this.email, credorUpdate.email) &&
        Objects.equals(this.nomeLogradouro, credorUpdate.nomeLogradouro) &&
        Objects.equals(this.numeroEndereco, credorUpdate.numeroEndereco) &&
        Objects.equals(this.complementoEndereco, credorUpdate.complementoEndereco) &&
        Objects.equals(this.bairro, credorUpdate.bairro) &&
        Objects.equals(this.cidade, credorUpdate.cidade) &&
        Objects.equals(this.cep, credorUpdate.cep) &&
        Objects.equals(this.uf, credorUpdate.uf) &&
        Objects.equals(this.responsavel, credorUpdate.responsavel) &&
        Objects.equals(this.flagSegundaViaAcordo, credorUpdate.flagSegundaViaAcordo) &&
        Objects.equals(this.valorMinimoParcela, credorUpdate.valorMinimoParcela) &&
        Objects.equals(this.descontoMaximo, credorUpdate.descontoMaximo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telefonesEscritoriosCobranca, nomeCredor, diaPagamentoSemanal, diaPagamentoMensal, diaPagamentoDecendialPrimeiro, diaPagamentoDecendialSegundo, diaPagamentoDecendialTerceiro, diaPagamentoQuinzenalPrimeiro, diaPagamentoQuinzenalSegundo, banco, agencia, digitoAgencia, contaCorrente, digitoContaCorrente, credorBanco, percentualRAV, recebeRAV, percentualMultiplica, taxaAdministrativa, taxaBanco, limiteRAV, idCredorRAV, periodicidade, idPessoaJuridica, flagEscritorioCobranca, prefixo, ativo, nomeContato, email, nomeLogradouro, numeroEndereco, complementoEndereco, bairro, cidade, cep, uf, responsavel, flagSegundaViaAcordo, valorMinimoParcela, descontoMaximo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredorUpdate {\n");
    
    sb.append("    telefonesEscritoriosCobranca: ").append(toIndentedString(telefonesEscritoriosCobranca)).append("\n");
    sb.append("    nomeCredor: ").append(toIndentedString(nomeCredor)).append("\n");
    sb.append("    diaPagamentoSemanal: ").append(toIndentedString(diaPagamentoSemanal)).append("\n");
    sb.append("    diaPagamentoMensal: ").append(toIndentedString(diaPagamentoMensal)).append("\n");
    sb.append("    diaPagamentoDecendialPrimeiro: ").append(toIndentedString(diaPagamentoDecendialPrimeiro)).append("\n");
    sb.append("    diaPagamentoDecendialSegundo: ").append(toIndentedString(diaPagamentoDecendialSegundo)).append("\n");
    sb.append("    diaPagamentoDecendialTerceiro: ").append(toIndentedString(diaPagamentoDecendialTerceiro)).append("\n");
    sb.append("    diaPagamentoQuinzenalPrimeiro: ").append(toIndentedString(diaPagamentoQuinzenalPrimeiro)).append("\n");
    sb.append("    diaPagamentoQuinzenalSegundo: ").append(toIndentedString(diaPagamentoQuinzenalSegundo)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    contaCorrente: ").append(toIndentedString(contaCorrente)).append("\n");
    sb.append("    digitoContaCorrente: ").append(toIndentedString(digitoContaCorrente)).append("\n");
    sb.append("    credorBanco: ").append(toIndentedString(credorBanco)).append("\n");
    sb.append("    percentualRAV: ").append(toIndentedString(percentualRAV)).append("\n");
    sb.append("    recebeRAV: ").append(toIndentedString(recebeRAV)).append("\n");
    sb.append("    percentualMultiplica: ").append(toIndentedString(percentualMultiplica)).append("\n");
    sb.append("    taxaAdministrativa: ").append(toIndentedString(taxaAdministrativa)).append("\n");
    sb.append("    taxaBanco: ").append(toIndentedString(taxaBanco)).append("\n");
    sb.append("    limiteRAV: ").append(toIndentedString(limiteRAV)).append("\n");
    sb.append("    idCredorRAV: ").append(toIndentedString(idCredorRAV)).append("\n");
    sb.append("    periodicidade: ").append(toIndentedString(periodicidade)).append("\n");
    sb.append("    idPessoaJuridica: ").append(toIndentedString(idPessoaJuridica)).append("\n");
    sb.append("    flagEscritorioCobranca: ").append(toIndentedString(flagEscritorioCobranca)).append("\n");
    sb.append("    prefixo: ").append(toIndentedString(prefixo)).append("\n");
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
    sb.append("    nomeContato: ").append(toIndentedString(nomeContato)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nomeLogradouro: ").append(toIndentedString(nomeLogradouro)).append("\n");
    sb.append("    numeroEndereco: ").append(toIndentedString(numeroEndereco)).append("\n");
    sb.append("    complementoEndereco: ").append(toIndentedString(complementoEndereco)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("    flagSegundaViaAcordo: ").append(toIndentedString(flagSegundaViaAcordo)).append("\n");
    sb.append("    valorMinimoParcela: ").append(toIndentedString(valorMinimoParcela)).append("\n");
    sb.append("    descontoMaximo: ").append(toIndentedString(descontoMaximo)).append("\n");
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

