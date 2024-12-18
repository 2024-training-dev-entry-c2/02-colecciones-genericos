import data.BananaSplit;
import data.Barquilla;
import data.Producto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Primero debemos crear los objetos con los que trabajaremos
        Barquilla barquilla1 = new Barquilla();
        BananaSplit bananaSplit1 = new BananaSplit();

        //Luego creamos las listas necesarias y empezamos a setear la informacion de nuestros objetos
        List<String> listaIngredientesBarquilla = List.of("Vainilla", "Syrope de fresa");
        List<String> listaIngredientesBananaSplit = List.of("Vainilla", "Chocolate", "Fresa", "Cambur", "Crema batida");
        barquilla1.setIngredientes(listaIngredientesBarquilla);
        barquilla1.setCalorias(120.4F);
        bananaSplit1.setCalorias(410.5F);
        bananaSplit1.setIngredientes(listaIngredientesBananaSplit);

        //Creamos el objeto producto y pasamos por parametros el objeto que nosotros queremos que utilice
        Producto producto1 = new Producto(barquilla1, 200.0F, 2);
        Producto producto2 = new Producto(bananaSplit1, 300.0F, 1);

        //uso de opbjetos y sus metodos
        bananaSplit1.servirPostre();
        barquilla1.servirPostre();
        producto1.mostrarDetalles();
        producto2.mostrarDetalles();

    }
}