package app;

import controles.SortPersonMethods;
import java.util.concurrent.Callable;
import models.Persona;
import models.Resultado;
import utils.Benchmarking;

public class App {

    public static void main(String[] args) {

        SortPersonMethods controller = new SortPersonMethods();
        Persona[] personas = generarPersonas(10000);
        
        Persona[] personasInsercion = personas.clone();
        Persona[] personasQuick = personas.clone();

        Resultado r1 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasInsercion);
                    return null;
                }
            },
            "Insercion",
            "Desordenado",
            personasInsercion.length
        );
        Resultado r2 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personasQuick,0,personasQuick.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Desordenado",
            personasQuick.length
        );

        Persona[] personasInsercion2 = generarPersonas(10_001);
        controller.insertionSort(personasInsercion2);
        personasInsercion2[personasInsercion2.length-1] = new Persona("Persona21", 12);

        Resultado r3 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasInsercion2);
                    return null;
                }
            },
            "Insercion",
            "Casi ordenado + 1 persona",
            personasInsercion2.length
        );

        Persona[] personasQuick2 = generarPersonas(10_001);
        controller.quickSort(personasQuick2, 0, personasQuick2.length-1);
        personasQuick2[personasQuick2.length - 1] = new Persona("Persona21", 12);

        Resultado r4 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(
                        personasQuick2,
                        0,
                        personasQuick2.length - 1
                    );
                    return null;
                }
            },
            "QuickSort",
            "Casi ordenado + 1 persona",
            personasQuick2.length
        );
        System.out.printf("%-30s | %-10s | %-7s | %s%n","ESCENARIO 10 000","ALGORITMO","MUESTRA","TIEMPO");
        System.out.println("----------------------------------------------------------------");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);


        Persona[] personasInsertionEscenario2 = generarPersonas(50_000);
        Persona[] personasInsertion5 = personasInsertionEscenario2.clone();
        Persona[] personasQuick5 = personasInsertionEscenario2.clone();

        Resultado r5 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasInsertion5);
                    return null;
                }
            },
            "Insercion",
            "Desordenado",
            personasInsertion5.length
        );
        Resultado r6 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personasQuick5,0,personasQuick5.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Desordenado",
            personasQuick5.length
        );

        Persona[] personasInsertion52 = generarPersonas(50_001);
        controller.insertionSort(personasInsertion52);
        personasInsertion52[personasInsertion52.length-1] = new Persona("Persona21", 12);

        Resultado r7 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasInsertion52);
                    return null;
                }
            },
            "Insercion",
            "Casi ordenado + 1 persona",
            personasInsertion52.length
        );

        Persona[] personasQuick52 = generarPersonas(50_001);
        controller.quickSort(personasQuick52, 0, personasQuick52.length-1);
        personasQuick52[personasQuick52.length-1] = new Persona("Persona21", 12);

        Resultado r8 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personasQuick52,0,personasQuick52.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Casi ordenado + 1 persona",
            personasQuick52.length
        );

        System.out.println();
        System.out.println();

        System.out.printf("%-30s | %-10s | %-7s | %s%n","ESCENARIO 50 000","ALGORITMO","MUESTRA","TIEMPO");
        System.out.println("----------------------------------------------------------------");
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
        System.out.println(r8);

        Persona[] personasInsertionEscenario3 = generarPersonas(100_000);
        Persona[] personasInsertion10 = personasInsertionEscenario3.clone();
        Persona[] personasQuick10 = personasInsertionEscenario3.clone();

        Resultado r9 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasInsertion10);
                    return null;
                }
            },
            "Insercion",
            "Desordenado",
            personasInsertion10.length
        );
        Resultado r10 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personasQuick10,0,personasQuick10.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Desordenado",
            personasQuick10.length
        );

        Persona[] personasInsertion102 = generarPersonas(100_001);
        controller.insertionSort(personasInsertion102);
        personasInsertion102[personasInsertion102.length-1] = new Persona("Persona21", 12);

        Resultado r11 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasInsertion102);
                    return null;
                }
            },
            "Insercion",
            "Casi ordenado + 1 persona",
            personasInsertion102.length
        );

        Persona[] personasQuick102 = generarPersonas(100_001);
        controller.quickSort(personasQuick102, 0, personasQuick102.length-1);
        personasQuick102[personasQuick102.length-1] = new Persona("Persona21", 12);

        Resultado r12 = Benchmarking.mediTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personasQuick102,0,personasQuick102.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Casi ordenado + 1 persona",
            personasQuick102.length
        );

        System.out.println();
        System.out.println();

        System.out.printf("%-30s | %-10s | %-7s | %s%n","ESCENARIO 100 000","ALGORITMO","MUESTRA","TIEMPO");
        System.out.println("----------------------------------------------------------------");
        System.out.println(r9);
        System.out.println(r10);
        System.out.println(r11);
        System.out.println(r12);


    }

    public static Persona[] generarPersonas(int cantidad) {
        Persona[] personas = new Persona[cantidad];
        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona" + (i + 1);
            int edad = (int)(Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }
        return personas;
    }
}
