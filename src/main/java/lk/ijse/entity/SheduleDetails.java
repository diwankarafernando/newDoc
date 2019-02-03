package lk.ijse.entity;

import javax.persistence.*;

@Entity
@Table(name="SHEDULEDETAILS")
public class SheduleDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SHDID",length=10)
	private Integer shdId;
	@Column(name="INTIME",length=10)
	private Integer inTime;
	@Column(name="OUTTIME",length=10)
	private Integer outTime;
	
	@ManyToOne(cascade= {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "SHID")
    private Shedule shedule;
	
	@ManyToOne(cascade= {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "DID")
    private Doctor doctor;
	
	public SheduleDetails() {
	}

	public SheduleDetails(Integer shdId, Integer inTime, Integer outTime, Shedule shedule, Doctor doctor) {
		this.shdId = shdId;
		this.inTime = inTime;
		this.outTime = outTime;
		this.shedule = shedule;
		this.doctor = doctor;
	}

	public SheduleDetails(Integer inTime, Integer outTime, Shedule shedule, Doctor doctor) {
		this.inTime = inTime;
		this.outTime = outTime;
		this.shedule = shedule;
		this.doctor = doctor;
	}

	public Integer getShdId() {
		return shdId;
	}

	public void setShdId(Integer shdId) {
		this.shdId = shdId;
	}

	public Integer getInTime() {
		return inTime;
	}

	public void setInTime(Integer inTime) {
		this.inTime = inTime;
	}

	public Integer getOutTime() {
		return outTime;
	}

	public void setOutTime(Integer outTime) {
		this.outTime = outTime;
	}

	public Shedule getShedule() {
		return shedule;
	}

	public void setShedule(Shedule shedule) {
		this.shedule = shedule;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "SheduleDetails [shdId=" + shdId + ", inTime=" + inTime + ", outTime=" + outTime + ", shedule=" + shedule
				+ ", doctor=" + doctor + "]";
	}
	
	
}
