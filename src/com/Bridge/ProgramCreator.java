package com.Bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
             new BankSystem(new JavaDeveloper()),       // or CppDeveloper()
                new StockExchange(new CppDeveloper())   // or JavaDeveloper()
        };

        for (Program program: programs){
            program.developProgram();
        }
    }
}
