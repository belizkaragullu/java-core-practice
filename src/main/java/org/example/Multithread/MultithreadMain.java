package org.example.Multithread;

public class MultithreadMain {

    public static void main(String[] args) {

        Multithreading thread1 = new Multithreading(1);
        Multithreading thread2 = new Multithreading(2);

        //first thread then second thread, concurrent threads
        // thread1.start();
        // thread2.start();

        thread1.run();
        thread2.run();

        System.out.println("--------------------------");

        for(int i =3; i<6; i++){
            //at the same time,no order
            Multithreading threads = new Multithreading(i);
            threads.start();

        }


        //join
        for(int i = 6; i <9; i++){
            Multithreading threads = new Multithreading(i);
            threads.start();

            try {
                threads.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
