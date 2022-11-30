
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class GijónCarlosDNI {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       //Añadimos las letras para poder hacer el calculo del dni
       char letras [] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
       //Añadimos Strings y chars que son necesarios para poder hacer el calculo
        String dni;
        char LetraO,result;
        //Validamos el dni 
        do {
            System.out.println("Introduce tu DNI con la letra");
            dni = entrada.nextLine();
            if (dni.length() != 9)
                System.out.println("intentalo de nuevo");
        } while (dni.length() != 9);
        //Cogemos la letra del dni que esta al final
        LetraO = dni.charAt(dni.length()-1);
        //Hacemos un substring a partir del string que hemos introducido en el sout solo con los numeros 
        dni = dni.substring(0,dni.length()-1);
        //Convetimos el dni que es un string en un numero para poder utilizarlo para operar
        //Función sacada de internet
        int dniNum = Integer.parseInt(dni);
        //Validamos otra vez que el dni no sea menor de 0 o mayor de 99999999 
        //Aunque no lo necesitamos porque ya hemos validado antes 
        if(dniNum > 0 && dniNum < 99999999){
            //Operación del calculo del DNI
            int Restdni = dniNum % letras.length;
            //Convetimos result en el resultado de la operación
            result = letras[Restdni];
            
        //Utilizamos lo siguiente para poder ver los resultados si lo necesitamos.
            //System.out.println(dni);
            //System.out.println(LetraO);
            //System.out.println(result);
            
            //Vemos si el dni es valido o no.
            if(result == LetraO){
                System.out.println("el dni es valido");
            } else {
                System.out.println("el dni no es valido");
            }
        } 
    }
}
