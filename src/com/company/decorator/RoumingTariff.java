package com.company.decorator;

/**
 * Created by root on 04.05.17.
 */
public class RoumingTariff extends TariffDecorator {

    public RoumingTariff(CountTariffInterface tariff) {
        super(tariff);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 10 days in rouming");
        super.processTariff();
    }
}
