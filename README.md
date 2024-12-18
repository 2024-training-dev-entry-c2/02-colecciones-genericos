# Colecciones y Genericos

Los tipos genéricos permiten especificar un tipo como parámetro cuando defines clases, interfaces o métodos. En lugar de trabajar con un tipo específico (como String, Integer), puedes usar un "tipo comodín" que se concreta al momento de la ejecución.

Los tipos genéricos en Java son una característica introducida en Java 5 que permite a los programadores escribir clases, interfaces y métodos que operan sobre tipos parametrizados. Esto proporciona un mecanismo para asegurarse de que el código sea seguro en tiempo de compilación, al mismo tiempo que permite mayor flexibilidad y re-usabilidad.






## Recomendaciones importantes sobre genericos

- Light/dark mode toggle
- Live previews
- Fullscreen mode
- Cross platform

## Colecciones

En el contexto de una heladería, podemos aplicar diferentes colecciones para modelar escenarios prácticos relacionados con la gestión de productos, clientes, pedidos y más. En este repositorio econtraras un ejemplo de cómo usar ArrayList, HashSet, PriorityQueue y HashMap en una heladería.

- Listas
  
List.of(...): Este método crea una lista inmutable de los elementos proporcionados.
Si intentas agregar o eliminar elementos de List.of, obtendrás una excepción.

ArrayList<>(listaSabores): El constructor de ArrayList copia los elementos de la lista original, creando un nuevo ArrayList independiente.


- HashSet
  
Un HashSet es una clase de Java que implementa la interfaz Set, y se utiliza para almacenar elementos únicos (no permite duplicados). Está basado en una tabla hash y ofrece un rendimiento eficiente para operaciones básicas como agregar, eliminar y buscar elementos.

Características principales del HashSet:

No permite duplicados: Si intentas agregar un elemento que ya existe, será ignorado.

No garantiza orden: Los elementos no se almacenan en un orden específico. Si necesitas orden, debes usar otra colección como TreeSet.

- LinkedList
  
LinkedList es eficiente para eliminar el primer elemento (poll) y agregar elementos al final (add).

Permite manejar la estructura como una cola, una lista, o incluso una pila (con métodos como push y pop).

Representa una cola de clientes de manera intuitiva.


- HashMap
HashMap proporciona una búsqueda, inserción y eliminación de elementos muy eficiente, generalmente en tiempo constante.

Ideal para casos donde necesitas acceder a los datos por clave.
