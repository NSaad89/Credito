package patronesdediseño_sistemadecreditos;

import patronesdediseño_sistemadecreditos.Interfaces.Sistema_Amortizacion;
import java.util.Scanner;
import patronesdediseño_sistemadecreditos.Sistemas_de_amortizacion.Aleman;

public class CreditoMain {

    public static void main(String[] args) {
        
        Sistema_Amortizacion aleman = new Aleman();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese monto, cuotas e interes (en n° enteros) para comenzar la simulación de crédito:");
        System.out.print("Monto:");
        
        Long monto = teclado.nextLong();
        
        System.out.print("Interes:");
        Integer interes = teclado.nextInt();
        
        System.out.print("Cuotas:");
        Integer cuotas = teclado.nextInt();
        
        aleman.Amortizacion(monto, interes, cuotas);
        
    }
    
}
