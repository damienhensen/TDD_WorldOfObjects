public class Main {

    public static void main(String[] args) {
	    ContactManager myContactManager = new ContactManager();
        Contact myContact1 = new Contact();
        Contact myContact2 = new Contact();

	    myContact1.name = "Damien";
	    myContact1.phoneNumber = "0621390914";
        myContact2.name = "Random";
        myContact2.phoneNumber = "0669696969";

        myContactManager.addContact(myContact1);
        myContactManager.addContact(myContact2);

        Contact result = myContactManager.searchContact("Damien");
        System.out.println(result.phoneNumber);
    }
}
