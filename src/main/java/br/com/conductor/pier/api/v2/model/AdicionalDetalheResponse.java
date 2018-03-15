package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Resposta do recurso de cadastrar adicional detalhe
 **/

@ApiModel(description = "Resposta do recurso de cadastrar adicional detalhe")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdicionalDetalheResponse   {
  
  private Long idConta = null;
  private Long idPessoa = null;
  private String nome = null;
  private String nomeImpresso = null;
  private String numeroReceitaFederal = null;
  private String dataNascimento = null;
  private String sexo = null;
  private String numeroIdentidade = null;
  private String orgaoExpedidorIdentidade = null;
  private String unidadeFederativaIdentidade = null;
  private String dataEmissaoIdentidade = null;
  private Long idEstadoCivil = null;
  private Long idProfissao = null;
  private Long idNacionalidade = null;
  private Long idParentesco = null;
  private String email = null;
  private Integer flagAtivo = null;
  private String dataCadastroPortador = null;
  private String dataCancelamentoPortador = null;
  private List<TelefoneResponse> telefones = new ArrayList<TelefoneResponse>();

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta para cadastro do Adicional
   **/
  public AdicionalDetalheResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da Conta para cadastro do Adicional")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Pessoa Adicional
   **/
  public AdicionalDetalheResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da Pessoa Adicional")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Nome completo do Adicional
   **/
  public AdicionalDetalheResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome completo do Adicional")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Nome do Adicional que ser\u00E1 gravado no Cart\u00E3o
   **/
  public AdicionalDetalheResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Adicional que ser\u00E1 gravado no Cart\u00E3o")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * N\u00FAmero do CPF ou CNPJ do Adicional
   **/
  public AdicionalDetalheResponse numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do CPF ou CNPJ do Adicional")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Data de Nascimento do Adicional
   **/
  public AdicionalDetalheResponse dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de Nascimento do Adicional")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino), (\"O\": Outro), (\"N\": N\u00E3o Especificado).
   **/
  public AdicionalDetalheResponse sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino), (\"O\": Outro), (\"N\": N\u00E3o Especificado).")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * N\u00FAmero do Documento de Identidade do Adicional
   **/
  public AdicionalDetalheResponse numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do Documento de Identidade do Adicional")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Nome do Org\u00E3o Emissor do Documento de Identidade do Adicional
   **/
  public AdicionalDetalheResponse orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Org\u00E3o Emissor do Documento de Identidade do Adicional")
  @JsonProperty("orgaoExpedidorIdentidade")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Sigla da Unidade Federativa onde o Documento de Identidade do Adicional foi emitido
   **/
  public AdicionalDetalheResponse unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sigla da Unidade Federativa onde o Documento de Identidade do Adicional foi emitido")
  @JsonProperty("unidadeFederativaIdentidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Data de emiss\u00E3o do Documento de Identidade do Adicional
   **/
  public AdicionalDetalheResponse dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de emiss\u00E3o do Documento de Identidade do Adicional")
  @JsonProperty("dataEmissaoIdentidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Estado Civil do Adicional
   **/
  public AdicionalDetalheResponse idEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do Estado Civil do Adicional")
  @JsonProperty("idEstadoCivil")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Profissao do Adicional
   **/
  public AdicionalDetalheResponse idProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da Profissao do Adicional")
  @JsonProperty("idProfissao")
  public Long getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Nacionalidade do Adicional
   **/
  public AdicionalDetalheResponse idNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da Nacionalidade do Adicional")
  @JsonProperty("idNacionalidade")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular
   **/
  public AdicionalDetalheResponse idParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular")
  @JsonProperty("idParentesco")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular
   **/
  public AdicionalDetalheResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Indica se o adicional est\u00E1 ativo = 1 ou inativo = 0
   **/
  public AdicionalDetalheResponse flagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Indica se o adicional est\u00E1 ativo = 1 ou inativo = 0")
  @JsonProperty("flagAtivo")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Indica a data de cadastro do adicional
   **/
  public AdicionalDetalheResponse dataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Indica a data de cadastro do adicional")
  @JsonProperty("dataCadastroPortador")
  public String getDataCadastroPortador() {
    return dataCadastroPortador;
  }
  public void setDataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
  }

  
  /**
   * Indica a data de cancelamento do adicional
   **/
  public AdicionalDetalheResponse dataCancelamentoPortador(String dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Indica a data de cancelamento do adicional")
  @JsonProperty("dataCancelamentoPortador")
  public String getDataCancelamentoPortador() {
    return dataCancelamentoPortador;
  }
  public void setDataCancelamentoPortador(String dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
  }

  
  /**
   * Lista dos telefones do adicional
   **/
  public AdicionalDetalheResponse telefones(List<TelefoneResponse> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista dos telefones do adicional")
  @JsonProperty("telefones")
  public List<TelefoneResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefoneResponse> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdicionalDetalheResponse adicionalDetalheResponse = (AdicionalDetalheResponse) o;
    return Objects.equals(this.idConta, adicionalDetalheResponse.idConta) &&
        Objects.equals(this.idPessoa, adicionalDetalheResponse.idPessoa) &&
        Objects.equals(this.nome, adicionalDetalheResponse.nome) &&
        Objects.equals(this.nomeImpresso, adicionalDetalheResponse.nomeImpresso) &&
        Objects.equals(this.numeroReceitaFederal, adicionalDetalheResponse.numeroReceitaFederal) &&
        Objects.equals(this.dataNascimento, adicionalDetalheResponse.dataNascimento) &&
        Objects.equals(this.sexo, adicionalDetalheResponse.sexo) &&
        Objects.equals(this.numeroIdentidade, adicionalDetalheResponse.numeroIdentidade) &&
        Objects.equals(this.orgaoExpedidorIdentidade, adicionalDetalheResponse.orgaoExpedidorIdentidade) &&
        Objects.equals(this.unidadeFederativaIdentidade, adicionalDetalheResponse.unidadeFederativaIdentidade) &&
        Objects.equals(this.dataEmissaoIdentidade, adicionalDetalheResponse.dataEmissaoIdentidade) &&
        Objects.equals(this.idEstadoCivil, adicionalDetalheResponse.idEstadoCivil) &&
        Objects.equals(this.idProfissao, adicionalDetalheResponse.idProfissao) &&
        Objects.equals(this.idNacionalidade, adicionalDetalheResponse.idNacionalidade) &&
        Objects.equals(this.idParentesco, adicionalDetalheResponse.idParentesco) &&
        Objects.equals(this.email, adicionalDetalheResponse.email) &&
        Objects.equals(this.flagAtivo, adicionalDetalheResponse.flagAtivo) &&
        Objects.equals(this.dataCadastroPortador, adicionalDetalheResponse.dataCadastroPortador) &&
        Objects.equals(this.dataCancelamentoPortador, adicionalDetalheResponse.dataCancelamentoPortador) &&
        Objects.equals(this.telefones, adicionalDetalheResponse.telefones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idPessoa, nome, nomeImpresso, numeroReceitaFederal, dataNascimento, sexo, numeroIdentidade, orgaoExpedidorIdentidade, unidadeFederativaIdentidade, dataEmissaoIdentidade, idEstadoCivil, idProfissao, idNacionalidade, idParentesco, email, flagAtivo, dataCadastroPortador, dataCancelamentoPortador, telefones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdicionalDetalheResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    numeroIdentidade: ").append(toIndentedString(numeroIdentidade)).append("\n");
    sb.append("    orgaoExpedidorIdentidade: ").append(toIndentedString(orgaoExpedidorIdentidade)).append("\n");
    sb.append("    unidadeFederativaIdentidade: ").append(toIndentedString(unidadeFederativaIdentidade)).append("\n");
    sb.append("    dataEmissaoIdentidade: ").append(toIndentedString(dataEmissaoIdentidade)).append("\n");
    sb.append("    idEstadoCivil: ").append(toIndentedString(idEstadoCivil)).append("\n");
    sb.append("    idProfissao: ").append(toIndentedString(idProfissao)).append("\n");
    sb.append("    idNacionalidade: ").append(toIndentedString(idNacionalidade)).append("\n");
    sb.append("    idParentesco: ").append(toIndentedString(idParentesco)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    dataCadastroPortador: ").append(toIndentedString(dataCadastroPortador)).append("\n");
    sb.append("    dataCancelamentoPortador: ").append(toIndentedString(dataCancelamentoPortador)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
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

