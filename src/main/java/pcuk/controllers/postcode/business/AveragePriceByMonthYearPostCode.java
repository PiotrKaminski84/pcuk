package pcuk.controllers.postcode.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avg_price")
public class AveragePriceByMonthYearPostCode {

	public String postCode;
	public int year;
	public int month;
	public int noTransactions;
	public double averagePrice;

	public String getPostCode() {
		return postCode;
	}

	@Id
	@Column(name="post_code")
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public int getYear() {
		return year;
	}

	@Id
	@Column(name="year")
	public void setYear(int year) {
		this.year = year;
	}

	@Id
	@Column(name="month")
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getNoTransactions() {
		return noTransactions;
	}
	
	@Column(name="no_of_transactions")
	public void setNoTransactions(int noTransactions) {
		this.noTransactions = noTransactions;
	}

	public double getAveragePrice() {
		return averagePrice;
	}

	@Column(name="avg_price")
	public void setAveragePrice(double averagePrice) {
		this.averagePrice = averagePrice;
	}

}
