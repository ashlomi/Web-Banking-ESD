package com.ca.cdd.dummy.lib;

public class InnerClassCallToClass extends Library {
    
   
    private CallPrintStr callPrintStr;
    private static String NAME = "InnerClassCallToClass";

    public InnerClassCallToClass(CallPrintStr callPrintStr) {
        this.callPrintStr = callPrintStr;
    }

    public InnerClassCallToClass() {
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void print(String s) {
        callPrintStr.innerClass(s);
    }

    public static class CallPrintStr extends Library{

        private static String NAME = "CallPrintStr";

        @Override
        public String getName() {
            return NAME;
        }


        public String innerClass (String s) {
             System.out.println(s);
             return s;
         }

    }
}



// 7.1

// AIbYx
// eo9hT
// eo9hT
// 2y7Fc
// x64Xt
// j687d
// j687d
// jCshV
// 7Oui8
// anUlm
// anUlm
// 8decA
// 8decA