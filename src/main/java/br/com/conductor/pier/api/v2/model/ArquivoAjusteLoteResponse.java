package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * {{{arquivo_ajuste_lote_response_description}}}
 **/

@ApiModel(description = "{{{arquivo_ajuste_lote_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ArquivoAjusteLoteResponse   {
  
  private Date dataProcessamento = null;
  private Long id = null;
  private Integer length = null;
  private Integer lines = null;
  private String name = null;
  private String status = null;
  private String srcName = null;

  
  /**
   **/
  public ArquivoAjusteLoteResponse dataProcessamento(Date dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataProcessamento")
  public Date getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(Date dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_id_value}}}
   **/
  public ArquivoAjusteLoteResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_ajuste_lote_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_length_value}}}
   **/
  public ArquivoAjusteLoteResponse length(Integer length) {
    this.length = length;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_ajuste_lote_response_length_value}}}")
  @JsonProperty("length")
  public Integer getLength() {
    return length;
  }
  public void setLength(Integer length) {
    this.length = length;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_lines_value}}}
   **/
  public ArquivoAjusteLoteResponse lines(Integer lines) {
    this.lines = lines;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_ajuste_lote_response_lines_value}}}")
  @JsonProperty("lines")
  public Integer getLines() {
    return lines;
  }
  public void setLines(Integer lines) {
    this.lines = lines;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_name_value}}}
   **/
  public ArquivoAjusteLoteResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_ajuste_lote_response_name_value}}}")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_status_value}}}
   **/
  public ArquivoAjusteLoteResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_ajuste_lote_response_status_value}}}")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * {{{arquivo_ajuste_lote_response_srcName_value}}}
   **/
  public ArquivoAjusteLoteResponse srcName(String srcName) {
    this.srcName = srcName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_ajuste_lote_response_srcName_value}}}")
  @JsonProperty("srcName")
  public String getSrcName() {
    return srcName;
  }
  public void setSrcName(String srcName) {
    this.srcName = srcName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArquivoAjusteLoteResponse arquivoAjusteLoteResponse = (ArquivoAjusteLoteResponse) o;
    return Objects.equals(this.dataProcessamento, arquivoAjusteLoteResponse.dataProcessamento) &&
        Objects.equals(this.id, arquivoAjusteLoteResponse.id) &&
        Objects.equals(this.length, arquivoAjusteLoteResponse.length) &&
        Objects.equals(this.lines, arquivoAjusteLoteResponse.lines) &&
        Objects.equals(this.name, arquivoAjusteLoteResponse.name) &&
        Objects.equals(this.status, arquivoAjusteLoteResponse.status) &&
        Objects.equals(this.srcName, arquivoAjusteLoteResponse.srcName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataProcessamento, id, length, lines, name, status, srcName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoAjusteLoteResponse {\n");
    
    sb.append("    dataProcessamento: ").append(toIndentedString(dataProcessamento)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    srcName: ").append(toIndentedString(srcName)).append("\n");
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



