Examen Programación Java - 3ª evaluación Dual
=============================================
Septiembre 2019

En Palma ha comenzado a operar una nueva start-up que promueve el uso compartido de coches eléctricos.

Un vez que un usuario/a se da de alta en el sistema, la empresa proporciona una aplicación para el móvil llamada _mollapp_ que permite acceder a los coches que la empresa y los usuarios/as estacionan en diversos lugares de Palma.

Cuando una persona quiere utilizar uno de los vehículos, la aplicación del móvil envía una petición al sistema, que solicita su autenticación con el nombre del usuario/a, y el sistema autoriza el acceso al coche. Después, el sistema envía al vehículo la señal inalámbrica de abrir la puerta del vehículo.

Construye la arquitectura del sistema de tal manera que la _app_ móvil solicite las dos comprobaciones especificadas al sistema, que estas sean ejecutadas por el sistema y que este envíe la señal de abrir la puerta del vehículo, teniendo en cuenta que:

- El orden de ejecución de las tareas es definido en el instante de configurar el sistema.
- Como el sistema de la start-up está en período de pruebas, todos los usuarios/as tienen el acceso permitido y no se debe programar la lógica de la autenticación y la autorización.
- El mensaje al vehículo, en el caso expuesto, será solo un texto por consola.

Dado que se trata de una start-up, el producto se encuentra en desarrollo, motivo por el cual, en cuestión de semanas, nuevas tareas serán implementadas en el sistema y serán exigidas a la _app_ móvil. Además, la intención es conectar el sistema a otras aplicaciones cliente. También se quiere extender el negocio a bicicletas y patinetes. Diseña su solución de tal manera que añadir nuevas tareas, nuevas _apps_ clientes y/o nuevos vehículos, resulte posible sin modificar la estructura del sistema y el código.

El script principal ha de producir la siguiente salida por consola:

```bash
Autenticación OK para Francesc
Autorización OK para Francesc
Puerta abierta Francesc!
```

## Diagrama de clases UML

Construye la aplicación según la arquitectura que se representa en el diagrama de clases UML de la figura que se proporciona en papel. Al final del examen tendrás que añadir nuevos componentes al diagrama. Pon tu nombre y devuélvemela al finalizar el examen.

Respeta los nombres de todos los componentes, métodos y propiedades que se indican.

## Prepara el proyecto

1. Crea un nuevo repo en tu cuenta en Github
2. Crea un nuevo directorio en tu equipo y clona el repositorio de Github.
3. Abre VSCode /Eclipse /Netbeans y establece como workspace el directorio que has clonado.
4. Crea un proyecto Maven.
5. Pon el proyecto en seguimiento en Git y configura `.gitignore`.
6. Copia y pega la función principal `App.java`. Utilízala como guía en el proceso TDD. No puedes modificar su código, pero sí puedes comentar aquellas partes que aun no hayas implementado.
7. Completa las clases que aquí se indican implementando los casos test que necesites. Practica TDD.
8. Realiza _commits_ como mínimo cada vez que termines una historia de usuario.

## Cómo entregar el código

Realiza un push al repo remoto en GitHub SÓLO cuando hayas terminado el proyecto si el proyecto es público.

Si se trata de un repo privado, compártelo con el usuario dfleta.

## Salida de la aplicación

Intenta que la salida del programa sea lo más parecida posible a las imágenes que se proporcionan.

## Historias de usuario
Las historias de usuario están enunciadas en el script principal `App.java`

Utiliza este script para guiar el desarrollo del diagrama de clases UML.

La salida de este script es la siguiente:


```bash
Autenticación OK para Francesc
Autorización OK para Francesc
Puerta abierta Francesc!
```

## Código

### SOLID

Garantiza que tu solución satisfaga los 5 principios SOLID:

1. Las clases y métodos solo han de tener una motivo para cambiar.
2. Para añadir nuevos componentes al sistema no debe ser necesario reescribir el código.
3. Utiliza el polimorfismo para que cada objeto muestre su comportamiento en tiempo de ejecución.
4. Invierte las dependencias para desacoplar el código de los detalles de bajo nivel y del resto de componentes.

