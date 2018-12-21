package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Object of response of Detailed Fraud Risk
 **/

@ApiModel(description = "Object of response of Detailed Fraud Risk")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RiscoFraudeDetalhadoResponse   {
  
  private Long id = null;
  private Long idTipoResolucao = null;
  private String descricaoTipoResolucao = null;
  private Boolean flagAltoRisco = null;
  private Long idConta = null;
  private Long idCartao = null;
  private Long idProduto = null;
  private Long idTransacao = null;
  private String dataTransacao = null;
  private BigDecimal valorTransacao = null;
  private String codigoMoedaOrigem = null;
  private BigDecimal valorOrigem = null;
  private String codigoMoedaDestino = null;
  private BigDecimal valorDestino = null;
  private String nomeEstabelecimento = null;
  private String idPais = null;
  private String codigoRespostaAutorizador = null;
  private String descricaoRespostaAutorizador = null;
  private String codigoRespostaFraude = null;
  private String descricaoRespostaFraude = null;
  private String origemTransacao = null;
  private String codigoModoEntradaTerminal = null;
  private String descricaoModoEntradaTerminal = null;
  private String cpf = null;
  private String cnpj = null;
  private String email = null;
  private List<TelefoneResponse> telefones = new ArrayList<TelefoneResponse>();

  
  /**
   * Identification Code of risk of fraud
   **/
  public RiscoFraudeDetalhadoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of risk of fraud")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification code of the type of resolution attributed to the register
   **/
  public RiscoFraudeDetalhadoResponse idTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification code of the type of resolution attributed to the register")
  @JsonProperty("idTipoResolucao")
  public Long getIdTipoResolucao() {
    return idTipoResolucao;
  }
  public void setIdTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
  }

  
  /**
   * Description of the type of resolution attributed to the resgister
   **/
  public RiscoFraudeDetalhadoResponse descricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the type of resolution attributed to the resgister")
  @JsonProperty("descricaoTipoResolucao")
  public String getDescricaoTipoResolucao() {
    return descricaoTipoResolucao;
  }
  public void setDescricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
  }

  
  /**
   * Indicate that a transaction has a great risk of fraud and all the following transactions will be denied until all the transactions ranked as a risk of fraud be analyzed
   **/
  public RiscoFraudeDetalhadoResponse flagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indicate that a transaction has a great risk of fraud and all the following transactions will be denied until all the transactions ranked as a risk of fraud be analyzed")
  @JsonProperty("flagAltoRisco")
  public Boolean getFlagAltoRisco() {
    return flagAltoRisco;
  }
  public void setFlagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
  }

  
  /**
   * Code of identification of the account
   **/
  public RiscoFraudeDetalhadoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code of identification of the account")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification code of the card
   **/
  public RiscoFraudeDetalhadoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification code of the card")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Code of identification of the product
   **/
  public RiscoFraudeDetalhadoResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code of identification of the product")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identification Code of the transaction
   **/
  public RiscoFraudeDetalhadoResponse idTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the transaction")
  @JsonProperty("idTransacao")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Date that the transaction ranked as a risk of fraude was made
   **/
  public RiscoFraudeDetalhadoResponse dataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date that the transaction ranked as a risk of fraude was made")
  @JsonProperty("dataTransacao")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * Value of the transaction ranked as a risk of fraud
   **/
  public RiscoFraudeDetalhadoResponse valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the transaction ranked as a risk of fraud")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * Code of the origin currency used for the transaction
   **/
  public RiscoFraudeDetalhadoResponse codigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code of the origin currency used for the transaction")
  @JsonProperty("codigoMoedaOrigem")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * Value of the transactions in the origin currency
   **/
  public RiscoFraudeDetalhadoResponse valorOrigem(BigDecimal valorOrigem) {
    this.valorOrigem = valorOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the transactions in the origin currency")
  @JsonProperty("valorOrigem")
  public BigDecimal getValorOrigem() {
    return valorOrigem;
  }
  public void setValorOrigem(BigDecimal valorOrigem) {
    this.valorOrigem = valorOrigem;
  }

  
  /**
   * Code of the destination currency used for the transaction
   **/
  public RiscoFraudeDetalhadoResponse codigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code of the destination currency used for the transaction")
  @JsonProperty("codigoMoedaDestino")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * Value of the transaction of the intended currency of the transaction of the destination currency
   **/
  public RiscoFraudeDetalhadoResponse valorDestino(BigDecimal valorDestino) {
    this.valorDestino = valorDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the transaction of the intended currency of the transaction of the destination currency")
  @JsonProperty("valorDestino")
  public BigDecimal getValorDestino() {
    return valorDestino;
  }
  public void setValorDestino(BigDecimal valorDestino) {
    this.valorDestino = valorDestino;
  }

  
  /**
   * Name of the establishment where the transaction with risk of fraud was made
   **/
  public RiscoFraudeDetalhadoResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the establishment where the transaction with risk of fraud was made")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Identification code of the Country
   **/
  public RiscoFraudeDetalhadoResponse idPais(String idPais) {
    this.idPais = idPais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification code of the Country")
  @JsonProperty("idPais")
  public String getIdPais() {
    return idPais;
  }
  public void setIdPais(String idPais) {
    this.idPais = idPais;
  }

  
  /**
   * Response code of the authorizer for the transaction
   **/
  public RiscoFraudeDetalhadoResponse codigoRespostaAutorizador(String codigoRespostaAutorizador) {
    this.codigoRespostaAutorizador = codigoRespostaAutorizador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Response code of the authorizer for the transaction")
  @JsonProperty("codigoRespostaAutorizador")
  public String getCodigoRespostaAutorizador() {
    return codigoRespostaAutorizador;
  }
  public void setCodigoRespostaAutorizador(String codigoRespostaAutorizador) {
    this.codigoRespostaAutorizador = codigoRespostaAutorizador;
  }

  
  /**
   * Description of the response of the authorizer for the transaction
   **/
  public RiscoFraudeDetalhadoResponse descricaoRespostaAutorizador(String descricaoRespostaAutorizador) {
    this.descricaoRespostaAutorizador = descricaoRespostaAutorizador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the response of the authorizer for the transaction")
  @JsonProperty("descricaoRespostaAutorizador")
  public String getDescricaoRespostaAutorizador() {
    return descricaoRespostaAutorizador;
  }
  public void setDescricaoRespostaAutorizador(String descricaoRespostaAutorizador) {
    this.descricaoRespostaAutorizador = descricaoRespostaAutorizador;
  }

  
  /**
   * Response code of the tool of fraund prevention for the transaction
   **/
  public RiscoFraudeDetalhadoResponse codigoRespostaFraude(String codigoRespostaFraude) {
    this.codigoRespostaFraude = codigoRespostaFraude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Response code of the tool of fraund prevention for the transaction")
  @JsonProperty("codigoRespostaFraude")
  public String getCodigoRespostaFraude() {
    return codigoRespostaFraude;
  }
  public void setCodigoRespostaFraude(String codigoRespostaFraude) {
    this.codigoRespostaFraude = codigoRespostaFraude;
  }

  
  /**
   * Description of the response of the Prevention tool to the fraud for the transaction
   **/
  public RiscoFraudeDetalhadoResponse descricaoRespostaFraude(String descricaoRespostaFraude) {
    this.descricaoRespostaFraude = descricaoRespostaFraude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the response of the Prevention tool to the fraud for the transaction")
  @JsonProperty("descricaoRespostaFraude")
  public String getDescricaoRespostaFraude() {
    return descricaoRespostaFraude;
  }
  public void setDescricaoRespostaFraude(String descricaoRespostaFraude) {
    this.descricaoRespostaFraude = descricaoRespostaFraude;
  }

  
  /**
   * Type of Terminal that caused the Transaction (POS, ATM, TEF, etc)
   **/
  public RiscoFraudeDetalhadoResponse origemTransacao(String origemTransacao) {
    this.origemTransacao = origemTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of Terminal that caused the Transaction (POS, ATM, TEF, etc)")
  @JsonProperty("origemTransacao")
  public String getOrigemTransacao() {
    return origemTransacao;
  }
  public void setOrigemTransacao(String origemTransacao) {
    this.origemTransacao = origemTransacao;
  }

  
  /**
   * Code of identification of the origin mode of the transaction capture
   **/
  public RiscoFraudeDetalhadoResponse codigoModoEntradaTerminal(String codigoModoEntradaTerminal) {
    this.codigoModoEntradaTerminal = codigoModoEntradaTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code of identification of the origin mode of the transaction capture")
  @JsonProperty("codigoModoEntradaTerminal")
  public String getCodigoModoEntradaTerminal() {
    return codigoModoEntradaTerminal;
  }
  public void setCodigoModoEntradaTerminal(String codigoModoEntradaTerminal) {
    this.codigoModoEntradaTerminal = codigoModoEntradaTerminal;
  }

  
  /**
   * Description of the origin mode of the transaction capture
   **/
  public RiscoFraudeDetalhadoResponse descricaoModoEntradaTerminal(String descricaoModoEntradaTerminal) {
    this.descricaoModoEntradaTerminal = descricaoModoEntradaTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the origin mode of the transaction capture")
  @JsonProperty("descricaoModoEntradaTerminal")
  public String getDescricaoModoEntradaTerminal() {
    return descricaoModoEntradaTerminal;
  }
  public void setDescricaoModoEntradaTerminal(String descricaoModoEntradaTerminal) {
    this.descricaoModoEntradaTerminal = descricaoModoEntradaTerminal;
  }

  
  /**
   * Number of CPF of the Person carrdholder, when it is the Physical type
   **/
  public RiscoFraudeDetalhadoResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of CPF of the Person carrdholder, when it is the Physical type")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * CNPJ number of the Per?son cardholder, when it is the Legal type
   **/
  public RiscoFraudeDetalhadoResponse cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CNPJ number of the Per?son cardholder, when it is the Legal type")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * Email Address of the Cardholder
   **/
  public RiscoFraudeDetalhadoResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email Address of the Cardholder")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * List of associated telephones to the cardholder
   **/
  public RiscoFraudeDetalhadoResponse telefones(List<TelefoneResponse> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of associated telephones to the cardholder")
  @JsonProperty("telefones")
  public List<TelefoneResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefoneResponse> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiscoFraudeDetalhadoResponse riscoFraudeDetalhadoResponse = (RiscoFraudeDetalhadoResponse) o;
    return Objects.equals(this.id, riscoFraudeDetalhadoResponse.id) &&
        Objects.equals(this.idTipoResolucao, riscoFraudeDetalhadoResponse.idTipoResolucao) &&
        Objects.equals(this.descricaoTipoResolucao, riscoFraudeDetalhadoResponse.descricaoTipoResolucao) &&
        Objects.equals(this.flagAltoRisco, riscoFraudeDetalhadoResponse.flagAltoRisco) &&
        Objects.equals(this.idConta, riscoFraudeDetalhadoResponse.idConta) &&
        Objects.equals(this.idCartao, riscoFraudeDetalhadoResponse.idCartao) &&
        Objects.equals(this.idProduto, riscoFraudeDetalhadoResponse.idProduto) &&
        Objects.equals(this.idTransacao, riscoFraudeDetalhadoResponse.idTransacao) &&
        Objects.equals(this.dataTransacao, riscoFraudeDetalhadoResponse.dataTransacao) &&
        Objects.equals(this.valorTransacao, riscoFraudeDetalhadoResponse.valorTransacao) &&
        Objects.equals(this.codigoMoedaOrigem, riscoFraudeDetalhadoResponse.codigoMoedaOrigem) &&
        Objects.equals(this.valorOrigem, riscoFraudeDetalhadoResponse.valorOrigem) &&
        Objects.equals(this.codigoMoedaDestino, riscoFraudeDetalhadoResponse.codigoMoedaDestino) &&
        Objects.equals(this.valorDestino, riscoFraudeDetalhadoResponse.valorDestino) &&
        Objects.equals(this.nomeEstabelecimento, riscoFraudeDetalhadoResponse.nomeEstabelecimento) &&
        Objects.equals(this.idPais, riscoFraudeDetalhadoResponse.idPais) &&
        Objects.equals(this.codigoRespostaAutorizador, riscoFraudeDetalhadoResponse.codigoRespostaAutorizador) &&
        Objects.equals(this.descricaoRespostaAutorizador, riscoFraudeDetalhadoResponse.descricaoRespostaAutorizador) &&
        Objects.equals(this.codigoRespostaFraude, riscoFraudeDetalhadoResponse.codigoRespostaFraude) &&
        Objects.equals(this.descricaoRespostaFraude, riscoFraudeDetalhadoResponse.descricaoRespostaFraude) &&
        Objects.equals(this.origemTransacao, riscoFraudeDetalhadoResponse.origemTransacao) &&
        Objects.equals(this.codigoModoEntradaTerminal, riscoFraudeDetalhadoResponse.codigoModoEntradaTerminal) &&
        Objects.equals(this.descricaoModoEntradaTerminal, riscoFraudeDetalhadoResponse.descricaoModoEntradaTerminal) &&
        Objects.equals(this.cpf, riscoFraudeDetalhadoResponse.cpf) &&
        Objects.equals(this.cnpj, riscoFraudeDetalhadoResponse.cnpj) &&
        Objects.equals(this.email, riscoFraudeDetalhadoResponse.email) &&
        Objects.equals(this.telefones, riscoFraudeDetalhadoResponse.telefones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoResolucao, descricaoTipoResolucao, flagAltoRisco, idConta, idCartao, idProduto, idTransacao, dataTransacao, valorTransacao, codigoMoedaOrigem, valorOrigem, codigoMoedaDestino, valorDestino, nomeEstabelecimento, idPais, codigoRespostaAutorizador, descricaoRespostaAutorizador, codigoRespostaFraude, descricaoRespostaFraude, origemTransacao, codigoModoEntradaTerminal, descricaoModoEntradaTerminal, cpf, cnpj, email, telefones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiscoFraudeDetalhadoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoResolucao: ").append(toIndentedString(idTipoResolucao)).append("\n");
    sb.append("    descricaoTipoResolucao: ").append(toIndentedString(descricaoTipoResolucao)).append("\n");
    sb.append("    flagAltoRisco: ").append(toIndentedString(flagAltoRisco)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idTransacao: ").append(toIndentedString(idTransacao)).append("\n");
    sb.append("    dataTransacao: ").append(toIndentedString(dataTransacao)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
    sb.append("    codigoMoedaOrigem: ").append(toIndentedString(codigoMoedaOrigem)).append("\n");
    sb.append("    valorOrigem: ").append(toIndentedString(valorOrigem)).append("\n");
    sb.append("    codigoMoedaDestino: ").append(toIndentedString(codigoMoedaDestino)).append("\n");
    sb.append("    valorDestino: ").append(toIndentedString(valorDestino)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    idPais: ").append(toIndentedString(idPais)).append("\n");
    sb.append("    codigoRespostaAutorizador: ").append(toIndentedString(codigoRespostaAutorizador)).append("\n");
    sb.append("    descricaoRespostaAutorizador: ").append(toIndentedString(descricaoRespostaAutorizador)).append("\n");
    sb.append("    codigoRespostaFraude: ").append(toIndentedString(codigoRespostaFraude)).append("\n");
    sb.append("    descricaoRespostaFraude: ").append(toIndentedString(descricaoRespostaFraude)).append("\n");
    sb.append("    origemTransacao: ").append(toIndentedString(origemTransacao)).append("\n");
    sb.append("    codigoModoEntradaTerminal: ").append(toIndentedString(codigoModoEntradaTerminal)).append("\n");
    sb.append("    descricaoModoEntradaTerminal: ").append(toIndentedString(descricaoModoEntradaTerminal)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
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

