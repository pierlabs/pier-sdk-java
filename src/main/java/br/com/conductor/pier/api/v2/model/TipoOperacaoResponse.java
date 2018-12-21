package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Response Representation of the TypeOperation Resource
 **/

@ApiModel(description = "Response Representation of the TypeOperation Resource")
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
   * Identifier Code of the OperationType
   **/
  public TipoOperacaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier Code of the OperationType")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * OperationType Code
   **/
  public TipoOperacaoResponse tipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "OperationType Code")
  @JsonProperty("tipoOperacao")
  public String getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   * Name of the Operationtype
   **/
  public TipoOperacaoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the Operationtype")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Decri??o of the OperationType
   **/
  public TipoOperacaoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Decri??o of the OperationType")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Exceed allowed for the TypeOperation
   **/
  public TipoOperacaoResponse excedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exceed allowed for the TypeOperation")
  @JsonProperty("excedentePermitido")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * Type of the allowed exceeded for the OperationType
   **/
  public TipoOperacaoResponse tipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the allowed exceeded for the OperationType")
  @JsonProperty("tipoExcedentePermitido")
  public String getTipoExcedentePermitido() {
    return tipoExcedentePermitido;
  }
  public void setTipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
  }

  
  /**
   * Minimum value for the transaction of OperationType
   **/
  public TipoOperacaoResponse valorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Minimum value for the transaction of OperationType")
  @JsonProperty("valorMinimo")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * Maximum valuie for the transaction of the OperationType
   **/
  public TipoOperacaoResponse valorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum valuie for the transaction of the OperationType")
  @JsonProperty("valorMaximo")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * TAC value of the transaction of OperationType
   **/
  public TipoOperacaoResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "TAC value of the transaction of OperationType")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Flag stripe TAC of the OperationType
   **/
  public TipoOperacaoResponse flagTiraTac(Integer flagTiraTac) {
    this.flagTiraTac = flagTiraTac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag stripe TAC of the OperationType")
  @JsonProperty("flagTiraTac")
  public Integer getFlagTiraTac() {
    return flagTiraTac;
  }
  public void setFlagTiraTac(Integer flagTiraTac) {
    this.flagTiraTac = flagTiraTac;
  }

  
  /**
   * Identifier of the TypeOperation of Product
   **/
  public TipoOperacaoResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the TypeOperation of Product")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identifier of the Merchant of OperationType
   **/
  public TipoOperacaoResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the Merchant of OperationType")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * OperationType fee
   **/
  public TipoOperacaoResponse tarifa(BigDecimal tarifa) {
    this.tarifa = tarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "OperationType fee")
  @JsonProperty("tarifa")
  public BigDecimal getTarifa() {
    return tarifa;
  }
  public void setTarifa(BigDecimal tarifa) {
    this.tarifa = tarifa;
  }

  
  /**
   * Remunaration of the Issuer for the OperatioType
   **/
  public TipoOperacaoResponse remuneracaoEmissor(BigDecimal remuneracaoEmissor) {
    this.remuneracaoEmissor = remuneracaoEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Remunaration of the Issuer for the OperatioType")
  @JsonProperty("remuneracaoEmissor")
  public BigDecimal getRemuneracaoEmissor() {
    return remuneracaoEmissor;
  }
  public void setRemuneracaoEmissor(BigDecimal remuneracaoEmissor) {
    this.remuneracaoEmissor = remuneracaoEmissor;
  }

  
  /**
   * Maximum Plan of the OperationType
   **/
  public TipoOperacaoResponse planoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum Plan of the OperationType")
  @JsonProperty("planoMaximo")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * Minimum Plan of the OperationType
   **/
  public TipoOperacaoResponse planoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Minimum Plan of the OperationType")
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

