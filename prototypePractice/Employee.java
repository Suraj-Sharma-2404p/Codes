package prototypePractice;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
    private List<String> empList = new ArrayList<>();

    public Employee(List<String> empList) {
        this.empList = empList;
    }

    public Employee() {
    }

    //to load data from database
    public void loadData(){
        empList.add("Suraj");
        empList.add("ramees");
        empList.add("ganjadahar");
        empList.add("Gajodhar");
        empList.add("sdfn");
        empList.add("Saksfa");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<>();
        for (String s :
                this.empList) {
            tempList.add(s);
        }
        return new Employee(tempList);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee empOriginal = new Employee();
        empOriginal.loadData();
        List<String> originalList = empOriginal.empList;
        System.out.println("This is our original List:"+ originalList);
        Employee emp_Cloned = (Employee) empOriginal.clone();
        List<String> empCLonedList = emp_Cloned.empList;
        empCLonedList.remove("ramees");
        System.out.println("First cloning :"+empCLonedList);

        Employee emp_cloned2 = (Employee) empOriginal.clone();
        List<String> empClonedList2 = emp_cloned2.empList;
        empClonedList2.add("VIN_Maaal");
        System.out.println("Second cloning :"+empClonedList2);
    }
}
