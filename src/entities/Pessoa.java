package entities;

public abstract class Pessoa {

	private String name;
	private Double annuaIncome;
	
	public Pessoa() {}

	public Pessoa(String name, Double annuaIncome) {
		this.name = name;
		this.annuaIncome = annuaIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnuaIncome() {
		return annuaIncome;
	}

	public void setAnnuaIncome(Double annuaIncome) {
		this.annuaIncome = annuaIncome;
	}
	
	public abstract double taxesPay(); 
}
