package pcuk.controllers.postcode.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="postcodelatlng")
public class PostCodeBo {
	
	private int id;
	private String postCode;
	private Double latitude;
	private Double longitude;
	
	
	//@Column(name="postcode")
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	//@Column(name="latitude")
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double lattitude) {
		this.latitude = lattitude;
	}
	//@Column(name="longitude")
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	@Id
	//@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
