package stringCoding;

import java.util.Random;

public class RandomStringGenerate {

	private static final String CHAR_LIST = 
	        "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	 private static final int RANDOM_STRING_LENGTH = 10;
	 
	public static String givenUsingJava8_whenGeneratingRandomAlphanumericString_thenCorrect(int n) {
	    int leftLimit = 48; // numeral '0'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = n;
	    Random random = new Random();
	 
	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	 
	    System.out.println(generatedString);
		return generatedString;
	}
	 public static String generateRandomString(){
         
	        StringBuffer randStr = new StringBuffer();
	        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
	            int number = getRandomNumber();
	            char ch = CHAR_LIST.charAt(number);
	            randStr.append(ch);
	        }
	        return randStr.toString();
	    }
	 private static int getRandomNumber() {
	        int randomInt = 0;
	        Random randomGenerator = new Random();
	        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
	        if (randomInt - 1 == -1) {
	            return randomInt;
	        } else {
	            return randomInt - 1;
	        }
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		givenUsingJava8_whenGeneratingRandomAlphanumericString_thenCorrect(5);
		System.out.println(" 2nd methods ");
		
		System.out.println();
		for(int a = 1 ; a<20;a++)
		{
		System.out.println(generateRandomString());
		}
	}

}
