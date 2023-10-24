package com.example.restsimple.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;


public class StudentCreateRequest {
    public StudentCreateRequest() {
        @NotNull(message = "studentId is required")
        protected Long studentId;
    
        @NotNull(message = "name is required")
        @Size(max = 200, message = "name must not exceed 200 characters")
        protected String name;
    
        @NotNull(message = "address is required")
        @Size(max = 100, message = "address must not exceed 100 characters")
        protected String address;
    
        @NotNull(message = "phoneNumber is required")
        @Size(max = 15, message = "phoneNumber must not exceed 15 characters")
        protected String phoneNumber;
    
        @NotNull(message = "email is required")
        @Email(message = "email should be valid")
        protected String email;
    
        @NotNull(message = "preferredPaymentMethods is required")
        @Size(max = 50, message = "preferredPaymentMethods must not exceed 50 characters")
        protected String preferredPaymentMethods;
    
        // Standardkonstruktor und Parameterkonstruktor
        // Getter und Setter Methoden    
    }
}
