package lk.ijse.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="PATIENT")
public class Patient {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="PID",length=5)
	    private Integer pId;
	    @Column(name="PNAME",length=20)
	    private String pName;
	    @Column(name="PADDRESS",length=40)
	    private String pAddress;
	    @Column(name="PTELL",length=10)
	    private Integer pTp;
	    
	    
	    @OneToMany(mappedBy="patient",cascade= {CascadeType.ALL},fetch=FetchType.LAZY)
	    private List<Appointment> appointment= new ArrayList<>();


		public Patient() {
			
		}


		public Patient(Integer pId, String pName, String pAddress, Integer pTp, List<Appointment> appointment) {
			this.pId = pId;
			this.pName = pName;
			this.pAddress = pAddress;
			this.pTp = pTp;
			this.appointment = appointment;
		}


		public Patient(Integer pId, String pName, String pAddress, Integer pTp) {
			this.pId = pId;
			this.pName = pName;
			this.pAddress = pAddress;
			this.pTp = pTp;
		}


		public Integer getpId() {
			return pId;
		}


		public void setpId(Integer pId) {
			this.pId = pId;
		}


		public String getpName() {
			return pName;
		}


		public void setpName(String pName) {
			this.pName = pName;
		}


		public String getpAddress() {
			return pAddress;
		}


		public void setpAddress(String pAddress) {
			this.pAddress = pAddress;
		}


		public Integer getpTp() {
			return pTp;
		}


		public void setpTp(Integer pTp) {
			this.pTp = pTp;
		}


		@Override
		public String toString() {
			return "Patient [pId=" + pId + ", pName=" + pName + ", pAddress=" + pAddress + ", pTp=" + pTp
					+ ", appointment=" + appointment + "]";
		}
		
	    
	    
}
