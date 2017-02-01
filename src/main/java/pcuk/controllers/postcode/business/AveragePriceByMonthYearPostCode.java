package pcuk.controllers.postcode.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avg_price")
public class AveragePriceByMonthYearPostCode {

	public int id;
	public String postCode;
	public int year;
	public int month;
	public int noTransactions;
	public double averagePrice;
	
	@Id
	@Column(name="id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="post_code")	
	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	@Column(name="year")
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	
	@Column(name="month")
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	@Column(name="no_of_transactions")
	public int getNoTransactions() {
		return noTransactions;
	}


	public void setNoTransactions(int noTransactions) {
		this.noTransactions = noTransactions;
	}
	@Column(name="avg_price")
	public double getAveragePrice() {
		return averagePrice;
	}


	public void setAveragePrice(double averagePrice) {
		this.averagePrice = averagePrice;
	}

	public void print() {
		System.out.println(postCode + " " + averagePrice + " paid" + month );

	}

}
