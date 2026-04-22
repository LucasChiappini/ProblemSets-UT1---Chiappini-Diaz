# Ejercicio 18 

## Comportamientos definidos

Se definieron dos formas de retirar elementos de la lista:

### 1. Quitar

Permite remover un elemento de la lista y devolverlo para su reutilización.

* Entrada: una condición de búsqueda (`Predicate`)
* Salida: el elemento encontrado o `null` si no existe

### 2. Eliminar

Permite remover un elemento de la lista sin devolverlo.

* Entrada: una condición de búsqueda (`Predicate`)
* Salida: `true` si se eliminó, `false` si no se encontró

## Consideraciones

* Es necesario actualizar correctamente el enlace entre nodos para mantener la estructura.
* Si se elimina el primer elemento, se debe actualizar el puntero `primero`.
* Se deben evitar referencias nulas para prevenir errores.

## Conclusión

Se implementaron dos operaciones según la necesidad: reutilizar el elemento (quitar) o eliminarlo definitivamente (eliminar), permitiendo una gestión flexible de la lista.
