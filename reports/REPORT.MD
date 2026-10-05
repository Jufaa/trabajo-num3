## 1.1 Cobertura y puntuación de mutación

| Técnica | Tests | Instrucciones | Branches | Líneas (PIT) | Mutation score | Test strength |
|---|---|---|---|---|---|---|
| Manual (BoardTest, CellTest) | 67 | 83% | 79% | 83% (244/293) | 76% (203/267) | 92% |
| Randoop (RegressionTest*) | 514 | 84% | 78% | 83% (242/293) | 69% (184/267) | 84% |
| EvoSuite (Board_ESTest, Cell_ESTest) | 70 | 89% | 86% | 85% (250/293) | 88% (235/267) | 100% |

De manera general, en cuanto a la cobertura de código y puntuación de mutación de las distintas técnicas, podemos concluir que:

- EvoSuite es ampliamente superior en este departamento, con el mejor puntaje de cobertura y de mutación (no significa que sea la mejor técnica, como veremos más adelante)

- La suite creada por nosotros "a mano" es símilar en cuanto a cantidad de tests y cálidad, segun estos parámetros, a EvoSuite, pero considerando la diferencia abismal de esfuerzo y tiempo que conlleva comparada a una herramienta automática, se ve relegada.

- Finalmente, Randoop queda muy mal parada, con una suite de tests enorme, casi diez veces más grande que la demas, y con resultados similares o incluso peores.

## 1.2 Comparación: Inputs

En cuanto a los inputs generados, lo que correspondería a las etapas de "arrange" y "act", los tests manuales son los más claros y faciles de entender, los creamos nosotros mismos y tienen un propósito muy obvio y conciso.

Randoop, por su parte, genera secuencias de llamadas a métodos, en algunos casos muy extensas, donde podemos ver combinaciones de operaciones que probablemente no hubieramos intentado, pero es más dificil de entender el test a un primer vistazo comparado a los manuales.

Los inputs de EvoSuite son, y con diferencia, los más extraños, seguramente debido a su narutaleza genética. Parece que el objetivo es el de cubrir la mayor cantidad de sentencias y ramas, pero además se utilizan valores, se crean objetos o se invocan métodos de manera impredecible. Esto lleva a que estos tests sean muy complejos de comprender, pero ejerciten al programa de una forma que muy difícilmente se nos ocurriría de manera manual. Otro detalle es que varios tests poseen aserciones que verifican una cadena de texto en específico, lo cual es muy fragil, un cambio mínimo en algun toString() o parecido podria generar muchisimos fallos en la suite.

## 1.3 Comparación: Oráculos

Como es de esperar, los oráculos de los tests manuales son muy efectivos, ya que nos centramos en la especificación del problema para poder decidirlos, pero esta comparación es más interesante para analizar las herramientas automáticas, ya que es un punto clave de dificultad. Un humano se le hace relativamente simple pensar e idear una aserción ideal para una situación, pero para una máquina no es tan simple.

Randoop genera principalmente oráculos de regresión, osea, observan el comportamiento que tuvo el programa y toma ese resultado como una aserción válida, por lo tanto muchas veces nos ayudan a ver cambios, pero no que estos sean necesariamente erroneos. Además, se utiliza el metodo RepOK() que implementamos en las clases, lo cual si nos genera aserciones mucho mas valiosas, ya que verifican la especificación del objeto, y se encuentran prominentemente en los tests generados.

EvoSuite contiene algunas aserciones que no son de regresion, pero la mayoría si lo son, lo cual lo ubica en una situación similar a la de Randoop, con una diferencia. El uso de RepOK() es menos significativo, pareciera que se utiliza para poder "cubrir ramas" más que para verificar que el invariante sigue siendo válido, lo cual lo hace ser inferior a Randoop en este aspecto.

## 1.4 Comparación: Conclusión

Cada una de las técnicas se diferencia y tiene un uso claro, con características distintas.
Los tests manuales, son en general los que mejor cálidad tienen, especialmente cuando se trata de oraculos y legibilidad, pero su problema principal es que necesita que alguien los escriba, toman tiempo e incluso si suponemos que aquel que lo haga sea un "programador apto", es siempre un factor el factor humano, una situación que no se evaluo, un oraculo incorrecto o quizás no se exigio lo suficiente al programa.

Randoop y EvoSuite nos permiten hacer estos tests de manera automática, y esto trae ventajas y desventajas. La legibilidad de los tests se ve disminuida, especialmente en el caso de EvoTest, pero ambos son dificiles de entender y requieren de un análisis detenido. Pero cada uno nos permite algo en particular en cuanto a las entradas que proponen. Randoop genera combinaciones de operaciones poco comunes que tomarian mucho tiempo de escribir y pensar, o que incluso no se nos ocurririan, además tiene la ventaja de un uso significativo del RepOK() para generar mejores oráculos. Finalmente EvoSuite, debido a su naturaleza genética, llega a resultados muy unicos, permitiendo generar tests que, aunque muy complicados de entender, llegan a extremos de ejercitación del programa que creemos que se nos haría imposible de idear fácilmente. Un defecto solamente identificado por un test de EvoSuite probablemente podría pasar por desapercibido de otra manera, y esta posibilidad es muy valiosa.

## 2.0 Fuzzer

El fuzzer nos permite algo que no eramos capaces anteriormente, probar el programa de la misma forma que lo utilizaria el usuario, atraves de la linea de comandos. 
Básicamente, el fuzzer genera una serie de entradas, se las da al programa para interactuar con el, recolecta las salidas del programa (estas pueden ser errores o simplemente funcionamiento normal) y al finalizar hace un resumen de lo sucedido.

## 2.1 Implementación: Básica

Nuestra primera implementación simplemente generaba una cadena entre 10 y 50 entradas, donde cada una era completamente aleatoria. Vimos dos limitaciones con esto, primero que las entradas no llegaban a estados mas tardíos del juego (nunca encontramos un "GAME OVER"), es poco realista un jugador que haga, por ejemplo, 5 movimientos seguidos hacia arriba, y finalmente que los unicos errores que iba a encontrar eran aquellos provenientes de un crasheo del programa, pero nada significativo.

## 2.2 Implementación: Final

Para solucionar los problemas anteriores hicimos lo siguiente:

- En la funcion fuzz(), implementamos "pesos" de esta forma la posibilidad de muchos movimientos a la misma dirección eran menos probables, pero no imposibles.

- Aumentar la longitud de la cadena de inputs a un número entre 50 y 120.

- Agregar en MainCLI.java una aserción que verifica que la invariante del objeto board se cumpla (repOK() == true) despues de cada movimiento realizado.

- Habilitar las aserciones al utilizar el fuzzer, para así detectar los errores que podrian aparecer en cada movimiento y entrada con la que alimentamos al programa.

## 2.3 Fuzzer: Conclusión

A pesar de no haber encontrado errores, vemos la utilidad que nos trae el fuzzer a la hora de testear, específicamente teniento en cuenta la posición de usuario interactuando directamente con el programa.

## 3.0 Conclusión Final

Cada una de las técnicas utilizadas durante el trayecto del trabajo tienen un lugar y un propósito más que útil a la hora de testear, y seriamos necios de no aprovecharlas a la hora de desarrollar una suite. Pero, de manera contradictoria a como empezamos este trabajo, buscando una forma de ahorrarnos el tiempo y tedio que conllevan los tests manuales, llegamos a la conclusión de que es la forma de obtener los mejores tests. Comparado a las técnicas automáticas, un humano es capaz de crear tests muy legibles, con fases distinguibles, aserciones y oráculos fuertes y seguros. 
A pesar de esto, las herramientas automáticas nos permiten crear tests que simplemente no se nos ocurrirían, pero que son estados posibles del programa o casos extremos que tenemos que poder detectar. Dentro de estas técnicas, la que mejor resultado tuvo fue EvoSuite, con una cantidad de tests compacta y metricas muy favorables de puntuación.



