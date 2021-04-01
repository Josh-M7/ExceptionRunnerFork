package baylor.edu.csi3471.lab10;

public class PracticeThread extends Thread {
    private Printer printer;
    private int identifier;
    
    public PracticeThread(Printer p, int number){
        printer = p;
        identifier = number;
    }
    
    public int getIdentifier() {
        return identifier;
    }
    
    public void run() {
        printer.print(this);
    }
}
