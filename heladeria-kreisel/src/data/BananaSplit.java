package data;

import java.util.List;

public class BananaSplit extends Postre {

    public BananaSplit() {
    }

    @Override
    public void servirPostre() {
        System.out.println("El banana split se ha servido en una copa con los siguientes ingredientes: ");
        List<String> listaIngredientes = super.getIngredientes();
        listaIngredientes.forEach(System.out::println);
    }
}
