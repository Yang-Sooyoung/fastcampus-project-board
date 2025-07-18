### 📆 FastCampus Project Board

> 이 프로젝트는 FastCampus의 게시판 구현 강의를 따라가며 **직접 구현한 학습형 클론 프로젝트**입니다.  
> 실무에 가까운 게시판 시스템을 Spring Boot와 JPA, QueryDSL을 강의 내용을 기반으로\
> 기능을 하나하나 구현하고 테스트하며 백엔드 실력을 향상시키는 데 목적이 있습니다.


<br/>

### 주요 기능

- 게시글 CRUD
- 댓글 등록/조회/삭제
- 게시글 검색 (제목, 본문, 작성자, 해시태그)
- Spring Security를 활용한 인증/인가
- 작성자 기반의 수정/삭제 권한 제어
- RESTful API 설계 및 문서화
- 테스트 코드 (단위, 통합 테스트)
- JPA Auditing

<br/>

### 기술 스택

| 구분 | 기술 |
|------|------|
| Language | Java 17 |
| Framework | Spring Boot 3.x |
| ORM | Spring Data JPA, QueryDSL |
| Database | H2 (개발용) |
| Build Tool | Gradle |
| Test | JUnit 5, Mockito |
| 인증/보안 | Spring Security |
| 문서화 | Spring REST Docs |
| IDE | IntelliJ IDEA |

<br/>

### 프로젝트 구조

```

src
└── main
└── java/com/fastcampus/projectboard
├── config
├── controller
├── domain
├── dto
├── repository
├── service
└── util

```

<br/>

### Usecase Diagram
<img width="1060" height="921" alt="123" src="https://github.com/user-attachments/assets/8116d2d1-04be-44a3-99c8-8219946d043e" />
<br/>

### API Endpoint
<img width="954" height="467" alt="345" src="https://github.com/user-attachments/assets/03cf4106-1542-4fb7-8069-12d8693f2f8e" />

### 실행 방법

#### 1. 프로젝트 클론

```bash
git clone https://github.com/Yang-Sooyoung/fastcampus-project-board.git
cd fastcampus-project-board
````

#### 2. 실행 방법

```bash
./gradlew clean build
./gradlew bootRun
```

#### 3. 테스트 실행

```bash
./gradlew test
```

#### 4. API 문서 확인

Spring REST Docs를 통해 `/build/generated-snippets` 경로에 API 문서 생성됨.

<br/>

### 학습 포인트

* JPA 기반 CRUD와 연관관계 매핑
* QueryDSL로 복합 조건 검색 구현
* Spring Security로 인증/인가 처리
* RESTful한 API 설계 원칙 적용
* REST Docs 기반 API 문서 자동화
* 테스트 코드 작성 습관 및 구조 설계
* Github Project 활용, Commit messages 작성

</br>

#### 🙋‍♀️ 만든 사람

- 👩‍💻 이름: 양수영 (Yang Sooyoung)
- 🔗 GitHub: [@Yang-Sooyoung](https://github.com/Yang-Sooyoung)

<br/>

