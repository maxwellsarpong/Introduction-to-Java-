public class ThreadsJava extends Thread{
    public static int amount = 0;

    public void run(){
        System.out.println("i am running in a thread");
        amount++;
        System.out.println(amount);
    }
    
    public static void main(String[] args) {
        /*

            Java Threads
            Threads allows a program to operate more efficiently 
            by doing multiple things at the same time.

            Threads can be used to perform complicated tasks in the background without 
            interrupting the main program.

            Creating a Thread
            There are two ways to create a thread.

            It can be created by extending the Thread class and overriding its run() method:
        */

        ThreadsJava thread = new ThreadsJava();
        thread.start();

        while(thread.isAlive()) {
            System.out.println("Waiting...");
          }


        System.out.println("Main: " + amount);
          
        //thread.run();
        amount++;
        System.out.println("Main: " + amount);
        


    }
}
