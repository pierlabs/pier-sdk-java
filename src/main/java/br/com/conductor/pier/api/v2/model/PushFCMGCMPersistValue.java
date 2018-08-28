package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{push_f_c_m_g_c_m_persist_description}}}
 **/

@ApiModel(description = "{{{push_f_c_m_g_c_m_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PushFCMGCMPersistValue   {
  
  private Long idPessoa = null;
  private Long idConta = null;
  private String tokenDispositivo = null;
  private String tokenServidor = null;
  private String titulo = null;
  private String conteudo = null;


  public enum TipoEventoEnum {
    RISCO_FRAUDE("RISCO_FRAUDE"),
    CODIGO_SEGURANCA("CODIGO_SEGURANCA"),
    OUTROS("OUTROS"),
    OTP_3D_SECURE("OTP_3D_SECURE");

    private String value;

    TipoEventoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoEventoEnum tipoEvento = null;
  private String icone = null;
  private String som = null;
  private String cor = null;

  
  /**
   * {{{push_a_p_n_s_persist_id_pessoa_value}}}
   **/
  public PushFCMGCMPersistValue idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{push_a_p_n_s_persist_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{push_a_p_n_s_persist_id_conta_value}}}
   **/
  public PushFCMGCMPersistValue idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{push_a_p_n_s_persist_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{push_a_p_n_s_persist_token_dispositivo_value}}}
   **/
  public PushFCMGCMPersistValue tokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{push_a_p_n_s_persist_token_dispositivo_value}}}")
  @JsonProperty("tokenDispositivo")
  public String getTokenDispositivo() {
    return tokenDispositivo;
  }
  public void setTokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  
  /**
   * {{{push_f_c_m_g_c_m_persist_token_servidor_value}}}
   **/
  public PushFCMGCMPersistValue tokenServidor(String tokenServidor) {
    this.tokenServidor = tokenServidor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{push_f_c_m_g_c_m_persist_token_servidor_value}}}")
  @JsonProperty("tokenServidor")
  public String getTokenServidor() {
    return tokenServidor;
  }
  public void setTokenServidor(String tokenServidor) {
    this.tokenServidor = tokenServidor;
  }

  
  /**
   * {{{push_a_p_n_s_persist_titulo_value}}}
   **/
  public PushFCMGCMPersistValue titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{push_a_p_n_s_persist_titulo_value}}}")
  @JsonProperty("titulo")
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  
  /**
   * {{{push_a_p_n_s_persist_conteudo_value}}}
   **/
  public PushFCMGCMPersistValue conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{push_a_p_n_s_persist_conteudo_value}}}")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * {{{push_f_c_m_g_c_m_persist_tipo_evento_value}}}
   **/
  public PushFCMGCMPersistValue tipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{push_f_c_m_g_c_m_persist_tipo_evento_value}}}")
  @JsonProperty("tipoEvento")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * {{{push_f_c_m_g_c_m_persist_icone_value}}}
   **/
  public PushFCMGCMPersistValue icone(String icone) {
    this.icone = icone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{push_f_c_m_g_c_m_persist_icone_value}}}")
  @JsonProperty("icone")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * {{{push_f_c_m_g_c_m_persist_som_value}}}
   **/
  public PushFCMGCMPersistValue som(String som) {
    this.som = som;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{push_f_c_m_g_c_m_persist_som_value}}}")
  @JsonProperty("som")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * {{{push_f_c_m_g_c_m_persist_cor_value}}}
   **/
  public PushFCMGCMPersistValue cor(String cor) {
    this.cor = cor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{push_f_c_m_g_c_m_persist_cor_value}}}")
  @JsonProperty("cor")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFCMGCMPersistValue pushFCMGCMPersistValue = (PushFCMGCMPersistValue) o;
    return Objects.equals(this.idPessoa, pushFCMGCMPersistValue.idPessoa) &&
        Objects.equals(this.idConta, pushFCMGCMPersistValue.idConta) &&
        Objects.equals(this.tokenDispositivo, pushFCMGCMPersistValue.tokenDispositivo) &&
        Objects.equals(this.tokenServidor, pushFCMGCMPersistValue.tokenServidor) &&
        Objects.equals(this.titulo, pushFCMGCMPersistValue.titulo) &&
        Objects.equals(this.conteudo, pushFCMGCMPersistValue.conteudo) &&
        Objects.equals(this.tipoEvento, pushFCMGCMPersistValue.tipoEvento) &&
        Objects.equals(this.icone, pushFCMGCMPersistValue.icone) &&
        Objects.equals(this.som, pushFCMGCMPersistValue.som) &&
        Objects.equals(this.cor, pushFCMGCMPersistValue.cor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, idConta, tokenDispositivo, tokenServidor, titulo, conteudo, tipoEvento, icone, som, cor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFCMGCMPersistValue {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    tokenDispositivo: ").append(toIndentedString(tokenDispositivo)).append("\n");
    sb.append("    tokenServidor: ").append(toIndentedString(tokenServidor)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    icone: ").append(toIndentedString(icone)).append("\n");
    sb.append("    som: ").append(toIndentedString(som)).append("\n");
    sb.append("    cor: ").append(toIndentedString(cor)).append("\n");
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

