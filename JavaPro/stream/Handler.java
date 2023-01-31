package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Handler {

	public static void main(String[] args) {
		Collection<String> als = new ArrayList<>();
		Arrays.asList("Serg","Ann","Max","Vlad");
		Stream<String> ss1 = als.stream();
		Stream<String> ss2 = als.parallelStream();
		
	}

}
