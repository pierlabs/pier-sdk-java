package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de credor
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de credor")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CredorResponse   {
  
  private Long id = null;
  private Long idPessoaJuridica = null;
  private String nome = null;


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


  public enum PagamentoSemanalEnum {
    SEGUNDA("SEGUNDA"),
    TERCA("TERCA"),
    QUARTA("QUARTA"),
    QUINTA("QUINTA"),
    SEXTA("SEXTA"),
    SABADO("SABADO"),
    DOMINGO("DOMINGO");

    private String value;

    PagamentoSemanalEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PagamentoSemanalEnum pagamentoSemanal = null;
  private Integer pagamentoMensal = null;
  private Integer pagamentoDecendialPrimeiro = null;
  private Integer pagamentoDecendialSegundo = null;
  private Integer pagamentoDecendialTerceiro = null;
  private Integer pagamentoQuinzenalPrimeiro = null;
  private Integer pagamentoQuinzenalSegundo = null;
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
  private BigDecimal taxaAdm = null;
  private BigDecimal taxaBanco = null;
  private BigDecimal limiteRAV = null;
  private Long idCredorRAV = null;
  private Integer banco = null;
  private Integer agencia = null;
  private String digitoVerificadorAgencia = null;
  private String contaCorrente = null;
  private String digitoVerificadorContaCorrente = null;
  private String usuario = null;

  
  /**
   * C\u00C3\u00B3digo identificador do credor
   **/
  public CredorResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do credor")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da pessoa jur\u00C3\u00ADdica do credor
   **/
  public CredorResponse idPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
    return this;
  }
  
  @ApiModelProperty(example = "10", value = "Identificador da pessoa jur\u00C3\u00ADdica do credor")
  @JsonProperty("idPessoaJuridica")
  public Long getIdPessoaJuridica() {
    return idPessoaJuridica;
  }
  public void setIdPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
  }

  
  /**
   * Nome do credor
   **/
  public CredorResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "Exemplo", value = "Nome do credor")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Periodicidade do pagamento
   **/
  public CredorResponse periodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
    return this;
  }
  
  @ApiModelProperty(example = "DIARIO", value = "Periodicidade do pagamento")
  @JsonProperty("periodicidade")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * Dia para pagamento semanal
   **/
  public CredorResponse pagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
    return this;
  }
  
  @ApiModelProperty(example = "SEGUNDA", value = "Dia para pagamento semanal")
  @JsonProperty("pagamentoSemanal")
  public PagamentoSemanalEnum getPagamentoSemanal() {
    return pagamentoSemanal;
  }
  public void setPagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
  }

  
  /**
   * Dia da data para o pagamento mensal
   **/
  public CredorResponse pagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
    return this;
  }
  
  @ApiModelProperty(example = "10", value = "Dia da data para o pagamento mensal")
  @JsonProperty("pagamentoMensal")
  public Integer getPagamentoMensal() {
    return pagamentoMensal;
  }
  public void setPagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
  }

  
  /**
   * Dia da data para o primeiro pagamento decendial
   **/
  public CredorResponse pagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "Dia da data para o primeiro pagamento decendial")
  @JsonProperty("pagamentoDecendialPrimeiro")
  public Integer getPagamentoDecendialPrimeiro() {
    return pagamentoDecendialPrimeiro;
  }
  public void setPagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
  }

  
  /**
   * Dia da data para o segundo pagamento decendial
   **/
  public CredorResponse pagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "15", value = "Dia da data para o segundo pagamento decendial")
  @JsonProperty("pagamentoDecendialSegundo")
  public Integer getPagamentoDecendialSegundo() {
    return pagamentoDecendialSegundo;
  }
  public void setPagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
  }

  
  /**
   * Dia da data para o terceiro pagamento decendial
   **/
  public CredorResponse pagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
    return this;
  }
  
  @ApiModelProperty(example = "25", value = "Dia da data para o terceiro pagamento decendial")
  @JsonProperty("pagamentoDecendialTerceiro")
  public Integer getPagamentoDecendialTerceiro() {
    return pagamentoDecendialTerceiro;
  }
  public void setPagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
  }

  
  /**
   * Dia da data para o primeiro pagamento quinzenal
   **/
  public CredorResponse pagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "Dia da data para o primeiro pagamento quinzenal")
  @JsonProperty("pagamentoQuinzenalPrimeiro")
  public Integer getPagamentoQuinzenalPrimeiro() {
    return pagamentoQuinzenalPrimeiro;
  }
  public void setPagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
  }

  
  /**
   * Dia da data para o segundo pagamento quinzenal
   **/
  public CredorResponse pagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "20", value = "Dia da data para o segundo pagamento quinzenal")
  @JsonProperty("pagamentoQuinzenalSegundo")
  public Integer getPagamentoQuinzenalSegundo() {
    return pagamentoQuinzenalSegundo;
  }
  public void setPagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
  }

  
  /**
   * Indica se este credor pode ser um Credor RAV de outros credores
   **/
  public CredorResponse credorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se este credor pode ser um Credor RAV de outros credores")
  @JsonProperty("credorBanco")
  public Boolean getCredorBanco() {
    return credorBanco;
  }
  public void setCredorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
  }

  
  /**
   * Valor percentual do RAV do credor
   **/
  public CredorResponse percentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
    return this;
  }
  
  @ApiModelProperty(example = "0.015", value = "Valor percentual do RAV do credor")
  @JsonProperty("percentualRAV")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * Indica se o credor recebe RAV e o tipo
   **/
  public CredorResponse recebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
    return this;
  }
  
  @ApiModelProperty(example = "NAO_TEM_PERMISSAO_RAV", value = "Indica se o credor recebe RAV e o tipo")
  @JsonProperty("recebeRAV")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * Percentual Multiplica
   **/
  public CredorResponse percentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "Percentual Multiplica")
  @JsonProperty("percentualMultiplica")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * Taxa Administrativa
   **/
  public CredorResponse taxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "Taxa Administrativa")
  @JsonProperty("taxaAdm")
  public BigDecimal getTaxaAdm() {
    return taxaAdm;
  }
  public void setTaxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
  }

  
  /**
   * Taxa do Banco
   **/
  public CredorResponse taxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "Taxa do Banco")
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
  public CredorResponse limiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
    return this;
  }
  
  @ApiModelProperty(example = "0.015", value = "Valor limite do RAV")
  @JsonProperty("limiteRAV")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do credor RAV
   **/
  public CredorResponse idCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
    return this;
  }
  
  @ApiModelProperty(example = "10", value = "C\u00C3\u00B3digo identificador do credor RAV")
  @JsonProperty("idCredorRAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * C\u00C3\u00B3digo do banco
   **/
  public CredorResponse banco(Integer banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "C\u00C3\u00B3digo do banco")
  @JsonProperty("banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   **/
  public CredorResponse agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "4571", value = "Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica")
  @JsonProperty("agencia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * D\u00C3\u00ADgito Verificador da ag\u00C3\u00AAncia
   **/
  public CredorResponse digitoVerificadorAgencia(String digitoVerificadorAgencia) {
    this.digitoVerificadorAgencia = digitoVerificadorAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "X", value = "D\u00C3\u00ADgito Verificador da ag\u00C3\u00AAncia")
  @JsonProperty("digitoVerificadorAgencia")
  public String getDigitoVerificadorAgencia() {
    return digitoVerificadorAgencia;
  }
  public void setDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
    this.digitoVerificadorAgencia = digitoVerificadorAgencia;
  }

  
  /**
   * C\u00C3\u00B3digo da Conta Corrente
   **/
  public CredorResponse contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "100887", value = "C\u00C3\u00B3digo da Conta Corrente")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * D\u00C3\u00ADgito Verificador da Conta Corrente
   **/
  public CredorResponse digitoVerificadorContaCorrente(String digitoVerificadorContaCorrente) {
    this.digitoVerificadorContaCorrente = digitoVerificadorContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "D\u00C3\u00ADgito Verificador da Conta Corrente")
  @JsonProperty("digitoVerificadorContaCorrente")
  public String getDigitoVerificadorContaCorrente() {
    return digitoVerificadorContaCorrente;
  }
  public void setDigitoVerificadorContaCorrente(String digitoVerificadorContaCorrente) {
    this.digitoVerificadorContaCorrente = digitoVerificadorContaCorrente;
  }

  
  /**
   * Login do usu\u00C3\u00A1rio para registro da inser\u00C3\u00A7\u00C3\u00A3o
   **/
  public CredorResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Login do usu\u00C3\u00A1rio para registro da inser\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredorResponse credorResponse = (CredorResponse) o;
    return Objects.equals(this.id, credorResponse.id) &&
        Objects.equals(this.idPessoaJuridica, credorResponse.idPessoaJuridica) &&
        Objects.equals(this.nome, credorResponse.nome) &&
        Objects.equals(this.periodicidade, credorResponse.periodicidade) &&
        Objects.equals(this.pagamentoSemanal, credorResponse.pagamentoSemanal) &&
        Objects.equals(this.pagamentoMensal, credorResponse.pagamentoMensal) &&
        Objects.equals(this.pagamentoDecendialPrimeiro, credorResponse.pagamentoDecendialPrimeiro) &&
        Objects.equals(this.pagamentoDecendialSegundo, credorResponse.pagamentoDecendialSegundo) &&
        Objects.equals(this.pagamentoDecendialTerceiro, credorResponse.pagamentoDecendialTerceiro) &&
        Objects.equals(this.pagamentoQuinzenalPrimeiro, credorResponse.pagamentoQuinzenalPrimeiro) &&
        Objects.equals(this.pagamentoQuinzenalSegundo, credorResponse.pagamentoQuinzenalSegundo) &&
        Objects.equals(this.credorBanco, credorResponse.credorBanco) &&
        Objects.equals(this.percentualRAV, credorResponse.percentualRAV) &&
        Objects.equals(this.recebeRAV, credorResponse.recebeRAV) &&
        Objects.equals(this.percentualMultiplica, credorResponse.percentualMultiplica) &&
        Objects.equals(this.taxaAdm, credorResponse.taxaAdm) &&
        Objects.equals(this.taxaBanco, credorResponse.taxaBanco) &&
        Objects.equals(this.limiteRAV, credorResponse.limiteRAV) &&
        Objects.equals(this.idCredorRAV, credorResponse.idCredorRAV) &&
        Objects.equals(this.banco, credorResponse.banco) &&
        Objects.equals(this.agencia, credorResponse.agencia) &&
        Objects.equals(this.digitoVerificadorAgencia, credorResponse.digitoVerificadorAgencia) &&
        Objects.equals(this.contaCorrente, credorResponse.contaCorrente) &&
        Objects.equals(this.digitoVerificadorContaCorrente, credorResponse.digitoVerificadorContaCorrente) &&
        Objects.equals(this.usuario, credorResponse.usuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idPessoaJuridica, nome, periodicidade, pagamentoSemanal, pagamentoMensal, pagamentoDecendialPrimeiro, pagamentoDecendialSegundo, pagamentoDecendialTerceiro, pagamentoQuinzenalPrimeiro, pagamentoQuinzenalSegundo, credorBanco, percentualRAV, recebeRAV, percentualMultiplica, taxaAdm, taxaBanco, limiteRAV, idCredorRAV, banco, agencia, digitoVerificadorAgencia, contaCorrente, digitoVerificadorContaCorrente, usuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredorResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idPessoaJuridica: ").append(toIndentedString(idPessoaJuridica)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    periodicidade: ").append(toIndentedString(periodicidade)).append("\n");
    sb.append("    pagamentoSemanal: ").append(toIndentedString(pagamentoSemanal)).append("\n");
    sb.append("    pagamentoMensal: ").append(toIndentedString(pagamentoMensal)).append("\n");
    sb.append("    pagamentoDecendialPrimeiro: ").append(toIndentedString(pagamentoDecendialPrimeiro)).append("\n");
    sb.append("    pagamentoDecendialSegundo: ").append(toIndentedString(pagamentoDecendialSegundo)).append("\n");
    sb.append("    pagamentoDecendialTerceiro: ").append(toIndentedString(pagamentoDecendialTerceiro)).append("\n");
    sb.append("    pagamentoQuinzenalPrimeiro: ").append(toIndentedString(pagamentoQuinzenalPrimeiro)).append("\n");
    sb.append("    pagamentoQuinzenalSegundo: ").append(toIndentedString(pagamentoQuinzenalSegundo)).append("\n");
    sb.append("    credorBanco: ").append(toIndentedString(credorBanco)).append("\n");
    sb.append("    percentualRAV: ").append(toIndentedString(percentualRAV)).append("\n");
    sb.append("    recebeRAV: ").append(toIndentedString(recebeRAV)).append("\n");
    sb.append("    percentualMultiplica: ").append(toIndentedString(percentualMultiplica)).append("\n");
    sb.append("    taxaAdm: ").append(toIndentedString(taxaAdm)).append("\n");
    sb.append("    taxaBanco: ").append(toIndentedString(taxaBanco)).append("\n");
    sb.append("    limiteRAV: ").append(toIndentedString(limiteRAV)).append("\n");
    sb.append("    idCredorRAV: ").append(toIndentedString(idCredorRAV)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    digitoVerificadorAgencia: ").append(toIndentedString(digitoVerificadorAgencia)).append("\n");
    sb.append("    contaCorrente: ").append(toIndentedString(contaCorrente)).append("\n");
    sb.append("    digitoVerificadorContaCorrente: ").append(toIndentedString(digitoVerificadorContaCorrente)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
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



