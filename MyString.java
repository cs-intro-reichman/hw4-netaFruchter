public class MyString {
    public static void main(String[] args) {
        //System.out.println("Testing lowercase:");
        //System.out.println("UnHappy : " + lowerCase("UnHappy"));
        //System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        //System.out.println("TLV : " + lowerCase("TLV"));
        //System.out.println("lowercase : " + lowerCase("lowercase"));
//
        //System.out.println("Testing contains:");
        //System.out.println(contains("unhappy", "happy")); // true
        //System.out.println(contains("happy", "unhappy")); // false
        //System.out.println(contains("historical", "story")); // false
        //System.out.println(contains("psychology", "psycho")); // true
        //System.out.println(contains("personality", "son")); // true
        //System.out.println(contains("personality", "dad")); // false
        //System.out.println(contains("resignation", "sign")); // true
        //System.out.println(contains("Our product will transform the market", "transform"));
        System.out.println(contains("We need to leverage our core competencies", "synergy"));
        
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowerStr = "";
        
        for (int i = 0; i < str.length(); i++) {
            //if the char IS A-Z, add the diff to a-z. else, just add the char.
            lowerStr += str.charAt(i) >= 65 && str.charAt(i) <= 90 ? (char)(str.charAt(i) + 32) : str.charAt(i);
        }
        return lowerStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1.length() < str2.length() || (str1.length() == str2.length() && !(str1 == str2))) {
            return false;
        }
        if (str1 == str2){
            return true;
        }

        int counter = 0;
        for (int i = 0; i < str1.length(); i ++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i+j) != str2.charAt(j)) { 
                    counter = 0;
                    break;
                } 
                else {
                    if (str2.length() > str1.substring(i).length()){
                        return false;
                    }
                    counter++;
                }
            }
            if (counter == str2.length()) {
                return true;
            }
        }   
        return false;
    }
}