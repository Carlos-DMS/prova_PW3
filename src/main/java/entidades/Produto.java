package entidades;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.protobuf.TextFormat.ParseException;


@Entity
@Table(name="PRODUTO")
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	private Integer codBarra;
	private String nome;
	private String marca;
	private Integer qtdProduto;
	private LocalDate dtCadastro;
	
	public Produto(){}
	
	public Produto(Integer codBarra, String nome, String marca, Integer qtdProduto, LocalDate dtCadastro) {
		this.codBarra = codBarra;
		this.nome = nome;
		this.marca = marca;
		this.qtdProduto = qtdProduto;
		this.dtCadastro = dtCadastro;
	}
	
	public Integer getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(Integer codBarra) {
		this.codBarra = codBarra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(Integer qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public LocalDate getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(LocalDate dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Produto codBarra=" + codBarra + ", nome=" + nome + ", marca=" + marca + ", qtdProduto=" + qtdProduto
				+ ", dtCadastro=" + dtCadastro;
	}
	
	
}
	
	

	
	