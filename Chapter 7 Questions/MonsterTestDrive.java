package monstertestdrive;

/**
 *
 * @author SamyB
 */

/*

Which of the A-B pairs of methods listed on the right, if
inserted into the classes on the left, would compile and
produce the output shown? (The A method inserted into
class Monster, the B method inserted into class Vampire.)

Solution:

1 (A) - boolean frighten(int d) {
        System.out.println("arrrgh");
        return true;
        }

  (B) - boolean frighten(int x) {
        System.out.println("a bite?);
        return false;
        }

OUTPUT:

a bite?
breath fire
arrrgh

 */
public class MonsterTestDrive {

    public static void main(String[] args) {
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire(); // first item Vampire object
        ma[1] = new Dragon(); // second item is Dragon object
        ma[2] = new Monster(); // third item is Monster object
        // we go through the array and call the frighten method on each object
        for (int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }
}

class Monster {
    // A

    boolean frighten(int d) {
        System.out.println("arrrgh");
        return true;
    }
}

class Vampire extends Monster {
    // B

    boolean frighten(int x) {
        System.out.println("a bite?");
        return false;
    }
}

class Dragon extends Monster {

    boolean frighten(int degree) {
        System.out.println("breath fire");

        return true;

    }
}
