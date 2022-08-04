
package com.mycompany.cuentaahorro;

import java.util.Scanner;

public class CuentaAhorro
{
    public static void main(String[] args)
    {    
        Scanner scan = new Scanner(System.in); 
        Metodos metodo= new Metodos();
        int op;      
        
        do{
            System.out.println("*** Menu Principal ***");
            System.out.println("----------------------");
            System.out.println("1.- Ingresar Cuenta");
            System.out.println("2.- Retirar Cuenta");
            System.out.println("3.- mostrar cuenta");
            System.out.println("4.- Salir");
            
            do{
                System.out.print("ingrese una opcion valida: ");
                op=scan.nextInt();                   
            }while(op<0 || op>4);
            
                switch (op)
                    {
                        case 1:   
                            String titular;
                            double cantidad;
                            System.out.print("Ingrese titular: ");titular=scan.next();
                            System.out.print("Ingrese cantidad: ");cantidad=scan.nextDouble();                                              
                           
                            if(metodo.ver_agregar(cantidad)== true)
                             {
                                 System.out.println("La cantidad ingresada no es un dato valido");
                             }else{                                
                                 Cuenta cuenta= new Cuenta(titular, cantidad);  
                                 metodo.agregar_cuenta(cuenta);
                                 System.out.println("Cuenta agregada exitosamente");
                             }    
                        break;                                                  

                        case 2:
                             int indice;
                             metodo.Mostrar_cuentas();
                             System.out.print("Ingrese indice ");indice=scan.nextInt();                                     
                             metodo.retirar(indice);          
                             
                        break;

                        case 3:
                            metodo.Mostrar_cuentas();                              
                        break; 
                                                
                        case 4:
                            System.exit(0);
                    }                   
        }while(op<=4);        
    }  
}

