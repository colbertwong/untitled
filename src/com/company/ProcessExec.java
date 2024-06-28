package com.company;

public class ProcessExec
{
    public static void main(String[] args) {
        Process process = null;
        String cmd = "calc.exe";
        try {
            process = Runtime.getRuntime().exec(new String[]{cmd});
            process.waitFor();
            int ret = process.exitValue();
            System.out.println("Process completed successfully:" + ret);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert process != null;
        process.destroy();
    }
}
