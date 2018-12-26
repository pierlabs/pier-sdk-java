package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Telefone de escritorio para cobran\u00E7a
 **/

@ApiModel(description = "Telefone de escritorio para cobran\u00E7a")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TelefoneEscritorioCobrancaDTO   {
  
  private Long id = null;
  private String ddd = null;
  private String telefone = null;
  private String ramal = null;

  
  /**
   * Telefone escrit\u00F3rio cobranca id
   **/
  public TelefoneEscritorioCobrancaDTO id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Telefone escrit\u00F3rio cobranca id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Telefone escrit\u00F3rio cobranca ddd
   **/
  public TelefoneEscritorioCobrancaDTO ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Telefone escrit\u00F3rio cobranca ddd")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * Telefone escrit\u00F3rio cobranca telefone
   **/
  public TelefoneEscritorioCobrancaDTO telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Telefone escrit\u00F3rio cobranca telefone")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Telefone escrit\u00F3rio cobranca ramal
   **/
  public TelefoneEscritorioCobrancaDTO ramal(String ramal) {
    this.ramal = ramal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Telefone escrit\u00F3rio cobranca ramal")
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
    TelefoneEscritorioCobrancaDTO telefoneEscritorioCobrancaDTO = (TelefoneEscritorioCobrancaDTO) o;
    return Objects.equals(this.id, telefoneEscritorioCobrancaDTO.id) &&
        Objects.equals(this.ddd, telefoneEscritorioCobrancaDTO.ddd) &&
        Objects.equals(this.telefone, telefoneEscritorioCobrancaDTO.telefone) &&
        Objects.equals(this.ramal, telefoneEscritorioCobrancaDTO.ramal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ddd, telefone, ramal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoneEscritorioCobrancaDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

