public class Main {
    static void eligibility(int age){
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else System.out.println("not Eligible");
    }
    public static void main(String[] args) {
    eligibility(17);
    }
}