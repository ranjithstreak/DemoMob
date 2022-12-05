import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testnglisner implements ITestListener
{
@Override
public void onTestStart(ITestResult result)
{
	System.out.println("Success on TestStart "+result.getName());
}
@Override
public void onTestSuccess(ITestResult result)
{
	System.out.println("Success of test cases and its details are: "+result.getName());
}
@Override
public void onTestFailure(ITestResult result)
{
	System.out.println("Failure of the testcases and its details are: "+result.getName());
}
@Override
public void onTestSkipped(ITestResult result) 
{
	System.out.println("Skip of the testcases and its details are: "+result.getName());
}
@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result)
{
	System.out.println("Failure of the testcases and its details are: "+result.getName());
}
@Override
public void onStart(ITestContext context)
{
	System.out.println("on Start");
}
@Override
public void onFinish(ITestContext context)
{
	System.out.println("on Finish");
}
}


