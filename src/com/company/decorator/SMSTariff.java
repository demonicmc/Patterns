package com.company.decorator;

/**
 * Created by root on 04.05.17.
 */
public class SMSTariff extends TariffDecorator {

    public SMSTariff(CountTariffInterface tariff) {
        super(tariff);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 100 SMS");
        super.processTariff();

    }
}
