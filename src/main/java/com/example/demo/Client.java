package com.example.demo;

public class Client {
    private String rqUID;
    private String clientId;
    private String account;
    private String openDate;
    private String closeDate;
    private String currency;
    private int balance;
    private int maxLimit;

    public String getRqUID() {
        return rqUID;
    }

    public void setRqUID(String rqUID) {
        this.rqUID = rqUID;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(int maxLimit) {
        this.maxLimit = maxLimit;
    }
    public String getResp() {
        return "{" +
                "\"rqUID\": \""+this.rqUID+"\"," +
                "\"clientId\": \""+this.clientId+"\"," +
                "\"account\": \""+this.account+"\"," +
                "\"currency\": \""+this.currency+"\"," +
                "\"balance\": \""+this.balance+"\"," +
                "\"maxLimit\": \""+this.maxLimit+"\"" +
                "}";
    }
}
