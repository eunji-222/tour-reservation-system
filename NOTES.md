# 개발 노트 (제출 README에 반영할 것)

⬜ STEP 0  환경 준비 (IntelliJ, GitHub)
⬜ STEP 1  설계
⬜ STEP 2  모델 — TourType(enum) + Booking
⬜ STEP 3  Repository — 필드(예약 목록, 번호 발급기) + save / findAll / findByNumber 메소드
⬜ STEP 4  View + Application (메뉴) — Scanner, while, switch, 예외처리
└ 🎉 여기서 처음으로 프로그램이 "실행" (1차 완성)
⬜ STEP 5  검색·필터 — 람다/Stream (필수 6번)
⬜ STEP 6  수정·삭제 + Controller 정리 → ★ 필수 요구사항 8개 전부 달성
⬜ STEP 7  (여유 시) 선택 기능 — Tour 모델 분리, 날짜 등 NOTES.md 후보들
⬜ 마무리  제출용 README.md 작성 → 제출


## 설계 고민 기록
- 투어명(tourName)을 String으로 할지, Tour 모델로 분리할지 고민
  → 상품 목록에서 고르게 하려면 Tour 모델 + CRUD가 통째로 필요 (선택 요구사항 "두 번째 모델")
  → 필수 완성이 우선이므로 String 유지, STEP 7 확장 후보 1순위로 결정

## STEP 7 확장 후보
1. Tour 모델 분리 (투어 상품 관리 + 예약과 연결)
2. 투어 시행일 (LocalDate) — STEP 1에서 미뤄둔 것

## List vs ArrayList 이유 알아보기

