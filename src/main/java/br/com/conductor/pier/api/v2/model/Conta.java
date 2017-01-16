package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * Objeto conta
 **/

@ApiModel(description = "Objeto conta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class Conta   {
  
  private Long id = null;
  private Long idProduto = null;
  private Long idOrigemComercial = null;
  private Long idPessoa = null;
  private Long idStatusConta = null;
  private Integer diaVencimento = null;
  private Integer melhorDiaCompra = null;
  private Date dataStatusConta = null;
  private Date dataCadastro = null;
  private Date dataUltimaAlteracaoVencimento = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de conta (id).
   **/
  public Conta id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de conta (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do produto ao qual a conta faz parte. (id).
   **/
  public Conta idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do produto ao qual a conta faz parte. (id).")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial (id) que deu origem a Conta.
   **/
  public Conta idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial (id) que deu origem a Conta.")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa Titular da Conta (id).
   **/
  public Conta idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa Titular da Conta (id).")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).
   **/
  public Conta idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Apresenta o dia de vencimento.
   **/
  public Conta diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o dia de vencimento.")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Apresenta o melhor dia de compra.
   **/
  public Conta melhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o melhor dia de compra.")
  @JsonProperty("melhorDiaCompra")
  public Integer getMelhorDiaCompra() {
    return melhorDiaCompra;
  }
  public void setMelhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
  }

  
  /**
   * Apresenta a data em que o idStatusConta atual fora atribu\u00C3\u00ADdo para ela.
   **/
  public Conta dataStatusConta(Date dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data em que o idStatusConta atual fora atribu\u00C3\u00ADdo para ela.")
  @JsonProperty("dataStatusConta")
  public Date getDataStatusConta() {
    return dataStatusConta;
  }
  public void setDataStatusConta(Date dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
  }

  
  /**
   * Apresenta a data em que o cart\u00C3\u00A3o foi gerado.
   **/
  public Conta dataCadastro(Date dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data em que o cart\u00C3\u00A3o foi gerado.")
  @JsonProperty("dataCadastro")
  public Date getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(Date dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Apresenta a data da ultima altera\u00C3\u00A7\u00C3\u00A3o de vencimento.
   **/
  public Conta dataUltimaAlteracaoVencimento(Date dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data da ultima altera\u00C3\u00A7\u00C3\u00A3o de vencimento.")
  @JsonProperty("dataUltimaAlteracaoVencimento")
  public Date getDataUltimaAlteracaoVencimento() {
    return dataUltimaAlteracaoVencimento;
  }
  public void setDataUltimaAlteracaoVencimento(Date dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conta conta = (Conta) o;
    return Objects.equals(this.id, conta.id) &&
        Objects.equals(this.idProduto, conta.idProduto) &&
        Objects.equals(this.idOrigemComercial, conta.idOrigemComercial) &&
        Objects.equals(this.idPessoa, conta.idPessoa) &&
        Objects.equals(this.idStatusConta, conta.idStatusConta) &&
        Objects.equals(this.diaVencimento, conta.diaVencimento) &&
        Objects.equals(this.melhorDiaCompra, conta.melhorDiaCompra) &&
        Objects.equals(this.dataStatusConta, conta.dataStatusConta) &&
        Objects.equals(this.dataCadastro, conta.dataCadastro) &&
        Objects.equals(this.dataUltimaAlteracaoVencimento, conta.dataUltimaAlteracaoVencimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idProduto, idOrigemComercial, idPessoa, idStatusConta, diaVencimento, melhorDiaCompra, dataStatusConta, dataCadastro, dataUltimaAlteracaoVencimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conta {\n");
    
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



