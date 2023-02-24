package model;

import java.util.Iterator;

public class Prueba {
	public static void main(String[] args) {
		int[]arreglo = {5,2,4,1,3,45,6,8,9};
		int temp;
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				if(arreglo[i]<arreglo[j]) {
					temp = arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]+"v"+i);
		}
	}

}
