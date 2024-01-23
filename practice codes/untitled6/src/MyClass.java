public class MyClass {
     String value="Works at Tntra";
     String name;
     int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void getBio(){
         System.out.println(this.value);
     }
     MyClass(String name, int age){
         System.out.println( this.name=name);
         System.out.println(this.age=age);
     }

}
