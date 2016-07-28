package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1_1.model.ConsultarContaCartaoResponse;
import br.com.conductor.pier.api.v1_1.model.PessoaFisicaResponse;
import br.com.conductor.pier.api.v1_1.model.SaldoLimiteResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaResponse   {
  
  private Integer bin = null;
  private ConsultarContaCartaoResponse cartao = null;
  private String dataCadastramento = null;
  private String dataUltimoPagamento = null;
  private String dataVencCobranca = null;
  private String dddcelularSMS = null;
  private String descricaoStatus = null;
  private Integer diasEmAtraso = null;
  private String emissor = null;
  private Boolean flagCancelamento = null;
  private String formaEnvioFatura = null;
  private Integer idBandeira = null;
  private Integer idConta = null;
  private Integer idEmissor = null;
  private Integer idEndereco = null;
  private Integer idFantasiaBasica = null;
  private Integer idOrigemComercial = null;
  private Integer idProduto = null;
  private Integer idProposta = null;
  private Integer melhorDia = null;
  private String nomeCredor = null;
  private String nomeProduto = null;
  private String numCelularSMS = null;
  private Double pagamentos = null;
  private Boolean permiteRefinanciamento = null;
  private PessoaFisicaResponse pessoaFisica = null;
  private Integer quantidadePagamentos = null;
  private SaldoLimiteResponse saldoLimite = null;
  private Integer status = null;
  private Date statusData = null;
  private String taxaRefinanciamento = null;
  private String vcto = null;
  private Integer vencimento1 = null;
  private Boolean vinculoOrigemUsuario = null;

  
  /**
   **/
  public ContaResponse bin(Integer bin) {
    this.bin = bin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bin")
  public Integer getBin() {
    return bin;
  }
  public void setBin(Integer bin) {
    this.bin = bin;
  }

  
  /**
   **/
  public ContaResponse cartao(ConsultarContaCartaoResponse cartao) {
    this.cartao = cartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartao")
  public ConsultarContaCartaoResponse getCartao() {
    return cartao;
  }
  public void setCartao(ConsultarContaCartaoResponse cartao) {
    this.cartao = cartao;
  }

  
  /**
   **/
  public ContaResponse dataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataCadastramento")
  public String getDataCadastramento() {
    return dataCadastramento;
  }
  public void setDataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
  }

  
  /**
   **/
  public ContaResponse dataUltimoPagamento(String dataUltimoPagamento) {
    this.dataUltimoPagamento = dataUltimoPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataUltimoPagamento")
  public String getDataUltimoPagamento() {
    return dataUltimoPagamento;
  }
  public void setDataUltimoPagamento(String dataUltimoPagamento) {
    this.dataUltimoPagamento = dataUltimoPagamento;
  }

  
  /**
   **/
  public ContaResponse dataVencCobranca(String dataVencCobranca) {
    this.dataVencCobranca = dataVencCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataVencCobranca")
  public String getDataVencCobranca() {
    return dataVencCobranca;
  }
  public void setDataVencCobranca(String dataVencCobranca) {
    this.dataVencCobranca = dataVencCobranca;
  }

  
  /**
   **/
  public ContaResponse dddcelularSMS(String dddcelularSMS) {
    this.dddcelularSMS = dddcelularSMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dddcelularSMS")
  public String getDddcelularSMS() {
    return dddcelularSMS;
  }
  public void setDddcelularSMS(String dddcelularSMS) {
    this.dddcelularSMS = dddcelularSMS;
  }

  
  /**
   **/
  public ContaResponse descricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricaoStatus")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   **/
  public ContaResponse diasEmAtraso(Integer diasEmAtraso) {
    this.diasEmAtraso = diasEmAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("diasEmAtraso")
  public Integer getDiasEmAtraso() {
    return diasEmAtraso;
  }
  public void setDiasEmAtraso(Integer diasEmAtraso) {
    this.diasEmAtraso = diasEmAtraso;
  }

  
  /**
   **/
  public ContaResponse emissor(String emissor) {
    this.emissor = emissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emissor")
  public String getEmissor() {
    return emissor;
  }
  public void setEmissor(String emissor) {
    this.emissor = emissor;
  }

  
  /**
   **/
  public ContaResponse flagCancelamento(Boolean flagCancelamento) {
    this.flagCancelamento = flagCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagCancelamento")
  public Boolean getFlagCancelamento() {
    return flagCancelamento;
  }
  public void setFlagCancelamento(Boolean flagCancelamento) {
    this.flagCancelamento = flagCancelamento;
  }

  
  /**
   **/
  public ContaResponse formaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("formaEnvioFatura")
  public String getFormaEnvioFatura() {
    return formaEnvioFatura;
  }
  public void setFormaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
  }

  
  /**
   **/
  public ContaResponse idBandeira(Integer idBandeira) {
    this.idBandeira = idBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idBandeira")
  public Integer getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Integer idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   **/
  public ContaResponse idConta(Integer idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idConta")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  public ContaResponse idEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idEmissor")
  public Integer getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   **/
  public ContaResponse idEndereco(Integer idEndereco) {
    this.idEndereco = idEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idEndereco")
  public Integer getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Integer idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   **/
  public ContaResponse idFantasiaBasica(Integer idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idFantasiaBasica")
  public Integer getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Integer idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   **/
  public ContaResponse idOrigemComercial(Integer idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idOrigemComercial")
  public Integer getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Integer idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   **/
  public ContaResponse idProduto(Integer idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idProduto")
  public Integer getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Integer idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   **/
  public ContaResponse idProposta(Integer idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idProposta")
  public Integer getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Integer idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   **/
  public ContaResponse melhorDia(Integer melhorDia) {
    this.melhorDia = melhorDia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("melhorDia")
  public Integer getMelhorDia() {
    return melhorDia;
  }
  public void setMelhorDia(Integer melhorDia) {
    this.melhorDia = melhorDia;
  }

  
  /**
   **/
  public ContaResponse nomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeCredor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   **/
  public ContaResponse nomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeProduto")
  public String getNomeProduto() {
    return nomeProduto;
  }
  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  
  /**
   **/
  public ContaResponse numCelularSMS(String numCelularSMS) {
    this.numCelularSMS = numCelularSMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numCelularSMS")
  public String getNumCelularSMS() {
    return numCelularSMS;
  }
  public void setNumCelularSMS(String numCelularSMS) {
    this.numCelularSMS = numCelularSMS;
  }

  
  /**
   **/
  public ContaResponse pagamentos(Double pagamentos) {
    this.pagamentos = pagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pagamentos")
  public Double getPagamentos() {
    return pagamentos;
  }
  public void setPagamentos(Double pagamentos) {
    this.pagamentos = pagamentos;
  }

  
  /**
   **/
  public ContaResponse permiteRefinanciamento(Boolean permiteRefinanciamento) {
    this.permiteRefinanciamento = permiteRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("permiteRefinanciamento")
  public Boolean getPermiteRefinanciamento() {
    return permiteRefinanciamento;
  }
  public void setPermiteRefinanciamento(Boolean permiteRefinanciamento) {
    this.permiteRefinanciamento = permiteRefinanciamento;
  }

  
  /**
   **/
  public ContaResponse pessoaFisica(PessoaFisicaResponse pessoaFisica) {
    this.pessoaFisica = pessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pessoaFisica")
  public PessoaFisicaResponse getPessoaFisica() {
    return pessoaFisica;
  }
  public void setPessoaFisica(PessoaFisicaResponse pessoaFisica) {
    this.pessoaFisica = pessoaFisica;
  }

  
  /**
   **/
  public ContaResponse quantidadePagamentos(Integer quantidadePagamentos) {
    this.quantidadePagamentos = quantidadePagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantidadePagamentos")
  public Integer getQuantidadePagamentos() {
    return quantidadePagamentos;
  }
  public void setQuantidadePagamentos(Integer quantidadePagamentos) {
    this.quantidadePagamentos = quantidadePagamentos;
  }

  
  /**
   **/
  public ContaResponse saldoLimite(SaldoLimiteResponse saldoLimite) {
    this.saldoLimite = saldoLimite;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("saldoLimite")
  public SaldoLimiteResponse getSaldoLimite() {
    return saldoLimite;
  }
  public void setSaldoLimite(SaldoLimiteResponse saldoLimite) {
    this.saldoLimite = saldoLimite;
  }

  
  /**
   **/
  public ContaResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   **/
  public ContaResponse statusData(Date statusData) {
    this.statusData = statusData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusData")
  public Date getStatusData() {
    return statusData;
  }
  public void setStatusData(Date statusData) {
    this.statusData = statusData;
  }

  
  /**
   **/
  public ContaResponse taxaRefinanciamento(String taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("taxaRefinanciamento")
  public String getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(String taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   **/
  public ContaResponse vcto(String vcto) {
    this.vcto = vcto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vcto")
  public String getVcto() {
    return vcto;
  }
  public void setVcto(String vcto) {
    this.vcto = vcto;
  }

  
  /**
   **/
  public ContaResponse vencimento1(Integer vencimento1) {
    this.vencimento1 = vencimento1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vencimento1")
  public Integer getVencimento1() {
    return vencimento1;
  }
  public void setVencimento1(Integer vencimento1) {
    this.vencimento1 = vencimento1;
  }

  
  /**
   **/
  public ContaResponse vinculoOrigemUsuario(Boolean vinculoOrigemUsuario) {
    this.vinculoOrigemUsuario = vinculoOrigemUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vinculoOrigemUsuario")
  public Boolean getVinculoOrigemUsuario() {
    return vinculoOrigemUsuario;
  }
  public void setVinculoOrigemUsuario(Boolean vinculoOrigemUsuario) {
    this.vinculoOrigemUsuario = vinculoOrigemUsuario;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaResponse contaResponse = (ContaResponse) o;
    return Objects.equals(this.bin, contaResponse.bin) &&
        Objects.equals(this.cartao, contaResponse.cartao) &&
        Objects.equals(this.dataCadastramento, contaResponse.dataCadastramento) &&
        Objects.equals(this.dataUltimoPagamento, contaResponse.dataUltimoPagamento) &&
        Objects.equals(this.dataVencCobranca, contaResponse.dataVencCobranca) &&
        Objects.equals(this.dddcelularSMS, contaResponse.dddcelularSMS) &&
        Objects.equals(this.descricaoStatus, contaResponse.descricaoStatus) &&
        Objects.equals(this.diasEmAtraso, contaResponse.diasEmAtraso) &&
        Objects.equals(this.emissor, contaResponse.emissor) &&
        Objects.equals(this.flagCancelamento, contaResponse.flagCancelamento) &&
        Objects.equals(this.formaEnvioFatura, contaResponse.formaEnvioFatura) &&
        Objects.equals(this.idBandeira, contaResponse.idBandeira) &&
        Objects.equals(this.idConta, contaResponse.idConta) &&
        Objects.equals(this.idEmissor, contaResponse.idEmissor) &&
        Objects.equals(this.idEndereco, contaResponse.idEndereco) &&
        Objects.equals(this.idFantasiaBasica, contaResponse.idFantasiaBasica) &&
        Objects.equals(this.idOrigemComercial, contaResponse.idOrigemComercial) &&
        Objects.equals(this.idProduto, contaResponse.idProduto) &&
        Objects.equals(this.idProposta, contaResponse.idProposta) &&
        Objects.equals(this.melhorDia, contaResponse.melhorDia) &&
        Objects.equals(this.nomeCredor, contaResponse.nomeCredor) &&
        Objects.equals(this.nomeProduto, contaResponse.nomeProduto) &&
        Objects.equals(this.numCelularSMS, contaResponse.numCelularSMS) &&
        Objects.equals(this.pagamentos, contaResponse.pagamentos) &&
        Objects.equals(this.permiteRefinanciamento, contaResponse.permiteRefinanciamento) &&
        Objects.equals(this.pessoaFisica, contaResponse.pessoaFisica) &&
        Objects.equals(this.quantidadePagamentos, contaResponse.quantidadePagamentos) &&
        Objects.equals(this.saldoLimite, contaResponse.saldoLimite) &&
        Objects.equals(this.status, contaResponse.status) &&
        Objects.equals(this.statusData, contaResponse.statusData) &&
        Objects.equals(this.taxaRefinanciamento, contaResponse.taxaRefinanciamento) &&
        Objects.equals(this.vcto, contaResponse.vcto) &&
        Objects.equals(this.vencimento1, contaResponse.vencimento1) &&
        Objects.equals(this.vinculoOrigemUsuario, contaResponse.vinculoOrigemUsuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bin, cartao, dataCadastramento, dataUltimoPagamento, dataVencCobranca, dddcelularSMS, descricaoStatus, diasEmAtraso, emissor, flagCancelamento, formaEnvioFatura, idBandeira, idConta, idEmissor, idEndereco, idFantasiaBasica, idOrigemComercial, idProduto, idProposta, melhorDia, nomeCredor, nomeProduto, numCelularSMS, pagamentos, permiteRefinanciamento, pessoaFisica, quantidadePagamentos, saldoLimite, status, statusData, taxaRefinanciamento, vcto, vencimento1, vinculoOrigemUsuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaResponse {\n");
    
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    dataCadastramento: ").append(toIndentedString(dataCadastramento)).append("\n");
    sb.append("    dataUltimoPagamento: ").append(toIndentedString(dataUltimoPagamento)).append("\n");
    sb.append("    dataVencCobranca: ").append(toIndentedString(dataVencCobranca)).append("\n");
    sb.append("    dddcelularSMS: ").append(toIndentedString(dddcelularSMS)).append("\n");
    sb.append("    descricaoStatus: ").append(toIndentedString(descricaoStatus)).append("\n");
    sb.append("    diasEmAtraso: ").append(toIndentedString(diasEmAtraso)).append("\n");
    sb.append("    emissor: ").append(toIndentedString(emissor)).append("\n");
    sb.append("    flagCancelamento: ").append(toIndentedString(flagCancelamento)).append("\n");
    sb.append("    formaEnvioFatura: ").append(toIndentedString(formaEnvioFatura)).append("\n");
    sb.append("    idBandeira: ").append(toIndentedString(idBandeira)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    idEndereco: ").append(toIndentedString(idEndereco)).append("\n");
    sb.append("    idFantasiaBasica: ").append(toIndentedString(idFantasiaBasica)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    melhorDia: ").append(toIndentedString(melhorDia)).append("\n");
    sb.append("    nomeCredor: ").append(toIndentedString(nomeCredor)).append("\n");
    sb.append("    nomeProduto: ").append(toIndentedString(nomeProduto)).append("\n");
    sb.append("    numCelularSMS: ").append(toIndentedString(numCelularSMS)).append("\n");
    sb.append("    pagamentos: ").append(toIndentedString(pagamentos)).append("\n");
    sb.append("    permiteRefinanciamento: ").append(toIndentedString(permiteRefinanciamento)).append("\n");
    sb.append("    pessoaFisica: ").append(toIndentedString(pessoaFisica)).append("\n");
    sb.append("    quantidadePagamentos: ").append(toIndentedString(quantidadePagamentos)).append("\n");
    sb.append("    saldoLimite: ").append(toIndentedString(saldoLimite)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusData: ").append(toIndentedString(statusData)).append("\n");
    sb.append("    taxaRefinanciamento: ").append(toIndentedString(taxaRefinanciamento)).append("\n");
    sb.append("    vcto: ").append(toIndentedString(vcto)).append("\n");
    sb.append("    vencimento1: ").append(toIndentedString(vencimento1)).append("\n");
    sb.append("    vinculoOrigemUsuario: ").append(toIndentedString(vinculoOrigemUsuario)).append("\n");
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



