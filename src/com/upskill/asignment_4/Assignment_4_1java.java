package com.upskill.asignment_4;

/*Write a user program using encapsulation that contains the username, password, email, first and last names of a user of our application.
Display the user information in console output?
*/

public class Assignment_4_1java {
	
	    private String username;
	    private String password;
	    private String email;
	    private String firstName;
	    private String lastName;

	    // Setter methods
	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    // Getter methods
	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getFullName() {
	        return firstName + " " + lastName;
	    }

	    // Display user information
	    public void displayUserInfo() {
	        System.out.println("Username: " + username);
	        System.out.println("Email: " + email);
	        System.out.println("Full Name: " + getFullName());
	    }

	    public static void main(String[] args) {
	        // Create a User object
	    	Assignment_4_1java user1 = new Assignment_4_1java();

	        // Set user information using setter methods
	        user1.setUsername("john_doe");
	        user1.setPassword("password123");
	        user1.setEmail("john.doe@example.com");
	        user1.setFirstName("John");
	        user1.setLastName("Doe");

	        // Display user information
	        user1.displayUserInfo();

	        // Update user information
	        user1.setPassword("new_password456");
	        user1.setEmail("john.doe@newemail.com");

	        // Display updated user information
	        System.out.println("\nUpdated User Information:");
	        user1.displayUserInfo();
	    }
	}
