package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Response Representation of the recurrent debit type resource
 **/

@ApiModel(description = "Response Representation of the recurrent debit type resource")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoDebitoRecorrenteResponse   {
  
  private Boolean flagAnuidadeBonificada = null;
  private Long id = null;
  private String nome = null;
  private BigDecimal valor = null;
  private Boolean flagAtivo = null;
  private BigDecimal valorBonus = null;
  private Integer numeroParcelas = null;
  private Boolean flagAdereAutomatico = null;
  private Boolean flagGeraNumeroSorte = null;
  private String faixaEtaria = null;
  private Boolean flagSeguro = null;
  private String sorteiosMensais = null;
  private Boolean flagAdesaoAutomatica = null;
  private Boolean flagDependente = null;
  private Integer quantidadeDependente = null;
  private Long idTermoSeguroServico = null;
  private Integer idadeMinima = null;
  private Integer idadeMaxima = null;
  private Boolean flagDebitoIncondicional = null;
  private Boolean flagExtratoIncondicional = null;
  private Boolean flagEstornoAutomatico = null;
  private BigDecimal valorRepassadoSeguradora = null;
  private Boolean flagLancaTransacao = null;
  private Boolean flagTransferenciaAutomatica = null;
  private Long idProduto = null;
  private Long idGrupoDebitoRecorrente = null;
  private Integer quantidadeTentativasCobranca = null;
  private Long idAjuste = null;

  
  /**
   **/
  public TipoDebitoRecorrenteResponse flagAnuidadeBonificada(Boolean flagAnuidadeBonificada) {
    this.flagAnuidadeBonificada = flagAnuidadeBonificada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagAnuidadeBonificada")
  public Boolean getFlagAnuidadeBonificada() {
    return flagAnuidadeBonificada;
  }
  public void setFlagAnuidadeBonificada(Boolean flagAnuidadeBonificada) {
    this.flagAnuidadeBonificada = flagAnuidadeBonificada;
  }

  
  /**
   * Identification Code of the recurrent debit type (id)
   **/
  public TipoDebitoRecorrenteResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the recurrent debit type (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Description of the recurrent debit type
   **/
  public TipoDebitoRecorrenteResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the recurrent debit type")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Value of the recurrent debit type
   **/
  public TipoDebitoRecorrenteResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the recurrent debit type")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Flag that identifies if the type of recurrent debit is active
   **/
  public TipoDebitoRecorrenteResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag that identifies if the type of recurrent debit is active")
  @JsonProperty("flagAtivo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Bonus value referring to the plan
   **/
  public TipoDebitoRecorrenteResponse valorBonus(BigDecimal valorBonus) {
    this.valorBonus = valorBonus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bonus value referring to the plan")
  @JsonProperty("valorBonus")
  public BigDecimal getValorBonus() {
    return valorBonus;
  }
  public void setValorBonus(BigDecimal valorBonus) {
    this.valorBonus = valorBonus;
  }

  
  /**
   * Parcel Number referring to the plan
   **/
  public TipoDebitoRecorrenteResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parcel Number referring to the plan")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Flag that indicates if the renovation is going to be automatic
   **/
  public TipoDebitoRecorrenteResponse flagAdereAutomatico(Boolean flagAdereAutomatico) {
    this.flagAdereAutomatico = flagAdereAutomatico;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag that indicates if the renovation is going to be automatic")
  @JsonProperty("flagAdereAutomatico")
  public Boolean getFlagAdereAutomatico() {
    return flagAdereAutomatico;
  }
  public void setFlagAdereAutomatico(Boolean flagAdereAutomatico) {
    this.flagAdereAutomatico = flagAdereAutomatico;
  }

  
  /**
   * Flag that indicates if the renewal is going to be automatic
   **/
  public TipoDebitoRecorrenteResponse flagGeraNumeroSorte(Boolean flagGeraNumeroSorte) {
    this.flagGeraNumeroSorte = flagGeraNumeroSorte;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag that indicates if the renewal is going to be automatic")
  @JsonProperty("flagGeraNumeroSorte")
  public Boolean getFlagGeraNumeroSorte() {
    return flagGeraNumeroSorte;
  }
  public void setFlagGeraNumeroSorte(Boolean flagGeraNumeroSorte) {
    this.flagGeraNumeroSorte = flagGeraNumeroSorte;
  }

  
  /**
   * Indicates the age range to join to the plan
   **/
  public TipoDebitoRecorrenteResponse faixaEtaria(String faixaEtaria) {
    this.faixaEtaria = faixaEtaria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the age range to join to the plan")
  @JsonProperty("faixaEtaria")
  public String getFaixaEtaria() {
    return faixaEtaria;
  }
  public void setFaixaEtaria(String faixaEtaria) {
    this.faixaEtaria = faixaEtaria;
  }

  
  /**
   * Flag indicates if the plan is safe
   **/
  public TipoDebitoRecorrenteResponse flagSeguro(Boolean flagSeguro) {
    this.flagSeguro = flagSeguro;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicates if the plan is safe")
  @JsonProperty("flagSeguro")
  public Boolean getFlagSeguro() {
    return flagSeguro;
  }
  public void setFlagSeguro(Boolean flagSeguro) {
    this.flagSeguro = flagSeguro;
  }

  
  /**
   * Indicates which award referring to the month
   **/
  public TipoDebitoRecorrenteResponse sorteiosMensais(String sorteiosMensais) {
    this.sorteiosMensais = sorteiosMensais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates which award referring to the month")
  @JsonProperty("sorteiosMensais")
  public String getSorteiosMensais() {
    return sorteiosMensais;
  }
  public void setSorteiosMensais(String sorteiosMensais) {
    this.sorteiosMensais = sorteiosMensais;
  }

  
  /**
   * Flag that indicates if the accession of the plan will be automatic
   **/
  public TipoDebitoRecorrenteResponse flagAdesaoAutomatica(Boolean flagAdesaoAutomatica) {
    this.flagAdesaoAutomatica = flagAdesaoAutomatica;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag that indicates if the accession of the plan will be automatic")
  @JsonProperty("flagAdesaoAutomatica")
  public Boolean getFlagAdesaoAutomatica() {
    return flagAdesaoAutomatica;
  }
  public void setFlagAdesaoAutomatica(Boolean flagAdesaoAutomatica) {
    this.flagAdesaoAutomatica = flagAdesaoAutomatica;
  }

  
  /**
   * Flag indicate if the plan covers the dependent
   **/
  public TipoDebitoRecorrenteResponse flagDependente(Boolean flagDependente) {
    this.flagDependente = flagDependente;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicate if the plan covers the dependent")
  @JsonProperty("flagDependente")
  public Boolean getFlagDependente() {
    return flagDependente;
  }
  public void setFlagDependente(Boolean flagDependente) {
    this.flagDependente = flagDependente;
  }

  
  /**
   * Indicate dependent numbers
   **/
  public TipoDebitoRecorrenteResponse quantidadeDependente(Integer quantidadeDependente) {
    this.quantidadeDependente = quantidadeDependente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicate dependent numbers")
  @JsonProperty("quantidadeDependente")
  public Integer getQuantidadeDependente() {
    return quantidadeDependente;
  }
  public void setQuantidadeDependente(Integer quantidadeDependente) {
    this.quantidadeDependente = quantidadeDependente;
  }

  
  /**
   * Identification Code of the security service term (id)
   **/
  public TipoDebitoRecorrenteResponse idTermoSeguroServico(Long idTermoSeguroServico) {
    this.idTermoSeguroServico = idTermoSeguroServico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the security service term (id)")
  @JsonProperty("idTermoSeguroServico")
  public Long getIdTermoSeguroServico() {
    return idTermoSeguroServico;
  }
  public void setIdTermoSeguroServico(Long idTermoSeguroServico) {
    this.idTermoSeguroServico = idTermoSeguroServico;
  }

  
  /**
   * Minimum age to join to the plan
   **/
  public TipoDebitoRecorrenteResponse idadeMinima(Integer idadeMinima) {
    this.idadeMinima = idadeMinima;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum age to join to the plan")
  @JsonProperty("idadeMinima")
  public Integer getIdadeMinima() {
    return idadeMinima;
  }
  public void setIdadeMinima(Integer idadeMinima) {
    this.idadeMinima = idadeMinima;
  }

  
  /**
   * Maximum age to join to the plan
   **/
  public TipoDebitoRecorrenteResponse idadeMaxima(Integer idadeMaxima) {
    this.idadeMaxima = idadeMaxima;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum age to join to the plan")
  @JsonProperty("idadeMaxima")
  public Integer getIdadeMaxima() {
    return idadeMaxima;
  }
  public void setIdadeMaxima(Integer idadeMaxima) {
    this.idadeMaxima = idadeMaxima;
  }

  
  /**
   * Flag indicates if the plan will have an unconditional debit
   **/
  public TipoDebitoRecorrenteResponse flagDebitoIncondicional(Boolean flagDebitoIncondicional) {
    this.flagDebitoIncondicional = flagDebitoIncondicional;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicates if the plan will have an unconditional debit")
  @JsonProperty("flagDebitoIncondicional")
  public Boolean getFlagDebitoIncondicional() {
    return flagDebitoIncondicional;
  }
  public void setFlagDebitoIncondicional(Boolean flagDebitoIncondicional) {
    this.flagDebitoIncondicional = flagDebitoIncondicional;
  }

  
  /**
   * Flag that indicates if the plan will be unconditional extract
   **/
  public TipoDebitoRecorrenteResponse flagExtratoIncondicional(Boolean flagExtratoIncondicional) {
    this.flagExtratoIncondicional = flagExtratoIncondicional;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag that indicates if the plan will be unconditional extract")
  @JsonProperty("flagExtratoIncondicional")
  public Boolean getFlagExtratoIncondicional() {
    return flagExtratoIncondicional;
  }
  public void setFlagExtratoIncondicional(Boolean flagExtratoIncondicional) {
    this.flagExtratoIncondicional = flagExtratoIncondicional;
  }

  
  /**
   * Flag indicates if the plan will have any automatic reversal
   **/
  public TipoDebitoRecorrenteResponse flagEstornoAutomatico(Boolean flagEstornoAutomatico) {
    this.flagEstornoAutomatico = flagEstornoAutomatico;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicates if the plan will have any automatic reversal")
  @JsonProperty("flagEstornoAutomatico")
  public Boolean getFlagEstornoAutomatico() {
    return flagEstornoAutomatico;
  }
  public void setFlagEstornoAutomatico(Boolean flagEstornoAutomatico) {
    this.flagEstornoAutomatico = flagEstornoAutomatico;
  }

  
  /**
   * Value passed to the insurer
   **/
  public TipoDebitoRecorrenteResponse valorRepassadoSeguradora(BigDecimal valorRepassadoSeguradora) {
    this.valorRepassadoSeguradora = valorRepassadoSeguradora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value passed to the insurer")
  @JsonProperty("valorRepassadoSeguradora")
  public BigDecimal getValorRepassadoSeguradora() {
    return valorRepassadoSeguradora;
  }
  public void setValorRepassadoSeguradora(BigDecimal valorRepassadoSeguradora) {
    this.valorRepassadoSeguradora = valorRepassadoSeguradora;
  }

  
  /**
   * Flag that indicates if it is going to launched a transaction
   **/
  public TipoDebitoRecorrenteResponse flagLancaTransacao(Boolean flagLancaTransacao) {
    this.flagLancaTransacao = flagLancaTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag that indicates if it is going to launched a transaction")
  @JsonProperty("flagLancaTransacao")
  public Boolean getFlagLancaTransacao() {
    return flagLancaTransacao;
  }
  public void setFlagLancaTransacao(Boolean flagLancaTransacao) {
    this.flagLancaTransacao = flagLancaTransacao;
  }

  
  /**
   * Flag that indicates if it is going to be made an automatic transfer
   **/
  public TipoDebitoRecorrenteResponse flagTransferenciaAutomatica(Boolean flagTransferenciaAutomatica) {
    this.flagTransferenciaAutomatica = flagTransferenciaAutomatica;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag that indicates if it is going to be made an automatic transfer")
  @JsonProperty("flagTransferenciaAutomatica")
  public Boolean getFlagTransferenciaAutomatica() {
    return flagTransferenciaAutomatica;
  }
  public void setFlagTransferenciaAutomatica(Boolean flagTransferenciaAutomatica) {
    this.flagTransferenciaAutomatica = flagTransferenciaAutomatica;
  }

  
  /**
   * Identification Code of the products (id)
   **/
  public TipoDebitoRecorrenteResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the products (id)")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identification Code of the recurrent debit group (id)
   **/
  public TipoDebitoRecorrenteResponse idGrupoDebitoRecorrente(Long idGrupoDebitoRecorrente) {
    this.idGrupoDebitoRecorrente = idGrupoDebitoRecorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the recurrent debit group (id)")
  @JsonProperty("idGrupoDebitoRecorrente")
  public Long getIdGrupoDebitoRecorrente() {
    return idGrupoDebitoRecorrente;
  }
  public void setIdGrupoDebitoRecorrente(Long idGrupoDebitoRecorrente) {
    this.idGrupoDebitoRecorrente = idGrupoDebitoRecorrente;
  }

  
  /**
   * Attempt Quantities for the collection
   **/
  public TipoDebitoRecorrenteResponse quantidadeTentativasCobranca(Integer quantidadeTentativasCobranca) {
    this.quantidadeTentativasCobranca = quantidadeTentativasCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attempt Quantities for the collection")
  @JsonProperty("quantidadeTentativasCobranca")
  public Integer getQuantidadeTentativasCobranca() {
    return quantidadeTentativasCobranca;
  }
  public void setQuantidadeTentativasCobranca(Integer quantidadeTentativasCobranca) {
    this.quantidadeTentativasCobranca = quantidadeTentativasCobranca;
  }

  
  /**
   * Identification Code of the adjustment types (id)
   **/
  public TipoDebitoRecorrenteResponse idAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the adjustment types (id)")
  @JsonProperty("idAjuste")
  public Long getIdAjuste() {
    return idAjuste;
  }
  public void setIdAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoDebitoRecorrenteResponse tipoDebitoRecorrenteResponse = (TipoDebitoRecorrenteResponse) o;
    return Objects.equals(this.flagAnuidadeBonificada, tipoDebitoRecorrenteResponse.flagAnuidadeBonificada) &&
        Objects.equals(this.id, tipoDebitoRecorrenteResponse.id) &&
        Objects.equals(this.nome, tipoDebitoRecorrenteResponse.nome) &&
        Objects.equals(this.valor, tipoDebitoRecorrenteResponse.valor) &&
        Objects.equals(this.flagAtivo, tipoDebitoRecorrenteResponse.flagAtivo) &&
        Objects.equals(this.valorBonus, tipoDebitoRecorrenteResponse.valorBonus) &&
        Objects.equals(this.numeroParcelas, tipoDebitoRecorrenteResponse.numeroParcelas) &&
        Objects.equals(this.flagAdereAutomatico, tipoDebitoRecorrenteResponse.flagAdereAutomatico) &&
        Objects.equals(this.flagGeraNumeroSorte, tipoDebitoRecorrenteResponse.flagGeraNumeroSorte) &&
        Objects.equals(this.faixaEtaria, tipoDebitoRecorrenteResponse.faixaEtaria) &&
        Objects.equals(this.flagSeguro, tipoDebitoRecorrenteResponse.flagSeguro) &&
        Objects.equals(this.sorteiosMensais, tipoDebitoRecorrenteResponse.sorteiosMensais) &&
        Objects.equals(this.flagAdesaoAutomatica, tipoDebitoRecorrenteResponse.flagAdesaoAutomatica) &&
        Objects.equals(this.flagDependente, tipoDebitoRecorrenteResponse.flagDependente) &&
        Objects.equals(this.quantidadeDependente, tipoDebitoRecorrenteResponse.quantidadeDependente) &&
        Objects.equals(this.idTermoSeguroServico, tipoDebitoRecorrenteResponse.idTermoSeguroServico) &&
        Objects.equals(this.idadeMinima, tipoDebitoRecorrenteResponse.idadeMinima) &&
        Objects.equals(this.idadeMaxima, tipoDebitoRecorrenteResponse.idadeMaxima) &&
        Objects.equals(this.flagDebitoIncondicional, tipoDebitoRecorrenteResponse.flagDebitoIncondicional) &&
        Objects.equals(this.flagExtratoIncondicional, tipoDebitoRecorrenteResponse.flagExtratoIncondicional) &&
        Objects.equals(this.flagEstornoAutomatico, tipoDebitoRecorrenteResponse.flagEstornoAutomatico) &&
        Objects.equals(this.valorRepassadoSeguradora, tipoDebitoRecorrenteResponse.valorRepassadoSeguradora) &&
        Objects.equals(this.flagLancaTransacao, tipoDebitoRecorrenteResponse.flagLancaTransacao) &&
        Objects.equals(this.flagTransferenciaAutomatica, tipoDebitoRecorrenteResponse.flagTransferenciaAutomatica) &&
        Objects.equals(this.idProduto, tipoDebitoRecorrenteResponse.idProduto) &&
        Objects.equals(this.idGrupoDebitoRecorrente, tipoDebitoRecorrenteResponse.idGrupoDebitoRecorrente) &&
        Objects.equals(this.quantidadeTentativasCobranca, tipoDebitoRecorrenteResponse.quantidadeTentativasCobranca) &&
        Objects.equals(this.idAjuste, tipoDebitoRecorrenteResponse.idAjuste);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagAnuidadeBonificada, id, nome, valor, flagAtivo, valorBonus, numeroParcelas, flagAdereAutomatico, flagGeraNumeroSorte, faixaEtaria, flagSeguro, sorteiosMensais, flagAdesaoAutomatica, flagDependente, quantidadeDependente, idTermoSeguroServico, idadeMinima, idadeMaxima, flagDebitoIncondicional, flagExtratoIncondicional, flagEstornoAutomatico, valorRepassadoSeguradora, flagLancaTransacao, flagTransferenciaAutomatica, idProduto, idGrupoDebitoRecorrente, quantidadeTentativasCobranca, idAjuste);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDebitoRecorrenteResponse {\n");
    
    sb.append("    flagAnuidadeBonificada: ").append(toIndentedString(flagAnuidadeBonificada)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    valorBonus: ").append(toIndentedString(valorBonus)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    flagAdereAutomatico: ").append(toIndentedString(flagAdereAutomatico)).append("\n");
    sb.append("    flagGeraNumeroSorte: ").append(toIndentedString(flagGeraNumeroSorte)).append("\n");
    sb.append("    faixaEtaria: ").append(toIndentedString(faixaEtaria)).append("\n");
    sb.append("    flagSeguro: ").append(toIndentedString(flagSeguro)).append("\n");
    sb.append("    sorteiosMensais: ").append(toIndentedString(sorteiosMensais)).append("\n");
    sb.append("    flagAdesaoAutomatica: ").append(toIndentedString(flagAdesaoAutomatica)).append("\n");
    sb.append("    flagDependente: ").append(toIndentedString(flagDependente)).append("\n");
    sb.append("    quantidadeDependente: ").append(toIndentedString(quantidadeDependente)).append("\n");
    sb.append("    idTermoSeguroServico: ").append(toIndentedString(idTermoSeguroServico)).append("\n");
    sb.append("    idadeMinima: ").append(toIndentedString(idadeMinima)).append("\n");
    sb.append("    idadeMaxima: ").append(toIndentedString(idadeMaxima)).append("\n");
    sb.append("    flagDebitoIncondicional: ").append(toIndentedString(flagDebitoIncondicional)).append("\n");
    sb.append("    flagExtratoIncondicional: ").append(toIndentedString(flagExtratoIncondicional)).append("\n");
    sb.append("    flagEstornoAutomatico: ").append(toIndentedString(flagEstornoAutomatico)).append("\n");
    sb.append("    valorRepassadoSeguradora: ").append(toIndentedString(valorRepassadoSeguradora)).append("\n");
    sb.append("    flagLancaTransacao: ").append(toIndentedString(flagLancaTransacao)).append("\n");
    sb.append("    flagTransferenciaAutomatica: ").append(toIndentedString(flagTransferenciaAutomatica)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idGrupoDebitoRecorrente: ").append(toIndentedString(idGrupoDebitoRecorrente)).append("\n");
    sb.append("    quantidadeTentativasCobranca: ").append(toIndentedString(quantidadeTentativasCobranca)).append("\n");
    sb.append("    idAjuste: ").append(toIndentedString(idAjuste)).append("\n");
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

