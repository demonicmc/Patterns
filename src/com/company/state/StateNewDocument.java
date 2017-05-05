package com.company.state;

/**
 * Created by root on 05.05.17.
 */
public class StateNewDocument implements State {



    @Override
    public State nextState(Document document) {
        if (document.getState() instanceof StateDispatch)

            document.setState();
    }

    @Override
    public State prevState(Document document) {

    }
}
