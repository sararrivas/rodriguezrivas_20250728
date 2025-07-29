/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguezrivas_20250728;

/**
 *
 * @author UFG
 */
public class Main {
    
    public static String nombres = "Sara";
    public static String apellidos = "Rodriguez Rivas";
    public static int anio_nacimiento = 2002;
    public static int mes_nacimiento = 5;
    public static float estatura = 1.74f;
    public static float peso = 151f;
    public static char genero = 'F';
    public static String estado_familiar = "casada con tato";
    public static double salario_mensual= 700d;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double imc = 0.0d;
        float tasa_kilogramo = 0.453592f;
        int dias_laborales = 22;
        int horas_laborales = 8;
        
        // CONVERTIR EL PESO DE LB A KG
        float peso_kilogramos = Main.peso*tasa_kilogramo;
        // ELEVAR ALTURA AL CUADRADO
        float estatura_al_cuadrado = Main.estatura*Main.estatura;
        // CALCULAR EL INDICE DE MASA CORPORAL
        
        imc = peso_kilogramos/estatura_al_cuadrado;
        
        // CALCULANDO EL SALARIO DIARIO
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        // CALCULANDO EL SALARIO POR HORA 
        double salario_hora = salario_diario/horas_laborales;
        
      
        // SALIDA DE DATOS//
        
        System.out.println("Saludos "+Main.nombres+" "+Main.apellidos);
        System.out.println("Su peso en libras es: "+Main.peso+", pero en kg es: "+peso_kilogramos);
        System.out.println("Su Indice de Masa Corporal es: "+imc);
        System.out.println("Su salario mensual es: "+Main.salario_mensual);
        System.out.println("Su salario diario es: "+salario_diario);
        System.out.println("Su salario por hora es: "+salario_hora);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
