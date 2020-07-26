package app;

import org.opencv.core.Core;

public class HelloOpenCV {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Core.VERSION);
        System.out.println(Core.VERSION_MAJOR);
        System.out.println(Core.VERSION_MINOR);
        System.out.println(Core.VERSION_REVISION);
    }

}
