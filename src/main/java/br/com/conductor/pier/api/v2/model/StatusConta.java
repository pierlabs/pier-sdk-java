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
public class StatusConta   {
  
  private Long id = null;
  private String nome = null;
  private Integer flagAlteraLimite = null;
  private String mensagemConsultaNegada = null;
  private Integer flagPermiteNovaViaCartao = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status da Conta (id).
   **/
  public StatusConta id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status da Conta (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome atribu\u00C3\u00ADdo ao Status da Conta.
   **/
  public StatusConta nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome atribu\u00C3\u00ADdo ao Status da Conta.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o Status da Conta permite realizar a Altera\u00C3\u00A7\u00C3\u00A3o de Limites do Portador, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusConta flagAlteraLimite(Integer flagAlteraLimite) {
    this.flagAlteraLimite = flagAlteraLimite;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Par\u00C3\u00A2metro que define se o Status da Conta permite realizar a Altera\u00C3\u00A7\u00C3\u00A3o de Limites do Portador, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("flagAlteraLimite")
  public Integer getFlagAlteraLimite() {
    return flagAlteraLimite;
  }
  public void setFlagAlteraLimite(Integer flagAlteraLimite) {
    this.flagAlteraLimite = flagAlteraLimite;
  }

  
  /**
   * Apresenta o texto com o motivo que ser\u00C3\u00A1 apresentado na resposta as opera\u00C3\u00A7\u00C3\u00B5es de Listar e Consultar LimitesDisponibilidades.
   **/
  public StatusConta mensagemConsultaNegada(String mensagemConsultaNegada) {
    this.mensagemConsultaNegada = mensagemConsultaNegada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o texto com o motivo que ser\u00C3\u00A1 apresentado na resposta as opera\u00C3\u00A7\u00C3\u00B5es de Listar e Consultar LimitesDisponibilidades.")
  @JsonProperty("mensagemConsultaNegada")
  public String getMensagemConsultaNegada() {
    return mensagemConsultaNegada;
  }
  public void setMensagemConsultaNegada(String mensagemConsultaNegada) {
    this.mensagemConsultaNegada = mensagemConsultaNegada;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o Status da conta permite a solicita\u00C3\u00A7\u00C3\u00A3o de um novo cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusConta flagPermiteNovaViaCartao(Integer flagPermiteNovaViaCartao) {
    this.flagPermiteNovaViaCartao = flagPermiteNovaViaCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00C3\u00A2metro que define se o Status da conta permite a solicita\u00C3\u00A7\u00C3\u00A3o de um novo cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("flagPermiteNovaViaCartao")
  public Integer getFlagPermiteNovaViaCartao() {
    return flagPermiteNovaViaCartao;
  }
  public void setFlagPermiteNovaViaCartao(Integer flagPermiteNovaViaCartao) {
    this.flagPermiteNovaViaCartao = flagPermiteNovaViaCartao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusConta statusConta = (StatusConta) o;
    return Objects.equals(this.id, statusConta.id) &&
        Objects.equals(this.nome, statusConta.nome) &&
        Objects.equals(this.flagAlteraLimite, statusConta.flagAlteraLimite) &&
        Objects.equals(this.mensagemConsultaNegada, statusConta.mensagemConsultaNegada) &&
        Objects.equals(this.flagPermiteNovaViaCartao, statusConta.flagPermiteNovaViaCartao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, flagAlteraLimite, mensagemConsultaNegada, flagPermiteNovaViaCartao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusConta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    flagAlteraLimite: ").append(toIndentedString(flagAlteraLimite)).append("\n");
    sb.append("    mensagemConsultaNegada: ").append(toIndentedString(mensagemConsultaNegada)).append("\n");
    sb.append("    flagPermiteNovaViaCartao: ").append(toIndentedString(flagPermiteNovaViaCartao)).append("\n");
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



