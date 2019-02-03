package lk.ijse.entity;

import javax.persistence.*;

@Entity
@Table(name="APPOINTMENT")
public class Appointment {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="AID",length=10)
	    private Integer aId;
	    @Column(name="ADATE",length=11)
	    private String aDate;
	    @Column(name="ATIME",length=10)
	    private String aTime;
	    
	    @ManyToOne(cascade= {CascadeType.ALL},fetch=FetchType.LAZY)
	    @JoinColumn(name="PID")
	    private Patient patient;
	    
	    @ManyToOne(cascade= {CascadeType.ALL},fetch=FetchType.LAZY)
	    @JoinColumn(name="SHID")
	    private Shedule shedule;
	    
	    public Appointment() {
		}

		public Appointment(Integer aId, String aDate, String aTime, Patient patient, Shedule shedule) {
			this.aId = aId;
			this.aDate = aDate;
			this.aTime = aTime;
			this.patient = patient;
			this.shedule = shedule;
		}

		public Appointment(String aDate, String aTime, Patient patient, Shedule shedule) {
			this.aDate = aDate;
			this.aTime = aTime;
			this.patient = patient;
			this.shedule = shedule;
		}

		public Integer getaId() {
			return aId;
		}

		public void setaId(Integer aId) {
			this.aId = aId;
		}

		public String getaDate() {
			return aDate;
		}

		public void setaDate(String aDate) {
			this.aDate = aDate;
		}

		public String getaTime() {
			return aTime;
		}

		public void setaTime(String aTime) {
			this.aTime = aTime;
		}

		public Patient getPatient() {
			return patient;
		}

		public void setPatient(Patient patient) {
			this.patient = patient;
		}

		public Shedule getShedule() {
			return shedule;
		}

		public void setShedule(Shedule shedule) {
			this.shedule = shedule;
		}

		@Override
		public String toString() {
			return "Appointment [aId=" + aId + ", aDate=" + aDate + ", aTime=" + aTime + ", patient=" + patient
					+ ", shedule=" + shedule + "]";
		}
		
	    
	    
}
