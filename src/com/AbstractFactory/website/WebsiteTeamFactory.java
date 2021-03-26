package com.AbstractFactory.website;

import com.AbstractFactory.Developer;
import com.AbstractFactory.ProjectManager;
import com.AbstractFactory.ProjectTeamFactory;
import com.AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
