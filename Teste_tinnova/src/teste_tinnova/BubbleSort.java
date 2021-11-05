
package teste_tinnova;


public class BubbleSort {
    
  public static void main(String args[]) {
    int[] v = {5, 3, 2, 4, 7, 1, 0, 6};
    BubbleSort bs = new BubbleSort();
    bs.ordenar(v);
    for(int num : v) {
      System.out.print(num + " ");
    }
  }
  
  public void ordenar(int[] v) {

    for(int i = 0; i < v.length - 1; i++) {

      for(int j = 0; j < v.length - 1 - i; j++) {

        if(v[j] > v[j + 1]) {
          int aux = v[j];
          v[j] = v[j + 1];
          v[j + 1] = aux;
        }
      }
    }
  }

   
}

