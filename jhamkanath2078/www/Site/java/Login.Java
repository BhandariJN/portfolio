import java.*;

Public class Layout
{
    Void Layout{
    JFrame F=new JFrame("Login");
    JLabel L1=new JLabel("Username");
    JLabel L2=new JLabel("Password");
    JLabel L3=new JLabel("Confirm Password");
    JLabel L4=new JLabel("Email");
    JLabel L5=new JLabel("Phone Number");
    JTextField T1=new JTextField();
    JPaswordField T2=new JPasswordField();
    JPaswordField T3=new JPasswordField();
    JTextField T4=new JTextField();
    JTextField T5=new JTextField();
    JButton B1=new JButton("Signup");
    F.SetLayout(null);
    F.SetSize(500,500);
    F.SetVisible(true);
    F.SetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    L1.add(T1);
    L2.add(T2);
    L3.add(T3);
    L4.add(T4);
    L5.add(T5);
    F.add(L1);
    F.add(L2);
    F.add(L3);
    F.add(L4);
    F.add(L5);
    F.add(B1);
    L1.setBounds(50,50,100,30);
    L2.setBounds(50,100,100,30);
    L3.setBounds(50,150,100,30);
    L4.setBounds(50,200,100,30);
    L5.setBounds(50,250,100,30);
    T1.setBounds(200,50,100,30);
    T2.setBounds(200,100,100,30);
    T3.setBounds(200,150,100,30);
    T4.setBounds(200,200,100,30);
    T5.setBounds(200,250,100,30);
    B1.setBounds(200,300,100,30);
}
}
class Signup extends Layout
{
    void Layout();
    {
        super.Layout();
    }
    Signup(){
    string Username[20];
    string Password[20];
    string ConfirmPassword[20];
    string Email[20];
    string PhoneNumber[10];
    Username=T1.getText();
    Password=T2.getText();
    ConfirmPassword=T3.getText();
    Email=T4.getText();
    PhoneNumber=T5.getText();
    button.addActionListener(this);
    try {
        Password=ConfirmPassword;
        System.out.println("Signup Successful");
    } catch (Exception e) {
        System.out.println("Password and Confirm Password do not match"+e);
    }
    try{
        if(PhoneNumber.length()!=10)
        {
            System.out.println("Invalid Phone Number");
        }
        
    }
    catch (Exception e) {
        System.out.println("Invalid Phone Number"+e);
    }
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","bca", "Bca@10)#");
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found.");
        }
        Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(sql);
         sql="insert into Signup values('"+Username+"','"+Password+"','"+PhoneNumber+"','"+Email+"')";
    }
}
}

class Login{
    public static void main(String[] args) {
        Signup S=new Signup();
        S.Layout();
    }
}

