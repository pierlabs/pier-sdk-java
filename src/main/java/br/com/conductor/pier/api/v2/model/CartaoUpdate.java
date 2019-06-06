package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto para atualiza\u00E7\u00E3o de cart\u00F5es
 **/

@ApiModel(description = "Objeto para atualiza\u00E7\u00E3o de cart\u00F5es")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoUpdate   {
  
  private Long idConta = null;
  private Long idPessoa = null;
  private Integer sequencialCartao = null;
  private Long conta = null;
  private Long idStatusCartao = null;
  private Long idEstagioCartao = null;
  private Integer qtdSenhasIncorretas = null;
  private String arquivoImpressao = null;

  
  /**
   * Identificador da conta
   **/
  public CartaoUpdate idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identificador da pessoa
   **/
  public CartaoUpdate idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da pessoa")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Sequencial do cart\u00E3o atual
   **/
  public CartaoUpdate sequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sequencial do cart\u00E3o atual")
  @JsonProperty("sequencialCartao")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * Conta do cart\u00E3o
   **/
  public CartaoUpdate conta(Long conta) {
    this.conta = conta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conta do cart\u00E3o")
  @JsonProperty("conta")
  public Long getConta() {
    return conta;
  }
  public void setConta(Long conta) {
    this.conta = conta;
  }

  
  /**
   * Identificador do status do cart\u00E3o
   **/
  public CartaoUpdate idStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do status do cart\u00E3o")
  @JsonProperty("idStatusCartao")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * Identificador do estagio de embossing do cart\u00E3o
   **/
  public CartaoUpdate idEstagioCartao(Long idEstagioCartao) {
    this.idEstagioCartao = idEstagioCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do estagio de embossing do cart\u00E3o")
  @JsonProperty("idEstagioCartao")
  public Long getIdEstagioCartao() {
    return idEstagioCartao;
  }
  public void setIdEstagioCartao(Long idEstagioCartao) {
    this.idEstagioCartao = idEstagioCartao;
  }

  
  /**
   * Contador de senhas incorretas
   **/
  public CartaoUpdate qtdSenhasIncorretas(Integer qtdSenhasIncorretas) {
    this.qtdSenhasIncorretas = qtdSenhasIncorretas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contador de senhas incorretas")
  @JsonProperty("qtdSenhasIncorretas")
  public Integer getQtdSenhasIncorretas() {
    return qtdSenhasIncorretas;
  }
  public void setQtdSenhasIncorretas(Integer qtdSenhasIncorretas) {
    this.qtdSenhasIncorretas = qtdSenhasIncorretas;
  }

  
  /**
   * Nome do arquivo de embossing que o cart\u00E3o foi impresso
   **/
  public CartaoUpdate arquivoImpressao(String arquivoImpressao) {
    this.arquivoImpressao = arquivoImpressao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do arquivo de embossing que o cart\u00E3o foi impresso")
  @JsonProperty("arquivoImpressao")
  public String getArquivoImpressao() {
    return arquivoImpressao;
  }
  public void setArquivoImpressao(String arquivoImpressao) {
    this.arquivoImpressao = arquivoImpressao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoUpdate cartaoUpdate = (CartaoUpdate) o;
    return Objects.equals(this.idConta, cartaoUpdate.idConta) &&
        Objects.equals(this.idPessoa, cartaoUpdate.idPessoa) &&
        Objects.equals(this.sequencialCartao, cartaoUpdate.sequencialCartao) &&
        Objects.equals(this.conta, cartaoUpdate.conta) &&
        Objects.equals(this.idStatusCartao, cartaoUpdate.idStatusCartao) &&
        Objects.equals(this.idEstagioCartao, cartaoUpdate.idEstagioCartao) &&
        Objects.equals(this.qtdSenhasIncorretas, cartaoUpdate.qtdSenhasIncorretas) &&
        Objects.equals(this.arquivoImpressao, cartaoUpdate.arquivoImpressao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idPessoa, sequencialCartao, conta, idStatusCartao, idEstagioCartao, qtdSenhasIncorretas, arquivoImpressao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoUpdate {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    sequencialCartao: ").append(toIndentedString(sequencialCartao)).append("\n");
    sb.append("    conta: ").append(toIndentedString(conta)).append("\n");
    sb.append("    idStatusCartao: ").append(toIndentedString(idStatusCartao)).append("\n");
    sb.append("    idEstagioCartao: ").append(toIndentedString(idEstagioCartao)).append("\n");
    sb.append("    qtdSenhasIncorretas: ").append(toIndentedString(qtdSenhasIncorretas)).append("\n");
    sb.append("    arquivoImpressao: ").append(toIndentedString(arquivoImpressao)).append("\n");
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

