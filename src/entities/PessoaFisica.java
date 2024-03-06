package entities;

public class PessoaFisica extends Pessoa {
	
	private Double healthExpenditures;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double annuaIncome, Double healthExpenditures) {
		super(name, annuaIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxesPay() {
		double re = 0;
		if(getAnnuaIncome() < 20000.00 && getHealthExpenditures() > 0.0){
			re = getAnnuaIncome();//falta termina esse metodo
		}else {
			
		}
		return re;
	}
}
