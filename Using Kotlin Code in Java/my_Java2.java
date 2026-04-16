// calling Kotlin from Java

public class my_Java2 {
    public static void main(String[] args) {
        int sum = ExampleKotlinKt.add(5,2);
        System.out.println("Total "+sum);
    }
}

// to run this code,
// cd "d:\Kotlin\Using Kotlin Code in Java" ; javac my_Java2.java ; kotlinc exampleKotlin.kt -d . ; java -cp . my_Java2