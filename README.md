# `애저사랑해` - `나누리`

해커그라운드 해커톤에 참여하는 `애저사랑해` 팀의 `나누리`입니다.

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

안녕하세요! 이 가이드는 여러분이 GitHub에 있는 프로젝트를 Azure 정적 웹앱으로 배포하는 방법을 설명합니다. 컴퓨터에 운영체제와 브라우저만 설치되어 있다고 가정하고 시작할게요.

## 깃허브

1. [https://github.com/](https://github.com/) 에 접속합니다. 
    
    ![Screenshot 2024-08-26 at 9.07.28 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_9.07.28_PM.png)
    
2. 계정이 없는 분은 회원가입을, 계정이 있는분은 로그인을 진행합니다.
    
    ![Screenshot 2024-08-26 at 9.09.06 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_9.09.06_PM.png)
    
    ![Screenshot 2024-08-26 at 9.08.51 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_9.08.51_PM.png)
    

1. GitHub에서 
[https://github.com/hackersground-kr/hg-Team-azure-love](https://github.com/hackersground-kr/hg-Team-azure-love)
로 접속, 프로젝트를 내 계정으로 fork해옵니다.

![Screenshot 2024-08-26 at 7.33.52 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_7.33.52_PM.png)

![Screenshot 2024-08-26 at 9.12.18 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_9.12.18_PM.png)

1. 이렇게 포크가 완료된 모습이 보인다면 이 과정은 완성입니다.

![Screenshot 2024-08-26 at 7.41.19 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_7.41.19_PM.png)

추후에 이 탭을 쓸 예정이에요. 닫지 말아주세요!

## JAVA

Mac에 경우 터미널, Window는 명령 프롬포트를 열어서 아래 명령어를 실행하여 JAVA가 설치되어 있는지 확인합니다.

```powershell
java -version
```

다음과 같이 나올 경우 설치가 되어 있는 것으로, 해당 단계를 건너 뛰고 Server 준비로 가도 됩니다. (다만 중간에 표시된 버전이 17 미만일 경우 아래에 나온 설치 과정을 이행해야 합니다!)

```powershell
openjdk version "22.0.2" 2024-07-16
```

- Mac :
    - Mac 기본 내장 터미널을 연 후 아래 명령어를 입력하여 brew를 설치합니다, 이미 설치가 되어 있을 경우 해당 단계는 생략해도 됩니다.
    
    ```bash
    /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
    ```
    
    - brew 설치 확인 명령어로 설치가 되었는지 확인할 수 있습니다.
        
        ```bash
        brew --version
        ```
        
    - 설치되어 있지 않을 경우 아래 사이트로 접속해 줍니다.
        
        [https://www.oracle.com/kr/java/technologies/downloads/#java8-mac](https://www.oracle.com/kr/java/technologies/downloads/#java8-mac)
        
        접속 후에 JDK 17 선택 → macOS 선택합니다.
        
        ![스크린샷 2024-08-26 오후 7.19.11.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/2481054c-79c5-4c40-a97c-a50fdcda1816.png)
        
        명단에 있는 4개의 다운로드 링크 중 ARM64 DMG Installer을 다운로드 받습니다.
        
        다운받은 DMG 파일을 연 후 안에 있는 pkg 파일을 실행합니다.
        
        ![스크린샷 2024-08-26 오후 7.24.04.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2024-08-26_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_7.24.04.png)
        
        ![스크린샷 2024-08-26 오후 7.24.14.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2024-08-26_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_7.24.14.png)
        
        오른쪽 하단의 계속 버튼을 눌러서 다운로드를 해줍니다.
        
        ![스크린샷 2024-08-26 오후 7.24.19.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2024-08-26_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_7.24.19.png)
        
        ![스크린샷 2024-08-26 오후 7.24.22.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2024-08-26_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_7.24.22.png)
        
        오른쪽 하단의 설치 버튼을 눌러서 설치를 시작합니다.
        
        ![스크린샷 2024-08-26 오후 7.24.38.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2024-08-26_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_7.24.38.png)
        
        설치가 완료되면 닫기 버튼을 누릅니다.
        
        터미널을 연 후에 아래 명령을 입력하여 설치가 완료된 것을 확인한다.
        
        ```powershell
        java -version
        ```
        
- Window :
    - JAVA 첫 단계에서 버전 확인 당시에 설치는 되어 있으나 버전이 17 미만인 분에 경우에는 추후 나오는 환경 변수 설정 단계에서 기존에 있던 것을 삭제 후에 해야합니다!
    - 아래 링크로 접속합니다.
    [https://www.oracle.com/java/technologies/downloads/#jdk17-windows](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)
    - x64 MSI Installer라고 적혀있는 링크를 선택하여서 다운 받습니다.
        
        ![스크린샷 2024-08-26 오후 7.52.09.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2024-08-26_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%2592%25E1%2585%25AE_7.52.09.png)
        
    - 다운 받은 파일을 실행 후 모든 스탭을 계속(혹은 next)을 클릭하여 설치를 완료합니다.
    - 설정 -> 시스템 정보 -> [고급 시스템 설정]을 클릭합니다.
        
        ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image.png)
        
    - 시스템 속성 [환경 변수]를 클릭
        
        ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%201.png)
        
    - [환경 변수] 대화 상자가 나타나면 [시스템 변수]에서 [새로 만들기] 버튼을 클릭합니다.
        
        ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/d31679d1-9855-4982-9c25-bb95250085af.png)
        
    - [새 시스템 변수] 대화상자가 나타나면 [변수 이름]에 JAVA_HOME을 입력하고, [변수 값]에 JDK 17 설치 경로를 입력합니다. 두 항목을 입력 후 [확인] 버튼을 클릭하여 적용합니다. 따로 설정한 적이 없다면 설치 경로는 아래와 동일하게 해도 좋습니다.
        
        ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%202.png)
        
    - [환경 변수] 대화상자의 [시스템 변수(S)]에서 Path 변수 항목을 선택하고 [편집]을 클릭합니다.
        
        ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/6cdaba88-a3cb-4185-ae31-d8e1e72d22de.png)
        
    - [환경 변수 편집] 대화상자가 나타나면 [새로 만들기] 버튼을 클릭하고 항목이 추가되면 `%JAVA_HOME%\bin`을 입력합니다.
        
        ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%203.png)
        
    - 등록한 `%JAVA_HOME%\bin`을 선택하고 [위로 이동] 버튼을 클릭해서 첫 번째 항목으로 올려줍니다.  그 후 모든 대화 상자의 [확인] 버튼을 클릭하여 환경 변수 설정을 마칩니다.
        
        ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%204.png)
        

## Bicep - 리소스 배포 자동화

- MacOS - Bicep 설정
    - 터미널을 킨다. command + 스페이스바)
        
        ![Screenshot 2024-08-27 at 03.06.31.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-27_at_03.06.31.png)
        
    - 아래 명령어들을 한줄씩 적는다
    
    ```bash
    brew update
    brew install gh
    brew install azure-cli
    brew tap azure/azd && brew install azd
    ```
    
- Window Bicep 설정
    - Git 설정
        - 아래 링크로 들어가서 설치합니다.
        1. https://github.com/git-for-windows/git/releases/download/v2.46.0.windows.1/Git-2.46.0-64-bit.exe
        - 실행 시 위 화면이 뜹니다. 다음(Next) 버튼을 눌러주세요
        
        ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%205.png)
        
        - 설치 경로를 지정하는 창이 뜹니다. 기본 경로로 설치하겠습니다. 다음(Next) 버튼을 누릅니다.
        
        ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%206.png)
        
        - 추가 설정을 하는 창이 뜹니다. 기본 설정으로 설치합니다. 다음(Next) 버튼을 누릅니다.
        
        ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%207.png)
        
        - 위 화면들 전부 무시하고 다음(Next)를 누릅니다.
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%208.png)
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%209.png)
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2010.png)
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2011.png)
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2012.png)
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2013.png)
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2014.png)
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2015.png)
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2016.png)
            
        - 설치(Install) 버튼을 누릅니다.
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2017.png)
            
        - 설치가 완료되면, 체크를 모두 풀고 마침(Finish)를 누릅니다.
    - GitHub CLI 설치
        - 다음 링크로 접속 후 설치합니다.
            1. https://github.com/cli/cli/releases/download/v2.55.0/gh_2.55.0_windows_amd64.msi
        - 다음(Next) 버튼을 누릅니다.
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2018.png)
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2019.png)
            
        - 설치(Install) 버튼을 누릅니다.
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2020.png)
            
        - 설치가 완료되면, 마침(Finish)버튼을 누릅니다.
    - Azure CLI 설치
        - 아래 링크로 접속 후 설치합니다.
            - [https://azcliprod.blob.core.windows.net/msi/azure-cli-2.63.0-x64.msi](https://azcliprod.blob.core.windows.net/msi/azure-cli-2.63.0-x64.msi)
        - 약관에 동의 하는 체크박스를 누르고, 설치(Install) 버튼을 누릅니다.
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2021.png)
            
        - 관리자 권한을 요구하는 창이 뜬다면, ‘예’를 누릅니다.
        - 설치가 완료되면, 마침(Finish) 버튼을 누릅니다.
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2022.png)
            
    - Azure Developer CLI 설치
        - Windows 키를 눌러 (키보드에 있는 창문 모양, 혹은 Win 키) powershell을 관리자 권한으로 실행합니다
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2023.png)
            
        - 아래 명령어를 위에서부터 한번씩 실행해봐요.
        - 만약 성공했다는 메시지가 보인다면 (첨부된 사진으로 확인해요) 넘어가도 좋아요
    - `winget install microsoft.azd`
        - 만약 위와같은 화면이 떴다면, Y를 입력하고 엔터를 누릅니다.
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2024.png)
            
        - 설치완료 사진입니다. (설치 중 화면에 커서가 올라가 있다면 아무 키보드를 눌러서 화면을 풀어주세요)
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2025.png)
            
    - `choco install azd`
        - 위 화면이 표시되었을 때 ‘A’ 를 적고 엔터를 친다
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2026.png)
            
        - 설치 완료시 표시되는 화면이다.
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2027.png)
            
    - `powershell -ex AllSigned -c "Invoke-RestMethod '[https://aka.ms/install-azd.ps1](https://aka.ms/install-azd.ps1)' | Invoke-Expression"`
        - 추가적인 질문 없이 자동으로 설치된다.
            
            ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2028.png)
            

## Azure 계정 만들기

1. [https://azure.microsoft.com/free](https://azure.microsoft.com/free) 로 이동하고, Try Azure For Free를 누릅니다.
    
    ![Screenshot 2024-08-26 at 8.58.43 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.58.43_PM.png)
    
2. Country, First Name (이름), Last Name (성), Email Adress,  Phone을 작성하고, 전화 또는 문자 인증을 해줍니다.
    
    ![Screenshot 2024-08-26 at 9.00.12 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_9.00.12_PM.png)
    
3. 밑의 우편번호와 주소지를 적고, 카드 인증을 해줍니다. 그러면 계정 회원가입 및 프리티어 신청이 완료되었습니다.

## Azure 계정 로그인

- [https://portal.azure.com/](https://portal.azure.com/) 사이트에 접속하여, 애저 계정으로 로그인합니다.

![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2029.png)

- 로그인을 하고 나면, 위와 같은 화면이 표시됩니다.

![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2030.png)

- 이후, 아까 켜놓았던 powershell로 돌아가 아래 명령어를 쳐줍니다.
    - 혹시 파워셸이 꺼져있다면? 파워셸을 다시 한번 켜주세요!
    
    ```powershell
    az login
    # 만약 팝업창이 뜬다면, 로그인을 진행해주세요.
    ```
    
- 그러면 팝업창이 하나 뜰 거에요!
    - 만약 팝업창이 안뜬다면… 명령어를 다시 실행해보세요!
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2031.png)
    
- 로그인을 하면 구독정보 선택창이 뜰거에요.
    - 구독정보가 한개라면 빈 칸으로 엔터를 쳐주세요
    - 구독정보가 여러개라면, 원하는 구독 정보의 번호를 작성하고, 엔터를 쳐주세요
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2032.png)
    

- 그 다음으로, 아래 명령어를 쳐 줍니다.
    
    ```powershell
    azd auth login
    ```
    
- 아까 로그인 했던 애저 계정으로 로그인합니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2033.png)
    

위 화면이 뜬다면, 브라우저 탭을 닫아도 됩니다.

![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2034.png)

- 그 다음, 아래 명령어를 쳐 줍니다.
    
    ```powershell
    gh auth login
    ```
    
- GitHub.com을 선택합니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2035.png)
    
- HTTPS를 선택합니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2036.png)
    
- Y를 누르고, 엔터를 쳐 줍니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2037.png)
    
- Login with a web browser를 선택합니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2038.png)
    
- 위에 8자리 (4 + 4) 코드를 기억하고, 엔터를 쳐 줍니다
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2039.png)
    
- 깃헙 계정으로 로그인을 해 줍니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2040.png)
    
- 아까 기억 해두었던 8자리 코드를 입력합니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2041.png)
    
- 위 화면이 뜬다면, 스크롤을 내려 초록 버튼을 눌러 승인합니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2042.png)
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/70fb7f4c-a8c0-431f-b5a0-0c9d2859da32.png)
    
- 위 화면이 뜬다면, 브라우저 탭을 닫아도 괜찮습니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2043.png)

## 시작하기

> **여러분의 제품/서비스를 Microsoft 애저 클라우드에 배포하기 위한 절차를 구체적으로 나열해 주세요.**

# 서버 배포 시작

- 아까 안 끈 그 탭!!! 그 창 가셔서 진행할거에요. (기억이 안나시거나 수행하지 않으셨다면 올라가서 확인 후 진행해 주세요.)
- 아래와 같은 사진에서 초록색 Code 버튼을 누른 뒤, 화살표 표시된 버튼을 눌러주세요.

![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2044.png)

- 윈도우키를 눌러, powershell을 일반권한으로 실행 합니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2045.png)
    

- 맥북의 경우, terminal을 켜 줍니다.

![Screenshot 2024-08-27 at 02.33.43.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-27_at_02.33.43.png)

- 아래 명령어를 입력 해 줍니다. !!

```bash
# OS 공통
git clone (아까 복사한 URL을 붙여넣기)
```

![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2046.png)

```powershell
cd hg-Team-azure-love
```

다음 명령어를 os에 맞게 쳐줍니다

```powershell
# 맥OS
cd backend
sudo chmod 755 ./gradlew # 비밀번호 입력
./gradlew bootJar

# 윈도우
cd backend
.\gradlew.bat bootJar
```

- 위와 같은 화면이 나와야 합니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2047.png)
    
- 아래 명령어를 입력 하여 Bicep 자동으로 리소스를 생성합니다.
    - rg- 가 생략된 애저 리소스 그룹을 적어주세요! (’rg-jombidev’ → ‘jombidev’)
    - 만약 따로 생성한 리소스 그룹이 없다면

```powershell
azd init -e '애저 리소스 그룹 이름'
azd config set alpha.resourceGroupDeployments on
azd up
```

- 구독정보를 선택합니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2048.png)
    
- 애저 위치로 Korea Central을 선택합니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2049.png)
    
- 아래의 정보를 활용해 입력을 요구하는 모든 정보를 채우세요. 아래 조건에 해당하도록 자유롭게 작성해주세요.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2050.png)
    
    ```bash
    dbName: 16자 이내의 알파벳 (특수문자로 '_', '-' 만 사용가능)
    dbPassword: 영문 대소문자, 숫자, 특수문자를 포함한 8자리 이상의 문자
    dbUser: 16자 이내의 알파벳 (특수문자 및 '-' 및 '_' 사용 불가)
    jwtSecret: 바로 밑에 줄 글자 그대로 입력 >
    6lHthvX15Va3/Cqh/ftNgek6ewRIKZoDS2VZw2NBXh+2cp7q5BrrsJlfA2EKDR6UGvELeAv1cg7mQNVDFi0sqzkCmVL4PJrTGKlDvbGFmzJzKBjoVSPD2H9t+QkSw4+mCfFehTFnnmiP1ulLfp1xOyA6bUjmQogCUgjAbjHJZSF5OZ2VoyUtQn8+f0fJvYLpI8NrZrWHBEVKXbXgSaNZ0Pve8JHaiW1iB+kSZw==
    
    name: 배포가 될 WebApp의 이름 (작성자의 경우 nanuri-api)
     > 추후에 사용할 예정이니, 메모가 필요합니다.
    ```
    

![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2051.png)

- 본인의 애저 리소스 그룹을 찾아서 선택합니다. (작성자의 경우, rg-Team-azure-love)
- 완료 될 때까지 기다립니다. (대략 5~15분 소요)
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2052.png)
    
- 애저 리소스가 전부 만들어 졌습니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2053.png)
    
- 마지막으로, 다음 명령어를 입력 해 서버를 배포합니다.

```bash
az webapp deploy --resource-group '(rg-가 포함된 애저 리소스 그룹)' --name '(아까 메모해 둔 WebApp의 이름)-backend' --src-path ./build/libs/nanuri-server-0.0.1.jar --type jar
# 예시 (작성자의 경우)
# az webapp deploy --resource-group rg-Team-azure-love --name nanuri-api-backend --src-path ./build/libs/nanuri-server-0.0.1.jar --type jar
```

- 명령어가 끝날 때까지 기다립니다.
    
    ![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2054.png)
    
- 이제 `You can visit your app at:` 뒤에 URL로 접속하여 서버가 원할한지 테스트합니다.

## 웹 배포 시작

Azure 계정 만들기 직후 단계입니다, 까먹거나 수행하지 않으셨다면 돌아가셔서 확인 후 진행해 주세요.

1. **홈 — 리소스 그룹 — 만들기 버튼을 누르고,
아래의 과정에서 리소스 그룹명을 넣고(기존에 존재하는 이름은 사용 불가), 
나머지는 전부 넘긴 후, 리소스 그룹을 만들어줍니다.**

![image.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/image%2055.png)

1. 리소스 그룹을 만들면 이런 창이 보입니다. 상단의 만들기를 눌러줍니다.
    
    ![Screenshot 2024-08-26 at 7.55.11 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_7.55.11_PM.png)
    
    1. 만들기를 누르면 이런 창으로 넘어옵니다. 검색장에 `정적 웹앱`을 검색해주면 아래의 항목이 나옵니다.
    아래의 항목을 눌러줍니다.
        
        ![Screenshot 2024-08-26 at 8.00.04 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.00.04_PM.png)
        
    
    4. 아래의 만들기 버튼을 눌러줍니다.
    
    ![Screenshot 2024-08-26 at 8.13.12 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.13.12_PM.png)
    
    1. 아래의 페이지에서 구독의 리소스 그룹을 설정하고, 서비스 이름을 입력해줍니다(저희는 프로젝트명인 nanuri로 하였습니다). 계획 유형은 기본값 그대로 놔두어주고 배포 세부 정보를 설정해봅시다.
    
    ![Screenshot 2024-08-26 at 8.21.41 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.21.41_PM.png)
    
    1. 배포 세부 정보에서, 원본은 Github으로 설정해주고, GitHub 계정을 눌러 아까전에 레포지토리를 포크한 해당 계정을 연동해줍니다.
    
    연동이후, 조직은 내 Github 계정명으로 되어있는것을, 리포지토리는 포크한 리포지토리, 분기는 main으로 설정해줍니다.
        
        ![Screenshot 2024-08-26 at 8.27.26 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.27.26_PM.png)
        
    2. 정상적으로 포크한 계정과 레포지토리가 설정되었다면, 아래와 같이 빌드 사전 설정이 자동으로 React로 잡히게 되고, 앱 위치또한 자동으로 설정되게 됩니다. 
    
    이때, 우리의 프로젝트는 Vite를 사용하므로, 출력 위치는 기본으로 설정되는 ‘build에서, ‘dist’로 교체하여줍니다.
    
    이후, 고급과 태그 항목은 스킵해주고, 검토 + 만들기 창으로 이동하여줍니다.
        
        ![Screenshot 2024-08-26 at 8.28.37 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.28.37_PM.png)
        
        ![Screenshot 2024-08-26 at 8.31.05 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.31.05_PM.png)
        
    3. 해당 페이지 진입 후, 유효성 검사가 끝나면, 아래 화면이 나옵니다. 이때 만들기 버튼을 눌러줍니다.
        
        ![Screenshot 2024-08-26 at 8.31.41 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.31.41_PM.png)
        
        1. 아래 배포 진행중 화면이 나옵니다. 조금만 기다려줍니다.
        
        ![Screenshot 2024-08-26 at 8.33.05 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.33.05_PM.png)
        
        1. 아래와 같이 배포가 완료됨 화면이 나옵니다. 축하합니다! 정적 웹 리소스 생성에 성공하였습니다.
        리소스로 이동 버튼을 눌러봅시다.
        
        ![Screenshot 2024-08-26 at 8.34.14 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.34.14_PM.png)
        

## CI / CD 진행 및 자동화 완료 확인.

1. 리소스 그룹으로 이동해, 아래의 Github 작업 실행을 누르고, 아래 페이지로 넘어가면 아래의 
’ci: add Azure Static Web Apps workflow file’ 을 눌러줍니다.

![Screenshot 2024-08-26 at 8.38.19 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.38.19_PM.png)

![Screenshot 2024-08-26 at 8.40.02 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.40.02_PM.png)

1. 위의 과정을 그대로 따라하셨다면, 조금만 기다리면(평균 1분 45초 가량) 
이렇게 Deploy가 성공하는걸 보실 수 있습니다.

![Screenshot 2024-08-26 at 8.36.56 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.36.56_PM.png)

1. 위의 과정이 성공한것을 확인 후, Azure Console 페이지로 돌아와, URL부분을 눌러봅니다.
    
    ![Screenshot 2024-08-26 at 8.48.06 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.48.06_PM.png)
    
    1. 아래와 같이 사이트가 정상적으로 자동 배포된 모습을 볼 수 있습니다.
    
    이제, 해당 레포지토리의 frontend 폴더에 Commit을 올리게되면, 앞으로도 자동으로 사이트가 업데이트되어 배포될것입니다.
        
   ![Screenshot 2024-08-26 at 8.49.34 PM.png](%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%E1%84%86%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%2068b08883afc742bebf67f6d3108fa9f4/Screenshot_2024-08-26_at_8.49.34_PM.png)
