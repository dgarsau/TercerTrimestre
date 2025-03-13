package org.example.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Pruebas {

    public static void main(String[] args) {

        Queue<Integer> cola = new ArrayBlockingQueue<>(2);

        cola.add(3);
        cola.add(4);

        Queue<Integer> cola2 = new LinkedList<>();

        cola2.offer(34);
        cola2.offer(15);
        cola2.offer(56);

        System.out.println(cola2.poll());
        System.out.println(cola2.peek());

        List<Integer> lista = new LinkedList<>();
        lista.add(0,34);

        Deque<Integer> cola_doble = new LinkedList<>();

        cola_doble.offer(3);
        cola_doble.offerFirst(6);
        cola_doble.offerLast(10);
        cola_doble.pollFirst();
        cola_doble.pollLast();

        System.out.println(cola_doble);


    }

}
