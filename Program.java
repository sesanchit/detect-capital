class Solution {
    public boolean detectCapitalUse(String word) {
        boolean isCapitalUseValid = true;
        int wordLength = word.length();
        if(wordLength==1){
            return isCapitalUseValid;
        }
        else if(wordLength > 1){
            boolean firstChar = Character.isUpperCase(word.charAt(0));
            boolean checkForUpperOccurence = false;
            boolean checkForLowerOccurence = false;
            for(int i=1;i<wordLength;i++){
                if(firstChar==false && Character.isUpperCase(word.charAt(i))){
                    isCapitalUseValid=false;
                    break;
                }
                else if(firstChar==true){
                    if(checkForUpperOccurence==true){
                        if(Character.isUpperCase(word.charAt(i))){
                        isCapitalUseValid=false;
                        break;
                        }
                    }
                    if(checkForLowerOccurence==true){
                        if(Character.isLowerCase(word.charAt(i))){
                        isCapitalUseValid=false;
                        break;
                        }
                    }
                    if(Character.isLowerCase(word.charAt(i))){
                        checkForUpperOccurence = true;
                    }
                    if(Character.isUpperCase(word.charAt(i))){
                        checkForLowerOccurence = true;
                    }
                }
            }
        }
        return isCapitalUseValid;
    }
}
