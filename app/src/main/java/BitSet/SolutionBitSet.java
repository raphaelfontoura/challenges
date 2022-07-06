package BitSet;

import java.util.BitSet;
import java.util.Scanner;

public class SolutionBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bits = scanner.nextInt();
        int operations = scanner.nextInt();
        BitSet[] bitSets = {new BitSet(bits), new BitSet(bits)};
        for (int i = 0; i < operations; i++) {
            String operator = scanner.next();
            int choiceBitSet = scanner.nextInt();
            int position = scanner.nextInt();
            operatorExecute(bitSets, operator, choiceBitSet, position);
            int count1 = bitSets[0].cardinality();
            int count2 = bitSets[1].cardinality();

            System.out.println(count1 + " " + count2);
        }
    }

    private static void operatorExecute(BitSet[] bitSets, String operator, int bitSetChoice, int position) {
        switch (operator) {
            case "SET" -> {
                bitSets[bitSetChoice - 1].set(position);
            }
            case "FLIP" -> {
                bitSets[bitSetChoice - 1].flip(position);
            }
            case "AND" -> {
                if (bitSetChoice == 1) {
                    bitSets[0].and(bitSets[1]);
                } else {
                    bitSets[1].and(bitSets[0]);
                }
            }
            case "OR" -> {
                if (bitSetChoice == 1) {
                    bitSets[0].or(bitSets[1]);
                } else {
                    bitSets[1].or(bitSets[0]);
                }
            }
            case "XOR" -> {
                if (bitSetChoice == 1) {
                    bitSets[0].xor(bitSets[1]);
                } else {
                    bitSets[1].xor(bitSets[0]);
                }
            }
        }

    }
}
