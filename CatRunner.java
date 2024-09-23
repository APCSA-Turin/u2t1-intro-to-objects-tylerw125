public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ryan", 5, 203.4);
        cat1.introduce();  // calling a method on the object
        cat1.printCatInfo();
   
        Cat cat2 = new Cat("Alex", 62, 993.4);
        System.out.println();
        cat2.printCatInfo();
        cat2.introduce();  // calling a method on the object
        
    }
}
    
