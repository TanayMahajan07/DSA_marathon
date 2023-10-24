public class Main {
    static void changeName(String name){
        name="tanay";    // here we are creating new object .not modifying,
    }

    public static void main(String[] args) {
        String name="suyash";
        changeName(name);     // would not print tanay.
        System.out.println(name);




    }
}