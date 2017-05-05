package com.company.state;

/**
 * Created by root on 05.05.17.
 */
public interface State {

    State nextState(Document document);
    State prevState (Document document);

}
