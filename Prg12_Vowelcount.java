package java_prgrms;
import java.util.Scanner;

public class Prg12_Vowelcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter the text:");
        String text = scanner.nextLine().toLowerCase();

        int vowels=0,consot=0;

        for (int i= 0; i< text.length(); i++){
            char ch=text.charAt(i);

            if (ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
                consot++;
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants:" +consot);
        scanner.close();


    }
    
}