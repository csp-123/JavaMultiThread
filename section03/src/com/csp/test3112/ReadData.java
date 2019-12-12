package com.csp.test3112;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2019/12/3 20:21
 */
public class ReadData {

    public void readMethod(PipedInputStream in) {
        try {
            System.out.println("read : ");
            byte[] byteArray = new byte[20];
            int readLength = in.read(byteArray);
            System.out.println("readLength:" + readLength);
            while (readLength != -1) {
                String newDate = new String(byteArray, 0, readLength);
                System.out.println(newDate);
                readLength = in.read(byteArray);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
