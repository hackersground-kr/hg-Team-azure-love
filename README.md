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

## 

## Server 배포 준비사항 (Mac, Window 순)

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

## 시작하기

> **여러분의 제품/서비스를 Microsoft 애저 클라우드에 배포하기 위한 절차를 구체적으로 나열해 주세요.**
