package conditions;

/** Ceci est une implémentation du message traditionnel "Hello world!"
* @author L'équipe Education d'OpenClassrooms
*/
public class ConditionalHello {

    public static void main(String[] args) {

        if (args.length==1) {
        sayHelloTo(args[0]);
        }
        else {
        sayHelloTo("world");
        }

    }

    /** affiche le message "hello" au destinataire fourni
    *
    * @param recipient
    */
    private static void sayHelloTo(String recipient) {
        System.out.println("Hello " + recipient + "!");
    }

}
