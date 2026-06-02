## EXPLICACION GENERAL
El codigo busca mostrar en consola los tiempos que requieren los métodos insertion y quirck para organizar una lista en dos formas, completamente desordenada y otra en la que solo falta el ultimo elemento por ordenar. Para ello, usa un controlador que contiene ambos ordenamientos y se usa dentro de otro metodo llamado resultados que extrae la informacion nesesaria de la ejecucion para mostrar los datos en la consola.
## RESULTADOS OBTENIDOS
### Tabla 1: ESCENARIO 1: arreglo completamente desordenado

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
| :--- | :--- | :--- | :--- | :--- |
| 10.000 | 29,77 ms | 7,06 ms | QuickSort | QuickSort es 4 veces más rápido |
| 50.000 | 879,05 ms | 113,41 ms | QuickSort | QuickSort es 7 veces más rápido |
| 100.000 | 4173,97 ms | 522,26 ms | QuickSort | QuickSort es 8 veces más rápido |

### Tabla 2: ESCENARIO 2: arreglo casi ordenado

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
| :--- | :--- | :--- | :--- | :--- |
| 10.000 | 0,11 ms | 7,06 ms | InsertionSort | InsertionSort es 64 veces más rápido |
| 50.000 | 0,32 ms | 125,14 ms | InsertionSort | InsertionSort es 391 veces más rápido |
| 100.000 | 0,77 ms | 601,44 ms | InsertionSort | InsertionSort es 781 veces más rápido |

## ANALISIS Y PREGUNTAS
1. ¿Qué algoritmo fue más rápido en el escenario desordenado?
En todos los tamaños de listras, QuickSort fue el más rapido y práctico en escenarios completamente desordenados. Esto relacionado directamente con su complejidad O(n log n).
2. ¿Qué algoritmo fue más rápido en el escenario casi ordenado?
En este escenario InsertionSort fue mas rápido, en el mayor numero de datos, fue 781 veses mas rapido. Debido a que insertion toma un elemento y lo compara hacia atras, como el arreglo está casi ordenado, únicamente se reccorre hacia atras buscando la posicion del ultimo elemento, lo que reduce drasticamente el tiempo de ejecución.
3. ¿El crecimiento del tamaño de la muestra afecto por igual a los dos algoritmos?
No, dependiendo del escenario en cuestion, el crecimiento del tamaño de la muestra puede afectar mucho mas a uno en específico. Por ejemplo; en el primer escenario el insertionSort resultó mas afectado en su tiempo de ejecucion, en cambio en el segundo escenario fue quickSort el mas afectado. Esto en gran parte por la complejidad y la logica interna de cada algoritmo. 
4. ¿Por qué inserción puede mejorar cuando el arreglo ya está casi ordenado?
InsertionSort funciona comparando elementos hacia atras, separando en dos grandes sub conjuntos, los ordenamos y los que faltan por ordenar. Desplaza cada elemento hasta encontrar su posicion correcta en el arreglo. Cuando el arreglo esta casi ordenado, se realizan muy pocas comparaciones, en el ejemplo específico de este trabajo, no desplazo ningun valor exepto el ultimo. Por eso su tiempo de ejecucion se redujo drásticamente.
5. ¿Por qué QuickSort suele ser mejor cuando los datos estan muy desordenados?
Por que quickSort divide el problema en pivotes de manera rápida desde un inicio, estos pivotes distribuyen los elementos de forma muy eficiente cuando el arreglo esta en su mayoria desorganizado y el trabajo de organizar se reparte entre subarreglos cada vez mas pequeños. Las comparaciones internas del metodo crecen según su complejidad O(n log n).

## CONCLUSIONES
Conclusion 1: QuickSort fue el algoritmo mas eficiente cuando los datos estan en su mayoria completamente desorganizados, ya que secciona mejor los distintos grupos con los pivotes y redelega de mejor manera las comparaciones. Manteniendo tiempos considerablemente menores al insertionSort en todos los casos medidos del trabajo. En cambio, insertion se tardo mucho mas, debido a que el caso de ordenamiento se hacerco bastante a una complejidad cuadrática por la cantidad de comparaciones realizadas internamente entre las dos secciones.

Conclusion 2: InsertionSort  mostro mejor rendimiento cuando los datos estaban organizados en gran parte de manera correcta. Los tiempos de ejecución bajan drásticamente incluso en un arreglo de 100 000 elementos, en todos los casos, se mantuvo entre 0 >= x =< 1 ms para todos los casos. Esto demuestra que el metodo aprovecha eficasmente los elementos ya organizados para evitar trabajo inesesario.

Conclusión 3: Tambien se puede concluir que el rendimiento de un algoritmo no se centra únicamente en el metodo de ordenamiento utilizado, sino tambien en el estado incial de los arreglos a organizar. En el trabajo, se demuestra, por que la elección de un metodo de ordenamiento no depende de que tan complejo o rapido pueda organizar un arreglo, sino que tan bien se incorpora al conjuntos de datos que se busca organizar.

