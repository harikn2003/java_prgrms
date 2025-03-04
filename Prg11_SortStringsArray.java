package java_prgrms;

import java.util.Arrays;
import java.util.Scanner;

public class Prg11_SortStringsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        String[] words = new String[n];
        
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
        
        Arrays.sort(words);
        
        System.out.println("Sorted array:");
        for (String word : words) {
            System.out.println(word);
        }
        
        scanner.close();
    }
}
