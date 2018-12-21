package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{pessoa_detalhe_response_description}}}
 **/

@ApiModel(description = "{{{pessoa_detalhe_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaDetalheResponse   {
  
  private Long idPessoa = null;
  private String nomeMae = null;
  private Long idEstadoCivil = null;
  private String idProfissao = null;
  private Long idNaturezaOcupacao = null;
  private Long idNacionalidade = null;
  private Integer numeroBanco = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorrente = null;
  private String email = null;
  private String nomeEmpresa = null;
  private String nomeReferencia1 = null;
  private String enderecoReferencia1 = null;
  private String nomeReferencia2 = null;
  private String enderecoReferencia2 = null;
  private BigDecimal salario = null;
  private Boolean impedidoFinanciamento = null;
  private String naturalidadeCidade = null;
  private String naturalidadeEstado = null;
  private Integer grauInstrucao = null;
  private Integer numeroDependentes = null;
  private String nomePai = null;
  private Integer chequeEspecial = null;

  
  /**
   * {{{pessoa_detalhe_response_id_pessoa_value}}}
   **/
  public PessoaDetalheResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{pessoa_detalhe_response_nome_mae_value}}}
   **/
  public PessoaDetalheResponse nomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_nome_mae_value}}}")
  @JsonProperty("nomeMae")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  
  /**
   * {{{pessoa_detalhe_response_id_estado_civil_value}}}
   **/
  public PessoaDetalheResponse idEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_id_estado_civil_value}}}")
  @JsonProperty("idEstadoCivil")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * {{{pessoa_detalhe_response_id_profissao_value}}}
   **/
  public PessoaDetalheResponse idProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_id_profissao_value}}}")
  @JsonProperty("idProfissao")
  public String getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * {{{pessoa_detalhe_response_id_natureza_ocupacao_value}}}
   **/
  public PessoaDetalheResponse idNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_id_natureza_ocupacao_value}}}")
  @JsonProperty("idNaturezaOcupacao")
  public Long getIdNaturezaOcupacao() {
    return idNaturezaOcupacao;
  }
  public void setIdNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
  }

  
  /**
   * {{{pessoa_detalhe_response_id_nacionalidade_value}}}
   **/
  public PessoaDetalheResponse idNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_id_nacionalidade_value}}}")
  @JsonProperty("idNacionalidade")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * {{{pessoa_detalhe_response_numero_banco_value}}}
   **/
  public PessoaDetalheResponse numeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_numero_banco_value}}}")
  @JsonProperty("numeroBanco")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * {{{pessoa_detalhe_response_numero_agencia_value}}}
   **/
  public PessoaDetalheResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{pessoa_detalhe_response_numero_conta_corrente_value}}}
   **/
  public PessoaDetalheResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_numero_conta_corrente_value}}}")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{pessoa_detalhe_response_email_value}}}
   **/
  public PessoaDetalheResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{pessoa_detalhe_response_nome_empresa_value}}}
   **/
  public PessoaDetalheResponse nomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_nome_empresa_value}}}")
  @JsonProperty("nomeEmpresa")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * {{{pessoa_detalhe_response_nome_referencia_1_value}}}
   **/
  public PessoaDetalheResponse nomeReferencia1(String nomeReferencia1) {
    this.nomeReferencia1 = nomeReferencia1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_nome_referencia_1_value}}}")
  @JsonProperty("nomeReferencia1")
  public String getNomeReferencia1() {
    return nomeReferencia1;
  }
  public void setNomeReferencia1(String nomeReferencia1) {
    this.nomeReferencia1 = nomeReferencia1;
  }

  
  /**
   * {{{pessoa_detalhe_response_endereco_referencia_1_value}}}
   **/
  public PessoaDetalheResponse enderecoReferencia1(String enderecoReferencia1) {
    this.enderecoReferencia1 = enderecoReferencia1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_endereco_referencia_1_value}}}")
  @JsonProperty("enderecoReferencia1")
  public String getEnderecoReferencia1() {
    return enderecoReferencia1;
  }
  public void setEnderecoReferencia1(String enderecoReferencia1) {
    this.enderecoReferencia1 = enderecoReferencia1;
  }

  
  /**
   * {{{pessoa_detalhe_response_nome_referencia_2_value}}}
   **/
  public PessoaDetalheResponse nomeReferencia2(String nomeReferencia2) {
    this.nomeReferencia2 = nomeReferencia2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_nome_referencia_2_value}}}")
  @JsonProperty("nomeReferencia2")
  public String getNomeReferencia2() {
    return nomeReferencia2;
  }
  public void setNomeReferencia2(String nomeReferencia2) {
    this.nomeReferencia2 = nomeReferencia2;
  }

  
  /**
   * {{{pessoa_detalhe_response_endereco_referencia_2_value}}}
   **/
  public PessoaDetalheResponse enderecoReferencia2(String enderecoReferencia2) {
    this.enderecoReferencia2 = enderecoReferencia2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_endereco_referencia_2_value}}}")
  @JsonProperty("enderecoReferencia2")
  public String getEnderecoReferencia2() {
    return enderecoReferencia2;
  }
  public void setEnderecoReferencia2(String enderecoReferencia2) {
    this.enderecoReferencia2 = enderecoReferencia2;
  }

  
  /**
   * {{{pessoa_detalhe_response_salario_value}}}
   **/
  public PessoaDetalheResponse salario(BigDecimal salario) {
    this.salario = salario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_salario_value}}}")
  @JsonProperty("salario")
  public BigDecimal getSalario() {
    return salario;
  }
  public void setSalario(BigDecimal salario) {
    this.salario = salario;
  }

  
  /**
   * {{{pessoa_detalhe_response_impedido_de_financiamento_value}}}
   **/
  public PessoaDetalheResponse impedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{pessoa_detalhe_response_impedido_de_financiamento_value}}}")
  @JsonProperty("impedidoFinanciamento")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * {{{pessoa_detalhe_response_naturalidade_Cidade_value}}}
   **/
  public PessoaDetalheResponse naturalidadeCidade(String naturalidadeCidade) {
    this.naturalidadeCidade = naturalidadeCidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_naturalidade_Cidade_value}}}")
  @JsonProperty("naturalidadeCidade")
  public String getNaturalidadeCidade() {
    return naturalidadeCidade;
  }
  public void setNaturalidadeCidade(String naturalidadeCidade) {
    this.naturalidadeCidade = naturalidadeCidade;
  }

  
  /**
   * {{{pessoa_detalhe_response_naturalidade_Estado_value}}}
   **/
  public PessoaDetalheResponse naturalidadeEstado(String naturalidadeEstado) {
    this.naturalidadeEstado = naturalidadeEstado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_naturalidade_Estado_value}}}")
  @JsonProperty("naturalidadeEstado")
  public String getNaturalidadeEstado() {
    return naturalidadeEstado;
  }
  public void setNaturalidadeEstado(String naturalidadeEstado) {
    this.naturalidadeEstado = naturalidadeEstado;
  }

  
  /**
   * {{{pessoa_detalhe_response_grau_Instrucao_value}}}
   **/
  public PessoaDetalheResponse grauInstrucao(Integer grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_grau_Instrucao_value}}}")
  @JsonProperty("grauInstrucao")
  public Integer getGrauInstrucao() {
    return grauInstrucao;
  }
  public void setGrauInstrucao(Integer grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
  }

  
  /**
   * {{{pessoa_detalhe_response_numero_Dependentes_value}}}
   **/
  public PessoaDetalheResponse numeroDependentes(Integer numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_numero_Dependentes_value}}}")
  @JsonProperty("numeroDependentes")
  public Integer getNumeroDependentes() {
    return numeroDependentes;
  }
  public void setNumeroDependentes(Integer numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
  }

  
  /**
   * {{{pessoa_detalhe_response_nome_Pai_value}}}
   **/
  public PessoaDetalheResponse nomePai(String nomePai) {
    this.nomePai = nomePai;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_nome_Pai_value}}}")
  @JsonProperty("nomePai")
  public String getNomePai() {
    return nomePai;
  }
  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  
  /**
   * {{{pessoa_detalhe_response_cheque_Especial_value}}}
   **/
  public PessoaDetalheResponse chequeEspecial(Integer chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_detalhe_response_cheque_Especial_value}}}")
  @JsonProperty("chequeEspecial")
  public Integer getChequeEspecial() {
    return chequeEspecial;
  }
  public void setChequeEspecial(Integer chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaDetalheResponse pessoaDetalheResponse = (PessoaDetalheResponse) o;
    return Objects.equals(this.idPessoa, pessoaDetalheResponse.idPessoa) &&
        Objects.equals(this.nomeMae, pessoaDetalheResponse.nomeMae) &&
        Objects.equals(this.idEstadoCivil, pessoaDetalheResponse.idEstadoCivil) &&
        Objects.equals(this.idProfissao, pessoaDetalheResponse.idProfissao) &&
        Objects.equals(this.idNaturezaOcupacao, pessoaDetalheResponse.idNaturezaOcupacao) &&
        Objects.equals(this.idNacionalidade, pessoaDetalheResponse.idNacionalidade) &&
        Objects.equals(this.numeroBanco, pessoaDetalheResponse.numeroBanco) &&
        Objects.equals(this.numeroAgencia, pessoaDetalheResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, pessoaDetalheResponse.numeroContaCorrente) &&
        Objects.equals(this.email, pessoaDetalheResponse.email) &&
        Objects.equals(this.nomeEmpresa, pessoaDetalheResponse.nomeEmpresa) &&
        Objects.equals(this.nomeReferencia1, pessoaDetalheResponse.nomeReferencia1) &&
        Objects.equals(this.enderecoReferencia1, pessoaDetalheResponse.enderecoReferencia1) &&
        Objects.equals(this.nomeReferencia2, pessoaDetalheResponse.nomeReferencia2) &&
        Objects.equals(this.enderecoReferencia2, pessoaDetalheResponse.enderecoReferencia2) &&
        Objects.equals(this.salario, pessoaDetalheResponse.salario) &&
        Objects.equals(this.impedidoFinanciamento, pessoaDetalheResponse.impedidoFinanciamento) &&
        Objects.equals(this.naturalidadeCidade, pessoaDetalheResponse.naturalidadeCidade) &&
        Objects.equals(this.naturalidadeEstado, pessoaDetalheResponse.naturalidadeEstado) &&
        Objects.equals(this.grauInstrucao, pessoaDetalheResponse.grauInstrucao) &&
        Objects.equals(this.numeroDependentes, pessoaDetalheResponse.numeroDependentes) &&
        Objects.equals(this.nomePai, pessoaDetalheResponse.nomePai) &&
        Objects.equals(this.chequeEspecial, pessoaDetalheResponse.chequeEspecial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, nomeMae, idEstadoCivil, idProfissao, idNaturezaOcupacao, idNacionalidade, numeroBanco, numeroAgencia, numeroContaCorrente, email, nomeEmpresa, nomeReferencia1, enderecoReferencia1, nomeReferencia2, enderecoReferencia2, salario, impedidoFinanciamento, naturalidadeCidade, naturalidadeEstado, grauInstrucao, numeroDependentes, nomePai, chequeEspecial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaDetalheResponse {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    nomeMae: ").append(toIndentedString(nomeMae)).append("\n");
    sb.append("    idEstadoCivil: ").append(toIndentedString(idEstadoCivil)).append("\n");
    sb.append("    idProfissao: ").append(toIndentedString(idProfissao)).append("\n");
    sb.append("    idNaturezaOcupacao: ").append(toIndentedString(idNaturezaOcupacao)).append("\n");
    sb.append("    idNacionalidade: ").append(toIndentedString(idNacionalidade)).append("\n");
    sb.append("    numeroBanco: ").append(toIndentedString(numeroBanco)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nomeEmpresa: ").append(toIndentedString(nomeEmpresa)).append("\n");
    sb.append("    nomeReferencia1: ").append(toIndentedString(nomeReferencia1)).append("\n");
    sb.append("    enderecoReferencia1: ").append(toIndentedString(enderecoReferencia1)).append("\n");
    sb.append("    nomeReferencia2: ").append(toIndentedString(nomeReferencia2)).append("\n");
    sb.append("    enderecoReferencia2: ").append(toIndentedString(enderecoReferencia2)).append("\n");
    sb.append("    salario: ").append(toIndentedString(salario)).append("\n");
    sb.append("    impedidoFinanciamento: ").append(toIndentedString(impedidoFinanciamento)).append("\n");
    sb.append("    naturalidadeCidade: ").append(toIndentedString(naturalidadeCidade)).append("\n");
    sb.append("    naturalidadeEstado: ").append(toIndentedString(naturalidadeEstado)).append("\n");
    sb.append("    grauInstrucao: ").append(toIndentedString(grauInstrucao)).append("\n");
    sb.append("    numeroDependentes: ").append(toIndentedString(numeroDependentes)).append("\n");
    sb.append("    nomePai: ").append(toIndentedString(nomePai)).append("\n");
    sb.append("    chequeEspecial: ").append(toIndentedString(chequeEspecial)).append("\n");
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

