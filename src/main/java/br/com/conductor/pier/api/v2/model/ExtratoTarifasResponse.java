package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.DetalhesExtratoTarifasResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto Response do extrato de tarifas
 **/

@ApiModel(description = "Objeto Response do extrato de tarifas")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ExtratoTarifasResponse   {
  
  private Long idConta = null;
  private String nome = null;
  private String email = null;
  private List<DetalhesExtratoTarifasResponse> detalhes = new ArrayList<DetalhesExtratoTarifasResponse>();

  
  /**
   * Identificador da conta
   **/
  public ExtratoTarifasResponse idConta(Long idConta) {
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
   * Nome do titular da conta
   **/
  public ExtratoTarifasResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do titular da conta")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Endere\u00E7o de e-mail do titular da conta
   **/
  public ExtratoTarifasResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Endere\u00E7o de e-mail do titular da conta")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Lista de detalhes das tarifas
   **/
  public ExtratoTarifasResponse detalhes(List<DetalhesExtratoTarifasResponse> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de detalhes das tarifas")
  @JsonProperty("detalhes")
  public List<DetalhesExtratoTarifasResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<DetalhesExtratoTarifasResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtratoTarifasResponse extratoTarifasResponse = (ExtratoTarifasResponse) o;
    return Objects.equals(this.idConta, extratoTarifasResponse.idConta) &&
        Objects.equals(this.nome, extratoTarifasResponse.nome) &&
        Objects.equals(this.email, extratoTarifasResponse.email) &&
        Objects.equals(this.detalhes, extratoTarifasResponse.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, nome, email, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtratoTarifasResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
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

