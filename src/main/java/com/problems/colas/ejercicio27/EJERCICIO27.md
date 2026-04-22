# Ejercicio 27

## Descripción
Se implementan las operaciones básicas de una cola circular utilizando un vector (arreglo).  
La estructura utiliza los siguientes elementos:

- `cola`: arreglo donde se almacenan los elementos  
- `frente`: índice del primer elemento  
- `fin`: índice donde se inserta el nuevo elemento  
- `tam`: tamaño máximo del arreglo  
- `cantidad`: cantidad de elementos actuales  

---

## 1. Operación: PoneEnCola(unElemento)

```pseudocódigo
Algoritmo PoneEnCola

    Si cantidad = tam Entonces
        Escribir "Cola llena"
    SiNo
        cola[fin] <- unElemento
        fin <- (fin + 1) mod tam
        cantidad <- cantidad + 1
    FinSi

FinAlgoritmo
```
### Explicación
- Inserta un elemento en la posición fin
- Se incrementa fin usando módulo para mantener la circularidad
- Se incrementa la cantidad de elementos


## 2. Operación: QuitaDeCola(unElemento)
```pseudocódigo
Algoritmo QuitaDeCola

    Si cantidad = 0 Entonces
        Escribir "Cola vacia"
    SiNo
        elemento <- cola[frente]
        frente <- (frente + 1) mod tam
        cantidad <- cantidad - 1
        Retornar elemento
    FinSi

FinAlgoritmo
```
### Explicación
- Obtiene el elemento en la posición frente
- Se incrementa frente usando módulo
- Se decrementa la cantidad de elementos
- Retorna el elemento eliminado
