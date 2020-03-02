package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class Word {
	String word;
	Definition[] definitions;
	String[] synonyms;
	String[] antonyms;
	
	public String getWord() {
		return word;
	}
	
	public Definition[] getDefinitions() {
		return definitions;
	}
	
	public String[] getSynonyms() {
		return synonyms;
	}
	
	public String[] getAntonyms() {
		return antonyms;
	}
}

