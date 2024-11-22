package br.com.infinityion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Solucao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_solucao;
    
    @ManyToOne
    @JoinColumn(name = "Residencia_ID", nullable = false)
    private Residencia residencia;

    private String Tipo;
    private double Valor;
    private String Classificacao;
    private String Durabilidade;
    private double Custo_Instalacao;
    
	public int getID_solucao() {
		return ID_solucao;
	}
	public void setID_solucao(int iD_solucao) {
		ID_solucao = iD_solucao;
	}
	public Residencia getResidencia() {
		return residencia;
	}
	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public String getClassificacao() {
		return Classificacao;
	}
	public void setClassificacao(String classificacao) {
		Classificacao = classificacao;
	}
	public String getDurabilidade() {
		return Durabilidade;
	}
	public void setDurabilidade(String durabilidade) {
		Durabilidade = durabilidade;
	}
	public double getCusto_Instalacao() {
		return Custo_Instalacao;
	}
	public void setCusto_Instalacao(double custo_Instalacao) {
		Custo_Instalacao = custo_Instalacao;
	}

}
