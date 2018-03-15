package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o do recurso Status Cart\u00E3o
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do recurso Status Cart\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusCartaoResponse   {
  
  private Long id = null;
  private String nome = null;
  private Integer permiteDesbloquear = null;
  private Integer permiteAtribuirComoBloqueio = null;
  private Integer permiteAtribuirComoCancelamento = null;
  private Integer cobrarTarifaAoEmitirNovaVia = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Status do Cart\u00E3o (id) 
   **/
  public StatusCartaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Status do Cart\u00E3o (id) ")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome atribu\u00EDdo ao Status de Entrega do Cart\u00E3o.
   **/
  public StatusCartaoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome atribu\u00EDdo ao Status de Entrega do Cart\u00E3o.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusCartaoResponse permiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteDesbloquear")
  public Integer getPermiteDesbloquear() {
    return permiteDesbloquear;
  }
  public void setPermiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
  }

  
  /**
   * Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusCartaoResponse permiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteAtribuirComoBloqueio")
  public Integer getPermiteAtribuirComoBloqueio() {
    return permiteAtribuirComoBloqueio;
  }
  public void setPermiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
  }

  
  /**
   * Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusCartaoResponse permiteAtribuirComoCancelamento(Integer permiteAtribuirComoCancelamento) {
    this.permiteAtribuirComoCancelamento = permiteAtribuirComoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.")
  @JsonProperty("permiteAtribuirComoCancelamento")
  public Integer getPermiteAtribuirComoCancelamento() {
    return permiteAtribuirComoCancelamento;
  }
  public void setPermiteAtribuirComoCancelamento(Integer permiteAtribuirComoCancelamento) {
    this.permiteAtribuirComoCancelamento = permiteAtribuirComoCancelamento;
  }

  
  /**
   * Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.
   **/
  public StatusCartaoResponse cobrarTarifaAoEmitirNovaVia(Integer cobrarTarifaAoEmitirNovaVia) {
    this.cobrarTarifaAoEmitirNovaVia = cobrarTarifaAoEmitirNovaVia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.")
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

