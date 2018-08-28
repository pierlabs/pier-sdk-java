package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{cartao_impressao_response_description}}}
 **/

@ApiModel(description = "{{{cartao_impressao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoImpressaoResponse   {
  
  private Long idConta = null;
  private Long idPessoa = null;
  private Long idCartao = null;
  private Long idBandeira = null;
  private Long idTipoCartao = null;
  private String numeroCartao = null;
  private String nomePlastico = null;
  private String cvv2 = null;
  private String dataGeracao = null;
  private String dataValidade = null;
  private String nomeOrigemComercial = null;
  private String nomeEmpresa = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorente = null;
  private String nomeEmpresaBeneficio = null;
  private String cpf = null;
  private String tipoPortador = null;
  private String nomeEmpregador = null;
  private String trilha1 = null;
  private String trilha2 = null;
  private String trilhaCVV1 = null;
  private String trilhaCVV2 = null;
  private Integer flagVirtual = null;
  private Long numeroCartaoHash = null;

  
  /**
   * {{{cartao_impressao_response_id_conta_value}}}
   **/
  public CartaoImpressaoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{cartao_impressao_response_id_pessoa_value}}}
   **/
  public CartaoImpressaoResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{cartao_impressao_response_id_cartao_value}}}
   **/
  public CartaoImpressaoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{cartao_impressao_response_id_bandeira_value}}}
   **/
  public CartaoImpressaoResponse idBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_id_bandeira_value}}}")
  @JsonProperty("idBandeira")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * {{{cartao_impressao_response_id_tipo_cartao_value}}}
   **/
  public CartaoImpressaoResponse idTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_id_tipo_cartao_value}}}")
  @JsonProperty("idTipoCartao")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * {{{cartao_impressao_response_numero_cartao_value}}}
   **/
  public CartaoImpressaoResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_numero_cartao_value}}}")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{cartao_impressao_response_nome_plastico_value}}}
   **/
  public CartaoImpressaoResponse nomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_nome_plastico_value}}}")
  @JsonProperty("nomePlastico")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * {{{cartao_impressao_response_cvv2_value}}}
   **/
  public CartaoImpressaoResponse cvv2(String cvv2) {
    this.cvv2 = cvv2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_cvv2_value}}}")
  @JsonProperty("cvv2")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * {{{cartao_impressao_response_data_geracao_value}}}
   **/
  public CartaoImpressaoResponse dataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_data_geracao_value}}}")
  @JsonProperty("dataGeracao")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * {{{cartao_impressao_response_data_validade_value}}}
   **/
  public CartaoImpressaoResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_data_validade_value}}}")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{cartao_impressao_response_nome_origem_comercial_value}}}
   **/
  public CartaoImpressaoResponse nomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_nome_origem_comercial_value}}}")
  @JsonProperty("nomeOrigemComercial")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * {{{cartao_impressao_response_nome_empresa_value}}}
   **/
  public CartaoImpressaoResponse nomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_nome_empresa_value}}}")
  @JsonProperty("nomeEmpresa")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * {{{cartao_impressao_response_numero_agencia_value}}}
   **/
  public CartaoImpressaoResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{cartao_impressao_response_numero_conta_corente_value}}}
   **/
  public CartaoImpressaoResponse numeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_numero_conta_corente_value}}}")
  @JsonProperty("numeroContaCorente")
  public String getNumeroContaCorente() {
    return numeroContaCorente;
  }
  public void setNumeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
  }

  
  /**
   * {{{cartao_impressao_response_nome_empresa_beneficio_value}}}
   **/
  public CartaoImpressaoResponse nomeEmpresaBeneficio(String nomeEmpresaBeneficio) {
    this.nomeEmpresaBeneficio = nomeEmpresaBeneficio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_nome_empresa_beneficio_value}}}")
  @JsonProperty("nomeEmpresaBeneficio")
  public String getNomeEmpresaBeneficio() {
    return nomeEmpresaBeneficio;
  }
  public void setNomeEmpresaBeneficio(String nomeEmpresaBeneficio) {
    this.nomeEmpresaBeneficio = nomeEmpresaBeneficio;
  }

  
  /**
   * {{{cartao_impressao_response_cpf_value}}}
   **/
  public CartaoImpressaoResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_cpf_value}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{cartao_impressao_response_tipo_portador_value}}}
   **/
  public CartaoImpressaoResponse tipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_tipo_portador_value}}}")
  @JsonProperty("tipoPortador")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * {{{cartao_impressao_response_nome_empregador_value}}}
   **/
  public CartaoImpressaoResponse nomeEmpregador(String nomeEmpregador) {
    this.nomeEmpregador = nomeEmpregador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_nome_empregador_value}}}")
  @JsonProperty("nomeEmpregador")
  public String getNomeEmpregador() {
    return nomeEmpregador;
  }
  public void setNomeEmpregador(String nomeEmpregador) {
    this.nomeEmpregador = nomeEmpregador;
  }

  
  /**
   * {{{cartao_impressao_response_trilha1_value}}}
   **/
  public CartaoImpressaoResponse trilha1(String trilha1) {
    this.trilha1 = trilha1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_trilha1_value}}}")
  @JsonProperty("trilha1")
  public String getTrilha1() {
    return trilha1;
  }
  public void setTrilha1(String trilha1) {
    this.trilha1 = trilha1;
  }

  
  /**
   * {{{cartao_impressao_response_trilha2_value}}}
   **/
  public CartaoImpressaoResponse trilha2(String trilha2) {
    this.trilha2 = trilha2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_trilha2_value}}}")
  @JsonProperty("trilha2")
  public String getTrilha2() {
    return trilha2;
  }
  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }

  
  /**
   * {{{cartao_impressao_response_trilha_c_v_v1_value}}}
   **/
  public CartaoImpressaoResponse trilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_trilha_c_v_v1_value}}}")
  @JsonProperty("trilhaCVV1")
  public String getTrilhaCVV1() {
    return trilhaCVV1;
  }
  public void setTrilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
  }

  
  /**
   * {{{cartao_impressao_response_trilha_c_v_v2_value}}}
   **/
  public CartaoImpressaoResponse trilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_trilha_c_v_v2_value}}}")
  @JsonProperty("trilhaCVV2")
  public String getTrilhaCVV2() {
    return trilhaCVV2;
  }
  public void setTrilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
  }

  
  /**
   * {{{cartao_impressao_response_flag_virtual_value}}}
   **/
  public CartaoImpressaoResponse flagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_flag_virtual_value}}}")
  @JsonProperty("flagVirtual")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * {{{cartao_impressao_response_numero_cartao_hash_value}}}
   **/
  public CartaoImpressaoResponse numeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_response_numero_cartao_hash_value}}}")
  @JsonProperty("numeroCartaoHash")
  public Long getNumeroCartaoHash() {
    return numeroCartaoHash;
  }
  public void setNumeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoImpressaoResponse cartaoImpressaoResponse = (CartaoImpressaoResponse) o;
    return Objects.equals(this.idConta, cartaoImpressaoResponse.idConta) &&
        Objects.equals(this.idPessoa, cartaoImpressaoResponse.idPessoa) &&
        Objects.equals(this.idCartao, cartaoImpressaoResponse.idCartao) &&
        Objects.equals(this.idBandeira, cartaoImpressaoResponse.idBandeira) &&
        Objects.equals(this.idTipoCartao, cartaoImpressaoResponse.idTipoCartao) &&
        Objects.equals(this.numeroCartao, cartaoImpressaoResponse.numeroCartao) &&
        Objects.equals(this.nomePlastico, cartaoImpressaoResponse.nomePlastico) &&
        Objects.equals(this.cvv2, cartaoImpressaoResponse.cvv2) &&
        Objects.equals(this.dataGeracao, cartaoImpressaoResponse.dataGeracao) &&
        Objects.equals(this.dataValidade, cartaoImpressaoResponse.dataValidade) &&
        Objects.equals(this.nomeOrigemComercial, cartaoImpressaoResponse.nomeOrigemComercial) &&
        Objects.equals(this.nomeEmpresa, cartaoImpressaoResponse.nomeEmpresa) &&
        Objects.equals(this.numeroAgencia, cartaoImpressaoResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorente, cartaoImpressaoResponse.numeroContaCorente) &&
        Objects.equals(this.nomeEmpresaBeneficio, cartaoImpressaoResponse.nomeEmpresaBeneficio) &&
        Objects.equals(this.cpf, cartaoImpressaoResponse.cpf) &&
        Objects.equals(this.tipoPortador, cartaoImpressaoResponse.tipoPortador) &&
        Objects.equals(this.nomeEmpregador, cartaoImpressaoResponse.nomeEmpregador) &&
        Objects.equals(this.trilha1, cartaoImpressaoResponse.trilha1) &&
        Objects.equals(this.trilha2, cartaoImpressaoResponse.trilha2) &&
        Objects.equals(this.trilhaCVV1, cartaoImpressaoResponse.trilhaCVV1) &&
        Objects.equals(this.trilhaCVV2, cartaoImpressaoResponse.trilhaCVV2) &&
        Objects.equals(this.flagVirtual, cartaoImpressaoResponse.flagVirtual) &&
        Objects.equals(this.numeroCartaoHash, cartaoImpressaoResponse.numeroCartaoHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idPessoa, idCartao, idBandeira, idTipoCartao, numeroCartao, nomePlastico, cvv2, dataGeracao, dataValidade, nomeOrigemComercial, nomeEmpresa, numeroAgencia, numeroContaCorente, nomeEmpresaBeneficio, cpf, tipoPortador, nomeEmpregador, trilha1, trilha2, trilhaCVV1, trilhaCVV2, flagVirtual, numeroCartaoHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoImpressaoResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idBandeira: ").append(toIndentedString(idBandeira)).append("\n");
    sb.append("    idTipoCartao: ").append(toIndentedString(idTipoCartao)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    nomePlastico: ").append(toIndentedString(nomePlastico)).append("\n");
    sb.append("    cvv2: ").append(toIndentedString(cvv2)).append("\n");
    sb.append("    dataGeracao: ").append(toIndentedString(dataGeracao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    nomeOrigemComercial: ").append(toIndentedString(nomeOrigemComercial)).append("\n");
    sb.append("    nomeEmpresa: ").append(toIndentedString(nomeEmpresa)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorente: ").append(toIndentedString(numeroContaCorente)).append("\n");
    sb.append("    nomeEmpresaBeneficio: ").append(toIndentedString(nomeEmpresaBeneficio)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    tipoPortador: ").append(toIndentedString(tipoPortador)).append("\n");
    sb.append("    nomeEmpregador: ").append(toIndentedString(nomeEmpregador)).append("\n");
    sb.append("    trilha1: ").append(toIndentedString(trilha1)).append("\n");
    sb.append("    trilha2: ").append(toIndentedString(trilha2)).append("\n");
    sb.append("    trilhaCVV1: ").append(toIndentedString(trilhaCVV1)).append("\n");
    sb.append("    trilhaCVV2: ").append(toIndentedString(trilhaCVV2)).append("\n");
    sb.append("    flagVirtual: ").append(toIndentedString(flagVirtual)).append("\n");
    sb.append("    numeroCartaoHash: ").append(toIndentedString(numeroCartaoHash)).append("\n");
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

