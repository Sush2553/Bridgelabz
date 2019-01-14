package com.bridgelabz.testing;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

import com.utility.week3.Utility;

public class TestPoemLyrics {

	@Test
	public void poemLYricsTest() throws IOException 
	{String expected = "";
		Scanner file=new Scanner(new File("/home/admin1/poem.txt"));
		while(file.hasNext())
		{
			expected=expected+"\n"+file.nextLine();
		}
		
		file.close();
		String actual="\n"+Utility.printLyrics();
		
		assertEquals(expected, actual);
	}

}
