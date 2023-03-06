/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_paso_valor_referencia;

/**
 *
 * @author Marisol G
 */
public class EVA1_5_PASO_VALOR_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        int valor=10;
        System.out.println("Valor = " + valor );
        increPorValor(valor);
        System.out.println("Valor = " + valor);
        ////
        System.out.println("Ahora con objetos");
        MiValor objValor = new MiValor();
        System.out.println("Obj Valor = "+ objValor.otroValor);
        increPorRefe(objValor);
        System.out.println("Obj valor = "+ objValor.otroValor);
    }
    public static void increPorValor(int valorIncre){
        valorIncre ++;
        
    }
    public static void increPorRefe(MiValor miVal){
        miVal.otroValor ++;
        
    } 
}
 class MiValor{
     int otroValor = 10;
 
 }