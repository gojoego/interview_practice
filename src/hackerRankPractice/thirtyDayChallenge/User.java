package hackerRankPractice.thirtyDayChallenge;

import java.util.HashSet;
import java.util.Set;

/*

*/
public class User {

    String username;
    String password;
    int age;
    Set<Integer> orderIDs;

    public User(String customUserName, String customPassword, int customAge, Set<Integer> orderIDs){
        this.username = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }

    public static void main(String[] args) {
        Set a = new HashSet();
        a.add(1212);
        User joe = new User("gojoego", "you are stronger than you know", 33, a);
    }

}
/*

User Table

(primary
key)                            (set)
username    password    age     orderIDs

gojoego     "you rock"  33      {87}
user2       "hi again"  21      {32, 31, 40}
user3       "enough"    25      {3, 4, 2}

primary key -unique identifier for a user
            -unique to each row

You can make columns not null

NOT NULL
-value cannot be null for any row for a certain property
-attribute given to a column requiring a value

If a set is a property, create another table and use a foreign key
(requires a different amount of memory)

Foreign Key
-a column in a table that references a column of another table
-connects two tables

OrderID table

username    orderID
gojoegoe    87
user2       32
user3       2

* username is the foreign key connecting the user table and the order ID table


*/















