
public class Ex1_OrdemInversa {
	/*
	Crie um vetor de 6 números inteiros
	e mostre-os na ordem inversa.
	*/
	public static void main(String[] args) {
		
		int[] vetor = {0,1,2,3,4,5};
		int count = 0;
		
		while(count < (vetor.length)) {
			System.out.print(vetor[count]+ " ");
			count++;
			
		}
		System.out.println();
		
		for (int i = (vetor.length-1); i >= 0; i--) {
			System.out.print(vetor[i]+ " ");
		}
		
		

		
		
		

	}

}
