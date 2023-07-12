package ejerciciocadena08.Entidad;

public class Cadena {

    private String frase;
    private int longitud;

    //constructores
    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    //getters y setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    //metodos
    public void contarVocales() {
        int contador = 0;
        for (int i = 0; i < longitud; i++) {
            char letra = frase.charAt(i);

             if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            contador += 1;
        

            }

        }
        System.out.println("la cantidad de vocales que tiene la frase es: " + contador);
    }

    public void invertirFrase() {
        StringBuilder service = new StringBuilder(frase);
        String fraseInvertida = service.reverse().toString();
        System.out.println("la frase invertida es: " + fraseInvertida);
    }

    public void vecesRepetido(String letra) {
        int contador = 0;
        for (int i = 0; i < longitud; i++) {
            if (letra.equals(frase.substring(i, i + 1))) {
                contador += 1;
            }
        }
        System.out.println("la letra: " + letra + " se repite " + contador + " veces");
    }

    public void compararLongitud(String frase2) {
        if (longitud == frase2.length()) {
            System.out.println("las frases tienen el mismo tamaño");
        } else {
            System.out.println("la frases no tienen el mismo tamaño");
        }
    }

    public void unirFrases(String frase2) {
        System.out.println(frase.concat(frase2));
    }

    public void reemplazar(String letra) {
        String reemplazo = frase.replace("a", letra);

        System.out.println(reemplazo);
    }

    public boolean contiene(String letra) {
        boolean contiene = frase.contains(letra);
        return contiene;
    }

}
