import java.util.ArrayDeque;

public class Ejercisio1 {
     public String inveString(String texto){
        ArrayDeque<Character> pila = new ArrayDeque<>();
        for (char letra : texto.toCharArray()) 
            pila.push(letra);
            String invertido = "";
            while(!pila.isEmpty()){
                invertido+=pila.pop();

            }
        
        return invertido;
    }  
}
