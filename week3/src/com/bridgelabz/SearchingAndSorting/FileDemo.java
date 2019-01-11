package com.bridgelabz.SearchingAndSorting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("ex.txt");
		FileOutputStream fos=new FileOutputStream(f,true);//true for appending
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("yuyutyu");
		System.out.println("Successful");
		
	/*	FileInputStream fis=new FileInputStream(f);
		DataInputStream dis=new DataInputStream(fis);
		String str=dis.readUTF();
		System.out.println(str);*/
	}

}
