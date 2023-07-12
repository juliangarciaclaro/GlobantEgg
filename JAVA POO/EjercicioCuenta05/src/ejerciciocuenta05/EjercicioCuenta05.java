package ejerciciocuenta05;

import ejerciciocuenta05.Cuenta.Cuenta;
import java.util.Scanner;

public class EjercicioCuenta05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Cuenta cs = new Cuenta();

        //crear objeto
      Cuenta c1 = cs.crearcuenta();

        //saber saldo actual
        c1.consultarSaldo();

        //ingresar dinero
        System.out.println("cuanto dinero deseas ingresar a tu cuenta");
        double ingreso = leer.nextDouble();

        c1.ingresar(ingreso);

        //saber saldo actual de nuevo
        c1.consultarSaldo();

        //retirar dinero
        System.out.println("cuanto dinero deseas retirar");
        double retirar = leer.nextDouble();

        c1.retirar(retirar);

        //saber saldo actual de nuevo
        c1.consultarSaldo();

        //metodo de retiro rapido
        c1.extraccionRapida();

        //saber saldo actual de nuevo
        c1.consultarSaldo();

        System.out.println("------------------");
        System.out.println("");

        //consultar datos completos
        c1.consultarDatos();

    }

}
