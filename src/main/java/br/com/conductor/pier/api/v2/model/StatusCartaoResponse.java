package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{status_cartao_response_description}}}
 **/

@ApiModel(description = "{{{status_cartao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusCartaoResponse   {
  
  private Long id = null;
  private String nome = null;
  private Integer permiteDesbloquear = null;
  private Integer permiteAtribuirComoBloqueio = null;
  private Integer permiteAtribuirComoCancelamento = null;
  private Integer cobrarTarifaAoEmitirNovaVia = null;

  
  /**
   * {{{status_cartao_response_id_value}}}
   **/
  public StatusCartaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{status_cartao_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{status_cartao_response_nome_value}}}
   **/
  public StatusCartaoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{status_cartao_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{status_cartao_response_permite_desbloquear_value}}}
   **/
  public StatusCartaoResponse permiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_cartao_response_permite_desbloquear_value}}}")
  @JsonProperty("permiteDesbloquear")
  public Integer getPermiteDesbloquear() {
    return permiteDesbloquear;
  }
  public void setPermiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
  }

  
  /**
   * {{{status_cartao_response_permite_atribuir_como_bloqueio_value}}}
   **/
  public StatusCartaoResponse permiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_cartao_response_permite_atribuir_como_bloqueio_value}}}")
  @JsonProperty("permiteAtribuirComoBloqueio")
  public Integer getPermiteAtribuirComoBloqueio() {
    return permiteAtribuirComoBloqueio;
  }
  public void setPermiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
  }

  
  /**
   * {{{status_cartao_response_permite_atribuir_como_cancelamento_value}}}
   **/
  public StatusCartaoResponse permiteAtribuirComoCancelamento(Integer permiteAtribuirComoCancelamento) {
    this.permiteAtribuirComoCancelamento = permiteAtribuirComoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_cartao_response_permite_atribuir_como_cancelamento_value}}}")
  @JsonProperty("permiteAtribuirComoCancelamento")
  public Integer getPermiteAtribuirComoCancelamento() {
    return permiteAtribuirComoCancelamento;
  }
  public void setPermiteAtribuirComoCancelamento(Integer permiteAtribuirComoCancelamento) {
    this.permiteAtribuirComoCancelamento = permiteAtribuirComoCancelamento;
  }

  
  /**
   * {{{status_cartao_response_cobrar_tarifa_ao_emitir_nova_via_value}}}
   **/
  public StatusCartaoResponse cobrarTarifaAoEmitirNovaVia(Integer cobrarTarifaAoEmitirNovaVia) {
    this.cobrarTarifaAoEmitirNovaVia = cobrarTarifaAoEmitirNovaVia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_cartao_response_cobrar_tarifa_ao_emitir_nova_via_value}}}")
  @JsonProperty("cobrarTarifaAoEmitirNovaVia")
  public Integer getCobrarTarifaAoEmitirNovaVia() {
    return cobrarTarifaAoEmitirNovaVia;
  }
  public void setCobrarTarifaAoEmitirNovaVia(Integer cobrarTarifaAoEmitirNovaVia) {
    this.cobrarTarifaAoEmitirNovaVia = cobrarTarifaAoEmitirNovaVia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCartaoResponse statusCartaoResponse = (StatusCartaoResponse) o;
    return Objects.equals(this.id, statusCartaoResponse.id) &&
        Objects.equals(this.nome, statusCartaoResponse.nome) &&
        Objects.equals(this.permiteDesbloquear, statusCartaoResponse.permiteDesbloquear) &&
        Objects.equals(this.permiteAtribuirComoBloqueio, statusCartaoResponse.permiteAtribuirComoBloqueio) &&
        Objects.equals(this.permiteAtribuirComoCancelamento, statusCartaoResponse.permiteAtribuirComoCancelamento) &&
        Objects.equals(this.cobrarTarifaAoEmitirNovaVia, statusCartaoResponse.cobrarTarifaAoEmitirNovaVia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, permiteDesbloquear, permiteAtribuirComoBloqueio, permiteAtribuirComoCancelamento, cobrarTarifaAoEmitirNovaVia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCartaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    permiteDesbloquear: ").append(toIndentedString(permiteDesbloquear)).append("\n");
    sb.append("    permiteAtribuirComoBloqueio: ").append(toIndentedString(permiteAtribuirComoBloqueio)).append("\n");
    sb.append("    permiteAtribuirComoCancelamento: ").append(toIndentedString(permiteAtribuirComoCancelamento)).append("\n");
    sb.append("    cobrarTarifaAoEmitirNovaVia: ").append(toIndentedString(cobrarTarifaAoEmitirNovaVia)).append("\n");
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



