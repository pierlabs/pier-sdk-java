package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * POS response object
 **/

@ApiModel(description = "POS response object")
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
   * Identification Code of the Card Machine
   **/
  public MaquinetaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Card Machine")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Merchant
   **/
  public MaquinetaResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Merchant")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Identification Code of the Card Machine
   **/
  public MaquinetaResponse idTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Card Machine")
  @JsonProperty("idTipoMaquineta")
  public Long getIdTipoMaquineta() {
    return idTipoMaquineta;
  }
  public void setIdTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
  }

  
  /**
   * Maintenance valeu of the card machine
   **/
  public MaquinetaResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maintenance valeu of the card machine")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Deployment date of the card machine
   **/
  public MaquinetaResponse dataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Deployment date of the card machine")
  @JsonProperty("dataHoraImplantacao")
  public String getDataHoraImplantacao() {
    return dataHoraImplantacao;
  }
  public void setDataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
  }

  
  /**
   * Registerment date of the Card Machine
   **/
  public MaquinetaResponse dataHoraCadastramento(String dataHoraCadastramento) {
    this.dataHoraCadastramento = dataHoraCadastramento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Registerment date of the Card Machine")
  @JsonProperty("dataHoraCadastramento")
  public String getDataHoraCadastramento() {
    return dataHoraCadastramento;
  }
  public void setDataHoraCadastramento(String dataHoraCadastramento) {
    this.dataHoraCadastramento = dataHoraCadastramento;
  }

  
  /**
   * Terminal number linked to the card machine
   **/
  public MaquinetaResponse terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Terminal number linked to the card machine")
  @JsonProperty("terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * User of the application
   **/
  public MaquinetaResponse usuarioApl(String usuarioApl) {
    this.usuarioApl = usuarioApl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User of the application")
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

