package graph.employee_importance_690;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
  
  int retVal;
  
  
  public int getImportance(List<Employee> employees, int id) {
    
    ArrayList[] list = new ArrayList[employees.size()];
    
    for(int i=0; i<employees.size(); i++) {
      list[i] = new ArrayList<>();
    }
    
    Queue<Employee> queue = new LinkedList<Employee>();
    
    for(Employee emp : employees) 
      if(emp.id==id)
        getRetVal(employees, queue, 0);
    
    return retVal;
  }
  
  
  public void getRetVal(List<Employee> employees, Queue<Employee> queue, int sum) {
    
    while(!queue.isEmpty()) {
      Employee curr = queue.poll();
      
      sum = sum + curr.importance;
      
//      for(Employee emp : curr.subordinates) {
//        
//      }
    }
    
  }
  
  public static void main(String[] args) {
    Employee emp1 = new Employee(1,5, Arrays.asList(2,3));
    Employee emp2 = new Employee(2,3, Arrays.asList(4,5));
    Employee emp3 = new Employee(3,3, Arrays.asList(6,7));
    Employee emp4 = new Employee(4,1, Arrays.asList());
    Employee emp5 = new Employee(5,2, Arrays.asList());
    Employee emp6 = new Employee(6,3, Arrays.asList());
    Employee emp7 = new Employee(7,4, Arrays.asList());
    
    List<Employee> employees = new ArrayList<Employee>();
    employees.addAll(Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7));
    
    int retVal = new Solution().getImportance(employees, 1);
    System.out.println(retVal);
  }
}
