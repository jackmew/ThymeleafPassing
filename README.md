#It's a simple spring boot + thymeleaf project showing how to send/receive object & send List<T>.


#run

`cd thymeleafPassing`


`mvn package spring-boot:run`

#workflow

index.html

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf/28.png)

when you press `send foo object` , you'll create a foo object and set its attribute , finally send to html .

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf/29.png)

change the content in the input container .

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf/30.png)

send back to index.html

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf/31.png)

press  `send foos in List` , you'll create three foo object and add them to List<Foo> foos , finally send to html .

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf/32.png)