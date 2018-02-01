package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Par\u00C3\u00A2metros de requisi\u00C3\u00A7\u00C3\u00A3o para cadastrar origem comercial
 **/

@ApiModel(description = "Par\u00C3\u00A2metros de requisi\u00C3\u00A7\u00C3\u00A3o para cadastrar origem comercial")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OrigemComercialPersist   {
  
  private String nome = null;
  private String descricao = null;
  private Long idEstabelecimento = null;
  private Long idTipoOrigemComercial = null;
  private Long idGrupoOrigemComercial = null;
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
  private Long idProduto = null;

  
  /**
   * Nome da origem comercial
   **/
  public OrigemComercialPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "COMÃRCIO LTDA", value = "Nome da origem comercial")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o da origem comercial
   **/
  public OrigemComercialPersist descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "DESCRIÃÃO DA ORIGEM COMERCIAL", value = "Descri\u00C3\u00A7\u00C3\u00A3o da origem comercial")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Identificador do estabelecimento
   **/
  public OrigemComercialPersist idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "10", value = "Identificador do estabelecimento")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Identificador do tipo de origem comercial
   **/
  public OrigemComercialPersist idTipoOrigemComercial(Long idTipoOrigemComercial) {
    this.idTipoOrigemComercial = idTipoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Identificador do tipo de origem comercial")
  @JsonProperty("idTipoOrigemComercial")
  public Long getIdTipoOrigemComercial() {
    return idTipoOrigemComercial;
  }
  public void setIdTipoOrigemComercial(Long idTipoOrigemComercial) {
    this.idTipoOrigemComercial = idTipoOrigemComercial;
  }

  
  /**
   * Identificador do grupo de origem comercial
   **/
  public OrigemComercialPersist idGrupoOrigemComercial(Long idGrupoOrigemComercial) {
    this.idGrupoOrigemComercial = idGrupoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Identificador do grupo de origem comercial")
  @JsonProperty("idGrupoOrigemComercial")
  public Long getIdGrupoOrigemComercial() {
    return idGrupoOrigemComercial;
  }
  public void setIdGrupoOrigemComercial(Long idGrupoOrigemComercial) {
    this.idGrupoOrigemComercial = idGrupoOrigemComercial;
  }

  
  /**
   * Indica o status da origem comercial
   **/
  public OrigemComercialPersist status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Indica o status da origem comercial")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Indica se permite pr\u00C3\u00A9 aprova\u00C3\u00A7\u00C3\u00A3o
   **/
  public OrigemComercialPersist flagPreAprovado(Boolean flagPreAprovado) {
    this.flagPreAprovado = flagPreAprovado;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se permite pr\u00C3\u00A9 aprova\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("flagPreAprovado")
  public Boolean getFlagPreAprovado() {
    return flagPreAprovado;
  }
  public void setFlagPreAprovado(Boolean flagPreAprovado) {
    this.flagPreAprovado = flagPreAprovado;
  }

  
  /**
   * Indica se permite aprova\u00C3\u00A7\u00C3\u00A3o imediata
   **/
  public OrigemComercialPersist flagAprovacaoImediata(Boolean flagAprovacaoImediata) {
    this.flagAprovacaoImediata = flagAprovacaoImediata;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se permite aprova\u00C3\u00A7\u00C3\u00A3o imediata")
  @JsonProperty("flagAprovacaoImediata")
  public Boolean getFlagAprovacaoImediata() {
    return flagAprovacaoImediata;
  }
  public void setFlagAprovacaoImediata(Boolean flagAprovacaoImediata) {
    this.flagAprovacaoImediata = flagAprovacaoImediata;
  }

  
  /**
   * Nome fantasia impresso no pl\u00C3\u00A1stico
   **/
  public OrigemComercialPersist nomeFantasiaPlastico(String nomeFantasiaPlastico) {
    this.nomeFantasiaPlastico = nomeFantasiaPlastico;
    return this;
  }
  
  @ApiModelProperty(example = "COMÃRCIO LTDA", value = "Nome fantasia impresso no pl\u00C3\u00A1stico")
  @JsonProperty("nomeFantasiaPlastico")
  public String getNomeFantasiaPlastico() {
    return nomeFantasiaPlastico;
  }
  public void setNomeFantasiaPlastico(String nomeFantasiaPlastico) {
    this.nomeFantasiaPlastico = nomeFantasiaPlastico;
  }

  
  /**
   * Indica se permite cart\u00C3\u00A3o provis\u00C3\u00B3rio
   **/
  public OrigemComercialPersist flagCartaoProvisorio(Boolean flagCartaoProvisorio) {
    this.flagCartaoProvisorio = flagCartaoProvisorio;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se permite cart\u00C3\u00A3o provis\u00C3\u00B3rio")
  @JsonProperty("flagCartaoProvisorio")
  public Boolean getFlagCartaoProvisorio() {
    return flagCartaoProvisorio;
  }
  public void setFlagCartaoProvisorio(Boolean flagCartaoProvisorio) {
    this.flagCartaoProvisorio = flagCartaoProvisorio;
  }

  
  /**
   * Indica se permite cart\u00C3\u00A3o definitivo
   **/
  public OrigemComercialPersist flagCartaoDefinitivo(Boolean flagCartaoDefinitivo) {
    this.flagCartaoDefinitivo = flagCartaoDefinitivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se permite cart\u00C3\u00A3o definitivo")
  @JsonProperty("flagCartaoDefinitivo")
  public Boolean getFlagCartaoDefinitivo() {
    return flagCartaoDefinitivo;
  }
  public void setFlagCartaoDefinitivo(Boolean flagCartaoDefinitivo) {
    this.flagCartaoDefinitivo = flagCartaoDefinitivo;
  }

  
  /**
   * Usu\u00C3\u00A1rio para autentica\u00C3\u00A7\u00C3\u00A3o
   **/
  public OrigemComercialPersist usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "usuario01", value = "Usu\u00C3\u00A1rio para autentica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Senha para autentica\u00C3\u00A7\u00C3\u00A3o
   **/
  public OrigemComercialPersist senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "21031408", value = "Senha para autentica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Indica se \u00C3\u00A9 origem externa
   **/
  public OrigemComercialPersist flagOrigemExterna(Boolean flagOrigemExterna) {
    this.flagOrigemExterna = flagOrigemExterna;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se \u00C3\u00A9 origem externa")
  @JsonProperty("flagOrigemExterna")
  public Boolean getFlagOrigemExterna() {
    return flagOrigemExterna;
  }
  public void setFlagOrigemExterna(Boolean flagOrigemExterna) {
    this.flagOrigemExterna = flagOrigemExterna;
  }

  
  /**
   * Indica se h\u00C3\u00A1 modifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public OrigemComercialPersist flagModificado(Boolean flagModificado) {
    this.flagModificado = flagModificado;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se h\u00C3\u00A1 modifica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("flagModificado")
  public Boolean getFlagModificado() {
    return flagModificado;
  }
  public void setFlagModificado(Boolean flagModificado) {
    this.flagModificado = flagModificado;
  }

  
  /**
   * Indica se envia fatura
   **/
  public OrigemComercialPersist flagEnviaFaturaUsuario(Boolean flagEnviaFaturaUsuario) {
    this.flagEnviaFaturaUsuario = flagEnviaFaturaUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se envia fatura")
  @JsonProperty("flagEnviaFaturaUsuario")
  public Boolean getFlagEnviaFaturaUsuario() {
    return flagEnviaFaturaUsuario;
  }
  public void setFlagEnviaFaturaUsuario(Boolean flagEnviaFaturaUsuario) {
    this.flagEnviaFaturaUsuario = flagEnviaFaturaUsuario;
  }

  
  /**
   * Indica se permite cr\u00C3\u00A9dito de faturamento
   **/
  public OrigemComercialPersist flagCreditoFaturamento(Boolean flagCreditoFaturamento) {
    this.flagCreditoFaturamento = flagCreditoFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se permite cr\u00C3\u00A9dito de faturamento")
  @JsonProperty("flagCreditoFaturamento")
  public Boolean getFlagCreditoFaturamento() {
    return flagCreditoFaturamento;
  }
  public void setFlagCreditoFaturamento(Boolean flagCreditoFaturamento) {
    this.flagCreditoFaturamento = flagCreditoFaturamento;
  }

  
  /**
   * Indica se concede limite provis\u00C3\u00B3rio
   **/
  public OrigemComercialPersist flagConcedeLimiteProvisorio(Boolean flagConcedeLimiteProvisorio) {
    this.flagConcedeLimiteProvisorio = flagConcedeLimiteProvisorio;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se concede limite provis\u00C3\u00B3rio")
  @JsonProperty("flagConcedeLimiteProvisorio")
  public Boolean getFlagConcedeLimiteProvisorio() {
    return flagConcedeLimiteProvisorio;
  }
  public void setFlagConcedeLimiteProvisorio(Boolean flagConcedeLimiteProvisorio) {
    this.flagConcedeLimiteProvisorio = flagConcedeLimiteProvisorio;
  }

  
  /**
   * Indica se digitaliza documento
   **/
  public OrigemComercialPersist flagDigitalizarDoc(Boolean flagDigitalizarDoc) {
    this.flagDigitalizarDoc = flagDigitalizarDoc;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se digitaliza documento")
  @JsonProperty("flagDigitalizarDoc")
  public Boolean getFlagDigitalizarDoc() {
    return flagDigitalizarDoc;
  }
  public void setFlagDigitalizarDoc(Boolean flagDigitalizarDoc) {
    this.flagDigitalizarDoc = flagDigitalizarDoc;
  }

  
  /**
   * Indica se realiza embossing em loja
   **/
  public OrigemComercialPersist flagEmbossingLoja(Boolean flagEmbossingLoja) {
    this.flagEmbossingLoja = flagEmbossingLoja;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se realiza embossing em loja")
  @JsonProperty("flagEmbossingLoja")
  public Boolean getFlagEmbossingLoja() {
    return flagEmbossingLoja;
  }
  public void setFlagEmbossingLoja(Boolean flagEmbossingLoja) {
    this.flagEmbossingLoja = flagEmbossingLoja;
  }

  
  /**
   * Indica se realiza consulta pr\u00C3\u00A9via
   **/
  public OrigemComercialPersist flagConsultaPrevia(Boolean flagConsultaPrevia) {
    this.flagConsultaPrevia = flagConsultaPrevia;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Indica se realiza consulta pr\u00C3\u00A9via")
  @JsonProperty("flagConsultaPrevia")
  public Boolean getFlagConsultaPrevia() {
    return flagConsultaPrevia;
  }
  public void setFlagConsultaPrevia(Boolean flagConsultaPrevia) {
    this.flagConsultaPrevia = flagConsultaPrevia;
  }

  
  /**
   * Tipo de pessoa
   **/
  public OrigemComercialPersist tipoPessoa(TipoPessoaEnum tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "PESSOA_FISICA", value = "Tipo de pessoa")
  @JsonProperty("tipoPessoa")
  public TipoPessoaEnum getTipoPessoa() {
    return tipoPessoa;
  }
  public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  
  /**
   * Identificador de Produto da origem comercial
   **/
  public OrigemComercialPersist idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Identificador de Produto da origem comercial")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrigemComercialPersist origemComercialPersist = (OrigemComercialPersist) o;
    return Objects.equals(this.nome, origemComercialPersist.nome) &&
        Objects.equals(this.descricao, origemComercialPersist.descricao) &&
        Objects.equals(this.idEstabelecimento, origemComercialPersist.idEstabelecimento) &&
        Objects.equals(this.idTipoOrigemComercial, origemComercialPersist.idTipoOrigemComercial) &&
        Objects.equals(this.idGrupoOrigemComercial, origemComercialPersist.idGrupoOrigemComercial) &&
        Objects.equals(this.status, origemComercialPersist.status) &&
        Objects.equals(this.flagPreAprovado, origemComercialPersist.flagPreAprovado) &&
        Objects.equals(this.flagAprovacaoImediata, origemComercialPersist.flagAprovacaoImediata) &&
        Objects.equals(this.nomeFantasiaPlastico, origemComercialPersist.nomeFantasiaPlastico) &&
        Objects.equals(this.flagCartaoProvisorio, origemComercialPersist.flagCartaoProvisorio) &&
        Objects.equals(this.flagCartaoDefinitivo, origemComercialPersist.flagCartaoDefinitivo) &&
        Objects.equals(this.usuario, origemComercialPersist.usuario) &&
        Objects.equals(this.senha, origemComercialPersist.senha) &&
        Objects.equals(this.flagOrigemExterna, origemComercialPersist.flagOrigemExterna) &&
        Objects.equals(this.flagModificado, origemComercialPersist.flagModificado) &&
        Objects.equals(this.flagEnviaFaturaUsuario, origemComercialPersist.flagEnviaFaturaUsuario) &&
        Objects.equals(this.flagCreditoFaturamento, origemComercialPersist.flagCreditoFaturamento) &&
        Objects.equals(this.flagConcedeLimiteProvisorio, origemComercialPersist.flagConcedeLimiteProvisorio) &&
        Objects.equals(this.flagDigitalizarDoc, origemComercialPersist.flagDigitalizarDoc) &&
        Objects.equals(this.flagEmbossingLoja, origemComercialPersist.flagEmbossingLoja) &&
        Objects.equals(this.flagConsultaPrevia, origemComercialPersist.flagConsultaPrevia) &&
        Objects.equals(this.tipoPessoa, origemComercialPersist.tipoPessoa) &&
        Objects.equals(this.idProduto, origemComercialPersist.idProduto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, descricao, idEstabelecimento, idTipoOrigemComercial, idGrupoOrigemComercial, status, flagPreAprovado, flagAprovacaoImediata, nomeFantasiaPlastico, flagCartaoProvisorio, flagCartaoDefinitivo, usuario, senha, flagOrigemExterna, flagModificado, flagEnviaFaturaUsuario, flagCreditoFaturamento, flagConcedeLimiteProvisorio, flagDigitalizarDoc, flagEmbossingLoja, flagConsultaPrevia, tipoPessoa, idProduto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrigemComercialPersist {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idTipoOrigemComercial: ").append(toIndentedString(idTipoOrigemComercial)).append("\n");
    sb.append("    idGrupoOrigemComercial: ").append(toIndentedString(idGrupoOrigemComercial)).append("\n");
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
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
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

