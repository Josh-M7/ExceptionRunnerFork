package baylor.edu.csi3471.lab10;

public class PrinterTest {
    public static void main(String[] args) {
        PracticeThread[] threads = new PracticeThread[20];
        Printer printer = new Printer();
        
        for(int i = 0; i < 20; i++) {
            threads[i] = new PracticeThread(printer, i);
        }
        
        for(int i = 0; i < 20; i++) {
            threads[i].start();
        }
    }
}
