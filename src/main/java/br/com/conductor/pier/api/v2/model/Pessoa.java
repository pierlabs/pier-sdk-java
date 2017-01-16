package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * Pessoa
 **/

@ApiModel(description = "Pessoa")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class Pessoa   {
  
  private Long id = null;
  private String nome = null;
  private String tipo = null;
  private String cpf = null;
  private String cnpj = null;
  private Date dataNascimento = null;
  private String sexo = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id).
   **/
  public Pessoa id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)'.
   **/
  public Pessoa nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)'.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo da Pessoa, sendo: (\"PF\": Pessoa F\u00C3\u00ADsica), (\"PJ\": Pessoa Jur\u00C3\u00ADdica).
   **/
  public Pessoa tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo da Pessoa, sendo: (\"PF\": Pessoa F\u00C3\u00ADsica), (\"PJ\": Pessoa Jur\u00C3\u00ADdica).")
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * N\u00C3\u00BAmero do CPF, quando PF.
   **/
  public Pessoa cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do CPF, quando PF.")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * N\u00C3\u00BAmero do CNPJ, quando PJ.
   **/
  public Pessoa cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do CNPJ, quando PJ.")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ.
   **/
  public Pessoa dataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ.")
  @JsonProperty("dataNascimento")
  public Date getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino), (\"O\": Outro), (\"N\": N\u00C3\u00A3o Especificado).
   **/
  public Pessoa sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino), (\"O\": Outro), (\"N\": N\u00C3\u00A3o Especificado).")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pessoa pessoa = (Pessoa) o;
    return Objects.equals(this.id, pessoa.id) &&
        Objects.equals(this.nome, pessoa.nome) &&
        Objects.equals(this.tipo, pessoa.tipo) &&
        Objects.equals(this.cpf, pessoa.cpf) &&
        Objects.equals(this.cnpj, pessoa.cnpj) &&
        Objects.equals(this.dataNascimento, pessoa.dataNascimento) &&
        Objects.equals(this.sexo, pessoa.sexo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, tipo, cpf, cnpj, dataNascimento, sexo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pessoa {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
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



