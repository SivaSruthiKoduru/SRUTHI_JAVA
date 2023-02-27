package day4;

import java.io.FileReader;

public class day4Pr1 {
	public static void main(String[] args){
		FileReader fileReader = new FileReader("no.txt");
		System.out.println(fileReader.read());
		fileReader.close();
	}
	
}
