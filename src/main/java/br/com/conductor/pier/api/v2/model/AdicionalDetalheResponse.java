package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{adicional_detalhe_response_description}}}
 **/

@ApiModel(description = "{{{adicional_detalhe_response_description}}}")
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
   * {{{adicional_detalhe_response_id_conta_value}}}
   **/
  public AdicionalDetalheResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{adicional_detalhe_response_id_pessoa_value}}}
   **/
  public AdicionalDetalheResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{adicional_detalhe_response_nome_value}}}
   **/
  public AdicionalDetalheResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{adicional_detalhe_response_nome_impresso_value}}}
   **/
  public AdicionalDetalheResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_nome_impresso_value}}}")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{adicional_detalhe_response_numero_receita_federal_value}}}
   **/
  public AdicionalDetalheResponse numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_numero_receita_federal_value}}}")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{adicional_detalhe_response_data_nascimento_value}}}
   **/
  public AdicionalDetalheResponse dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{adicional_detalhe_response_data_nascimento_value}}}")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{adicional_detalhe_response_sexo_value}}}
   **/
  public AdicionalDetalheResponse sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_sexo_value}}}")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * {{{adicional_detalhe_response_numero_identidade_value}}}
   **/
  public AdicionalDetalheResponse numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_numero_identidade_value}}}")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * {{{adicional_detalhe_response_orgao_expedidor_identidade_value}}}
   **/
  public AdicionalDetalheResponse orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_orgao_expedidor_identidade_value}}}")
  @JsonProperty("orgaoExpedidorIdentidade")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * {{{adicional_detalhe_response_unidade_federativa_identidade_value}}}
   **/
  public AdicionalDetalheResponse unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_unidade_federativa_identidade_value}}}")
  @JsonProperty("unidadeFederativaIdentidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * {{{adicional_detalhe_response_data_emissao_identidade_value}}}
   **/
  public AdicionalDetalheResponse dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{adicional_detalhe_response_data_emissao_identidade_value}}}")
  @JsonProperty("dataEmissaoIdentidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * {{{adicional_detalhe_response_id_estado_civil_value}}}
   **/
  public AdicionalDetalheResponse idEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_id_estado_civil_value}}}")
  @JsonProperty("idEstadoCivil")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * {{{adicional_detalhe_response_id_profissao_value}}}
   **/
  public AdicionalDetalheResponse idProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_id_profissao_value}}}")
  @JsonProperty("idProfissao")
  public Long getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * {{{adicional_detalhe_response_id_nacionalidade_value}}}
   **/
  public AdicionalDetalheResponse idNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_id_nacionalidade_value}}}")
  @JsonProperty("idNacionalidade")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * {{{adicional_detalhe_response_id_parentesco_value}}}
   **/
  public AdicionalDetalheResponse idParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_id_parentesco_value}}}")
  @JsonProperty("idParentesco")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * {{{adicional_detalhe_response_email_value}}}
   **/
  public AdicionalDetalheResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{adicional_detalhe_response_flag_ativo_value}}}
   **/
  public AdicionalDetalheResponse flagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{adicional_detalhe_response_flag_ativo_value}}}")
  @JsonProperty("flagAtivo")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{adicional_detalhe_response_data_cadastro_portador_value}}}
   **/
  public AdicionalDetalheResponse dataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{adicional_detalhe_response_data_cadastro_portador_value}}}")
  @JsonProperty("dataCadastroPortador")
  public String getDataCadastroPortador() {
    return dataCadastroPortador;
  }
  public void setDataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
  }

  
  /**
   * {{{adicional_detalhe_response_data_cancelamento_portador_value}}}
   **/
  public AdicionalDetalheResponse dataCancelamentoPortador(String dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{adicional_detalhe_response_data_cancelamento_portador_value}}}")
  @JsonProperty("dataCancelamentoPortador")
  public String getDataCancelamentoPortador() {
    return dataCancelamentoPortador;
  }
  public void setDataCancelamentoPortador(String dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
  }

  
  /**
   * {{{adicional_detalhe_response_telefones_value}}}
   **/
  public AdicionalDetalheResponse telefones(List<TelefoneResponse> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adicional_detalhe_response_telefones_value}}}")
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

