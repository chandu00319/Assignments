package in.ashokit.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employees {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom-id")
@GenericGenerator(name = "custom-id", strategy = "in.ashokit.entity.CustomIdGenerator")
	private String eid;
	private String name;
	private Double salary;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
