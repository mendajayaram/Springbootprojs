package nt.com.jai;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FirstScheduling {
//@Scheduled(fixedDelay =2000)
//@Scheduled(fixedRate =2000)
//@Scheduled(cron = "* 1 * * * *")
@Scheduled (cron = "59 59 23 31 12 ?")
	public void Show() {
		System.out.println("Happy New Year To 2021");
		System.out.println("FROM MESSAGE " + new Date());
	}
}
