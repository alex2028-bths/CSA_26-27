public class CoinFlip {
    public CoinFlip() {}

    public String flip() {
       String result = "tails";
       int roll = (int) (Math.random() * 2);
       if (roll == 1) {
           result = "heads";
       }
       return result;
    }

    public double simulate(int numFlips) {
        double count = 0.0;
        double isHeads = 0.0;
        for(int i = 0; i < numFlips; i++) {
            if(flip().equals("heads")) {
                isHeads++;
            }
            count++;
        }
        return isHeads/count;
    }
}
