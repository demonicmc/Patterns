package com.company.decorator;

/**
 * Created by root on 04.05.17.
 */
public class TariffDecorator implements CountTariffInterface {

    private CountTariffInterface tariff;

    @Override
   public void processTariff() {
        tariff.processTariff();
    }

    public TariffDecorator(CountTariffInterface tariff) {
        this.tariff = tariff;
    }
}
