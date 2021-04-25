package main;

import calc.SomaMultiplos;

public class MultiplosTeste {

	public static void main(String[] args) {
		int resp = SomaMultiplos.getSomaMultiplosDe3e5(10);
		System.out.println(resp);
		
		resp = SomaMultiplos.getSomaMultiplosDe3e5(100);
		System.out.println(resp);
		
		resp = SomaMultiplos.getSomaMultiplosDe3e5(-10);
		System.out.println(resp);
	}
}
