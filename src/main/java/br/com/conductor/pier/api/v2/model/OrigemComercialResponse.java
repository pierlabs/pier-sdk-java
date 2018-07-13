package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ProdutoOrigemResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{origem_comercial_response_description}}}
 **/

@ApiModel(description = "{{{origem_comercial_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OrigemComercialResponse   {
  
  private Long id = null;
  private String nome = null;
  private String descricao = null;
  private List<ProdutoOrigemResponse> produtosOrigem = new ArrayList<ProdutoOrigemResponse>();
  private Long idEstabelecimento = null;
  private Long idTipoOrigemComercial = null;
  private String nomeTipoOrigemComercial = null;
  private Long idGrupoOrigemComercial = null;
  private String nomeGrupoOrigemComercial = null;
  private Integer status = null;
  private Boolean flagPreAprovado = null;
  private Boolean flagAprovacaoImediata = null;
  private String nomeFantasiaPlastico = null;
  private Boolean flagCartaoProvisorio = null;
  private Boolean flagCartaoDefinitivo = null;
  private String usuario = null;
  private String senha = null;
  private Boolean flagOrigemExterna = null;
  private Boolean flagModificado = null;
  private Boolean flagEnviaFaturaUsuario = null;
  private Boolean flagCreditoFaturamento = null;
  private Boolean flagConcedeLimiteProvisorio = null;
  private Boolean flagDigitalizarDoc = null;
  private Boolean flagEmbossingLoja = null;
  private Boolean flagConsultaPrevia = null;


  public enum TipoPessoaEnum {
    FISICA("PESSOA_FISICA"),
    JURIDICA("PESSOA_JURIDICA");

    private String value;

    TipoPessoaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoPessoaEnum tipoPessoa = null;

  
  /**
   * {{{origem_comercial_response_id_value}}}
   **/
  public OrigemComercialResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "10", value = "{{{origem_comercial_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{origem_comercial_response_nome_value}}}
   **/
  public OrigemComercialResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "COMÉRCIO LTDA", value = "{{{origem_comercial_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{origem_comercial_response_descricao_value}}}
   **/
  public OrigemComercialResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "DESCRIÇÃO DA ORIGEM COMERCIAL", value = "{{{origem_comercial_response_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{origem_comercial_response_produtos_origem_value}}}
   **/
  public OrigemComercialResponse produtosOrigem(List<ProdutoOrigemResponse> produtosOrigem) {
    this.produtosOrigem = produtosOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{origem_comercial_response_produtos_origem_value}}}")
  @JsonProperty("produtosOrigem")
  public List<ProdutoOrigemResponse> getProdutosOrigem() {
    return produtosOrigem;
  }
  public void setProdutosOrigem(List<ProdutoOrigemResponse> produtosOrigem) {
    this.produtosOrigem = produtosOrigem;
  }

  
  /**
   * {{{origem_comercial_response_id_estabelecimento_value}}}
   **/
  public OrigemComercialResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{origem_comercial_response_id_estabelecimento_value}}}")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{origem_comercial_response_id_tipo_origem_comercial_value}}}
   **/
  public OrigemComercialResponse idTipoOrigemComercial(Long idTipoOrigemComercial) {
    this.idTipoOrigemComercial = idTipoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{origem_comercial_response_id_tipo_origem_comercial_value}}}")
  @JsonProperty("idTipoOrigemComercial")
  public Long getIdTipoOrigemComercial() {
    return idTipoOrigemComercial;
  }
  public void setIdTipoOrigemComercial(Long idTipoOrigemComercial) {
    this.idTipoOrigemComercial = idTipoOrigemComercial;
  }

  
  /**
   * {{{origem_comercial_response_nome_tipo_origem_comercial_value}}}
   **/
  public OrigemComercialResponse nomeTipoOrigemComercial(String nomeTipoOrigemComercial) {
    this.nomeTipoOrigemComercial = nomeTipoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "NOME DO TIPO DE ORIGEM COMERCIAL", value = "{{{origem_comercial_response_nome_tipo_origem_comercial_value}}}")
  @JsonProperty("nomeTipoOrigemComercial")
  public String getNomeTipoOrigemComercial() {
    return nomeTipoOrigemComercial;
  }
  public void setNomeTipoOrigemComercial(String nomeTipoOrigemComercial) {
    this.nomeTipoOrigemComercial = nomeTipoOrigemComercial;
  }

  
  /**
   * {{{origem_comercial_response_id_grupo_origem_comercial_value}}}
   **/
  public OrigemComercialResponse idGrupoOrigemComercial(Long idGrupoOrigemComercial) {
    this.idGrupoOrigemComercial = idGrupoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{origem_comercial_response_id_grupo_origem_comercial_value}}}")
  @JsonProperty("idGrupoOrigemComercial")
  public Long getIdGrupoOrigemComercial() {
    return idGrupoOrigemComercial;
  }
  public void setIdGrupoOrigemComercial(Long idGrupoOrigemComercial) {
    this.idGrupoOrigemComercial = idGrupoOrigemComercial;
  }

  
  /**
   * {{{origem_comercial_response_nome_grupo_origem_comercial_value}}}
   **/
  public OrigemComercialResponse nomeGrupoOrigemComercial(String nomeGrupoOrigemComercial) {
    this.nomeGrupoOrigemComercial = nomeGrupoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "NOME DO GRUPO DA ORIGEM COMERCIAL", value = "{{{origem_comercial_response_nome_grupo_origem_comercial_value}}}")
  @JsonProperty("nomeGrupoOrigemComercial")
  public String getNomeGrupoOrigemComercial() {
    return nomeGrupoOrigemComercial;
  }
  public void setNomeGrupoOrigemComercial(String nomeGrupoOrigemComercial) {
    this.nomeGrupoOrigemComercial = nomeGrupoOrigemComercial;
  }

  
  /**
   * {{{origem_comercial_response_status_value}}}
   **/
  public OrigemComercialResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{origem_comercial_response_status_value}}}")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{origem_comercial_response_flag_pre_aprovado_value}}}
   **/
  public OrigemComercialResponse flagPreAprovado(Boolean flagPreAprovado) {
    this.flagPreAprovado = flagPreAprovado;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_pre_aprovado_value}}}")
  @JsonProperty("flagPreAprovado")
  public Boolean getFlagPreAprovado() {
    return flagPreAprovado;
  }
  public void setFlagPreAprovado(Boolean flagPreAprovado) {
    this.flagPreAprovado = flagPreAprovado;
  }

  
  /**
   * {{{origem_comercial_response_flag_aprovacao_imediata_value}}}
   **/
  public OrigemComercialResponse flagAprovacaoImediata(Boolean flagAprovacaoImediata) {
    this.flagAprovacaoImediata = flagAprovacaoImediata;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_aprovacao_imediata_value}}}")
  @JsonProperty("flagAprovacaoImediata")
  public Boolean getFlagAprovacaoImediata() {
    return flagAprovacaoImediata;
  }
  public void setFlagAprovacaoImediata(Boolean flagAprovacaoImediata) {
    this.flagAprovacaoImediata = flagAprovacaoImediata;
  }

  
  /**
   * {{{origem_comercial_response_nome_fantasia_plastico_value}}}
   **/
  public OrigemComercialResponse nomeFantasiaPlastico(String nomeFantasiaPlastico) {
    this.nomeFantasiaPlastico = nomeFantasiaPlastico;
    return this;
  }
  
  @ApiModelProperty(example = "COMÉRCIO LTDA", value = "{{{origem_comercial_response_nome_fantasia_plastico_value}}}")
  @JsonProperty("nomeFantasiaPlastico")
  public String getNomeFantasiaPlastico() {
    return nomeFantasiaPlastico;
  }
  public void setNomeFantasiaPlastico(String nomeFantasiaPlastico) {
    this.nomeFantasiaPlastico = nomeFantasiaPlastico;
  }

  
  /**
   * {{{origem_comercial_response_flag_cartao_provisorio_value}}}
   **/
  public OrigemComercialResponse flagCartaoProvisorio(Boolean flagCartaoProvisorio) {
    this.flagCartaoProvisorio = flagCartaoProvisorio;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_cartao_provisorio_value}}}")
  @JsonProperty("flagCartaoProvisorio")
  public Boolean getFlagCartaoProvisorio() {
    return flagCartaoProvisorio;
  }
  public void setFlagCartaoProvisorio(Boolean flagCartaoProvisorio) {
    this.flagCartaoProvisorio = flagCartaoProvisorio;
  }

  
  /**
   * {{{origem_comercial_response_flag_cartao_definitivo_value}}}
   **/
  public OrigemComercialResponse flagCartaoDefinitivo(Boolean flagCartaoDefinitivo) {
    this.flagCartaoDefinitivo = flagCartaoDefinitivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_cartao_definitivo_value}}}")
  @JsonProperty("flagCartaoDefinitivo")
  public Boolean getFlagCartaoDefinitivo() {
    return flagCartaoDefinitivo;
  }
  public void setFlagCartaoDefinitivo(Boolean flagCartaoDefinitivo) {
    this.flagCartaoDefinitivo = flagCartaoDefinitivo;
  }

  
  /**
   * {{{origem_comercial_response_usuario_value}}}
   **/
  public OrigemComercialResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "usuario01", value = "{{{origem_comercial_response_usuario_value}}}")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * {{{origem_comercial_response_senha_value}}}
   **/
  public OrigemComercialResponse senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "21031408", value = "{{{origem_comercial_response_senha_value}}}")
  @JsonProperty("senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * {{{origem_comercial_response_flag_origem_externa_value}}}
   **/
  public OrigemComercialResponse flagOrigemExterna(Boolean flagOrigemExterna) {
    this.flagOrigemExterna = flagOrigemExterna;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_origem_externa_value}}}")
  @JsonProperty("flagOrigemExterna")
  public Boolean getFlagOrigemExterna() {
    return flagOrigemExterna;
  }
  public void setFlagOrigemExterna(Boolean flagOrigemExterna) {
    this.flagOrigemExterna = flagOrigemExterna;
  }

  
  /**
   * {{{origem_comercial_response_flag_modificado_value}}}
   **/
  public OrigemComercialResponse flagModificado(Boolean flagModificado) {
    this.flagModificado = flagModificado;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_modificado_value}}}")
  @JsonProperty("flagModificado")
  public Boolean getFlagModificado() {
    return flagModificado;
  }
  public void setFlagModificado(Boolean flagModificado) {
    this.flagModificado = flagModificado;
  }

  
  /**
   * {{{origem_comercial_response_flag_envia_fatura_usuario_value}}}
   **/
  public OrigemComercialResponse flagEnviaFaturaUsuario(Boolean flagEnviaFaturaUsuario) {
    this.flagEnviaFaturaUsuario = flagEnviaFaturaUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_envia_fatura_usuario_value}}}")
  @JsonProperty("flagEnviaFaturaUsuario")
  public Boolean getFlagEnviaFaturaUsuario() {
    return flagEnviaFaturaUsuario;
  }
  public void setFlagEnviaFaturaUsuario(Boolean flagEnviaFaturaUsuario) {
    this.flagEnviaFaturaUsuario = flagEnviaFaturaUsuario;
  }

  
  /**
   * {{{origem_comercial_response_flag_credito_faturamento_value}}}
   **/
  public OrigemComercialResponse flagCreditoFaturamento(Boolean flagCreditoFaturamento) {
    this.flagCreditoFaturamento = flagCreditoFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_credito_faturamento_value}}}")
  @JsonProperty("flagCreditoFaturamento")
  public Boolean getFlagCreditoFaturamento() {
    return flagCreditoFaturamento;
  }
  public void setFlagCreditoFaturamento(Boolean flagCreditoFaturamento) {
    this.flagCreditoFaturamento = flagCreditoFaturamento;
  }

  
  /**
   * {{{origem_comercial_response_flag_concede_limite_provisorio_value}}}
   **/
  public OrigemComercialResponse flagConcedeLimiteProvisorio(Boolean flagConcedeLimiteProvisorio) {
    this.flagConcedeLimiteProvisorio = flagConcedeLimiteProvisorio;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_concede_limite_provisorio_value}}}")
  @JsonProperty("flagConcedeLimiteProvisorio")
  public Boolean getFlagConcedeLimiteProvisorio() {
    return flagConcedeLimiteProvisorio;
  }
  public void setFlagConcedeLimiteProvisorio(Boolean flagConcedeLimiteProvisorio) {
    this.flagConcedeLimiteProvisorio = flagConcedeLimiteProvisorio;
  }

  
  /**
   * {{{origem_comercial_response_flag_digitalizar_doc_value}}}
   **/
  public OrigemComercialResponse flagDigitalizarDoc(Boolean flagDigitalizarDoc) {
    this.flagDigitalizarDoc = flagDigitalizarDoc;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_digitalizar_doc_value}}}")
  @JsonProperty("flagDigitalizarDoc")
  public Boolean getFlagDigitalizarDoc() {
    return flagDigitalizarDoc;
  }
  public void setFlagDigitalizarDoc(Boolean flagDigitalizarDoc) {
    this.flagDigitalizarDoc = flagDigitalizarDoc;
  }

  
  /**
   * {{{origem_comercial_response_flag_embossing_loja_value}}}
   **/
  public OrigemComercialResponse flagEmbossingLoja(Boolean flagEmbossingLoja) {
    this.flagEmbossingLoja = flagEmbossingLoja;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_embossing_loja_value}}}")
  @JsonProperty("flagEmbossingLoja")
  public Boolean getFlagEmbossingLoja() {
    return flagEmbossingLoja;
  }
  public void setFlagEmbossingLoja(Boolean flagEmbossingLoja) {
    this.flagEmbossingLoja = flagEmbossingLoja;
  }

  
  /**
   * {{{origem_comercial_response_flag_consulta_previa_value}}}
   **/
  public OrigemComercialResponse flagConsultaPrevia(Boolean flagConsultaPrevia) {
    this.flagConsultaPrevia = flagConsultaPrevia;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{origem_comercial_response_flag_consulta_previa_value}}}")
  @JsonProperty("flagConsultaPrevia")
  public Boolean getFlagConsultaPrevia() {
    return flagConsultaPrevia;
  }
  public void setFlagConsultaPrevia(Boolean flagConsultaPrevia) {
    this.flagConsultaPrevia = flagConsultaPrevia;
  }

  
  /**
   * {{{origem_comercial_response_tipo_pessoa_value}}}
   **/
  public OrigemComercialResponse tipoPessoa(TipoPessoaEnum tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "PESSOA_FISICA", value = "{{{origem_comercial_response_tipo_pessoa_value}}}")
  @JsonProperty("tipoPessoa")
  public TipoPessoaEnum getTipoPessoa() {
    return tipoPessoa;
  }
  public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrigemComercialResponse origemComercialResponse = (OrigemComercialResponse) o;
    return Objects.equals(this.id, origemComercialResponse.id) &&
        Objects.equals(this.nome, origemComercialResponse.nome) &&
        Objects.equals(this.descricao, origemComercialResponse.descricao) &&
        Objects.equals(this.produtosOrigem, origemComercialResponse.produtosOrigem) &&
        Objects.equals(this.idEstabelecimento, origemComercialResponse.idEstabelecimento) &&
        Objects.equals(this.idTipoOrigemComercial, origemComercialResponse.idTipoOrigemComercial) &&
        Objects.equals(this.nomeTipoOrigemComercial, origemComercialResponse.nomeTipoOrigemComercial) &&
        Objects.equals(this.idGrupoOrigemComercial, origemComercialResponse.idGrupoOrigemComercial) &&
        Objects.equals(this.nomeGrupoOrigemComercial, origemComercialResponse.nomeGrupoOrigemComercial) &&
        Objects.equals(this.status, origemComercialResponse.status) &&
        Objects.equals(this.flagPreAprovado, origemComercialResponse.flagPreAprovado) &&
        Objects.equals(this.flagAprovacaoImediata, origemComercialResponse.flagAprovacaoImediata) &&
        Objects.equals(this.nomeFantasiaPlastico, origemComercialResponse.nomeFantasiaPlastico) &&
        Objects.equals(this.flagCartaoProvisorio, origemComercialResponse.flagCartaoProvisorio) &&
        Objects.equals(this.flagCartaoDefinitivo, origemComercialResponse.flagCartaoDefinitivo) &&
        Objects.equals(this.usuario, origemComercialResponse.usuario) &&
        Objects.equals(this.senha, origemComercialResponse.senha) &&
        Objects.equals(this.flagOrigemExterna, origemComercialResponse.flagOrigemExterna) &&
        Objects.equals(this.flagModificado, origemComercialResponse.flagModificado) &&
        Objects.equals(this.flagEnviaFaturaUsuario, origemComercialResponse.flagEnviaFaturaUsuario) &&
        Objects.equals(this.flagCreditoFaturamento, origemComercialResponse.flagCreditoFaturamento) &&
        Objects.equals(this.flagConcedeLimiteProvisorio, origemComercialResponse.flagConcedeLimiteProvisorio) &&
        Objects.equals(this.flagDigitalizarDoc, origemComercialResponse.flagDigitalizarDoc) &&
        Objects.equals(this.flagEmbossingLoja, origemComercialResponse.flagEmbossingLoja) &&
        Objects.equals(this.flagConsultaPrevia, origemComercialResponse.flagConsultaPrevia) &&
        Objects.equals(this.tipoPessoa, origemComercialResponse.tipoPessoa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, descricao, produtosOrigem, idEstabelecimento, idTipoOrigemComercial, nomeTipoOrigemComercial, idGrupoOrigemComercial, nomeGrupoOrigemComercial, status, flagPreAprovado, flagAprovacaoImediata, nomeFantasiaPlastico, flagCartaoProvisorio, flagCartaoDefinitivo, usuario, senha, flagOrigemExterna, flagModificado, flagEnviaFaturaUsuario, flagCreditoFaturamento, flagConcedeLimiteProvisorio, flagDigitalizarDoc, flagEmbossingLoja, flagConsultaPrevia, tipoPessoa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrigemComercialResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    produtosOrigem: ").append(toIndentedString(produtosOrigem)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idTipoOrigemComercial: ").append(toIndentedString(idTipoOrigemComercial)).append("\n");
    sb.append("    nomeTipoOrigemComercial: ").append(toIndentedString(nomeTipoOrigemComercial)).append("\n");
    sb.append("    idGrupoOrigemComercial: ").append(toIndentedString(idGrupoOrigemComercial)).append("\n");
    sb.append("    nomeGrupoOrigemComercial: ").append(toIndentedString(nomeGrupoOrigemComercial)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    flagPreAprovado: ").append(toIndentedString(flagPreAprovado)).append("\n");
    sb.append("    flagAprovacaoImediata: ").append(toIndentedString(flagAprovacaoImediata)).append("\n");
    sb.append("    nomeFantasiaPlastico: ").append(toIndentedString(nomeFantasiaPlastico)).append("\n");
    sb.append("    flagCartaoProvisorio: ").append(toIndentedString(flagCartaoProvisorio)).append("\n");
    sb.append("    flagCartaoDefinitivo: ").append(toIndentedString(flagCartaoDefinitivo)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    flagOrigemExterna: ").append(toIndentedString(flagOrigemExterna)).append("\n");
    sb.append("    flagModificado: ").append(toIndentedString(flagModificado)).append("\n");
    sb.append("    flagEnviaFaturaUsuario: ").append(toIndentedString(flagEnviaFaturaUsuario)).append("\n");
    sb.append("    flagCreditoFaturamento: ").append(toIndentedString(flagCreditoFaturamento)).append("\n");
    sb.append("    flagConcedeLimiteProvisorio: ").append(toIndentedString(flagConcedeLimiteProvisorio)).append("\n");
    sb.append("    flagDigitalizarDoc: ").append(toIndentedString(flagDigitalizarDoc)).append("\n");
    sb.append("    flagEmbossingLoja: ").append(toIndentedString(flagEmbossingLoja)).append("\n");
    sb.append("    flagConsultaPrevia: ").append(toIndentedString(flagConsultaPrevia)).append("\n");
    sb.append("    tipoPessoa: ").append(toIndentedString(tipoPessoa)).append("\n");
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



