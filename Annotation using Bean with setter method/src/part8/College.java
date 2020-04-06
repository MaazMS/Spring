
package part8;

public class College {
	private Principal principal;

	public void test() {
		principal.principalInfo();
		
		System.out.print("Test method in College class ");
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

}
