package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{telefone_estabelecimento_persist_description}}}
 **/

@ApiModel(description = "{{{telefone_estabelecimento_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TelefoneEstabelecimentoPersist   {
  
  private Long idEstabelecimento = null;
  private String ddd = null;
  private String telefone = null;
  private String ramal = null;

  
  /**
   * {{{telefone_estabelecimento_persist_id_estabelecimento_value}}}
   **/
  public TelefoneEstabelecimentoPersist idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "1", required = true, value = "{{{telefone_estabelecimento_persist_id_estabelecimento_value}}}")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{telefone_estabelecimento_persist_ddd_value}}}
   **/
  public TelefoneEstabelecimentoPersist ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "83", required = true, value = "{{{telefone_estabelecimento_persist_ddd_value}}}")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{telefone_estabelecimento_persist_telefone_value}}}
   **/
  public TelefoneEstabelecimentoPersist telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "987654321", required = true, value = "{{{telefone_estabelecimento_persist_telefone_value}}}")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{telefone_estabelecimento_persist_ramal_value}}}
   **/
  public TelefoneEstabelecimentoPersist ramal(String ramal) {
    this.ramal = ramal;
    return this;
  }
  
  @ApiModelProperty(example = "1234", value = "{{{telefone_estabelecimento_persist_ramal_value}}}")
  @JsonProperty("ramal")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelefoneEstabelecimentoPersist telefoneEstabelecimentoPersist = (TelefoneEstabelecimentoPersist) o;
    return Objects.equals(this.idEstabelecimento, telefoneEstabelecimentoPersist.idEstabelecimento) &&
        Objects.equals(this.ddd, telefoneEstabelecimentoPersist.ddd) &&
        Objects.equals(this.telefone, telefoneEstabelecimentoPersist.telefone) &&
        Objects.equals(this.ramal, telefoneEstabelecimentoPersist.ramal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEstabelecimento, ddd, telefone, ramal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoneEstabelecimentoPersist {\n");
    
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    ramal: ").append(toIndentedString(ramal)).append("\n");
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



