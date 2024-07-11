public class CalculoIMC {

	public static void main(String[] args){
		Calculos.getIMC(args[0], args[1]);

	}
}

public class Calculos {
    private final float INFRAPESO = 18,5;
    private final float NORMAL = 25,0;
    private final float SOBREPESO = 30;

    public String getIMC(float peso, altura){
        float imc = peso/(altura*altura);
        if (imc<= this.INFRAPESO){
            return new String("Infrapeso");

        }else if (imc>this.INFRAPESO && imc<= this.NORMAL){
            return new String("Nomalr");

        }else if (imc>this.NORMAL && imc <=this.SOBREPESO){
            return new String("Sobrepeso");

        }else if (imc> this.SOBREPESO){
            return new String("Obeso");
        }
    }

}