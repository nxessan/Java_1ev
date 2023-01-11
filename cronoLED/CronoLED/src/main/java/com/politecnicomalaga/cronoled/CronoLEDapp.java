package com.politecnicomalaga.cronoled;

/**
 *
 * @author noelia
 */
public class CronoLEDapp {
    
        public static void main(String[] args) {
        
   
        CronoLED cronometro = new CronoLED(7,0,59,9);
        System.out.println(cronometro.toString());
        cronometro.haciaAdelante();
        System.out.println(cronometro.toString());
        cronometro.haciaAdelante();
        System.out.println(cronometro.toString());
        cronometro.reanudar();
        System.out.println(cronometro.toString());
        cronometro.pausar();
        System.out.println(cronometro.toString());
            
        }

                    
                   
    //UPDATE
      
}
