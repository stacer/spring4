package com.wisely.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime(){
		System.out.println("每隔五秒执行一次:"+dataFormat.format(new Date()));
	}
	
	/**
	 * 每天14点53分执行,cron是linux系统下的定时任务
	 */
	@Scheduled(cron="0 53 14 ? * *")
	public void fixTimeExecution(){
		System.out.println("在指定时间"+dataFormat.format(new Date())+"执行");
	}
}
