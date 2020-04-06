package part8;

import org.springframework.stereotype.Component;

public class College {
	private Principal principal;

	public void test() {
		principal.principalInfo();
		System.out.print("Test method in College class ");
	}

	public College(Principal principal) {

		this.principal = principal;
	}

	
}
