# CloudCamp_WebServer_SocketAPI
2022 CloudCamp Mission

MyHandler클래스와 Test클래스파일로 구성되어있습니다.

Test클래스에서 9000포트를 열어서 통신하게 했습니다.
MyHandler에서는 index.html을 자바에서 읽어온뒤 이를 인코딩해서 웹브라우저에 전달하는 기능을 구현했습니다.

http://localhost:9000/index.html에 접속하면 Index.html을 띄워줍니다.
에러가 생긴다면 MyHandler에서 String root를 제 로컬pc위치를 지정해줘서 그러는데 코드파일 내 index.html을 받아서 경로수정을 해주면 될 것 같습니다.

text와 css형식은 자바가 받아오는데 문제없었으나, 이미지파일은 깨지는 현상이 있었습니다.
브라우저에서 입력값을 자바에 Post로 보내는 것까지 구현하고 싶어 html파일에서 form태그로 request를 보내는 부분부터 어려움이 있었습니다.

Post 송수신이 구현이 되는대로 업데이트할 예정입니다.
개발공부를 시작한지 얼마되지 않았지만, 클라우드수업을 통해 웹에 대해 많은 것을 배우고 실습할 수 있어서 정말 도움이 되고 있습니다.
![image](https://user-images.githubusercontent.com/53210680/166428576-404de8cb-0b63-4389-bfbf-b76b84caa439.png)
