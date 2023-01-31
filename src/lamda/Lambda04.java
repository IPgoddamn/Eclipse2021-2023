package lamda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
public class Lambda04 {
	public static void main(String[] args) {
		Integer[] array = {5, 7, 3, 9, 16, 12, 8, 4, 11, 14};
		//             T         U           R
		BiFunction<Integer[], Integer, List<Integer>> bf1 = 
														(tVal, Uval) -> {
					List<Integer> result = new ArrayList<>();
					for(Integer temp : tVal) {
						if(temp > Uval) {
							result.add(temp);
						}
					}
					return result;
				};
				List<Integer> result = bf1.apply(array, 10);
				for(Integer temp : result) {
					System.out.println(temp + " ");
				}
	}
}
// [] Integer, Integer -> List