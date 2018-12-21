package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{consulta_cadastro_estabelecimento_d_t_o_description}}}
 **/

@ApiModel(description = "{{{consulta_cadastro_estabelecimento_d_t_o_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConsultaCadastroEstabelecimentoDTO   {
  
  private String dataHoraConsulta = null;


  public enum StatusEnum {
    OK("OK"),
    NOK("NOK");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;


  public enum TipoEntidadeEnum {
    ATIVO("ATIVO"),
    BLOQUEADO("BLOQUEADO");

    private String value;

    TipoEntidadeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoEntidadeEnum tipoEntidade = null;

  
  /**
   * {{{consulta_cadastro_estabelecimento_d_t_o_data_hora_consulta_value}}}
   **/
  public ConsultaCadastroEstabelecimentoDTO dataHoraConsulta(String dataHoraConsulta) {
    this.dataHoraConsulta = dataHoraConsulta;
    return this;
  }
  
  @ApiModelProperty(example = "2018-03-02T14:02:33.824Z", value = "{{{consulta_cadastro_estabelecimento_d_t_o_data_hora_consulta_value}}}")
  @JsonProperty("dataHoraConsulta")
  public String getDataHoraConsulta() {
    return dataHoraConsulta;
  }
  public void setDataHoraConsulta(String dataHoraConsulta) {
    this.dataHoraConsulta = dataHoraConsulta;
  }

  
  /**
   * {{{consulta_cadastro_estabelecimento_d_t_o_status_value}}}
   **/
  public ConsultaCadastroEstabelecimentoDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{consulta_cadastro_estabelecimento_d_t_o_status_value}}}")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{consulta_cadastro_estabelecimento_d_t_o_tipo_entidade_value}}}
   **/
  public ConsultaCadastroEstabelecimentoDTO tipoEntidade(TipoEntidadeEnum tipoEntidade) {
    this.tipoEntidade = tipoEntidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{consulta_cadastro_estabelecimento_d_t_o_tipo_entidade_value}}}")
  @JsonProperty("tipoEntidade")
  public TipoEntidadeEnum getTipoEntidade() {
    return tipoEntidade;
  }
  public void setTipoEntidade(TipoEntidadeEnum tipoEntidade) {
    this.tipoEntidade = tipoEntidade;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaCadastroEstabelecimentoDTO consultaCadastroEstabelecimentoDTO = (ConsultaCadastroEstabelecimentoDTO) o;
    return Objects.equals(this.dataHoraConsulta, consultaCadastroEstabelecimentoDTO.dataHoraConsulta) &&
        Objects.equals(this.status, consultaCadastroEstabelecimentoDTO.status) &&
        Objects.equals(this.tipoEntidade, consultaCadastroEstabelecimentoDTO.tipoEntidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataHoraConsulta, status, tipoEntidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaCadastroEstabelecimentoDTO {\n");
    
    sb.append("    dataHoraConsulta: ").append(toIndentedString(dataHoraConsulta)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tipoEntidade: ").append(toIndentedString(tipoEntidade)).append("\n");
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

