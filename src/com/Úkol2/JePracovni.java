package com.Úkol2;

public enum JePracovni {
    PRACOVNI("pracovní"),
    SOUKROMY("soukromý");
    private String typ;

    JePracovni(String typ) {
        this.typ = typ;
    }
    public String getTyp(){
        return typ;
    }
}
