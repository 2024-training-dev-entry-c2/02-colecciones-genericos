package data;

import java.util.List;

public class Barquilla extends Postre {

    public static final String TIPO = "Barquilla";

    public Barquilla() {
    }

    @Override
    public void servirPostre() {
        System.out.println("La barquilla se ha servido con los siguientes ingredientes: ");
        List<String> listaIngredientes = super.getIngredientes();
        listaIngredientes.forEach(System.out::println);
    }

    @Override
    public String mostrarDetalleCalorias() {
        return "La barquilla tiene " + super.getCalorias() + " calorias.";
    }

    @Override
    public String devolverTipo() {
        return TIPO;
    }
}
