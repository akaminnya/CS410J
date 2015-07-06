package edu.pdx.cs410J.minphan;

import edu.pdx.cs410J.AbstractPhoneBill;
import edu.pdx.cs410J.AbstractPhoneCall;

import java.util.Collection;

/**
 * Created by emenpy on 7/1/15.
 */
public class PhoneBill extends AbstractPhoneBill {

    private String customer;

    PhoneBill(String customer){
        this.customer = customer;
    }
    @Override
    public String getCustomer() {
        return customer;
    }

    @Override
    public void addPhoneCall(AbstractPhoneCall call) {

    }

    @Override
    public Collection getPhoneCalls() {
        return null;
    }
}
