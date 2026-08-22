package com.tourbooking.model;

public enum TourType {
// emun, 투어종류 "객관식 보기"

    CITY ("시내관광"),      //기항지의 시내 명소 관광 코스
    HERITAGE ("유적지"),   //유네스코 문화유산 방문 코스
    NATURE ("자연경관"),   //유네스코 자연유산 방문 코스
    ACTIVITY ("체험");       //활동, 체험, 교류 코스

    // 한글 이름표 필드
    private final String typeName;

    // 생성자: 이름표 연결
    TourType (String typeName) {
        this.typeName = typeName;
    }

    // getter: 이름표 꺼내기
    public String getTypeName() {
        return typeName;
    }

}
