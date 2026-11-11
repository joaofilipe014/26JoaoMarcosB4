package Seminario;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class Espaco {
    BlockingQueue<Integer> fila = new LinkedBlockingQueue<>();
    ConcurrentHashMap<Integer, String> status = new ConcurrentHashMap<>();
}





