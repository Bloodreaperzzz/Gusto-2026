package com.Backend.Backend.Startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StartupRunner implements CommandLineRunner
{
    private final List<StartupCheck>checks;
    public StartupRunner(List<StartupCheck>checks)
    {
        this.checks=checks;
    }
    @Override
    public void run(String... args) {
        System.out.println("===== Running startup checks =====");
        checks.forEach(check -> {
            try {
                check.run();
            } catch (Exception e) {
                System.err.println("❌ Startup check failed: " + e.getMessage());
            }
        });
        System.out.println("===== Startup checks completed =====");
    }

}
