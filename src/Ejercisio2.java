import java.util.Stack;

public class Ejercisio2 {
    public boolean esPalindromo(String texto) {
    
        Stack<Character> pila = new Stack<>();

        
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }

        
        String textoInvertido = "";
        while (!pila.isEmpty()) {
            textoInvertido += pila.pop();
        }

       
        return texto.equals(textoInvertido);
    }

}
