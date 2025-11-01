public class Main {
    public static void main(String[] args) throws InterruptedException {
        CentralQueue queue = new CentralQueue();

        HelpDeskStation s1 = new HelpDeskStation("A", queue);
        HelpDeskStation s2 = new HelpDeskStation("B", queue);
        HelpDeskStation s3 = new HelpDeskStation("C", queue);

        Monitor monitor = new Monitor(queue);

        s1.serveNextCustomer();
        s2.serveNextCustomer();
        s3.serveNextCustomer();

        monitor.display();

        s2.resetQueue(100);
        s1.serveNextCustomer();
        monitor.display();
    }
}