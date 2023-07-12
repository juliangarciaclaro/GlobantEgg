package ejerciciocuenta05.Cuenta;

import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private long DNI;
    private int saldoActual;

    //constructores
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    // getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    //funciones y metodos 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearcuenta() {
        System.out.println("dame el numero de cuenta ");
        int numeroCuenta = leer.nextInt();
        System.out.println("dame el numero de DNI");
        long DNI = leer.nextLong();
        System.out.println("dame el saldo de tu cuenta");
        int saldoActual = leer.nextInt();

        return new Cuenta(numeroCuenta, DNI, saldoActual);

    }
    
    

    public int ingresar(double ingreso) {
      
        saldoActual += ingreso;
        return saldoActual;
    }

    public int retirar(double retiro) {
      
        if (saldoActual<retiro) {
            saldoActual = 0;
             }else {
            saldoActual-=retiro;
        }
        return saldoActual;
    }
    
    public int extraccionRapida(){
        System.out.println("cuanto dinero desea retirar");
        int retirar = leer.nextInt();
        if (retirar> saldoActual*0.2) {
            System.out.println("no puedes retirar esa cantidad de dinero");
        }else {
            saldoActual-=retirar;
        }
        return saldoActual;
    }
    
   
     public void consultarSaldo() {
        System.out.println("su saldo es: "+saldoActual);
    }
     
    public void consultarDatos() {
        System.out.println("su numero de cuenta es: "+numeroCuenta);
        System.out.println("su DNI es: "+DNI);
        System.out.println("su saldo actual es: "+saldoActual);
        
    }
    
}
