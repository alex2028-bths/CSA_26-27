public class SelectionMadness {

    public SelectionMadness() {
    }

    public String fortune() {
        String fortune = "";
        int a = (int) (Math.random() * 5);
        if (a == 0) {
            fortune = "We will remember this day always and forever!";
        } else if (a == 1) {
            fortune = "There is magic in your smile!";
        } else if (a == 2) {
            fortune = "Love is the only true adventure!";
        } else if (a == 3) {
            fortune = "Good luck will follow you wherever you go!";
        } else if (a == 4) {
            fortune = "You are sitting on top of the world!";
        }
        return fortune;
    }

    public int largest(int num1, int num2, int num3) {
        int largest = num1;
        if(num2>largest) {
            largest = num2;
        }
        if(num3>largest) {
            largest = num3;
        }
        return largest;
    }
}