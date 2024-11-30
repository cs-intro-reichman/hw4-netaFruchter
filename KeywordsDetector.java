
public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0;i < sentences.length; i++) {
            for (int j = 0;j < keywords.length; j++) {
                //System.out.println(sentences[i]);
                //System.out.println(keywords[j]);
                if (contains(lowerCase(sentences[i]),(lowerCase(keywords[j])))) {
                    System.out.println(sentences[i]);
                    break;
                }
            }
        }
    }

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
