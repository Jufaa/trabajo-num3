## 1. Cobertura y puntuación de mutación

Se midió sobre las 5 clases del paquete `ar.edu.unrc.game2048`, ejecutando cada
suite por separado (`mvn clean test jacoco:report -Dtest=...`) y PIT para mutación.

| Técnica | Tests | Instrucciones | Branches | Líneas (PIT) | Mutation score | Test strength |
|---|---|---|---|---|---|---|
| Manual (BoardTest, CellTest) | 67 | 83% | 79% | 83% (244/293) | 76% (203/267) | 92% |
| Randoop (RegressionTest*) | 514 | 84% | 78% | 83% (242/293) | 69% (184/267) | 84% |
| EvoSuite (Board_ESTest, Cell_ESTest) | 70 | 89% | 86% | 85% (250/293) | 88% (235/267) | 100% |

Observaciones:
- EvoSuite lidera en cobertura y en mutation score con solo 70 tests. Su test strength del 100% indica que detecta todo mutante
  que sus tests alcanzan; los 32 mutantes restantes no son alcanzados por ningún test.
- Randoop iguala a la suite manual en cobertura de líneas (83%), pero con 514 tests obtiene el peor mutation score (69%):    
  ejecuta el mismo código pero verifica menos.
- La suite manual (67 tests) supera a Randoop en mutation score (76% contra 69%) con muchos menos tests.
- Nota: los tests de EvoSuite salían con 0% de cobertura en JaCoCo
  porque `@EvoRunnerParameters` traía `separateClassLoader = true`. EvoSuite carga
  copias modificadas de las clases bajo prueba y JaCoCo descartaba esos datos.
  Al ponerlo en `false` la cobertura pasó a medirse correctamente.

## 2. Comparación EvoSuite vs Randoop

**Similitudes**
- Ambos generan automáticamente tests JUnit y funcionan sin conocer la
  especificación: los oráculos que producen son de regresión (fijan el
  comportamiento actual del código, no el esperado).
- Ninguno encontró errores en este proyecto: todos los tests generados pasan.

**Diferencias**

| | Randoop | EvoSuite |
|---|---|---|
| Estrategia | Generación aleatoria guiada por feedback: arma secuencias de llamadas y descarta las inválidas | Búsqueda evolutiva: un algoritmo genético optimiza una suite para maximizar criterios de cobertura |
| Tamaño de la suite | 514 tests | 70 tests (minimizados) |
| Tiempo de ejecución | Lento (`RegressionTestBoard` ~21–25 s) | Rápido (~1 s) |
| Entradas típicas | Secuencias de operaciones válidas | Valores límite e inválidos: negativos, `null`, tamaños extremos, coordenadas fuera de rango |
| Manejo de excepciones | _completar tras revisar los tests de Randoop_ | Verifica excepciones y mensajes (`"Cell value cannot be negative"`, etc.) |
| Integración | Sin runner especial | Requiere `EvoRunner` y scaffolding; interfiere con JaCoCo por su classloader |

**Fortalezas y debilidades**
- **EvoSuite**
  - Fortalezas: mayor cobertura y mutation score con menos tests, buena exploración de casos
    límite, verifica excepciones con mensaje, suite rápida de ejecutar.
  - Debilidades: tests poco legibles (nombres `test00`…`test45`, variables
    `boolean0`…), aserciones repetitivas, varios tests sin ningún `assert` que solo
    suman cobertura, y fricción con las herramientas de medición (JaCoCo).
- **Randoop**
  - Fortalezas: no requiere runner especial y explora secuencias de uso
    realistas.
  - Debilidades: muchos tests redundantes, ejecución lenta y menor mutation score (69%) pese a tener la suite más grande.