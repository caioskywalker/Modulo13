package pessoa;

public abstract class Pessoa {
	
	private String nome;
	private Double idade;
	private String sexo;
	
	//Fisica fisica = new Fisica();
	//Juridica juridica = new Juridica();
	//Programa programa = new Programa();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getIdade() {
		return idade;
	}

	public void setIdade(Double idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		
		if(sexo.equalsIgnoreCase("F")) {
			this.sexo = "Feminino";
		}
		else if(sexo.equalsIgnoreCase("M")) {
			this.sexo = "Masculino";
		}
		else {
			this.sexo = "Indefinido";
		}
		
		}
		
	}


	
	
	
	
	



	

