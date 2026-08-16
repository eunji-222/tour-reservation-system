package com.tourbooking.model;

public enum TourType {

    CITY ("시내관광"),      //기항지의 시내 명소 관광 코스
    HERITAGE ("유적지"),   //유네스코 문화유산 방문 코스
    NATURE ("자연경관"),   //유네스코 자연유산 방문 코스
    ACTIVITY ("체험");       //활동, 체험, 교류 코스


    private final String typeName;

    TourType (String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

}
