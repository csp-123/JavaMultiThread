package com.csp.test64;

import java.io.*;

/**
 * @author csp
 * @email chengsipeng@ebaolife.com
 * @date 2020/3/9
 */
public class SaveAndRead {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MyObject myObject = MyObject.getInstance();
        FileOutputStream fos = new FileOutputStream(new File("myObjectFile.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(myObject);
        fos.close();
        oos.close();
        System.out.println(myObject.hashCode());

        FileInputStream fis = new FileInputStream(new File("myObjectFile.txt"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        MyObject myObject1 = (MyObject) ois.readObject();
        fis.close();
        ois.close();
        System.out.println(myObject1.hashCode());
    }
}
