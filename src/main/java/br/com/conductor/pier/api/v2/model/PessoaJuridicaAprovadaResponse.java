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
 * {{{pessoa_juridica_aprovada_response_description}}}
 **/

@ApiModel(description = "{{{pessoa_juridica_aprovada_response_description}}}")
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

  
  /**
   * {{{pessoa_juridica_aprovada_response_id_value}}}
   **/
  public PessoaJuridicaAprovadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_razao_social_value}}}
   **/
  public PessoaJuridicaAprovadaResponse razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_razao_social_value}}}")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_nome_fantasia_value}}}
   **/
  public PessoaJuridicaAprovadaResponse nomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_nome_fantasia_value}}}")
  @JsonProperty("nomeFantasia")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_cnpj_value}}}
   **/
  public PessoaJuridicaAprovadaResponse cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_cnpj_value}}}")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_inscricao_estadual_value}}}
   **/
  public PessoaJuridicaAprovadaResponse inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_inscricao_estadual_value}}}")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_data_abertura_empresa_value}}}
   **/
  public PessoaJuridicaAprovadaResponse dataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_data_abertura_empresa_value}}}")
  @JsonProperty("dataAberturaEmpresa")
  public String getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_id_origem_comercial_value}}}
   **/
  public PessoaJuridicaAprovadaResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_id_origem_comercial_value}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_id_produto_value}}}
   **/
  public PessoaJuridicaAprovadaResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_numero_banco_value}}}
   **/
  public PessoaJuridicaAprovadaResponse numeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_numero_banco_value}}}")
  @JsonProperty("numeroBanco")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_numero_agencia_value}}}
   **/
  public PessoaJuridicaAprovadaResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_numero_conta_corrente_value}}}
   **/
  public PessoaJuridicaAprovadaResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_numero_conta_corrente_value}}}")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_email_value}}}
   **/
  public PessoaJuridicaAprovadaResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_dia_vencimento_value}}}
   **/
  public PessoaJuridicaAprovadaResponse diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_dia_vencimento_value}}}")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_nome_impresso_value}}}
   **/
  public PessoaJuridicaAprovadaResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_nome_impresso_value}}}")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_id_conta_value}}}
   **/
  public PessoaJuridicaAprovadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_id_proposta_value}}}
   **/
  public PessoaJuridicaAprovadaResponse idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_id_proposta_value}}}")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_canal_entrada_value}}}
   **/
  public PessoaJuridicaAprovadaResponse canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_canal_entrada_value}}}")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_valor_pontuacao_value}}}
   **/
  public PessoaJuridicaAprovadaResponse valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_valor_pontuacao_value}}}")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_telefones_value}}}
   **/
  public PessoaJuridicaAprovadaResponse telefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_telefones_value}}}")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_enderecos_value}}}
   **/
  public PessoaJuridicaAprovadaResponse enderecos(List<EnderecoAprovadoResponse> enderecos) {
    this.enderecos = enderecos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_enderecos_value}}}")
  @JsonProperty("enderecos")
  public List<EnderecoAprovadoResponse> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoResponse> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_socios_value}}}
   **/
  public PessoaJuridicaAprovadaResponse socios(List<SocioAprovadoResponse> socios) {
    this.socios = socios;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_socios_value}}}")
  @JsonProperty("socios")
  public List<SocioAprovadoResponse> getSocios() {
    return socios;
  }
  public void setSocios(List<SocioAprovadoResponse> socios) {
    this.socios = socios;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_referencias_value}}}
   **/
  public PessoaJuridicaAprovadaResponse referencias(List<ReferenciaComercialAprovadoResponse> referencias) {
    this.referencias = referencias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_juridica_aprovada_response_referencias_value}}}")
  @JsonProperty("referencias")
  public List<ReferenciaComercialAprovadoResponse> getReferencias() {
    return referencias;
  }
  public void setReferencias(List<ReferenciaComercialAprovadoResponse> referencias) {
    this.referencias = referencias;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_limite_global_value}}}
   **/
  public PessoaJuridicaAprovadaResponse limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_response_limite_global_value}}}")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_limite_maximo_value}}}
   **/
  public PessoaJuridicaAprovadaResponse limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_response_limite_maximo_value}}}")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_response_limite_parcelas_value}}}
   **/
  public PessoaJuridicaAprovadaResponse limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_juridica_aprovada_response_limite_parcelas_value}}}")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
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
        Objects.equals(this.limiteParcelas, pessoaJuridicaAprovadaResponse.limiteParcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, razaoSocial, nomeFantasia, cnpj, inscricaoEstadual, dataAberturaEmpresa, idOrigemComercial, idProduto, numeroBanco, numeroAgencia, numeroContaCorrente, email, diaVencimento, nomeImpresso, idConta, idProposta, canalEntrada, valorPontuacao, telefones, enderecos, socios, referencias, limiteGlobal, limiteMaximo, limiteParcelas);
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



