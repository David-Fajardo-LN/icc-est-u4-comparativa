package controles;
import models.*;

public class SortPersonMethods {
    public void insertionSort(Persona[] personas){
        int n = personas.length;

        for(int i = 1; i<n; i++){
            Persona key = personas[i];
            int j = i-1;
            while (j>=0 && personas[j].getCriterioOrdenamiento() > key.getCriterioOrdenamiento()) {
                personas[j+1] = personas[j];
                j -= 1;
            }
            personas[j+1] = key;
        }

    }
    public void quickSort(Persona[] personas, int inicio, int fin){
        if(inicio < fin){
            int indicePivote = particionar(personas, inicio, fin);
            quickSort(personas, inicio, indicePivote -1);
            quickSort(personas, indicePivote + 1, fin);
        }
    }
    private int particionar(Persona[] personas, int inicio, int fin){
        Persona privote = personas[fin];
        int i = inicio-1;
        
        for(int j = inicio; j<fin;j++){
            if(personas[j].getCriterioOrdenamiento() <= privote.getCriterioOrdenamiento()){
                i++;
                intercambiar(personas, i, j);
            }
        }
        intercambiar(personas, i+1, fin);
        return i+1;
    }
    private void intercambiar(Persona[] personas, int i, int j){
        Persona aux = personas[i];
        personas[i] = personas[j];
        personas[j] = aux;
    }    
}
