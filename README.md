SRP: 
  -  Las clases AlmacenCoches y AlmacenPiezas tienen una única responsabilidad, gestionar el almacenamiento de coches y piezas respectivamente.
  -  Coche, ManejadorCoche, e IProbadorCoche aplican este principio al tener una única responsabilidad clara y definida cada uno:
      Coche: Representa la estructura de un coche.
      ManejadorCoche: Implementa las acciones que puede realizar un coche, como acelerar, frenar, y girar.
      IProbadorCoche y ProbadorCoche: Se encargan de probar un coche, separando la lógica de prueba de la lógica del coche en sí.
OCP:
  -  Las clases GestorAlmacenCoches y GestorAlmacenPiezas están abiertas para extender su funcionalidad mediante la implementación de la interfaz IGestorAlmacen, pero cerradas para su modificación.
  -  En Concesionario, la clase está abierta para la extensión a través de las implementaciones de IGestorAlmacen y IProbadorCoche.
ISP:
  -  La interfaz IGestorAlmacen define un conjunto cohesivo de métodos para la gestión de almacenes, evitando la dependencia de métodos innecesarios en las implementaciones.
  -  Las interfaces IGestorAlmacen e IProbadorCoche siguen este principio al definir un conjunto cohesivo de métodos específicos para la gestión de almacenes y la prueba de coches, respectivamente.
DIP:
  -  Las clases de gestión (GestorAlmacenCoches y GestorAlmacenPiezas) dependen de la abstracción proporcionada por la interfaz IGestorAlmacen, en lugar de depender directamente de las implementaciones concretas de almacenamiento (AlmacenCoches y AlmacenPiezas).
  -  Concesionario depende de las abstracciones proporcionadas por IGestorAlmacen e IProbadorCoche, no de las implementaciones concretas. 
