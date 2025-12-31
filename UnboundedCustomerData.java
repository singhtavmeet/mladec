import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnboundedCustomerData {
	public static List<?> UnboundedData(List<?> firstName) {
		return Arrays.asList(firstName);
	}

	public static void main(String[] args) {
		List<String> firstName = Arrays.asList("Prabhsimran","Priyansh","Shreyas","Stoinis","Marco");
		
		System.out.println(UnboundedData(firstName));
		
		
		

	List<String> fltr = firstName.stream()
        .filter(x -> x.startsWith("A") && x.endsWith("h"))
        .collect(Collectors.toList());

		System.out.println(fltr);
	}

}
