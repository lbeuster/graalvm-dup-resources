# graalvm-dup-resources

* the file src/main/resources/graalvm-test.txt is only once in the classpath but in the native-image we see it twice
* because we have 2 resources-config files for the above file but with **different** patterns
    * first pattern is from the generated file in META-INF/native-image from an agent-run
    * second pattern is from the manual resource-config in src/main/resource/my-resources-config.json
    
	mvn clean verify
	target/