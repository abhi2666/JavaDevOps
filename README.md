<h1>Java Maven Application testing using Jenkins inside a docker container</h1>

<h3>Steps Followed - </h3>

1. Created a basic Maven Java app that performs addtion and subtraction.
   
![image](https://github.com/user-attachments/assets/d5cc8cca-3738-49db-98a7-6ee71a89a7a3)

![image](https://github.com/user-attachments/assets/306de670-73f7-41ba-abab-5402aefc1f3b)

2. Created a test case to check if addition and subtraction are working properly or not using JUnit. Created a Dockerfile that will be later used by docker to create the image of Java app.

![image](https://github.com/user-attachments/assets/cd25638f-ef54-4b56-971b-eea90c098f9b)


3. Pushed the code to the github so that jenkins can pull it.

![image](https://github.com/user-attachments/assets/8e7b1f34-01b7-462b-aa3d-14bc25d6d18f)

4. Created a Maven Jenkins Project to pull the code from git hub, then build the code and then test the code and generate test result file.

<h3>Jenkins Configuration for Maven Project</h3>

![image](https://github.com/user-attachments/assets/d6f26cc9-6a78-4116-a43f-f6c6bd279cde)

![image](https://github.com/user-attachments/assets/04877340-7b27-4809-990d-20ed80d37dd8)


4. Below is the Jenkins console output.



![image](https://github.com/user-attachments/assets/748d1214-3076-45b9-92cb-33ce2364871c)

![image](https://github.com/user-attachments/assets/74f0bd27-cb8c-4ac2-ace9-c917a4307c2e)

![image](https://github.com/user-attachments/assets/fc47bbc2-c11e-442f-a33a-847c84c45ff9)

![image](https://github.com/user-attachments/assets/ae178660-4eff-40a9-b323-d2b42855d6d5)

![image](https://github.com/user-attachments/assets/b661dbc5-b597-42ea-8337-3dece4bb7375)


5. Test report of the Maven Application.

![image](https://github.com/user-attachments/assets/87f52f63-c114-4dc1-ac0c-19830e3fd5b5)


6. Test cases passed Successfully. No Error in the pipeline whatsoever.

