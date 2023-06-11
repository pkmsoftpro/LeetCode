package graph.employee_importance_690;

import java.util.List;

public class Employee {
  public int id;
  public int importance;
  public List<Integer> subordinates;
  
  public Employee (int id, int imp, List<Integer> subordinates) {
    this.id = id;
    this.importance = imp;
    this.subordinates = subordinates;
  }
}
