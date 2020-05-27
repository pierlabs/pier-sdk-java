package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto para altera\u00E7\u00E3o de contas. Nenhum dos campos s\u00E3o obrigat\u00F3rios. Devem ser informados apenas os campos que deseja modificar
 **/

@ApiModel(description = "Objeto para altera\u00E7\u00E3o de contas. Nenhum dos campos s\u00E3o obrigat\u00F3rios. Devem ser informados apenas os campos que deseja modificar")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaPartialUpdate   {
  
  private String funcaoAtiva = null;
  private Long idContaEmissor = null;
  private String dataCadastro = null;
  private BigDecimal valorRenda = null;
  private Boolean possuiOverLimit = null;
  private String usuarioModificacao = null;
  private Integer behaviorScore = null;
  private Long banco = null;
  private Long agencia = null;

  
  /**
   * Fun\u00E7\u00E3o ativa da conta. Representa a fun\u00E7\u00E3o na qual a conta encontra-se habilitada. Propriedade s\u00F3 deve ser informada caso o emissor fa\u00E7a uso de fun\u00E7\u00F5es para contas. As fun\u00E7\u00F5es dispon\u00EDveis para contas podem ser visualizadas em api/contas/tipos-funcoes
   **/
  public ContaPartialUpdate funcaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fun\u00E7\u00E3o ativa da conta. Representa a fun\u00E7\u00E3o na qual a conta encontra-se habilitada. Propriedade s\u00F3 deve ser informada caso o emissor fa\u00E7a uso de fun\u00E7\u00F5es para contas. As fun\u00E7\u00F5es dispon\u00EDveis para contas podem ser visualizadas em api/contas/tipos-funcoes")
  @JsonProperty("funcaoAtiva")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * Identificador da conta de controle interno criado pelo emissor
   **/
  public ContaPartialUpdate idContaEmissor(Long idContaEmissor) {
    this.idContaEmissor = idContaEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta de controle interno criado pelo emissor")
  @JsonProperty("idContaEmissor")
  public Long getIdContaEmissor() {
    return idContaEmissor;
  }
  public void setIdContaEmissor(Long idContaEmissor) {
    this.idContaEmissor = idContaEmissor;
  }

  
  /**
   * dataCadastro
   **/
  public ContaPartialUpdate dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "dataCadastro")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * valorRenda
   **/
  public ContaPartialUpdate valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "valorRenda")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Sinaliza se o OverLimit da conta est\u00E1 ativo
   **/
  public ContaPartialUpdate possuiOverLimit(Boolean possuiOverLimit) {
    this.possuiOverLimit = possuiOverLimit;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Sinaliza se o OverLimit da conta est\u00E1 ativo")
  @JsonProperty("possuiOverLimit")
  public Boolean getPossuiOverLimit() {
    return possuiOverLimit;
  }
  public void setPossuiOverLimit(Boolean possuiOverLimit) {
    this.possuiOverLimit = possuiOverLimit;
  }

  
  /**
   * usuarioModificacao
   **/
  public ContaPartialUpdate usuarioModificacao(String usuarioModificacao) {
    this.usuarioModificacao = usuarioModificacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "usuarioModificacao")
  @JsonProperty("usuarioModificacao")
  public String getUsuarioModificacao() {
    return usuarioModificacao;
  }
  public void setUsuarioModificacao(String usuarioModificacao) {
    this.usuarioModificacao = usuarioModificacao;
  }

  
  /**
   * Valor da pontua\u00E7\u00E3o de comportamento (behavior score).
   **/
  public ContaPartialUpdate behaviorScore(Integer behaviorScore) {
    this.behaviorScore = behaviorScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da pontua\u00E7\u00E3o de comportamento (behavior score).")
  @JsonProperty("behaviorScore")
  public Integer getBehaviorScore() {
    return behaviorScore;
  }
  public void setBehaviorScore(Integer behaviorScore) {
    this.behaviorScore = behaviorScore;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do banco
   **/
  public ContaPartialUpdate banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do banco")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da ag\u00EAncia
   **/
  public ContaPartialUpdate agencia(Long agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da ag\u00EAncia")
  @JsonProperty("agencia")
  public Long getAgencia() {
    return agencia;
  }
  public void setAgencia(Long agencia) {
    this.agencia = agencia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaPartialUpdate contaPartialUpdate = (ContaPartialUpdate) o;
    return Objects.equals(this.funcaoAtiva, contaPartialUpdate.funcaoAtiva) &&
        Objects.equals(this.idContaEmissor, contaPartialUpdate.idContaEmissor) &&
        Objects.equals(this.dataCadastro, contaPartialUpdate.dataCadastro) &&
        Objects.equals(this.valorRenda, contaPartialUpdate.valorRenda) &&
        Objects.equals(this.possuiOverLimit, contaPartialUpdate.possuiOverLimit) &&
        Objects.equals(this.usuarioModificacao, contaPartialUpdate.usuarioModificacao) &&
        Objects.equals(this.behaviorScore, contaPartialUpdate.behaviorScore) &&
        Objects.equals(this.banco, contaPartialUpdate.banco) &&
        Objects.equals(this.agencia, contaPartialUpdate.agencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(funcaoAtiva, idContaEmissor, dataCadastro, valorRenda, possuiOverLimit, usuarioModificacao, behaviorScore, banco, agencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaPartialUpdate {\n");
    
    sb.append("    funcaoAtiva: ").append(toIndentedString(funcaoAtiva)).append("\n");
    sb.append("    idContaEmissor: ").append(toIndentedString(idContaEmissor)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    valorRenda: ").append(toIndentedString(valorRenda)).append("\n");
    sb.append("    possuiOverLimit: ").append(toIndentedString(possuiOverLimit)).append("\n");
    sb.append("    usuarioModificacao: ").append(toIndentedString(usuarioModificacao)).append("\n");
    sb.append("    behaviorScore: ").append(toIndentedString(behaviorScore)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
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

