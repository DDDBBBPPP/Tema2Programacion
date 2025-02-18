package tema11;

public class TruquitoEnigmatico {


/*
        ARRAYLIST


1. **Añadir elementos**
   - `add(elemento)`: Añade el elemento al final de la lista.
   - `add(posicion, elemento)`: Inserta el elemento en la posición indicada, desplazando el resto hacia la derecha. Si la posición no existe → `IndexOutOfBoundsException`.
   addAll(otra coleccion)

2. **Eliminar elementos**
   - `remove(posicion)`: Elimina el elemento en la posición indicada y desplaza los elementos restantes a la izquierda. Si la posición no existe → `IndexOutOfBoundsException`.
   - `remove(elemento)`: Elimina la primera aparición del elemento en la lista, desplazando los elementos restantes a la izquierda.
   - `removeIf(filtro)`: Elimina los elementos que cumplan una condición dada.

3. **Consultar elementos**
   - `get(posicion)`: Devuelve el elemento en la posición indicada. Si la posición no existe → `IndexOutOfBoundsException`.
   - `contains(elemento)`: Devuelve `true` si el elemento está en la lista, `false` en caso contrario.
   - `indexOf(elemento)`: Devuelve la posición de la primera aparición del elemento en la lista. Si no se encuentra, devuelve `-1`.

4. **Modificar elementos**
   - `set(posicion, elemento)`: Sustituye el valor en la posición indicada por otro elemento. Si la posición no existe → `IndexOutOfBoundsException`.

5. **Otros métodos importantes**
   - `clear()`: Elimina todos los elementos pero no borra la lista.
   - `isEmpty()`: Devuelve `true` si la lista está vacía, `false` en caso contrario.
   - `size()`: Devuelve el número de elementos en la colección.
   - `toArray()`: Convierte el ArrayList en un array.


        HASHSET


1. **Añadir elementos**
   - `add(valor)`: Añade un elemento al HashSet. Si ya existe, no se añade.

2. **Eliminar elementos**
   - `remove(valor)`: Elimina el elemento si existe.

3. **Consultar elementos**
   - `contains(valor)`: Devuelve `true` si el elemento está en el HashSet, `false` en caso contrario.

4. **Tamaño y estado**
   - `size()`: Devuelve el número de elementos en el HashSet.
   - `isEmpty()`: Devuelve `true` si el HashSet está vacío, `false` en caso contrario.

5. **Operaciones con colecciones**
   - `clear()`: Elimina todos los elementos del HashSet.
   - `toArray()`: Convierte el HashSet en un array.
   - `addAll(coleccion)`: Añade todos los elementos de otra colección al HashSet. JUNTA LOS DOS.
   - `retainAll(coleccion)`: Conserva solo los elementos que están en ambas colecciones. DEJA LOS COMUNES
   - `removeAll(coleccion)`: Elimina del HashSet todos los elementos de la colección dada. Ahora hacemos la diferencia ELIMINA LOS COMUNES
   - `equals(coleccion)`: Devuelve `true` si el HashSet y la colección dada contienen los mismos elementos.


        HASHMAP

1. **Obtener y modificar elementos**
size();
isEmpty()
   - `get(clave)`: Devuelve el valor asociado a la clave dada. Si no existe, devuelve `null`.
   - `put(clave, valor)`: Asigna un valor a una clave. Si la clave ya existe, sobrescribe el valor anterior.
   remove(clave) mapa.remove("A"); // Elimina la clave "A" y su valor asociado (10)
   remove (clave,valor) mapa.remove("B", 30); // No elimina nada porque "B" tiene 20, no 30
mapa.remove("B", 20); // Ahora sí elimina la clave "B"


2. **Recuperar conjuntos de datos**
   - `keySet()`: Devuelve un `Set` con todas las claves del HashMap.
   - `values()`: Devuelve una colección con todos los valores del HashMap.
   - `entrySet()`: Devuelve un `Set` de pares clave-valor (`Map.Entry`).

3. **Verificación de claves**
   - `containsKey(clave)`: Devuelve `true` si la clave existe en el HashMap.

4. **Operaciones con `Map.Entry` (para recorrer el `entrySet()`)**
   - `getKey()`: Devuelve la clave del par clave-valor.
   - `getValue()`: Devuelve el valor del par clave-valor.

*/


}