/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Mar-20
 *  Time: 12:50 PM
 */
package secb.emaplyoee;

public class Employee implements Comparable<Employee> {
    private String empName;
    private int empId;

    @Override
    public int compareTo(Employee o) {
        return this.empId - o.empId;
    }
}
