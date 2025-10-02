/*
 * public class ForEachExample {
    public static void main(String[] args) {
        // Example with an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("---");

        // Example with an ArrayList
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}




public class JsonReader {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Assuming data.json exists in your project's root or specified path
            File jsonFile = new File("data.json"); 
            JsonNode rootNode = objectMapper.readTree(jsonFile);

            // Accessing values
            String name = rootNode.get("name").asText();
            int age = rootNode.get("age").asInt();

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




 */






public class main {
    public static void maim(String[] args){
        String[] flashcards = {flashcards.json}
    }
}
