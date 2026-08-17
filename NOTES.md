# 개발 노트 (제출 README에 반영할 것)

## 설계 고민 기록
- 투어명(tourName)을 String으로 할지, Tour 모델로 분리할지 고민
  → 상품 목록에서 고르게 하려면 Tour 모델 + CRUD가 통째로 필요 (선택 요구사항 "두 번째 모델")
  → 필수 완성이 우선이므로 String 유지, STEP 7 확장 후보 1순위로 결정

## STEP 7 확장 후보
1. Tour 모델 분리 (투어 상품 관리 + 예약과 연결)
2. 투어 시행일 (LocalDate) — STEP 1에서 미뤄둔 것

## List vs ArrayList 이유 알아보기

