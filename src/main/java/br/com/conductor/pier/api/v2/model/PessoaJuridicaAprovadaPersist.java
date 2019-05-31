package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.EnderecoAprovadoPersist;
import br.com.conductor.pier.api.v2.model.ReferenciaComercialAprovadoPersist;
import br.com.conductor.pier.api.v2.model.SocioAprovadoPersist;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto de persist\u00EAncia da Pessoa Juridica Aprovada
 **/

@ApiModel(description = "Objeto de persist\u00EAncia da Pessoa Juridica Aprovada")
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
  private List<TelefonePessoaAprovadaPersist> telefones = new ArrayList<TelefonePessoaAprovadaPersist>();
  private List<EnderecoAprovadoPersist> enderecos = new ArrayList<EnderecoAprovadoPersist>();
  private List<SocioAprovadoPersist> socios = new ArrayList<SocioAprovadoPersist>();
  private List<ReferenciaComercialAprovadoPersist> referenciasComerciais = new ArrayList<ReferenciaComercialAprovadoPersist>();
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteMaximo = null;
  private BigDecimal limiteParcelas = null;
  private Boolean impedidoFinanciamento = null;
  private String cnae = null;
  private String formaConstituicao = null;

  
  /**
   * Nome completo da raz\u00E3o social. \u00C9 o nome empresarial
   **/
  public PessoaJuridicaAprovadaPersist razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "AZ Móveis Ltda", required = true, value = "Nome completo da raz\u00E3o social. \u00C9 o nome empresarial")
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
  public PessoaJuridicaAprovadaPersist nomeFantasia(String nomeFantasia) {
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
   * Number of the National Registry of Legal Entity
   **/
  public PessoaJuridicaAprovadaPersist cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "56555503000188", required = true, value = "Number of the National Registry of Legal Entity")
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
  public PessoaJuridicaAprovadaPersist inscricaoEstadual(String inscricaoEstadual) {
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
   * Data de abertura da empresa, essa data deve ser informada no formato: aaaa-MM-dd
   **/
  public PessoaJuridicaAprovadaPersist dataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "2019-01-01", required = true, value = "Data de abertura da empresa, essa data deve ser informada no formato: aaaa-MM-dd")
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
  public PessoaJuridicaAprovadaPersist idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "1", required = true, value = "C\u00F3digo identificador da origem comercial")
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
  public PessoaJuridicaAprovadaPersist idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "1", required = true, value = "C\u00F3digo identificador do produto")
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
  public PessoaJuridicaAprovadaPersist numeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
    return this;
  }
  
  @ApiModelProperty(example = "9999", value = "N\u00FAmero do banco")
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
  public PessoaJuridicaAprovadaPersist numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "9999", value = "N\u00FAmero da ag\u00EAncia")
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
  public PessoaJuridicaAprovadaPersist numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "9999999999", value = "N\u00FAmero da conta corrente")
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
  public PessoaJuridicaAprovadaPersist email(String email) {
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
  public PessoaJuridicaAprovadaPersist diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "5", required = true, value = "Dia vencimento")
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
  public PessoaJuridicaAprovadaPersist nomeImpresso(String nomeImpresso) {
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
   * Valor da renda comprovada
   **/
  public PessoaJuridicaAprovadaPersist valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "50000.0", value = "Valor da renda comprovada")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Canal pelo qual o cadastro do cliente foi realizado
   **/
  public PessoaJuridicaAprovadaPersist canalEntrada(String canalEntrada) {
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
   * Valor da pontua\u00E7\u00E3o atribu\u00EDdo ao cliente. Default: 0
   **/
  public PessoaJuridicaAprovadaPersist valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "99", value = "Valor da pontua\u00E7\u00E3o atribu\u00EDdo ao cliente. Default: 0")
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
  public PessoaJuridicaAprovadaPersist telefones(List<TelefonePessoaAprovadaPersist> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Telefones da empresa")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersist> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * Enderecos da empresa
   **/
  public PessoaJuridicaAprovadaPersist enderecos(List<EnderecoAprovadoPersist> enderecos) {
    this.enderecos = enderecos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Enderecos da empresa")
  @JsonProperty("enderecos")
  public List<EnderecoAprovadoPersist> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoPersist> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * S\u00F3cios da empresa
   **/
  public PessoaJuridicaAprovadaPersist socios(List<SocioAprovadoPersist> socios) {
    this.socios = socios;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "S\u00F3cios da empresa")
  @JsonProperty("socios")
  public List<SocioAprovadoPersist> getSocios() {
    return socios;
  }
  public void setSocios(List<SocioAprovadoPersist> socios) {
    this.socios = socios;
  }

  
  /**
   * Refer\u00EAncias comerciais da Empresa
   **/
  public PessoaJuridicaAprovadaPersist referenciasComerciais(List<ReferenciaComercialAprovadoPersist> referenciasComerciais) {
    this.referenciasComerciais = referenciasComerciais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Refer\u00EAncias comerciais da Empresa")
  @JsonProperty("referenciasComerciais")
  public List<ReferenciaComercialAprovadoPersist> getReferenciasComerciais() {
    return referenciasComerciais;
  }
  public void setReferenciasComerciais(List<ReferenciaComercialAprovadoPersist> referenciasComerciais) {
    this.referenciasComerciais = referenciasComerciais;
  }

  
  /**
   * Valor do Limite Global para a conta
   **/
  public PessoaJuridicaAprovadaPersist limiteGlobal(BigDecimal limiteGlobal) {
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
  public PessoaJuridicaAprovadaPersist limiteMaximo(BigDecimal limiteMaximo) {
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
  public PessoaJuridicaAprovadaPersist limiteParcelas(BigDecimal limiteParcelas) {
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
  public PessoaJuridicaAprovadaPersist impedidoFinanciamento(Boolean impedidoFinanciamento) {
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
  public PessoaJuridicaAprovadaPersist cnae(String cnae) {
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
  public PessoaJuridicaAprovadaPersist formaConstituicao(String formaConstituicao) {
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
        Objects.equals(this.impedidoFinanciamento, pessoaJuridicaAprovadaPersist.impedidoFinanciamento) &&
        Objects.equals(this.cnae, pessoaJuridicaAprovadaPersist.cnae) &&
        Objects.equals(this.formaConstituicao, pessoaJuridicaAprovadaPersist.formaConstituicao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(razaoSocial, nomeFantasia, cnpj, inscricaoEstadual, dataAberturaEmpresa, idOrigemComercial, idProduto, numeroBanco, numeroAgencia, numeroContaCorrente, email, diaVencimento, nomeImpresso, valorRenda, canalEntrada, valorPontuacao, telefones, enderecos, socios, referenciasComerciais, limiteGlobal, limiteMaximo, limiteParcelas, impedidoFinanciamento, cnae, formaConstituicao);
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

