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
        
        터미널을 연 후에 아래 명령을 입력하여 설치가 완료된 것을 확인한다.
        
        ```bash
        java -version
        ```
        
2. Window
    1. 아래 링크로 접속합니다.
    https://www.oracle.com/java/technologies/downloads/#jdk17-windows
    2. x64 MSI Installer라고 적혀있는 링크를 선택하여서 다운 받습니다.
        
        <img width="1470" alt="스크린샷 2024-08-26 오후 7 52 09" src="https://github.com/user-attachments/assets/97180706-5826-4cdc-adc2-626841984c46">
        
    3. 다운 받은 파일을 실행 후 모든 스탭을 계속을 클릭하여 설치를 완료합니다.
    4. 터미널을 실행 후 아래 명령어를 입력하여 JAVA의 설치 여부를 확인합니다.
        
        ```powershell
        java -version
        ```
        
        java 버전이 표시될 경우 성공적으로 설치된 것입니다(1-C 참고).

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
