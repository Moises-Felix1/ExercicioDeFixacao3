package entities;

public class PessoaJuridica extends Pessoa{
	
	private Integer numberEmployees;
	
	public PessoaJuridica(){
		super();
	}
	
	public PessoaJuridica(String name, Double annuaIncome, Integer numberEmployees) {
		super(name, annuaIncome);
		this.numberEmployees = numberEmployees;
	}
	
	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public final double taxesPay() {
		double re = 0.0;
		if(getNumberEmployees() <= 10) {
			re = getAnnuaIncome() * 0.16;
		}else {
			re = getAnnuaIncome() * 0.14;
		}
		return re;
	}

}
