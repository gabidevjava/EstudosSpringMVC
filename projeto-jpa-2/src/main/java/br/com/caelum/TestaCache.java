package br.com.caelum;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.caelum.model.Produto;

public class TestaCache {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfigurator.class);
		
		EntityManagerFactory bean = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = bean.createEntityManager();
		
		Produto produto = em.find(Produto.class, 1);
		
		em.close();
	
	}

}
