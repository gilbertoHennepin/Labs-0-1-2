package week1;

import static input.InputUtils.stringInput;

public class DepartmentCode {
    public static void main(String[] args) {
        
        String departmentCode = stringInput("Enter department code");
        
//        check for valid code, ITEC, BTEC, ENGL, MATH...
        
        if (departmentCode.length() == 4) {
            System.out.println("This code is valid");
            departmentCode = departmentCode.toUpperCase();
            System.out.println("The code is " + departmentCode);
        } else {
            System.out.println("This code is not valid");
        }
    }
}
