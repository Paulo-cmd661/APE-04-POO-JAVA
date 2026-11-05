
# APE-04-POO-JAVA

Este repositorio contiene el desarrollo de los 5 ejercicios prácticos de la Guía APE 4 (Integración de clases, objetos y métodos), correspondientes a la asignatura de Algoritmos y Lógica de Programación, Primer Semestre, Paralelo B, de la carrera de Ingeniería en Software.


## Resolución de Ejercicios

### Ejercicio 1: Libro y Autor

#### Enunciado:

Crear la clase Autor (nombre, nacionalidad) y la clase Libro (titulo, anio, autor). Libro debe tener un atributo de tipo Autor y un método mostrarInformacion() que imprima el título, el año y el nombre del autor. En main, crear 2 libros.

#### Descripción de la solución:

Para resolver este ejercicio, creamos dos clases: Autor y Libro, cada una en su propio archivo. La clase Autor almacena el nombre y la nacionalidad, mientras que Libro contiene el título, el año de publicación y un objeto de tipo Autor. También agregamos sus respectivos constructores y métodos para acceder a los datos.

El método mostrarInformacion() permite mostrar los datos del libro y obtener el nombre del autor mediante getNombre(). Finalmente, en MainEjercicio1 creamos dos autores y sus respectivos libros para comprobar que todo funcione correctamente.

#### Evidencia de la ejecucion:


### Ejercicio 2: Rectángulo

#### Enunciado:

Crear la clase Rectangulo (base, altura) con los métodos calcularArea(), calcularPerimetro(), esCuadrado(), obtenerDescripcion() y mostrar(), usando el tipo de retorno correcto en cada firma. obtenerDescripcion() devuelve, por ejemplo, "Rectángulo de 4.0 x 6.0", y mostrar() imprime todos los resultados.

#### Descripción de la solución:

En este ejercicio creamos la clase Rectangulo con los atributos base y altura. Después implementamos los métodos solicitados, teniendo en cuenta el tipo de dato que debe devolver cada uno.

El método calcularArea() obtiene el área multiplicando la base por la altura, mientras que calcularPerimetro() calcula el perímetro. Por otro lado, esCuadrado() comprueba si las dos medidas son iguales y obtenerDescripcion() devuelve un texto con las dimensiones del rectángulo.

Por último, el método mostrar() reúne todos estos resultados y los imprime en pantalla. Para comprobar su funcionamiento, en el main probamos dos casos: un rectángulo de 4.0 x 6.0 y otro de 5.0 x 5.0.

#### Evidencia de la ejecucion:



### Ejercicio 3: Producto y Venta

#### Enunciado:

Crear la clase Producto (nombre, precio, stock) con reducirStock(int cantidad), que solo actúa si hay stock suficiente (si no, imprime "Stock insuficiente."), y mostrarProducto(). Crear la clase Venta (cantidad) con aplicar(Producto producto), que reduzca el stock y muestre el total a pagar.

#### Descripción de la solución:

Para este ejercicio creamos las clases Producto y Venta. La primera almacena el nombre, el precio y la cantidad disponible de cada producto. También cuenta con el método reducirStock(), que se encarga de revisar si hay suficientes unidades antes de realizar una venta.

Si existe stock suficiente, se descuenta la cantidad solicitada y el método devuelve true. En caso contrario, muestra el mensaje "Stock insuficiente." y devuelve false.

La clase Venta se encarga de realizar la operación. Su método aplicar() recibe un producto, intenta reducir su stock y, si la venta se puede realizar, calcula el total multiplicando el precio por la cantidad comprada.

En el main realizamos dos pruebas: una venta que se completa correctamente y otra en la que se solicita una cantidad mayor a la disponible, para comprobar que el programa controle esta situación.

#### Evidencia de la ejecucion:


### Ejercicio 4: Transferencias

#### Enunciado:

Usar la clase Cuenta del informe y agregar el método transferir(Cuenta destino, double monto), que retire el monto de la cuenta actual y lo deposite en la cuenta destino solo si hay fondos. En main, crear 2 cuentas, hacer una transferencia válida y otra que falle.

#### Descripción de la solución:

En este ejercicio trabajamos con la clase Cuenta, que contiene los datos del titular y el saldo disponible. Además, utilizamos los métodos depositar() y retirar() para manejar el dinero de cada cuenta.

Agregamos el método transferir(), que permite enviar dinero desde una cuenta hacia otra. Antes de realizar la transferencia, el programa verifica que exista saldo suficiente. Si la operación es válida, se retira el dinero de la cuenta de origen y se deposita en la cuenta de destino. Si no hay fondos suficientes, la transferencia no se realiza y se muestra un mensaje indicando el problema.

Para comprobar su funcionamiento, en el main creamos dos cuentas y realizamos una transferencia de 200. Después intentamos transferir 1000, para verificar que el programa no permita enviar dinero cuando el saldo no es suficiente.

#### Evidencia de la ejecucion:


### Ejercicio 5: Biblioteca

#### Enunciado:

Crear tres clases que colaboren entre sí: Usuario, Libro y Prestamo. Prestamo tiene atributos de tipo Usuario y Libro, y su método registrar() intenta prestar el libro y muestra un mensaje según el resultado. En main, hacer que dos usuarios intenten pedir el mismo libro.

#### Descripción de la solución:

Para desarrollar este ejercicio creamos tres clases: Usuario, Libro y Prestamo. Cada una cumple una función dentro del proceso de préstamo de libros.

La clase Usuario almacena el nombre y la cédula de cada persona, mientras que Libro contiene el título y un atributo llamado disponible, que inicialmente tiene el valor true.

En la clase Libro implementamos el método prestar(), que comprueba si el libro está disponible. Si nadie lo ha solicitado, cambia su estado a false y permite realizar el préstamo. Si ya está prestado, devuelve false. También agregamos el método devolver(), que permite cambiar nuevamente su estado a disponible.

Por último, la clase Prestamo relaciona a un usuario con un libro mediante sus atributos. En el método registrar() se intenta realizar el préstamo y se muestra un mensaje dependiendo de si fue posible o no.

En el main hacemos la prueba solicitada: dos usuarios intentan llevarse el mismo libro. El primero consigue realizar el préstamo, mientras que el segundo recibe un mensaje indicando que el libro ya no está disponible.

#### Evidencia de la ejecucion:


