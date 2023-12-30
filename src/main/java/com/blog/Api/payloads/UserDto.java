package com.blog.Api.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	@NotEmpty
	@Size(min=4,message="username must be min of 4 character")
	private String name;
	
	
	@Email(message = "email is not valid")
	
	private String email;
	
	
	@NotNull
	@Size(min=3,max=10,message="keep password between 3 to 10 characters")
	
	private String password;
	
	
	@NotEmpty
	private String about;
	
	

}
