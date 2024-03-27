# Principios SOLID en el Código

## SRP - Principio de Responsabilidad Única
- **AlmacenCoches** y **AlmacenPiezas**: Gestionan exclusivamente el almacenamiento de coches y piezas respectivamente.
- **Coche**, **ManejadorCoche**, e **IProbadorCoche**: Cada uno tiene una única responsabilidad clara y definida:
  - **Coche**: Representa la estructura de un coche.
  - **ManejadorCoche**: Implementa las acciones que puede realizar un coche, como acelerar, frenar, y girar.
  - **IProbadorCoche** y **ProbadorCoche**: Se encargan de probar un coche, separando la lógica de prueba de la lógica del coche en sí.
- **Pieza**, **Freno**, **Motor** y **Neumatico**: Se encargan exclusivamente de representar diferentes tipos de piezas y proporcionar métodos para acceder a sus atributos.

## OCP - Principio de Abierto/Cerrado
- **GestorAlmacenCoches** y **GestorAlmacenPiezas**: Están abiertos para extender su funcionalidad mediante la implementación de la interfaz `IGestorAlmacen`, pero cerrados para su modificación.
- **Concesionario**: Está abierto para la extensión a través de las implementaciones de `IGestorAlmacen` e `IProbadorCoche`.
- **Taller**: Está abierto para la extensión a través de la interfaz `IGestorAlmacen`, permitiendo la gestión de piezas en el taller sin modificar la clase existente.

## ISP - Principio de Segregación de la Interfaz
- La interfaz `IGestorAlmacen` define un conjunto cohesivo de métodos para la gestión de almacenes, evitando la dependencia de métodos innecesarios en las implementaciones.
- Las interfaces `IGestorAlmacen` e `IProbadorCoche` siguen este principio al definir un conjunto cohesivo de métodos específicos para la gestión de almacenes y la prueba de coches, respectivamente.
- La interfaz `IGestorAlmacen` se aplica en la clase `Taller` de manera coherente, ya que solo se utilizan los métodos necesarios para la gestión de piezas en el taller.

## DIP - Principio de Inversión de Dependencias
- Las clases de gestión (`GestorAlmacenCoches` y `GestorAlmacenPiezas`) dependen de la abstracción proporcionada por la interfaz `IGestorAlmacen`, en lugar de depender directamente de las implementaciones concretas de almacenamiento.
- `Concesionario` depende de las abstracciones proporcionadas por `IGestorAlmacen` e `IProbadorCoche`, no de las implementaciones concretas.
- `Taller` depende de la abstracción proporcionada por `IGestorAlmacen`, no de las implementaciones concretas.
