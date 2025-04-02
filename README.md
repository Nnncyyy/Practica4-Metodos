Practica 4


### PRÁCTICA 1 - GESTOR DE CONTACTOS

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

### Versión en C

### Versión en Java


### PRÁCTICA 3: JUEGO DE ADIVINANZA

### Introducción al programa

### Versión en C

### Versión en Java




