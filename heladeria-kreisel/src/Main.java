import data.BananaSplit;
import data.Barquilla;
import data.Producto;
import data.Sabores;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

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

        //implementemos un linkedList para manejar una cola de clientes
        LinkedList<String> colaClientes = new LinkedList<>();

        // clientes llegan a la heladería
        colaClientes.add("Juan");
        colaClientes.add("María");
        colaClientes.add("Carlos");
        System.out.println("-------------------------------------------------------------");
        // mostrar la cola actual
        System.out.println("Cola de clientes: " + colaClientes);

        // atender al primer cliente (eliminar de la cabeza de la lista)
        String clienteAtendido = colaClientes.poll();
        System.out.println("Atendiendo a: " + clienteAtendido);

        // mostrar la cola después de atender al cliente
        System.out.println("Cola de clientes después de atender: " + colaClientes);

        // ver quién es el próximo cliente en ser atendido (sin eliminarlo)
        String siguienteCliente = colaClientes.peek();
        System.out.println("Próximo cliente a atender: " + siguienteCliente);

        // agregar un nuevo cliente
        colaClientes.add("Lucía");
        System.out.println("Cola de clientes después de agregar a Lucía: " + colaClientes);

        // atender al resto de los clientes
        while (!colaClientes.isEmpty()) {
            System.out.println("Atendiendo a: " + colaClientes.poll());
        }

        // Mostrar la cola al final
        System.out.println("Cola de clientes vacía: " + colaClientes);

        Sabores inventarioSabores = new Sabores();
        inventarioSabores.llenarArray();
        inventarioSabores.imprimirSabores();
        inventarioSabores.imprimirInventario();

    }

    }
