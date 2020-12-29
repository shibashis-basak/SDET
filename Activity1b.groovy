package apiProject

class Activity1b {
		
	public static void main(def args) {
		
		//create a file
		File file = new File("src/resources/input.txt");
		file.createNewFile();
		
		//write text into the file
		def inputText = "A quick brown Fox jumped over the lazy Cow\nJohn Jimbo jingeled happily ever after\nTh1\$ 12 v3ry c0nfus1ng";
		file.write(inputText);
		
		println "Match operation: "
		//Print the line that ends with Cow
		file.eachLine { line ->
			
			if(line ==~ /^A.*Cow$/)
			{
				println "Line that ends with Cow : $line"
			}
				
		}
		
		file.eachLine { line ->
			
			if(line ==~ /^J.*/)
			{
				println "Line that starts with J : $line"
			}
				
		}
		
		file.eachLine { line ->
			
			if(line ==~ /.*\d\d.*/)
			{
				println "Line that contains 2 numbers : $line"
			}
				
		}
		
		
		//Find the string that matches the pattern '\S+er'		
		println "\n\nFind operation: "
		def match1 = file.getText() =~ /\S+er/
		println "Strings(s) matching '/\\S+er\' are: ${match1.findAll()}"
		
		def match2 = file.getText() =~ /\S*\d\W/
		println "Strings(s) matching '/\\S*\\d\\W\' are: ${match2.findAll()}"
		
	}
}
