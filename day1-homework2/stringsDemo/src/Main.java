public class Main {
    public static void main(String[] args) {

        String message = "The weather is very nice today";
        System.out.println(message);

        System.out.println("Number of elements : " + message.length());
        System.out.println("5th element : " + message.charAt(4));
        System.out.println(message.concat(" Perfect!"));
        System.out.println(message.startsWith("t")); //-->case sensitivity
        System.out.println(message.endsWith("y"));
        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("e"));

        System.out.println(message.replace(' ','-'));
        System.out.println(message.substring(5));
        System.out.println(message.substring(8,12));

        for (String words : message.split(" ")){
            System.out.println(words);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println(message.trim());
    }
}