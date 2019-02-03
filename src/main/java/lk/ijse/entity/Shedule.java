package lk.ijse.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="SHEDULE")
public class Shedule {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SHID",length=10)
	private Integer shId;
	@Column(name="SHDAY",length=11)
	private Integer shDay;
	@Column(name="SHTIME",length=10)
	private Integer shTime;
	
	@OneToMany(mappedBy="shedule",cascade= {CascadeType.ALL},fetch=FetchType.LAZY)
	private List<Appointment> appointment = new ArrayList<>();
	
	@OneToMany(mappedBy="shedule",cascade= {CascadeType.ALL},fetch=FetchType.LAZY)
	private List<SheduleDetails> sheduledetails = new ArrayList<>();
	
	public Shedule() {
	}

	public Shedule(Integer shId, Integer shDay, Integer shTime) {
		this.shId = shId;
		this.shDay = shDay;
		this.shTime = shTime;
	}

	public Shedule(Integer shDay, Integer shTime) {
		this.shDay = shDay;
		this.shTime = shTime;
	}

	public Integer getShId() {
		return shId;
	}

	public void setShId(Integer shId) {
		this.shId = shId;
	}

	public Integer getShDay() {
		return shDay;
	}

	public void setShDay(Integer shDay) {
		this.shDay = shDay;
	}

	public Integer getShTime() {
		return shTime;
	}

	public void setShTime(Integer shTime) {
		this.shTime = shTime;
	}

	@Override
	public String toString() {
		return "Shedule [shId=" + shId + ", shDay=" + shDay + ", shTime=" + shTime + ", appointment=" + appointment
				+ ", sheduledetails=" + sheduledetails + "]";
	}
	
	
}
