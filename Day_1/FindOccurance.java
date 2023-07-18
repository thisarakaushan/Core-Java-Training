package mypackage;

public class FindOccurance {
	public static void main(String[] args) {
		String data = "hello world";
		char chSearch = 'o';
		int occurance = getOccurances(data, chSearch);
		System.out.println(occurance);
	}
	public static int getOccurances(String data, char chSearch) {
		int count = 0;
		for (int i =0; i<data.length(); i++) {
			if(data.charAt(i) == chSearch) {
				count++;
			}
		}
		return count++;
	}
}
