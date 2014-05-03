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
    
    PeopleList searchName(String findName)
    {
        PeopleList output = new PeopleList();
        for (int i = 0; i < peoples.size(); i++)
        {
            if(peoples.get(i).getName().matches(findName))
                output.addPerson(peoples.get(i));
        }
        return output;
    }
    PeopleList searchNumber(String findNumber)
    {
        PeopleList output = new PeopleList();
        for (int i = 0; i < peoples.size(); i++)
        {
            if(peoples.get(i).getNumber().matches(findNumber))
                output.addPerson(peoples.get(i));
        }
        return output;
    }    
    
    PeopleList searchBoth(String findName, String findNumber)
    {
        PeopleList temp = new PeopleList();
        PeopleList output = new PeopleList();
        for (int i = 0; i < peoples.size(); i++)
        {
            if(peoples.get(i).getName().matches(findName))
                temp.addPerson(peoples.get(i));
        }
        for (int i = 0; i < temp.getSize(); i++)
        {
            if(temp.getPerson(i).getNumber().matches(findNumber))
                output.addPerson(peoples.get(i));
        }
        return output;
        
    }
    
}
