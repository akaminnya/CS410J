package edu.pdx.cs410J.minphan;

import edu.pdx.cs410J.AbstractPhoneCall;

/**
 * Created by emenpy on 7/1/15.
 */
public class PhoneCall extends AbstractPhoneCall {
    private String callerNumber;
    private String calleeNumber;
    private String startTime;
    private String endTime;

    /**
     *
     * @param callerNumber
     * @param calleeNumber
     * @param startTime
     * @param endTime
     */
    PhoneCall(String callerNumber, String calleeNumber, String startTime, String endTime){

        super();
        this.callerNumber = callerNumber;
        this.calleeNumber = calleeNumber;
        this.startTime = startTime;
        this.endTime = endTime;

    }

    /**
     * Returns the caller number
     *
     */
    @Override
    public String getCaller() {

        return callerNumber;
    }

    /**
     * Returns callee Number
     * @return
     */
    @Override
    public String getCallee() {
        return calleeNumber;
    }

    @Override
    public String getStartTimeString() {

        return startTime;
    }

    @Override
    public String getEndTimeString() {

        return endTime;
    }
}
