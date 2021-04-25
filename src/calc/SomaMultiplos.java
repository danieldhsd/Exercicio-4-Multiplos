package calc;

public class SomaMultiplos {

	public static int getSomaMultiplosDe3e5(int maxNumber) {
		int soma = 0;

		if(maxNumber <= 0)
			return soma;
		
		for(int i = 1; i < maxNumber; i++) {
			if(i % 3 == 0 || i % 5 == 0)
				soma += i;
		}
		
		return soma;
	}
}
