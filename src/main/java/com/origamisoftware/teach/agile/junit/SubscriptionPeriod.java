package com.origamisoftware.teach.agile.junit;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Calendar;
import java.util.Date;

/**
 * A simple Date Range Class
 *
 * @author Spencer A Marks
 */
public class SubscriptionPeriod {

    private Date startDate;
    private Date endDate;

    /**
     * Creates a  SubscriptionPeriod instance
     *
     * @param startDate the starting date of the subscription period
     * @param endDate   the end date of the subscription period
     */
    public SubscriptionPeriod(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * @return the the start date of the subscription
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @return the the end date of the subscription
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @return the total Days in the subscription
     */
    public int getTotalDays() {
        // todo implement method
        long days = (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24);
        return (int) days;
    }

    /**
     * @return the total months on the subscription
     */
    public int getTotalMonths() {
        // todo implement method
        Calendar cal = Calendar.getInstance();
        cal.setTime(endDate);
        int stopYear = cal.get(Calendar.YEAR);
        int stopMonth = cal.get(Calendar.MONTH);
        cal.setTime(startDate);
        int startMonth = cal.get(Calendar.MONTH);
        int startYear = cal.get(Calendar.YEAR);
        return (stopYear - startYear) * 12 + (stopMonth - startMonth);
    }

    /**
     * Given a date return true if the date comes after the expiration date of this
     * subscription period or false otherwise.
     *
     * @param date a date to consider
     * @return true if true if the date comes after the expiration date of this
     * subscription period or false otherwise.
     */
    public boolean hasExpired(Date date) {
        // todo implement method
        if(date.after(endDate)) {
            return true;
        } else {
            return false;
        }
    }

}
