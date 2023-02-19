package com.politecnicomalaga.cronoled;

/**
 *
 * @author noelia
 */
public class CronoLED {

    //ATRIBUTOS
    int horas;
    int minutos;
    int segundos;
    int decimas;
    boolean pausado;

    //CONSTRUCTOR
    public CronoLED(int horas, int minutos, int segundos, int decimas) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.decimas = decimas;
        this.pausado = true;
    }

    //GETTERS
    public int getHoras() {
        return this.horas;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    public int getDecimas() {
        return this.decimas;
    }

    public boolean getPausado() {
        return this.pausado;
    }
    
    public void reanudar() {
        this.pausado = false;
    }
    public void pausar(){
        this.pausado = true;
    }
    
    public void reset(){
        this.decimas = 0;
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

  

    private String getState(boolean state){
         if(this.pausado){
             return "PAUSADO";
         }else{
             return "REANUDADO";
         }
    }
    private String convertTime(int time) {
        String timeConverted;

        if (time < 10) {
            timeConverted = "0" + time;
        } else {
            timeConverted = String.valueOf(time);
        }
        return timeConverted;
    }
    
    public void haciaAdelante(){
        
        if(this.decimas < 9) {
            this.decimas++;
        }else {
             this.decimas = 0;
             if(this.segundos < 59) {
                this.segundos++;
             } else {
                 this.segundos = 0;
             }
        }
    }

    
      //Retornar un string con la visualizacion 
    public String toString() {
        String minutes = this.convertTime(this.minutos);
        String hours = this.convertTime(this.horas);
        String seconds = this.convertTime(this.segundos);

        return "(" + hours + ":" + minutes + ":" + seconds + ":" + this.decimas + ") " + getState(this.pausado);
    }
}
