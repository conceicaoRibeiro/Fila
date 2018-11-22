package fila;

public class Fila {

	No fila_final;
	
	public void entrarFila(int n){
		No novo_no = new No(n);
		
		novo_no.proximo = fila_final;
		fila_final = novo_no;
	}
	
	public int sairFila(int n) {
		No aux = fila_final;
		if (aux == null) {
			System.out.println("Fila vazia");
			return -1;
		} else {
			while (aux.proximo != null) {
				aux = aux.proximo;
			}
			if (aux == fila_final) {
				fila_final = null;
			} else {
				No aux2;
				aux2 = fila_final;
				while (aux2.proximo != aux) {
					aux2 = aux2.proximo;
				}
				aux2.proximo = null;
			}
		
		}
		return aux.conteudo;

	}
	
		
		public void listar(){
			No aux = fila_final;
			String fila = " ";
			
			while(aux != null){
				fila = fila + "-" + aux.conteudo;
				aux = aux.proximo;
			}
			System.out.println(fila);
		}
		
		
		
}

