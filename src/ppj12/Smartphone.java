package ppj12;

public class Smartphone extends Mobile {
    private Person[] friends;

    public Smartphone(String communicationInterface, String color) {
        super(communicationInterface, color);
    }

    @Override
    public void printCallHistory() {
        for (String call : super.callHistory) {
            Person friend = matchCallWithFriend(call);

            System.out.println(friend == null ? call : String.format("%s %s %s", friend.firstName(), friend.secondName(), call));
        }
    }

    private Person matchCallWithFriend(String call) {
        Person matchedFriend = null;

        for (Person friend : friends) {
            if (friend.phoneNumber().equals(call)) {
                matchedFriend = friend;
                break;
            }
        }

        return matchedFriend;
    }

    public void addFriend(Person person) {
        if (friends == null) {
            friends = new Person[1];
            friends[0] = person;
        }

        Person[] updatedFriends = new Person[friends.length + 1];
        System.arraycopy(friends, 0, updatedFriends, 0, friends.length);
        updatedFriends[friends.length] = person;
        friends = updatedFriends;
    }
}