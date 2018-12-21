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
 * Object File for the dates persistence
 **/

@ApiModel(description = "Object File for the dates persistence")
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
   * File type
   **/
  public ArquivoPersist idTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File type")
  @JsonProperty("idTipoArquivo")
  public Long getIdTipoArquivo() {
    return idTipoArquivo;
  }
  public void setIdTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
  }

  
  /**
   * Content of the converted file in base 64
   **/
  public ArquivoPersist arquivo(String arquivo) {
    this.arquivo = arquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Content of the converted file in base 64")
  @JsonProperty("arquivo")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * File name
   **/
  public ArquivoPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File name")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * File extension
   **/
  public ArquivoPersist extensao(String extensao) {
    this.extensao = extensao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File extension")
  @JsonProperty("extensao")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Communication Type
   **/
  public ArquivoPersist tipoComunicacao(TipoComunicacaoEnum tipoComunicacao) {
    this.tipoComunicacao = tipoComunicacao;
    return this;
  }
  
  @ApiModelProperty(example = "SOAP", value = "Communication Type")
  @JsonProperty("tipoComunicacao")
  public TipoComunicacaoEnum getTipoComunicacao() {
    return tipoComunicacao;
  }
  public void setTipoComunicacao(TipoComunicacaoEnum tipoComunicacao) {
    this.tipoComunicacao = tipoComunicacao;
  }

  
  /**
   * Details containing additional information, related to the file
   **/
  public ArquivoPersist detalhes(List<ArquivoDetalhesPersist> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Details containing additional information, related to the file")
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

