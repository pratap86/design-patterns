package com.pratap.dp.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		DateUtil instance1 = DateUtil.getInstance();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/835698/development/design-patterns/dateUtil.ser")));
		oos.writeObject(instance1);
		
		DateUtil instance2 = null;
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/Users/835698/development/design-patterns/dateUtil.ser")));
		instance2 = (DateUtil) ois.readObject();
		
		oos.close();
		ois.close();
		
		System.out.println(instance1 == instance2);
	}

}
