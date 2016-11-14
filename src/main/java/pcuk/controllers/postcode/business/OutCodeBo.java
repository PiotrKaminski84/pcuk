package pcuk.controllers.postcode.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="outcodepostcodes")
public class OutCodeBo {
	
	private int id;
	private String outCode;
	private Double latitude;
	
	@Id
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="outcode")
	public String getOutCode() {
		return outCode;
	}
	public void setOutCode(String outcode) {
		this.outCode = outcode;
	}
	@Column(name="lat")
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	@Column(name="lng")
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	private Double longitude;

}
