package practicework;

import jdk.internal.misc.InnocuousThread;

public class Welcome_page {
    private static InnocuousThread SpringApplication;

    @SpringBootApplication

    public static void main(String[] args) {
        SpringApplication.run();
    }
}

    @Controller
    class WelcomeController {

        @GetMapping
        public String welcome() {
            return "welcome";
        }
    }


