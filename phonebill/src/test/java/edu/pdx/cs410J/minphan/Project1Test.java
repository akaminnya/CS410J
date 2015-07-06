package edu.pdx.cs410J.minphan;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;
import edu.pdx.cs410J.InvokeMainTestCase;
import static junit.framework.Assert.assertEquals;

/**
 * Tests the functionality in the {@link Project1} main class.
 */
public class Project1Test extends InvokeMainTestCase {

    /**
     * Invokes the main method of {@link Project1} with the given arguments.
     */
    private MainMethodResult invokeMain(String... args) {
        return invokeMain( Project1.class, args );
    }

  /**
   * Tests that invoking the main method with no arguments issues an error
   */
    @Test
    public void testPhoneCall(){
        String callerNumber = "000-000-0000";
        String calleeNumber = "000-111-0000";
        String startTime = "7/5/2015 12:55";
        String endTime = "7/5/2015 4:00";
        PhoneCall aCall = new PhoneCall(callerNumber,calleeNumber,startTime,endTime);
        assertThat(aCall.getCaller(), is("000-000-0000"));
        assertThat(aCall.getCallee(),is("000-111-0000"));
        assertThat(aCall.getStartTimeString(),is("7/5/2015 12:55"));
        assertThat(aCall.getEndTimeString(),is("7/5/2015 4:00"));
        System.out.println(aCall.toString());





    }





  @Test
  public void testNoCommandLineArguments() {
    MainMethodResult result = invokeMain();
    assertEquals(new Integer(1), result.getExitCode());
    assertTrue(result.getErr().contains( "Missing command line arguments" ));
  }

}