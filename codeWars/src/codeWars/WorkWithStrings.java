package codeWars;
public class WorkWithStrings {

	public static void main(String[] args) {
/*		String[] array = {"Java", "Ruuuuussshhh"};
		Stream<String> streamOfArray = Arrays.stream(array);
		streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
		        .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
		        .collect(Collectors.toList()).forEach(System.out::println); */
		/*
		String a = Stream.of("s", "u" ,"p", "e", "r").collect(Collectors.joining());
	       System.out.println(a); // super

	       String b = Stream.of("s", "u", "p", "e", "r").collect(Collectors.joining("-"));
	       System.out.println(b); // s-u-p-e-r

	       String c = Stream.of("s", "u", "p", "e", "r").collect(Collectors.joining(" -> ", "[ ", " ]"));
	       System.out.println(c); 
		*/
		String pigIt = "Hello world !";
		String [] str1 = pigIt.split(" ");
		String strResult = "";
		strResult += str1[0].substring(1, str1[0].length()) + str1[0].substring(0,1) + "ay";
		 for (String element : str1) { 
			 System.out.println(element);
			 if(element == str1[0])continue;
			 if(element.contentEquals("!")) {
				 strResult += " !";
			 continue;
			 }
			 strResult += " " + element.substring(1, element.length()) + element.substring(0,1) + "ay";
		 }
		
		 System.out.println(strResult);
	}
}