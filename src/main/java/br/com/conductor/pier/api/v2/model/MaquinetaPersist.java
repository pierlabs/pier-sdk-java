package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto Maquineta
 **/

@ApiModel(description = "Objeto Maquineta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class MaquinetaPersist   {
  
  private Long idTerminal = null;
  private Long idTipoMaquineta = null;
  private BigDecimal valor = null;
  private String dataHoraImplantacao = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id).
   **/
  public MaquinetaPersist idTerminal(Long idTerminal) {
    this.idTerminal = idTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "11111", required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id).")
  @JsonProperty("idTerminal")
  public Long getIdTerminal() {
    return idTerminal;
  }
  public void setIdTerminal(Long idTerminal) {
    this.idTerminal = idTerminal;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo Maquineta (id).
   **/
  public MaquinetaPersist idTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
    return this;
  }
  
  @ApiModelProperty(example = "1", required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo Maquineta (id).")
  @JsonProperty("idTipoMaquineta")
  public Long getIdTipoMaquineta() {
    return idTipoMaquineta;
  }
  public void setIdTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
  }

  
  /**
   * Valor de Manuten\u00E7\u00E3o da Maquineta.
   **/
  public MaquinetaPersist valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "100.0", required = true, value = "Valor de Manuten\u00E7\u00E3o da Maquineta.")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Data da implanta\u00E7\u00E3o da Maquineta, inserir no formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
   **/
  public MaquinetaPersist dataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", required = true, value = "Data da implanta\u00E7\u00E3o da Maquineta, inserir no formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.")
  @JsonProperty("dataHoraImplantacao")
  public String getDataHoraImplantacao() {
    return dataHoraImplantacao;
  }
  public void setDataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaquinetaPersist maquinetaPersist = (MaquinetaPersist) o;
    return Objects.equals(this.idTerminal, maquinetaPersist.idTerminal) &&
        Objects.equals(this.idTipoMaquineta, maquinetaPersist.idTipoMaquineta) &&
        Objects.equals(this.valor, maquinetaPersist.valor) &&
        Objects.equals(this.dataHoraImplantacao, maquinetaPersist.dataHoraImplantacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTerminal, idTipoMaquineta, valor, dataHoraImplantacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaquinetaPersist {\n");
    
    sb.append("    idTerminal: ").append(toIndentedString(idTerminal)).append("\n");
    sb.append("    idTipoMaquineta: ").append(toIndentedString(idTipoMaquineta)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    dataHoraImplantacao: ").append(toIndentedString(dataHoraImplantacao)).append("\n");
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

