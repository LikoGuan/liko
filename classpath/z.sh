javac -cp . -d ./lib com/alibaba/Test.java com/guan/Hello.java net/cheng/Add.java
cd ./lib
jar cfmv liko.jar Manifest.txt com net
java -cp ../lib2 -jar liko.jar   or  'java -classpath liko.jar:../lib2/cn.jar com.alibaba.Test'
