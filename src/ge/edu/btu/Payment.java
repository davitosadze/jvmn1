package ge.edu.btu;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Payment {
    public static Logger logger = LogManager.getLogger(Payment.class);
    public static void main(String[] args) {
        Electricity electricity=new Electricity("Electricity",5);
        Water water=new Water("Water",32.1);
        pay(electricity);
        pay(water);

    }

    static <T> void pay(T e) {
        System.out.println(e);
        logger.info(e);
    }
}
