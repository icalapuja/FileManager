package com.mdp.filemanager.test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("Inicio del test");
            
            Result result = JUnitCore.runClasses(TestSuite.class);
            int nTests = result.getRunCount();
            int nFail = result.getFailureCount();
            int nIgnore = result.getIgnoreCount();
            int nOK = (nTests - nFail - nIgnore);
            
            for(final Failure fail : result.getFailures()){
                System.out.println("Error: " + fail.toString());
            }
            
            System.out.println("N° tests:" + nTests+ " | OK:"+ nOK + " | Errores:" + nFail + " | Ignorados:" + nIgnore);
            System.out.println("Fin del test");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Exception->"+e.getMessage());
        }
    }
}
