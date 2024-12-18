package data;

import java.util.List;

public class Barquilla extends Postre {

    public Barquilla() {
    }

    public void servirPostre() {
        System.out.println("La barquilla se ha servido con los siguientes ingredientes: ");
        List<String> listaIngredientes = super.getIngredientes();
        listaIngredientes.forEach(System.out::println);
    }
}
