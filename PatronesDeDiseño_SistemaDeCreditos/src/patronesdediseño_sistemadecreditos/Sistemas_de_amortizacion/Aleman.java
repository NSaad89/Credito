package patronesdediseño_sistemadecreditos.Sistemas_de_amortizacion;

import patronesdediseño_sistemadecreditos.Interfaces.Sistema_Amortizacion;

public class Aleman implements Sistema_Amortizacion{

    public Aleman() {
    }
      
    @Override
    public Long Amortizacion (Long monto, Integer interes, Integer cuotas){
        
        Long cuota_a_abonar;
        
        for (int nro_cuota = 0; nro_cuota < cuotas; nro_cuota++) {
            
            Long cuota_base = monto/cuotas;
            
            Long monto_actual = monto - (nro_cuota*cuota_base);
            
            Long monto_por_interes = ((monto_actual*interes)/100)/12;
            
            cuota_a_abonar = cuota_base + monto_por_interes;
            
            System.out.println("Cuota #" + (nro_cuota + 1) + " $" + cuota_a_abonar +
                    " Interes actual: $" + monto_por_interes + " Restante: $" + monto_actual);
            
            if ((monto_actual - cuota_a_abonar) <= 0) {
            
            break;
                
            }
                                   
        }
        
        return null;
    }
    
}
