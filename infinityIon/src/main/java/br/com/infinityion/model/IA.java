package br.com.infinityion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class IA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ia_ID;
    
    @ManyToOne
    @JoinColumn(name = "Historico_Consumo_ID", nullable = false)
    private Historico_Consumo historicoConsumo;

    private String Tipo;
    private String Data_Analise;
    private String Resultado_Analise;
    
    
	public int getIa_ID() {
		return ia_ID;
	}
	public void setIa_ID(int ia_ID) {
		this.ia_ID = ia_ID;
	}
	public Historico_Consumo getHistoricoConsumo() {
		return historicoConsumo;
	}
	public void setHistoricoConsumo(Historico_Consumo historicoConsumo) {
		this.historicoConsumo = historicoConsumo;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getData_Analise() {
		return Data_Analise;
	}
	public void setData_Analise(String data_Analise) {
		Data_Analise = data_Analise;
	}
	public String getResultado_Analise() {
		return Resultado_Analise;
	}
	public void setResultado_Analise(String resultado_Analise) {
		Resultado_Analise = resultado_Analise;
	}
}
