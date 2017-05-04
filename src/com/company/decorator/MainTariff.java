package com.company.decorator;

/**
 * Created by root on 04.05.17.
 */
public class MainTariff implements CountTariffInterface {

    @Override
    public void processTariff() {
        System.out.println("This is MTS tariff");
    }
}
