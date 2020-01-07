package com.csp.test5101;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2020/1/6 20:09
 */
public class Run1 {

    private static Timer timer = new Timer();

    public static class MyTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2020-01-06 20:37:00";
            Date date = sdf.parse(dateString);
            System.out.println("字符串时间：" + date.toLocaleString() + "当前时间：" + new Date().toLocaleString());
            timer.schedule(task, date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
