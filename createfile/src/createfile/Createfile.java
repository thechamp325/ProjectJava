package createfile;

import java.io.*;


public class Createfile {

	public static void main(String[] args) {
		boolean a = new File("test").mkdir();
		System.out.print(a);

	}

}
