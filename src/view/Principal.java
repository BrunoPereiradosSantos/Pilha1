package view;

import br.edu.fateczl.brunosantos.Pilha;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		p.push(1);
		p.push(2);
		try {
			int valor = p.pop();
			System.out.println("o valor removido foi: " + valor);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		int tam = p.size();
		System.out.println("o tamanho é: " + tam);
		try {
			int topo = p.top();
			System.out.println("O topo é: " + topo);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
