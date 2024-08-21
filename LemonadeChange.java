import java.util.HashMap;

public class LemonadeChange {
    public static boolean giveLemonadeChangeMySolution(int[] bills) {
        HashMap<Integer, Integer> moneyBag = new HashMap<Integer, Integer>();
        moneyBag.put(5, 0);
        moneyBag.put(10, 0);
        moneyBag.put(20, 0);

        for (int bill = 0; bill < bills.length; bill++) {
            int count = moneyBag.containsKey(bills[bill]) ? moneyBag.get(bills[bill]) : 0;
            System.out.println("Moneybag: " + moneyBag);

            if (bills[bill] == 5) {
                moneyBag.put(5, count + 1);
            } else if (bills[bill] == 10) {
                if (moneyBag.get(5) >= 1) {
                    // Decrement the change 5 by 1
                    int change5 = moneyBag.get(5);
                    moneyBag.put(5, change5 - 1);
                    // Increment the amount 10 by 1
                    moneyBag.put(10, count + 1);
                } else
                    return false;
            } else if (bills[bill] == 20) {
                // * Case: 1 -> if both 5 and 10 rupees available in the money bag
                if (moneyBag.get(5) >= 1 && moneyBag.get(10) >= 1) {
                    // Decrement the change 5 by 1
                    int change5 = moneyBag.get(5);
                    moneyBag.put(5, change5 - 1);
                    // Decrement the change 10 by 1
                    int change10 = moneyBag.get(10);
                    moneyBag.put(10, change10 - 1);
                    // Increment the amount 20 by 1
                    moneyBag.put(20, count + 1);
                } else if (moneyBag.get(5) >= 3) {
                    // * Case: 2 -> if 5 rupees only available in the money bag and also it needs to
                    // * be more or equal to 3

                    // Decrement the change 5 by 1
                    int change5 = moneyBag.get(5);
                    moneyBag.put(5, change5 - 3);
                    // Increment the amount 20 by 1
                    moneyBag.put(20, count + 1);
                } else
                    return false;
            }
        }

        return true;
    }

    public static boolean givenLemonadeChangeOptimizedSolution(int[] bills) {
        int five_dollars = 0, ten_dollars = 0;

        for (int x : bills) {
            if (x == 5) {
                five_dollars++;
            } else if (x == 10) {
                if (five_dollars > 0) {
                    five_dollars--;
                    ten_dollars++;
                } else {
                    return false;
                }
            } else {
                if (five_dollars > 0 && ten_dollars > 0) {
                    five_dollars--;
                    ten_dollars--;
                } else if (five_dollars > 2) {
                    five_dollars -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // * true case
        int[] bills1 = { 5, 5, 5, 10, 20 };
        // * false case
        int[] bills2 = { 5, 5, 10, 10, 20 };
        // * false case
        int[] bills3 = { 5, 5, 5, 10, 5, 5, 10, 20, 20, 20 };
        // * true case
        int[] bills4 = { 5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5 };

        System.out.println(giveLemonadeChangeMySolution(bills1));
        System.out.println(giveLemonadeChangeMySolution(bills2));
        System.out.println(giveLemonadeChangeMySolution(bills3));
        System.out.println(giveLemonadeChangeMySolution(bills4));
    }
}
