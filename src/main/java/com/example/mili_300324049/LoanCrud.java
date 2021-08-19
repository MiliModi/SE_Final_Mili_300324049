package com.example.mili_300324049;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoanCrud implements LoanInterface {

    public Connection con3;

    public Connection getCon3() {

        return con3;
    }

    public void setCon3(Connection con3) {

        this.con3 = con3;
    }

    public LoanCrud(Connection con3) {
        this.con3 = con3;
    }

    @Override
    public ArrayList<LoanModel> display() throws SQLException {

        String query = "SELECT * FROM loantable";

        PreparedStatement preparedStatement = con3.prepareStatement(query);

        LoanModel loanData;

        ResultSet rs = preparedStatement.executeQuery();

        ArrayList<LoanModel> loanList = new ArrayList<>();

        while (rs.next()) {
            loanData = new LoanModel(rs.getString("clientno"), rs.getString("clientname"), (int) rs.getDouble("loanamount"), (int) rs.getDouble("years"),rs.getString("loantype"));
            loanList.add(loanData);
        }

        return loanList;
    }

    @Override
    public void update(LoanModel loanData) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO loantable VALUES ( ?, ?, ? ,?,?)";

        PreparedStatement preparedStatement = con3.prepareStatement(query);

        preparedStatement.setString(1, loanData.getClient_no());
        preparedStatement.setString(2, loanData.getClient_name());
        preparedStatement.setString(3, String.valueOf(loanData.getLoan_amt()));
        preparedStatement.setString(4, String.valueOf(loanData.getYears()));
        preparedStatement.setString(5, loanData.getLoan_type());


        preparedStatement.executeUpdate();
    }

    @Override
    public void delete(String cno) throws SQLException {
        String query = "DELETE FROM loantable WHERE clientno=?";

        PreparedStatement preparedStatement = con3.prepareStatement(query);

        preparedStatement.setString(1, cno);
        preparedStatement.executeUpdate();
    }

    @Override
    public LoanModel edit(LoanModel loandata, String cno) throws SQLException, ClassNotFoundException {
        return null;
    }
}