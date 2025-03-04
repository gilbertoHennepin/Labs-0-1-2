package week2;

import java.util.Arrays;

import static input.InputUtils.intInput;

public class ClassNames {
    public static void main(String[] args) {

      String[] classNames = { "Java", "MySQL", "Oracle", "SQLServer" };

      for (int c=0; c < classNames.length; c++) {
          System.out.println(classNames[c]);
      }


      //  String[] className = {"Java Programming", "Intro to Python"};

        //System.out.println(Arrays.toString(className));

        //int newName = intInput("Add another class");


        //System.out.println(newName);
    }
}
