import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Teste {

    public static void main(String[] args) {


        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Cachorro");
        lista.add("Gato");

        try {
            System.out.println(lista.get(3));
        } catch (Exception exception){
            System.out.println(exception);

        } finally {
            System.out.println("Finalizou");
            System.out.println("_______________");
        }

        //Exercicio2
        // Stacktrace = onde, getClass = tipo de erro

        List<String> lista2 = null;
        try{
            lista2.add("Pato");
            lista2.add("Cachorro");
            lista2.add("Gato");
        } catch (Exception exception2){
            System.out.println(exception2);
        }


        try {
            System.out.println(lista2.get(5));
        } catch (Exception exception3){
            System.out.println(exception3);


        } finally {
            System.out.println("Finalizou");
            System.out.println("________________");
        }






    }
}
