public class CalculoMatematico {



    public int divisao (int dividendo, int divisor)throws ArithmeticException {

        if (divisor == 0){
            throw new ArithmeticException("Você está tentando dividir por 0. Não vai dar não :/");
        } else {
            return dividendo / divisor;
        }


    }
}
