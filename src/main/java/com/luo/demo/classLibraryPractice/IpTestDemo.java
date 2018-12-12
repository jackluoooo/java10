package com.luo.demo.classLibraryPractice;

/**
 * @author：罗金星 date 2018/11/26 11:12
 **/
public class IpTestDemo {


    public static void main(String[] args) {
        String str = "92.168.1.2";
        System.out.println(Validator_ip.validateIP(str));
    }
}

class Validator_ip {
    public static boolean validateIP(String ip) {
        if (ip.isEmpty()) {
            return false;
        } else {
            boolean isornot=true;
            String regex = "([12]?[0-9]?[0-9]?\\.){3}[12]?[0-9]?[0-9]?";
            if(ip.matches(regex)){
                String[] result=ip.split("\\.");
                for (int i=0;i<result.length;i++){
                    try {
                        if(Integer.parseInt(result[i])>256){
                           return false;
                         }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                return isornot;
            }else {
                return  false;
            }

        }

    }
}
