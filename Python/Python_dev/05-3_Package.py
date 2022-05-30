# 패키지

# 패키지란 무엇인가?

"""
패키지는 도트(.)를 사용하여 파이썬 모듈을 디렉터리 구조로 관리할 수 있게 해준다.
예를 들어 모듈 이름이 A.B인 경우에 A는 패키지 이름이 되고 B는 A 패키지의 B 모듈이 된다.

* 파이썬에서 모듈은 하나의 .py 파일이다.

파이썬 패키지는 디렉터리와 파이썬 모듈로 이루어지며 구조는 다음과 같다.

ex) game 패키지

game/
    __init__.py
    sound/
        __init__.py
        echo.py
        wav.py
    graphic/
        __init__.py
        screen.py
        render.py
    play/
        __init__.py
        run.py
        test.py

game 디렉터리가 이 패키지의 루트 디렉터리이고 sound, graphic, play는 서브 디렉터리이다.

"""

# 패키지 만들기


