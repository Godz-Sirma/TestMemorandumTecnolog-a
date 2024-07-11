public class MoviendoCeros {

	public static void main(String[] args){
		Calculos.mueveCeros(args);
	}
}

public class Calculos {
    public String[] mueveCeros(String arrayEntrada){
        ArrayList<String> arrayListAux = new ArrayList<>

        if(arrayEntrada.lenght <= 1){
            return arrayEntrada;
        }else{
            for(String valor : arrayEntrada){
                if(esNumero(valor)){
                    if(Integer.parseInt(string) != 0){
                        arrayListAux.add(valor);
                    }
                }selse{
                    arrayListAux.add(valor);
                }
            }
            while(arrayListAux.size<arrayListEntrada){
                arrayListAux.add(new String("0"));
            }
        }

        return arrayListAux.toArray(new String[arrayListAux.size()]);
    }

    private boolean esNumero(String string){
        try{
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    } 

}