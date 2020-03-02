package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class Word {
	String word;
	Definition[] definition;
	String[] synonyms;
	String[] antonyms;
	
	public String getWord() {
		return word;
	}
}

