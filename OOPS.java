
// **********************1111111111111111111************************

// class Pen {
//     String color;
//     String type;

//     public void write(){
//         System.out.println("writing something");
//     }

//     public void printColor(){
//         System.out.println(this.color);
//     }
// }



// public class OOPS{
//     public static void main(String args[]){
//         Pen pen1=new Pen();
//         pen1.color="blue";
//         pen1.type="gel";

//         Pen pen2=new Pen();
//         pen2.color="black";
//         pen2.type="ballpoint";

//         pen1.printColor();
//         pen2.printColor();

//     }
// }






//     ***************************22222222222222222222(Constructor)*************************************



// class Student {
//     String name;
//     int roll;

//     public void printName(){
//         System.out.println(this.name);
//         System.out.println(this.roll);
//     }

//     // non-paramitarized constructor
//     // Student(){
//     //     System.out.println("constructor called");

//     // }


//     //paramitarised contructor
//     Student(String name,int roll){
//         this.name=name;
//         this.roll=roll;
//     }    
// }


// public class OOPS{
//     public static void main(String args[]){
//        Student stu1=new Student("rishu",24);

//        stu1.printName();

//     }
// // }





// //                polymorphism





// class Student{

//     String name;
//     int roll;

//     public void printInfo(String name){
//         System.out.println(name);
//     }

//     public static void printInfo(int roll){
//         System.out.println(roll);
//     }

//     public static void printInfo(String name,int roll){
//         System.out.println(name+" "+roll);
//     }  
// }


// public class OOPS{
//     public static void main(String args[]){
//         Student s1=new Student();
//         s1.name="rishu";
//         s1.roll=24;

//         s1.printInfo(s1.name,s1.roll);
//     }
// }




//              inheritance -- single level 


// class Shape{

//     public void area(){
//         System.out.println("display area");
//     }
// }

// class Triangle extends Shape{
//     public void area(int l,int h){
//         System.out.println(1/2*l*h);
//     }
// }

// public class OOPS{
//     public static void main(String args[]){

//     }
// }



//                         inheritance - multilevel 



// class Shape{
//     public void area(){
//         System.out.println("display area");
//     }
// }

// class Triangle extends Shape{
//     public void area(int l,int h){
//         System.out.println(1/2*l*h);
//     }
// }

// class equlateralTriangle extends Triangle{
//     public void area(int l,int h){
//         System.out.println(1/2*l*h);

//     }
// }



// public class OOPS{
//     public static void main(String args[]){

//     }
// }




//              inheritance-- hierarchial


// class Shape{
//     public void area(){
//         System.out.println("display area");
//     }
// }

// class Triangle extends Shape{
//     public void area(int l,int h){
//         System.out.println(1/2*l*h);
//     }
// }

// class circle extends Shape{
//     public void area(int r){
//         System.out.println((3.14)*r*r);
//     }
// }

// public class OOPS{
//     public static void main(String args[]){

//     }
// }




//        abstraction -- using abstract classs



// abstract class Animal{
//     abstract void walk();

//     public static void eat(){
//         System.out.println("animal eats");
//     }

//     }


// class Horse extends Animal{
//     public void walk(){
//         System.out.println("walk on 4 legs");
//     }
// }

// class chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }

// public class OOPS{
//     public static void main(String args[]){

//         Horse h1=new Horse();
//         h1.walk();
//         h1.eat();

//     }
// }



//                 abstraction -- interfaces

interface Animal{
    void walk(); // abstract function
}

interface Herbivores{

}

class Horse implements Animal,Herbivores{ 
    public void walk(){
        System.out.println("walks on four legs");
    }
}
public class OOPS{
    public static void main(String args[]){
        Horse horse=new Horse();
        horse.walk();
    }
}

  