package prototypeDesignPattern;

import abstractDesignPattern.Employee;

import java.util.ArrayList;
import java.util.List;

// Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing.
// Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs.
// Prototype design pattern uses java cloning to copy the object.
// Suppose we have an Object that loads data from database.
// Now we need to modify this data in our program multiple times,
// so it’s not a good idea to create the Object using new keyword and load all the data again from database.
// The better approach would be to clone the existing object into a new object and then do the data manipulation.
// Prototype design pattern mandates that the Object which you are copying should provide the copying feature.
// It should not be done by any other class.
// However whether to use shallow or deep copy of the Object properties depends on the requirements and its a design decision.
// Here is a sample program showing Prototype design pattern example in java.
public class Employees implements Cloneable {
    private List<String> empList= new ArrayList<>();
    public Employees() {
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public void loadData(){
        //read all data form database and put into the list.
        empList.add("Suraj");
        empList.add("pankaj");
        empList.add("Sgolsahn");
        empList.add("andarda");
        empList.add("ananda");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s: this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emp = new Employees();
        emp.loadData();

        //using clone method to get the Employee object.
        Employees empnew = (Employees) emp.clone();
        Employees empnew1 = (Employees) emp.clone();
        List<String> list = empnew.getEmpList();
        list.add("mew addition");
        List<String> list2 = empnew1.getEmpList();
        list2.remove("ananda");

        System.out.println("original list:"+emp.getEmpList());
        System.out.println("first copied and altered list:"+ list);
        System.out.println("second copied and altered list"+ list2);
        System.out.println(emp.hashCode());
        System.out.println(empnew.hashCode());
        System.out.println(empnew1.hashCode());
    }
}
