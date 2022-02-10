package inheritance;

import java.util.StringTokenizer;

public class StringBuilderDemo {

	public static void main(String[] args) {
		int count = 0;
		long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Mohammad");  
        for (int i=0; i<10000; i++){  
            sb.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Mohammad");  
        for (int i=0; i<10000; i++){  
            sb2.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
        
        String quotes = "Honest is the best policy, and we could do better to make right and talk well.";
        StringTokenizer tokenizer = new StringTokenizer(quotes);
        
        while (tokenizer.hasMoreTokens()) {
        	String temp = tokenizer.nextToken();
        	if (temp.equals("and")) {
        		count++;
        	}
        }
        
        System.out.println("Count of \"and\" in the string :" + count);
	}

}
