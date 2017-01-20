
package exemplomatriz;

import javax.swing.JOptionPane;


public class Matriz {
           
    int[][] notas = new int[3][4];
    float[] notasMedias=new float[3];
    float[] mediasModulos=new float[4];
        

    public void cargaMatriz() {
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                notas[f][c] = pedirNota();
            }
        }
    }
    public int pedirNota() {
        int resultado;
        do {
            resultado = Integer.parseInt(JOptionPane.showInputDialog("nota: "));
        } while (resultado < 1 || resultado > 10);
        return resultado;
    }
    public void amosarMatriz(){
        for(int f=0;f<notas.length;f++){
            for(int c=0;c<notas[f].length;c++){
                System.out.print(notas[f][c]+"     ");
            }
            System.out.print("\n");
        }
        
}
  
  
    public void calcularMediaNotas(){
        float acumulador;
        for(int f=0;f<notas.length;f++){
            acumulador=0;
        
        for(int c=0;c<notas[f].length;c++){
            acumulador=acumulador+notas[f][c];
        }
        notasMedias[f]=acumulador/notas[f].length;
    }
}
    public void amosarLista(){
        for(int i=0;i<notasMedias.length;i++){
            System.out.println(notasMedias[i]);
    
}
}
    public void calcularMediaModulos(){
        float acumulador;
        for(int c=0;c<4;c++){
            acumulador=0;
        for(int f=0;f<3;f++){
            acumulador=acumulador+notas[f][c];
        }
         mediasModulos[c]=acumulador/3;
        }
    }
    public void amosarModulos(){
        for(int i=0;i<mediasModulos.length;i++){
            System.out.println(mediasModulos[i]);
        
    }
}
}