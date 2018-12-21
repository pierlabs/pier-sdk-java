package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{push_a_p_n_s_persist_description}}}
 **/

@ApiModel(description = "{{{push_a_p_n_s_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PushAPNSPersistValue   {
  
  private Long idPessoa = null;
  private Long idConta = null;
  private String tokenDispositivo = null;
  private String certificado = null;
  private String senha = null;
  private String titulo = null;
  private String conteudo = null;


  public enum TipoEventoEnum {
    RISCO_FRAUDE("RISCO_FRAUDE"),
    CODIGO_SEGURANCA("CODIGO_SEGURANCA"),
    OUTROS("OUTROS"),
    OTP_3D_SECURE("OTP_3D_SECURE"),
    PAGAMENTO("PAGAMENTO"),
    TRANSACAO_COMPRA_AUTORIZADO("TRANSACAO_COMPRA_AUTORIZADO"),
    TRANSACAO_COMPRA_NAO_AUTORIZADO("TRANSACAO_COMPRA_NAO_AUTORIZADO"),
    TRANSACAO_SAQUE_AUTORIZADO("TRANSACAO_SAQUE_AUTORIZADO"),
    TRANSACAO_SAQUE_NAO_AUTORIZADO("TRANSACAO_SAQUE_NAO_AUTORIZADO"),
    TRANSACAO_PAGAMENTO_AUTORIZADO("TRANSACAO_PAGAMENTO_AUTORIZADO"),
    TRANSACAO_PAGAMENTO_NAO_AUTORIZADO("TRANSACAO_PAGAMENTO_NAO_AUTORIZADO"),
    TRANSACAO_ADVICE("TRANSACAO_ADVICE"),
    TRANSACAO_ERRO("TRANSACAO_ERRO"),
    TRANSACAO_SIMULACAO("TRANSACAO_SIMULACAO"),
    TRANSACAO_SENHA_CHIP("TRANSACAO_SENHA_CHIP"),
    TRANSACAO_CONSULTA_SALDO("TRANSACAO_CONSULTA_SALDO"),
    TRANSACAO_CONSULTA_STATUS_CONTA("TRANSACAO_CONSULTA_STATUS_CONTA"),
    TRANSACAO_DESFAZIMENTO("TRANSACAO_DESFAZIMENTO"),
    TRANSACAO_CANCELAMENTO("TRANSACAO_CANCELAMENTO"),
    TRANSACAO_RESPOSTA_SONDA("TRANSACAO_RESPOSTA_SONDA"),
    TRANSACAO_TOKEN("TRANSACAO_TOKEN");

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

  
  /**
   * {{{push_a_p_n_s_persist_id_pessoa_value}}}
   **/
  public PushAPNSPersistValue idPessoa(Long idPessoa) {
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
  public PushAPNSPersistValue idConta(Long idConta) {
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
  public PushAPNSPersistValue tokenDispositivo(String tokenDispositivo) {
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
   * {{{push_a_p_n_s_persist_certificado_value}}}
   **/
  public PushAPNSPersistValue certificado(String certificado) {
    this.certificado = certificado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{push_a_p_n_s_persist_certificado_value}}}")
  @JsonProperty("certificado")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * {{{push_a_p_n_s_persist_senha_value}}}
   **/
  public PushAPNSPersistValue senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{push_a_p_n_s_persist_senha_value}}}")
  @JsonProperty("senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * {{{push_a_p_n_s_persist_titulo_value}}}
   **/
  public PushAPNSPersistValue titulo(String titulo) {
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
  public PushAPNSPersistValue conteudo(String conteudo) {
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
  public PushAPNSPersistValue tipoEvento(TipoEventoEnum tipoEvento) {
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
  public PushAPNSPersistValue icone(String icone) {
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
  public PushAPNSPersistValue som(String som) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushAPNSPersistValue pushAPNSPersistValue = (PushAPNSPersistValue) o;
    return Objects.equals(this.idPessoa, pushAPNSPersistValue.idPessoa) &&
        Objects.equals(this.idConta, pushAPNSPersistValue.idConta) &&
        Objects.equals(this.tokenDispositivo, pushAPNSPersistValue.tokenDispositivo) &&
        Objects.equals(this.certificado, pushAPNSPersistValue.certificado) &&
        Objects.equals(this.senha, pushAPNSPersistValue.senha) &&
        Objects.equals(this.titulo, pushAPNSPersistValue.titulo) &&
        Objects.equals(this.conteudo, pushAPNSPersistValue.conteudo) &&
        Objects.equals(this.tipoEvento, pushAPNSPersistValue.tipoEvento) &&
        Objects.equals(this.icone, pushAPNSPersistValue.icone) &&
        Objects.equals(this.som, pushAPNSPersistValue.som);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, idConta, tokenDispositivo, certificado, senha, titulo, conteudo, tipoEvento, icone, som);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushAPNSPersistValue {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    tokenDispositivo: ").append(toIndentedString(tokenDispositivo)).append("\n");
    sb.append("    certificado: ").append(toIndentedString(certificado)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    icone: ").append(toIndentedString(icone)).append("\n");
    sb.append("    som: ").append(toIndentedString(som)).append("\n");
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

