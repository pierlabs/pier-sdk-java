package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ArquivoDetalhesPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto Arquivo para persist\u00C3\u00AAncia de dados.
 **/

@ApiModel(description = "Objeto Arquivo para persist\u00C3\u00AAncia de dados.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ArquivoPersist   {
  
  private Long idTipoArquivo = null;
  private String arquivo = null;
  private String nome = null;
  private String extensao = null;


  public enum TipoComunicacaoEnum {
    SOAP("SOAP"),
    REST("REST");

    private String value;

    TipoComunicacaoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoComunicacaoEnum tipoComunicacao = null;
  private List<ArquivoDetalhesPersist> detalhes = new ArrayList<ArquivoDetalhesPersist>();

  
  /**
   * Tipo do arquivo
   **/
  public ArquivoPersist idTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do arquivo")
  @JsonProperty("idTipoArquivo")
  public Long getIdTipoArquivo() {
    return idTipoArquivo;
  }
  public void setIdTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
  }

  
  /**
   * Conte\u00C3\u00BAdo do arquivo convertido em Base 64
   **/
  public ArquivoPersist arquivo(String arquivo) {
    this.arquivo = arquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Conte\u00C3\u00BAdo do arquivo convertido em Base 64")
  @JsonProperty("arquivo")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * Nome do arquivo.
   **/
  public ArquivoPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do arquivo.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Formato/extens\u00C3\u00A3o do arquivo.
   **/
  public ArquivoPersist extensao(String extensao) {
    this.extensao = extensao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Formato/extens\u00C3\u00A3o do arquivo.")
  @JsonProperty("extensao")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Tipo de comunica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public ArquivoPersist tipoComunicacao(TipoComunicacaoEnum tipoComunicacao) {
    this.tipoComunicacao = tipoComunicacao;
    return this;
  }
  
  @ApiModelProperty(example = "SOAP", value = "Tipo de comunica\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("tipoComunicacao")
  public TipoComunicacaoEnum getTipoComunicacao() {
    return tipoComunicacao;
  }
  public void setTipoComunicacao(TipoComunicacaoEnum tipoComunicacao) {
    this.tipoComunicacao = tipoComunicacao;
  }

  
  /**
   * Detalhes contendo informa\u00C3\u00A7\u00C3\u00B5es adicionais, relacionadas ao arquivo
   **/
  public ArquivoPersist detalhes(List<ArquivoDetalhesPersist> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Detalhes contendo informa\u00C3\u00A7\u00C3\u00B5es adicionais, relacionadas ao arquivo")
  @JsonProperty("detalhes")
  public List<ArquivoDetalhesPersist> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<ArquivoDetalhesPersist> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArquivoPersist arquivoPersist = (ArquivoPersist) o;
    return Objects.equals(this.idTipoArquivo, arquivoPersist.idTipoArquivo) &&
        Objects.equals(this.arquivo, arquivoPersist.arquivo) &&
        Objects.equals(this.nome, arquivoPersist.nome) &&
        Objects.equals(this.extensao, arquivoPersist.extensao) &&
        Objects.equals(this.tipoComunicacao, arquivoPersist.tipoComunicacao) &&
        Objects.equals(this.detalhes, arquivoPersist.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoArquivo, arquivo, nome, extensao, tipoComunicacao, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoPersist {\n");
    
    sb.append("    idTipoArquivo: ").append(toIndentedString(idTipoArquivo)).append("\n");
    sb.append("    arquivo: ").append(toIndentedString(arquivo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    extensao: ").append(toIndentedString(extensao)).append("\n");
    sb.append("    tipoComunicacao: ").append(toIndentedString(tipoComunicacao)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
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

