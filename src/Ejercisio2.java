import java.util.Stack;

public class Ejercisio2 {
    public boolean esPalindromo(String texto) {
        // 1. Crear una pila de caracteres.
        Stack<Character> pila = new Stack<>();

        // 2 y 3. Recorrer el texto carácter por carácter e insertarlo en la pila.
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }

        // 4. Sacar los caracteres de la pila para formar el texto invertido.
        String textoInvertido = "";
        while (!pila.isEmpty()) {
            textoInvertido += pila.pop();
        }

        // 5, 6 y 7. Comparar el texto original con el invertido y retornar el resultado.
        return texto.equals(textoInvertido);
    }

}
