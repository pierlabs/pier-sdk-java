package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o da resposta do recurso de Tipo Debito Recorrente
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de Tipo Debito Recorrente")
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
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)
   **/
  public TipoDebitoRecorrenteResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de d\u00E9bito recorrente
   **/
  public TipoDebitoRecorrenteResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do tipo de d\u00E9bito recorrente")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Valor do tipo de d\u00E9bito recorrente
   **/
  public TipoDebitoRecorrenteResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do tipo de d\u00E9bito recorrente")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Flag que identifica se o tipo d\u00E9bito recorrente est\u00E1 ativo
   **/
  public TipoDebitoRecorrenteResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que identifica se o tipo d\u00E9bito recorrente est\u00E1 ativo")
  @JsonProperty("flagAtivo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Valor do bonus referente ao plano
   **/
  public TipoDebitoRecorrenteResponse valorBonus(BigDecimal valorBonus) {
    this.valorBonus = valorBonus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do bonus referente ao plano")
  @JsonProperty("valorBonus")
  public BigDecimal getValorBonus() {
    return valorBonus;
  }
  public void setValorBonus(BigDecimal valorBonus) {
    this.valorBonus = valorBonus;
  }

  
  /**
   * Numero de parcelas referente ao plano
   **/
  public TipoDebitoRecorrenteResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Numero de parcelas referente ao plano")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Flag que indica se a renova\u00E7\u00E3o vai ser autom\u00E1tica
   **/
  public TipoDebitoRecorrenteResponse flagAdereAutomatico(Boolean flagAdereAutomatico) {
    this.flagAdereAutomatico = flagAdereAutomatico;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se a renova\u00E7\u00E3o vai ser autom\u00E1tica")
  @JsonProperty("flagAdereAutomatico")
  public Boolean getFlagAdereAutomatico() {
    return flagAdereAutomatico;
  }
  public void setFlagAdereAutomatico(Boolean flagAdereAutomatico) {
    this.flagAdereAutomatico = flagAdereAutomatico;
  }

  
  /**
   * Flag que indica se a renova\u00E7\u00E3o vai ser autom\u00E1tica
   **/
  public TipoDebitoRecorrenteResponse flagGeraNumeroSorte(Boolean flagGeraNumeroSorte) {
    this.flagGeraNumeroSorte = flagGeraNumeroSorte;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se a renova\u00E7\u00E3o vai ser autom\u00E1tica")
  @JsonProperty("flagGeraNumeroSorte")
  public Boolean getFlagGeraNumeroSorte() {
    return flagGeraNumeroSorte;
  }
  public void setFlagGeraNumeroSorte(Boolean flagGeraNumeroSorte) {
    this.flagGeraNumeroSorte = flagGeraNumeroSorte;
  }

  
  /**
   * Indica a faixa et\u00E1ria para aderir ao plano
   **/
  public TipoDebitoRecorrenteResponse faixaEtaria(String faixaEtaria) {
    this.faixaEtaria = faixaEtaria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica a faixa et\u00E1ria para aderir ao plano")
  @JsonProperty("faixaEtaria")
  public String getFaixaEtaria() {
    return faixaEtaria;
  }
  public void setFaixaEtaria(String faixaEtaria) {
    this.faixaEtaria = faixaEtaria;
  }

  
  /**
   * Flag indica se o plano \u00E9 um seguro
   **/
  public TipoDebitoRecorrenteResponse flagSeguro(Boolean flagSeguro) {
    this.flagSeguro = flagSeguro;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indica se o plano \u00E9 um seguro")
  @JsonProperty("flagSeguro")
  public Boolean getFlagSeguro() {
    return flagSeguro;
  }
  public void setFlagSeguro(Boolean flagSeguro) {
    this.flagSeguro = flagSeguro;
  }

  
  /**
   * Indica qual premia\u00E7\u00E3o referente ao m\u00EAs
   **/
  public TipoDebitoRecorrenteResponse sorteiosMensais(String sorteiosMensais) {
    this.sorteiosMensais = sorteiosMensais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica qual premia\u00E7\u00E3o referente ao m\u00EAs")
  @JsonProperty("sorteiosMensais")
  public String getSorteiosMensais() {
    return sorteiosMensais;
  }
  public void setSorteiosMensais(String sorteiosMensais) {
    this.sorteiosMensais = sorteiosMensais;
  }

  
  /**
   * Flag que indica se a ades\u00E3o do plano ser\u00E1 autom\u00E1tica
   **/
  public TipoDebitoRecorrenteResponse flagAdesaoAutomatica(Boolean flagAdesaoAutomatica) {
    this.flagAdesaoAutomatica = flagAdesaoAutomatica;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se a ades\u00E3o do plano ser\u00E1 autom\u00E1tica")
  @JsonProperty("flagAdesaoAutomatica")
  public Boolean getFlagAdesaoAutomatica() {
    return flagAdesaoAutomatica;
  }
  public void setFlagAdesaoAutomatica(Boolean flagAdesaoAutomatica) {
    this.flagAdesaoAutomatica = flagAdesaoAutomatica;
  }

  
  /**
   * Flag indica se o plano cobre dependente
   **/
  public TipoDebitoRecorrenteResponse flagDependente(Boolean flagDependente) {
    this.flagDependente = flagDependente;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indica se o plano cobre dependente")
  @JsonProperty("flagDependente")
  public Boolean getFlagDependente() {
    return flagDependente;
  }
  public void setFlagDependente(Boolean flagDependente) {
    this.flagDependente = flagDependente;
  }

  
  /**
   * Indica numeros de dependentes
   **/
  public TipoDebitoRecorrenteResponse quantidadeDependente(Integer quantidadeDependente) {
    this.quantidadeDependente = quantidadeDependente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica numeros de dependentes")
  @JsonProperty("quantidadeDependente")
  public Integer getQuantidadeDependente() {
    return quantidadeDependente;
  }
  public void setQuantidadeDependente(Integer quantidadeDependente) {
    this.quantidadeDependente = quantidadeDependente;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do termo seguro servi\u00E7o (id)
   **/
  public TipoDebitoRecorrenteResponse idTermoSeguroServico(Long idTermoSeguroServico) {
    this.idTermoSeguroServico = idTermoSeguroServico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do termo seguro servi\u00E7o (id)")
  @JsonProperty("idTermoSeguroServico")
  public Long getIdTermoSeguroServico() {
    return idTermoSeguroServico;
  }
  public void setIdTermoSeguroServico(Long idTermoSeguroServico) {
    this.idTermoSeguroServico = idTermoSeguroServico;
  }

  
  /**
   * Idade minima para aderir ao plano
   **/
  public TipoDebitoRecorrenteResponse idadeMinima(Integer idadeMinima) {
    this.idadeMinima = idadeMinima;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Idade minima para aderir ao plano")
  @JsonProperty("idadeMinima")
  public Integer getIdadeMinima() {
    return idadeMinima;
  }
  public void setIdadeMinima(Integer idadeMinima) {
    this.idadeMinima = idadeMinima;
  }

  
  /**
   * Idade m\u00E1xima para aderir ao plano
   **/
  public TipoDebitoRecorrenteResponse idadeMaxima(Integer idadeMaxima) {
    this.idadeMaxima = idadeMaxima;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Idade m\u00E1xima para aderir ao plano")
  @JsonProperty("idadeMaxima")
  public Integer getIdadeMaxima() {
    return idadeMaxima;
  }
  public void setIdadeMaxima(Integer idadeMaxima) {
    this.idadeMaxima = idadeMaxima;
  }

  
  /**
   * Flag indica se o plano ter\u00E1 um debito incondicional
   **/
  public TipoDebitoRecorrenteResponse flagDebitoIncondicional(Boolean flagDebitoIncondicional) {
    this.flagDebitoIncondicional = flagDebitoIncondicional;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indica se o plano ter\u00E1 um debito incondicional")
  @JsonProperty("flagDebitoIncondicional")
  public Boolean getFlagDebitoIncondicional() {
    return flagDebitoIncondicional;
  }
  public void setFlagDebitoIncondicional(Boolean flagDebitoIncondicional) {
    this.flagDebitoIncondicional = flagDebitoIncondicional;
  }

  
  /**
   * Flag indica se o plano ter\u00E1 extrato incondicional
   **/
  public TipoDebitoRecorrenteResponse flagExtratoIncondicional(Boolean flagExtratoIncondicional) {
    this.flagExtratoIncondicional = flagExtratoIncondicional;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indica se o plano ter\u00E1 extrato incondicional")
  @JsonProperty("flagExtratoIncondicional")
  public Boolean getFlagExtratoIncondicional() {
    return flagExtratoIncondicional;
  }
  public void setFlagExtratoIncondicional(Boolean flagExtratoIncondicional) {
    this.flagExtratoIncondicional = flagExtratoIncondicional;
  }

  
  /**
   * Flag indica se o plano ter\u00E1 algum estorno autom\u00E1tico
   **/
  public TipoDebitoRecorrenteResponse flagEstornoAutomatico(Boolean flagEstornoAutomatico) {
    this.flagEstornoAutomatico = flagEstornoAutomatico;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indica se o plano ter\u00E1 algum estorno autom\u00E1tico")
  @JsonProperty("flagEstornoAutomatico")
  public Boolean getFlagEstornoAutomatico() {
    return flagEstornoAutomatico;
  }
  public void setFlagEstornoAutomatico(Boolean flagEstornoAutomatico) {
    this.flagEstornoAutomatico = flagEstornoAutomatico;
  }

  
  /**
   * Valor repassado a seguradora
   **/
  public TipoDebitoRecorrenteResponse valorRepassadoSeguradora(BigDecimal valorRepassadoSeguradora) {
    this.valorRepassadoSeguradora = valorRepassadoSeguradora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor repassado a seguradora")
  @JsonProperty("valorRepassadoSeguradora")
  public BigDecimal getValorRepassadoSeguradora() {
    return valorRepassadoSeguradora;
  }
  public void setValorRepassadoSeguradora(BigDecimal valorRepassadoSeguradora) {
    this.valorRepassadoSeguradora = valorRepassadoSeguradora;
  }

  
  /**
   * Flag que indica se vai ser lan\u00E7ado uma transa\u00E7\u00E3o
   **/
  public TipoDebitoRecorrenteResponse flagLancaTransacao(Boolean flagLancaTransacao) {
    this.flagLancaTransacao = flagLancaTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se vai ser lan\u00E7ado uma transa\u00E7\u00E3o")
  @JsonProperty("flagLancaTransacao")
  public Boolean getFlagLancaTransacao() {
    return flagLancaTransacao;
  }
  public void setFlagLancaTransacao(Boolean flagLancaTransacao) {
    this.flagLancaTransacao = flagLancaTransacao;
  }

  
  /**
   * Flag que indica se vai ser feito transfer\u00EAncia autom\u00E1tica
   **/
  public TipoDebitoRecorrenteResponse flagTransferenciaAutomatica(Boolean flagTransferenciaAutomatica) {
    this.flagTransferenciaAutomatica = flagTransferenciaAutomatica;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se vai ser feito transfer\u00EAncia autom\u00E1tica")
  @JsonProperty("flagTransferenciaAutomatica")
  public Boolean getFlagTransferenciaAutomatica() {
    return flagTransferenciaAutomatica;
  }
  public void setFlagTransferenciaAutomatica(Boolean flagTransferenciaAutomatica) {
    this.flagTransferenciaAutomatica = flagTransferenciaAutomatica;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o de produtos (id)
   **/
  public TipoDebitoRecorrenteResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o de produtos (id)")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do grupo de d\u00E9bito recorrente (id)
   **/
  public TipoDebitoRecorrenteResponse idGrupoDebitoRecorrente(Long idGrupoDebitoRecorrente) {
    this.idGrupoDebitoRecorrente = idGrupoDebitoRecorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do grupo de d\u00E9bito recorrente (id)")
  @JsonProperty("idGrupoDebitoRecorrente")
  public Long getIdGrupoDebitoRecorrente() {
    return idGrupoDebitoRecorrente;
  }
  public void setIdGrupoDebitoRecorrente(Long idGrupoDebitoRecorrente) {
    this.idGrupoDebitoRecorrente = idGrupoDebitoRecorrente;
  }

  
  /**
   * Qauntidade de tentativas para conbran\u00E7a
   **/
  public TipoDebitoRecorrenteResponse quantidadeTentativasCobranca(Integer quantidadeTentativasCobranca) {
    this.quantidadeTentativasCobranca = quantidadeTentativasCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Qauntidade de tentativas para conbran\u00E7a")
  @JsonProperty("quantidadeTentativasCobranca")
  public Integer getQuantidadeTentativasCobranca() {
    return quantidadeTentativasCobranca;
  }
  public void setQuantidadeTentativasCobranca(Integer quantidadeTentativasCobranca) {
    this.quantidadeTentativasCobranca = quantidadeTentativasCobranca;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o de tipos de ajuste (id)
   **/
  public TipoDebitoRecorrenteResponse idAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o de tipos de ajuste (id)")
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

