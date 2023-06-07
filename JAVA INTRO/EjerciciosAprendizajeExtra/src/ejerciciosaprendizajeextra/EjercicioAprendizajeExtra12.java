/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizajeextra;


/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizajeExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        //definir variables
        int num1, num2, num3;

        for (int i = 0; i < 10; i++) {
            num1 = i;
            String num1S = Integer.toString(num1);
            if ("3".equals(num1S)) {
                num1S = "E";
            }
            for (int j = 0; j < 10; j++) {
                num2 = j;
                String num2S = Integer.toString(num2);
                if ("3".equals(num2S)) {
                    num2S = "E";
                }
                    for (int k = 0; k < 10; k++) {
                        num3 = k;
                        String num3S = Integer.toString(num3);
                        if ("3".equals(num3S)) {
                            num3S = "E";
                        }
                            System.out.println(num1S + "-" + num2S + "-" + num3S);

                        }

                    }

                }

            }
        }
    
