package pessoa;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Fisica fisica = new Fisica();
		Juridica juridica = new Juridica();
		
		
		
		System.out.println("Vamos cadastrar esta pessoa. Mas antes, sua pessoa é jurídica ou física? digite 'J' para jurídica e 'F' para física. \n");
		String resposta = s.nextLine();
		
		
		
		if(resposta.equalsIgnoreCase("F")) {
					
			System.out.println("Digite o nome da pessoa física: \n ");
			String nomeFisica = s.nextLine();
			fisica.setNome(nomeFisica);
			
			System.out.println("Digite o CPF: \n ");
			String cpfFisica = s.nextLine();
			fisica.setCpf(cpfFisica);
			
			System.out.println("Digite a idade: \n");
			Double idade = s.nextDouble();	
			fisica.setIdade(idade);
			
			System.out.println("Digite o sexo, 'f' ou 'feminino', 'm' ou 'masculino. \n ");
			String sexo = s.next();
			fisica.setSexo(sexo);
			
			
			
		}
		else {
			
			String nomeJuridica;
			
			System.out.println("Digite o nome da pessoa jurídica: ");
			nomeJuridica = s.nextLine();
			juridica.setNome(nomeJuridica);
			
			System.out.println("Digite o CNPJ: \n ");
			String cnpjJuridica = s.nextLine();
			juridica.setCnpj(cnpjJuridica);
			
			System.out.println("Digite a idade: \n");
			Double idadeJuridica = s.nextDouble();	
			juridica.setIdade(idadeJuridica);
			
			
			
			
		}
		
		s.close();
		
		
		
	
			System.out.println(juridica.getNome() + "\n"); 
			System.out.println(juridica.getCnpj() + "\n"); 
			System.out.println(juridica.getIdade() + "\n"); 
			System.out.println(fisica.getNome() + "\n"); 
			System.out.println(fisica.getCpf() + "\n"); 
			System.out.println(fisica.getSexo() + "\n"); 
			
		
	}
	
	


}
