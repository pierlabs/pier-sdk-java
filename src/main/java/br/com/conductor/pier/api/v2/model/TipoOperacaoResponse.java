package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{tipo_operacao_response_description}}}
 **/

@ApiModel(description = "{{{tipo_operacao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoOperacaoResponse   {
  
  private Long id = null;
  private String tipoOperacao = null;
  private String nome = null;
  private String descricao = null;
  private BigDecimal excedentePermitido = null;
  private String tipoExcedentePermitido = null;
  private BigDecimal valorMinimo = null;
  private BigDecimal valorMaximo = null;
  private BigDecimal valorTAC = null;
  private Integer flagTiraTac = null;
  private Long idProduto = null;
  private Long idEstabelecimento = null;
  private BigDecimal tarifa = null;
  private BigDecimal remuneracaoEmissor = null;
  private Integer planoMaximo = null;
  private Integer planoMinimo = null;

  
  /**
   * {{{tipo_operacao_response_id_value}}}
   **/
  public TipoOperacaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_operacao_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_operacao_response_tipo_operacao_value}}}
   **/
  public TipoOperacaoResponse tipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_operacao_response_tipo_operacao_value}}}")
  @JsonProperty("tipoOperacao")
  public String getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   * {{{tipo_operacao_response_nome_value}}}
   **/
  public TipoOperacaoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_operacao_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{tipo_operacao_response_descricao_value}}}
   **/
  public TipoOperacaoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_operacao_response_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_operacao_response_excedente_permitido_value}}}
   **/
  public TipoOperacaoResponse excedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_operacao_response_excedente_permitido_value}}}")
  @JsonProperty("excedentePermitido")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * {{{tipo_operacao_response_tipo_excedente_permitido_value}}}
   **/
  public TipoOperacaoResponse tipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_operacao_response_tipo_excedente_permitido_value}}}")
  @JsonProperty("tipoExcedentePermitido")
  public String getTipoExcedentePermitido() {
    return tipoExcedentePermitido;
  }
  public void setTipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
  }

  
  /**
   * {{{tipo_operacao_response_valor_minimo_value}}}
   **/
  public TipoOperacaoResponse valorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_operacao_response_valor_minimo_value}}}")
  @JsonProperty("valorMinimo")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * {{{tipo_operacao_response_valor_maximo_value}}}
   **/
  public TipoOperacaoResponse valorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_operacao_response_valor_maximo_value}}}")
  @JsonProperty("valorMaximo")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * {{{tipo_operacao_response_valor_t_a_c_value}}}
   **/
  public TipoOperacaoResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_operacao_response_valor_t_a_c_value}}}")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * {{{tipo_operacao_response_flag_tira_tac_value}}}
   **/
  public TipoOperacaoResponse flagTiraTac(Integer flagTiraTac) {
    this.flagTiraTac = flagTiraTac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_operacao_response_flag_tira_tac_value}}}")
  @JsonProperty("flagTiraTac")
  public Integer getFlagTiraTac() {
    return flagTiraTac;
  }
  public void setFlagTiraTac(Integer flagTiraTac) {
    this.flagTiraTac = flagTiraTac;
  }

  
  /**
   * {{{tipo_operacao_response_id_produto_value}}}
   **/
  public TipoOperacaoResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_operacao_response_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{tipo_operacao_response_id_estabelecimento_value}}}
   **/
  public TipoOperacaoResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_operacao_response_id_estabelecimento_value}}}")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{tipo_operacao_response_tarifa_value}}}
   **/
  public TipoOperacaoResponse tarifa(BigDecimal tarifa) {
    this.tarifa = tarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_operacao_response_tarifa_value}}}")
  @JsonProperty("tarifa")
  public BigDecimal getTarifa() {
    return tarifa;
  }
  public void setTarifa(BigDecimal tarifa) {
    this.tarifa = tarifa;
  }

  
  /**
   * {{{tipo_operacao_response_remuneracao_emissor_value}}}
   **/
  public TipoOperacaoResponse remuneracaoEmissor(BigDecimal remuneracaoEmissor) {
    this.remuneracaoEmissor = remuneracaoEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_operacao_response_remuneracao_emissor_value}}}")
  @JsonProperty("remuneracaoEmissor")
  public BigDecimal getRemuneracaoEmissor() {
    return remuneracaoEmissor;
  }
  public void setRemuneracaoEmissor(BigDecimal remuneracaoEmissor) {
    this.remuneracaoEmissor = remuneracaoEmissor;
  }

  
  /**
   * {{{tipo_operacao_response_plano_maximo_value}}}
   **/
  public TipoOperacaoResponse planoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_operacao_response_plano_maximo_value}}}")
  @JsonProperty("planoMaximo")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * {{{tipo_operacao_response_plano_minimo_value}}}
   **/
  public TipoOperacaoResponse planoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_operacao_response_plano_minimo_value}}}")
  @JsonProperty("planoMinimo")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoOperacaoResponse tipoOperacaoResponse = (TipoOperacaoResponse) o;
    return Objects.equals(this.id, tipoOperacaoResponse.id) &&
        Objects.equals(this.tipoOperacao, tipoOperacaoResponse.tipoOperacao) &&
        Objects.equals(this.nome, tipoOperacaoResponse.nome) &&
        Objects.equals(this.descricao, tipoOperacaoResponse.descricao) &&
        Objects.equals(this.excedentePermitido, tipoOperacaoResponse.excedentePermitido) &&
        Objects.equals(this.tipoExcedentePermitido, tipoOperacaoResponse.tipoExcedentePermitido) &&
        Objects.equals(this.valorMinimo, tipoOperacaoResponse.valorMinimo) &&
        Objects.equals(this.valorMaximo, tipoOperacaoResponse.valorMaximo) &&
        Objects.equals(this.valorTAC, tipoOperacaoResponse.valorTAC) &&
        Objects.equals(this.flagTiraTac, tipoOperacaoResponse.flagTiraTac) &&
        Objects.equals(this.idProduto, tipoOperacaoResponse.idProduto) &&
        Objects.equals(this.idEstabelecimento, tipoOperacaoResponse.idEstabelecimento) &&
        Objects.equals(this.tarifa, tipoOperacaoResponse.tarifa) &&
        Objects.equals(this.remuneracaoEmissor, tipoOperacaoResponse.remuneracaoEmissor) &&
        Objects.equals(this.planoMaximo, tipoOperacaoResponse.planoMaximo) &&
        Objects.equals(this.planoMinimo, tipoOperacaoResponse.planoMinimo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tipoOperacao, nome, descricao, excedentePermitido, tipoExcedentePermitido, valorMinimo, valorMaximo, valorTAC, flagTiraTac, idProduto, idEstabelecimento, tarifa, remuneracaoEmissor, planoMaximo, planoMinimo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOperacaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    excedentePermitido: ").append(toIndentedString(excedentePermitido)).append("\n");
    sb.append("    tipoExcedentePermitido: ").append(toIndentedString(tipoExcedentePermitido)).append("\n");
    sb.append("    valorMinimo: ").append(toIndentedString(valorMinimo)).append("\n");
    sb.append("    valorMaximo: ").append(toIndentedString(valorMaximo)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
    sb.append("    flagTiraTac: ").append(toIndentedString(flagTiraTac)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    tarifa: ").append(toIndentedString(tarifa)).append("\n");
    sb.append("    remuneracaoEmissor: ").append(toIndentedString(remuneracaoEmissor)).append("\n");
    sb.append("    planoMaximo: ").append(toIndentedString(planoMaximo)).append("\n");
    sb.append("    planoMinimo: ").append(toIndentedString(planoMinimo)).append("\n");
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

