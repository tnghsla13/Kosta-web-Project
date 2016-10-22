package store.logic;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryProvider {

	private static final String resource = "resource/config.xml";
	private static SqlSessionFactory factory;
	
	public static SqlSessionFactory getSessionFactory(){
		if(factory==null){
			createSqlSessionFactory();
		}
		return factory;
	}
	
	private static void createSqlSessionFactory(){
		try{
			Reader reader = Resources.getResourceAsReader(resource);
			factory = new SqlSessionFactoryBuilder().build(reader);
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}
