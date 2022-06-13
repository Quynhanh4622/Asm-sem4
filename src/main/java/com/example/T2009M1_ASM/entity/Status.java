package com.example.T2009M1_ASM.entity;

public enum Status {
    ACTIVE(1),
    DEACTIVE(0),
    DELETED(-1),
    UNDEFINED(-2);
    private final int value;
    Status(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static Status getAccountStatus(int value){
        for(Status accountStatus : Status.values()){
            if(accountStatus.getValue() == value){
                return accountStatus;
            }
        }
        return UNDEFINED;
    }
}
