public class ContactManager {

    private Contact [] myFriends;
    private int friendsCount;

    // Constructor
    ContactManager()
    {
        // 0 friends at first and then
        // it increments when you add a new contact
        this.friendsCount = 0;

        // Store up to 500 contacts
        this.myFriends = new Contact[500];
    }

    Boolean addContact(Contact contact)
    {
        myFriends[friendsCount] = contact;
        friendsCount++;
        return true;
    }

    Contact searchContact(String searchName)
    {
        for (int i = 0; i < friendsCount; i++)
        {
            if (myFriends[i].name.equals(searchName))
            {
                return myFriends[i];
            }
        }
        return null;
    }
}
