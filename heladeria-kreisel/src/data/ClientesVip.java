package data;

import java.util.HashSet;

public class ClientesVip {
    //en esta clase utilizamos la clase HashSet que implementa la interfaz Set, porque esta no permite duplicados
     private HashSet<String> clientesVIP = new HashSet<>();
     private String clienteABuscar = "María";

     public HashSet<String> llenarHash(HashSet<String> clientesVIP ){
         clientesVIP.add("Juan");
         clientesVIP.add("María");
         clientesVIP.add("Carlos");
         clientesVIP.add("Juan"); //notaras como el IDE ya lo ha marcado como un elemento SET duplicado
         return clientesVIP;
     }

     public Boolean isClient(String clienteABuscar, HashSet<String> clientesVIP){

         if (clientesVIP.contains(clienteABuscar)) {
             System.out.println(clienteABuscar + " es un cliente VIP.");
             return true;
         } else {
             System.out.println(clienteABuscar + " no es un cliente VIP.");
             return false;
         }
     }

    // Eliminar un cliente VIP
    public void elminarClienteVIP(HashSet<String> clientesVIP){
        clientesVIP.remove("Carlos");
    }

//Las operaciones básicas (add, remove, contains) tienen una complejidad promedio de O(1) debido al uso de una tabla hash.
}
