package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.Gson;

import utilities.Word;

public class Application {
	public static void main(String args[]) {
		getWords();
	}
	
	public static void getWords() {
		Gson gson = new Gson();
		
		try (Reader reader = new FileReader(System.getProperty("user.dir") +
				File.separator + "words.json")) {
			
			//Convert from JSon to Java Object
			Word[] words = gson.fromJson(reader, Word[].class);
			sortWords(words);
			for (Word word : words) {
				System.out.println(word.getWord());
			}
			
		} catch (FileNotFoundException e) {
			System.out.print("File not found. Closing...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.print("IOException");
			e.printStackTrace();
		}
	}
	
	private static Word[] sortWords(Word[] words) {
		Arrays.sort(words, (a,b) -> a.getWord().compareTo(b.getWord()));
		return words;
	}
}




