## OBJETOS
Son aquellos que tienen propiedades y comportamientos, pueden ser físicos o conceptuales

Siempre tendran nombre: sustantivo.


<img width="350px" src="https://static.platzi.com/media/user_upload/dog-2833b1ce-4289-447a-8cd0-7ad9b6f0da1a.jpg" />

<img width="350px" src="https://static.platzi.com/media/user_upload/Captura-7f6bae62-f552-4a1b-a837-a95552a921f3.jpg" />

Propiedades: también pueden llamarse atributos, seran sustantivos:
* nombre
* tamaño
* forma
* estado

Comportamientos: serán todas las operaciones (**Acciones**) del objeto, suelen ser vervos o sustantivo y verbo:
* login()
* logout()
* makeReport()

## ABSTRACCION Y CLASES

Clase: es el modelo sobre el cual se construirá nuestro objeto (**Molde**). Permiten generar más objetos. 
<img src="https://static.platzi.com/media/user_upload/clip_image001-8ad14bdf-1124-4e5f-8815-650c61712dd8.jpg"/>
Abstraccion: Cuando abstraemos los datos de un objeto para entonces generar un molde.

## MODULARIDAD

Diseño modular: subdividir un sistema en partes mas pequeñas, MODULOS, funcionan de manera independiente pero que unidos nos ayudan a componer un sistema completo. 
<img src="https://static.platzi.com/media/user_upload/modularidad-vs-estructurada-77798962-0080-480c-8e50-e1b88cc2b52b.jpg"/>

> ➗ DIVIDE Y VENCERAS

Ventajas:
* Reutilizar
* Evitar colapsos
* Mantenible
* Legibilidad
* Resolución rápida de problemas

### CLASES EN UML Y SU SINTAXIS EN CÓDIGO

Recuerda que el proceso es:
* Identificar el problema, y objetos
* Definir las clases
* Plasmarlas en un diagrama

Se lo puede plasmar en UML :
* Identidad, que será el nombre de la clase.
* Estado, que serán los atributos de la clase.
* Comportamiento, que serán las operaciones de la clase.

<img src="https://static.platzi.com/media/user_upload/Ejemplo-Clases-Distintos-Lenguajes-41672a36-5465-4bc5-94d6-b53419e3a411.jpg" />

## HERENCIA
> 💡 **Don’t repeat yourself** es una filosofía que promueve la reducción de duplicación en programación, esto nos va a inculcar que no tengamos líneas de código duplicadas. Toda pieza de información nunca debería ser duplicada debido a que incrementa la dificultad en los cambios y evolución.

Herencia: Nos permite crear nuevas clases a partir de otras, una vez que detectemos elementos duplicados empezaremos a ejecutar un analisis, **una ABSTRACCIÒN**, de tal manera que generaremos una clase mas general que nos permita generar mas clases.
Se basa en casos de la vida real.

> 💡 Cuando detecto características y comportamientos iguales, entonces significa que debo realizar una abstracción.

Al crear herencia todas las clases (**SUBCLASES**) heredan de la clase padre (**SUPERCLASE**) sus propiedades y comportamientos.

<img src="https://i.imgur.com/r0oFHTr.png"/>

## OBJETOS, METODO CONSTRUCTOR Y SU SINTAXIS EN CÓDIGO

Objetos es una instancia de una clase, es el resultado del modelado, las usaremos para que estas clases cobren vida

```
#JAVA
Person person = new Person();

#JavaScript
var person = new Person();

#Python
person = Person()

#person = new Person();
```
Metodo constructor: da un estado inicial a un objeto, cuando lo creamos obtiene un estado inicial.
Los atributos que pasemos a traves del metodo consturctor seran los datos minimos para que el objeto pueda vivir.

<img src="https://static.platzi.com/media/user_upload/58-5f06fef2-f1d2-401c-89e9-b5f1aa9637a2.jpg">

Con lo que vimos en el punto anterior ahora las clases necesitan que se les pasen los atributos minimos.

```
#JAVA
Person person = new Person("Ann");

#JavaScript
var person = new Person("Ann");

#Python
person = Person("Ann")

#person = new Person("Ann");
```