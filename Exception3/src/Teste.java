public class Teste {

    public static void main(String[] args) {

        CalculoMatematico calculoMatematico = new CalculoMatematico();

        try{
            calculoMatematico.divisao(4, 0);
        } catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }


    }
}
