package in.ashokit.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String  city;
private String Dist;
private String State;
private Integer eid;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDist() {
	return Dist;
}
public void setDist(String dist) {
	Dist = dist;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
@Override
public String toString() {
	return "Address [id=" + id + ", city=" + city + ", Dist=" + Dist + ", State=" + State + ", eid=" + eid + "]";
}



}
