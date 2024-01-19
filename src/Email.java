import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String deptEmail;
    private String com = "company.com";

//    constuctor to recieve first name and last name;
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created : " + this.firstName + " " + this.lastName);

//        call method asking for department
        this.department = setDept();
        System.out.println("Department : " + this.department);

//        call method that generates random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("your password is : " + password);

        this.deptEmail = setDeptEmail();
        System.out.println(this.deptEmail);

    }
//    ask for department
    private String setDept(){
        System.out.println("Department Codes\n1 for Sales \n2 for Development \n3 for Accounting \n0 for None\n Enter department code :  ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1){return "Sales";}
        else if (deptChoice == 2){return "Development";}
        else if (deptChoice == 3){return "Accounting";}
        else if (deptChoice == 2){return "Development";}
        else{return "";}
    }

//    generate random password
private String randomPassword(int length){
    // Define a set of characters that can be used in the password
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@$#!%";

    // Create an array of characters to store the generated password
    char[] password = new char[length];

    // Use a loop to generate each character of the password
    for (int i=0; i<length; i++){
        // Generate a random index within the range of the passwordSet string
        int rand =  (int)(Math.random() * passwordSet.length());

        // Convert the random index to a string (not necessary, could be removed)
        String rad = String.valueOf(rand);

        // Retrieve the character at the randomly generated index and assign it to the password array
        password[i] = passwordSet.charAt(rand);
    }

    // Convert the character array to a String and return the generated password
    return new String(password);
}

private String setDeptEmail(){
    String ret = "Department Email : " +firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +
            department.toLowerCase() + com.toLowerCase();
    return ret;
}
//    set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

//    set the alternate email
    public void setAltEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
//    change the password
    public void changePassword (String password){
        this.password = password;
    }
    public int getMailCapacity(){
        return mailboxCapacity;
    }
    public String getAltEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "Display Name : " + firstName + " " + lastName + "\n" +
                "Email : " + deptEmail + "\n" +
                "Mail Capacity : " + mailboxCapacity +"mb"; 
    }
}
