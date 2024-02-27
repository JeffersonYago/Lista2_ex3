package controller;

public class ParesVetoresController {

	public ParesVetoresController() {
		super();
	}
	public int ParesVet(int[] vet, int tamanho, int cont) {
		if (tamanho < 0) {
			return cont;
		}else{
			if (vet[tamanho] % 2 == 0) {
				cont++;
			}
			return ParesVet(vet, tamanho - 1, cont);
		}
	}
}
