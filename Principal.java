package fila;

public class Principal {

	public static void main(String[] args) {
		
		Fila f =new Fila();
		
		f.entrarFila(1);
		f.entrarFila(2);
		f.entrarFila(3);
		f.entrarFila(4);
		f.entrarFila(5);
		f.listar();
		f.sairFila(1);
		f.sairFila(2);
		f.listar();
		
		
	}

}
