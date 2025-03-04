package week1;

import org.w3c.dom.ls.LSOutput;

import static input.InputUtils.yesNoInput;

public class CanYouTakeMicrocomputerMaintenance {

    public static void main(String[] args) {

        System.out.println("This program will check if you meet the pre-requisites for taking ITEC 1310 Microcomputer Systems Maintenance");
        System.out.println(" Please answer the follow three questions:");

        boolean hasTakenITConcepts = yesNoInput("Have you taken ITECC 1100 Info Tech Concepts");
        boolean hasTakenITSkills = yesNoInput("Have you taken ITEC 110 Info Tech Skills");
        boolean hasTakenWindows = yesNoInput("Have you taken ITEC 1250 Windows Operating Systems");

        if (hasTakenITConcepts && hasTakenITSkills && hasTakenWindows) {
            System.out.println("You meet the pre-requisites. You may take ITEC 1310 Microcomputer Systems Maintenance");
        } else {
            System.out.println("You do not meet the pre-requisites.");

//            49 cents for rectasngular or flat
//            21cents square circular and other shapes and non flat cant be proceesed


    }


    }
}
