package com.example.ems;

public class Compansation {
	private String cid;
	private int basic;
	private int cash_allowance;
	private int gratuity;
	private int variable;
	private int gross;
	private int ctc;
	
	
	public Compansation() {
		
	}
	
	public Compansation(String cid,int basic,int cash_allowance,int gratuity,int variable,int gross,int ctc) {
		super();
		this.cid=cid;
		this.basic=basic;
		this.cash_allowance=cash_allowance;
		this.gratuity=gratuity;
		this.variable=variable;
		this.gross=gross;
		this.ctc=ctc;
		
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getCash_allowance() {
		return cash_allowance;
	}

	public void setCash_allowance(int cash_allowance) {
		this.cash_allowance = cash_allowance;
	}

	public int getGratuity() {
		return gratuity;
	}

	public void setGratuity(int gratuity) {
		this.gratuity = gratuity;
	}

	public int getVariable() {
		return variable;
	}

	public void setVariable(int variable) {
		this.variable = variable;
	}

	public int getGross() {
		return gross;
	}

	public void setGross(int gross) {
		this.gross = gross;
	}

	public int getCtc() {
		return ctc;
	}

	public void setCtc(int ctc) {
		this.ctc = ctc;
	}
	
	
	
}
