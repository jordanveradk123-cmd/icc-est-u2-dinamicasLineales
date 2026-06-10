import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class App {
    public static void main(String[] args) throws Exception {
     //runLinkList();

     //runQueue();

     //runStack();
     System.out.println("=====Ejercisio 1=====");
     Ejercisio1 ejr = new Ejercisio1();
     System.out.println(ejr.inveString("computacion"));
     System.out.println("=====Ejercisio 2=====");
    Ejercisio2 ejr2 = new Ejercisio2();
    System.out.println(ejr2.esPalindromo("radar"));
    System.out.println(ejr2.esPalindromo("computacion"));
    }

    private static void runStack() {
       // Stack<String>pila = new Stack<>();
        ArrayDeque<String>pila= new ArrayDeque<>();

        pila.push("Jose");
        pila.push("Andres");
        pila.push("Ana");
        pila.push("Maria");
        pila.push("Maria2");

        System.out.println(pila.isEmpty());
        System.out.println(pila.size());

        System.out.println(pila.peek());//Maria2
        System.out.println(pila.size());//5

        System.out.println(pila.pop());//saca a Maria2
        System.out.println(pila.size());//4

         while(!pila.isEmpty()){
            String cliente = pila.pop();
            System.out.println("Sale"+ cliente);

        }
        System.out.println(pila.size());//0
    }

    private static void runQueue() {
        Queue<String>cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");

        System.out.println(cola.isEmpty());
        System.out.println(cola.peek());//"Jose"
        System.out.println(cola.size());//3
        System.out.println(cola.poll());//saca a Josue
        System.out.println(cola.size());//andres y ana

        while(!cola.isEmpty()){
            String cliente = cola.poll();
            System.out.println("atendi a"+ cliente);

        }
    }

    private static void runLinkList() {
        LinkedList<String>nombres = new LinkedList<>();
        ArrayList<String> nombres2 = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");
        nombres.add("Mateo");

        String primero = nombres.getFirst();
        System.out.println(primero);
        System.out.println(nombres.getFirst());

        System.out.println(nombres.get(5)); //O(n)

        System.out.println(nombres.getLast());
        System.out.println(nombres.size()-1);

        System.out.println(nombres.pop());
        System.out.println(nombres.size());
    }
 
}
