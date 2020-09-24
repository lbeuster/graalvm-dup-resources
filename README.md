# graalvm-dup-resources

* the file src/main/resources/graalvm-test.txt is only once in the classpath but in the native-image I see it twice
* because it is included by 2 different patterns in the same resources-config files
    
	mvn clean verify
	target/