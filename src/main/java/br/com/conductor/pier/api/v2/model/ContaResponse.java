package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{conta_response_description}}}
 **/

@ApiModel(description = "{{{conta_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaResponse   {
  
  private Long id = null;
  private Long idProduto = null;
  private Long idOrigemComercial = null;
  private Long idPessoa = null;
  private Long idStatusConta = null;
  private Integer diaVencimento = null;
  private Integer melhorDiaCompra = null;
  private String dataStatusConta = null;
  private String dataCadastro = null;
  private String dataUltimaAlteracaoVencimento = null;
  private BigDecimal valorRenda = null;
  private Long idProposta = null;


  public enum FuncaoAtivaEnum {
    DEBITO_CREDITO("DEBITO_CREDITO"),
    CREDITO("CREDITO");

    private String value;

    FuncaoAtivaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FuncaoAtivaEnum funcaoAtiva = null;

  
  /**
   * {{{conta_response_id_value}}}
   **/
  public ContaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{conta_response_id_produto_value}}}
   **/
  public ContaResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{conta_response_id_origem_comercial_value}}}
   **/
  public ContaResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_id_origem_comercial_value}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{conta_response_id_pessoa_value}}}
   **/
  public ContaResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{conta_response_id_status_conta_value}}}
   **/
  public ContaResponse idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_id_status_conta_value}}}")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * {{{conta_response_dia_vencimento_value}}}
   **/
  public ContaResponse diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_dia_vencimento_value}}}")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{conta_response_melhor_dia_compra_value}}}
   **/
  public ContaResponse melhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_melhor_dia_compra_value}}}")
  @JsonProperty("melhorDiaCompra")
  public Integer getMelhorDiaCompra() {
    return melhorDiaCompra;
  }
  public void setMelhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
  }

  
  /**
   * {{{conta_response_data_status_conta_value}}}
   **/
  public ContaResponse dataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_data_status_conta_value}}}")
  @JsonProperty("dataStatusConta")
  public String getDataStatusConta() {
    return dataStatusConta;
  }
  public void setDataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
  }

  
  /**
   * {{{conta_response_data_cadastro_value}}}
   **/
  public ContaResponse dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_data_cadastro_value}}}")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * {{{conta_response_data_ultima_alteracao_vencimento_value}}}
   **/
  public ContaResponse dataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_data_ultima_alteracao_vencimento_value}}}")
  @JsonProperty("dataUltimaAlteracaoVencimento")
  public String getDataUltimaAlteracaoVencimento() {
    return dataUltimaAlteracaoVencimento;
  }
  public void setDataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
  }

  
  /**
   * {{{conta_response_valor_renda_value}}}
   **/
  public ContaResponse valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_valor_renda_value}}}")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * {{{conta_response_id_proposta}}}
   **/
  public ContaResponse idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_id_proposta}}}")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * {{{conta_response_funcao_ativa_value}}}
   **/
  public ContaResponse funcaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_funcao_ativa_value}}}")
  @JsonProperty("funcaoAtiva")
  public FuncaoAtivaEnum getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaResponse contaResponse = (ContaResponse) o;
    return Objects.equals(this.id, contaResponse.id) &&
        Objects.equals(this.idProduto, contaResponse.idProduto) &&
        Objects.equals(this.idOrigemComercial, contaResponse.idOrigemComercial) &&
        Objects.equals(this.idPessoa, contaResponse.idPessoa) &&
        Objects.equals(this.idStatusConta, contaResponse.idStatusConta) &&
        Objects.equals(this.diaVencimento, contaResponse.diaVencimento) &&
        Objects.equals(this.melhorDiaCompra, contaResponse.melhorDiaCompra) &&
        Objects.equals(this.dataStatusConta, contaResponse.dataStatusConta) &&
        Objects.equals(this.dataCadastro, contaResponse.dataCadastro) &&
        Objects.equals(this.dataUltimaAlteracaoVencimento, contaResponse.dataUltimaAlteracaoVencimento) &&
        Objects.equals(this.valorRenda, contaResponse.valorRenda) &&
        Objects.equals(this.idProposta, contaResponse.idProposta) &&
        Objects.equals(this.funcaoAtiva, contaResponse.funcaoAtiva);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idProduto, idOrigemComercial, idPessoa, idStatusConta, diaVencimento, melhorDiaCompra, dataStatusConta, dataCadastro, dataUltimaAlteracaoVencimento, valorRenda, idProposta, funcaoAtiva);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idStatusConta: ").append(toIndentedString(idStatusConta)).append("\n");
    sb.append("    diaVencimento: ").append(toIndentedString(diaVencimento)).append("\n");
    sb.append("    melhorDiaCompra: ").append(toIndentedString(melhorDiaCompra)).append("\n");
    sb.append("    dataStatusConta: ").append(toIndentedString(dataStatusConta)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    dataUltimaAlteracaoVencimento: ").append(toIndentedString(dataUltimaAlteracaoVencimento)).append("\n");
    sb.append("    valorRenda: ").append(toIndentedString(valorRenda)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    funcaoAtiva: ").append(toIndentedString(funcaoAtiva)).append("\n");
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

