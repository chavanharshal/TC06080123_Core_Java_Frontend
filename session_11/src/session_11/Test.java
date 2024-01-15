package session_11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		FileOutputStream fos =new FileOutputStream("D://abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s =new Student(1,"Harsh",1000.89f);
		
		oos.writeObject(s);
		System.out.print("Success");
		oos.close();
		fos.close(); 
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D://abc.txt"));
		Student s1 =(Student)ois.readObject();
		System.out.println(s1);
		
	}
}
