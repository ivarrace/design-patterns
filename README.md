# Design patterns

En este proyecto se pueden ver ejemplos de código (en Java) aplicando cada uno de los patrones de diseño definidos en el libro [Design Patterns: Elements of Reusable Object-Oriented Software](https://en.wikipedia.org/wiki/Design_Patterns)

## Estructura del proyecto

El proyecto se estructura en paquetes que contienen cada uno de los patrones de diseño agrupados en las tres categorías definidas en el libro.

- Creational Design Patterns - `com.ivarrace.patterns.creational`
- Structural Design Patterns - `com.ivarrace.patterns.structural`
- Behavior Design Patterns - `com.ivarrace.patterns.behavior`

En cada uno de estos, se encuentran los sub paquetes con la siguiente estructura:

`{design-pattern}.examples.{example-name}`

También se definen test unitarios para cada patrón (siguiendo la misma estructura de paquetes)

## Ejecutando las pruebas

Se pueden probar los patrones de dos formas:

- Clase principal (Main): Cada ejemplo contiene una clase Main, que se podrá ejecutar y comprobar los resultados por `stdout`.
- Test: Cada ejemplo se podrá probar con test unitarios (JUnit) para verificar su funcionamiento.

## Contenido

### [Creational Design Patterns](./src/main/java/com/ivarrace/patterns/creational)
- **Abstract Factory**. Permite la creación de objetos sin especificar su tipo concreto.
- **Builder**. Se utiliza para crear objetos complejos.
- **Factory Method**. Crea objetos sin especificar la clase exacta a crear.
- **Prototype**. Crea un nuevo objeto a partir de un objeto existente.
- **Singleton**. Garantiza que solo se cree una instancia de un objeto.

### [Structural Design Patterns](./src/main/java/com/ivarrace/patterns/structural)

- **Adapter**. Permite que dos clases incompatibles trabajen juntas, definiendo una interfaz sobre una de las clases existentes.
- **Bridge**. Desacopla una abstracción para que dos clases puedan variar de forma independiente.
- **Composite**. Convierte un grupo de objetos en un solo objeto.
- **Decorator**. Permite que el comportamiento de un objeto se amplíe dinámicamente en tiempo de ejecución.
- **Facade**. Proporciona una interfaz sencilla para un objeto subyacente más complejo.
- **Flyweight**. Reduce el costo de modelos de objetos complejos.
- **Proxy**. Proporciona una interfaz de marcador de posición a un objeto subyacente para controlar el acceso, reducir los costos o reducir la complejidad.

### [Behavior Design Patterns](./src/main/java/com/ivarrace/patterns/behavior)

- **Chain of Responsibility**. Delega comandos a una cadena de objetos de procesamiento.
- **Command**. Crea objetos que encapsulan acciones y parámetros.
- **Interpreter**. Implementa un lenguaje especializado.
- **Iterator**. Accede a los elementos de un objeto de forma secuencial sin exponer su representación subyacente.
- **Mediator**. Permite un acoplamiento flexible entre clases al ser la única clase que tiene un conocimiento detallado de sus métodos.
- **Memento**. Proporciona la capacidad de restaurar un objeto a su estado anterior.
- **Observer**. Es un patrón de publicación/suscripción que permite que varios objetos observadores vean un evento.
- **State**. Permite que un objeto altere su comportamiento cuando cambia su estado interno.
- **Strategy**. Permite seleccionar un algoritmo sobre una familia en tiempo de ejecución.
- **Template Method**. Define el esqueleto de un algoritmo como una clase abstracta, permitiendo que sus subclases proporcionen un comportamiento concreto.
- **Visitor**. Separa un algoritmo de la estructura de un objeto al mover la jerarquía de métodos a un objeto.

## Construido con

- [Maven](https://maven.apache.org/) - Gestor de dependencias

## Licencia

[GPL-3.0](LICENSE)