package com.example.designpatterns.creational.abstractfactory;


import com.example.designpatterns.creational.abstractfactory.exception.ObjectCreationException;
import com.example.designpatterns.creational.abstractfactory.loan.*;

public class LoanFactory implements AbstractFactory<Loan, LoanType>{
    @Override
    public Loan create(LoanType type) {
        switch (type){
            case PERSONAL: return new PersonalLoan();
            case HOME: return new HomeLoan();
            case EDUCATIONAL: return new EducationalLoan();
            default: throw new ObjectCreationException(type.toString());
        }
    }
}