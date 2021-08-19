package com.example.mili_300324049;

public class LoanModel{

    private String client_no;
    private String client_name;
    private double loan_amt;
    private int years;
    private String loan_type;

    public String getClient_no() {
        return client_no;
    }

    public void setClient_no(String client_no) {
        this.client_no = client_no;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public double getLoan_amt() {
        return loan_amt;
    }

    public void setLoan_amt(double loan_amt) {
        this.loan_amt = loan_amt;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getLoan_type() {
        return loan_type;
    }

    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }

    public LoanModel(String client_no, String client_name, double loan_amt, int years, String loan_type) {
        this.client_no = client_no;
        this.client_name = client_name;
        this.loan_amt = loan_amt;
        this.years = years;
        this.loan_type = loan_type;
    }
}
