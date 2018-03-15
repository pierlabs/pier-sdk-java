package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Status Conta
 **/

@ApiModel(description = "Status Conta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusContaResponse   {
  
  private Long id = null;
  private String nome = null;
  private Integer permiteAlterarVencimento = null;
  private Integer permiteAlterarLimite = null;
  private Integer permiteEmitirNovaViaCartao = null;
  private Integer permiteFazerTransferencia = null;
  private Integer permiteReceberTransferencia = null;
  private Integer permiteCriarAcordoCobranca = null;
  private Integer permiteAtribuirComoBloqueio = null;
  private Integer permiteDesbloquear = null;
  private Integer permiteAtribuirComoCancelamento = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Status da Conta (id).
   **/
  public StatusContaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Status da Conta (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome atribu\u00EDdo ao Status da Conta.
   **/
  public StatusContaResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome atribu\u00EDdo ao Status da Conta.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite a solicita\u00E7\u00E3o da altera\u00E7\u00E3o do Dia para Vencimento das Faturas, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusContaResponse permiteAlterarVencimento(Integer permiteAlterarVencimento) {
    this.permiteAlterarVencimento = permiteAlterarVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o Status da conta permite a solicita\u00E7\u00E3o da altera\u00E7\u00E3o do Dia para Vencimento das Faturas, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteAlterarVencimento")
  public Integer getPermiteAlterarVencimento() {
    return permiteAlterarVencimento;
  }
  public void setPermiteAlterarVencimento(Integer permiteAlterarVencimento) {
    this.permiteAlterarVencimento = permiteAlterarVencimento;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite altera\u00E7\u00E3o de Limites, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusContaResponse permiteAlterarLimite(Integer permiteAlterarLimite) {
    this.permiteAlterarLimite = permiteAlterarLimite;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o Status da conta permite altera\u00E7\u00E3o de Limites, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteAlterarLimite")
  public Integer getPermiteAlterarLimite() {
    return permiteAlterarLimite;
  }
  public void setPermiteAlterarLimite(Integer permiteAlterarLimite) {
    this.permiteAlterarLimite = permiteAlterarLimite;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite solicitar uma nova via de Cart\u00E3o, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusContaResponse permiteEmitirNovaViaCartao(Integer permiteEmitirNovaViaCartao) {
    this.permiteEmitirNovaViaCartao = permiteEmitirNovaViaCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o Status da conta permite solicitar uma nova via de Cart\u00E3o, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteEmitirNovaViaCartao")
  public Integer getPermiteEmitirNovaViaCartao() {
    return permiteEmitirNovaViaCartao;
  }
  public void setPermiteEmitirNovaViaCartao(Integer permiteEmitirNovaViaCartao) {
    this.permiteEmitirNovaViaCartao = permiteEmitirNovaViaCartao;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite originar Transfer\u00EAncias de Cr\u00E9dito para outras Contas do mesmo Emissor ou para uma Conta Banc\u00E1ria, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusContaResponse permiteFazerTransferencia(Integer permiteFazerTransferencia) {
    this.permiteFazerTransferencia = permiteFazerTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o Status da conta permite originar Transfer\u00EAncias de Cr\u00E9dito para outras Contas do mesmo Emissor ou para uma Conta Banc\u00E1ria, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteFazerTransferencia")
  public Integer getPermiteFazerTransferencia() {
    return permiteFazerTransferencia;
  }
  public void setPermiteFazerTransferencia(Integer permiteFazerTransferencia) {
    this.permiteFazerTransferencia = permiteFazerTransferencia;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite  receber Transfer\u00EAncias de Cr\u00E9dito originadas de outras Contas do mesmo emissor, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusContaResponse permiteReceberTransferencia(Integer permiteReceberTransferencia) {
    this.permiteReceberTransferencia = permiteReceberTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o Status da conta permite  receber Transfer\u00EAncias de Cr\u00E9dito originadas de outras Contas do mesmo emissor, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteReceberTransferencia")
  public Integer getPermiteReceberTransferencia() {
    return permiteReceberTransferencia;
  }
  public void setPermiteReceberTransferencia(Integer permiteReceberTransferencia) {
    this.permiteReceberTransferencia = permiteReceberTransferencia;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite ter um Acordo de Cobran\u00E7a de D\u00EDvida criado para ela, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusContaResponse permiteCriarAcordoCobranca(Integer permiteCriarAcordoCobranca) {
    this.permiteCriarAcordoCobranca = permiteCriarAcordoCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o Status da conta permite ter um Acordo de Cobran\u00E7a de D\u00EDvida criado para ela, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteCriarAcordoCobranca")
  public Integer getPermiteCriarAcordoCobranca() {
    return permiteCriarAcordoCobranca;
  }
  public void setPermiteCriarAcordoCobranca(Integer permiteCriarAcordoCobranca) {
    this.permiteCriarAcordoCobranca = permiteCriarAcordoCobranca;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para Bloquear temporariamente uma Conta, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusContaResponse permiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para Bloquear temporariamente uma Conta, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteAtribuirComoBloqueio")
  public Integer getPermiteAtribuirComoBloqueio() {
    return permiteAtribuirComoBloqueio;
  }
  public void setPermiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite ser desbloqueada, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusContaResponse permiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o Status da conta permite ser desbloqueada, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteDesbloquear")
  public Integer getPermiteDesbloquear() {
    return permiteDesbloquear;
  }
  public void setPermiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
  }

  
  /**
   * Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para realizar o cancelamento definitivo de uma conta, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusContaResponse permiteAtribuirComoCancelamento(Integer permiteAtribuirComoCancelamento) {
    this.permiteAtribuirComoCancelamento = permiteAtribuirComoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para realizar o cancelamento definitivo de uma conta, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteAtribuirComoCancelamento")
  public Integer getPermiteAtribuirComoCancelamento() {
    return permiteAtribuirComoCancelamento;
  }
  public void setPermiteAtribuirComoCancelamento(Integer permiteAtribuirComoCancelamento) {
    this.permiteAtribuirComoCancelamento = permiteAtribuirComoCancelamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusContaResponse statusContaResponse = (StatusContaResponse) o;
    return Objects.equals(this.id, statusContaResponse.id) &&
        Objects.equals(this.nome, statusContaResponse.nome) &&
        Objects.equals(this.permiteAlterarVencimento, statusContaResponse.permiteAlterarVencimento) &&
        Objects.equals(this.permiteAlterarLimite, statusContaResponse.permiteAlterarLimite) &&
        Objects.equals(this.permiteEmitirNovaViaCartao, statusContaResponse.permiteEmitirNovaViaCartao) &&
        Objects.equals(this.permiteFazerTransferencia, statusContaResponse.permiteFazerTransferencia) &&
        Objects.equals(this.permiteReceberTransferencia, statusContaResponse.permiteReceberTransferencia) &&
        Objects.equals(this.permiteCriarAcordoCobranca, statusContaResponse.permiteCriarAcordoCobranca) &&
        Objects.equals(this.permiteAtribuirComoBloqueio, statusContaResponse.permiteAtribuirComoBloqueio) &&
        Objects.equals(this.permiteDesbloquear, statusContaResponse.permiteDesbloquear) &&
        Objects.equals(this.permiteAtribuirComoCancelamento, statusContaResponse.permiteAtribuirComoCancelamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, permiteAlterarVencimento, permiteAlterarLimite, permiteEmitirNovaViaCartao, permiteFazerTransferencia, permiteReceberTransferencia, permiteCriarAcordoCobranca, permiteAtribuirComoBloqueio, permiteDesbloquear, permiteAtribuirComoCancelamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusContaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    permiteAlterarVencimento: ").append(toIndentedString(permiteAlterarVencimento)).append("\n");
    sb.append("    permiteAlterarLimite: ").append(toIndentedString(permiteAlterarLimite)).append("\n");
    sb.append("    permiteEmitirNovaViaCartao: ").append(toIndentedString(permiteEmitirNovaViaCartao)).append("\n");
    sb.append("    permiteFazerTransferencia: ").append(toIndentedString(permiteFazerTransferencia)).append("\n");
    sb.append("    permiteReceberTransferencia: ").append(toIndentedString(permiteReceberTransferencia)).append("\n");
    sb.append("    permiteCriarAcordoCobranca: ").append(toIndentedString(permiteCriarAcordoCobranca)).append("\n");
    sb.append("    permiteAtribuirComoBloqueio: ").append(toIndentedString(permiteAtribuirComoBloqueio)).append("\n");
    sb.append("    permiteDesbloquear: ").append(toIndentedString(permiteDesbloquear)).append("\n");
    sb.append("    permiteAtribuirComoCancelamento: ").append(toIndentedString(permiteAtribuirComoCancelamento)).append("\n");
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

