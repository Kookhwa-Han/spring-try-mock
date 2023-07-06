# spring-try-mock

팀원 스프링 실습과제용 mock 프로젝트입니다.

아래 안내를 확인하고 요구사항을 만족하도록 코드를 작성하여 제출해주시기 바랍니다.

다운로드:

```bash
git clone git@github.com:Kookhwa-Han/spring-try-mock.git
```

### 실습과제의 목표

1. 스프링프로젝트를 스스로 구성할 수 있다.
2. 환경에 따른 properties 파일을 구성할 수 있다.
3. annotation을 이용하여 Bean을 등록할 수 있다.
4. CRUD API를 작성할 수 있다.
5. lombok을 사용할 수 있다.

### mock 프로젝트 구현사항

1. default properties 파일이 작성되어 있습니다.
2. controller와 service의 클래스 골격이 작성되어있습니다.
3. inMemory DB가 연결된 Repository가 작성되어 있습니다.
4. 필요한 entity 클래스가 POJO로 작성되어 있습니다.

### 요구사항

1. prod 환경에서 30001번 포트를 사용하도록 properties 파일을 구성하세요.
2. Entity 클래스를 bean으로 등록하고, lombok을 이용하여 접근자를 생성하세요.
3. controller와 service 클래스의 DI 방법을 @Autowired를 이용한 주입에서 final 제한자와 lombok을 이용하는 방식으로 변경하세요.
4. 팀원정보를 조회하는 API를 만드세요.
5. 팀원정보를 수정하는 API를 만드세요.
6. 팀원정보를 삭제하는 API를 만드세요.
7. 팀원정보를 생성하는 API를 만드세요.
8. 위 API들의 response는 ResponseEntity를 이용하여 반환하세요.

작성 후 코드 zip 파일 또는 git 주소를 실습과제 포스트에 댓글로 달아주시기 바랍니다.
