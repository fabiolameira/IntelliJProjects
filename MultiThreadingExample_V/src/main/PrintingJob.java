package main;

class PrintingJob implements Runnable {
    
    private PrinterQueue printerQueue;
    
    public PrintingJob (PrinterQueue printerQueue) {
        this.printerQueue = printerQueue;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
        + "%s: Going to print a document");
        printerQueue.printJob();
    }
}