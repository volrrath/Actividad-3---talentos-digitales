package com.mycompany.cuentaahorro;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    ArrayList<Cuenta> cuentita = new ArrayList<>();
    Scanner sca = new Scanner(System.in);

    public void agregar_cuenta(Cuenta cuenta) {
        cuentita.add(cuenta);
        System.out.println("Cuenta agregada exitosamente");
    }

    public void Mostrar_cuentas() {
        if (cuentita.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            for (int i = 0; i < cuentita.size(); i++) {
                System.out.println("-. " + i + cuentita.get(i));
            }
        }
    }

    public boolean ver_agregar(double cantidad) {
        boolean respuesta = false;
        if (cantidad < 0) {
            respuesta = true;
        }
        return respuesta;
    }

    public void retirar(int indice) {
        double resul;
        double reti;

        System.out.println("La cuenta seleccionada es "+cuentita.get(indice).getTitular()+" con un saldo desponible de $"+cuentita.get(indice).getCantidad());
        System.out.print("Ingrese saldo a retirar: ");reti = sca.nextDouble();
        resul = (cuentita.get(indice).getCantidad()-reti);
        if (resul < 0) {
            cuentita.get(indice).setCantidad(0);
            System.out.println("Su cuenta quedo en 0");

        } else {
            cuentita.get(indice).setCantidad(resul);
            System.out.println("Su cuenta quedo con un saldo de " + resul+ "pesos");
        }
    }
}
