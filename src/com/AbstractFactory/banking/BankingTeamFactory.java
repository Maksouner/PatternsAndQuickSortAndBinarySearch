package com.AbstractFactory.banking;

import com.AbstractFactory.Developer;
import com.AbstractFactory.ProjectManager;
import com.AbstractFactory.ProjectTeamFactory;
import com.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
