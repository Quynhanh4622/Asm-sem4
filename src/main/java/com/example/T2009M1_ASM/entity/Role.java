package com.example.T2009M1_ASM.entity;

public enum Role {
    USER(0),
    ADMIN(1),
    SUPER_ADMIN(2);
    private final int value;
    Role(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static Role getAccountStatus(int value){
        for(Role role : Role.values()){
            if(role.getValue() == value){
                return role;
            }
        }
        return USER;
    }
}
