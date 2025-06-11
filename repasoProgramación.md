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
- Polimorfismo: roviene del griego "poli" (muchos) y "morfos" (formas), y en programación orientada a objetos significa que un mismo método puede tener diferentes comportamientos dependiendo del objeto que lo invoque. El polimorfismo permite que diferentes clases respondan al mismo mensaje (método) de forma distinta, adaptando su comportamiento según el tipo del objeto.

> **Ejemplo:**
> La clase `Animal` puede tener un metodo `hacerSonido()`, y las clases `Perro` y `Gato ` pueden heredar de `Animal` y redifinir ese método según su comportamiento específico.
