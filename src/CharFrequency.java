        // TODO: Read the string S (Use sc.nextLine() to capture spaces)
        // TODO: Read the character C
        // TODO: Iterate through the string and count occurrences of C
        // TODO: Print the count
import java.util.Scanner;
public class CharFrequency {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                char ch = sc.next().charAt(0);
                int count = 0;
                for(int i=0; i<s.length(); i++){
                        if(s.charAt(i) == ch){
                                count++;
                        }
                }
                System.out.println(count);
        }

}
