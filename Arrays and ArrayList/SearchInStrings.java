package ArrayAndArrayList.Codes;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        char target;
        String name = "Subhajit";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to be searched:");
         target = sc.next().charAt(0);  // input a character
        System.out.println(seach(name,target));
//        System.out.println(Arrays.toString(name.toCharArray())); {(.toCharArray())This method changes the Strings to character Array}
    }
    static boolean seach( String name, char target){
        name = name.toLowerCase();
        if(name.length()==0)
            return false;
        for( char ch = 'a';ch<='z'; ch++){
            if(ch == target)
                return true;
        }

        //OR {Using for each loop}
//        for (char ch:name.toCharArray()) {
//            if(ch== target)
//                return true;
//        }

        return false;
    }
}
