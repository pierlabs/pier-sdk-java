package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.PessoaDetalheResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * PessoaDetalheResponse
 **/

@ApiModel(description = "PessoaDetalheResponse")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaDetalheResponse   {
  
  private List<PessoaDetalheResponse> content = new ArrayList<PessoaDetalheResponse>();
  private Boolean first = null;
  private Boolean firstPage = null;
  private Boolean hasContent = null;
  private Boolean hasNextPage = null;
  private Boolean hasPreviousPage = null;
  private Long idPessoa = null;
  private Boolean last = null;
  private Integer nextPage = null;
  private Integer number = null;
  private Integer numberOfElements = null;
  private Integer previousPage = null;
  private Integer size = null;
  private Long totalElements = null;
  private Integer totalPages = null;
  private String nomeMae = null;
  private Long idEstadoCivil = null;
  private String profissao = null;
  private Long idNaturezaOcupacao = null;
  private Long idNacionalidade = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorrente = null;
  private String email = null;
  private String nomeEmpresa = null;

  
  /**
   **/
  public PessoaDetalheResponse content(List<PessoaDetalheResponse> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("content")
  public List<PessoaDetalheResponse> getContent() {
    return content;
  }
  public void setContent(List<PessoaDetalheResponse> content) {
    this.content = content;
  }

  
  /**
   **/
  public PessoaDetalheResponse first(Boolean first) {
    this.first = first;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("first")
  public Boolean getFirst() {
    return first;
  }
  public void setFirst(Boolean first) {
    this.first = first;
  }

  
  /**
   **/
  public PessoaDetalheResponse firstPage(Boolean firstPage) {
    this.firstPage = firstPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firstPage")
  public Boolean getFirstPage() {
    return firstPage;
  }
  public void setFirstPage(Boolean firstPage) {
    this.firstPage = firstPage;
  }

  
  /**
   **/
  public PessoaDetalheResponse hasContent(Boolean hasContent) {
    this.hasContent = hasContent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hasContent")
  public Boolean getHasContent() {
    return hasContent;
  }
  public void setHasContent(Boolean hasContent) {
    this.hasContent = hasContent;
  }

  
  /**
   **/
  public PessoaDetalheResponse hasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hasNextPage")
  public Boolean getHasNextPage() {
    return hasNextPage;
  }
  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  
  /**
   **/
  public PessoaDetalheResponse hasPreviousPage(Boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hasPreviousPage")
  public Boolean getHasPreviousPage() {
    return hasPreviousPage;
  }
  public void setHasPreviousPage(Boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da pessoa
   **/
  public PessoaDetalheResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da pessoa")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   **/
  public PessoaDetalheResponse last(Boolean last) {
    this.last = last;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("last")
  public Boolean getLast() {
    return last;
  }
  public void setLast(Boolean last) {
    this.last = last;
  }

  
  /**
   **/
  public PessoaDetalheResponse nextPage(Integer nextPage) {
    this.nextPage = nextPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextPage")
  public Integer getNextPage() {
    return nextPage;
  }
  public void setNextPage(Integer nextPage) {
    this.nextPage = nextPage;
  }

  
  /**
   **/
  public PessoaDetalheResponse number(Integer number) {
    this.number = number;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  
  /**
   **/
  public PessoaDetalheResponse numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfElements")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }
  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  
  /**
   **/
  public PessoaDetalheResponse previousPage(Integer previousPage) {
    this.previousPage = previousPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousPage")
  public Integer getPreviousPage() {
    return previousPage;
  }
  public void setPreviousPage(Integer previousPage) {
    this.previousPage = previousPage;
  }

  
  /**
   **/
  public PessoaDetalheResponse size(Integer size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  
  /**
   **/
  public PessoaDetalheResponse totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }
  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  
  /**
   **/
  public PessoaDetalheResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  
  /**
   * Apresenta o nome da m\u00C3\u00A3e da pessoa fisica
   **/
  public PessoaDetalheResponse nomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da m\u00C3\u00A3e da pessoa fisica")
  @JsonProperty("nomeMae")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  
  /**
   * Id Estado civil da pessoa fisica
   **/
  public PessoaDetalheResponse idEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id Estado civil da pessoa fisica")
  @JsonProperty("idEstadoCivil")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * Profiss\u00C3\u00A3o da pessoa fisica
   **/
  public PessoaDetalheResponse profissao(String profissao) {
    this.profissao = profissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Profiss\u00C3\u00A3o da pessoa fisica")
  @JsonProperty("profissao")
  public String getProfissao() {
    return profissao;
  }
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  
  /**
   * Id Natureza Ocupa\u00C3\u00A7\u00C3\u00A3o da pessoa fisica
   **/
  public PessoaDetalheResponse idNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id Natureza Ocupa\u00C3\u00A7\u00C3\u00A3o da pessoa fisica")
  @JsonProperty("idNaturezaOcupacao")
  public Long getIdNaturezaOcupacao() {
    return idNaturezaOcupacao;
  }
  public void setIdNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
  }

  
  /**
   * Id Nacionalidade da pessoa fisica
   **/
  public PessoaDetalheResponse idNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id Nacionalidade da pessoa fisica")
  @JsonProperty("idNacionalidade")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * N\u00C3\u00BAmero da ag\u00C3\u00AAncia.
   **/
  public PessoaDetalheResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da ag\u00C3\u00AAncia.")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00C3\u00BAmero da conta corrente.
   **/
  public PessoaDetalheResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da conta corrente.")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Email da pessoa fisica
   **/
  public PessoaDetalheResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email da pessoa fisica")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Nome que deve ser impresso no cart\u00C3\u00A3o
   **/
  public PessoaDetalheResponse nomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome que deve ser impresso no cart\u00C3\u00A3o")
  @JsonProperty("nomeEmpresa")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaDetalheResponse pessoaDetalheResponse = (PessoaDetalheResponse) o;
    return Objects.equals(this.content, pessoaDetalheResponse.content) &&
        Objects.equals(this.first, pessoaDetalheResponse.first) &&
        Objects.equals(this.firstPage, pessoaDetalheResponse.firstPage) &&
        Objects.equals(this.hasContent, pessoaDetalheResponse.hasContent) &&
        Objects.equals(this.hasNextPage, pessoaDetalheResponse.hasNextPage) &&
        Objects.equals(this.hasPreviousPage, pessoaDetalheResponse.hasPreviousPage) &&
        Objects.equals(this.idPessoa, pessoaDetalheResponse.idPessoa) &&
        Objects.equals(this.last, pessoaDetalheResponse.last) &&
        Objects.equals(this.nextPage, pessoaDetalheResponse.nextPage) &&
        Objects.equals(this.number, pessoaDetalheResponse.number) &&
        Objects.equals(this.numberOfElements, pessoaDetalheResponse.numberOfElements) &&
        Objects.equals(this.previousPage, pessoaDetalheResponse.previousPage) &&
        Objects.equals(this.size, pessoaDetalheResponse.size) &&
        Objects.equals(this.totalElements, pessoaDetalheResponse.totalElements) &&
        Objects.equals(this.totalPages, pessoaDetalheResponse.totalPages) &&
        Objects.equals(this.nomeMae, pessoaDetalheResponse.nomeMae) &&
        Objects.equals(this.idEstadoCivil, pessoaDetalheResponse.idEstadoCivil) &&
        Objects.equals(this.profissao, pessoaDetalheResponse.profissao) &&
        Objects.equals(this.idNaturezaOcupacao, pessoaDetalheResponse.idNaturezaOcupacao) &&
        Objects.equals(this.idNacionalidade, pessoaDetalheResponse.idNacionalidade) &&
        Objects.equals(this.numeroAgencia, pessoaDetalheResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, pessoaDetalheResponse.numeroContaCorrente) &&
        Objects.equals(this.email, pessoaDetalheResponse.email) &&
        Objects.equals(this.nomeEmpresa, pessoaDetalheResponse.nomeEmpresa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, first, firstPage, hasContent, hasNextPage, hasPreviousPage, idPessoa, last, nextPage, number, numberOfElements, previousPage, size, totalElements, totalPages, nomeMae, idEstadoCivil, profissao, idNaturezaOcupacao, idNacionalidade, numeroAgencia, numeroContaCorrente, email, nomeEmpresa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaDetalheResponse {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
    sb.append("    hasContent: ").append(toIndentedString(hasContent)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    hasPreviousPage: ").append(toIndentedString(hasPreviousPage)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    nomeMae: ").append(toIndentedString(nomeMae)).append("\n");
    sb.append("    idEstadoCivil: ").append(toIndentedString(idEstadoCivil)).append("\n");
    sb.append("    profissao: ").append(toIndentedString(profissao)).append("\n");
    sb.append("    idNaturezaOcupacao: ").append(toIndentedString(idNaturezaOcupacao)).append("\n");
    sb.append("    idNacionalidade: ").append(toIndentedString(idNacionalidade)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nomeEmpresa: ").append(toIndentedString(nomeEmpresa)).append("\n");
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



