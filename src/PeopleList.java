package project;

import java.util.List;
import java.util.Vector;

public class PeopleList 
{
    public List<People> peoples;
    
    public PeopleList()
    {
        peoples = new Vector<People>();
    }
    
    void addPerson(People newPerson)
    {
        peoples.add(newPerson);
    }
    
    int getSize()
    {
        return peoples.size();
    }
    
    People getPerson(int i)
    {
        return peoples.get(i);
    }
    
}
