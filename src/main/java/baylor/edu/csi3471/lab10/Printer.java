package baylor.edu.csi3471.lab10;

public class Printer {
    private int currentThreadNumber = 0;
    
    public synchronized void print(PracticeThread input) {
        while(input.getIdentifier() > currentThreadNumber) {
            try {
                wait();
            } catch(InterruptedException e) {
            }
        }
        
        System.out.println("Thread with Identifier " + input.getIdentifier() + " is now printing.");
        currentThreadNumber++;
        notifyAll();
    }
}
