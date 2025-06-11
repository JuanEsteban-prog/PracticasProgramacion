### Abstracción

- Es un proceso el cúal solo se enfoca en lo escencial, por lo que oculta detalles inecesarios.
- En programación orientada a objetos, esto signfica modelar las clases basándose en las características y comportamientos relevantes del mundo real.

> **Ejemplo:**  
> Un objeto `Auto` puede tener métodos como `acelerar()` o `frenar()` sin que el usuario necesite saber cómo funciona el motor internamente.

### Encapsulación

- Consiste en ocultar los detalles internos de un objeto y restringir el acceso directo a ellos.
- Para lograrlo se utilizan modificadores de acceso como ` private`, ` public`, ` protected` y métodos getters y setters para interactuar con estos datos.

> **Ejemplo:**
> Una clase `Cuenta Bancaria` puede tener un atributo `saldo` privado y métodos `depositar()` y `retirar()` que controlan su modificación, evitando el acceso directo al saldo desde afuera de la clase.

### Jerarquización

- Es el principio que permite organizar las clases en una estructura de herencia, donde una clase hija hereda atributos y métodos de una clase padre.
- Esto permite la reutilización del código, la extensión de funcionalidades y el uso del polimorfismo.
- Polimorfismo: roviene del griego "poli" (muchos) y "morfos" (formas), y en programación orientada a objetoszsignifica que un mismo método puede tener diferentes comportamientos dependiendo del objeto que lo invoque. El polimorfismo permite que diferentes clases respondan al mismo mensaje (método) de forma distinta, adaptando su comportamiento según el tipo del objeto.

> **Ejemplo:**
> La clase `Animal` puede tener un metodo `hacerSonido()`, y las clases `Perro` y `Gato ` pueden heredar de `Animal` y redifinir ese método según su comportamiento específico.

### Modularidad

- Es la capacidad de dividir un programa en partes o módulos independientes y reutilizables, cada uno con una funcionalidad específica.
- Permite un desarrollo más organizado, facilita el mantenimiento y mejora la colaboración entre distintos desarrolladores.

> **Ejemplo:**
> En una aplicación de compras en línea se pueden tener módulos separados como `Usuario`, `Prodcuto`, `Carrito` y `Pago`, cada uno con su propio conjunto de clases y responsabilidades.

### Diagramas PlantUML

- Es una herramienta que permite crear diagramas UML(como diagramas de clases, casos de uso, secuencia, etc) usando texto. Son útiles para:
  - Modelar estructuras de clases orientadas a objetos.
  - Documentar los sistemas antes y durante el desarrollo.
  - Generar diagramas rápidamente sin arrastar y soltar elementos gráficos.
  - Mantener los diagramas dentro del proyecto, en archivos `.puml`

Para usarlo dentro de Visual Studio

```.puml
@startuml

abstract class Persona {
  +nombre: String
  +edad: int
  +hablar(): void
}

class Alumno {
  +matricula: String
}

class Profesor {
  +numeroEmpleado: int
}

Persona <|-- Alumno
Persona <|-- Profesor
Alumno --> Profesor : asiste a

@enduml

```
