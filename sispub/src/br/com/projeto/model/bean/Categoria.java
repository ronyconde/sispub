package br.com.projeto.model.bean;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String sigla;
	private String descricao;
	//Armazenar apanas a data, sem hora
	
	@Temporal(TemporalType.DATE)
	private Calendar dataCadastro;

	
	//Metodos de GET e SET...
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
		
	
	
	
}
