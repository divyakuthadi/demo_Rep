package retrylogic2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class analyser implements IRetryAnalyzer{
	int counter=0;
	int limit=4;
	
	public boolean retry(ITestResult result) {
		if(counter<limit) {
		counter++;
	
		return true;
}
return false;
	
}
}