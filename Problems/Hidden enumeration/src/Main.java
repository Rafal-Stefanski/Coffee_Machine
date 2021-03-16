public class Main {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < Secret.values().length; i++) {
            Secret[] secret = Secret.values();
            if (secret[i].toString().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);

        // shorter loop
//        for (Secret value : Secret.values()) {
//            if (value.toString().startsWith("STAR")) {
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}

/*sample enum for inspiration
enum Secret {
    STAR, CRASH, START // ...
}*/
