/*
 * Write a complete HiddenWord class, including any necessary instance variables, its constructor, and the method getHint, described above.
 * You may assume that the length of the guess is the same as the length of the hidden word.
 * Initialize a Git repository (locally and remotely), write your code, and push it up to GitHub.
 * Submit the URL to your repository as your answer to this question.
*/

public class HiddenWord {
   private String word;
   public HiddenWord(String word) {
       this.word = word;
   }
   public String getHint(String guess) {
       String hint = "";
       String words = word;
       for (int i = 0; i <= guess.length() - 1; i++) {
           if (guess.charAt(i) == words.charAt(i)) {
               hint += String.valueOf(guess.charAt(i));
           } else if (words.contains(String.valueOf(guess.charAt(i)))) {
               hint += "+";
           } else {
               hint += "*";
           }
       }
       return hint;
   }
}
