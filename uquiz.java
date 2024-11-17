import java.util.ArrayList;
class UQuiz {
    public static void main(String args[]) {
        System.out.println("Hello");
        String[] furniture = new String[]{"Bed", null, "Sofa", "Table", null, null};
        arrayListMethod();
    }

    
public static void arrayListMethod() {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(9);
    numbers.add(1);
    numbers.set(0,10);
    numbers.remove(1);
    numbers.add(7);
    System.out.println(numbers.get(1));
 }
}