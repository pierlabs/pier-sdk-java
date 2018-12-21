package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ConsultaCadastroEstabelecimentoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{estabelecimento_update_description}}}
 **/

@ApiModel(description = "{{{estabelecimento_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EstabelecimentoUpdate   {
  
  private Integer flagMatriz = null;
  private String nome = null;
  private String descricao = null;
  private String nomeFantasia = null;
  private String cep = null;
  private String nomeLogradouro = null;
  private Integer numeroEndereco = null;
  private String bairro = null;
  private String cidade = null;
  private String complemento = null;
  private String uf = null;
  private String cep2 = null;
  private String nomeLogradouro2 = null;
  private Integer numeroEndereco2 = null;
  private String bairro2 = null;
  private String cidade2 = null;
  private String complemento2 = null;
  private String uf2 = null;
  private String obs = null;
  private String contato = null;
  private String email = null;
  private Integer flagArquivoSecrFazenda = null;
  private Integer flagCartaoDigitado = null;
  private Integer inativo = null;
  private Long idMoeda = null;
  private Long idPais = null;
  private Integer associadoSPCBrasil = null;
  private Long mcc = null;
  private Long idTipoEstabelecimento = null;
  private Integer correspondencia = null;
  private String cargoContato = null;


  public enum TipoPagamentoEnum {
    CENTRALIZADO("CENTRALIZADO"),
    PV("PV");

    private String value;

    TipoPagamentoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoPagamentoEnum tipoPagamento = null;
  private ConsultaCadastroEstabelecimentoDTO consulta = null;
  private ConsultaCadastroEstabelecimentoDTO consulta2 = null;
  private ConsultaCadastroEstabelecimentoDTO consulta3 = null;

  
  /**
   * {{{estabelecimento_update_flag_matriz_value}}}
   **/
  public EstabelecimentoUpdate flagMatriz(Integer flagMatriz) {
    this.flagMatriz = flagMatriz;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_flag_matriz_value}}}")
  @JsonProperty("flagMatriz")
  public Integer getFlagMatriz() {
    return flagMatriz;
  }
  public void setFlagMatriz(Integer flagMatriz) {
    this.flagMatriz = flagMatriz;
  }

  
  /**
   * {{{estabelecimento_update_nome_value}}}
   **/
  public EstabelecimentoUpdate nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{estabelecimento_update_descricao_value}}}
   **/
  public EstabelecimentoUpdate descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{estabelecimento_update_nome_fantasia_value}}}
   **/
  public EstabelecimentoUpdate nomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_nome_fantasia_value}}}")
  @JsonProperty("nomeFantasia")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * {{{estabelecimento_update_cep_value}}}
   **/
  public EstabelecimentoUpdate cep(String cep) {
    this.cep = cep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_cep_value}}}")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{estabelecimento_update_nome_logradouro_value}}}
   **/
  public EstabelecimentoUpdate nomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_nome_logradouro_value}}}")
  @JsonProperty("nomeLogradouro")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * {{{estabelecimento_update_numero_endereco_value}}}
   **/
  public EstabelecimentoUpdate numeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_numero_endereco_value}}}")
  @JsonProperty("numeroEndereco")
  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * {{{estabelecimento_update_bairro_value}}}
   **/
  public EstabelecimentoUpdate bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_bairro_value}}}")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{estabelecimento_update_cidade_value}}}
   **/
  public EstabelecimentoUpdate cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_cidade_value}}}")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{estabelecimento_update_complemento_value}}}
   **/
  public EstabelecimentoUpdate complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_complemento_value}}}")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * {{{estabelecimento_update_uf_value}}}
   **/
  public EstabelecimentoUpdate uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_uf_value}}}")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{estabelecimento_update_cep2_value}}}
   **/
  public EstabelecimentoUpdate cep2(String cep2) {
    this.cep2 = cep2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_cep2_value}}}")
  @JsonProperty("cep2")
  public String getCep2() {
    return cep2;
  }
  public void setCep2(String cep2) {
    this.cep2 = cep2;
  }

  
  /**
   * {{{estabelecimento_update_nome_logradouro2_value}}}
   **/
  public EstabelecimentoUpdate nomeLogradouro2(String nomeLogradouro2) {
    this.nomeLogradouro2 = nomeLogradouro2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_nome_logradouro2_value}}}")
  @JsonProperty("nomeLogradouro2")
  public String getNomeLogradouro2() {
    return nomeLogradouro2;
  }
  public void setNomeLogradouro2(String nomeLogradouro2) {
    this.nomeLogradouro2 = nomeLogradouro2;
  }

  
  /**
   * {{{estabelecimento_update_numero_endereco2_value}}}
   **/
  public EstabelecimentoUpdate numeroEndereco2(Integer numeroEndereco2) {
    this.numeroEndereco2 = numeroEndereco2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_numero_endereco2_value}}}")
  @JsonProperty("numeroEndereco2")
  public Integer getNumeroEndereco2() {
    return numeroEndereco2;
  }
  public void setNumeroEndereco2(Integer numeroEndereco2) {
    this.numeroEndereco2 = numeroEndereco2;
  }

  
  /**
   * {{{estabelecimento_update_bairro2_value}}}
   **/
  public EstabelecimentoUpdate bairro2(String bairro2) {
    this.bairro2 = bairro2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_bairro2_value}}}")
  @JsonProperty("bairro2")
  public String getBairro2() {
    return bairro2;
  }
  public void setBairro2(String bairro2) {
    this.bairro2 = bairro2;
  }

  
  /**
   * {{{estabelecimento_update_cidade2_value}}}
   **/
  public EstabelecimentoUpdate cidade2(String cidade2) {
    this.cidade2 = cidade2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_cidade2_value}}}")
  @JsonProperty("cidade2")
  public String getCidade2() {
    return cidade2;
  }
  public void setCidade2(String cidade2) {
    this.cidade2 = cidade2;
  }

  
  /**
   * {{{estabelecimento_update_complemento2_value}}}
   **/
  public EstabelecimentoUpdate complemento2(String complemento2) {
    this.complemento2 = complemento2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_complemento2_value}}}")
  @JsonProperty("complemento2")
  public String getComplemento2() {
    return complemento2;
  }
  public void setComplemento2(String complemento2) {
    this.complemento2 = complemento2;
  }

  
  /**
   * {{{estabelecimento_update_uf2_value}}}
   **/
  public EstabelecimentoUpdate uf2(String uf2) {
    this.uf2 = uf2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_uf2_value}}}")
  @JsonProperty("uf2")
  public String getUf2() {
    return uf2;
  }
  public void setUf2(String uf2) {
    this.uf2 = uf2;
  }

  
  /**
   * {{{estabelecimento_update_obs_value}}}
   **/
  public EstabelecimentoUpdate obs(String obs) {
    this.obs = obs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_obs_value}}}")
  @JsonProperty("obs")
  public String getObs() {
    return obs;
  }
  public void setObs(String obs) {
    this.obs = obs;
  }

  
  /**
   * {{{estabelecimento_update_contato_value}}}
   **/
  public EstabelecimentoUpdate contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_contato_value}}}")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * {{{estabelecimento_update_email_value}}}
   **/
  public EstabelecimentoUpdate email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{estabelecimento_update_flag_arquivo_secr_fazenda_value}}}
   **/
  public EstabelecimentoUpdate flagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_flag_arquivo_secr_fazenda_value}}}")
  @JsonProperty("flagArquivoSecrFazenda")
  public Integer getFlagArquivoSecrFazenda() {
    return flagArquivoSecrFazenda;
  }
  public void setFlagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
  }

  
  /**
   * {{{estabelecimento_update_flag_cartao_digitado_value}}}
   **/
  public EstabelecimentoUpdate flagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_flag_cartao_digitado_value}}}")
  @JsonProperty("flagCartaoDigitado")
  public Integer getFlagCartaoDigitado() {
    return flagCartaoDigitado;
  }
  public void setFlagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
  }

  
  /**
   * {{{estabelecimento_update_inativo_value}}}
   **/
  public EstabelecimentoUpdate inativo(Integer inativo) {
    this.inativo = inativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_inativo_value}}}")
  @JsonProperty("inativo")
  public Integer getInativo() {
    return inativo;
  }
  public void setInativo(Integer inativo) {
    this.inativo = inativo;
  }

  
  /**
   * {{{estabelecimento_update_id_moeda_value}}}
   **/
  public EstabelecimentoUpdate idMoeda(Long idMoeda) {
    this.idMoeda = idMoeda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_id_moeda_value}}}")
  @JsonProperty("idMoeda")
  public Long getIdMoeda() {
    return idMoeda;
  }
  public void setIdMoeda(Long idMoeda) {
    this.idMoeda = idMoeda;
  }

  
  /**
   * {{{estabelecimento_update_id_pais_value}}}
   **/
  public EstabelecimentoUpdate idPais(Long idPais) {
    this.idPais = idPais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_id_pais_value}}}")
  @JsonProperty("idPais")
  public Long getIdPais() {
    return idPais;
  }
  public void setIdPais(Long idPais) {
    this.idPais = idPais;
  }

  
  /**
   * {{{estabelecimento_update_associado_s_p_c_brasil_value}}}
   **/
  public EstabelecimentoUpdate associadoSPCBrasil(Integer associadoSPCBrasil) {
    this.associadoSPCBrasil = associadoSPCBrasil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_associado_s_p_c_brasil_value}}}")
  @JsonProperty("associadoSPCBrasil")
  public Integer getAssociadoSPCBrasil() {
    return associadoSPCBrasil;
  }
  public void setAssociadoSPCBrasil(Integer associadoSPCBrasil) {
    this.associadoSPCBrasil = associadoSPCBrasil;
  }

  
  /**
   * {{{estabelecimento_update_mcc_value}}}
   **/
  public EstabelecimentoUpdate mcc(Long mcc) {
    this.mcc = mcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_mcc_value}}}")
  @JsonProperty("mcc")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   * {{{estabelecimento_update_id_tipo_estabelecimento_value}}}
   **/
  public EstabelecimentoUpdate idTipoEstabelecimento(Long idTipoEstabelecimento) {
    this.idTipoEstabelecimento = idTipoEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_id_tipo_estabelecimento_value}}}")
  @JsonProperty("idTipoEstabelecimento")
  public Long getIdTipoEstabelecimento() {
    return idTipoEstabelecimento;
  }
  public void setIdTipoEstabelecimento(Long idTipoEstabelecimento) {
    this.idTipoEstabelecimento = idTipoEstabelecimento;
  }

  
  /**
   * {{{estabelecimento_update_correspondencia_value}}}
   **/
  public EstabelecimentoUpdate correspondencia(Integer correspondencia) {
    this.correspondencia = correspondencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_correspondencia_value}}}")
  @JsonProperty("correspondencia")
  public Integer getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Integer correspondencia) {
    this.correspondencia = correspondencia;
  }

  
  /**
   * {{{estabelecimento_update_cargo_contato_value}}}
   **/
  public EstabelecimentoUpdate cargoContato(String cargoContato) {
    this.cargoContato = cargoContato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_cargo_contato_value}}}")
  @JsonProperty("cargoContato")
  public String getCargoContato() {
    return cargoContato;
  }
  public void setCargoContato(String cargoContato) {
    this.cargoContato = cargoContato;
  }

  
  /**
   * {{{estabelecimento_update_tipo_pagamento_value}}}
   **/
  public EstabelecimentoUpdate tipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_tipo_pagamento_value}}}")
  @JsonProperty("tipoPagamento")
  public TipoPagamentoEnum getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  
  /**
   * {{{estabelecimento_update_consulta_value}}}
   **/
  public EstabelecimentoUpdate consulta(ConsultaCadastroEstabelecimentoDTO consulta) {
    this.consulta = consulta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_consulta_value}}}")
  @JsonProperty("consulta")
  public ConsultaCadastroEstabelecimentoDTO getConsulta() {
    return consulta;
  }
  public void setConsulta(ConsultaCadastroEstabelecimentoDTO consulta) {
    this.consulta = consulta;
  }

  
  /**
   * {{{estabelecimento_update_consulta2_value}}}
   **/
  public EstabelecimentoUpdate consulta2(ConsultaCadastroEstabelecimentoDTO consulta2) {
    this.consulta2 = consulta2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_consulta2_value}}}")
  @JsonProperty("consulta2")
  public ConsultaCadastroEstabelecimentoDTO getConsulta2() {
    return consulta2;
  }
  public void setConsulta2(ConsultaCadastroEstabelecimentoDTO consulta2) {
    this.consulta2 = consulta2;
  }

  
  /**
   * {{{estabelecimento_update_consulta3_value}}}
   **/
  public EstabelecimentoUpdate consulta3(ConsultaCadastroEstabelecimentoDTO consulta3) {
    this.consulta3 = consulta3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{estabelecimento_update_consulta3_value}}}")
  @JsonProperty("consulta3")
  public ConsultaCadastroEstabelecimentoDTO getConsulta3() {
    return consulta3;
  }
  public void setConsulta3(ConsultaCadastroEstabelecimentoDTO consulta3) {
    this.consulta3 = consulta3;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstabelecimentoUpdate estabelecimentoUpdate = (EstabelecimentoUpdate) o;
    return Objects.equals(this.flagMatriz, estabelecimentoUpdate.flagMatriz) &&
        Objects.equals(this.nome, estabelecimentoUpdate.nome) &&
        Objects.equals(this.descricao, estabelecimentoUpdate.descricao) &&
        Objects.equals(this.nomeFantasia, estabelecimentoUpdate.nomeFantasia) &&
        Objects.equals(this.cep, estabelecimentoUpdate.cep) &&
        Objects.equals(this.nomeLogradouro, estabelecimentoUpdate.nomeLogradouro) &&
        Objects.equals(this.numeroEndereco, estabelecimentoUpdate.numeroEndereco) &&
        Objects.equals(this.bairro, estabelecimentoUpdate.bairro) &&
        Objects.equals(this.cidade, estabelecimentoUpdate.cidade) &&
        Objects.equals(this.complemento, estabelecimentoUpdate.complemento) &&
        Objects.equals(this.uf, estabelecimentoUpdate.uf) &&
        Objects.equals(this.cep2, estabelecimentoUpdate.cep2) &&
        Objects.equals(this.nomeLogradouro2, estabelecimentoUpdate.nomeLogradouro2) &&
        Objects.equals(this.numeroEndereco2, estabelecimentoUpdate.numeroEndereco2) &&
        Objects.equals(this.bairro2, estabelecimentoUpdate.bairro2) &&
        Objects.equals(this.cidade2, estabelecimentoUpdate.cidade2) &&
        Objects.equals(this.complemento2, estabelecimentoUpdate.complemento2) &&
        Objects.equals(this.uf2, estabelecimentoUpdate.uf2) &&
        Objects.equals(this.obs, estabelecimentoUpdate.obs) &&
        Objects.equals(this.contato, estabelecimentoUpdate.contato) &&
        Objects.equals(this.email, estabelecimentoUpdate.email) &&
        Objects.equals(this.flagArquivoSecrFazenda, estabelecimentoUpdate.flagArquivoSecrFazenda) &&
        Objects.equals(this.flagCartaoDigitado, estabelecimentoUpdate.flagCartaoDigitado) &&
        Objects.equals(this.inativo, estabelecimentoUpdate.inativo) &&
        Objects.equals(this.idMoeda, estabelecimentoUpdate.idMoeda) &&
        Objects.equals(this.idPais, estabelecimentoUpdate.idPais) &&
        Objects.equals(this.associadoSPCBrasil, estabelecimentoUpdate.associadoSPCBrasil) &&
        Objects.equals(this.mcc, estabelecimentoUpdate.mcc) &&
        Objects.equals(this.idTipoEstabelecimento, estabelecimentoUpdate.idTipoEstabelecimento) &&
        Objects.equals(this.correspondencia, estabelecimentoUpdate.correspondencia) &&
        Objects.equals(this.cargoContato, estabelecimentoUpdate.cargoContato) &&
        Objects.equals(this.tipoPagamento, estabelecimentoUpdate.tipoPagamento) &&
        Objects.equals(this.consulta, estabelecimentoUpdate.consulta) &&
        Objects.equals(this.consulta2, estabelecimentoUpdate.consulta2) &&
        Objects.equals(this.consulta3, estabelecimentoUpdate.consulta3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagMatriz, nome, descricao, nomeFantasia, cep, nomeLogradouro, numeroEndereco, bairro, cidade, complemento, uf, cep2, nomeLogradouro2, numeroEndereco2, bairro2, cidade2, complemento2, uf2, obs, contato, email, flagArquivoSecrFazenda, flagCartaoDigitado, inativo, idMoeda, idPais, associadoSPCBrasil, mcc, idTipoEstabelecimento, correspondencia, cargoContato, tipoPagamento, consulta, consulta2, consulta3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstabelecimentoUpdate {\n");
    
    sb.append("    flagMatriz: ").append(toIndentedString(flagMatriz)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    nomeFantasia: ").append(toIndentedString(nomeFantasia)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    nomeLogradouro: ").append(toIndentedString(nomeLogradouro)).append("\n");
    sb.append("    numeroEndereco: ").append(toIndentedString(numeroEndereco)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    cep2: ").append(toIndentedString(cep2)).append("\n");
    sb.append("    nomeLogradouro2: ").append(toIndentedString(nomeLogradouro2)).append("\n");
    sb.append("    numeroEndereco2: ").append(toIndentedString(numeroEndereco2)).append("\n");
    sb.append("    bairro2: ").append(toIndentedString(bairro2)).append("\n");
    sb.append("    cidade2: ").append(toIndentedString(cidade2)).append("\n");
    sb.append("    complemento2: ").append(toIndentedString(complemento2)).append("\n");
    sb.append("    uf2: ").append(toIndentedString(uf2)).append("\n");
    sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    flagArquivoSecrFazenda: ").append(toIndentedString(flagArquivoSecrFazenda)).append("\n");
    sb.append("    flagCartaoDigitado: ").append(toIndentedString(flagCartaoDigitado)).append("\n");
    sb.append("    inativo: ").append(toIndentedString(inativo)).append("\n");
    sb.append("    idMoeda: ").append(toIndentedString(idMoeda)).append("\n");
    sb.append("    idPais: ").append(toIndentedString(idPais)).append("\n");
    sb.append("    associadoSPCBrasil: ").append(toIndentedString(associadoSPCBrasil)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    idTipoEstabelecimento: ").append(toIndentedString(idTipoEstabelecimento)).append("\n");
    sb.append("    correspondencia: ").append(toIndentedString(correspondencia)).append("\n");
    sb.append("    cargoContato: ").append(toIndentedString(cargoContato)).append("\n");
    sb.append("    tipoPagamento: ").append(toIndentedString(tipoPagamento)).append("\n");
    sb.append("    consulta: ").append(toIndentedString(consulta)).append("\n");
    sb.append("    consulta2: ").append(toIndentedString(consulta2)).append("\n");
    sb.append("    consulta3: ").append(toIndentedString(consulta3)).append("\n");
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

