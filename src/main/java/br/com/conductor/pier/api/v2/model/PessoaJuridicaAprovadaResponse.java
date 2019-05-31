package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.EnderecoAprovadoResponse;
import br.com.conductor.pier.api.v2.model.ReferenciaComercialAprovadoResponse;
import br.com.conductor.pier.api.v2.model.SocioAprovadoResponse;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * PessoaJuridicaAprovadaPersist
 **/

@ApiModel(description = "PessoaJuridicaAprovadaPersist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaJuridicaAprovadaResponse   {
  
  private Long id = null;
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
  private Long idConta = null;
  private Long idProposta = null;
  private String canalEntrada = null;
  private Integer valorPontuacao = null;
  private List<TelefonePessoaAprovadaResponse> telefones = new ArrayList<TelefonePessoaAprovadaResponse>();
  private List<EnderecoAprovadoResponse> enderecos = new ArrayList<EnderecoAprovadoResponse>();
  private List<SocioAprovadoResponse> socios = new ArrayList<SocioAprovadoResponse>();
  private List<ReferenciaComercialAprovadoResponse> referencias = new ArrayList<ReferenciaComercialAprovadoResponse>();
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteMaximo = null;
  private BigDecimal limiteParcelas = null;
  private Boolean impedidoFinanciamento = null;
  private String cnae = null;
  private String formaConstituicao = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da pessoa jur\u00EDdica
   **/
  public PessoaJuridicaAprovadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "C\u00F3digo de identifica\u00E7\u00E3o da pessoa jur\u00EDdica")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome completo da raz\u00E3o social. \u00C9 o nome empresarial
   **/
  public PessoaJuridicaAprovadaResponse razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "AZ Móveis Ltda", value = "Nome completo da raz\u00E3o social. \u00C9 o nome empresarial")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Nome fantasia da empresa
   **/
  public PessoaJuridicaAprovadaResponse nomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  @ApiModelProperty(example = "Azure Móveis", value = "Nome fantasia da empresa")
  @JsonProperty("nomeFantasia")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * N\u00FAmero do Cadastro Nacional da Pessoa Jur\u00EDdica
   **/
  public PessoaJuridicaAprovadaResponse cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "56555503000188", value = "N\u00FAmero do Cadastro Nacional da Pessoa Jur\u00EDdica")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * N\u00FAmero da Inscri\u00E7\u00E3o Estadual
   **/
  public PessoaJuridicaAprovadaResponse inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "12345678", value = "N\u00FAmero da Inscri\u00E7\u00E3o Estadual")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Data de abertura da empresa
   **/
  public PessoaJuridicaAprovadaResponse dataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "2018-01-01", value = "Data de abertura da empresa")
  @JsonProperty("dataAberturaEmpresa")
  public String getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial
   **/
  public PessoaJuridicaAprovadaResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "C\u00F3digo identificador da origem comercial")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo identificador do produto
   **/
  public PessoaJuridicaAprovadaResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "C\u00F3digo identificador do produto")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * N\u00FAmero do banco
   **/
  public PessoaJuridicaAprovadaResponse numeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
    return this;
  }
  
  @ApiModelProperty(example = "99999", value = "N\u00FAmero do banco")
  @JsonProperty("numeroBanco")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia
   **/
  public PessoaJuridicaAprovadaResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "999999", value = "N\u00FAmero da ag\u00EAncia")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00FAmero da conta corrente
   **/
  public PessoaJuridicaAprovadaResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "123456789012345", value = "N\u00FAmero da conta corrente")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Email da empresa
   **/
  public PessoaJuridicaAprovadaResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "contato@email.com", value = "Email da empresa")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Dia vencimento
   **/
  public PessoaJuridicaAprovadaResponse diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "Dia vencimento")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Nome impresso no cart\u00E3o
   **/
  public PessoaJuridicaAprovadaResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "FULANO D TAL", value = "Nome impresso no cart\u00E3o")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta cadastrada
   **/
  public PessoaJuridicaAprovadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta cadastrada")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da proposta
   **/
  public PessoaJuridicaAprovadaResponse idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "C\u00F3digo de identifica\u00E7\u00E3o da proposta")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Canal pelo qual o cadastro do cliente foi realizado
   **/
  public PessoaJuridicaAprovadaResponse canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "PIER", value = "Canal pelo qual o cadastro do cliente foi realizado")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Valor da pontua\u00E7\u00E3o atribu\u00EDdo ao cliente
   **/
  public PessoaJuridicaAprovadaResponse valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "99", value = "Valor da pontua\u00E7\u00E3o atribu\u00EDdo ao cliente")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * Telefones da empresa
   **/
  public PessoaJuridicaAprovadaResponse telefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Telefones da empresa")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * Enderecos da empresa
   **/
  public PessoaJuridicaAprovadaResponse enderecos(List<EnderecoAprovadoResponse> enderecos) {
    this.enderecos = enderecos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Enderecos da empresa")
  @JsonProperty("enderecos")
  public List<EnderecoAprovadoResponse> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoResponse> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * S\u00F3cios da empresa
   **/
  public PessoaJuridicaAprovadaResponse socios(List<SocioAprovadoResponse> socios) {
    this.socios = socios;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "S\u00F3cios da empresa")
  @JsonProperty("socios")
  public List<SocioAprovadoResponse> getSocios() {
    return socios;
  }
  public void setSocios(List<SocioAprovadoResponse> socios) {
    this.socios = socios;
  }

  
  /**
   * Refer\u00EAncias comerciais da Empresa
   **/
  public PessoaJuridicaAprovadaResponse referencias(List<ReferenciaComercialAprovadoResponse> referencias) {
    this.referencias = referencias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Refer\u00EAncias comerciais da Empresa")
  @JsonProperty("referencias")
  public List<ReferenciaComercialAprovadoResponse> getReferencias() {
    return referencias;
  }
  public void setReferencias(List<ReferenciaComercialAprovadoResponse> referencias) {
    this.referencias = referencias;
  }

  
  /**
   * Valor do Limite Global para a conta
   **/
  public PessoaJuridicaAprovadaResponse limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "10000.0", value = "Valor do Limite Global para a conta")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es
   **/
  public PessoaJuridicaAprovadaResponse limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "10000.0", value = "Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras
   **/
  public PessoaJuridicaAprovadaResponse limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "1000.0", value = "Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Indicativo para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito (Lei n. 4.595/64)
   **/
  public PessoaJuridicaAprovadaResponse impedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indicativo para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito (Lei n. 4.595/64)")
  @JsonProperty("impedidoFinanciamento")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * C\u00F3digo de Classifica\u00E7\u00E3o Nacional de Atividades Econ\u00F4micas
   **/
  public PessoaJuridicaAprovadaResponse cnae(String cnae) {
    this.cnae = cnae;
    return this;
  }
  
  @ApiModelProperty(example = "3101-2", value = "C\u00F3digo de Classifica\u00E7\u00E3o Nacional de Atividades Econ\u00F4micas")
  @JsonProperty("cnae")
  public String getCnae() {
    return cnae;
  }
  public void setCnae(String cnae) {
    this.cnae = cnae;
  }

  
  /**
   * Forma de atos constitutivos de uma atividade empresarial
   **/
  public PessoaJuridicaAprovadaResponse formaConstituicao(String formaConstituicao) {
    this.formaConstituicao = formaConstituicao;
    return this;
  }
  
  @ApiModelProperty(example = "Sociedade limitada", value = "Forma de atos constitutivos de uma atividade empresarial")
  @JsonProperty("formaConstituicao")
  public String getFormaConstituicao() {
    return formaConstituicao;
  }
  public void setFormaConstituicao(String formaConstituicao) {
    this.formaConstituicao = formaConstituicao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaJuridicaAprovadaResponse pessoaJuridicaAprovadaResponse = (PessoaJuridicaAprovadaResponse) o;
    return Objects.equals(this.id, pessoaJuridicaAprovadaResponse.id) &&
        Objects.equals(this.razaoSocial, pessoaJuridicaAprovadaResponse.razaoSocial) &&
        Objects.equals(this.nomeFantasia, pessoaJuridicaAprovadaResponse.nomeFantasia) &&
        Objects.equals(this.cnpj, pessoaJuridicaAprovadaResponse.cnpj) &&
        Objects.equals(this.inscricaoEstadual, pessoaJuridicaAprovadaResponse.inscricaoEstadual) &&
        Objects.equals(this.dataAberturaEmpresa, pessoaJuridicaAprovadaResponse.dataAberturaEmpresa) &&
        Objects.equals(this.idOrigemComercial, pessoaJuridicaAprovadaResponse.idOrigemComercial) &&
        Objects.equals(this.idProduto, pessoaJuridicaAprovadaResponse.idProduto) &&
        Objects.equals(this.numeroBanco, pessoaJuridicaAprovadaResponse.numeroBanco) &&
        Objects.equals(this.numeroAgencia, pessoaJuridicaAprovadaResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, pessoaJuridicaAprovadaResponse.numeroContaCorrente) &&
        Objects.equals(this.email, pessoaJuridicaAprovadaResponse.email) &&
        Objects.equals(this.diaVencimento, pessoaJuridicaAprovadaResponse.diaVencimento) &&
        Objects.equals(this.nomeImpresso, pessoaJuridicaAprovadaResponse.nomeImpresso) &&
        Objects.equals(this.idConta, pessoaJuridicaAprovadaResponse.idConta) &&
        Objects.equals(this.idProposta, pessoaJuridicaAprovadaResponse.idProposta) &&
        Objects.equals(this.canalEntrada, pessoaJuridicaAprovadaResponse.canalEntrada) &&
        Objects.equals(this.valorPontuacao, pessoaJuridicaAprovadaResponse.valorPontuacao) &&
        Objects.equals(this.telefones, pessoaJuridicaAprovadaResponse.telefones) &&
        Objects.equals(this.enderecos, pessoaJuridicaAprovadaResponse.enderecos) &&
        Objects.equals(this.socios, pessoaJuridicaAprovadaResponse.socios) &&
        Objects.equals(this.referencias, pessoaJuridicaAprovadaResponse.referencias) &&
        Objects.equals(this.limiteGlobal, pessoaJuridicaAprovadaResponse.limiteGlobal) &&
        Objects.equals(this.limiteMaximo, pessoaJuridicaAprovadaResponse.limiteMaximo) &&
        Objects.equals(this.limiteParcelas, pessoaJuridicaAprovadaResponse.limiteParcelas) &&
        Objects.equals(this.impedidoFinanciamento, pessoaJuridicaAprovadaResponse.impedidoFinanciamento) &&
        Objects.equals(this.cnae, pessoaJuridicaAprovadaResponse.cnae) &&
        Objects.equals(this.formaConstituicao, pessoaJuridicaAprovadaResponse.formaConstituicao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, razaoSocial, nomeFantasia, cnpj, inscricaoEstadual, dataAberturaEmpresa, idOrigemComercial, idProduto, numeroBanco, numeroAgencia, numeroContaCorrente, email, diaVencimento, nomeImpresso, idConta, idProposta, canalEntrada, valorPontuacao, telefones, enderecos, socios, referencias, limiteGlobal, limiteMaximo, limiteParcelas, impedidoFinanciamento, cnae, formaConstituicao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaAprovadaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    canalEntrada: ").append(toIndentedString(canalEntrada)).append("\n");
    sb.append("    valorPontuacao: ").append(toIndentedString(valorPontuacao)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
    sb.append("    enderecos: ").append(toIndentedString(enderecos)).append("\n");
    sb.append("    socios: ").append(toIndentedString(socios)).append("\n");
    sb.append("    referencias: ").append(toIndentedString(referencias)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    limiteMaximo: ").append(toIndentedString(limiteMaximo)).append("\n");
    sb.append("    limiteParcelas: ").append(toIndentedString(limiteParcelas)).append("\n");
    sb.append("    impedidoFinanciamento: ").append(toIndentedString(impedidoFinanciamento)).append("\n");
    sb.append("    cnae: ").append(toIndentedString(cnae)).append("\n");
    sb.append("    formaConstituicao: ").append(toIndentedString(formaConstituicao)).append("\n");
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

