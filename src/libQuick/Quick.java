package libQuick;

public class Quick {

	public Quick() {
		super();
	}
	
	public int[] sort(int[] arr, int inicial, int fim) {
		if(fim>inicial) {
			int pivoFixed = division(arr, inicial, fim);
			sort(arr, inicial, pivoFixed - 1); //Esquerda
			sort(arr, pivoFixed + 1, fim); //Direita
		}
		
		return arr;
 	}
	
	private int division(int[] arr, int inicial, int fim) {
		int pivo = arr[inicial]; //Pivo
		int esquerda = inicial + 1; //Ponteiro da Esquerda
		int direita = fim; //Ponteiro da Direita
		
		while(esquerda <= direita) {
			while(esquerda <= direita && arr[esquerda] <= pivo) {
				esquerda++;
			}
			while(direita >= esquerda && arr[direita] > pivo) {
				direita--;
			}
			
			if(esquerda < direita) {
				swap(arr, esquerda, direita);
				esquerda++;
				direita--;
			}
		}
		
		swap(arr, inicial, direita);
		return direita;
		
	}

	private void swap(int[] arr, int i, int j) {
		int aux;
		
		aux = arr[i];
		arr[i] = arr[j];
		arr[j] = aux;
		
	}

}
