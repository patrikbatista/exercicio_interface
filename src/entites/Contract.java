package entites;

import java.util.Date;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;
	private Installment installment;
	
	public Contract(Integer number, Date date, Double totalValue, Installment installment) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installment = installment;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
		
	
}
