package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Est\u00C3\u00A1gio Cart\u00C3\u00A3o
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Est\u00C3\u00A1gio Cart\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EstgioCarto   {
  
  private String cancelaConta = null;
  private Long id = null;
  private Long idStatusDestinoDesbloqueio = null;
  private String nome = null;
  private String permiteDesbloqueio = null;

  
  /**
   * Indica que Cart\u00C3\u00B5es com este idStatusCartao devem ter a sua conta Cancelada, sendo: (0 = N\u00C3\u00A3o Cancelar) e  (1 = Cancelar Conta).
   **/
  public EstgioCarto cancelaConta(String cancelaConta) {
    this.cancelaConta = cancelaConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica que Cart\u00C3\u00B5es com este idStatusCartao devem ter a sua conta Cancelada, sendo: (0 = N\u00C3\u00A3o Cancelar) e  (1 = Cancelar Conta).")
  @JsonProperty("cancelaConta")
  public String getCancelaConta() {
    return cancelaConta;
  }
  public void setCancelaConta(String cancelaConta) {
    this.cancelaConta = cancelaConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).
   **/
  public EstgioCarto id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Indica qual o idStatusCartao que deve ser atribu\u00C3\u00ADdo a um idCartao quando ele for desbloqueado.
   **/
  public EstgioCarto idStatusDestinoDesbloqueio(Long idStatusDestinoDesbloqueio) {
    this.idStatusDestinoDesbloqueio = idStatusDestinoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica qual o idStatusCartao que deve ser atribu\u00C3\u00ADdo a um idCartao quando ele for desbloqueado.")
  @JsonProperty("idStatusDestinoDesbloqueio")
  public Long getIdStatusDestinoDesbloqueio() {
    return idStatusDestinoDesbloqueio;
  }
  public void setIdStatusDestinoDesbloqueio(Long idStatusDestinoDesbloqueio) {
    this.idStatusDestinoDesbloqueio = idStatusDestinoDesbloqueio;
  }

  
  /**
   * Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.
   **/
  public EstgioCarto nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Indica que Cart\u00C3\u00B5es com este idStatusCartao podem ser Desbloqueados, sendo: (0 = N\u00C3\u00A3o Permitido) e  (1 = Permitido).
   **/
  public EstgioCarto permiteDesbloqueio(String permiteDesbloqueio) {
    this.permiteDesbloqueio = permiteDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica que Cart\u00C3\u00B5es com este idStatusCartao podem ser Desbloqueados, sendo: (0 = N\u00C3\u00A3o Permitido) e  (1 = Permitido).")
  @JsonProperty("permiteDesbloqueio")
  public String getPermiteDesbloqueio() {
    return permiteDesbloqueio;
  }
  public void setPermiteDesbloqueio(String permiteDesbloqueio) {
    this.permiteDesbloqueio = permiteDesbloqueio;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstgioCarto estgioCarto = (EstgioCarto) o;
    return Objects.equals(this.cancelaConta, estgioCarto.cancelaConta) &&
        Objects.equals(this.id, estgioCarto.id) &&
        Objects.equals(this.idStatusDestinoDesbloqueio, estgioCarto.idStatusDestinoDesbloqueio) &&
        Objects.equals(this.nome, estgioCarto.nome) &&
        Objects.equals(this.permiteDesbloqueio, estgioCarto.permiteDesbloqueio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelaConta, id, idStatusDestinoDesbloqueio, nome, permiteDesbloqueio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstgioCarto {\n");
    
    sb.append("    cancelaConta: ").append(toIndentedString(cancelaConta)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idStatusDestinoDesbloqueio: ").append(toIndentedString(idStatusDestinoDesbloqueio)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    permiteDesbloqueio: ").append(toIndentedString(permiteDesbloqueio)).append("\n");
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



