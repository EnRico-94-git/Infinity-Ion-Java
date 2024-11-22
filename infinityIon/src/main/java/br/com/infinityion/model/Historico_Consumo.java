package br.com.infinityion.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Historico_Consumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hist_consumo_ID;
    
    @ManyToOne
    @JoinColumn(name = "Residencia_ID", nullable = false)
    private Residencia residencia;

    private String Data;
    private double Consumo_Energia;
    
	public int getHist_consumo_ID() {
		return hist_consumo_ID;
	}
	public void setHist_consumo_ID(int hist_consumo_ID) {
		this.hist_consumo_ID = hist_consumo_ID;
	}
	public Residencia getResidencia() {
		return residencia;
	}
	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public double getConsumo_Energia() {
		return Consumo_Energia;
	}
	public void setConsumo_Energia(double consumo_Energia) {
		Consumo_Energia = consumo_Energia;
	}

}
