package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto que representa os dados persistido da suspeita de fraude
 **/

@ApiModel(description = "Objeto que representa os dados persistido da suspeita de fraude")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SuspeitaFraudePersist   {
  
  private Long idMotivoFraude = null;
  private Long idPessoa = null;
  private String dataHoraSuspeitaFraude = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do motivo da suspeita de fraude
   **/
  public SuspeitaFraudePersist idMotivoFraude(Long idMotivoFraude) {
    this.idMotivoFraude = idMotivoFraude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do motivo da suspeita de fraude")
  @JsonProperty("idMotivoFraude")
  public Long getIdMotivoFraude() {
    return idMotivoFraude;
  }
  public void setIdMotivoFraude(Long idMotivoFraude) {
    this.idMotivoFraude = idMotivoFraude;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da pessoa com suspeita de fraude
   **/
  public SuspeitaFraudePersist idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da pessoa com suspeita de fraude")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Data e hora em que foi identificado a suspeita de fraude
   **/
  public SuspeitaFraudePersist dataHoraSuspeitaFraude(String dataHoraSuspeitaFraude) {
    this.dataHoraSuspeitaFraude = dataHoraSuspeitaFraude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora em que foi identificado a suspeita de fraude")
  @JsonProperty("dataHoraSuspeitaFraude")
  public String getDataHoraSuspeitaFraude() {
    return dataHoraSuspeitaFraude;
  }
  public void setDataHoraSuspeitaFraude(String dataHoraSuspeitaFraude) {
    this.dataHoraSuspeitaFraude = dataHoraSuspeitaFraude;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuspeitaFraudePersist suspeitaFraudePersist = (SuspeitaFraudePersist) o;
    return Objects.equals(this.idMotivoFraude, suspeitaFraudePersist.idMotivoFraude) &&
        Objects.equals(this.idPessoa, suspeitaFraudePersist.idPessoa) &&
        Objects.equals(this.dataHoraSuspeitaFraude, suspeitaFraudePersist.dataHoraSuspeitaFraude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idMotivoFraude, idPessoa, dataHoraSuspeitaFraude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuspeitaFraudePersist {\n");
    
    sb.append("    idMotivoFraude: ").append(toIndentedString(idMotivoFraude)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    dataHoraSuspeitaFraude: ").append(toIndentedString(dataHoraSuspeitaFraude)).append("\n");
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

