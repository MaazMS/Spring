package com.hmkcode.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

improt com.hmkcode.vo.Person;

@Configuration
@Profile("development")
public class SpringConfigDev {


	public class SpringCongigDev{
		@Bean 
		public Person person() {
			Person person = new Person();
			person.setid(1); 
			person.setName("developer-person");
				return person;
		}
		
	}
}
