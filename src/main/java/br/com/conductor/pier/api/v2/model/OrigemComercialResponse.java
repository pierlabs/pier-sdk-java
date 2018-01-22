package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ProdutoOrigemResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Origem Comercial
 **/

@ApiModel(description = "Origem Comercial")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OrigemComercialResponse   {
  
  private Long id = null;
  private String nome = null;
  private String descricao = null;
  private List<ProdutoOrigemResponse> produtosOrigem = new ArrayList<ProdutoOrigemResponse>();
  private Long idEstabelecimento = null;
  private Long idTipoOrigemComercial = null;
  private String nomeTipoOrigemComercial = null;
  private Long idGrupoOrigemComercial = null;
  private String nomeGrupoOrigemComercial = null;
  private Boolean status = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial
   **/
  public OrigemComercialResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome da origem comercial
   **/
  public OrigemComercialResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome da origem comercial")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o completa do nome da Origem Comercial
   **/
  public OrigemComercialResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Descri\u00C3\u00A7\u00C3\u00A3o completa do nome da Origem Comercial")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Lista de  ProdutosOrigem associados \u00C3\u00A0 Origem comercial
   **/
  public OrigemComercialResponse produtosOrigem(List<ProdutoOrigemResponse> produtosOrigem) {
    this.produtosOrigem = produtosOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Lista de  ProdutosOrigem associados \u00C3\u00A0 Origem comercial")
  @JsonProperty("produtosOrigem")
  public List<ProdutoOrigemResponse> getProdutosOrigem() {
    return produtosOrigem;
  }
  public void setProdutosOrigem(List<ProdutoOrigemResponse> produtosOrigem) {
    this.produtosOrigem = produtosOrigem;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento
   **/
  public OrigemComercialResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Tipo da Origem Comercial
   **/
  public OrigemComercialResponse idTipoOrigemComercial(Long idTipoOrigemComercial) {
    this.idTipoOrigemComercial = idTipoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Tipo da Origem Comercial")
  @JsonProperty("idTipoOrigemComercial")
  public Long getIdTipoOrigemComercial() {
    return idTipoOrigemComercial;
  }
  public void setIdTipoOrigemComercial(Long idTipoOrigemComercial) {
    this.idTipoOrigemComercial = idTipoOrigemComercial;
  }

  
  /**
   * Nome do Tipo da Origem Comercial
   **/
  public OrigemComercialResponse nomeTipoOrigemComercial(String nomeTipoOrigemComercial) {
    this.nomeTipoOrigemComercial = nomeTipoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome do Tipo da Origem Comercial")
  @JsonProperty("nomeTipoOrigemComercial")
  public String getNomeTipoOrigemComercial() {
    return nomeTipoOrigemComercial;
  }
  public void setNomeTipoOrigemComercial(String nomeTipoOrigemComercial) {
    this.nomeTipoOrigemComercial = nomeTipoOrigemComercial;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Grupo a qual a Origem Comercial pertence
   **/
  public OrigemComercialResponse idGrupoOrigemComercial(Long idGrupoOrigemComercial) {
    this.idGrupoOrigemComercial = idGrupoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Grupo a qual a Origem Comercial pertence")
  @JsonProperty("idGrupoOrigemComercial")
  public Long getIdGrupoOrigemComercial() {
    return idGrupoOrigemComercial;
  }
  public void setIdGrupoOrigemComercial(Long idGrupoOrigemComercial) {
    this.idGrupoOrigemComercial = idGrupoOrigemComercial;
  }

  
  /**
   * Nome do Grupo a qual a Origem Comercial pertence
   **/
  public OrigemComercialResponse nomeGrupoOrigemComercial(String nomeGrupoOrigemComercial) {
    this.nomeGrupoOrigemComercial = nomeGrupoOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome do Grupo a qual a Origem Comercial pertence")
  @JsonProperty("nomeGrupoOrigemComercial")
  public String getNomeGrupoOrigemComercial() {
    return nomeGrupoOrigemComercial;
  }
  public void setNomeGrupoOrigemComercial(String nomeGrupoOrigemComercial) {
    this.nomeGrupoOrigemComercial = nomeGrupoOrigemComercial;
  }

  
  /**
   * Status da origem comercial
   **/
  public OrigemComercialResponse status(Boolean status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Status da origem comercial")
  @JsonProperty("status")
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrigemComercialResponse origemComercialResponse = (OrigemComercialResponse) o;
    return Objects.equals(this.id, origemComercialResponse.id) &&
        Objects.equals(this.nome, origemComercialResponse.nome) &&
        Objects.equals(this.descricao, origemComercialResponse.descricao) &&
        Objects.equals(this.produtosOrigem, origemComercialResponse.produtosOrigem) &&
        Objects.equals(this.idEstabelecimento, origemComercialResponse.idEstabelecimento) &&
        Objects.equals(this.idTipoOrigemComercial, origemComercialResponse.idTipoOrigemComercial) &&
        Objects.equals(this.nomeTipoOrigemComercial, origemComercialResponse.nomeTipoOrigemComercial) &&
        Objects.equals(this.idGrupoOrigemComercial, origemComercialResponse.idGrupoOrigemComercial) &&
        Objects.equals(this.nomeGrupoOrigemComercial, origemComercialResponse.nomeGrupoOrigemComercial) &&
        Objects.equals(this.status, origemComercialResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, descricao, produtosOrigem, idEstabelecimento, idTipoOrigemComercial, nomeTipoOrigemComercial, idGrupoOrigemComercial, nomeGrupoOrigemComercial, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrigemComercialResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    produtosOrigem: ").append(toIndentedString(produtosOrigem)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idTipoOrigemComercial: ").append(toIndentedString(idTipoOrigemComercial)).append("\n");
    sb.append("    nomeTipoOrigemComercial: ").append(toIndentedString(nomeTipoOrigemComercial)).append("\n");
    sb.append("    idGrupoOrigemComercial: ").append(toIndentedString(idGrupoOrigemComercial)).append("\n");
    sb.append("    nomeGrupoOrigemComercial: ").append(toIndentedString(nomeGrupoOrigemComercial)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

