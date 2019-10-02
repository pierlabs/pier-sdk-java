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
public class CredorPersist   {
  
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
    NENHUM("NENHUM"),
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
   * Telefones do credor
   **/
  public CredorPersist telefonesEscritoriosCobranca(List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca) {
    this.telefonesEscritoriosCobranca = telefonesEscritoriosCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Telefones do credor")
  @JsonProperty("telefonesEscritoriosCobranca")
  public List<TelefoneEscritorioCobrancaDTO> getTelefonesEscritoriosCobranca() {
    return telefonesEscritoriosCobranca;
  }
  public void setTelefonesEscritoriosCobranca(List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca) {
    this.telefonesEscritoriosCobranca = telefonesEscritoriosCobranca;
  }

  
  /**
   * Nome do credor
   **/
  public CredorPersist nomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do credor")
  @JsonProperty("nomeCredor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * Dia do pagamento caso seja semanal
   **/
  public CredorPersist diaPagamentoSemanal(Integer diaPagamentoSemanal) {
    this.diaPagamentoSemanal = diaPagamentoSemanal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dia do pagamento caso seja semanal")
  @JsonProperty("diaPagamentoSemanal")
  public Integer getDiaPagamentoSemanal() {
    return diaPagamentoSemanal;
  }
  public void setDiaPagamentoSemanal(Integer diaPagamentoSemanal) {
    this.diaPagamentoSemanal = diaPagamentoSemanal;
  }

  
  /**
   * Dia do pagamento caso seja mensal
   **/
  public CredorPersist diaPagamentoMensal(Integer diaPagamentoMensal) {
    this.diaPagamentoMensal = diaPagamentoMensal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dia do pagamento caso seja mensal")
  @JsonProperty("diaPagamentoMensal")
  public Integer getDiaPagamentoMensal() {
    return diaPagamentoMensal;
  }
  public void setDiaPagamentoMensal(Integer diaPagamentoMensal) {
    this.diaPagamentoMensal = diaPagamentoMensal;
  }

  
  /**
   * Dia do primeiro pagamento caso seja decendial
   **/
  public CredorPersist diaPagamentoDecendialPrimeiro(Integer diaPagamentoDecendialPrimeiro) {
    this.diaPagamentoDecendialPrimeiro = diaPagamentoDecendialPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dia do primeiro pagamento caso seja decendial")
  @JsonProperty("diaPagamentoDecendialPrimeiro")
  public Integer getDiaPagamentoDecendialPrimeiro() {
    return diaPagamentoDecendialPrimeiro;
  }
  public void setDiaPagamentoDecendialPrimeiro(Integer diaPagamentoDecendialPrimeiro) {
    this.diaPagamentoDecendialPrimeiro = diaPagamentoDecendialPrimeiro;
  }

  
  /**
   * Dia do segundo pagamento caso seja decendial
   **/
  public CredorPersist diaPagamentoDecendialSegundo(Integer diaPagamentoDecendialSegundo) {
    this.diaPagamentoDecendialSegundo = diaPagamentoDecendialSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dia do segundo pagamento caso seja decendial")
  @JsonProperty("diaPagamentoDecendialSegundo")
  public Integer getDiaPagamentoDecendialSegundo() {
    return diaPagamentoDecendialSegundo;
  }
  public void setDiaPagamentoDecendialSegundo(Integer diaPagamentoDecendialSegundo) {
    this.diaPagamentoDecendialSegundo = diaPagamentoDecendialSegundo;
  }

  
  /**
   * Dia do terceiro pagamento caso seja decendial
   **/
  public CredorPersist diaPagamentoDecendialTerceiro(Integer diaPagamentoDecendialTerceiro) {
    this.diaPagamentoDecendialTerceiro = diaPagamentoDecendialTerceiro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dia do terceiro pagamento caso seja decendial")
  @JsonProperty("diaPagamentoDecendialTerceiro")
  public Integer getDiaPagamentoDecendialTerceiro() {
    return diaPagamentoDecendialTerceiro;
  }
  public void setDiaPagamentoDecendialTerceiro(Integer diaPagamentoDecendialTerceiro) {
    this.diaPagamentoDecendialTerceiro = diaPagamentoDecendialTerceiro;
  }

  
  /**
   * Dia do primeiro pagamento caso seja quinzenal
   **/
  public CredorPersist diaPagamentoQuinzenalPrimeiro(Integer diaPagamentoQuinzenalPrimeiro) {
    this.diaPagamentoQuinzenalPrimeiro = diaPagamentoQuinzenalPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dia do primeiro pagamento caso seja quinzenal")
  @JsonProperty("diaPagamentoQuinzenalPrimeiro")
  public Integer getDiaPagamentoQuinzenalPrimeiro() {
    return diaPagamentoQuinzenalPrimeiro;
  }
  public void setDiaPagamentoQuinzenalPrimeiro(Integer diaPagamentoQuinzenalPrimeiro) {
    this.diaPagamentoQuinzenalPrimeiro = diaPagamentoQuinzenalPrimeiro;
  }

  
  /**
   * Dia do segundo pagamento caso seja quinzenal
   **/
  public CredorPersist diaPagamentoQuinzenalSegundo(Integer diaPagamentoQuinzenalSegundo) {
    this.diaPagamentoQuinzenalSegundo = diaPagamentoQuinzenalSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dia do segundo pagamento caso seja quinzenal")
  @JsonProperty("diaPagamentoQuinzenalSegundo")
  public Integer getDiaPagamentoQuinzenalSegundo() {
    return diaPagamentoQuinzenalSegundo;
  }
  public void setDiaPagamentoQuinzenalSegundo(Integer diaPagamentoQuinzenalSegundo) {
    this.diaPagamentoQuinzenalSegundo = diaPagamentoQuinzenalSegundo;
  }

  
  /**
   * Banco do credor
   **/
  public CredorPersist banco(Integer banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Banco do credor")
  @JsonProperty("banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * Ag\u00EAncia do credor
   **/
  public CredorPersist agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ag\u00EAncia do credor")
  @JsonProperty("agencia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * D\u00EDgito da ag\u00EAncia
   **/
  public CredorPersist digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00EDgito da ag\u00EAncia")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * Conta corrente do credor
   **/
  public CredorPersist contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conta corrente do credor")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * D\u00EDgito da conta corrente
   **/
  public CredorPersist digitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00EDgito da conta corrente")
  @JsonProperty("digitoContaCorrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * Banco credor
   **/
  public CredorPersist credorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Banco credor")
  @JsonProperty("credorBanco")
  public Boolean getCredorBanco() {
    return credorBanco;
  }
  public void setCredorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
  }

  
  /**
   * Percentual RAV
   **/
  public CredorPersist percentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Percentual RAV")
  @JsonProperty("percentualRAV")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * Identifica se o credor tem um RAV associado, e seu tipo
   **/
  public CredorPersist recebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica se o credor tem um RAV associado, e seu tipo")
  @JsonProperty("recebeRAV")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * Percentual de multiplica\u00E7\u00E3o utilizado para gerar taxa de desconto do RAV
   **/
  public CredorPersist percentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual de multiplica\u00E7\u00E3o utilizado para gerar taxa de desconto do RAV")
  @JsonProperty("percentualMultiplica")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * Taxa administrativa usada para gerar o valor do RAV
   **/
  public CredorPersist taxaAdministrativa(BigDecimal taxaAdministrativa) {
    this.taxaAdministrativa = taxaAdministrativa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa administrativa usada para gerar o valor do RAV")
  @JsonProperty("taxaAdministrativa")
  public BigDecimal getTaxaAdministrativa() {
    return taxaAdministrativa;
  }
  public void setTaxaAdministrativa(BigDecimal taxaAdministrativa) {
    this.taxaAdministrativa = taxaAdministrativa;
  }

  
  /**
   * Taxa do banco RAV
   **/
  public CredorPersist taxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa do banco RAV")
  @JsonProperty("taxaBanco")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * Valor limite do RAV
   **/
  public CredorPersist limiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor limite do RAV")
  @JsonProperty("limiteRAV")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  
  /**
   * Identificador da RAV do credor
   **/
  public CredorPersist idCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identificador da RAV do credor")
  @JsonProperty("idCredorRAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * Periodicidade do pagamento
   **/
  public CredorPersist periodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Periodicidade do pagamento")
  @JsonProperty("periodicidade")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * Identificador da pessoa jur\u00EDdica associada ao credor
   **/
  public CredorPersist idPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identificador da pessoa jur\u00EDdica associada ao credor")
  @JsonProperty("idPessoaJuridica")
  public Long getIdPessoaJuridica() {
    return idPessoaJuridica;
  }
  public void setIdPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
  }

  
  /**
   * Flag para controle interno
   **/
  public CredorPersist flagEscritorioCobranca(Boolean flagEscritorioCobranca) {
    this.flagEscritorioCobranca = flagEscritorioCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para controle interno")
  @JsonProperty("flagEscritorioCobranca")
  public Boolean getFlagEscritorioCobranca() {
    return flagEscritorioCobranca;
  }
  public void setFlagEscritorioCobranca(Boolean flagEscritorioCobranca) {
    this.flagEscritorioCobranca = flagEscritorioCobranca;
  }

  
  /**
   * Prefixo utilizado pelo escrit\u00F3rio de cobran\u00E7a
   **/
  public CredorPersist prefixo(String prefixo) {
    this.prefixo = prefixo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Prefixo utilizado pelo escrit\u00F3rio de cobran\u00E7a")
  @JsonProperty("prefixo")
  public String getPrefixo() {
    return prefixo;
  }
  public void setPrefixo(String prefixo) {
    this.prefixo = prefixo;
  }

  
  /**
   * Identifica se o escrit\u00F3rio de cobran\u00E7a est\u00E1 ativo
   **/
  public CredorPersist ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Identifica se o escrit\u00F3rio de cobran\u00E7a est\u00E1 ativo")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Nome para contato no escrit\u00F3rio de cobran\u00E7a
   **/
  public CredorPersist nomeContato(String nomeContato) {
    this.nomeContato = nomeContato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome para contato no escrit\u00F3rio de cobran\u00E7a")
  @JsonProperty("nomeContato")
  public String getNomeContato() {
    return nomeContato;
  }
  public void setNomeContato(String nomeContato) {
    this.nomeContato = nomeContato;
  }

  
  /**
   * Email do contato no escrit\u00F3rio de cobran\u00E7a
   **/
  public CredorPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email do contato no escrit\u00F3rio de cobran\u00E7a")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Logradouro do credor
   **/
  public CredorPersist nomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Logradouro do credor")
  @JsonProperty("nomeLogradouro")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * N\u00FAmero do endere\u00E7o do credor
   **/
  public CredorPersist numeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do endere\u00E7o do credor")
  @JsonProperty("numeroEndereco")
  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Complemento do endere\u00E7o do credor
   **/
  public CredorPersist complementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Complemento do endere\u00E7o do credor")
  @JsonProperty("complementoEndereco")
  public String getComplementoEndereco() {
    return complementoEndereco;
  }
  public void setComplementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
  }

  
  /**
   * Bairro do endere\u00E7o do credor
   **/
  public CredorPersist bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bairro do endere\u00E7o do credor")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Cidade do endere\u00E7o do credor
   **/
  public CredorPersist cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cidade do endere\u00E7o do credor")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * CEP do endere\u00E7o do credor
   **/
  public CredorPersist cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CEP do endere\u00E7o do credor")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * UF do endere\u00E7o do credor
   **/
  public CredorPersist uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "UF do endere\u00E7o do credor")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Respons\u00E1vel pelo credor
   **/
  public CredorPersist responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Respons\u00E1vel pelo credor")
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Identifica se h\u00E1 uma segunda via do acordo firmado
   **/
  public CredorPersist flagSegundaViaAcordo(Integer flagSegundaViaAcordo) {
    this.flagSegundaViaAcordo = flagSegundaViaAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica se h\u00E1 uma segunda via do acordo firmado")
  @JsonProperty("flagSegundaViaAcordo")
  public Integer getFlagSegundaViaAcordo() {
    return flagSegundaViaAcordo;
  }
  public void setFlagSegundaViaAcordo(Integer flagSegundaViaAcordo) {
    this.flagSegundaViaAcordo = flagSegundaViaAcordo;
  }

  
  /**
   * Valor m\u00EDnimo da parcela cobrado pelo escrit\u00F3rio de cobran\u00E7a
   **/
  public CredorPersist valorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00EDnimo da parcela cobrado pelo escrit\u00F3rio de cobran\u00E7a")
  @JsonProperty("valorMinimoParcela")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * Desconto m\u00E1ximo estabelecido pelo escrit\u00F3rio de cobran\u00E7a
   **/
  public CredorPersist descontoMaximo(BigDecimal descontoMaximo) {
    this.descontoMaximo = descontoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Desconto m\u00E1ximo estabelecido pelo escrit\u00F3rio de cobran\u00E7a")
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
    CredorPersist credorPersist = (CredorPersist) o;
    return Objects.equals(this.telefonesEscritoriosCobranca, credorPersist.telefonesEscritoriosCobranca) &&
        Objects.equals(this.nomeCredor, credorPersist.nomeCredor) &&
        Objects.equals(this.diaPagamentoSemanal, credorPersist.diaPagamentoSemanal) &&
        Objects.equals(this.diaPagamentoMensal, credorPersist.diaPagamentoMensal) &&
        Objects.equals(this.diaPagamentoDecendialPrimeiro, credorPersist.diaPagamentoDecendialPrimeiro) &&
        Objects.equals(this.diaPagamentoDecendialSegundo, credorPersist.diaPagamentoDecendialSegundo) &&
        Objects.equals(this.diaPagamentoDecendialTerceiro, credorPersist.diaPagamentoDecendialTerceiro) &&
        Objects.equals(this.diaPagamentoQuinzenalPrimeiro, credorPersist.diaPagamentoQuinzenalPrimeiro) &&
        Objects.equals(this.diaPagamentoQuinzenalSegundo, credorPersist.diaPagamentoQuinzenalSegundo) &&
        Objects.equals(this.banco, credorPersist.banco) &&
        Objects.equals(this.agencia, credorPersist.agencia) &&
        Objects.equals(this.digitoAgencia, credorPersist.digitoAgencia) &&
        Objects.equals(this.contaCorrente, credorPersist.contaCorrente) &&
        Objects.equals(this.digitoContaCorrente, credorPersist.digitoContaCorrente) &&
        Objects.equals(this.credorBanco, credorPersist.credorBanco) &&
        Objects.equals(this.percentualRAV, credorPersist.percentualRAV) &&
        Objects.equals(this.recebeRAV, credorPersist.recebeRAV) &&
        Objects.equals(this.percentualMultiplica, credorPersist.percentualMultiplica) &&
        Objects.equals(this.taxaAdministrativa, credorPersist.taxaAdministrativa) &&
        Objects.equals(this.taxaBanco, credorPersist.taxaBanco) &&
        Objects.equals(this.limiteRAV, credorPersist.limiteRAV) &&
        Objects.equals(this.idCredorRAV, credorPersist.idCredorRAV) &&
        Objects.equals(this.periodicidade, credorPersist.periodicidade) &&
        Objects.equals(this.idPessoaJuridica, credorPersist.idPessoaJuridica) &&
        Objects.equals(this.flagEscritorioCobranca, credorPersist.flagEscritorioCobranca) &&
        Objects.equals(this.prefixo, credorPersist.prefixo) &&
        Objects.equals(this.ativo, credorPersist.ativo) &&
        Objects.equals(this.nomeContato, credorPersist.nomeContato) &&
        Objects.equals(this.email, credorPersist.email) &&
        Objects.equals(this.nomeLogradouro, credorPersist.nomeLogradouro) &&
        Objects.equals(this.numeroEndereco, credorPersist.numeroEndereco) &&
        Objects.equals(this.complementoEndereco, credorPersist.complementoEndereco) &&
        Objects.equals(this.bairro, credorPersist.bairro) &&
        Objects.equals(this.cidade, credorPersist.cidade) &&
        Objects.equals(this.cep, credorPersist.cep) &&
        Objects.equals(this.uf, credorPersist.uf) &&
        Objects.equals(this.responsavel, credorPersist.responsavel) &&
        Objects.equals(this.flagSegundaViaAcordo, credorPersist.flagSegundaViaAcordo) &&
        Objects.equals(this.valorMinimoParcela, credorPersist.valorMinimoParcela) &&
        Objects.equals(this.descontoMaximo, credorPersist.descontoMaximo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telefonesEscritoriosCobranca, nomeCredor, diaPagamentoSemanal, diaPagamentoMensal, diaPagamentoDecendialPrimeiro, diaPagamentoDecendialSegundo, diaPagamentoDecendialTerceiro, diaPagamentoQuinzenalPrimeiro, diaPagamentoQuinzenalSegundo, banco, agencia, digitoAgencia, contaCorrente, digitoContaCorrente, credorBanco, percentualRAV, recebeRAV, percentualMultiplica, taxaAdministrativa, taxaBanco, limiteRAV, idCredorRAV, periodicidade, idPessoaJuridica, flagEscritorioCobranca, prefixo, ativo, nomeContato, email, nomeLogradouro, numeroEndereco, complementoEndereco, bairro, cidade, cep, uf, responsavel, flagSegundaViaAcordo, valorMinimoParcela, descontoMaximo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredorPersist {\n");
    
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

