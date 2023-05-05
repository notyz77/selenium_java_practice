package javaPackage;

public class randumWWords {
	
	public static void main(String[] args) {
//        for (int i = 0; i < 1; i++) {
            String randomWord = createRandomWord(8,8);
            System.out.println(randomWord);
//        }
    }

    public static String createRandomWord(int len,int len1) {
        String name = "";
        String name1 = "";
        for (int i = 0; i < len; i++) {
            int v = 1 + (int) (Math.random() * 26);
            char c = (char) (v + (i == 0 ? 'A' : 'a') - 1);
            name += c;
        }
        
        for (int i = 0; i < len; i++) {
            int v = 1 + (int) (Math.random() * 26);
            char c = (char) (v + (i == 0 ? 'A' : 'a') - 1);
            name1 += c;
        }
        
        return name + " " + name1;
    }
	
}
