/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication111;

import java.util.Scanner;

public abstract class ClasePadre {
    protected float hora, hora1, hora2, hora3, hora4;
    float resultado1=0,resultado2=0,resultado3=0;
    float resultado11=0, resultado22=0,resultado44=0;
    double v;

    Scanner s = new Scanner(System.in);

    // Constructor //
    public ClasePadre() {

    }

 
    public void PedirRegionPop() {

        System.out.println("Introduce las horas al dia en las que escuchas pop : ");
        hora = s.nextFloat();

    }
    
    public void PedirRegionRap() {

        System.out.println("Introduce las horas al dia en las que escuchas rap : ");
        hora1 = s.nextFloat();

    }
    
    void PedirRegionRegueton() {

        System.out.println("Introduce las horas al dia en las que escuchas regueton : ");
        hora2 = s.nextFloat();

    }

     
    
   
    
    

    // Se muestra el area de la figura seleccionada //
    public abstract void Operaciones();

    public void MostrarResultados() {
        System.out.println("HORAS PROMEDIO A LA SEMANA:"+resultado1 + "hrs");
    
    }
}

