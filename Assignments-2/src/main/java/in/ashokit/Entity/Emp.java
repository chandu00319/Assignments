package in.ashokit.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Emp 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private String name;
	private Double Salaray;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalaray() {
		return Salaray;
	}
	public void setSalaray(Double salaray) {
		Salaray = salaray;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", Salaray=" + Salaray + "]";
	}
	
		
}
