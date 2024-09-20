package br.com.betha.main.Ioc_Di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyComponent {
    public String callMyComponent() {
        return "Call My Component :)";
    }
}
