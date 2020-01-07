package com.csp.test5105;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2020/1/7 19:51
 */
public class Run1 {

    private static Timer timer = new Timer();
    private static int runCount = 0;

    public static class MyTask extends TimerTask {

        @Override
        public void run() {
            try {
                System.out.println("l begin 运行了！时间为：" + new Date());
                Thread.sleep(5000);
                System.out.println("l   end 运行了！时间为：" + new Date());
                runCount++;
                if (runCount == 5) {
                    timer.cancel();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask task = new MyTask();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = "2020-01-07 20:21:00";
        Date dateRef = sdf.parse(dateString);
        System.out.println("字符串时间：" + dateRef.toLocaleString() + "当前时间：" + new Date().toLocaleString());
        timer.scheduleAtFixedRate(task, dateRef, 2000);
    }
}
