package com.Ronak.Interfaces.Nested;

public class B implements A.nestedInterface {
    @Override
    public Boolean isEven(int num) {
        return ((num & 1) == 0);
    }
}
