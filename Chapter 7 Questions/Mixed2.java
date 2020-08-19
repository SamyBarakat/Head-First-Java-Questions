package mixed2;

/**
 *
 * @author SamyB
 */

/*

A short Java program is listed below. One block of
the program is missing! Your challenge is to match
the candidate block of code (on the left), with the
output that you’d see if the block were inserted.
Not all the lines of output will be used, and some of
the lines of output might be used more than once.
Draw lines connecting the candidate blocks of
code with their matching command-line output.

Code Candidates: 

b.m1();
c.m2();
a.m3();

c.m1();
c.m2();
c.m3();

a.m1();
b.m2();
c.m3();

a2.m1();
a2.m2();
a2.m3();

Output:

Aʼs m1, Aʼs m2, Cʼs m3, 6
Bʼs m1, Aʼs m2, Aʼs m3,
Aʼs m1, Bʼs m2, Aʼs m3,
Bʼs m1, Aʼs m2, Cʼs m3, 13
Bʼs m1, Cʼs m2, Aʼs m3,
Bʼs m1, Aʼs m2, Cʼs m3, 6
Aʼs m1, Aʼs m2, Cʼs m3, 13

Solution: 

b.m1();
c.m2(); --> B's m1, A's m2, A's m3
a.m3();

c.m1();
c.m2(); --> B's m1, A's m2, C's m3, 13
c.m3();

a.m1();
b.m2(); --> A's m1, A's m2, C's m3, 13
c.m3();

a2.m1();
a2.m2();
a2.m3();

 */
class A {

    int ivar = 7;

    void m1() {
        System.out.print("A's m1, ");
    }

    void m2() {
        System.out.print("A's m2, ");
    }

    void m3() {
        System.out.print("A's m3, ");
    }

}

class B extends A {

    void m1() {

        // overriding m1 method from A
        System.out.print("B's m1, "); // overriding m1 method
    }
}

class C extends B {

    void m3() {

        // overriding m3 method from A
        System.out.print("C's m3, " + (ivar + 6));
    }
}

public class Mixed2 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        // polymorphism: new C object created, using A superclass reference
        // I think C object can access all things now since its reference,
        // which is in A, has everything and connected to everything
        A a2 = new C();
        a2.m1();
        a2.m2();
        a2.m3();
        /*
        OUTPUT:
        
        A's m1, A's m2, C's m3, 13
        
        
        
         */
    }

}
