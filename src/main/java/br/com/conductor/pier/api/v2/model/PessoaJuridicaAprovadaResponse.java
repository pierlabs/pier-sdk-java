package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.EnderecoAprovadoResponse;
import br.com.conductor.pier.api.v2.model.SocioAprovadoResponse;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
  private Integer numeroAgencia = null;
  private String numeroContaCorrente = null;
  private String email = null;
  private Integer diaVencimento = null;
  private String nomeImpresso = null;
  private List<TelefonePessoaAprovadaResponse> telefones = new ArrayList<TelefonePessoaAprovadaResponse>();
  private List<EnderecoAprovadoResponse> enderecos = new ArrayList<EnderecoAprovadoResponse>();
  private List<SocioAprovadoResponse> socios = new ArrayList<SocioAprovadoResponse>();

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o (id)
   **/
  public PessoaJuridicaAprovadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o nome completo da raz\u00C3\u00A3o social (nome empresarial)'.
   **/
  public PessoaJuridicaAprovadaResponse razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome completo da raz\u00C3\u00A3o social (nome empresarial)'.")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Apresenta o nome fantasia da empresa.
   **/
  public PessoaJuridicaAprovadaResponse nomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome fantasia da empresa.")
  @JsonProperty("nomeFantasia")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * N\u00C3\u00BAmero do Cadastro Nacional de Pessoa Juridica (CNPJ)
   **/
  public PessoaJuridicaAprovadaResponse cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do Cadastro Nacional de Pessoa Juridica (CNPJ)")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * N\u00C3\u00BAmero da Inscri\u00C3\u00A7\u00C3\u00A3o Estadual (IE).
   **/
  public PessoaJuridicaAprovadaResponse inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da Inscri\u00C3\u00A7\u00C3\u00A3o Estadual (IE).")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Data de abertura da empresa, essa data deve ser informada no formato: aaaa-MM-dd.
   **/
  public PessoaJuridicaAprovadaResponse dataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de abertura da empresa, essa data deve ser informada no formato: aaaa-MM-dd.")
  @JsonProperty("dataAberturaEmpresa")
  public String getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * Id da origem comercial
   **/
  public PessoaJuridicaAprovadaResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id da origem comercial")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Id do produto
   **/
  public PessoaJuridicaAprovadaResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do produto")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * N\u00C3\u00BAmero da ag\u00C3\u00AAncia.
   **/
  public PessoaJuridicaAprovadaResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da ag\u00C3\u00AAncia.")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00C3\u00BAmero da conta corrente.
   **/
  public PessoaJuridicaAprovadaResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da conta corrente.")
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
  
  @ApiModelProperty(example = "null", value = "Email da empresa")
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
  
  @ApiModelProperty(example = "null", value = "Dia vencimento")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Nome que deve ser impresso no cart\u00C3\u00A3o
   **/
  public PessoaJuridicaAprovadaResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome que deve ser impresso no cart\u00C3\u00A3o")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Apresenta os telefones da empresa
   **/
  public PessoaJuridicaAprovadaResponse telefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os telefones da empresa")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * Pode ser informado os seguintes tipos de endere\u00C3\u00A7o: Residencial, Comercial, e Outros
   **/
  public PessoaJuridicaAprovadaResponse enderecos(List<EnderecoAprovadoResponse> enderecos) {
    this.enderecos = enderecos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pode ser informado os seguintes tipos de endere\u00C3\u00A7o: Residencial, Comercial, e Outros")
  @JsonProperty("enderecos")
  public List<EnderecoAprovadoResponse> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoResponse> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * Apresenta os dados dos s\u00C3\u00B3cios da empresa, caso exista
   **/
  public PessoaJuridicaAprovadaResponse socios(List<SocioAprovadoResponse> socios) {
    this.socios = socios;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os dados dos s\u00C3\u00B3cios da empresa, caso exista")
  @JsonProperty("socios")
  public List<SocioAprovadoResponse> getSocios() {
    return socios;
  }
  public void setSocios(List<SocioAprovadoResponse> socios) {
    this.socios = socios;
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
        Objects.equals(this.numeroAgencia, pessoaJuridicaAprovadaResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, pessoaJuridicaAprovadaResponse.numeroContaCorrente) &&
        Objects.equals(this.email, pessoaJuridicaAprovadaResponse.email) &&
        Objects.equals(this.diaVencimento, pessoaJuridicaAprovadaResponse.diaVencimento) &&
        Objects.equals(this.nomeImpresso, pessoaJuridicaAprovadaResponse.nomeImpresso) &&
        Objects.equals(this.telefones, pessoaJuridicaAprovadaResponse.telefones) &&
        Objects.equals(this.enderecos, pessoaJuridicaAprovadaResponse.enderecos) &&
        Objects.equals(this.socios, pessoaJuridicaAprovadaResponse.socios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, razaoSocial, nomeFantasia, cnpj, inscricaoEstadual, dataAberturaEmpresa, idOrigemComercial, idProduto, numeroAgencia, numeroContaCorrente, email, diaVencimento, nomeImpresso, telefones, enderecos, socios);
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
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    diaVencimento: ").append(toIndentedString(diaVencimento)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
    sb.append("    enderecos: ").append(toIndentedString(enderecos)).append("\n");
    sb.append("    socios: ").append(toIndentedString(socios)).append("\n");
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



