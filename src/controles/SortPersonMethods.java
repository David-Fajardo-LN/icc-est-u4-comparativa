package controles;
import models.*;

public class SortPersonMethods {
    public void insertionSort(Persona[] personas){
        
    }
    public void quickSort(Persona[] personas, int inicio, int fin){

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
