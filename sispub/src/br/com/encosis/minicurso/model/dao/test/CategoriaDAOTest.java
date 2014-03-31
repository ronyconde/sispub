package br.com.encosis.minicurso.model.dao.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import javax.persistence.EntityManager;

import junit.framework.Assert;

import org.junit.Test;
import br.com.encosis.minicurso.model.bean.Categoria;
import br.com.encosis.minicurso.model.dao.JPAUtil;
import br.com.encosis.minicurso.model.dao.CategoriaDAO;

public class CategoriaDAOTest {

	@Test
	public void testCadastrar() {
		// Solicitacao de conexao ao SGBD
		EntityManager entityManager = JPAUtil.getEntityManager();
		CategoriaDAO dao = new CategoriaDAO(entityManager);
		// Inicio da transacao
		entityManager.getTransaction().begin();
		// Criacao de um novo produto
		Categoria categoria = new Categoria();
		categoria.setSigla("NPA");
		categoria.setDescricao("Norma Padrão de Ação");
		categoria.setDataCadastro(Calendar.getInstance());
		
		//Execucao do cadastro
		dao.cadastrar(categoria);
		//Fechamento da conexao
		entityManager.getTransaction().commit();
		entityManager.close();
		
		//Realização do teste de cadastro
		Assert.assertNotNull(categoria.getId());
	}

	// Continuacao...
	@Test
	public void testAlterar() {
		fail("Not yet implemented");
	}

	@Test
	public void testExcluir() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsultar() {
		fail("Not yet implemented");
	}

	@Test
	public void testListar() {
		fail("Not yet implemented");
	}

}
