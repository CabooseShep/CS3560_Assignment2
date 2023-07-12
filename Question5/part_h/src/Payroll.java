public class Payroll {

    public Payroll(){
        System.out.println("Constructor created");
    }

    public static void processPayments(Worker worker){
        System.out.println("Payment processed for worker " + worker.getName());
    }
}
