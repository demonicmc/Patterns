package com.company.decorator;

/**
 * Created by root on 04.05.17.
 */
public class InternetTariff extends TariffDecorator {

    public InternetTariff(CountTariffInterface tariff) {
        super(tariff);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 3.5 MB/s internet");
        super.processTariff();
    }
}
