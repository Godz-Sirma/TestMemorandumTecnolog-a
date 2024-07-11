public class SumaDigitos {

	public static void main(String[] args){
		Calculos.getSumaDigitos(args[0]);
        
	}
}

public class Calculos {
    public int getSumaDigitos(int numero){
        int sum = 0;

        for (int i = 0; i <= numero; i++){
            sum += sumarDigitos(i);
        }

        return sum;
    }

    public int sumarDigitos(int numero){
        while (numero > 0) {
            sum += numero % 10;
            numero = numero/10;
        }
        return suma;
    }

}