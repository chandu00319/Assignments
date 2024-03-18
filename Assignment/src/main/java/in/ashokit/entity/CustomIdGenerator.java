package in.ashokit.entity;

import java.io.Serializable;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator {
	

	    private static int counter = 1;

	    
	    @Override
	    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
	        return "AIT" + counter++;
	    }
	   

	    
}
