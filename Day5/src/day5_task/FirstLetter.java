package day5_task;

public class FirstLetter {
	    static String convert(String str) 
	    { 
	        char ch[] = str.toCharArray(); 
	        for (int i = 0; i < str.length(); i++) { 
	            if (i == 0 && ch[i] != ' ' ||  
	                ch[i] != ' ' && ch[i - 1] == ' ') { 
	                if (ch[i] >= 'a' && ch[i] <= 'z') { 
	                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
	                } 
	            }           
	        } 
	        String st = new String(ch); 
	        return st; 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        String str = "how are you"; 
	        System.out.println(convert(str)); 
	    } 
	} 
	
            

