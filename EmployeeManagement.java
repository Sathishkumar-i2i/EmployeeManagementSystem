import java.text.ParseException;

import com.ideas2it.employee.view.EmployeeView;

/**
 * This class is used for employeemanagemant stored in HashMap 
 * It as create, delete, update and display methods
 * @version 27/2/21
 * @author  Sathishkumar M
 */
public class EmployeeManagement {
    public static void main(String[] args) throws ParseException {
        EmployeeView employeeView = new EmployeeView();
        employeeView.userSelection();
    }
}