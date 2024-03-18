package in.ashokit.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.Entity.Emp;

public interface Emprepo extends JpaRepository<Emp,Integer> {

	
	
	@Query(value="select  e.eid,e.salaray,e.name,a.id,a.dist,a.state,a.city from emp e, Address a where e.eid=a.eid",nativeQuery=true )
	public List<Object[]> getemps();
	
	@Query(value="select  eid,salaray,name,id,dist,state,city from emp natural join Address",nativeQuery=true)
	public List<Object[]> InnerJoin();
	
}