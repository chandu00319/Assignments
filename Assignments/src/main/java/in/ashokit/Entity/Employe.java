package in.ashokit.Entity;

import java.time.LocalDate;
import java.util.Arrays;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
@Entity
@Table(name="EMp")
public class Employe {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private double salary;
	
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] photo;
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] pdf;
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(insertable = false)
	@CreationTimestamp
	private LocalDate updatedate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getPdf() {
		return pdf;
	}
	public void setPdf(byte[] pdf) {
		this.pdf = pdf;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(LocalDate updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + ", photo=" + Arrays.toString(photo)
				+ ", pdf=" + Arrays.toString(pdf) + ", createdDate=" + createdDate + ", updatedate=" + updatedate + "]";
	}
	
	
}