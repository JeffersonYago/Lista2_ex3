package main;

import javax.swing.JOptionPane;

import controller.ParesVetoresController;

public class Principal {

	public static void main(String[] args) {
		ParesVetoresController pvt = new ParesVetoresController();
		int[] vet = new int [5];
		for(int i = 0; i < 5; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("insira um número maior que zero"));
			if (vet[i] <= 0) {
				vet[i] = Integer.parseInt(JOptionPane.showInputDialog("insira um número maior que zero!"));
			}
		}
		int tamanho = vet.length-1;
		int cont = 0;
		int res = pvt.ParesVet(vet, tamanho, cont);
		System.out.println(res);
	}

}
