package testPackage;

import java.util.HashSet;

public class Test {
	
	public static HashSet<String> h = new HashSet<String>(); 
	  
    public static void permute(char s[], int i, int n) 
    { 
  
        // If the permutation is complete 
        if (i == n) { 
  
            // If set doesn't contain 
            // the permutation already 
            if (!(h.contains(String.copyValueOf(s)))) { 
  
                h.add(String.copyValueOf(s)); 
  
                // Print the generated permutation 
                System.out.println(s); 
            } 
        } 
  
        else { 
  
            // One by one swap the jth 
            // character with the ith 
            for (int j = i; j <= n; j++) { 
  
                // Swapping a[i] and a[j]; 
                char temp = s[i]; 
                s[i] = s[j]; 
                s[j] = temp; 
  
                // Revert the swapping 
                permute(s, i + 1, n); 
  
                temp = s[i]; 
                s[i] = s[j]; 
                s[j] = temp; 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        char s[] = { 'A', 'A', 'B' }; 
        permute(s, 0, s.length - 1); 
    } 

}
