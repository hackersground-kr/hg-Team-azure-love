# `애저사랑해` - `나누리`

해커그라운드 해커톤에 참여하는 `애저사랑해` 팀의 `애저사랑해`입니다.

## 참고 문서

> 아래 두 링크는 해커톤에서 앱을 개발하면서 참고할 만한 문서들입니다. 이 문서들에서 언급한 서비스 이외에도 더 많은 서비스들이 PaaS, SaaS, 서버리스 형태로 제공되니 참고하세요.

- [순한맛](./REFERENCES_BASIC.md)
- [매운맛](./REFERENCES_ADVANCED.md)

## 제품/서비스 소개

<!-- 아래 링크는 지우지 마세요 -->
[제품/서비스 소개 보기](TOPIC.md)
<!-- 위 링크는 지우지 마세요 -->

## 오픈 소스 라이센스

<!-- 아래 링크는 지우지 마세요 -->
[오픈소스 라이센스 보기](./LICENSE)
<!-- 위 링크는 지우지 마세요 -->

## 설치 방법

> **아래 제공하는 설치 방법을 통해 심사위원단이 여러분의 제품/서비스를 실제 Microsoft 애저 클라우드에 배포하고 설치할 수 있어야 합니다. 만약 아래 설치 방법대로 따라해서 배포 및 설치가 되지 않을 경우 본선에 진출할 수 없습니다.**

### 사전 준비 사항

> **여러분의 제품/서비스를 Microsoft 애저 클라우드에 배포하기 위해 사전에 필요한 준비 사항들을 적어주세요.**

안녕하세요! 이 가이드는 여러분이 GitHub에 있는 프로젝트를 배포하는 방법을 설명합니다. 컴퓨터에 운영체제와 브라우저만 설치되어 있다고 가정하고 시작할게요.

### 깃허브 준비사항 (Mac, Window 동일)

1. https://github.com/ 에 접속합니다. 
    
<img width="1822" alt="1" src="https://github.com/user-attachments/assets/72400730-4834-4262-a5d9-6fb5c76b2db9">
    
2. 계정이 없는 분은 회원가입을, 계정이 있는분은 로그인을 진행합니다.
    
<img width="1822" alt="2" src="https://github.com/user-attachments/assets/c67ecc8e-f9a9-4f04-a1f7-264dfd6fd471">
    
<img width="1822" alt="3" src="https://github.com/user-attachments/assets/5a6aca7c-3997-42a2-b88f-87fd7320e4bf">    

3. GitHub에서 
https://github.com/hackersground-kr/hg-Team-azure-love
로 접속, 프로젝트를 내 계정으로 fork해옵니다.

<img width="1822" alt="4" src="https://github.com/user-attachments/assets/4d9583e1-b55a-4976-a99e-977c8cdc6e74">

4. 오른쪽 하단의 초록색 버튼을 눌러서 포크를 해옵니다.

<img width="1822" alt="5" src="https://github.com/user-attachments/assets/965555db-35a4-4f0c-9ae3-9e76b3fcb9e1">

5. 이렇게 포크가 완료된 모습이 보인다면 이 과정은 완성입니다.

<img width="1822" alt="6" src="https://github.com/user-attachments/assets/77e0a275-830b-479b-9178-d10b4faa7302">

### Server 준비사항 (Mac, Window 순)

1. Mac
    1. Mac 기본 내장 터미널을 연 후 아래 명령어를 입력하여 brew를 설치합니다, 이미 설치가 되어 있을 경우 해당 단계는 생략해도 됩니다.
        
        ```bash
        /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
        ```
        
    2. brew 설치 확인 명령어로 설치가 되었는지 확인할 수 있습니다.
        
        ```bash
        brew --version
        ```
        
    3. brew 설치 후, 터미널에 다음 명령어를 입력하여 JAVA 설치 여부를 확인해 줍니다.
        
        ```bash
        java -version
        ```
        
        - 다음과 같은 화면이 나올 경우 이미 설치가 되어 있는 것이니 생략해도 좋습니다. (중간에 버전을 나타내는 숫자는 상관 없으나 17 미만일 경우 설치를 진행해야 합니다)
            
            ```bash
            openjdk version "22.0.2" 2024-07-16
            ```
            
    4. 설치되어 있지 않을 경우 아래 사이트로 접속해 줍니다.
        
        https://www.oracle.com/kr/java/technologies/downloads/#java8-mac
        
        접속 후에 JDK 17 선택 → macOS 선택합니다.
        
        <img width="1470" alt="스크린샷 2024-08-26 오후 7 19 11" src="https://github.com/user-attachments/assets/ea41f70c-9632-4f3f-81a2-adf77dce633e">
        
        명단에 있는 4개의 다운로드 링크 중 ARM64 DMG Installer을 다운로드 받습니다.
        
        다운받은 DMG 파일을 연 후 안에 있는 pkg 파일을 실행합니다.
        
        <img width="980" alt="스크린샷 2024-08-26 오후 7 24 04" src="https://github.com/user-attachments/assets/27004ffd-06f0-4ef5-b610-b7502a1e6b30">
        
        <img width="696" alt="스크린샷 2024-08-26 오후 7 24 14" src="https://github.com/user-attachments/assets/77f9a171-e20b-4082-b148-3fd120e2663e">

        
        오른쪽 하단의 계속 버튼을 눌러서 다운로드를 해줍니다.
        
        <img width="664" alt="스크린샷 2024-08-26 오후 7 24 19" src="https://github.com/user-attachments/assets/8a91a346-7381-4617-87c0-fc44a707a5de">
        
        <img width="675" alt="스크린샷 2024-08-26 오후 7 24 22" src="https://github.com/user-attachments/assets/87e76bf1-cc3f-4de8-9529-c24177b437d9">
        
        오른쪽 하단의 설치 버튼을 눌러서 설치를 시작합니다.
        
        <img width="699" alt="스크린샷 2024-08-26 오후 7 24 38" src="https://github.com/user-attachments/assets/fe1ecb63-df96-442d-9ef8-0dd664c4849a">
        
        설치가 완료되면 닫기 버튼을 누릅니다.
       
       
   6.  MacOS - Bicep 설정
       5-1. 터미널을 킨다. command + 스페이스바)
        
        <img width="712" alt="Screenshot 2024-08-27 at 03 06 31" src="https://github.com/user-attachments/assets/02f11e35-c64b-4f85-be07-50cb980ab02c">
        
5-2. 아래 명령어들을 한줄씩 적는다
    
   ```bash
        brew update
        brew install gh
        brew install azure-cli
        brew tap azure/azd && brew install azd
   ```
    
        
2. Window
    1. 아래 링크로 접속합니다.
    https://www.oracle.com/java/technologies/downloads/#jdk17-windows
    2. x64 MSI Installer라고 적혀있는 링크를 선택하여서 다운 받습니다. <p>
        !! 만약 이미 설치되어 있으나 그 버전이 17 미만일 경우 아래에 서술되어 있는 java 환경 변수 설정에서 기존에 있던 환경 변수를 삭제(초기화) 후에 진행해야 합니다 !!
        
        <img width="1470" alt="스크린샷 2024-08-26 오후 7 52 09" src="https://github.com/user-attachments/assets/97180706-5826-4cdc-adc2-626841984c46">
        
    3. 다운 받은 파일을 실행 후 모든 스탭을 계속(혹은 next)을 클릭하여 설치를 완료합니다.
       설정 -> 시스템 정보 -> [고급 시스템 설정]을 클릭합니다.
       
        ![다운로드](https://github.com/user-attachments/assets/4c2fb7db-bbc5-433a-af68-7b1904d1ed15)<p>
  
       시스템 속성 [환경 변수]을 클릭 후 [환경 변수] 대화 상자가 나타나면 [시스템 변수]에서 [새로 만들기] 버튼을 클릭합니다.<p>
       
        ![다운로드 (2)](https://github.com/user-attachments/assets/051308b7-29e1-4580-a043-347c89886c81)<p>
        ![다운로드 (1)](https://github.com/user-attachments/assets/34beed7a-621b-4c32-9e99-9aa2af273bf3)<p>
        [새 시스템 변수] 대화상자가 나타나면 [변수 이름]에 JAVA_HOME을 입력하고, [변수 값]에 JDK 17 설치 경로를 입력합니다. 두 항목을 입력 후 [확인] 버튼을 클릭하여 적용합니다. <p>
        ![다운로드 (3)](https://github.com/user-attachments/assets/51baf36a-6638-44e8-8436-0233d763794b)<p>
        [환경 변수] 대화상자의 [시스템 변수(S)]에서 Path 변수 항목을 선택하고 [편집]을 클릭합니다. <p>
        ![다운로드 (4)](https://github.com/user-attachments/assets/a3791f6d-e268-4835-a558-95f26a2c9f8c) <p>
        [환경 변수 편집] 대화상자가 나타나면 [새로 만들기] 버튼을 클릭하고 항목이 추가되면 %JAVA_HOME%\bin 입력합니다. <p>
        ```
        %JAVA_HOME%/bin
        ```
        ![다운로드 (5)](https://github.com/user-attachments/assets/02094038-3b86-4ac9-8268-0641bf9a84bc) <p>
        등록한 % JAVA_HOME%\n을 선택하고 [위로 이동] 버튼을 클릭해서 첫 번째 항목으로 올려줍니다.  그 후 모든 대화 상자의 [확인] 버튼을 클릭하여 환경 변수 설정을 마칩니다.  <p>
        ![다운로드 (6)](https://github.com/user-attachments/assets/ce6a8307-8795-4bc8-a9e4-7780c0757ca9) <p>
        
    4. 윈도우 키를 눌러 명령 프롬포트(혹은 CMD)를 검색하여 터미널을 실행 후 아래 명령어를 입력하여 JAVA의 설치 여부를 확인합니다.
        
        ```powershell
        java -version
        ```
        
        java 버전이 표시될 경우 성공적으로 설치된 것입니다(1-C 참고).

2-1. Bicep 설정

1. https://github.com/git-for-windows/git/releases/download/v2.46.0.windows.1/Git-2.46.0-64-bit.exe
2. https://github.com/cli/cli/releases/download/v2.55.0/gh_2.55.0_windows_amd64.msi
3. https://azcliprod.blob.core.windows.net/msi/azure-cli-2.63.0-x64.msi

위 링크들을 모두 들어가 Git, gh, az를 설치합니다, 그 후에는 다음 스크린샷을 따라 주세요. 원본 노션 링크를 첨부하니 필요할 경우 참고해 주시기를 바랍니다!
노션 링크 : https://halved-freesia-af1.notion.site/b6498c0c41d54ce081b402a1186aaa3c?pvs=4 <p>
<img width="391" alt="스크린샷 2024-08-27 오전 2 46 04" src="https://github.com/user-attachments/assets/933cb002-eb9e-4003-8a00-c68d0322dcee"> <p>
<img width="266" alt="스크린샷 2024-08-27 오전 2 46 18" src="https://github.com/user-attachments/assets/dee50ffc-915a-49a9-8b6c-233546beefe1"> <p>
<img width="246" alt="스크린샷 2024-08-27 오전 2 46 45" src="https://github.com/user-attachments/assets/1dabba36-fbbb-4cb7-98e0-b44e613330dc"> <p>
<img width="258" alt="스크린샷 2024-08-27 오전 2 47 12" src="https://github.com/user-attachments/assets/278fbd4c-5ebb-43c0-9549-f9c78cc8942c"> <p>
<img width="374" alt="스크린샷 2024-08-27 오전 2 47 31" src="https://github.com/user-attachments/assets/f714cef1-0cc6-4bb9-8966-7f782598ba8a"> <p>
<img width="359" alt="스크린샷 2024-08-27 오전 2 47 54" src="https://github.com/user-attachments/assets/b5a49382-9856-48b0-a35c-b369262ab953"> <p>
<img width="342" alt="스크린샷 2024-08-27 오전 2 48 16" src="https://github.com/user-attachments/assets/994e563b-e9dd-46a0-90b8-b45da5f62844"> <p>
<img width="454" alt="스크린샷 2024-08-27 오전 2 48 40" src="https://github.com/user-attachments/assets/720bed8e-e243-410d-88e5-1bb3837def52"> <p>
플랫폼 공통 - 계정 로그인 <p>
<img width="454" alt="스크린샷 2024-08-27 오전 2 49 01" src="https://github.com/user-attachments/assets/eb90ae4f-a9cf-45bb-9ed7-9bc8b0c013e6"> <p>
<img width="446" alt="스크린샷 2024-08-27 오전 2 49 30" src="https://github.com/user-attachments/assets/bba42c3d-59dd-40b5-b97b-a3e3b7e2b549"> <p> 
<img width="356" alt="스크린샷 2024-08-27 오전 2 50 01" src="https://github.com/user-attachments/assets/c34058e0-7504-4167-b75f-1e49e4ece181"> <p>
<img width="451" alt="스크린샷 2024-08-27 오전 2 50 26" src="https://github.com/user-attachments/assets/c2a97f6e-b427-4419-ba34-13ddc9cfef03"> <p>
아래 명령어를 입력 해 줍니다. 
```Shell
# OS 공통
git clone (아까 복사한 URL을 붙여넣기)
```
![00](https://github.com/user-attachments/assets/c3ada8bd-0ce1-4047-b18f-99ef7c745f27)
```Shell
cd hg-Team-azure-love
```
다음 명령어를 os에 맞게 쳐줍니다

```powershell
# 맥OS
REPOSITORY_ROOT=$(git rev-parse --show-toplevel)
cd $REPOSITORY_ROOT/backend
sudo chmod 755 ./gradlew # 비밀번호 입력
./gradlew bootJar

# 윈도우
$REPOSITORY_ROOT = git rev-parse --show-toplevel
cd $REPOSITORY_ROOT/backend
.\gradlew.bat bootJar
```
아래와 같은 화면이 나와야 합니다.
![0](https://github.com/user-attachments/assets/12db3aa6-647f-4803-a410-129c5dd204ca)
아래 명령어를 입력 하여 Bicep 자동으로 리소스를 생성합니다.

```powershell
azd init -e '애저 리소스 그룹 이름'
azd config set alpha.resourceGroupDeployments on
azd up
```

구독 플랜을 선택합니다.
![11](https://github.com/user-attachments/assets/192cb196-db26-4965-8834-88cf503421aa)
애저 위치로 Korea Central을 선택합니다.
![22](https://github.com/user-attachments/assets/4f6b0749-6c95-4f1e-a87c-04f9dd09d40f)
아래의 정보를 활용해 입력을 요구하는 모든 정보를 채우세요. 아래 조건에 해당하도록 자유롭게 작성해주세요.
![1](https://github.com/user-attachments/assets/e8d325f1-2702-4479-aa39-d1a5400ecffb)
```
# jwt secret은 그대로 복사 후 붙여넣기 해서 사용하시면 됩니다!
jwtSecret: 6lHthvX15Va3/Cqh/ftNgek6ewRIKZoDS2VZw2NBXh+2cp7q5BrrsJlfA2EKDR6UGvELeAv1cg7mQNVDFi0sqzkCmVL4PJrTGKlDvbGFmzJzKBjoVSPD2H9t+QkSw4+mCfFehTFnnmiP1ulLfp1xOyA6bUjmQogCUgjAbjHJZSF5OZ2VoyUtQn8+f0fJvYLpI8NrZrWHBEVKXbXgSaNZ0Pve8JHaiW1iB+kSZw==
dbName, dbUser: 영문 대소문자로만 이루어진 16자 이내의 짦은 글자 (특수문자 및 '-' 및 '_' 사용 불가)
dbPassword: 강력한 데이터베이스 비밀번호
name: 배포를 원하는 이름 (작성자의 경우 nanuri-api)
```
본인의 애저 리소스 그룹을 선택합니다. (작성자의 경우, rg-Team-azure-love)
![2](https://github.com/user-attachments/assets/eaaa4782-eb3d-4dcf-8402-2bf751edb333)
완료 될 때까지 기다립니다. (대략 5~15분 소요)
![3](https://github.com/user-attachments/assets/4493ee01-c614-4596-98b8-7f2fac07c735)
애저 리소스가 전부 만들어 졌습니다.
![4](https://github.com/user-attachments/assets/89bd90bd-57d9-48a5-a96b-286453bc0d4e)
마지막으로, 다음 명령어를 입력 해 서버를 배포합니다.
```Shell
az webapp deploy --resource-group '애저 리소스 그룹' --name '아까 위에서 입력한 배포를 원하는 이름 (name)'-backend --src-path ./build/libs/nanuri-server-0.0.1.jar --type jar
# 작성자의 경우
# az webapp deploy --resource-group rg-Team-azure-love --name nanuri-api-backend --src-path ./build/libs/nanuri-server-0.0.1.jar --type jar
```
명령어가 끝날 때까지 기다립니다. 
![ee](https://github.com/user-attachments/assets/7403f678-a202-4784-aee9-51986db87ba9)

## 2. Azure 계정 만들기

1. https://azure.microsoft.com/free 로 이동하고, Try Azure For Free를 누릅니다.
    
<img width="1822" alt="7" src="https://github.com/user-attachments/assets/c0538392-e0fe-4ea6-9606-25dfafda9558">
    
2. Country, First Name (이름), Last Name (성), Email Adress,  Phone을 작성하고, 전화 또는 문자 인증을 해줍니다.
    
<img width="1822" alt="8" src="https://github.com/user-attachments/assets/940d1da0-bd34-497c-95d7-2b1ed418bf93">
    
3. 밑의 우편번호와 주소지를 적고, 카드 인증을 해줍니다. 그러면 계정 회원가입 및 프리티어 신청이 완료되었습니다.
    
<img width="1822" alt="9" src="https://github.com/user-attachments/assets/fad35438-ad88-489c-9c40-cc213a4ea69c">
    
![10](https://github.com/user-attachments/assets/3ea70a55-8661-4c61-bc21-c01e6a776062)

## 시작하기

> **여러분의 제품/서비스를 Microsoft 애저 클라우드에 배포하기 위한 절차를 구체적으로 나열해 주세요.**

### Azure Static Web App 만들기

1. **홈 — 리소스 그룹 — 생성을 누르고,
아래의 과정을 쭉 진행해서 리소스 그룹을 만들어줍니다.**

<img width="1822" alt="11" src="https://github.com/user-attachments/assets/a990179c-1bc7-46c8-b316-fbc1e0259726">

2. 리소스 그룹을 만들면 이런 창이 보입니다. 상단의 만들기를 눌러줍니다.
    
    <img width="1822" alt="12" src="https://github.com/user-attachments/assets/ff09b88d-c0e4-4aaa-aecc-16c5bf37c85c">
    
3. 만들기를 누르면 이런 창으로 넘어옵니다. 검색장에 `정적 웹앱`을 검색해주면 아래의 항목이 나옵니다.
    아래의 항목을 눌러줍니다.
        
    <img width="1822" alt="13" src="https://github.com/user-attachments/assets/e7e635a3-3c26-4c4a-b1b8-f9579f125329">
        
    
4. 아래의 만들기 버튼을 눌러줍니다.
    
<img width="1822" alt="14" src="https://github.com/user-attachments/assets/001276cd-91dc-4011-84f0-5e6fa1275a18">

5. 아래의 페이지에서 구독의 리소스 그룹을 설정하고, 이름을 입력해줍니다. 계획 유형은 기본값 그대로 놔두어주고 배포 세부 정보를 설정해봅시다.
    
<img width="716" alt="15" src="https://github.com/user-attachments/assets/934809dc-f61f-4f5f-90af-53a30950e8a6">
    
6. 배포 세부 정보에서, 원본은 Github으로 설정해주고, GitHub 계정을 눌러 아까전에 레포지토리를 포크한 해당 계정을 연동해줍니다. 연동이후, 조직은 내 계정명으로 되어있는것을, 리포지토리는 포크한 리포지토리, 분기는 main으로 설정해줍니다.
        
<img width="713" alt="16" src="https://github.com/user-attachments/assets/d969c385-3451-4b6b-9e01-782e417c4e3f">
        
7. 정상적으로 포크한 계정과 레포지토리가 설정되었다면, 아래와 같이 빌드 사전 설정이 자동으로 React로 잡히게 되고, 앱 위치또한 자동으로 설정되게 됩니다. 이때, 우리의 프로젝트는 Vite를 사용하므로, 출력 위치는 기본으로 설정되는 ‘build에서, ‘dist’로 교체하여줍니다.이후, 고급과 태그 항목은 스킵해주고, 검토 + 만들기 창으로 이동하여줍니다.
        
<img width="87" alt="17" src="https://github.com/user-attachments/assets/11dadd98-7ab2-40c2-9a8b-32aa48d1a976">
        
<img width="1822" alt="18" src="https://github.com/user-attachments/assets/6e8f2a97-083b-4e9f-a3e1-a17b88b06493">
        
8. 해당 페이지 진입 후, 유효성 검사가 끝나면, 아래 화면이 나옵니다. 이때 만들기 버튼을 눌러줍니다.
        
<img width="1822" alt="19" src="https://github.com/user-attachments/assets/e2fd5709-06c9-40f0-afa2-5dab9642b81c">
        
9. 아래 배포 진행중 화면이 나옵니다. 조금만 기다려줍니다.
        
<img width="1822" alt="20" src="https://github.com/user-attachments/assets/e4e59ae5-1275-4e2e-b06d-06ab1064848c">
        
10. 아래와 같이 배포가 완료됨 화면이 나옵니다. 축하합니다! 정적 웹 리소스 생성에 성공하였습니다.
        리소스로 이동 버튼을 눌러봅시다.
        
<img width="1822" alt="21" src="https://github.com/user-attachments/assets/bd830c04-11aa-4dd8-8008-8e65460af120">
        

### CI / CD 진행 및 자동화 완료 확인.

1. 리소스 그룹으로 이동해, 아래의 Github 작업 실행을 누르고, 아래 페이지로 넘어가면 아래의 
’ci: add Azure Static Web Apps workflow file’ 을 눌러줍니다.

<img width="1822" alt="22" src="https://github.com/user-attachments/assets/4678f226-be67-4c3e-a754-6833ebfba265">

2. 위의 과정을 그대로 따라하셨다면, 조금만 기다리면 이렇게 Deploy가 성공하는걸 보실 수 있습니다.

<img width="1822" alt="23" src="https://github.com/user-attachments/assets/e890a893-d32d-4a3e-ab70-77acd34ddeef">

3. 위의 과정이 성공한것을 확인 후, Azure Console 페이지로 돌아와, 해당 부분을 눌러봅니다.

<img width="1822" alt="24" src="https://github.com/user-attachments/assets/21323c21-8f31-4193-913e-3383ba689e8c">

4. 아래와 같이 사이트가 정상적으로 자동 배포된 모습을 볼 수 있습니다.
    이제, 해당 레포지토리의 frontend 폴더에 Commit을 올리게되면, 앞으로도 자동으로 사이트가 업데이트되어 배포될것입니다.

<img width="571" alt="25" src="https://github.com/user-attachments/assets/ca6f99e2-0376-4d39-aae7-3b2415c1d77d">
