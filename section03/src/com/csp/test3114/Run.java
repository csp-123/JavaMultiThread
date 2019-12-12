package com.csp.test3114;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2019/12/4 20:06
 */
public class Run {

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();

        for (int i = 0; i < 10; i++) {
            BackupA output = new BackupA(dbTools);
            output.start();
            BackupB input = new BackupB(dbTools);
            input.start();
        }
    }
}
