package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sabores {
    //En esta clase implementaremos el uso de ArrayList, una clase que implemneta la interfaz List


    List<String> listaSabores = List.of("Chocolate","Fresa", "Vainilla", "Chocolate");
    //Las listas nos permiten acceder a ellas mediante el index y almacenar duplicados

    //Se puede crear un arrayList a partir de una lista ya establecida
    ArrayList<String> arrayListSabores = new ArrayList<>(listaSabores);

    //O la creamos vacia y se anaden los valores
    ArrayList<String> arrayListSabores2 = new ArrayList<>();

    public void llenarArray(){
        arrayListSabores2.add("Mango");
        arrayListSabores2.add("Chocolate");
        this.asignarIdentificador();
    }

    //Asi imprimimos los elementos de una lista
    public void imprimirSabores(){
        for (String sabor : arrayListSabores2) {
            System.out.println(sabor);
        }
    }

    //teniendo esto tambien podemos generar un hashMap para relacionar los sabores con un identificador unico
    HashMap<Integer, String> inventarioSabores = new HashMap<>();

    public void asignarIdentificador( ){
        for (int i = 0; i < arrayListSabores2.size(); i++) {
            inventarioSabores.put(i + 1, arrayListSabores2.get(i)); // ID comienza en 1
        }
    }

    //imprimirSabores usando el hasmap
    public void imprimirInventario(){
        System.out.println("Inventario de sabores:");
        for (int id : inventarioSabores.keySet()) {
            System.out.println("ID: " + id + " - Sabor: " + inventarioSabores.get(id));
        }
    }


}
