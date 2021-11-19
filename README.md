# springboot 게시판 제작예정
<br>
개발환경

> front-end:

- bootstrap, thymeleaf

>back-end:
- springboot, lombok, openjdk 1.8, jpa hibernate, mariadb, maven


------------

2021-11-19 작업

사용자 권한에 따라 UI 다르게 구성하기

사용자 권한에 따라 API 제한 테스트

@Secured로 접근 권한 설정

2021-11-18 작업

fetchtype eager/lazy 테스트, N+1 문제 테스트

2021-11-17 작업

@OneToMany, @ManyToOne annotation 이용해서 양방향 매핑 설정

2021-11-16 작업

사용자 테이블 만들고 Spring Security를 적용하여 인증 및 권한 처리

로그인, 회원가입, 로그아웃, 페이지 권한 처리

2021-11-15 작업

jpa를 이용해서 db 데이터 조작할 수 있는 컨트롤러 생성

postman으로 http request로 crud 동작 확인

페이지 처리와 검색 기능 구현

2021-11-14 작업

form 유효값 체크할 수 있는 Validator 작성

jpa를 이용해서 db에 데이터 추가,수정


2021-11-12 작업

Spring Boot에서 MariaDB 데이터소스 설정

Model, Repository 클래스 생성 및 어노테이션 설정

게시판 데이터 조회 후 화면에 출력


2021-11-11 작업

git 연동

Bootstrap을 이용하여 반응형 웹 페이지 구성

Fragment를 이용하여 공통화면 레이아웃 구성

