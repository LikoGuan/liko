rm -rf lib/*
rm -rf target/*

javac -d ./target/ com/apple/AppleSearchEngine.java
javac -d ./target/ com/google/GoogleSearchEngine.java
javac -d ./target/ net/latipay/MainApp.java
javac -d ./target/ org/java/SearchEngine.java
cp -r com/apple/META-INF ./target/com/apple/
cp -r com/google/META-INF ./target/com/google/
cp -r net/latipay/META-INF ./target/net/latipay/

cd target

jar cvf apple.jar com/apple/AppleSearchEngine.class
cd com/apple/
jar uf ../../apple.jar META-INF/services/org.java.SearchEngine
cd ../../
cp apple.jar ../lib/

jar cvf google.jar com/google/GoogleSearchEngine.class
cd com/google/
jar uf ../../google.jar META-INF/services/org.java.SearchEngine
cd ../../
cp google.jar ../lib/

jar cvf search.jar org/java/SearchEngine.class
cp search.jar ../lib/

jar cvfm latipay.jar net/latipay/META-INF/MANIFEST.MF net/latipay/MainApp.class
cp latipay.jar ../lib/
