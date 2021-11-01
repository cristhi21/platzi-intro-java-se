# Curso de Introducción a Java SE
Instruido por: Anahí Salgado Díaz de la Vega


## 8. Etapas de la programación en Java


1. Escribir nuestros archivos .java.

2. Compilar, cargar y verificar nuestros archivos con javac (los IDEs nos permiten compilar con solo presionar un botón).

3. Al compilar obtenemos archivos .class con código que nuestras computadoras pueden entender (Byte Code).

4. La JVM (Java Virtual Machine) se encarga de ejecutar el código de forma que funcione en cualquier dispositivo o sistema operativo.

Java es un lenguaje compilado e interpretado al mismo tiempo.



clic en run -> es javac, es el compilador hay se traduce en el lenguaje bytecode, que son archivos .class




## 9. La JShell de Java

jshell y está disponible desde la versión 9 de Java.

```sh
java -version
```


## 10. Variables en Java

• Es un espacio de memoria que contiene un dato.
• Se componen de: un nombre único y un valor no único.
• Los datos son de tipo: numérico, booleano, texto u otros.


- byte 8 bits -128 127
- short 16 bits -32768 32767
- int 32 bits -2147483648 2147483647
- long 64 bits -9223372036854775808 9223372036854775807
- float 32 bits -3.402823e38 3.402823e38
- double 64 bits -1.79769313486232e308 1.7976931348623e308
- char 16 bits ‘\u0000’ ‘\uffff’

String Cadena de caracteres
array[] Arreglos (Vectores y Matrices)




## 12. Convención de Nombres en Java

Una convención de nombres es un patrón que deben seguir los nombres de las variables para que el código esté organizado, entendible y sin repetidos.

Java es sensible a mayúsculas y minúsculas, este punto es clave al seguir una convención.
Las variables siempre deben comenzar con un simbolo de letra, $ o _.
No puedes usar el simbolo - en ninguna parte de la variable.
Las variables constantes son variables cuyo valor nunca va a cambiar, por lo que se deben escribir completamente en mayúsculas y usando el caracter _.




## 13. Técnica de Naming: Camel Case

Camel Case es una convención muy popular para nombrar nuestras variables. Podemos usarlo en modo Upper Camel Case o Lower Camel Case, la diferencia es si comenzamos el nombre de la variable con mayúscula o minúscula.
```java
// Upper Camel Case:
class SoyUnaClase {};

// Lower Camel Case
int soyUnNumeroInt = 10;
Debemos usar Upper Camel Case en los nombres de las clases y archivos. Y Lower Camel Case en los nombres de las variables o métodos.


// LowerCamelCase: para métodos y variables
String isAvailable = ""ffff;


// UpperCamelCase: para Clases, interfaces.
public class Connection{ 
}


// Snake Case: para constantes
public class Config{
	public static final int MAX_SIZE = 30;
}
```



## 14. Tipos de datos numéricos

Tipos de datos para números enteros (sin decimales):

- byte: Ocupa 1 byte de memoria y su rango es de -128 hasta 127.
- short: Ocupa 2 bytes de memoria y su rango es de -32,768 hasta 32,727.
- int: Ocupa 4 bytes de memoria y su rango es de -2,147,483,648 hasta 2,147,483,647. Es muy - cómodo de usar, ya que no es tan pequeño para que no quepan nuestros números ni tan grande - como para desperdiciar mucha memoria. Puede almacenar hasta 10 dígitos.
- long: Ocupa 8 bytes de memoria y su rango es de -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807. Para diferenciarlo de un tipo de dato long debemos terminar el número con la letra L.
Por ejemplo:
```java
// Int:
int n = 1234567890;

// Long:
long nL = 123456789012345L;

Tipos de datos para números flotantes (con decimales):

float: Ocupan 4 bytes de memoria y su rango es de 1.40129846432481707e-45 hasta 3.40282346638528860e+38. Así como long, debemos colocar una letra F al final.

double: Ocupan 8 bytes de memoria y su rango es de 4.94065645841246544e-324d hasta 1.79769313486231570e+308d.

Por ejemplo:

// Double:
double nD = 123.456123456;

// Float
float nF = 123.456F;

// double es mas preciso que float
```


## 15. Tipos de datos char y boolean

Desde la version 10 de Java podemos declarar variables con la palabra reservada var ya que alli se admite la inferencia de tipos.


char: Ocupa 2 bytes y solo puede almacenar 1 dígito, debemos usar comillas simples en vez de comillas dobles.

boolean: Son un tipo de dato lógico, solo aceptan los valores true y false. También ocupa 2 bytes y almacena únicamente 1 dígito.

Seguro te diste cuenta que siempre debemos escribir el tipo de dato de nuestras variables antes de definir su nombre y valor. Pero esto cambia a partir de Java 10: solo debemos escribir la palabra reservada var y Java definirá el tipo de dato de nuestras variables automáticamente:

var salary = 1000; // INT
var pension = salary * 0.03; // DOUBLE
var totalSalary = salary - pension; // DOUBLE
Recuerda que esto solo funciona con versiones superiores a Java 10.



## 16. Operadores de Asignación, Incremento y Decremento



Operadores de asignación:

- +=: a += b es equivalente a a = a + b.
- -=: a -= b es equivalente a a = a - b.
- *=: a *= b es equivalente a a = a * b.
- /=: a /= b es equivalente a a = a / b.
- %=: a %= b es equivalente a a = a % b.

Operadores de incremento:

- ++: i++ es equivalente a i = i + 1.
- --: i-- es equivalente a i = i - 1.

Podemos usar estos operadores de forma prefija (++i) o postfija (i++). La diferencia está en qué operación se ejecuta primero:




## 17. Operaciones matemáticas





## 18. Cast en variables: Estimacion y exactitud





## 19. Casteo entre tipos de datos

conversion automatica no pide explicitamente colocar un cast.
generalmente los tipos de datos mas grandes si requieren un cast


Java nos ayuda a realizar casteo automático de los tipos de datos más chicos a otros más grandes.

Sin embargo, en algunos casos vamos a necesitar realizar un cast manualmente, así como aprendimos en la clase anterior ((dataType) variableOperación).


## 20. Archivos .JAR

Los archivos JAR (Java Archive) son archivos de Java con el código compilado de los archivos .class y comprimido con el formato ZIP para que más adelante sean interpretados y ejecutados por la máquina virtual de Java (JVM).

Para generar estos archivos podemos entrar a File > Project Structure > Artifacts y seleccionar la opción de JAR > From modules with dependencies. Luego de esto podemos compilar nuestro proyecto desde Build > Build Artifacts > Build y podremos nuestros archivos ejecutables en la carpeta out/artifacts/.


Working directory:
C:\Users\crist\IdeaProjects\tiposDatos\out\artifacts\tiposDatos_jar

Ejecutar el jar:
```sh
java -jar tiposDatos.jar
```


Para cambiar la version de java en linux (Ubuntu):
sudo update-alternatives --config java
Ahora eligan el numero que corresponde a la version que necesitan.

Para ejecutar el jar:
```sh
java -jar HolaMundo.jar
```


## 23. Alcance de las variables y Sentencia ELSE

Scope: alcance

{scope}

siempre que queramos usar una variable dentro de unas llaves tenermos 2 opciones

1. declararla antes del uso de las llaves
2. declarar la variable dentro del mismo scope, esto hace que su nivel de scope sea mas limitado

EJ:
```java
boolean condicion = true;

if(condicion) {
	int i = 1; // El scope de esta variable es mas limitado
	i++;
}
```


## 26. ¿Para qué sirven las funciones?

Las funciones nos ayudan a ejecutar código que dependiendo de las opciones que le enviemos, transformará y devolverá un cierto resultado. Gracias a las funciones podemos organizar, modularizar, reutilizar y evitar repetidos en nuestro código.

Todas nuestras funciones deben tener un nombre. Opcionalmente, pueden recibir argumentos y devolver un resultado. También debemos especificar el tipo de dato de nuestros argumentos y el resultado final de nuestra función.

Por ejemplo:

```java
public int suma(inta, int b) {
  return a + b;
}
```

Si nuestra función NO devuelve ningún tipo de dato podemos usar la palabra reservada void.

Para utilizar nuestras funciones solo debemos asignar el resultado de la función y sus parámetros a una variable con el mismo tipo de dato de la función:

int c = suma(5, 7);


----

¿Para qué sirven las funciones?
.
Funciones: nos ayudan a organizar, modularizar y evitar el código repetido.
• Return: palabra clave cuando una función tiene un valor de regreso.
• Void: palabra clave cuando una función no tiene un valor de regreso.


> Nota: si nuestras funciones van a devolver argumentos, lo mejor es que especifiques el tipo de dato que serán. Para utilizar nuestras funciones solo debemos asignar el resultado de la función y sus parámetros a una variable con el mismo tipo de dato de la función.


## 27. Implementa Funciones en Java

Las funciones deven vivir al mismo nivel de la clase



## 28. Java Docs

Los Java Docs son una herramienta usada por muchas otras herramientas y aplicaciones porque nos ayuda a documentar todo nuestro código usando comentarios. Además, nos permite visualizar la documentación en formato HTML.

```java
// Comentarios de una sola línea 
 
/* Comentario 
* en múltiples 
* líneas */ 
 
/** 
* Comentario para Java Docs 
* */ 
```

- https://docs.spring.io/spring-boot/docs/2.2.0.M3/api/
- https://docs.oracle.com/javase/1.5.0/docs/tooldocs/windows/javadoc.html




**Cursos Java**
- https://www.baeldung.com/



## 29. Javadoc en funciones

Vamos a documentar la función convertToDolar. Recuerda que esta función devuelve un número double y recibe dos argumentos: quantity (de tipo double) y currency (de tipo String):

```java
/**
 * Descripción general de nuestra función.
 * 
 * @param quantity Descripción del parámetro quanity.
 * @param currency Descripción del parámetro currency (MXN o COP).
 * @return Descripción del valor que devolvemos en esta función.
 * */
 ```

Para que el IDE muestre la descripción y documentación de las funciones debemos entrar a IntelliJ IDEA > Preferences > Editor > General > Code Complettion y habilitar la opción de Show the documentarion popup.

¡No olvides documentar todas las funciones que has escrito hasta ahora!


Tambien se puede poner en la documentacion etiquetas HTML


Para activar la visibilidad de la documentación en Windows:
.
File > Settings > Editor > General > Code Completion y pasas a activar la opción "Show the documentation popup in 1000 ms" y por ultimo le das a OK


- https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html



## 29. Javadoc en funciones


- https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javadoc.html#javadoctags
- https://www.baeldung.com/javadoc
- https://mariocelis.com/java/crear-documentacion/




## 31. Bucle do While

Los bucles (ciclos) nos ayudan a ejecutar una parte de nuestro código una cantidad de veces hasta que se cumpla alguna condición y podamos continuar con la ejecución de nuestro código.

Existen diferentes bucles. Por ejemplo, el buble do while:
```java
do {
  // instrucciones
} while (condición);
```
Los ciclos evaluarán si la condición se cumple y cuando deje de hacerlo no ejecutarán más el código del ciclo. Las instrucciones son las encargadas de que esta condición cambie de verdadero a falso. De otra forma, si las instrucciones nunca cambian la condición, el ciclo no se detendrá nunca, lo que conocemos como un ciclo infinito.

La clase Scanner le permite a los usuarios contestar algunas preguntas para que nuestro programa actúe de una forma u otra. Para usarla solo debemos importar la clase Scanner de las APIs de desarrollo de Java:

```java
import java.util.Scanner;

int response = 0;

Scanner sc = new Scanner(System.in);
response = Integer.valueOf(sc.nextLine());
```


While: Ejecuta de 0 a N veces.
Do While: Ejecuta de 1 a N veces.




## 32. Operador Ternario y Bucle While


Vamos a crear el algoritmo con la lógica necesaria para encender una lampara, emitir un mensaje y detener las luces en algún momento.

El Bucle While nos ayuda a ejecutar una parte del código mientras una condición se cumpla. Recuerda tener mucho cuidado y asegurarte de que la condición del ciclo while cambie en algún momento, de otra forma, el ciclo no se detendrá nunca y sobrecargarás tu programa:
```java
while (isTurnOnLight) {
  printSOS();
}
// Los operadores ternarios son otra forma de evaluar condiciones, así como los condicionales IF y ELSE`:

// Operador Ternario:
isTurnOnLight = (isTurnOnLight) ? false : true;

// IF y ELSE:
if (isTurnOnLight) {
  isTurnOnLight = false;
} else {
  isTurnOnLight = true;  
}
```


## 33. Bucle For

El Ciclo For también nos ayuda a ejecutar una parte de nuestro código las veces que sean necesarias para que se cumpla una condición. De hecho, el ciclo FOR nos da muchas ayudas para lograr este resultado de la forma más fácil posible:
```java
// Estructura:
for (inicialización; condición; incremento o decremento;) {
  // Instrucciones
}

// En este ejemplo el mensaje de printSOS se
// ejecutará 10 veces:
for (int i = 1; i <= 10; i++) {
  printSOS();
}
```



## 35. Arrays


Los arreglos o arrays son objetos en los que podemos guardar más de una variable, una lista de elementos. Los arrays son de una sola dimensión, pero si guardamos arrays dentro de otros arrays podemos obtener arrays multidimensionales.

Los arrays se definen en código de las siguientes maneras:

// 1. Definir el nombre de la variable y el tipo de datos
//  que va a contener, cualquiera de las siguientes dos
// opciones es válida:
TipoDato[] nombreVariable;
TipoDato nombreVariable[];

// 2. Definir el tamaño del array, la cantidad de elementos
// que podemos guardar en el array:
TipoDato[] nombreVariable = new TipoDato[capacidad];

// Array de dos dimensiones:
TipoDato[][] cities = new String[númeroFilas][númeroColumnas];
Ya que los arrays pueden guardar multiples elementos, la convención es escribir los nombres de las variables en plural.




- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html



## 36. Declarando Arreglos





## 37. Indices y búsqueda de elementos en Arrays

```java
 String[][] cities = new String[4][2];

    int [][][] numbers = new int [2][2][2];
    int [][][][] numbers4 = new int[2][2][2][2];

    androidVersions[0] = "Apple Pie";
    androidVersions[1] = "Bannana Bread";
    androidVersions[2] = "Cupcake";
    androidVersions[3] = "Donut";

    System.out.println(androidVersions[0]);
    System.out.println(androidVersions[1]);
    System.out.println(androidVersions[2]);
    System.out.println(androidVersions[3]);

    System.out.println();
    System.out.println();

    cities[0][0] = "Colombia ";
    cities[0][1] = "Medillin ";
    cities[1][0] = "Colombia ";
    cities[1][1] = "Bogota ";
    cities[2][0] = "Mexico ";
    cities[2][1] = "Guadalajara ";
    cities[3][0] = "Mexico ";
    cities[3][1] = "CDMX ";

    int a = 0;
    int b = 0;
    int c = 1;

    for (int i = 0;i <= 3;i++) {
        System.out.println(cities[a][b] + cities[a][c]);
        a++;
    }

    String[][][][][][] mono = new String[2][3][1][2][2][2];
    String monitos = mono[1][0][0][0][0][1] = "MONITO";

    System.out.println();
    System.out.println("ENCONTRE AL " + monitos);
}
```