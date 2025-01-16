class randomtest{
    public static void main(String[] args) {
        boolean fullBags = false;
        boolean fullBagOne = false;
        boolean fullBagTwo = false;
        boolean fullBagThree = false;
        int fundaNino = 0;
        // System.out.println(fundaNino);
        canCandies(fundaNino);
        fundaNino = fundaNino + canCandies(fundaNino);
        System.out.println(fundaNino);
    }

    static int canCandies(int fundaNino){
        
            int calculateCandy = (int) (Math.random() * (3 - 1+ 1) + 1);
        //    System.out.println(calculateCandy);
            return calculateCandy;
        }

    }
//}