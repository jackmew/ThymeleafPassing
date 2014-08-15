#It's a simple spring boot + thymeleaf project showing how to send/receive object & send List<T>.


#run

`cd thymeleafPassing`


`mvn clean package spring-boot:run`

#workflow

index.html

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf2/7.png)

You can choose three type of leaning Thymeleaf.





## 1. learing passing foo object or List<foo>


![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf/28.png)

when you press `send foo object` , you'll create a foo object and set its attribute , finally send to html .

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf/29.png)

change the content in the input container .

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf/30.png)

send back to index.html

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf/31.png)

press  `send foos in List` , you'll create three foo object and add them to List<Foo> foos , finally send to html .

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf/32.png)


# 2. Learning some basic Thymeleaf expression


![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf2/1.png)

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf2/2.png)



# 3. Learning how to validate form input


[spring.io](http://spring.io/guides/gs/validating-form-input/)

I combined this sample into my Thymeleaf Guide.


set Person validation condition

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf2/3.png)

form transfer the data (which was packaged to Person) to controller. 

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf2/5.png)

Controller receive Person object , which was with @Valid , @Valid means to validate  Person condition , when there are errors happen , save error message into BindingResult.


![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf2/4.png)

`th:if="${#fields.hasErrors('name')}" ` if is true , `th:errors="*{name}"` will print error message.


![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf2/5.png)

![image](https://dl.dropboxusercontent.com/u/47510080/markdown/spring/thymeleaf2/6.png)



####You can add more condition to Person

@NotNull
@NotEmpty
@Size(max = 50)
@Max(100)
@Column(name = "username" , length = 50)













