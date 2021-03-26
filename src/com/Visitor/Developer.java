package com.Visitor;

import com.Command.Database;

public interface Developer {
    public void create(ProjectClass projectClass);

    public void create(Datebase database);

    public void create(Test test);
}
