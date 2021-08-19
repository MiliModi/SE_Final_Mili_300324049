package com.example.mili_300324049;

import java.sql.SQLException;
import java.util.ArrayList;

public interface LoanInterface {

    ArrayList<LoanModel> display() throws SQLException;
    void update(LoanModel studentData) throws SQLException, ClassNotFoundException;
    void delete(String sno) throws SQLException, ClassNotFoundException;
    LoanModel edit(LoanModel studentData, String sno) throws SQLException, ClassNotFoundException;

}