package br.com.infinityion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Residencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Residencia_ID;
    
    @ManyToOne
    @JoinColumn(name = "Cliente_ID", nullable = false)
    private Cliente cliente;

    private String CEP;
    private double Consumo_Energia;
    private String Nivel_Consumo;
    private String Area;
    private String Fonte_Energia;
    
	public int getResidencia_ID() {
		return Residencia_ID;
	}
	public void setResidencia_ID(int residencia_ID) {
		Residencia_ID = residencia_ID;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public double getConsumo_Energia() {
		return Consumo_Energia;
	}
	public void setConsumo_Energia(double consumo_Energia) {
		Consumo_Energia = consumo_Energia;
	}
	public String getNivel_Consumo() {
		return Nivel_Consumo;
	}
	public void setNivel_Consumo(String nivel_Consumo) {
		Nivel_Consumo = nivel_Consumo;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getFonte_Energia() {
		return Fonte_Energia;
	}
	public void setFonte_Energia(String fonte_Energia) {
		Fonte_Energia = fonte_Energia;
	}

    
}
