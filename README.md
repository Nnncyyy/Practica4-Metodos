# PRÁCTICA 4

### PRÁCTICA 1: GESTOR DE CONTACTOS

###  Introducción al Programa
Este programa implementa una agenda de contactos, permitiendo al usuario agregar, buscar, eliminar y listar contactos. Cada contacto almacena información como nombre, teléfono y correo electrónico.
El programa fue desarrollado en dos versiones: C y Java, cada una con distintas características y enfoques de implementación.

### Versión en C
La versión en C se basa en una estructura tradicional y funcional, usando structs y arreglos estáticos para almacenar los contactos.

✅ Características principales:
- Usa una estructura *struct agenda* para representar cada contacto.
- Almacena los contactos en un arreglo de tamaño fijo (100 contactos máximo).
- Implementa la gestión de contactos mediante funciones tradicionales.
- Usa archivos de texto (.txt) para almacenar los contactos, empleando:  *fopen()*, *fprintf()* y *fscanf()*.
- La eliminación de contactos se hace sobrescribiendo los datos, lo que puede generar espacios vacíos en la memoria.

⚠️ Limitaciones:
- La cantidad de contactos es fija y no escalable (máximo 100).
- No hay manejo eficiente de errores (si un archivo no se encuentra, el programa puede fallar abruptamente).
- El código es menos modular, lo que puede dificultar futuras modificaciones o ampliaciones.

### Versión en Java
La versión en Java es una mejora significativa en términos de flexibilidad, escalabilidad y manejo de errores, gracias a la Programación Orientada a Objetos (POO).

✅ Características principales:
- Uso de clases y objetos para una estructura más organizada.
- Métodos bien definidos (*agregarContacto()*, *buscarContacto()*, *eliminarContacto()*, *mostrarContactos()*).
- Manejo de archivos con *FileWriter* y *Scanner*, permitiendo una mejor gestión de la información almacenada.
- Eliminación eficiente de contactos sin dejar espacios vacíos.
- Manejo de excepciones (*try-catch*), evitando fallos inesperados en la ejecución.

💡 Mejoras respecto a la versión en C:
- Código más modular y reutilizable: Gracias a la Programación Orientada a Objetos.
- Mayor seguridad y control de errores: Se usan excepciones para manejar archivos y errores del usuario.

### Conclusión
Ambas versiones cumplen la misma función de gestionar una agenda de contactos, pero la versión en Java ofrece una implementación más moderna, eficiente y flexible.
Si bien la versión en C es funcional, la versión en Java es más adaptable y fácil de expandir en caso de querer agregar nuevas características, como un menú gráfico o sincronización en la nube.

### PRÁCTICA 2: SISTEMA DE ESTUDIANTES

### Introducción al programa
El siguiente documento presenta dos versiones de un sistema de registro de estudiantes en Java. Ambas implementaciones permiten realizar operaciones básicas, como agregar, mostrar, buscar y eliminar estudiantes de un arreglo.

### Primer versión
✅ Características Principales
- Todo el código está dentro del método main, lo que hace que sea menos modular.
- La entrada de datos y las operaciones están mezcladas, reduciendo la claridad.
- Uso de un arreglo fijo para almacenar estudiantes.
- Presenta un error en el bucle de búsqueda de estudiantes

💡Mejoras:
- Código más compacto y fácil de seguir para principiantes.
- No requiere múltiples métodos, lo que simplifica su estructura inicial.
- Menos dependencias y menor sobrecarga de funciones.

⚠️Limitaciones:
- Falta de modularidad, lo que dificulta la escalabilidad del código.
- Menor claridad debido a la mezcla de lógica en un solo método.
- Errores en el bucle de búsqueda de estudiantes, lo que puede generar fallos en la ejecución.

### Segunda versión
✅ Características Principales
- Organiza la lógica en métodos separados (registrarEstudiante, mostrarEstudiantes, buscarEstudiante, eliminarEstudiante).
- Utiliza un constructor en la clase Estudiantes para facilitar la creación de objetos.
- Mejora la modularidad y reutilización del código.
- Corrige errores en la búsqueda de estudiantes y optimiza la eliminación.
- Mejora la legibilidad al separar el menú en un método independiente.

💡Mejoras:
- Mayor claridad y facilidad de mantenimiento.
- Separación de responsabilidades en funciones específicas.
- Corrección de errores y mejor manejo de estructuras de control.

⚠️Limitaciones:
- Ambas versiones utilizan un arreglo de tamaño fijo, lo que podría mejorarse con estructuras dinámicas como ArrayList.
- Falta validación de datos para evitar entradas incorrectas o duplicadas.

### Conclusión
La segunda versión ofrece una mejora significativa en la organización del código, haciéndolo más modular y fácil de mantener. Sin embargo, aún puede optimizarse utilizando estructuras de datos más flexibles y validaciones adicionales para un sistema más robusto.



### PRÁCTICA 3: JUEGO DE ADIVINANZA

### Introducción al programa
El siguiente documento describe el funcionamiento y la estructura del código del "Juego de Adivinanza" en Java. Este programa genera un número aleatorio entre 1 y 100 y le permite al usuario intentar adivinarlo en un número limitado de intentos, proporcionando pistas según la dificultad elegida.


✅ Características Principales
- Uso de la clase *Random* para generar un número aleatorio entre 1 y 100.
- Implementación de un método separado adivinar_numero para manejar la lógica del juego.
- Control de errores en la entrada del usuario, asegurando que ingrese valores válidos.
- Dos niveles de dificultad:
    - Fácil: Rango de pistas más amplio.
    - Difícil: Rango de pistas más reducido.

- Pistas ajustadas dinámicamente después de cada intento fallido.
- Uso de *try (Scanner scanner = new Scanner(System.in))* para manejar la entrada del usuario de manera eficiente.

💡Mejoras:
Método adivinar_numero
  El método adivinar_numero es el encargado de gestionar la interacción del usuario con el juego:
    - Ajusta los rangos iniciales de pistas según la dificultad elegida.
    - Se asegura de que los valores del rango se mantengan dentro del límite de 1 a 100.
    - Solicita al usuario un número y valida su entrada.
    - Verifica si el usuario ha adivinado el número, terminando el juego en caso de acierto.
    - Si el usuario falla, reduce los intentos disponibles y proporciona una pista ajustando el rango.
    - Si los intentos se agotan, muestra el número correcto.

- Implementar una estructura dinámica como ArrayList para almacenar los intentos previos.
- Agregar una opción de "Volver a jugar" sin necesidad de reiniciar el programa.
- Mejorar la generación de pistas para que sean más adaptativas según el progreso del jugador.
- Utilizar un sistema de niveles o puntuaciones.

⚠️Limitaciones:
- El rango de pistas puede reducirse demasiado rápido en algunos casos.
- No hay control para evitar que el usuario ingrese el mismo número repetidamente.
- El juego termina al agotar los intentos sin posibilidad de reiniciar en la misma ejecución.

### Conclusión
El juego de adivinanza en Java ofrece una experiencia simple pero entretenida, con una estructura modular gracias al uso del método *adivinar_numero*. Aunque cuenta con un sistema básico de pistas y control de errores, puede optimizarse con mejoras en la generación de pistas, control de repeticiones y opciones de reinicio.

### Planner: 
[Gestor Plannner - Microsoft](https://planner.cloud.microsoft/webui/plan/i3dWxSCM70-yFXcRwXqotWQAEkOc/view/grid?tid=f94bf4d9-8097-4794-adf6-a5466ca28563)




