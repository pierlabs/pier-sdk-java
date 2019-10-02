package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa a requisi\u00E7\u00E3o do recurso lista de tipos de boletos
 **/

@ApiModel(description = "Representa a requisi\u00E7\u00E3o do recurso lista de tipos de boletos")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AjustePersist   {
  
  private Long idTipoAjuste = null;
  private String dataAjuste = null;
  private BigDecimal valorAjuste = null;
  private String identificadorExterno = null;
  private Long idTransacaoOriginal = null;
  private Long idEstabelecimento = null;
  private Boolean flagAtendimento = null;
  private String mensagemAtendimento = null;

  
  /**
   * C\u00F3digo identificador do tipo de ajuste
   **/
  public AjustePersist idTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do tipo de ajuste")
  @JsonProperty("idTipoAjuste")
  public Long getIdTipoAjuste() {
    return idTipoAjuste;
  }
  public void setIdTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
  }

  
  /**
   * Data do ajuste no formato yyyy-MM-dd'T'HH:mm:ss.SSSZ
   **/
  public AjustePersist dataAjuste(String dataAjuste) {
    this.dataAjuste = dataAjuste;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ", required = true, value = "Data do ajuste no formato yyyy-MM-dd'T'HH:mm:ss.SSSZ")
  @JsonProperty("dataAjuste")
  public String getDataAjuste() {
    return dataAjuste;
  }
  public void setDataAjuste(String dataAjuste) {
    this.dataAjuste = dataAjuste;
  }

  
  /**
   * Valor do ajuste
   **/
  public AjustePersist valorAjuste(BigDecimal valorAjuste) {
    this.valorAjuste = valorAjuste;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor do ajuste")
  @JsonProperty("valorAjuste")
  public BigDecimal getValorAjuste() {
    return valorAjuste;
  }
  public void setValorAjuste(BigDecimal valorAjuste) {
    this.valorAjuste = valorAjuste;
  }

  
  /**
   * Identificador Externo
   **/
  public AjustePersist identificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador Externo")
  @JsonProperty("identificadorExterno")
  public String getIdentificadorExterno() {
    return identificadorExterno;
  }
  public void setIdentificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
  }

  
  /**
   * Identificador da transa\u00E7\u00E3o original (estorno)
   **/
  public AjustePersist idTransacaoOriginal(Long idTransacaoOriginal) {
    this.idTransacaoOriginal = idTransacaoOriginal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da transa\u00E7\u00E3o original (estorno)")
  @JsonProperty("idTransacaoOriginal")
  public Long getIdTransacaoOriginal() {
    return idTransacaoOriginal;
  }
  public void setIdTransacaoOriginal(Long idTransacaoOriginal) {
    this.idTransacaoOriginal = idTransacaoOriginal;
  }

  
  /**
   * Identificador do estabelecimento quando o pagamento for efetuado em loja
   **/
  public AjustePersist idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do estabelecimento quando o pagamento for efetuado em loja")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Flag para lan\u00E7ar o atendimento
   **/
  public AjustePersist flagAtendimento(Boolean flagAtendimento) {
    this.flagAtendimento = flagAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para lan\u00E7ar o atendimento")
  @JsonProperty("flagAtendimento")
  public Boolean getFlagAtendimento() {
    return flagAtendimento;
  }
  public void setFlagAtendimento(Boolean flagAtendimento) {
    this.flagAtendimento = flagAtendimento;
  }

  
  /**
   * Mensagem enviada no atendimento
   **/
  public AjustePersist mensagemAtendimento(String mensagemAtendimento) {
    this.mensagemAtendimento = mensagemAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mensagem enviada no atendimento")
  @JsonProperty("mensagemAtendimento")
  public String getMensagemAtendimento() {
    return mensagemAtendimento;
  }
  public void setMensagemAtendimento(String mensagemAtendimento) {
    this.mensagemAtendimento = mensagemAtendimento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AjustePersist ajustePersist = (AjustePersist) o;
    return Objects.equals(this.idTipoAjuste, ajustePersist.idTipoAjuste) &&
        Objects.equals(this.dataAjuste, ajustePersist.dataAjuste) &&
        Objects.equals(this.valorAjuste, ajustePersist.valorAjuste) &&
        Objects.equals(this.identificadorExterno, ajustePersist.identificadorExterno) &&
        Objects.equals(this.idTransacaoOriginal, ajustePersist.idTransacaoOriginal) &&
        Objects.equals(this.idEstabelecimento, ajustePersist.idEstabelecimento) &&
        Objects.equals(this.flagAtendimento, ajustePersist.flagAtendimento) &&
        Objects.equals(this.mensagemAtendimento, ajustePersist.mensagemAtendimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoAjuste, dataAjuste, valorAjuste, identificadorExterno, idTransacaoOriginal, idEstabelecimento, flagAtendimento, mensagemAtendimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AjustePersist {\n");
    
    sb.append("    idTipoAjuste: ").append(toIndentedString(idTipoAjuste)).append("\n");
    sb.append("    dataAjuste: ").append(toIndentedString(dataAjuste)).append("\n");
    sb.append("    valorAjuste: ").append(toIndentedString(valorAjuste)).append("\n");
    sb.append("    identificadorExterno: ").append(toIndentedString(identificadorExterno)).append("\n");
    sb.append("    idTransacaoOriginal: ").append(toIndentedString(idTransacaoOriginal)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    flagAtendimento: ").append(toIndentedString(flagAtendimento)).append("\n");
    sb.append("    mensagemAtendimento: ").append(toIndentedString(mensagemAtendimento)).append("\n");
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

