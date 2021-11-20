# springboot 간단한 게시판 기능 제작예정
<br>
개발환경

> front-end:

- bootstrap, thymeleaf

>back-end:
- springboot, lombok, openjdk 1.8, jpa hibernate, mariadb, maven

--------------

토이프로젝트를 진행하면서 배운 점:

spring boot로 maven 등 초기 설정할 것들을 쉽게 설정하고 프로젝트를 진행할 수 있다는 것을 이해함.

Spring Security를 적용하여 로그인 시 보안처리나 권한부여 등을 쉽게 할 수 있는 것을 알았고, 

jpa로 orm(객체와 관계형 DB의 매핑) 하는 구조같은 걸 더 잘 이해할 수 있었다.

--------------
## project screenshots

메인 페이지
![bandicam 2021-11-20 13-49-05-173](https://user-images.githubusercontent.com/55654216/142715028-bdb43ec9-a0e1-4fa5-bbf4-41fa611d3d0c.jpg)

게시판에 접근하기 위해서는 로그인이 필요함.

![bandicam 2021-11-20 13-49-08-058](https://user-images.githubusercontent.com/55654216/142715030-e7a392c7-4491-416b-aa86-d2601fdc235d.jpg)

회원가입 페이지에서는 간단하게 아이디와 비밀번호로 회원가입

![bandicam 2021-11-20 13-49-18-495](https://user-images.githubusercontent.com/55654216/142715032-d9cc6d8e-83b0-42bd-bda2-55e0920f9a8f.jpg)

게시판에는 기본적인 페이지 처리를 보여주기 위해서 한 페이지에 보여 줄 요소를 2건씩만 보이게 하였음

![bandicam 2021-11-20 13-49-52-730](https://user-images.githubusercontent.com/55654216/142715033-339ec412-067b-4a28-81ce-5a0a4f09da4e.jpg)

![bandicam 2021-11-20 13-50-11-298](https://user-images.githubusercontent.com/55654216/142715034-0ab1110b-7263-42cf-bdcf-b1d96e15a77f.jpg)

ROLE_ADMIN 권한이 있는 사용자는 게시글을 삭제할 수 있고 삭제버튼도 노출됨

![bandicam 2021-11-20 13-50-21-128](https://user-images.githubusercontent.com/55654216/142715035-f342d1f2-51b2-4f95-8430-6fc27c400e6a.jpg)

ROLE_ADMIN 권한이 없는 일반 사용자는 api상으로도 게시글 삭제가 불가능하고 삭제버튼이 노출되지 않음 

![bandicam 2021-11-20 13-50-32-020](https://user-images.githubusercontent.com/55654216/142715036-d7e11d7c-5f60-4c59-aed8-96e612ef359b.jpg)

제목이나 내용이 일치하는 게시물을 검색할 수 있음.

![bandicam 2021-11-20 13-51-13-901](https://user-images.githubusercontent.com/55654216/142715037-5750984f-20a0-488e-920e-552e8ded478a.jpg)

![bandicam 2021-11-20 13-51-18-252](https://user-images.githubusercontent.com/55654216/142715038-8c89b388-0cb5-43c5-b519-3bc3790e92b9.jpg)

![bandicam 2021-11-20 13-51-26-384](https://user-images.githubusercontent.com/55654216/142715039-68949b97-4b1d-4a2f-a7e7-721004c5609a.jpg)

## DB 구조 

board는 user 테이블에서 user_id를 fk로 받고 게시글 번호 제목 내용 등의 정보를 저장

![bandicam 2021-11-20 13-56-14-357](https://user-images.githubusercontent.com/55654216/142715040-6d554f33-9c25-4724-9a7d-243ddfcdd1ee.jpg)

user에서는 사용자닉네임을 uk로 지정하고 비밀번호와 활성화 여부 등을 저장

![bandicam 2021-11-20 13-56-20-504](https://user-images.githubusercontent.com/55654216/142715041-fa534555-9646-4395-9514-6d31273a6bf4.jpg)

role에서는 사용자의 권한을 저장

![bandicam 2021-11-20 13-56-23-576](https://user-images.githubusercontent.com/55654216/142715042-2db80f36-092f-4824-81b2-4d7bbfc991f8.jpg)

user_role은 user와 role 테이블의 id를 참조해서 연결함 

![bandicam 2021-11-20 13-56-26-598](https://user-images.githubusercontent.com/55654216/142715044-05961670-463b-4ee1-bb45-51618e993a54.jpg)


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

