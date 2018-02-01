package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de Resposta de Maquineta
 **/

@ApiModel(description = "Objeto de Resposta de Maquineta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class MaquinetaResponse   {
  
  private Long id = null;
  private Long idEstabelecimento = null;
  private Long idTipoMaquineta = null;
  private BigDecimal valor = null;
  private String dataHoraImplantacao = null;
  private String dataHoraCadastramento = null;
  private String terminal = null;
  private String usuarioApl = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Maquineta.
   **/
  public MaquinetaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Maquineta.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do EStabelecimento.
   **/
  public MaquinetaResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do EStabelecimento.")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo Maquineta.
   **/
  public MaquinetaResponse idTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo Maquineta.")
  @JsonProperty("idTipoMaquineta")
  public Long getIdTipoMaquineta() {
    return idTipoMaquineta;
  }
  public void setIdTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
  }

  
  /**
   * Valor de manuten\u00C3\u00A7\u00C3\u00A3o da Maquineta.
   **/
  public MaquinetaResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de manuten\u00C3\u00A7\u00C3\u00A3o da Maquineta.")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Data de implanta\u00C3\u00A7\u00C3\u00A3o da Maquineta.
   **/
  public MaquinetaResponse dataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de implanta\u00C3\u00A7\u00C3\u00A3o da Maquineta.")
  @JsonProperty("dataHoraImplantacao")
  public String getDataHoraImplantacao() {
    return dataHoraImplantacao;
  }
  public void setDataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
  }

  
  /**
   * Data de cadastramento da Maquineta.
   **/
  public MaquinetaResponse dataHoraCadastramento(String dataHoraCadastramento) {
    this.dataHoraCadastramento = dataHoraCadastramento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de cadastramento da Maquineta.")
  @JsonProperty("dataHoraCadastramento")
  public String getDataHoraCadastramento() {
    return dataHoraCadastramento;
  }
  public void setDataHoraCadastramento(String dataHoraCadastramento) {
    this.dataHoraCadastramento = dataHoraCadastramento;
  }

  
  /**
   * N\u00C3\u00BAmero do terminal vinculado a Maquineta.
   **/
  public MaquinetaResponse terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do terminal vinculado a Maquineta.")
  @JsonProperty("terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * Usu\u00C3\u00A1rio da aplica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public MaquinetaResponse usuarioApl(String usuarioApl) {
    this.usuarioApl = usuarioApl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Usu\u00C3\u00A1rio da aplica\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("usuarioApl")
  public String getUsuarioApl() {
    return usuarioApl;
  }
  public void setUsuarioApl(String usuarioApl) {
    this.usuarioApl = usuarioApl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaquinetaResponse maquinetaResponse = (MaquinetaResponse) o;
    return Objects.equals(this.id, maquinetaResponse.id) &&
        Objects.equals(this.idEstabelecimento, maquinetaResponse.idEstabelecimento) &&
        Objects.equals(this.idTipoMaquineta, maquinetaResponse.idTipoMaquineta) &&
        Objects.equals(this.valor, maquinetaResponse.valor) &&
        Objects.equals(this.dataHoraImplantacao, maquinetaResponse.dataHoraImplantacao) &&
        Objects.equals(this.dataHoraCadastramento, maquinetaResponse.dataHoraCadastramento) &&
        Objects.equals(this.terminal, maquinetaResponse.terminal) &&
        Objects.equals(this.usuarioApl, maquinetaResponse.usuarioApl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idEstabelecimento, idTipoMaquineta, valor, dataHoraImplantacao, dataHoraCadastramento, terminal, usuarioApl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaquinetaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idTipoMaquineta: ").append(toIndentedString(idTipoMaquineta)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    dataHoraImplantacao: ").append(toIndentedString(dataHoraImplantacao)).append("\n");
    sb.append("    dataHoraCadastramento: ").append(toIndentedString(dataHoraCadastramento)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    usuarioApl: ").append(toIndentedString(usuarioApl)).append("\n");
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

