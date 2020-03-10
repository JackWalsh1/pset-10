package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

import com.google.gson.Gson;

import utilities.Word;

public class Application {
	private void app(String[] args) {
		getWords();
	}
	
	public Word[] getWords() {
		Gson gson = new Gson();
		
		try (Reader reader = new FileReader(System.getProperty("user.dir") +
				File.separator + "words.json")) {
			
			//Convert from JSon to Java Object
			Word[] words = gson.fromJson(reader, Word[].class);
			sortWords(words);
			return words;
		} catch (FileNotFoundException e) {
			System.out.print("File not found. Closing...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.print("IOException");
			e.printStackTrace();
		}
		return null;
	}
	
	private static Word[] sortWords(Word[] words) {
		Arrays.sort(words, (a,b) -> a.getWord().compareTo(b.getWord()));
		return words;
	}
	
	public static void addWordsToList() {
		System.out.print("Go away Emily");
	}
	
	public static void saveWords(Word[] words) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(System.getProperty("user.dir") + File.separator + "words.json")) {
            gson.toJson(words, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}




