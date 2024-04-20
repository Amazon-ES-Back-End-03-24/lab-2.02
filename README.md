![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Java Introducción al Testing

## Introducción

Acabamos de aprender la importancia de una buena cobertura de pruebas y el papel del TDD (Desarrollo Guiado por Pruebas), así que practiquemos un poco más.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

1. Empleando TDD, crea un método que tome un número entero n y devuelva una array de todos los números impares de 1 a n.
    - *¡Escribe tus tests primero!*
2. Java tiene ciertas palabras que se consideran "palabras clave de Java". Las palabras clave están reservadas y no se pueden usar como nombres de variables. Empleando TDD, crea un método que tome un String y devuelva `true` si el String contiene cualquier palabra clave de Java.
    - Por ejemplo, `break` es una palabra clave de Java. La cadena `"Don't break my heart"` debería devolver *true*. La cadena `"I love to breakdance"` debería devolver *false*.
    - *Tendrás que usar Google para encontrar una lista de todas las palabras clave de Java.*
3. Crea una clase abstracta llamada `Player` para representar a un jugador en un juego de video. Define las siguientes propiedades: salud, fuerza y vidas.
    - Crea getters y setters para cada propiedad.
    - Añade un constructor para inicializar las propiedades con los valores pasados.
    - Añade un método `decrementLive()` que disminuye las vidas en 1 y restaura la salud a su valor original. Si las vidas son menores o iguales a 0, imprimir "Este personaje está muerto".
    - Añade un método `attack(Player playerToAttack)` que disminuye la salud del jugador, pasado como argumento, por la fuerza del jugador actual.
    - Añade un método `checkHealth()` que verifica si la salud del jugador actual es menor o igual a 0, si es así, llama al método `decrementLive()`.
4. Crea tres subclases de Player - `Warrior`, `Elf` y `Wizard`.
    - La clase `Warrior` debería tener una propiedad adicional de fuerza y un método `convertToElf()` que devuelva una instancia de la clase Elf con las propiedades del guerrero actual.
    - La clase `Elf` debería tener una propiedad adicional `speed`.
    - La clase `Wizard` debería tener una propiedad adicional `spell` y un método `convertToElf()` que devuelva una instancia de la clase Elf con las propiedades del mago actual.
5. Agrega todas los tests necesarias.

<br>  