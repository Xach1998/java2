package chapter8Hierarchy;

public class B extends A {
    int k;
    void showk(){
        System.out.println("k: "+ k);

    }
    void sum() {
        System.out.println("i+j+k: "+ (i+j+k));
    }

//    @Override
//    void print() {
//        super.print();
//        System.out.println("java");
//    }

}
