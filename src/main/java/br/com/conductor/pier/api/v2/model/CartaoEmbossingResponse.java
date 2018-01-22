package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Cart\u00C3\u00A3o para Impress\u00C3\u00A3o pela Gr\u00C3\u00A1fica
 **/

@ApiModel(description = "Objeto Cart\u00C3\u00A3o para Impress\u00C3\u00A3o pela Gr\u00C3\u00A1fica")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoEmbossingResponse   {
  
  private Integer flagVirtual = null;
  private Long idConta = null;
  private Long idPessoa = null;
  private Long idCartao = null;
  private Long idBandeira = null;
  private Long idTipoCartao = null;
  private String dataGeracao = null;
  private String dataValidade = null;
  private String nomeOrigemComercial = null;
  private String cpf = null;

  
  /**
   * Apresenta o status que informa se o cart\u00C3\u00A3o \u00C3\u00A9 virtual 
   **/
  public CartaoEmbossingResponse flagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o status que informa se o cart\u00C3\u00A3o \u00C3\u00A9 virtual ")
  @JsonProperty("flagVirtual")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id) a qual o cart\u00C3\u00A3o gerado pertence.
   **/
  public CartaoEmbossingResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id) a qual o cart\u00C3\u00A3o gerado pertence.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id) portadora do cart\u00C3\u00A3o gerado.
   **/
  public CartaoEmbossingResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id) portadora do cart\u00C3\u00A3o gerado.")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id) que foi gerado.
   **/
  public CartaoEmbossingResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id) que foi gerado.")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Bandeira (id) a qual o Cart\u00C3\u00A3o pertence, quando bandeirado.
   **/
  public CartaoEmbossingResponse idBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Bandeira (id) a qual o Cart\u00C3\u00A3o pertence, quando bandeirado.")
  @JsonProperty("idBandeira")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Cart\u00C3\u00A3o (id) atribu\u00C3\u00ADdo ao Cart\u00C3\u00A3o.
   **/
  public CartaoEmbossingResponse idTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Cart\u00C3\u00A3o (id) atribu\u00C3\u00ADdo ao Cart\u00C3\u00A3o.")
  @JsonProperty("idTipoCartao")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * Apresenta a data de emiss\u00C3\u00A3o do Cart\u00C3\u00A3o.
   **/
  public CartaoEmbossingResponse dataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data de emiss\u00C3\u00A3o do Cart\u00C3\u00A3o.")
  @JsonProperty("dataGeracao")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * Apresenta a data de Validade do Cart\u00C3\u00A3o.
   **/
  public CartaoEmbossingResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data de Validade do Cart\u00C3\u00A3o.")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Apresenta o nome da Origem Comercial que realizou o cadastro do Titular da Conta a qual o Cart\u00C3\u00A3o pertence.
   **/
  public CartaoEmbossingResponse nomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da Origem Comercial que realizou o cadastro do Titular da Conta a qual o Cart\u00C3\u00A3o pertence.")
  @JsonProperty("nomeOrigemComercial")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * Apresenta o CPF do Portador do Cart\u00C3\u00A3o.
   **/
  public CartaoEmbossingResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o CPF do Portador do Cart\u00C3\u00A3o.")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoEmbossingResponse cartaoEmbossingResponse = (CartaoEmbossingResponse) o;
    return Objects.equals(this.flagVirtual, cartaoEmbossingResponse.flagVirtual) &&
        Objects.equals(this.idConta, cartaoEmbossingResponse.idConta) &&
        Objects.equals(this.idPessoa, cartaoEmbossingResponse.idPessoa) &&
        Objects.equals(this.idCartao, cartaoEmbossingResponse.idCartao) &&
        Objects.equals(this.idBandeira, cartaoEmbossingResponse.idBandeira) &&
        Objects.equals(this.idTipoCartao, cartaoEmbossingResponse.idTipoCartao) &&
        Objects.equals(this.dataGeracao, cartaoEmbossingResponse.dataGeracao) &&
        Objects.equals(this.dataValidade, cartaoEmbossingResponse.dataValidade) &&
        Objects.equals(this.nomeOrigemComercial, cartaoEmbossingResponse.nomeOrigemComercial) &&
        Objects.equals(this.cpf, cartaoEmbossingResponse.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagVirtual, idConta, idPessoa, idCartao, idBandeira, idTipoCartao, dataGeracao, dataValidade, nomeOrigemComercial, cpf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoEmbossingResponse {\n");
    
    sb.append("    flagVirtual: ").append(toIndentedString(flagVirtual)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idBandeira: ").append(toIndentedString(idBandeira)).append("\n");
    sb.append("    idTipoCartao: ").append(toIndentedString(idTipoCartao)).append("\n");
    sb.append("    dataGeracao: ").append(toIndentedString(dataGeracao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    nomeOrigemComercial: ").append(toIndentedString(nomeOrigemComercial)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
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

