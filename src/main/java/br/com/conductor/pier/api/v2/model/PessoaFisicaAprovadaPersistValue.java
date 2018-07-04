package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.EnderecoAprovadoPersistValue;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersistValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{pessoa_fisica_aprovada_persist_description}}}
 **/

@ApiModel(description = "{{{pessoa_fisica_aprovada_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaFisicaAprovadaPersistValue   {
  
  private String nome = null;
  private String nomeMae = null;
  private String dataNascimento = null;
  private String sexo = null;
  private String cpf = null;
  private String numeroIdentidade = null;
  private String orgaoExpedidorIdentidade = null;
  private String unidadeFederativaIdentidade = null;
  private String dataEmissaoIdentidade = null;
  private Long idEstadoCivil = null;
  private String idProfissao = null;
  private Long idNaturezaOcupacao = null;
  private Long idNacionalidade = null;
  private Long idOrigemComercial = null;
  private Long idProduto = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorrente = null;
  private String email = null;
  private Integer diaVencimento = null;
  private String nomeImpresso = null;
  private String nomeEmpresa = null;
  private BigDecimal valorRenda = null;
  private String canalEntrada = null;
  private Integer valorPontuacao = null;
  private List<TelefonePessoaAprovadaPersistValue> telefones = new ArrayList<TelefonePessoaAprovadaPersistValue>();
  private List<EnderecoAprovadoPersistValue> enderecos = new ArrayList<EnderecoAprovadoPersistValue>();
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteMaximo = null;
  private BigDecimal limiteParcelas = null;
  private BigDecimal limiteConsignado = null;

  
  /**
   * {{{pessoa_fisica_aprovada_persist_nome_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_persist_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_nome_mae_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue nomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_nome_mae_value}}}")
  @JsonProperty("nomeMae")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_data_nascimento_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_data_nascimento_value}}}")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_sexo_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_sexo_value}}}")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_cpf_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_persist_cpf_value}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_numero_identidade_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_numero_identidade_value}}}")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_orgao_expedidor_identidade_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_orgao_expedidor_identidade_value}}}")
  @JsonProperty("orgaoExpedidorIdentidade")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_unidade_federativa_identidade_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_unidade_federativa_identidade_value}}}")
  @JsonProperty("unidadeFederativaIdentidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_data_emissao_identidade_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_data_emissao_identidade_value}}}")
  @JsonProperty("dataEmissaoIdentidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_estado_civil_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue idEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_id_estado_civil_value}}}")
  @JsonProperty("idEstadoCivil")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_profissao_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue idProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_id_profissao_value}}}")
  @JsonProperty("idProfissao")
  public String getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_natureza_ocupacao_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue idNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_id_natureza_ocupacao_value}}}")
  @JsonProperty("idNaturezaOcupacao")
  public Long getIdNaturezaOcupacao() {
    return idNaturezaOcupacao;
  }
  public void setIdNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_nacionalidade_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue idNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_id_nacionalidade_value}}}")
  @JsonProperty("idNacionalidade")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_origem_comercial_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_persist_id_origem_comercial_value}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_produto_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_persist_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_numero_agencia_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_numero_conta_corrente_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_numero_conta_corrente_value}}}")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_email_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_dia_vencimento_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_persist_dia_vencimento_value}}}")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_nome_impresso_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_nome_impresso_value}}}")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_nome_empresa_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue nomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_nome_empresa_value}}}")
  @JsonProperty("nomeEmpresa")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_valor_renda_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_valor_renda_value}}}")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_canal_entrada_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_canal_entrada_value}}}")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_valor_pontuacao_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_valor_pontuacao_value}}}")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_telefones_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue telefones(List<TelefonePessoaAprovadaPersistValue> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_persist_telefones_value}}}")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaPersistValue> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersistValue> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_enderecos_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue enderecos(List<EnderecoAprovadoPersistValue> enderecos) {
    this.enderecos = enderecos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_persist_enderecos_value}}}")
  @JsonProperty("enderecos")
  public List<EnderecoAprovadoPersistValue> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoPersistValue> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_limite_global_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_persist_limite_global_value}}}")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_limite_maximo_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_persist_limite_maximo_value}}}")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_limite_parcelas_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_persist_limite_parcelas_value}}}")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_limite_consignado_value}}}
   **/
  public PessoaFisicaAprovadaPersistValue limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_limite_consignado_value}}}")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaFisicaAprovadaPersistValue pessoaFisicaAprovadaPersistValue = (PessoaFisicaAprovadaPersistValue) o;
    return Objects.equals(this.nome, pessoaFisicaAprovadaPersistValue.nome) &&
        Objects.equals(this.nomeMae, pessoaFisicaAprovadaPersistValue.nomeMae) &&
        Objects.equals(this.dataNascimento, pessoaFisicaAprovadaPersistValue.dataNascimento) &&
        Objects.equals(this.sexo, pessoaFisicaAprovadaPersistValue.sexo) &&
        Objects.equals(this.cpf, pessoaFisicaAprovadaPersistValue.cpf) &&
        Objects.equals(this.numeroIdentidade, pessoaFisicaAprovadaPersistValue.numeroIdentidade) &&
        Objects.equals(this.orgaoExpedidorIdentidade, pessoaFisicaAprovadaPersistValue.orgaoExpedidorIdentidade) &&
        Objects.equals(this.unidadeFederativaIdentidade, pessoaFisicaAprovadaPersistValue.unidadeFederativaIdentidade) &&
        Objects.equals(this.dataEmissaoIdentidade, pessoaFisicaAprovadaPersistValue.dataEmissaoIdentidade) &&
        Objects.equals(this.idEstadoCivil, pessoaFisicaAprovadaPersistValue.idEstadoCivil) &&
        Objects.equals(this.idProfissao, pessoaFisicaAprovadaPersistValue.idProfissao) &&
        Objects.equals(this.idNaturezaOcupacao, pessoaFisicaAprovadaPersistValue.idNaturezaOcupacao) &&
        Objects.equals(this.idNacionalidade, pessoaFisicaAprovadaPersistValue.idNacionalidade) &&
        Objects.equals(this.idOrigemComercial, pessoaFisicaAprovadaPersistValue.idOrigemComercial) &&
        Objects.equals(this.idProduto, pessoaFisicaAprovadaPersistValue.idProduto) &&
        Objects.equals(this.numeroAgencia, pessoaFisicaAprovadaPersistValue.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, pessoaFisicaAprovadaPersistValue.numeroContaCorrente) &&
        Objects.equals(this.email, pessoaFisicaAprovadaPersistValue.email) &&
        Objects.equals(this.diaVencimento, pessoaFisicaAprovadaPersistValue.diaVencimento) &&
        Objects.equals(this.nomeImpresso, pessoaFisicaAprovadaPersistValue.nomeImpresso) &&
        Objects.equals(this.nomeEmpresa, pessoaFisicaAprovadaPersistValue.nomeEmpresa) &&
        Objects.equals(this.valorRenda, pessoaFisicaAprovadaPersistValue.valorRenda) &&
        Objects.equals(this.canalEntrada, pessoaFisicaAprovadaPersistValue.canalEntrada) &&
        Objects.equals(this.valorPontuacao, pessoaFisicaAprovadaPersistValue.valorPontuacao) &&
        Objects.equals(this.telefones, pessoaFisicaAprovadaPersistValue.telefones) &&
        Objects.equals(this.enderecos, pessoaFisicaAprovadaPersistValue.enderecos) &&
        Objects.equals(this.limiteGlobal, pessoaFisicaAprovadaPersistValue.limiteGlobal) &&
        Objects.equals(this.limiteMaximo, pessoaFisicaAprovadaPersistValue.limiteMaximo) &&
        Objects.equals(this.limiteParcelas, pessoaFisicaAprovadaPersistValue.limiteParcelas) &&
        Objects.equals(this.limiteConsignado, pessoaFisicaAprovadaPersistValue.limiteConsignado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, nomeMae, dataNascimento, sexo, cpf, numeroIdentidade, orgaoExpedidorIdentidade, unidadeFederativaIdentidade, dataEmissaoIdentidade, idEstadoCivil, idProfissao, idNaturezaOcupacao, idNacionalidade, idOrigemComercial, idProduto, numeroAgencia, numeroContaCorrente, email, diaVencimento, nomeImpresso, nomeEmpresa, valorRenda, canalEntrada, valorPontuacao, telefones, enderecos, limiteGlobal, limiteMaximo, limiteParcelas, limiteConsignado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaFisicaAprovadaPersistValue {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    nomeMae: ").append(toIndentedString(nomeMae)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    numeroIdentidade: ").append(toIndentedString(numeroIdentidade)).append("\n");
    sb.append("    orgaoExpedidorIdentidade: ").append(toIndentedString(orgaoExpedidorIdentidade)).append("\n");
    sb.append("    unidadeFederativaIdentidade: ").append(toIndentedString(unidadeFederativaIdentidade)).append("\n");
    sb.append("    dataEmissaoIdentidade: ").append(toIndentedString(dataEmissaoIdentidade)).append("\n");
    sb.append("    idEstadoCivil: ").append(toIndentedString(idEstadoCivil)).append("\n");
    sb.append("    idProfissao: ").append(toIndentedString(idProfissao)).append("\n");
    sb.append("    idNaturezaOcupacao: ").append(toIndentedString(idNaturezaOcupacao)).append("\n");
    sb.append("    idNacionalidade: ").append(toIndentedString(idNacionalidade)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    diaVencimento: ").append(toIndentedString(diaVencimento)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    nomeEmpresa: ").append(toIndentedString(nomeEmpresa)).append("\n");
    sb.append("    valorRenda: ").append(toIndentedString(valorRenda)).append("\n");
    sb.append("    canalEntrada: ").append(toIndentedString(canalEntrada)).append("\n");
    sb.append("    valorPontuacao: ").append(toIndentedString(valorPontuacao)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
    sb.append("    enderecos: ").append(toIndentedString(enderecos)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    limiteMaximo: ").append(toIndentedString(limiteMaximo)).append("\n");
    sb.append("    limiteParcelas: ").append(toIndentedString(limiteParcelas)).append("\n");
    sb.append("    limiteConsignado: ").append(toIndentedString(limiteConsignado)).append("\n");
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



