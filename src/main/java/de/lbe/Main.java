package de.lbe;

import java.net.URL;
import java.util.Enumeration;

public class Main {

    public static void main(final String[] args) throws Exception {
        System.out.println("GraalVM-Version: " + System.getProperty("java.vm.version"));
        Enumeration<URL> resources = Main.class.getClassLoader().getResources("graalvm-test.txt");
        while (resources.hasMoreElements()) {
            Object url = resources.nextElement();
            System.out.println("MAIN: Found resource: " + url);
        }
    }
}
