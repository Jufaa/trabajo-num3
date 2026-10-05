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

