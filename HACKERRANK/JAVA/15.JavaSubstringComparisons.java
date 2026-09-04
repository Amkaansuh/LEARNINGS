import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();

        ArrayList<String> strList = new ArrayList<String>();

        for ( int i = 0; i < s.length()-n+1; i++)
        {
            strList.add(s.substring(i, i+n));
        }
        Collections.sort(strList);
        System.out.println(strList.get(0));
        System.out.println(strList.get(strList.size()-1));
    }
}