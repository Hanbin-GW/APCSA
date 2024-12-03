package Unit4.Albert;

public class HiddenMessage {
    private String message;
    public HiddenMessage(String message) {
        this.message = message;
    }

    private String decryptMessage() {
        String output = "";
        String phrase = message;
        while(phrase.length()>0)
        {
            String word = findNextWord(phrase);
            output += findChar(word);
            if(phrase.length() <= word.length())
                phrase = "";
            else
                phrase = phrase.substring(word.length()+1);
        }
        return output;
    }

    public String findNextWord(String phrase)
    {
        int spaceIdx = phrase.indexOf(" ");
        if (spaceIdx == -1)
            return phrase;
        return phrase.substring(0,spaceIdx);
    }

    private String findChar(String word)
    {
        if(word.substring(0,1).compareTo(word.substring(1,2)) > 0)
        //if(word.substring(0,1) > word.substring(1,2) > 0)
            return word.substring(0,1);
        return word.substring(1,2);
    }

    public static void main(String[] args) {
        HiddenMessage hiddenMessage = new HiddenMessage("ahha early bloated global colt");
        System.out.println(hiddenMessage.decryptMessage());
    }
}
