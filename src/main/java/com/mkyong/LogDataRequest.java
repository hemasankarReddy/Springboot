package com.mkyong;

public class LogDataRequest {
    private String searchType;
    private Integer interval;
    private String intervalType;
    private String  fromDay;
    private String fromMonth;
    private String fromYear;
    private String  toDay;
    private String toMonth;
    private String toYear;
//SELECT * FROM sms.sms_organisation_info WHERE created_date BETWEEN DATE_SUB( CURDATE( ) ,INTERVAL 1 HOUR ) AND CURDATE( )
    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public String getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    public String getFromDay() {
        return fromDay;
    }

    public void setFromDay(String fromDay) {
        this.fromDay = fromDay;
    }

    public String getFromMonth() {
        return fromMonth;
    }

    public void setFromMonth(String fromMonth) {
        this.fromMonth = fromMonth;
    }

    public String getFromYear() {
        return fromYear;
    }

    public void setFromYear(String fromYear) {
        this.fromYear = fromYear;
    }

    public String getToDay() {
        return toDay;
    }

    public void setToDay(String toDay) {
        this.toDay = toDay;
    }

    public String getToMonth() {
        return toMonth;
    }

    public void setToMonth(String toMonth) {
        this.toMonth = toMonth;
    }

    public String getToYear() {
        return toYear;
    }

    public void setToYear(String toYear) {
        this.toYear = toYear;
    }


}
