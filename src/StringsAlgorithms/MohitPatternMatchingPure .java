
public class MohitPatternMatchingPure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Mohit Sharma";
		String fname = "Mohit";
		int count = 0;
		boolean result = false;

		for (int i = 0; i <= name.length() - fname.length(); i++) {
			if (name.charAt(i) == fname.charAt(0)) {
				for(int j=i,k=0;j<i+fname.length();j++,k++) {
					if(name.charAt(j)==fname.charAt(k)) {
						//result=true;
						count++;
					}
				
				}
			}

		}
		if (count==fname.length()) {
			System.out.println("Pattern Match");
		} else {
			System.out.println("Not match");
		}
	}

}
