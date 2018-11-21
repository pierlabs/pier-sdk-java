package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{telefone_escritorio_cobranca_d_t_o_description}}}
 **/

@ApiModel(description = "{{{telefone_escritorio_cobranca_d_t_o_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EscritorioCobrancaDTO   {
  
  private Long idCredor = null;
  private String prefixo = null;
  private Boolean ativo = null;
  private String nomeContato = null;
  private String email = null;
  private String nomeLogradouro = null;
  private Integer numeroEndereco = null;
  private String complementoEndereco = null;
  private String bairro = null;
  private String cidade = null;
  private String cep = null;
  private String uf = null;
  private String responsavel = null;
  private Integer flagSegundaViaAcordo = null;
  private BigDecimal valorMinimoParcela = null;
  private BigDecimal descontoMaximo = null;

  
  /**
   * {{{escritorio_cobranca_d_t_o_id_credor_value}}}
   **/
  public EscritorioCobrancaDTO idCredor(Long idCredor) {
    this.idCredor = idCredor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{escritorio_cobranca_d_t_o_id_credor_value}}}")
  @JsonProperty("idCredor")
  public Long getIdCredor() {
    return idCredor;
  }
  public void setIdCredor(Long idCredor) {
    this.idCredor = idCredor;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_prefixo_value}}}
   **/
  public EscritorioCobrancaDTO prefixo(String prefixo) {
    this.prefixo = prefixo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{escritorio_cobranca_d_t_o_prefixo_value}}}")
  @JsonProperty("prefixo")
  public String getPrefixo() {
    return prefixo;
  }
  public void setPrefixo(String prefixo) {
    this.prefixo = prefixo;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_ativo_value}}}
   **/
  public EscritorioCobrancaDTO ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "{{{escritorio_cobranca_d_t_o_ativo_value}}}")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_nome_contato_value}}}
   **/
  public EscritorioCobrancaDTO nomeContato(String nomeContato) {
    this.nomeContato = nomeContato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_nome_contato_value}}}")
  @JsonProperty("nomeContato")
  public String getNomeContato() {
    return nomeContato;
  }
  public void setNomeContato(String nomeContato) {
    this.nomeContato = nomeContato;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_email_value}}}
   **/
  public EscritorioCobrancaDTO email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_nome_logradouro_value}}}
   **/
  public EscritorioCobrancaDTO nomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_nome_logradouro_value}}}")
  @JsonProperty("nomeLogradouro")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_numero_endereco_value}}}
   **/
  public EscritorioCobrancaDTO numeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_numero_endereco_value}}}")
  @JsonProperty("numeroEndereco")
  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_complemento_endereco_value}}}
   **/
  public EscritorioCobrancaDTO complementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_complemento_endereco_value}}}")
  @JsonProperty("complementoEndereco")
  public String getComplementoEndereco() {
    return complementoEndereco;
  }
  public void setComplementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_bairro_value}}}
   **/
  public EscritorioCobrancaDTO bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_bairro_value}}}")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_cidade_value}}}
   **/
  public EscritorioCobrancaDTO cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_cidade_value}}}")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_cep_value}}}
   **/
  public EscritorioCobrancaDTO cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_cep_value}}}")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_uf_value}}}
   **/
  public EscritorioCobrancaDTO uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_uf_value}}}")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_responsavel_value}}}
   **/
  public EscritorioCobrancaDTO responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_responsavel_value}}}")
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_flag_segunda_via_acordo_value}}}
   **/
  public EscritorioCobrancaDTO flagSegundaViaAcordo(Integer flagSegundaViaAcordo) {
    this.flagSegundaViaAcordo = flagSegundaViaAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_flag_segunda_via_acordo_value}}}")
  @JsonProperty("flagSegundaViaAcordo")
  public Integer getFlagSegundaViaAcordo() {
    return flagSegundaViaAcordo;
  }
  public void setFlagSegundaViaAcordo(Integer flagSegundaViaAcordo) {
    this.flagSegundaViaAcordo = flagSegundaViaAcordo;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_valor_minimo_parcela_value}}}
   **/
  public EscritorioCobrancaDTO valorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_valor_minimo_parcela_value}}}")
  @JsonProperty("valorMinimoParcela")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_desconto_maximo_value}}}
   **/
  public EscritorioCobrancaDTO descontoMaximo(BigDecimal descontoMaximo) {
    this.descontoMaximo = descontoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{escritorio_cobranca_d_t_o_desconto_maximo_value}}}")
  @JsonProperty("descontoMaximo")
  public BigDecimal getDescontoMaximo() {
    return descontoMaximo;
  }
  public void setDescontoMaximo(BigDecimal descontoMaximo) {
    this.descontoMaximo = descontoMaximo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscritorioCobrancaDTO escritorioCobrancaDTO = (EscritorioCobrancaDTO) o;
    return Objects.equals(this.idCredor, escritorioCobrancaDTO.idCredor) &&
        Objects.equals(this.prefixo, escritorioCobrancaDTO.prefixo) &&
        Objects.equals(this.ativo, escritorioCobrancaDTO.ativo) &&
        Objects.equals(this.nomeContato, escritorioCobrancaDTO.nomeContato) &&
        Objects.equals(this.email, escritorioCobrancaDTO.email) &&
        Objects.equals(this.nomeLogradouro, escritorioCobrancaDTO.nomeLogradouro) &&
        Objects.equals(this.numeroEndereco, escritorioCobrancaDTO.numeroEndereco) &&
        Objects.equals(this.complementoEndereco, escritorioCobrancaDTO.complementoEndereco) &&
        Objects.equals(this.bairro, escritorioCobrancaDTO.bairro) &&
        Objects.equals(this.cidade, escritorioCobrancaDTO.cidade) &&
        Objects.equals(this.cep, escritorioCobrancaDTO.cep) &&
        Objects.equals(this.uf, escritorioCobrancaDTO.uf) &&
        Objects.equals(this.responsavel, escritorioCobrancaDTO.responsavel) &&
        Objects.equals(this.flagSegundaViaAcordo, escritorioCobrancaDTO.flagSegundaViaAcordo) &&
        Objects.equals(this.valorMinimoParcela, escritorioCobrancaDTO.valorMinimoParcela) &&
        Objects.equals(this.descontoMaximo, escritorioCobrancaDTO.descontoMaximo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCredor, prefixo, ativo, nomeContato, email, nomeLogradouro, numeroEndereco, complementoEndereco, bairro, cidade, cep, uf, responsavel, flagSegundaViaAcordo, valorMinimoParcela, descontoMaximo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscritorioCobrancaDTO {\n");
    
    sb.append("    idCredor: ").append(toIndentedString(idCredor)).append("\n");
    sb.append("    prefixo: ").append(toIndentedString(prefixo)).append("\n");
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
    sb.append("    nomeContato: ").append(toIndentedString(nomeContato)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nomeLogradouro: ").append(toIndentedString(nomeLogradouro)).append("\n");
    sb.append("    numeroEndereco: ").append(toIndentedString(numeroEndereco)).append("\n");
    sb.append("    complementoEndereco: ").append(toIndentedString(complementoEndereco)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("    flagSegundaViaAcordo: ").append(toIndentedString(flagSegundaViaAcordo)).append("\n");
    sb.append("    valorMinimoParcela: ").append(toIndentedString(valorMinimoParcela)).append("\n");
    sb.append("    descontoMaximo: ").append(toIndentedString(descontoMaximo)).append("\n");
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

