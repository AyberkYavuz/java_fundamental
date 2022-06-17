package sourcepackage;

import java.util.Map;
import java.util.HashMap;

public class HashMapHandler {
    private Map<Integer, Employee> employeeMap;

    public HashMapHandler() {
        this.employeeMap = new HashMap<>();
    }

    public void addItem(int id, Employee employee){
        this.employeeMap.put(id, employee);
    }

    public void showItems(){
        for (Map.Entry<Integer, Employee> entry : this.employeeMap.entrySet()){
            Integer id = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println("id: " + id.toString() + " -> " + employee.toString());
        }
    }
}
