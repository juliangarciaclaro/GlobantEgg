package ejerciciopersona07;

import ejerciciopersona07.Entidad.Persona;

public class EjercicioPersona07 {

    public static void main(String[] args) {

        //llamado de clase persona y sus metodos
        Persona sp = new Persona();

        //instanciar objetos persona
        Persona persona1 = sp.crearPersona();
        Persona persona2 = sp.crearPersona();
        Persona persona3 = sp.crearPersona();
        Persona persona4 = sp.crearPersona();

        //creacion de vectores para almacenar los resultados de los metodos 
        int[] IMC = new int[4];
        boolean[] mayorEdad = new boolean[4];

        IMC[0] = persona1.calcularIMC();
        IMC[1] = persona2.calcularIMC();
        IMC[2] = persona3.calcularIMC();
        IMC[3] = persona4.calcularIMC();

        mayorEdad[0] = persona1.esMayorDeEdad();
        mayorEdad[1] = persona2.esMayorDeEdad();
        mayorEdad[2] = persona3.esMayorDeEdad();
        mayorEdad[3] = persona4.esMayorDeEdad();

        double contEdad = 0;
        double contDebajo = 0;
        double contIdeal = 0;
        double contEncima = 0;
        double cantidadPersonas = IMC.length;
        
        //logica para saber cantidad de personas con condicion de peso especifico y cantidad de personas mayores de edad

        for (int i = 0; i < cantidadPersonas; i++) {

            switch (IMC[i]) {

                case -1:
                    contDebajo +=1;
                    break;
                case 0:
                    contIdeal +=1;
                    break;
                case 1:
                    contEncima +=1;
                    break;
            }
            
            if (true==mayorEdad[i]) {
                contEdad+=1;
            }
        }
        
        //porcentaje de personas por debajo de su peso ideal
        double debajoPeso = (contDebajo*100)/cantidadPersonas;
        System.out.println("porcentaje de personas por debajo de su peso ideal: "+debajoPeso+"%");
        //porcentaje de personas con peso ideal
        double idealPeso = (contIdeal*100)/cantidadPersonas;
        System.out.println("porcentaje de personas en peso ideal: "+idealPeso+"%");
        //porcentaje de personas con sobre peso
        double encimaPeso =(contEncima*100)/cantidadPersonas;
        System.out.println("porcentaje de personas con sobrepeso: "+encimaPeso+"%");
        
        //porcentaje de personas mayores de edad y menores de edad 
        double mEdad = (contEdad*100)/cantidadPersonas;
        System.out.println("porcentaje de personas mayores de edad: "+mEdad+"%");
        System.out.println("porcentaje de personas menores de edad: "+(100-mEdad)+"%");

    }
}
