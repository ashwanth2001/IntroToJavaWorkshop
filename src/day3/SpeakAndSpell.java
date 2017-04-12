package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		int a = 0;
		String words;
		words = "spell mandlebrot";
		speak(words);
		// 2. Catch the user's answer in a String
String answer;
answer = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Mandlebrot")){
	speak("correct");
	a++;
}
if(answer.equals("mandlebrot")){
	speak("correct");
	a++;
}
		// 4. Otherwise say "wrong"
if(a < 1){
speak("wrong");
}	
		// 5. repeat the process for other words
if(a>0);{
	a--;
}
words = "spell hi";
speak(words);
answer = JOptionPane.showInputDialog("");
if(answer.equals("Hi")){
	speak("correct");
	a++;
}
if(answer.equals("hi")){
	speak("correct");
	a++;
}
if(a < 1){
speak("wrong");
}	
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


