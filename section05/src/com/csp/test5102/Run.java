package com.csp.test5102;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2020/1/6 20:48
 */
public class Run {

    public static class MyTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }

        public static void main(String[] args) throws ParseException {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2020-01-06 20:52:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef.toLocaleString() + "当前时间：" + new Date().toLocaleString());
            timer.schedule(task, dateRef, 4000);
        }
    }
}
