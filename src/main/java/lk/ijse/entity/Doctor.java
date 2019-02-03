package lk.ijse.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DOCTOR")
public class Doctor {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="DID",length=5)
	    private Integer dId;
	    @Column(name="DNAME",length=20)
	    private String dName;
	    @Column(name="DADRESS",length=40)
	    private String dAddress;
	    @Column(name="DTELL",length=10)
	    private Integer dTp;
	    @Column(name="DSPECIALITY",length=20)
	    private String dSpeciality;
	    
	    @OneToMany(mappedBy="doctor",cascade= {CascadeType.ALL},fetch=FetchType.LAZY)
	    private List<SheduleDetails> shDetails= new ArrayList<>();

		public Doctor() {
		}

		public Doctor(Integer dId, String dName, String dAddress, Integer dTp, String dSpeciality) {
			super();
			this.dId = dId;
			this.dName = dName;
			this.dAddress = dAddress;
			this.dTp = dTp;
			this.dSpeciality = dSpeciality;
		}

		public Doctor(Integer dId, String dName, String dAddress, Integer dTp, String dSpeciality,
				List<SheduleDetails> shDetails) {
			super();
			this.dId = dId;
			this.dName = dName;
			this.dAddress = dAddress;
			this.dTp = dTp;
			this.dSpeciality = dSpeciality;
			this.shDetails = shDetails;
		}

		public Integer getdId() {
			return dId;
		}

		public void setdId(Integer dId) {
			this.dId = dId;
		}

		public String getdName() {
			return dName;
		}

		public void setdName(String dName) {
			this.dName = dName;
		}

		public String getdAddress() {
			return dAddress;
		}

		public void setdAddress(String dAddress) {
			this.dAddress = dAddress;
		}

		public Integer getdTp() {
			return dTp;
		}

		public void setdTp(Integer dTp) {
			this.dTp = dTp;
		}

		public String getdSpeciality() {
			return dSpeciality;
		}

		public void setdSpeciality(String dSpeciality) {
			this.dSpeciality = dSpeciality;
		}

		@Override
		public String toString() {
			return "Doctor [dId=" + dId + ", dName=" + dName + ", dAddress=" + dAddress + ", dTp=" + dTp
					+ ", dSpeciality=" + dSpeciality + ", shDetails=" + shDetails + "]";
		}

		
	    
	    
	    
}
