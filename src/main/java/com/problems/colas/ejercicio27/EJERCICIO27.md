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
## Explicación
- Obtiene el elemento en la posición frente
- Se incrementa frente usando módulo
- Se decrementa la cantidad de elementos
- Retorna el elemento eliminado

## Recomendación
Para entender un poco mas recomendamos el video del canal de Dalia Silva.
### Agregar dato
<img width="1337" height="970" alt="image" src="https://github.com/user-attachments/assets/86264c04-3864-48fb-afcb-83305b036c83" />
link: https://www.youtube.com/watch?v=a3i4Y5Sa_p4&list=TLPQMjIwNDIwMjZrjfbjjWaBeA&index=3

### Eliminar dato
<img width="1624" height="1017" alt="image" src="https://github.com/user-attachments/assets/4047babd-e711-4b72-83a6-10bcdf8f7e4b" />
link: https://www.youtube.com/watch?v=Wv6bw2bpXas&list=TLPQMjIwNDIwMjZrjfbjjWaBeA&index=3

